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
 * QLabel is a Querydsl query type for QLabel
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLabel extends com.querydsl.sql.RelationalPathBase<QLabel> {

    private static final long serialVersionUID = -1297414212;

    public static final QLabel label1 = new QLabel("LABEL");

    public final NumberPath<Long> fieldid = createNumber("fieldid", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issue = createNumber("issue", Long.class);

    public final StringPath label = createString("label");

    public final com.querydsl.sql.PrimaryKey<QLabel> sysIdx120 = createPrimaryKey(id);

    public QLabel(String variable) {
        super(QLabel.class, forVariable(variable), "PUBLIC", "LABEL");
        addMetadata();
    }

    public QLabel(String variable, String schema, String table) {
        super(QLabel.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLabel(Path<? extends QLabel> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "LABEL");
        addMetadata();
    }

    public QLabel(PathMetadata metadata) {
        super(QLabel.class, metadata, "PUBLIC", "LABEL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldid, ColumnMetadata.named("FIELDID").withIndex(2).ofType(Types.BIGINT));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(issue, ColumnMetadata.named("ISSUE").withIndex(3).ofType(Types.BIGINT));
        addMetadata(label, ColumnMetadata.named("LABEL").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

