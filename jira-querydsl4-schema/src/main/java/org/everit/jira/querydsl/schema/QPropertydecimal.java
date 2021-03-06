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
 * QPropertydecimal is a Querydsl query type for QPropertydecimal
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPropertydecimal extends com.querydsl.sql.RelationalPathBase<QPropertydecimal> {

    private static final long serialVersionUID = 1694767780;

    public static final QPropertydecimal propertydecimal = new QPropertydecimal("PROPERTYDECIMAL");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Double> propertyvalue = createNumber("propertyvalue", Double.class);

    public final com.querydsl.sql.PrimaryKey<QPropertydecimal> sysIdx145 = createPrimaryKey(id);

    public QPropertydecimal(String variable) {
        super(QPropertydecimal.class, forVariable(variable), "PUBLIC", "PROPERTYDECIMAL");
        addMetadata();
    }

    public QPropertydecimal(String variable, String schema, String table) {
        super(QPropertydecimal.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertydecimal(Path<? extends QPropertydecimal> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROPERTYDECIMAL");
        addMetadata();
    }

    public QPropertydecimal(PathMetadata metadata) {
        super(QPropertydecimal.class, metadata, "PUBLIC", "PROPERTYDECIMAL");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(propertyvalue, ColumnMetadata.named("PROPERTYVALUE").withIndex(2).ofType(Types.DOUBLE));
    }

}

