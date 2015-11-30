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
 * QNotification is a Querydsl query type for QNotification
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QNotification extends com.querydsl.sql.RelationalPathBase<QNotification> {

    private static final long serialVersionUID = 475074339;

    public static final QNotification notification = new QNotification("NOTIFICATION");

    public final StringPath event = createString("event");

    public final NumberPath<Long> eventTypeId = createNumber("eventTypeId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath notifParameter = createString("notifParameter");

    public final StringPath notifType = createString("notifType");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final NumberPath<Long> templateId = createNumber("templateId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QNotification> sysIdx130 = createPrimaryKey(id);

    public QNotification(String variable) {
        super(QNotification.class, forVariable(variable), "PUBLIC", "NOTIFICATION");
        addMetadata();
    }

    public QNotification(String variable, String schema, String table) {
        super(QNotification.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNotification(Path<? extends QNotification> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "NOTIFICATION");
        addMetadata();
    }

    public QNotification(PathMetadata metadata) {
        super(QNotification.class, metadata, "PUBLIC", "NOTIFICATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(event, ColumnMetadata.named("EVENT").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(eventTypeId, ColumnMetadata.named("EVENT_TYPE_ID").withIndex(4).ofType(Types.BIGINT));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(notifParameter, ColumnMetadata.named("NOTIF_PARAMETER").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(notifType, ColumnMetadata.named("NOTIF_TYPE").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(scheme, ColumnMetadata.named("SCHEME").withIndex(2).ofType(Types.BIGINT));
        addMetadata(templateId, ColumnMetadata.named("TEMPLATE_ID").withIndex(5).ofType(Types.BIGINT));
    }

}

