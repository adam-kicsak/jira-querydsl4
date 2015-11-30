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
 * QListenerconfig is a Querydsl query type for QListenerconfig
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QListenerconfig extends com.querydsl.sql.RelationalPathBase<QListenerconfig> {

    private static final long serialVersionUID = 1997064494;

    public static final QListenerconfig listenerconfig = new QListenerconfig("LISTENERCONFIG");

    public final StringPath clazz = createString("clazz");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath listenername = createString("listenername");

    public final com.querydsl.sql.PrimaryKey<QListenerconfig> sysIdx123 = createPrimaryKey(id);

    public QListenerconfig(String variable) {
        super(QListenerconfig.class, forVariable(variable), "PUBLIC", "LISTENERCONFIG");
        addMetadata();
    }

    public QListenerconfig(String variable, String schema, String table) {
        super(QListenerconfig.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QListenerconfig(Path<? extends QListenerconfig> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "LISTENERCONFIG");
        addMetadata();
    }

    public QListenerconfig(PathMetadata metadata) {
        super(QListenerconfig.class, metadata, "PUBLIC", "LISTENERCONFIG");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(clazz, ColumnMetadata.named("CLAZZ").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(listenername, ColumnMetadata.named("LISTENERNAME").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

