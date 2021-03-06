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
 * QFieldlayoutschemeassociation is a Querydsl query type for QFieldlayoutschemeassociation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFieldlayoutschemeassociation extends com.querydsl.sql.RelationalPathBase<QFieldlayoutschemeassociation> {

    private static final long serialVersionUID = -494692400;

    public static final QFieldlayoutschemeassociation fieldlayoutschemeassociation = new QFieldlayoutschemeassociation("FIELDLAYOUTSCHEMEASSOCIATION");

    public final NumberPath<Long> fieldlayoutscheme = createNumber("fieldlayoutscheme", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFieldlayoutschemeassociation> sysIdx86 = createPrimaryKey(id);

    public QFieldlayoutschemeassociation(String variable) {
        super(QFieldlayoutschemeassociation.class, forVariable(variable), "PUBLIC", "FIELDLAYOUTSCHEMEASSOCIATION");
        addMetadata();
    }

    public QFieldlayoutschemeassociation(String variable, String schema, String table) {
        super(QFieldlayoutschemeassociation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldlayoutschemeassociation(Path<? extends QFieldlayoutschemeassociation> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "FIELDLAYOUTSCHEMEASSOCIATION");
        addMetadata();
    }

    public QFieldlayoutschemeassociation(PathMetadata metadata) {
        super(QFieldlayoutschemeassociation.class, metadata, "PUBLIC", "FIELDLAYOUTSCHEMEASSOCIATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldlayoutscheme, ColumnMetadata.named("FIELDLAYOUTSCHEME").withIndex(4).ofType(Types.BIGINT));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(issuetype, ColumnMetadata.named("ISSUETYPE").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(project, ColumnMetadata.named("PROJECT").withIndex(3).ofType(Types.BIGINT));
    }

}

