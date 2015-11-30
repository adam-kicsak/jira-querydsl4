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
 * QDraftworkflowscheme is a Querydsl query type for QDraftworkflowscheme
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDraftworkflowscheme extends com.querydsl.sql.RelationalPathBase<QDraftworkflowscheme> {

    private static final long serialVersionUID = -2015684403;

    public static final QDraftworkflowscheme draftworkflowscheme = new QDraftworkflowscheme("DRAFTWORKFLOWSCHEME");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> lastModifiedDate = createDateTime("lastModifiedDate", java.sql.Timestamp.class);

    public final StringPath lastModifiedUser = createString("lastModifiedUser");

    public final StringPath name = createString("name");

    public final NumberPath<Long> workflowSchemeId = createNumber("workflowSchemeId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDraftworkflowscheme> sysIdx71 = createPrimaryKey(id);

    public QDraftworkflowscheme(String variable) {
        super(QDraftworkflowscheme.class, forVariable(variable), "PUBLIC", "DRAFTWORKFLOWSCHEME");
        addMetadata();
    }

    public QDraftworkflowscheme(String variable, String schema, String table) {
        super(QDraftworkflowscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDraftworkflowscheme(Path<? extends QDraftworkflowscheme> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "DRAFTWORKFLOWSCHEME");
        addMetadata();
    }

    public QDraftworkflowscheme(PathMetadata metadata) {
        super(QDraftworkflowscheme.class, metadata, "PUBLIC", "DRAFTWORKFLOWSCHEME");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(lastModifiedDate, ColumnMetadata.named("LAST_MODIFIED_DATE").withIndex(5).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(lastModifiedUser, ColumnMetadata.named("LAST_MODIFIED_USER").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(workflowSchemeId, ColumnMetadata.named("WORKFLOW_SCHEME_ID").withIndex(4).ofType(Types.BIGINT));
    }

}

