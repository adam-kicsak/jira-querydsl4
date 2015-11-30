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
 * QUserassociation is a Querydsl query type for QUserassociation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUserassociation extends com.querydsl.sql.RelationalPathBase<QUserassociation> {

    private static final long serialVersionUID = -1779670370;

    public static final QUserassociation userassociation = new QUserassociation("USERASSOCIATION");

    public final StringPath associationType = createString("associationType");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final StringPath sinkNodeEntity = createString("sinkNodeEntity");

    public final NumberPath<Long> sinkNodeId = createNumber("sinkNodeId", Long.class);

    public final StringPath sourceName = createString("sourceName");

    public final com.querydsl.sql.PrimaryKey<QUserassociation> sysIdx195 = createPrimaryKey(associationType, sinkNodeEntity, sinkNodeId, sourceName);

    public QUserassociation(String variable) {
        super(QUserassociation.class, forVariable(variable), "PUBLIC", "USERASSOCIATION");
        addMetadata();
    }

    public QUserassociation(String variable, String schema, String table) {
        super(QUserassociation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserassociation(Path<? extends QUserassociation> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "USERASSOCIATION");
        addMetadata();
    }

    public QUserassociation(PathMetadata metadata) {
        super(QUserassociation.class, metadata, "PUBLIC", "USERASSOCIATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(associationType, ColumnMetadata.named("ASSOCIATION_TYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(created, ColumnMetadata.named("CREATED").withIndex(6).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(sequence, ColumnMetadata.named("SEQUENCE").withIndex(5).ofType(Types.INTEGER));
        addMetadata(sinkNodeEntity, ColumnMetadata.named("SINK_NODE_ENTITY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(sinkNodeId, ColumnMetadata.named("SINK_NODE_ID").withIndex(2).ofType(Types.BIGINT).notNull());
        addMetadata(sourceName, ColumnMetadata.named("SOURCE_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(2147483647).notNull());
    }

}

