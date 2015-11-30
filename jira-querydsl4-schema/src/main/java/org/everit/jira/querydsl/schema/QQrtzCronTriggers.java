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
 * QQrtzCronTriggers is a Querydsl query type for QQrtzCronTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QQrtzCronTriggers extends com.querydsl.sql.RelationalPathBase<QQrtzCronTriggers> {

    private static final long serialVersionUID = -381106520;

    public static final QQrtzCronTriggers qrtzCronTriggers = new QQrtzCronTriggers("QRTZ_CRON_TRIGGERS");

    public final StringPath cronexperssion = createString("cronexperssion");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> triggerId = createNumber("triggerId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QQrtzCronTriggers> sysIdx167 = createPrimaryKey(id);

    public QQrtzCronTriggers(String variable) {
        super(QQrtzCronTriggers.class, forVariable(variable), "PUBLIC", "QRTZ_CRON_TRIGGERS");
        addMetadata();
    }

    public QQrtzCronTriggers(String variable, String schema, String table) {
        super(QQrtzCronTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzCronTriggers(Path<? extends QQrtzCronTriggers> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_CRON_TRIGGERS");
        addMetadata();
    }

    public QQrtzCronTriggers(PathMetadata metadata) {
        super(QQrtzCronTriggers.class, metadata, "PUBLIC", "QRTZ_CRON_TRIGGERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cronexperssion, ColumnMetadata.named("CRONEXPERSSION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(triggerId, ColumnMetadata.named("TRIGGER_ID").withIndex(2).ofType(Types.BIGINT));
    }

}

