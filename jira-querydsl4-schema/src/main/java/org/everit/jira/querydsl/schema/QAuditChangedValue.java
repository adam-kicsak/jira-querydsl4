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
 * QAuditChangedValue is a Querydsl query type for QAuditChangedValue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAuditChangedValue extends com.querydsl.sql.RelationalPathBase<QAuditChangedValue> {

    private static final long serialVersionUID = -1097897120;

    public static final QAuditChangedValue auditChangedValue = new QAuditChangedValue("AUDIT_CHANGED_VALUE");

    public final StringPath deltaFrom = createString("deltaFrom");

    public final StringPath deltaTo = createString("deltaTo");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> logId = createNumber("logId", Long.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QAuditChangedValue> sysIdx49 = createPrimaryKey(id);

    public QAuditChangedValue(String variable) {
        super(QAuditChangedValue.class, forVariable(variable), "PUBLIC", "AUDIT_CHANGED_VALUE");
        addMetadata();
    }

    public QAuditChangedValue(String variable, String schema, String table) {
        super(QAuditChangedValue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAuditChangedValue(Path<? extends QAuditChangedValue> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "AUDIT_CHANGED_VALUE");
        addMetadata();
    }

    public QAuditChangedValue(PathMetadata metadata) {
        super(QAuditChangedValue.class, metadata, "PUBLIC", "AUDIT_CHANGED_VALUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deltaFrom, ColumnMetadata.named("DELTA_FROM").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(deltaTo, ColumnMetadata.named("DELTA_TO").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(logId, ColumnMetadata.named("LOG_ID").withIndex(2).ofType(Types.BIGINT));
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

