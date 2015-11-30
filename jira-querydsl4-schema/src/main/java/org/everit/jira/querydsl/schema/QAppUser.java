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
 * QAppUser is a Querydsl query type for QAppUser
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAppUser extends com.querydsl.sql.RelationalPathBase<QAppUser> {

    private static final long serialVersionUID = -2005247916;

    public static final QAppUser appUser = new QAppUser("APP_USER");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lowerUserName = createString("lowerUserName");

    public final StringPath userKey = createString("userKey");

    public final com.querydsl.sql.PrimaryKey<QAppUser> sysIdx48 = createPrimaryKey(id);

    public QAppUser(String variable) {
        super(QAppUser.class, forVariable(variable), "PUBLIC", "APP_USER");
        addMetadata();
    }

    public QAppUser(String variable, String schema, String table) {
        super(QAppUser.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAppUser(Path<? extends QAppUser> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "APP_USER");
        addMetadata();
    }

    public QAppUser(PathMetadata metadata) {
        super(QAppUser.class, metadata, "PUBLIC", "APP_USER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(lowerUserName, ColumnMetadata.named("LOWER_USER_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(userKey, ColumnMetadata.named("USER_KEY").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

