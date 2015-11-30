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
 * QFieldscreentab is a Querydsl query type for QFieldscreentab
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFieldscreentab extends com.querydsl.sql.RelationalPathBase<QFieldscreentab> {

    private static final long serialVersionUID = 1025558567;

    public static final QFieldscreentab fieldscreentab = new QFieldscreentab("FIELDSCREENTAB");

    public final StringPath description = createString("description");

    public final NumberPath<Long> fieldscreen = createNumber("fieldscreen", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFieldscreentab> sysIdx92 = createPrimaryKey(id);

    public QFieldscreentab(String variable) {
        super(QFieldscreentab.class, forVariable(variable), "PUBLIC", "FIELDSCREENTAB");
        addMetadata();
    }

    public QFieldscreentab(String variable, String schema, String table) {
        super(QFieldscreentab.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldscreentab(Path<? extends QFieldscreentab> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDSCREENTAB");
        addMetadata();
    }

    public QFieldscreentab(PathMetadata metadata) {
        super(QFieldscreentab.class, metadata, "PUBLIC", "FIELDSCREENTAB");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldscreen, ColumnMetadata.named("FIELDSCREEN").withIndex(5).ofType(Types.BIGINT));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(4).ofType(Types.BIGINT));
    }

}

