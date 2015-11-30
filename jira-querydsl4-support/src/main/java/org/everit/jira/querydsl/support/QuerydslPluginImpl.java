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
package org.everit.jira.querydsl.support;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import org.everit.persistence.querydsl.support.QuerydslCallable;
import org.everit.persistence.querydsl.support.QuerydslSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import com.atlassian.jira.ofbiz.DefaultOfBizConnectionFactory;
import com.atlassian.jira.ofbiz.OfBizConnectionFactory;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.SQLTemplates.Builder;

/**
 * Implements the {@link QuerydslSupport} as a Jira plugin.
 */
public class QuerydslPluginImpl implements InitializingBean, QuerydslSupport {

  /**
   * The logger.
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(QuerydslPluginImpl.class);

  /**
   * The schema name in the querydsl classes.
   */
  private static final String DEFAULT_SCHEMA_NAME = "PUBLIC";

  /**
   * Database connection factory.
   */
  private OfBizConnectionFactory connectionFactory;

  /**
   * configuration for the database.
   */
  private Configuration configuration;

  /**
   * Obtains the {@link OfBizConnectionFactory} instance, and creates the {@link Configuration} for
   * the querydsl.
   */
  @Override
  public void afterPropertiesSet() throws Exception {

    try {
      connectionFactory = DefaultOfBizConnectionFactory.getInstance();
    } catch (Exception e) {
      LOGGER.error("Unsuccessful plugin deploy.", e);
      throw e;
    }

    try (Connection connection = connectionFactory.getConnection()) {

      DatabaseMetaData metaData = connection.getMetaData();
      Builder builder = QuerydslTemplatesUtil.getBuilderByMetadata(metaData);
      SQLTemplates templates = builder.build();

      String schemaName = connectionFactory.getDatasourceInfo().getSchemaName();
      configuration = new Configuration(templates);
      if (schemaName != null && !schemaName.trim().isEmpty()
          && !schemaName.equals(DEFAULT_SCHEMA_NAME)) {
        configuration.registerSchemaOverride(DEFAULT_SCHEMA_NAME, schemaName);
      }
    } catch (Exception e) {
      LOGGER.error("Unsuccessful plugin deploy.", e);
      throw e;
    }
  }

  @Override
  public <R> R execute(final QuerydslCallable<R> callable) {
    try (Connection connection = connectionFactory.getConnection()) {
      return callable.call(connection, configuration);
    } catch (SQLException e) {
      throw configuration.translate(e);
    }
  }

}
