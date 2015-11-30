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
 * QQrtzJobListeners is a Querydsl query type for QQrtzJobListeners
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QQrtzJobListeners extends com.querydsl.sql.RelationalPathBase<QQrtzJobListeners> {

    private static final long serialVersionUID = 347074369;

    public static final QQrtzJobListeners qrtzJobListeners = new QQrtzJobListeners("QRTZ_JOB_LISTENERS");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> job = createNumber("job", Long.class);

    public final StringPath jobListener = createString("jobListener");

    public final com.querydsl.sql.PrimaryKey<QQrtzJobListeners> sysIdx170 = createPrimaryKey(id);

    public QQrtzJobListeners(String variable) {
        super(QQrtzJobListeners.class, forVariable(variable), "PUBLIC", "QRTZ_JOB_LISTENERS");
        addMetadata();
    }

    public QQrtzJobListeners(String variable, String schema, String table) {
        super(QQrtzJobListeners.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzJobListeners(Path<? extends QQrtzJobListeners> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "QRTZ_JOB_LISTENERS");
        addMetadata();
    }

    public QQrtzJobListeners(PathMetadata metadata) {
        super(QQrtzJobListeners.class, metadata, "PUBLIC", "QRTZ_JOB_LISTENERS");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(job, ColumnMetadata.named("JOB").withIndex(2).ofType(Types.BIGINT));
        addMetadata(jobListener, ColumnMetadata.named("JOB_LISTENER").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

