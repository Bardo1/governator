/*
 * Copyright 2012 Netflix, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.netflix.governator.lifecycle.mocks;

import com.netflix.governator.lifecycle.AssetLoader;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleAssetLoader implements AssetLoader
{
    public final AtomicInteger  loadedCount = new AtomicInteger(0);
    public final AtomicInteger  unloadedCount = new AtomicInteger(0);

    @Override
    public boolean appliesTo(Object obj, String name)
    {
        return true;
    }

    @Override
    public void loadAsset(String name) throws Exception
    {
        loadedCount.incrementAndGet();
    }

    @Override
    public void unloadAsset(String name) throws Exception
    {
        unloadedCount.incrementAndGet();
    }

    @Override
    public <T> T getValue(Class<T> clazz) throws Exception
    {
        return null;
    }
}
