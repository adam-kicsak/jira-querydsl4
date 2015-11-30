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
 * QExternalgadget is a Querydsl query type for QExternalgadget
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QExternalgadget extends com.querydsl.sql.RelationalPathBase<QExternalgadget> {

    private static final long serialVersionUID = 583732239;

    public static final QExternalgadget externalgadget = new QExternalgadget("EXTERNALGADGET");

    public final StringPath gadgetXml = createString("gadgetXml");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.querydsl.sql.PrimaryKey<QExternalgadget> sysIdx77 = createPrimaryKey(id);

    public QExternalgadget(String variable) {
        super(QExternalgadget.class, forVariable(variable), "PUBLIC", "EXTERNALGADGET");
        addMetadata();
    }

    public QExternalgadget(String variable, String schema, String table) {
        super(QExternalgadget.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExternalgadget(Path<? extends QExternalgadget> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "EXTERNALGADGET");
        addMetadata();
    }

    public QExternalgadget(PathMetadata metadata) {
        super(QExternalgadget.class, metadata, "PUBLIC", "EXTERNALGADGET");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(gadgetXml, ColumnMetadata.named("GADGET_XML").withIndex(2).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
    }

}

