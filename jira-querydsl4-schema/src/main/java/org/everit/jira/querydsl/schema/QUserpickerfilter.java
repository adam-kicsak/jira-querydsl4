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
 * QUserpickerfilter is a Querydsl query type for QUserpickerfilter
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUserpickerfilter extends com.querydsl.sql.RelationalPathBase<QUserpickerfilter> {

    private static final long serialVersionUID = -398856439;

    public static final QUserpickerfilter userpickerfilter = new QUserpickerfilter("USERPICKERFILTER");

    public final NumberPath<Long> customfield = createNumber("customfield", Long.class);

    public final NumberPath<Long> customfieldconfig = createNumber("customfieldconfig", Long.class);

    public final StringPath enabled = createString("enabled");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.querydsl.sql.PrimaryKey<QUserpickerfilter> sysIdx198 = createPrimaryKey(id);

    public QUserpickerfilter(String variable) {
        super(QUserpickerfilter.class, forVariable(variable), "PUBLIC", "USERPICKERFILTER");
        addMetadata();
    }

    public QUserpickerfilter(String variable, String schema, String table) {
        super(QUserpickerfilter.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserpickerfilter(Path<? extends QUserpickerfilter> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "USERPICKERFILTER");
        addMetadata();
    }

    public QUserpickerfilter(PathMetadata metadata) {
        super(QUserpickerfilter.class, metadata, "PUBLIC", "USERPICKERFILTER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(customfield, ColumnMetadata.named("CUSTOMFIELD").withIndex(2).ofType(Types.BIGINT));
        addMetadata(customfieldconfig, ColumnMetadata.named("CUSTOMFIELDCONFIG").withIndex(3).ofType(Types.BIGINT));
        addMetadata(enabled, ColumnMetadata.named("ENABLED").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
    }

}

