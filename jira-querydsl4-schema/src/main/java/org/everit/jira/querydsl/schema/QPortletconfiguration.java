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
 * QPortletconfiguration is a Querydsl query type for QPortletconfiguration
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPortletconfiguration extends com.querydsl.sql.RelationalPathBase<QPortletconfiguration> {

    private static final long serialVersionUID = 106142580;

    public static final QPortletconfiguration portletconfiguration = new QPortletconfiguration("PORTLETCONFIGURATION");

    public final StringPath color = createString("color");

    public final NumberPath<Integer> columnNumber = createNumber("columnNumber", Integer.class);

    public final StringPath dashboardModuleCompleteKey = createString("dashboardModuleCompleteKey");

    public final StringPath gadgetXml = createString("gadgetXml");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> portalpage = createNumber("portalpage", Long.class);

    public final StringPath portletId = createString("portletId");

    public final NumberPath<Integer> positionseq = createNumber("positionseq", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QPortletconfiguration> sysIdx158 = createPrimaryKey(id);

    public QPortletconfiguration(String variable) {
        super(QPortletconfiguration.class, forVariable(variable), "PUBLIC", "PORTLETCONFIGURATION");
        addMetadata();
    }

    public QPortletconfiguration(String variable, String schema, String table) {
        super(QPortletconfiguration.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPortletconfiguration(Path<? extends QPortletconfiguration> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "PORTLETCONFIGURATION");
        addMetadata();
    }

    public QPortletconfiguration(PathMetadata metadata) {
        super(QPortletconfiguration.class, metadata, "PUBLIC", "PORTLETCONFIGURATION");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(color, ColumnMetadata.named("COLOR").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(columnNumber, ColumnMetadata.named("COLUMN_NUMBER").withIndex(4).ofType(Types.INTEGER));
        addMetadata(dashboardModuleCompleteKey, ColumnMetadata.named("DASHBOARD_MODULE_COMPLETE_KEY").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(gadgetXml, ColumnMetadata.named("GADGET_XML").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.BIGINT).notNull());
        addMetadata(portalpage, ColumnMetadata.named("PORTALPAGE").withIndex(2).ofType(Types.BIGINT));
        addMetadata(portletId, ColumnMetadata.named("PORTLET_ID").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(positionseq, ColumnMetadata.named("POSITIONSEQ").withIndex(5).ofType(Types.INTEGER));
    }

}

