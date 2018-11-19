package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import java.io.File;

public class DiskLruCacheFactory implements Factory {
    /* renamed from: a */
    private final int f9478a;
    /* renamed from: b */
    private final CacheDirectoryGetter f9479b;

    public interface CacheDirectoryGetter {
        File getCacheDirectory();
    }

    public DiskLruCacheFactory(CacheDirectoryGetter cacheDirectoryGetter, int i) {
        this.f9478a = i;
        this.f9479b = cacheDirectoryGetter;
    }

    public DiskCache build() {
        File cacheDirectory = this.f9479b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.mkdirs() || (cacheDirectory.exists() && cacheDirectory.isDirectory())) {
            return C3041c.m11991a(cacheDirectory, this.f9478a);
        }
        return null;
    }
}
