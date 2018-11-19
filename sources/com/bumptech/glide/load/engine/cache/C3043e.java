package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener;
import com.bumptech.glide.p026d.C0983e;

/* renamed from: com.bumptech.glide.load.engine.cache.e */
public class C3043e extends C0983e<Key, Resource<?>> implements MemoryCache {
    /* renamed from: a */
    private ResourceRemovedListener f9488a;

    public /* synthetic */ Resource put(Key key, Resource resource) {
        return (Resource) super.m3399b(key, resource);
    }

    public /* synthetic */ Resource remove(Key key) {
        return (Resource) super.m3400c(key);
    }

    public C3043e(int i) {
        super(i);
    }

    public void setResourceRemovedListener(ResourceRemovedListener resourceRemovedListener) {
        this.f9488a = resourceRemovedListener;
    }

    /* renamed from: a */
    protected void m11995a(Key key, Resource<?> resource) {
        if (this.f9488a != null) {
            this.f9488a.onResourceRemoved(resource);
        }
    }

    /* renamed from: a */
    protected int m11993a(Resource<?> resource) {
        return resource.getSize();
    }

    @SuppressLint({"InlinedApi"})
    public void trimMemory(int i) {
        if (i >= 60) {
            clearMemory();
        } else if (i >= 40) {
            m3396a(getCurrentSize() / 2);
        }
    }
}
