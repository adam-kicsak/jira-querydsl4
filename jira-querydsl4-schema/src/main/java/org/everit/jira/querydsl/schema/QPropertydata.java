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
 * QPropertydata is a Querydsl query type for QPropertydata
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPropertydata extends com.querydsl.sql.RelationalPathBase<QPropertydata> {

    private static final long serialVersionUID = -984194761;

    public static final QPropertydata propertydata = new QPropertydata("PROPERTYDATA");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SimplePath<Object> propertyvalue = createSimple("propertyvalue", Object.class);

    public final com.querydsl.sql.PrimaryKey<QPropertydata> sysIdx143 = createPrimaryKey(id);

    public QPropertydata(String variable) {
        super(QPropertydata.class, forVariable(variable), "PUBLIC", "PROPERTYDATA");
        addMetadata();
    }

    public QPropertydata(String variable, String schema, String table) {
        super(QPropertydata.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertydata(Path<? extends QPropertydata> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROPERTYDATA");
        addMetadata();
    }

    public QPropertydata(PathMetadata metadata) {
        super(QPropertydata.class, metadata, "PUBLIC", "PROPERTYDATA");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(propertyvalue, ColumnMetadata.named("PROPERTYVALUE").withIndex(2).ofType(Types.OTHER));
    }

}

