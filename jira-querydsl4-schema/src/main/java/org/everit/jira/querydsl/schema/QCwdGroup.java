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
 * QCwdGroup is a Querydsl query type for QCwdGroup
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCwdGroup extends com.querydsl.sql.RelationalPathBase<QCwdGroup> {

    private static final long serialVersionUID = -1281430489;

    public static final QCwdGroup cwdGroup = new QCwdGroup("CWD_GROUP");

    public final NumberPath<Integer> active = createNumber("active", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final StringPath groupName = createString("groupName");

    public final StringPath groupType = createString("groupType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> local = createNumber("local", Integer.class);

    public final StringPath lowerDescription = createString("lowerDescription");

    public final StringPath lowerGroupName = createString("lowerGroupName");

    public final DateTimePath<java.sql.Timestamp> updatedDate = createDateTime("updatedDate", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QCwdGroup> sysIdx98 = createPrimaryKey(id);

    public QCwdGroup(String variable) {
        super(QCwdGroup.class, forVariable(variable), "PUBLIC", "CWD_GROUP");
        addMetadata();
    }

    public QCwdGroup(String variable, String schema, String table) {
        super(QCwdGroup.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdGroup(Path<? extends QCwdGroup> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CWD_GROUP");
        addMetadata();
    }

    public QCwdGroup(PathMetadata metadata) {
        super(QCwdGroup.class, metadata, "PUBLIC", "CWD_GROUP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("ACTIVE").withIndex(4).ofType(Types.INTEGER));
        addMetadata(createdDate, ColumnMetadata.named("CREATED_DATE").withIndex(6).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(directoryId, ColumnMetadata.named("DIRECTORY_ID").withIndex(11).ofType(Types.BIGINT));
        addMetadata(groupName, ColumnMetadata.named("GROUP_NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(groupType, ColumnMetadata.named("GROUP_TYPE").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(local, ColumnMetadata.named("LOCAL").withIndex(5).ofType(Types.INTEGER));
        addMetadata(lowerDescription, ColumnMetadata.named("LOWER_DESCRIPTION").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(lowerGroupName, ColumnMetadata.named("LOWER_GROUP_NAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(updatedDate, ColumnMetadata.named("UPDATED_DATE").withIndex(7).ofType(Types.TIMESTAMP).withSize(6));
    }

}

