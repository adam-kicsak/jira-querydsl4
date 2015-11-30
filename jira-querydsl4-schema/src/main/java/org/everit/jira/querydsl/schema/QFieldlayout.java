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
 * QFieldlayout is a Querydsl query type for QFieldlayout
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFieldlayout extends com.querydsl.sql.RelationalPathBase<QFieldlayout> {

    private static final long serialVersionUID = -1163179156;

    public static final QFieldlayout fieldlayout = new QFieldlayout("FIELDLAYOUT");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> layoutscheme = createNumber("layoutscheme", Long.class);

    public final StringPath layoutType = createString("layoutType");

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QFieldlayout> sysIdx83 = createPrimaryKey(id);

    public QFieldlayout(String variable) {
        super(QFieldlayout.class, forVariable(variable), "PUBLIC", "FIELDLAYOUT");
        addMetadata();
    }

    public QFieldlayout(String variable, String schema, String table) {
        super(QFieldlayout.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldlayout(Path<? extends QFieldlayout> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDLAYOUT");
        addMetadata();
    }

    public QFieldlayout(PathMetadata metadata) {
        super(QFieldlayout.class, metadata, "PUBLIC", "FIELDLAYOUT");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(layoutscheme, ColumnMetadata.named("LAYOUTSCHEME").withIndex(5).ofType(Types.BIGINT));
        addMetadata(layoutType, ColumnMetadata.named("LAYOUT_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

