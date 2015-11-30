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
 * QProjectversion is a Querydsl query type for QProjectversion
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectversion extends com.querydsl.sql.RelationalPathBase<QProjectversion> {

    private static final long serialVersionUID = -2774057;

    public static final QProjectversion projectversion = new QProjectversion("PROJECTVERSION");

    public final StringPath archived = createString("archived");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final StringPath released = createString("released");

    public final DateTimePath<java.sql.Timestamp> releasedate = createDateTime("releasedate", java.sql.Timestamp.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final DateTimePath<java.sql.Timestamp> startdate = createDateTime("startdate", java.sql.Timestamp.class);

    public final StringPath url = createString("url");

    public final StringPath vname = createString("vname");

    public final com.querydsl.sql.PrimaryKey<QProjectversion> sysIdx201 = createPrimaryKey(id);

    public QProjectversion(String variable) {
        super(QProjectversion.class, forVariable(variable), "PUBLIC", "PROJECTVERSION");
        addMetadata();
    }

    public QProjectversion(String variable, String schema, String table) {
        super(QProjectversion.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectversion(Path<? extends QProjectversion> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROJECTVERSION");
        addMetadata();
    }

    public QProjectversion(PathMetadata metadata) {
        super(QProjectversion.class, metadata, "PUBLIC", "PROJECTVERSION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(archived, ColumnMetadata.named("ARCHIVED").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(project, ColumnMetadata.named("PROJECT").withIndex(2).ofType(Types.BIGINT));
        addMetadata(released, ColumnMetadata.named("RELEASED").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(releasedate, ColumnMetadata.named("RELEASEDATE").withIndex(10).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(5).ofType(Types.BIGINT));
        addMetadata(startdate, ColumnMetadata.named("STARTDATE").withIndex(9).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(url, ColumnMetadata.named("URL").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(vname, ColumnMetadata.named("VNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

