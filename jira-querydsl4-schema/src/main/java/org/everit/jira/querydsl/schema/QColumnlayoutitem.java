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
 * QColumnlayoutitem is a Querydsl query type for QColumnlayoutitem
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QColumnlayoutitem extends com.querydsl.sql.RelationalPathBase<QColumnlayoutitem> {

    private static final long serialVersionUID = -746153141;

    public static final QColumnlayoutitem columnlayoutitem = new QColumnlayoutitem("COLUMNLAYOUTITEM");

    public final NumberPath<Long> columnlayout = createNumber("columnlayout", Long.class);

    public final StringPath fieldidentifier = createString("fieldidentifier");

    public final NumberPath<Long> horizontalposition = createNumber("horizontalposition", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.querydsl.sql.PrimaryKey<QColumnlayoutitem> sysIdx61 = createPrimaryKey(id);

    public QColumnlayoutitem(String variable) {
        super(QColumnlayoutitem.class, forVariable(variable), "PUBLIC", "COLUMNLAYOUTITEM");
        addMetadata();
    }

    public QColumnlayoutitem(String variable, String schema, String table) {
        super(QColumnlayoutitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QColumnlayoutitem(Path<? extends QColumnlayoutitem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "COLUMNLAYOUTITEM");
        addMetadata();
    }

    public QColumnlayoutitem(PathMetadata metadata) {
        super(QColumnlayoutitem.class, metadata, "PUBLIC", "COLUMNLAYOUTITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(columnlayout, ColumnMetadata.named("COLUMNLAYOUT").withIndex(2).ofType(Types.BIGINT));
        addMetadata(fieldidentifier, ColumnMetadata.named("FIELDIDENTIFIER").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(horizontalposition, ColumnMetadata.named("HORIZONTALPOSITION").withIndex(4).ofType(Types.BIGINT));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
    }

}

