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
 * QCustomfieldvalue is a Querydsl query type for QCustomfieldvalue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCustomfieldvalue extends com.querydsl.sql.RelationalPathBase<QCustomfieldvalue> {

    private static final long serialVersionUID = -1225926368;

    public static final QCustomfieldvalue customfieldvalue = new QCustomfieldvalue("CUSTOMFIELDVALUE");

    public final NumberPath<Long> customfield = createNumber("customfield", Long.class);

    public final DateTimePath<java.sql.Timestamp> datevalue = createDateTime("datevalue", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issue = createNumber("issue", Long.class);

    public final NumberPath<Double> numbervalue = createNumber("numbervalue", Double.class);

    public final StringPath parentkey = createString("parentkey");

    public final StringPath stringvalue = createString("stringvalue");

    public final StringPath textvalue = createString("textvalue");

    public final StringPath valuetype = createString("valuetype");

    public final com.querydsl.sql.PrimaryKey<QCustomfieldvalue> sysIdx66 = createPrimaryKey(id);

    public QCustomfieldvalue(String variable) {
        super(QCustomfieldvalue.class, forVariable(variable), "PUBLIC", "CUSTOMFIELDVALUE");
        addMetadata();
    }

    public QCustomfieldvalue(String variable, String schema, String table) {
        super(QCustomfieldvalue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCustomfieldvalue(Path<? extends QCustomfieldvalue> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "CUSTOMFIELDVALUE");
        addMetadata();
    }

    public QCustomfieldvalue(PathMetadata metadata) {
        super(QCustomfieldvalue.class, metadata, "PUBLIC", "CUSTOMFIELDVALUE");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(customfield, ColumnMetadata.named("CUSTOMFIELD").withIndex(3).ofType(Types.BIGINT));
        addMetadata(datevalue, ColumnMetadata.named("DATEVALUE").withIndex(8).ofType(Types.TIMESTAMP).withSize(6));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(issue, ColumnMetadata.named("ISSUE").withIndex(2).ofType(Types.BIGINT));
        addMetadata(numbervalue, ColumnMetadata.named("NUMBERVALUE").withIndex(6).ofType(Types.DOUBLE));
        addMetadata(parentkey, ColumnMetadata.named("PARENTKEY").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(stringvalue, ColumnMetadata.named("STRINGVALUE").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(textvalue, ColumnMetadata.named("TEXTVALUE").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(valuetype, ColumnMetadata.named("VALUETYPE").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

