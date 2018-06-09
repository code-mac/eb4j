/*
 * Copyright (c) 2018 Apehat.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.apehat.store;

/**
 * @author hanpengfei
 * @since 1.0
 */
public interface CacheCommander<T> extends StoreCommander<T> {

    void cache(T value);

    void flushTo(Store<T> store);

    void flushTo(Accessor<T> accessor);

    void clear();
}
