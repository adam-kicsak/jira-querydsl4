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
 * QSequenceValueItem is a Querydsl query type for QSequenceValueItem
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSequenceValueItem extends com.querydsl.sql.RelationalPathBase<QSequenceValueItem> {

    private static final long serialVersionUID = -332804565;

    public static final QSequenceValueItem sequenceValueItem = new QSequenceValueItem("SEQUENCE_VALUE_ITEM");

    public final NumberPath<Long> seqId = createNumber("seqId", Long.class);

    public final StringPath seqName = createString("seqName");

    public final com.querydsl.sql.PrimaryKey<QSequenceValueItem> sysIdx186 = createPrimaryKey(seqName);

    public QSequenceValueItem(String variable) {
        super(QSequenceValueItem.class, forVariable(variable), "PUBLIC", "SEQUENCE_VALUE_ITEM");
        addMetadata();
    }

    public QSequenceValueItem(String variable, String schema, String table) {
        super(QSequenceValueItem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSequenceValueItem(Path<? extends QSequenceValueItem> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "SEQUENCE_VALUE_ITEM");
        addMetadata();
    }

    public QSequenceValueItem(PathMetadata metadata) {
        super(QSequenceValueItem.class, metadata, "PUBLIC", "SEQUENCE_VALUE_ITEM");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(seqId, ColumnMetadata.named("SEQ_ID").withIndex(2).ofType(Types.BIGINT));
        addMetadata(seqName, ColumnMetadata.named("SEQ_NAME").withIndex(1).ofType(Types.VARCHAR).withSize(2147483647).notNull());
    }

}

