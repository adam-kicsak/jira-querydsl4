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
 * QProjectcategory is a Querydsl query type for QProjectcategory
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectcategory extends com.querydsl.sql.RelationalPathBase<QProjectcategory> {

    private static final long serialVersionUID = 1949568479;

    public static final QProjectcategory projectcategory = new QProjectcategory("PROJECTCATEGORY");

    public final StringPath cname = createString("cname");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.querydsl.sql.PrimaryKey<QProjectcategory> sysIdx162 = createPrimaryKey(id);

    public QProjectcategory(String variable) {
        super(QProjectcategory.class, forVariable(variable), "PUBLIC", "PROJECTCATEGORY");
        addMetadata();
    }

    public QProjectcategory(String variable, String schema, String table) {
        super(QProjectcategory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectcategory(Path<? extends QProjectcategory> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PROJECTCATEGORY");
        addMetadata();
    }

    public QProjectcategory(PathMetadata metadata) {
        super(QProjectcategory.class, metadata, "PUBLIC", "PROJECTCATEGORY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cname, ColumnMetadata.named("CNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
    }

}

