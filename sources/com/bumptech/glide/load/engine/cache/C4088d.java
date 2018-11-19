package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.cache.d */
public final class C4088d extends DiskLruCacheFactory {

    /* renamed from: com.bumptech.glide.load.engine.cache.d$1 */
    class C30421 implements CacheDirectoryGetter {
        /* renamed from: a */
        final /* synthetic */ Context f9486a;
        /* renamed from: b */
        final /* synthetic */ String f9487b;

        C30421(Context context, String str) {
            this.f9486a = context;
            this.f9487b = str;
        }

        public File getCacheDirectory() {
            File cacheDir = this.f9486a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f9487b != null ? new File(cacheDir, this.f9487b) : cacheDir;
        }
    }

    public C4088d(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C4088d(Context context, String str, int i) {
        super(new C30421(context, str), i);
    }
}
