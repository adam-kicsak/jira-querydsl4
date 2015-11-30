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
 * QChangegroup is a Querydsl query type for QChangegroup
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QChangegroup extends com.querydsl.sql.RelationalPathBase<QChangegroup> {

    private static final long serialVersionUID = 427197335;

    public static final QChangegroup changegroup = new QChangegroup("CHANGEGROUP");

    public final StringPath author = createString("author");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final com.querydsl.sql.PrimaryKey<QChangegroup> sysIdx53 = createPrimaryKey(id);

    public QChangegroup(String variable) {
        super(QChangegroup.class, forVariable(variable), "PUBLIC", "CHANGEGROUP");
        addMetadata();
    }

    public QChangegroup(String variable, String schema, String table) {
        super(QChangegroup.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QChangegroup(Path<? extends QChangegroup> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CHANGEGROUP");
        addMetadata();
    }

    public QChangegroup(PathMetadata metadata) {
        super(QChangegroup.class, metadata, "PUBLIC", "CHANGEGROUP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(author, ColumnMetadata.named("AUTHOR").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(4).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(issueid, ColumnMetadata.named("ISSUEID").withIndex(2).ofType(Types.BIGINT));
    }

}

