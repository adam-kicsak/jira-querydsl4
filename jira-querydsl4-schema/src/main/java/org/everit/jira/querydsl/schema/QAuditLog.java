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
 * QAuditLog is a Querydsl query type for QAuditLog
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAuditLog extends com.querydsl.sql.RelationalPathBase<QAuditLog> {

    private static final long serialVersionUID = 2079301537;

    public static final QAuditLog auditLog = new QAuditLog("AUDIT_LOG");

    public final StringPath authorKey = createString("authorKey");

    public final NumberPath<Integer> authorType = createNumber("authorType", Integer.class);

    public final StringPath category = createString("category");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath description = createString("description");

    public final StringPath eventSourceName = createString("eventSourceName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath objectId = createString("objectId");

    public final StringPath objectName = createString("objectName");

    public final StringPath objectParentId = createString("objectParentId");

    public final StringPath objectParentName = createString("objectParentName");

    public final StringPath objectType = createString("objectType");

    public final StringPath remoteAddress = createString("remoteAddress");

    public final StringPath searchField = createString("searchField");

    public final StringPath summary = createString("summary");

    public final com.querydsl.sql.PrimaryKey<QAuditLog> sysIdx51 = createPrimaryKey(id);

    public QAuditLog(String variable) {
        super(QAuditLog.class, forVariable(variable), "PUBLIC", "AUDIT_LOG");
        addMetadata();
    }

    public QAuditLog(String variable, String schema, String table) {
        super(QAuditLog.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAuditLog(Path<? extends QAuditLog> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "AUDIT_LOG");
        addMetadata();
    }

    public QAuditLog(PathMetadata metadata) {
        super(QAuditLog.class, metadata, "PUBLIC", "AUDIT_LOG");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authorKey, ColumnMetadata.named("AUTHOR_KEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(authorType, ColumnMetadata.named("AUTHOR_TYPE").withIndex(12).ofType(Types.INTEGER));
        addMetadata(category, ColumnMetadata.named("CATEGORY").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(3).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(14).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(eventSourceName, ColumnMetadata.named("EVENT_SOURCE_NAME").withIndex(13).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(objectId, ColumnMetadata.named("OBJECT_ID").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(objectName, ColumnMetadata.named("OBJECT_NAME").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(objectParentId, ColumnMetadata.named("OBJECT_PARENT_ID").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(objectParentName, ColumnMetadata.named("OBJECT_PARENT_NAME").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(objectType, ColumnMetadata.named("OBJECT_TYPE").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(remoteAddress, ColumnMetadata.named("REMOTE_ADDRESS").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(searchField, ColumnMetadata.named("SEARCH_FIELD").withIndex(15).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(summary, ColumnMetadata.named("SUMMARY").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

