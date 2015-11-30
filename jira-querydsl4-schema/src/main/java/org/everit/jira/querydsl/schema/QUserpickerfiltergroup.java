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
 * QUserpickerfiltergroup is a Querydsl query type for QUserpickerfiltergroup
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUserpickerfiltergroup extends com.querydsl.sql.RelationalPathBase<QUserpickerfiltergroup> {

    private static final long serialVersionUID = 1054868758;

    public static final QUserpickerfiltergroup userpickerfiltergroup = new QUserpickerfiltergroup("USERPICKERFILTERGROUP");

    public final StringPath groupname = createString("groupname");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> userpickerfilter = createNumber("userpickerfilter", Long.class);

    public final com.querydsl.sql.PrimaryKey<QUserpickerfiltergroup> sysIdx199 = createPrimaryKey(id);

    public QUserpickerfiltergroup(String variable) {
        super(QUserpickerfiltergroup.class, forVariable(variable), "PUBLIC", "USERPICKERFILTERGROUP");
        addMetadata();
    }

    public QUserpickerfiltergroup(String variable, String schema, String table) {
        super(QUserpickerfiltergroup.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserpickerfiltergroup(Path<? extends QUserpickerfiltergroup> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "USERPICKERFILTERGROUP");
        addMetadata();
    }

    public QUserpickerfiltergroup(PathMetadata metadata) {
        super(QUserpickerfiltergroup.class, metadata, "PUBLIC", "USERPICKERFILTERGROUP");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupname, ColumnMetadata.named("GROUPNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(userpickerfilter, ColumnMetadata.named("USERPICKERFILTER").withIndex(2).ofType(Types.BIGINT));
    }

}

