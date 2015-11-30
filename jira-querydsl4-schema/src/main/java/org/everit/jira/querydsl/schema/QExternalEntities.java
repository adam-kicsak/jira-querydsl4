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
 * QExternalEntities is a Querydsl query type for QExternalEntities
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QExternalEntities extends com.querydsl.sql.RelationalPathBase<QExternalEntities> {

    private static final long serialVersionUID = -1687044380;

    public static final QExternalEntities externalEntities = new QExternalEntities("EXTERNAL_ENTITIES");

    public final StringPath entitytype = createString("entitytype");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QExternalEntities> sysIdx76 = createPrimaryKey(id);

    public QExternalEntities(String variable) {
        super(QExternalEntities.class, forVariable(variable), "PUBLIC", "EXTERNAL_ENTITIES");
        addMetadata();
    }

    public QExternalEntities(String variable, String schema, String table) {
        super(QExternalEntities.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExternalEntities(Path<? extends QExternalEntities> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "EXTERNAL_ENTITIES");
        addMetadata();
    }

    public QExternalEntities(PathMetadata metadata) {
        super(QExternalEntities.class, metadata, "PUBLIC", "EXTERNAL_ENTITIES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entitytype, ColumnMetadata.named("ENTITYTYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

