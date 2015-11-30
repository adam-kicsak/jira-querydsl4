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
 * QFavouriteassociations is a Querydsl query type for QFavouriteassociations
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFavouriteassociations extends com.querydsl.sql.RelationalPathBase<QFavouriteassociations> {

    private static final long serialVersionUID = 1180211203;

    public static final QFavouriteassociations favouriteassociations = new QFavouriteassociations("FAVOURITEASSOCIATIONS");

    public final NumberPath<Long> entityid = createNumber("entityid", Long.class);

    public final StringPath entitytype = createString("entitytype");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<QFavouriteassociations> sysIdx78 = createPrimaryKey(id);

    public QFavouriteassociations(String variable) {
        super(QFavouriteassociations.class, forVariable(variable), "PUBLIC", "FAVOURITEASSOCIATIONS");
        addMetadata();
    }

    public QFavouriteassociations(String variable, String schema, String table) {
        super(QFavouriteassociations.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFavouriteassociations(Path<? extends QFavouriteassociations> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FAVOURITEASSOCIATIONS");
        addMetadata();
    }

    public QFavouriteassociations(PathMetadata metadata) {
        super(QFavouriteassociations.class, metadata, "PUBLIC", "FAVOURITEASSOCIATIONS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entityid, ColumnMetadata.named("ENTITYID").withIndex(4).ofType(Types.BIGINT));
        addMetadata(entitytype, ColumnMetadata.named("ENTITYTYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(5).ofType(Types.BIGINT));
        addMetadata(username, ColumnMetadata.named("USERNAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

