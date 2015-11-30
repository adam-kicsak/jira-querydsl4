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
 * QOsCurrentstep is a Querydsl query type for QOsCurrentstep
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOsCurrentstep extends com.querydsl.sql.RelationalPathBase<QOsCurrentstep> {

    private static final long serialVersionUID = -1998232567;

    public static final QOsCurrentstep osCurrentstep = new QOsCurrentstep("OS_CURRENTSTEP");

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

    public final com.querydsl.sql.PrimaryKey<QOsCurrentstep> sysIdx137 = createPrimaryKey(id);

    public QOsCurrentstep(String variable) {
        super(QOsCurrentstep.class, forVariable(variable), "PUBLIC", "OS_CURRENTSTEP");
        addMetadata();
    }

    public QOsCurrentstep(String variable, String schema, String table) {
        super(QOsCurrentstep.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOsCurrentstep(Path<? extends QOsCurrentstep> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "OS_CURRENTSTEP");
        addMetadata();
    }

    public QOsCurrentstep(PathMetadata metadata) {
        super(QOsCurrentstep.class, metadata, "PUBLIC", "OS_CURRENTSTEP");
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

