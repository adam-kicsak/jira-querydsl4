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
 * QJiraperms is a Querydsl query type for QJiraperms
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJiraperms extends com.querydsl.sql.RelationalPathBase<QJiraperms> {

    private static final long serialVersionUID = 815899997;

    public static final QJiraperms jiraperms = new QJiraperms("JIRAPERMS");

    public final StringPath groupname = createString("groupname");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> permtype = createNumber("permtype", Long.class);

    public final NumberPath<Long> projectid = createNumber("projectid", Long.class);

    public final com.querydsl.sql.PrimaryKey<QJiraperms> sysIdx153 = createPrimaryKey(id);

    public QJiraperms(String variable) {
        super(QJiraperms.class, forVariable(variable), "PUBLIC", "JIRAPERMS");
        addMetadata();
    }

    public QJiraperms(String variable, String schema, String table) {
        super(QJiraperms.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJiraperms(Path<? extends QJiraperms> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "JIRAPERMS");
        addMetadata();
    }

    public QJiraperms(PathMetadata metadata) {
        super(QJiraperms.class, metadata, "PUBLIC", "JIRAPERMS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupname, ColumnMetadata.named("GROUPNAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(permtype, ColumnMetadata.named("PERMTYPE").withIndex(2).ofType(Types.BIGINT));
        addMetadata(projectid, ColumnMetadata.named("PROJECTID").withIndex(3).ofType(Types.BIGINT));
    }

}

