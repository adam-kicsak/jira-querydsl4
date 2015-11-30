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
 * QTrackbackPing is a Querydsl query type for QTrackbackPing
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTrackbackPing extends com.querydsl.sql.RelationalPathBase<QTrackbackPing> {

    private static final long serialVersionUID = -58268148;

    public static final QTrackbackPing trackbackPing = new QTrackbackPing("TRACKBACK_PING");

    public final StringPath blogname = createString("blogname");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath excerpt = createString("excerpt");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issue = createNumber("issue", Long.class);

    public final StringPath title = createString("title");

    public final StringPath url = createString("url");

    public final com.querydsl.sql.PrimaryKey<QTrackbackPing> sysIdx190 = createPrimaryKey(id);

    public QTrackbackPing(String variable) {
        super(QTrackbackPing.class, forVariable(variable), "PUBLIC", "TRACKBACK_PING");
        addMetadata();
    }

    public QTrackbackPing(String variable, String schema, String table) {
        super(QTrackbackPing.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTrackbackPing(Path<? extends QTrackbackPing> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "TRACKBACK_PING");
        addMetadata();
    }

    public QTrackbackPing(PathMetadata metadata) {
        super(QTrackbackPing.class, metadata, "PUBLIC", "TRACKBACK_PING");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(blogname, ColumnMetadata.named("BLOGNAME").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(7).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(excerpt, ColumnMetadata.named("EXCERPT").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(issue, ColumnMetadata.named("ISSUE").withIndex(2).ofType(Types.BIGINT));
        addMetadata(title, ColumnMetadata.named("TITLE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(url, ColumnMetadata.named("URL").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

