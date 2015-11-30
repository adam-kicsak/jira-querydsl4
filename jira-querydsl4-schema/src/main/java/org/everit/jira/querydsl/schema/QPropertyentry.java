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
 * QPropertyentry is a Querydsl query type for QPropertyentry
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPropertyentry extends com.querydsl.sql.RelationalPathBase<QPropertyentry> {

    private static final long serialVersionUID = -443955067;

    public static final QPropertyentry propertyentry = new QPropertyentry("PROPERTYENTRY");

    public final NumberPath<Long> entityId = createNumber("entityId", Long.class);

    public final StringPath entityName = createString("entityName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath propertyKey = createString("propertyKey");

    public final NumberPath<Integer> propertytype = createNumber("propertytype", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QPropertyentry> sysIdx146 = createPrimaryKey(id);

    public QPropertyentry(String variable) {
        super(QPropertyentry.class, forVariable(variable), "PUBLIC", "PROPERTYENTRY");
        addMetadata();
    }

    public QPropertyentry(String variable, String schema, String table) {
        super(QPropertyentry.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertyentry(Path<? extends QPropertyentry> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROPERTYENTRY");
        addMetadata();
    }

    public QPropertyentry(PathMetadata metadata) {
        super(QPropertyentry.class, metadata, "PUBLIC", "PROPERTYENTRY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entityId, ColumnMetadata.named("ENTITY_ID").withIndex(3).ofType(Types.BIGINT));
        addMetadata(entityName, ColumnMetadata.named("ENTITY_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(propertyKey, ColumnMetadata.named("PROPERTY_KEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(propertytype, ColumnMetadata.named("PROPERTYTYPE").withIndex(5).ofType(Types.INTEGER));
    }

}

