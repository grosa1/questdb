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

package io.questdb.test.griffin.engine.functions.catalogue;

import io.questdb.test.AbstractGriffinTest;
import org.junit.Test;

public class PgGetPartKeyDefFunctionFactoryTest extends AbstractGriffinTest {

    @Test
    public void testPgGetPartKeyDefFunc() throws Exception {
        assertQuery(
                "pg_get_partkeydef\n" +
                        "\n",
                "select pg_get_partkeydef(0);",
                null,
                null,
                true,
                true
        );
    }

    @Test
    public void testPrefixedPgGetPartKeyDefFunc() throws Exception {
        assertQuery(
                "pg_get_partkeydef\n" +
                        "\n",
                "select pg_catalog.pg_get_partkeydef(0);",
                null,
                null,
                true,
                true
        );
    }
}