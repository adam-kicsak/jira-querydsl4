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
 * QFieldscreenlayoutitem is a Querydsl query type for QFieldscreenlayoutitem
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFieldscreenlayoutitem extends com.querydsl.sql.RelationalPathBase<QFieldscreenlayoutitem> {

    private static final long serialVersionUID = -298164117;

    public static final QFieldscreenlayoutitem fieldscreenlayoutitem = new QFieldscreenlayoutitem("FIELDSCREENLAYOUTITEM");

    public final StringPath fieldidentifier = createString("fieldidentifier");

    public final NumberPath<Long> fieldscreentab = createNumber("fieldscreentab", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFieldscreenlayoutitem> sysIdx89 = createPrimaryKey(id);

    public QFieldscreenlayoutitem(String variable) {
        super(QFieldscreenlayoutitem.class, forVariable(variable), "PUBLIC", "FIELDSCREENLAYOUTITEM");
        addMetadata();
    }

    public QFieldscreenlayoutitem(String variable, String schema, String table) {
        super(QFieldscreenlayoutitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldscreenlayoutitem(Path<? extends QFieldscreenlayoutitem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDSCREENLAYOUTITEM");
        addMetadata();
    }

    public QFieldscreenlayoutitem(PathMetadata metadata) {
        super(QFieldscreenlayoutitem.class, metadata, "PUBLIC", "FIELDSCREENLAYOUTITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldidentifier, ColumnMetadata.named("FIELDIDENTIFIER").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldscreentab, ColumnMetadata.named("FIELDSCREENTAB").withIndex(4).ofType(Types.BIGINT));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(3).ofType(Types.BIGINT));
    }

}

