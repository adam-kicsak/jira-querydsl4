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
 * QJquartzJobDetails is a Querydsl query type for QJquartzJobDetails
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzJobDetails extends com.querydsl.sql.RelationalPathBase<QJquartzJobDetails> {

    private static final long serialVersionUID = -689504782;

    public static final QJquartzJobDetails jquartzJobDetails = new QJquartzJobDetails("JQUARTZ_JOB_DETAILS");

    public final StringPath description = createString("description");

    public final BooleanPath isDurable = createBoolean("isDurable");

    public final BooleanPath isNonconcurrent = createBoolean("isNonconcurrent");

    public final BooleanPath isStateful = createBoolean("isStateful");

    public final BooleanPath isUpdateData = createBoolean("isUpdateData");

    public final BooleanPath isVolatile = createBoolean("isVolatile");

    public final StringPath jobClassName = createString("jobClassName");

    public final SimplePath<byte[]> jobData = createSimple("jobData", byte[].class);

    public final StringPath jobGroup = createString("jobGroup");

    public final StringPath jobName = createString("jobName");

    public final BooleanPath requestsRecovery = createBoolean("requestsRecovery");

    public final StringPath schedName = createString("schedName");

    public final com.querydsl.sql.PrimaryKey<QJquartzJobDetails> sysIdx111 = createPrimaryKey(jobGroup, jobName);

    public QJquartzJobDetails(String variable) {
        super(QJquartzJobDetails.class, forVariable(variable), "PUBLIC", "JQUARTZ_JOB_DETAILS");
        addMetadata();
    }

    public QJquartzJobDetails(String variable, String schema, String table) {
        super(QJquartzJobDetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzJobDetails(Path<? extends QJquartzJobDetails> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JQUARTZ_JOB_DETAILS");
        addMetadata();
    }

    public QJquartzJobDetails(PathMetadata metadata) {
        super(QJquartzJobDetails.class, metadata, "PUBLIC", "JQUARTZ_JOB_DETAILS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(250));
        addMetadata(isDurable, ColumnMetadata.named("IS_DURABLE").withIndex(6).ofType(Types.BOOLEAN));
        addMetadata(isNonconcurrent, ColumnMetadata.named("IS_NONCONCURRENT").withIndex(9).ofType(Types.BOOLEAN));
        addMetadata(isStateful, ColumnMetadata.named("IS_STATEFUL").withIndex(8).ofType(Types.BOOLEAN));
        addMetadata(isUpdateData, ColumnMetadata.named("IS_UPDATE_DATA").withIndex(10).ofType(Types.BOOLEAN));
        addMetadata(isVolatile, ColumnMetadata.named("IS_VOLATILE").withIndex(7).ofType(Types.BOOLEAN));
        addMetadata(jobClassName, ColumnMetadata.named("JOB_CLASS_NAME").withIndex(5).ofType(Types.VARCHAR).withSize(250));
        addMetadata(jobData, ColumnMetadata.named("JOB_DATA").withIndex(12).ofType(Types.VARBINARY).withSize(16000));
        addMetadata(jobGroup, ColumnMetadata.named("JOB_GROUP").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(jobName, ColumnMetadata.named("JOB_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(requestsRecovery, ColumnMetadata.named("REQUESTS_RECOVERY").withIndex(11).ofType(Types.BOOLEAN));
        addMetadata(schedName, ColumnMetadata.named("SCHED_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(120));
    }

}

