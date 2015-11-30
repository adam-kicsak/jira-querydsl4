/*
 * Copyright (C) 2011 EverIT Kft. (https://www.everit.biz)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.jira.querydsl.test.plugin;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import org.everit.jira.querydsl.schema.QAppUser;
import org.everit.jira.querydsl.schema.QCwdUser;
import org.everit.jira.querydsl.schema.QWorklog;
import org.everit.persistence.querydsl.support.QuerydslCallable;
import org.everit.persistence.querydsl.support.QuerydslSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import com.querydsl.core.types.Projections;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.SQLQuery;

/**
 * Querydsl User plugin for demo.
 */
public class QuerydslTestPluginImpl implements InitializingBean {

  /**
   * Queries the active users.
   */
  private static final class NumberTestWithActiveUser implements QuerydslCallable<List<String>> {

    @Override
    public List<String> call(final Connection connection, final Configuration configuration)
        throws SQLException {

      QCwdUser cwdUser = new QCwdUser("cu");

      return new SQLQuery<String>(connection, configuration)
          .select(cwdUser.userName)
          .from(cwdUser)
          .where(cwdUser.active.eq(1))
          .fetch();
    }

  }

  /**
   * Queries the user keys that contains '.'.
   */
  private static final class StringTestWithAppUser implements QuerydslCallable<List<String>> {

    @Override
    public List<String> call(final Connection conn, final Configuration config)
        throws SQLException {

      QAppUser appUser = new QAppUser("au");

      return new SQLQuery<String>(conn, config)
          .select(appUser.userKey)
          .from(appUser)
          .where(appUser.userKey.contains("."))
          .fetch();
    }
  }

  /**
   * Queries the work logs this week.
   */
  private static final class TimeTestWithWorklog implements QuerydslCallable<List<WorklogDTO>> {

    @Override
    public List<WorklogDTO> call(final Connection connection, final Configuration configuration)
        throws SQLException {

      QWorklog worklog = new QWorklog("wl");

      Calendar from = Calendar.getInstance();
      setMidnightAtFirstDayOfWeek(from);

      Calendar to = Calendar.getInstance();
      setMidnightAtFirstDayOfWeek(to);
      to.add(Calendar.WEEK_OF_YEAR, 1);
      to.add(Calendar.MILLISECOND, -1);

      return new SQLQuery<WorklogDTO>(connection, configuration)
          .select(Projections.fields(
              WorklogDTO.class,
              worklog.author, worklog.created, worklog.worklogbody))
          .from(worklog)
          .where(worklog.created.between(
              new Timestamp(from.getTimeInMillis()), new Timestamp(to.getTimeInMillis())))
          .fetch();
    }

    private void setMidnightAtFirstDayOfWeek(final Calendar c) {
      c.set(Calendar.HOUR, 0);
      c.set(Calendar.MINUTE, 0);
      c.set(Calendar.SECOND, 0);
      c.set(Calendar.MILLISECOND, 0);
      c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
    }

  }

  /**
   * Work log DTO.
   */
  public static class WorklogDTO {

    public String author;

    public Timestamp created;

    public String worklogbody;

    public WorklogDTO author(final String author) {
      this.author = author;
      return this;
    }

    public WorklogDTO setCreadte(final Timestamp created) {
      this.created = created;
      return this;
    }

    public WorklogDTO setWorklogbody(final String worklogbody) {
      this.worklogbody = worklogbody;
      return this;
    }

    @Override
    public String toString() {
      return String.format("WorklogDTO [author=%s, created=%s, worklogbody=%s]", author, created,
          worklogbody);
    }

  }

  private static final Logger LOGGER = LoggerFactory.getLogger(QuerydslTestPluginImpl.class);

  private QuerydslSupport querydslSupport;

  public QuerydslTestPluginImpl(final QuerydslSupport querydslSupport) {
    this.querydslSupport = querydslSupport;
  }

  @Override
  public void afterPropertiesSet() throws Exception {

    List<String> userKeys = querydslSupport.execute(new StringTestWithAppUser());
    LOGGER.warn("User keys in the system that contains '.': " + userKeys);

    List<WorklogDTO> worklogDTOs = querydslSupport.execute(new TimeTestWithWorklog());
    LOGGER.warn("Worklogs this week: " + worklogDTOs);

    List<String> activeUsers = querydslSupport.execute(new NumberTestWithActiveUser());
    LOGGER.warn("Active users: " + activeUsers);

  }

}
