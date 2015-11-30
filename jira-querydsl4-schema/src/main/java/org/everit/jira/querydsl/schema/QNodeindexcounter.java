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
 * QNodeindexcounter is a Querydsl query type for QNodeindexcounter
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QNodeindexcounter extends com.querydsl.sql.RelationalPathBase<QNodeindexcounter> {

    private static final long serialVersionUID = 819159588;

    public static final QNodeindexcounter nodeindexcounter = new QNodeindexcounter("NODEINDEXCOUNTER");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> indexOperationId = createNumber("indexOperationId", Long.class);

    public final StringPath nodeId = createString("nodeId");

    public final StringPath sendingNodeId = createString("sendingNodeId");

    public final com.querydsl.sql.PrimaryKey<QNodeindexcounter> sysIdx129 = createPrimaryKey(id);

    public QNodeindexcounter(String variable) {
        super(QNodeindexcounter.class, forVariable(variable), "PUBLIC", "NODEINDEXCOUNTER");
        addMetadata();
    }

    public QNodeindexcounter(String variable, String schema, String table) {
        super(QNodeindexcounter.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNodeindexcounter(Path<? extends QNodeindexcounter> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "NODEINDEXCOUNTER");
        addMetadata();
    }

    public QNodeindexcounter(PathMetadata metadata) {
        super(QNodeindexcounter.class, metadata, "PUBLIC", "NODEINDEXCOUNTER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(indexOperationId, ColumnMetadata.named("INDEX_OPERATION_ID").withIndex(4).ofType(Types.BIGINT));
        addMetadata(nodeId, ColumnMetadata.named("NODE_ID").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sendingNodeId, ColumnMetadata.named("SENDING_NODE_ID").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

