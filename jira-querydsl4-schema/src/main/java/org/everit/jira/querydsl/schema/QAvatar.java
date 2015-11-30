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
 * QAvatar is a Querydsl query type for QAvatar
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAvatar extends com.querydsl.sql.RelationalPathBase<QAvatar> {

    private static final long serialVersionUID = -1860677231;

    public static final QAvatar avatar = new QAvatar("AVATAR");

    public final StringPath avatartype = createString("avatartype");

    public final StringPath contenttype = createString("contenttype");

    public final StringPath filename = createString("filename");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath owner = createString("owner");

    public final NumberPath<Integer> systemavatar = createNumber("systemavatar", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QAvatar> sysIdx52 = createPrimaryKey(id);

    public QAvatar(String variable) {
        super(QAvatar.class, forVariable(variable), "PUBLIC", "AVATAR");
        addMetadata();
    }

    public QAvatar(String variable, String schema, String table) {
        super(QAvatar.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAvatar(Path<? extends QAvatar> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "AVATAR");
        addMetadata();
    }

    public QAvatar(PathMetadata metadata) {
        super(QAvatar.class, metadata, "PUBLIC", "AVATAR");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(avatartype, ColumnMetadata.named("AVATARTYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(contenttype, ColumnMetadata.named("CONTENTTYPE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(filename, ColumnMetadata.named("FILENAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(owner, ColumnMetadata.named("OWNER").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(systemavatar, ColumnMetadata.named("SYSTEMAVATAR").withIndex(6).ofType(Types.INTEGER));
    }

}

