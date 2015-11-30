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
 * QUpgradeversionhistory is a Querydsl query type for QUpgradeversionhistory
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUpgradeversionhistory extends com.querydsl.sql.RelationalPathBase<QUpgradeversionhistory> {

    private static final long serialVersionUID = -689645920;

    public static final QUpgradeversionhistory upgradeversionhistory = new QUpgradeversionhistory("UPGRADEVERSIONHISTORY");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath targetbuild = createString("targetbuild");

    public final StringPath targetversion = createString("targetversion");

    public final DateTimePath<java.sql.Timestamp> timeperformed = createDateTime("timeperformed", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QUpgradeversionhistory> sysIdx193 = createPrimaryKey(targetbuild);

    public QUpgradeversionhistory(String variable) {
        super(QUpgradeversionhistory.class, forVariable(variable), "PUBLIC", "UPGRADEVERSIONHISTORY");
        addMetadata();
    }

    public QUpgradeversionhistory(String variable, String schema, String table) {
        super(QUpgradeversionhistory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUpgradeversionhistory(Path<? extends QUpgradeversionhistory> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "UPGRADEVERSIONHISTORY");
        addMetadata();
    }

    public QUpgradeversionhistory(PathMetadata metadata) {
        super(QUpgradeversionhistory.class, metadata, "PUBLIC", "UPGRADEVERSIONHISTORY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT));
        addMetadata(targetbuild, ColumnMetadata.named("TARGETBUILD").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647).notNull());
        addMetadata(targetversion, ColumnMetadata.named("TARGETVERSION").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(timeperformed, ColumnMetadata.named("TIMEPERFORMED").withIndex(2).ofType(Types.TIMESTAMP).withSize(6));
    }

}

