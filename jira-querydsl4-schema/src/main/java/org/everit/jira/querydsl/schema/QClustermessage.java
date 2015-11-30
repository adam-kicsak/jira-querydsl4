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
 * QClustermessage is a Querydsl query type for QClustermessage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QClustermessage extends com.querydsl.sql.RelationalPathBase<QClustermessage> {

    private static final long serialVersionUID = 666794245;

    public static final QClustermessage clustermessage = new QClustermessage("CLUSTERMESSAGE");

    public final StringPath claimedByNode = createString("claimedByNode");

    public final StringPath destinationNode = createString("destinationNode");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath message = createString("message");

    public final DateTimePath<java.sql.Timestamp> messageTime = createDateTime("messageTime", java.sql.Timestamp.class);

    public final StringPath sourceNode = createString("sourceNode");

    public final com.querydsl.sql.PrimaryKey<QClustermessage> sysIdx56 = createPrimaryKey(id);

    public QClustermessage(String variable) {
        super(QClustermessage.class, forVariable(variable), "PUBLIC", "CLUSTERMESSAGE");
        addMetadata();
    }

    public QClustermessage(String variable, String schema, String table) {
        super(QClustermessage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QClustermessage(Path<? extends QClustermessage> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CLUSTERMESSAGE");
        addMetadata();
    }

    public QClustermessage(PathMetadata metadata) {
        super(QClustermessage.class, metadata, "PUBLIC", "CLUSTERMESSAGE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(claimedByNode, ColumnMetadata.named("CLAIMED_BY_NODE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(destinationNode, ColumnMetadata.named("DESTINATION_NODE").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(message, ColumnMetadata.named("MESSAGE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(messageTime, ColumnMetadata.named("MESSAGE_TIME").withIndex(6).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(sourceNode, ColumnMetadata.named("SOURCE_NODE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

