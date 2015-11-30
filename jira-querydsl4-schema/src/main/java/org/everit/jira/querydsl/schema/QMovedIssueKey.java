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
 * QMovedIssueKey is a Querydsl query type for QMovedIssueKey
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMovedIssueKey extends com.querydsl.sql.RelationalPathBase<QMovedIssueKey> {

    private static final long serialVersionUID = 543794017;

    public static final QMovedIssueKey movedIssueKey = new QMovedIssueKey("MOVED_ISSUE_KEY");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueId = createNumber("issueId", Long.class);

    public final StringPath oldIssueKey = createString("oldIssueKey");

    public final com.querydsl.sql.PrimaryKey<QMovedIssueKey> sysIdx127 = createPrimaryKey(id);

    public QMovedIssueKey(String variable) {
        super(QMovedIssueKey.class, forVariable(variable), "PUBLIC", "MOVED_ISSUE_KEY");
        addMetadata();
    }

    public QMovedIssueKey(String variable, String schema, String table) {
        super(QMovedIssueKey.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMovedIssueKey(Path<? extends QMovedIssueKey> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "MOVED_ISSUE_KEY");
        addMetadata();
    }

    public QMovedIssueKey(PathMetadata metadata) {
        super(QMovedIssueKey.class, metadata, "PUBLIC", "MOVED_ISSUE_KEY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(issueId, ColumnMetadata.named("ISSUE_ID").withIndex(3).ofType(Types.BIGINT));
        addMetadata(oldIssueKey, ColumnMetadata.named("OLD_ISSUE_KEY").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

