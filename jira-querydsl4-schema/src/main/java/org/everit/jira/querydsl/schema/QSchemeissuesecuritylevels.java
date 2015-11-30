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
 * QSchemeissuesecuritylevels is a Querydsl query type for QSchemeissuesecuritylevels
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSchemeissuesecuritylevels extends com.querydsl.sql.RelationalPathBase<QSchemeissuesecuritylevels> {

    private static final long serialVersionUID = 1348059339;

    public static final QSchemeissuesecuritylevels schemeissuesecuritylevels = new QSchemeissuesecuritylevels("SCHEMEISSUESECURITYLEVELS");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSchemeissuesecuritylevels> sysIdx183 = createPrimaryKey(id);

    public QSchemeissuesecuritylevels(String variable) {
        super(QSchemeissuesecuritylevels.class, forVariable(variable), "PUBLIC", "SCHEMEISSUESECURITYLEVELS");
        addMetadata();
    }

    public QSchemeissuesecuritylevels(String variable, String schema, String table) {
        super(QSchemeissuesecuritylevels.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSchemeissuesecuritylevels(Path<? extends QSchemeissuesecuritylevels> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SCHEMEISSUESECURITYLEVELS");
        addMetadata();
    }

    public QSchemeissuesecuritylevels(PathMetadata metadata) {
        super(QSchemeissuesecuritylevels.class, metadata, "PUBLIC", "SCHEMEISSUESECURITYLEVELS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(4).ofType(Types.BIGINT));
    }

}

