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
 * QWorkflowschemeentity is a Querydsl query type for QWorkflowschemeentity
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWorkflowschemeentity extends com.querydsl.sql.RelationalPathBase<QWorkflowschemeentity> {

    private static final long serialVersionUID = 1176734015;

    public static final QWorkflowschemeentity workflowschemeentity = new QWorkflowschemeentity("WORKFLOWSCHEMEENTITY");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final StringPath workflow = createString("workflow");

    public final com.querydsl.sql.PrimaryKey<QWorkflowschemeentity> sysIdx206 = createPrimaryKey(id);

    public QWorkflowschemeentity(String variable) {
        super(QWorkflowschemeentity.class, forVariable(variable), "PUBLIC", "WORKFLOWSCHEMEENTITY");
        addMetadata();
    }

    public QWorkflowschemeentity(String variable, String schema, String table) {
        super(QWorkflowschemeentity.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWorkflowschemeentity(Path<? extends QWorkflowschemeentity> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "WORKFLOWSCHEMEENTITY");
        addMetadata();
    }

    public QWorkflowschemeentity(PathMetadata metadata) {
        super(QWorkflowschemeentity.class, metadata, "PUBLIC", "WORKFLOWSCHEMEENTITY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(issuetype, ColumnMetadata.named("ISSUETYPE").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(2).ofType(Types.BIGINT));
        addMetadata(workflow, ColumnMetadata.named("WORKFLOW").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

