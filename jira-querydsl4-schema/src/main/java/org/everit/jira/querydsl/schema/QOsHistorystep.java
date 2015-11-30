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
 * QOsHistorystep is a Querydsl query type for QOsHistorystep
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOsHistorystep extends com.querydsl.sql.RelationalPathBase<QOsHistorystep> {

    private static final long serialVersionUID = 2047509924;

    public static final QOsHistorystep osHistorystep = new QOsHistorystep("OS_HISTORYSTEP");

    public final NumberPath<Integer> actionId = createNumber("actionId", Integer.class);

    public final StringPath caller = createString("caller");

    public final DateTimePath<java.sql.Timestamp> dueDate = createDateTime("dueDate", java.sql.Timestamp.class);

    public final NumberPath<Long> entryId = createNumber("entryId", Long.class);

    public final DateTimePath<java.sql.Timestamp> finishDate = createDateTime("finishDate", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath owner = createString("owner");

    public final DateTimePath<java.sql.Timestamp> startDate = createDateTime("startDate", java.sql.Timestamp.class);

    public final StringPath status = createString("status");

    public final NumberPath<Integer> stepId = createNumber("stepId", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QOsHistorystep> sysIdx140 = createPrimaryKey(id);

    public QOsHistorystep(String variable) {
        super(QOsHistorystep.class, forVariable(variable), "PUBLIC", "OS_HISTORYSTEP");
        addMetadata();
    }

    public QOsHistorystep(String variable, String schema, String table) {
        super(QOsHistorystep.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOsHistorystep(Path<? extends QOsHistorystep> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OS_HISTORYSTEP");
        addMetadata();
    }

    public QOsHistorystep(PathMetadata metadata) {
        super(QOsHistorystep.class, metadata, "PUBLIC", "OS_HISTORYSTEP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionId, ColumnMetadata.named("ACTION_ID").withIndex(4).ofType(Types.INTEGER));
        addMetadata(caller, ColumnMetadata.named("CALLER").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(dueDate, ColumnMetadata.named("DUE_DATE").withIndex(7).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(entryId, ColumnMetadata.named("ENTRY_ID").withIndex(2).ofType(Types.BIGINT));
        addMetadata(finishDate, ColumnMetadata.named("FINISH_DATE").withIndex(8).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(owner, ColumnMetadata.named("OWNER").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(startDate, ColumnMetadata.named("START_DATE").withIndex(6).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(status, ColumnMetadata.named("STATUS").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(stepId, ColumnMetadata.named("STEP_ID").withIndex(3).ofType(Types.INTEGER));
    }

}

