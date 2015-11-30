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
 * QFeature is a Querydsl query type for QFeature
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFeature extends com.querydsl.sql.RelationalPathBase<QFeature> {

    private static final long serialVersionUID = 2104422846;

    public static final QFeature feature = new QFeature("FEATURE");

    public final StringPath featureName = createString("featureName");

    public final StringPath featureType = createString("featureType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath userKey = createString("userKey");

    public final com.querydsl.sql.PrimaryKey<QFeature> sysIdx79 = createPrimaryKey(id);

    public QFeature(String variable) {
        super(QFeature.class, forVariable(variable), "PUBLIC", "FEATURE");
        addMetadata();
    }

    public QFeature(String variable, String schema, String table) {
        super(QFeature.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFeature(Path<? extends QFeature> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FEATURE");
        addMetadata();
    }

    public QFeature(PathMetadata metadata) {
        super(QFeature.class, metadata, "PUBLIC", "FEATURE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(featureName, ColumnMetadata.named("FEATURE_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(featureType, ColumnMetadata.named("FEATURE_TYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(userKey, ColumnMetadata.named("USER_KEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

