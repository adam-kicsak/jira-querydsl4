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
 * QFileattachment is a Querydsl query type for QFileattachment
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFileattachment extends com.querydsl.sql.RelationalPathBase<QFileattachment> {

    private static final long serialVersionUID = 2005760983;

    public static final QFileattachment fileattachment = new QFileattachment("FILEATTACHMENT");

    public final StringPath author = createString("author");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath filename = createString("filename");

    public final NumberPath<Long> filesize = createNumber("filesize", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final StringPath mimetype = createString("mimetype");

    public final NumberPath<Integer> thumbnailable = createNumber("thumbnailable", Integer.class);

    public final NumberPath<Integer> zip = createNumber("zip", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QFileattachment> sysIdx93 = createPrimaryKey(id);

    public QFileattachment(String variable) {
        super(QFileattachment.class, forVariable(variable), "PUBLIC", "FILEATTACHMENT");
        addMetadata();
    }

    public QFileattachment(String variable, String schema, String table) {
        super(QFileattachment.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFileattachment(Path<? extends QFileattachment> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FILEATTACHMENT");
        addMetadata();
    }

    public QFileattachment(PathMetadata metadata) {
        super(QFileattachment.class, metadata, "PUBLIC", "FILEATTACHMENT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(author, ColumnMetadata.named("AUTHOR").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(5).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(filename, ColumnMetadata.named("FILENAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(filesize, ColumnMetadata.named("FILESIZE").withIndex(6).ofType(Types.BIGINT));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(issueid, ColumnMetadata.named("ISSUEID").withIndex(2).ofType(Types.BIGINT));
        addMetadata(mimetype, ColumnMetadata.named("MIMETYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(thumbnailable, ColumnMetadata.named("THUMBNAILABLE").withIndex(9).ofType(Types.INTEGER));
        addMetadata(zip, ColumnMetadata.named("ZIP").withIndex(8).ofType(Types.INTEGER));
    }

}

