/*******************************************************************************
 *     ___                  _   ____  ____
 *    / _ \ _   _  ___  ___| |_|  _ \| __ )
 *   | | | | | | |/ _ \/ __| __| | | |  _ \
 *   | |_| | |_| |  __/\__ \ |_| |_| | |_) |
 *    \__\_\\__,_|\___||___/\__|____/|____/
 *
 *  Copyright (c) 2014-2019 Appsicle
 *  Copyright (c) 2019-2023 QuestDB
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 ******************************************************************************/

package io.questdb.cairo;

import io.questdb.std.ObjList;

public interface CairoSecurityContext {

    default void authorizeTableRead(TableToken tableToken) {
    }

    default void authorizeTableWrite(TableToken tableToken) {
    }

    default void authorizeAlterTableAddColumn(TableToken tableToken) {
    }

    default void authorizeAlterTableDropColumn(TableToken tableToken, ObjList<CharSequence> columnNames) {
    }

    default void authorizeTableCreate(CharSequence tableName) {
    }

    default void authorizeTableDrop() {
    }

    default void authorizeTableRename(TableToken tableToken) {
    }

    default void authorizeTableLock() {
    }

    default void authorizeDatabaseSnapshot() {
    }

    default void authorizeCopyCancel(CairoSecurityContext securityContext) {
    }

    default void authorizeCopyExecute() {
    }

    default void authorizeDatabaseSnapshot() {
    }

    default void authorizeTableCreate() {
    }

    default void authorizeTableDrop(TableToken tableToken) {
    }

    default void authorizeTableLock(TableToken tableToken) {
    }

    default void authorizeTableManage(TableToken tableToken) {
    }

    default void authorizeTableRead(TableToken tableToken) {
    }

    default void authorizeTableRename(TableToken tableToken) {
    }

    default void authorizeTableTruncate(TableToken tableToken) {
    }

    default void authorizeTableWrite(TableToken tableToken) {
    }
}
