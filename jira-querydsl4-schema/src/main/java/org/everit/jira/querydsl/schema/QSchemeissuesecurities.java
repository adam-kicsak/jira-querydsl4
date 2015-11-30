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
 * QSchemeissuesecurities is a Querydsl query type for QSchemeissuesecurities
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSchemeissuesecurities extends com.querydsl.sql.RelationalPathBase<QSchemeissuesecurities> {

    private static final long serialVersionUID = 1037814266;

    public static final QSchemeissuesecurities schemeissuesecurities = new QSchemeissuesecurities("SCHEMEISSUESECURITIES");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final StringPath secParameter = createString("secParameter");

    public final StringPath secType = createString("secType");

    public final NumberPath<Long> security = createNumber("security", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSchemeissuesecurities> sysIdx182 = createPrimaryKey(id);

    public QSchemeissuesecurities(String variable) {
        super(QSchemeissuesecurities.class, forVariable(variable), "PUBLIC", "SCHEMEISSUESECURITIES");
        addMetadata();
    }

    public QSchemeissuesecurities(String variable, String schema, String table) {
        super(QSchemeissuesecurities.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSchemeissuesecurities(Path<? extends QSchemeissuesecurities> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SCHEMEISSUESECURITIES");
        addMetadata();
    }

    public QSchemeissuesecurities(PathMetadata metadata) {
        super(QSchemeissuesecurities.class, metadata, "PUBLIC", "SCHEMEISSUESECURITIES");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(2).ofType(Types.BIGINT));
        addMetadata(secParameter, ColumnMetadata.named("SEC_PARAMETER").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(secType, ColumnMetadata.named("SEC_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(security, ColumnMetadata.named("SECURITY").withIndex(3).ofType(Types.BIGINT));
    }

}

