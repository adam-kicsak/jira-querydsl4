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
 * QCustomfield is a Querydsl query type for QCustomfield
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCustomfield extends com.querydsl.sql.RelationalPathBase<QCustomfield> {

    private static final long serialVersionUID = 302933745;

    public static final QCustomfield customfield = new QCustomfield("CUSTOMFIELD");

    public final StringPath cfname = createString("cfname");

    public final StringPath customfieldsearcherkey = createString("customfieldsearcherkey");

    public final StringPath customfieldtypekey = createString("customfieldtypekey");

    public final StringPath defaultvalue = createString("defaultvalue");

    public final StringPath description = createString("description");

    public final NumberPath<Long> fieldtype = createNumber("fieldtype", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCustomfield> sysIdx64 = createPrimaryKey(id);

    public QCustomfield(String variable) {
        super(QCustomfield.class, forVariable(variable), "PUBLIC", "CUSTOMFIELD");
        addMetadata();
    }

    public QCustomfield(String variable, String schema, String table) {
        super(QCustomfield.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCustomfield(Path<? extends QCustomfield> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CUSTOMFIELD");
        addMetadata();
    }

    public QCustomfield(PathMetadata metadata) {
        super(QCustomfield.class, metadata, "PUBLIC", "CUSTOMFIELD");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cfname, ColumnMetadata.named("CFNAME").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(customfieldsearcherkey, ColumnMetadata.named("CUSTOMFIELDSEARCHERKEY").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(customfieldtypekey, ColumnMetadata.named("CUSTOMFIELDTYPEKEY").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(defaultvalue, ColumnMetadata.named("DEFAULTVALUE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(description, ColumnMetadata.named("DESCRIPTION").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldtype, ColumnMetadata.named("FIELDTYPE").withIndex(7).ofType(Types.BIGINT));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(issuetype, ColumnMetadata.named("ISSUETYPE").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(project, ColumnMetadata.named("PROJECT").withIndex(8).ofType(Types.BIGINT));
    }

}

