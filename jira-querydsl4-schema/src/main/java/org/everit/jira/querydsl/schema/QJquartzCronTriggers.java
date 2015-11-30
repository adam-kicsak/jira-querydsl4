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
package org.everit.jira.querydsl.schema;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QJquartzCronTriggers is a Querydsl query type for QJquartzCronTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzCronTriggers extends com.querydsl.sql.RelationalPathBase<QJquartzCronTriggers> {

    private static final long serialVersionUID = -1162966698;

    public static final QJquartzCronTriggers jquartzCronTriggers = new QJquartzCronTriggers("JQUARTZ_CRON_TRIGGERS");

    public final StringPath cronExpression = createString("cronExpression");

    public final StringPath schedName = createString("schedName");

    public final StringPath timeZoneId = createString("timeZoneId");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final com.querydsl.sql.PrimaryKey<QJquartzCronTriggers> sysIdx109 = createPrimaryKey(triggerGroup, triggerName);

    public QJquartzCronTriggers(String variable) {
        super(QJquartzCronTriggers.class, forVariable(variable), "PUBLIC", "JQUARTZ_CRON_TRIGGERS");
        addMetadata();
    }

    public QJquartzCronTriggers(String variable, String schema, String table) {
        super(QJquartzCronTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzCronTriggers(Path<? extends QJquartzCronTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_CRON_TRIGGERS");
        addMetadata();
    }

    public QJquartzCronTriggers(PathMetadata metadata) {
        super(QJquartzCronTriggers.class, metadata, "PUBLIC", "JQUARTZ_CRON_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cronExpression, ColumnMetadata.named("CRON_EXPRESSION").withIndex(4).ofType(Types.VARCHAR).withSize(120));
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(timeZoneId, ColumnMetadata.named("TIME_ZONE_ID").withIndex(5).ofType(Types.VARCHAR).withSize(80));
        addMetadata(triggerGroup, ColumnMetadata.named("TRIGGER_GROUP").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("TRIGGER_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

