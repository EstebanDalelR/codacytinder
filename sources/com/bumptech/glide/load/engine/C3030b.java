package com.bumptech.glide.load.engine;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.C1001a.C0998a;
import com.bumptech.glide.load.engine.C3048g.C1030a;
import com.bumptech.glide.load.engine.cache.C3040a;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.p026d.C0982d;
import com.bumptech.glide.p026d.C0987h;
import com.bumptech.glide.provider.DataLoadProvider;
import com.bumptech.glide.request.ResourceCallback;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bumptech.glide.load.engine.b */
public class C3030b implements ResourceRemovedListener, C1024d, C1030a {
    /* renamed from: a */
    private final Map<Key, C4087c> f9443a;
    /* renamed from: b */
    private final C1029f f9444b;
    /* renamed from: c */
    private final MemoryCache f9445c;
    /* renamed from: d */
    private final C1002a f9446d;
    /* renamed from: e */
    private final Map<Key, WeakReference<C3048g<?>>> f9447e;
    /* renamed from: f */
    private final C1033i f9448f;
    /* renamed from: g */
    private final C3029b f9449g;
    /* renamed from: h */
    private ReferenceQueue<C3048g<?>> f9450h;

    /* renamed from: com.bumptech.glide.load.engine.b$a */
    static class C1002a {
        /* renamed from: a */
        private final ExecutorService f2803a;
        /* renamed from: b */
        private final ExecutorService f2804b;
        /* renamed from: c */
        private final C1024d f2805c;

        public C1002a(ExecutorService executorService, ExecutorService executorService2, C1024d c1024d) {
            this.f2803a = executorService;
            this.f2804b = executorService2;
            this.f2805c = c1024d;
        }

        /* renamed from: a */
        public C4087c m3523a(Key key, boolean z) {
            return new C4087c(key, this.f2803a, this.f2804b, z, this.f2805c);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b$c */
    public static class C1003c {
        /* renamed from: a */
        private final C4087c f2806a;
        /* renamed from: b */
        private final ResourceCallback f2807b;

        public C1003c(ResourceCallback resourceCallback, C4087c c4087c) {
            this.f2807b = resourceCallback;
            this.f2806a = c4087c;
        }

        /* renamed from: a */
        public void m3524a() {
            this.f2806a.m15956b(this.f2807b);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b$d */
    private static class C1004d implements IdleHandler {
        /* renamed from: a */
        private final Map<Key, WeakReference<C3048g<?>>> f2808a;
        /* renamed from: b */
        private final ReferenceQueue<C3048g<?>> f2809b;

        public C1004d(Map<Key, WeakReference<C3048g<?>>> map, ReferenceQueue<C3048g<?>> referenceQueue) {
            this.f2808a = map;
            this.f2809b = referenceQueue;
        }

        public boolean queueIdle() {
            C1005e c1005e = (C1005e) this.f2809b.poll();
            if (c1005e != null) {
                this.f2808a.remove(c1005e.f2810a);
            }
            return true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b$e */
    private static class C1005e extends WeakReference<C3048g<?>> {
        /* renamed from: a */
        private final Key f2810a;

        public C1005e(Key key, C3048g<?> c3048g, ReferenceQueue<? super C3048g<?>> referenceQueue) {
            super(c3048g, referenceQueue);
            this.f2810a = key;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.b$b */
    private static class C3029b implements C0998a {
        /* renamed from: a */
        private final Factory f9441a;
        /* renamed from: b */
        private volatile DiskCache f9442b;

        public C3029b(Factory factory) {
            this.f9441a = factory;
        }

        /* renamed from: a */
        public DiskCache mo1275a() {
            if (this.f9442b == null) {
                synchronized (this) {
                    if (this.f9442b == null) {
                        this.f9442b = this.f9441a.build();
                    }
                    if (this.f9442b == null) {
                        this.f9442b = new C3040a();
                    }
                }
            }
            return this.f9442b;
        }
    }

    public C3030b(MemoryCache memoryCache, Factory factory, ExecutorService executorService, ExecutorService executorService2) {
        this(memoryCache, factory, executorService, executorService2, null, null, null, null, null);
    }

    C3030b(MemoryCache memoryCache, Factory factory, ExecutorService executorService, ExecutorService executorService2, Map<Key, C4087c> map, C1029f c1029f, Map<Key, WeakReference<C3048g<?>>> map2, C1002a c1002a, C1033i c1033i) {
        this.f9445c = memoryCache;
        this.f9449g = new C3029b(factory);
        if (map2 == null) {
            map2 = new HashMap();
        }
        this.f9447e = map2;
        if (c1029f == null) {
            c1029f = new C1029f();
        }
        this.f9444b = c1029f;
        if (map == null) {
            map = new HashMap();
        }
        this.f9443a = map;
        if (c1002a == null) {
            c1002a = new C1002a(executorService, executorService2, this);
        }
        this.f9446d = c1002a;
        if (c1033i == null) {
            c1033i = new C1033i();
        }
        this.f9448f = c1033i;
        memoryCache.setResourceRemovedListener(this);
    }

    /* renamed from: a */
    public <T, Z, R> C1003c m11945a(Key key, int i, int i2, DataFetcher<T> dataFetcher, DataLoadProvider<T, Z> dataLoadProvider, Transformation<Z> transformation, ResourceTranscoder<Z, R> resourceTranscoder, Priority priority, boolean z, DiskCacheStrategy diskCacheStrategy, ResourceCallback resourceCallback) {
        boolean z2 = z;
        ResourceCallback resourceCallback2 = resourceCallback;
        C0987h.m3411a();
        long a = C0982d.m3393a();
        Key a2 = this.f9444b.m3565a(dataFetcher.getId(), key, i, i2, dataLoadProvider.getCacheDecoder(), dataLoadProvider.getSourceDecoder(), transformation, dataLoadProvider.getEncoder(), resourceTranscoder, dataLoadProvider.getSourceEncoder());
        Resource b = m11944b(a2, z2);
        if (b != null) {
            resourceCallback2.onResourceReady(b);
            if (Log.isLoggable("Engine", 2)) {
                C3030b.m11943a("Loaded resource from cache", a, a2);
            }
            return null;
        }
        b = m11941a(a2, z2);
        if (b != null) {
            resourceCallback2.onResourceReady(b);
            if (Log.isLoggable("Engine", 2)) {
                C3030b.m11943a("Loaded resource from active resources", a, a2);
            }
            return null;
        }
        C4087c c4087c = (C4087c) r0.f9443a.get(a2);
        if (c4087c != null) {
            c4087c.m15954a(resourceCallback2);
            if (Log.isLoggable("Engine", 2)) {
                C3030b.m11943a("Added to existing load", a, a2);
            }
            return new C1003c(resourceCallback2, c4087c);
        }
        C4087c a3 = r0.f9446d.m3523a(a2, z2);
        EngineRunnable engineRunnable = new EngineRunnable(a3, new C1001a(a2, i, i2, dataFetcher, dataLoadProvider, transformation, resourceTranscoder, r0.f9449g, diskCacheStrategy, priority), priority);
        r0.f9443a.put(a2, a3);
        a3.m15954a(resourceCallback2);
        a3.m15953a(engineRunnable);
        if (Log.isLoggable("Engine", 2)) {
            C3030b.m11943a("Started new load", a, a2);
        }
        return new C1003c(resourceCallback2, a3);
    }

    /* renamed from: a */
    private static void m11943a(String str, long j, Key key) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(C0982d.m3392a(j));
        stringBuilder.append("ms, key: ");
        stringBuilder.append(key);
        Log.v("Engine", stringBuilder.toString());
    }

    /* renamed from: a */
    private C3048g<?> m11941a(Key key, boolean z) {
        C3048g<?> c3048g = null;
        if (!z) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.f9447e.get(key);
        if (weakReference != null) {
            c3048g = (C3048g) weakReference.get();
            if (c3048g != null) {
                c3048g.m12002b();
            } else {
                this.f9447e.remove(key);
            }
        }
        return c3048g;
    }

    /* renamed from: b */
    private C3048g<?> m11944b(Key key, boolean z) {
        if (!z) {
            return null;
        }
        z = m11940a(key);
        if (z) {
            z.m12002b();
            this.f9447e.put(key, new C1005e(key, z, m11942a()));
        }
        return z;
    }

    /* renamed from: a */
    private C3048g<?> m11940a(Key key) {
        key = this.f9445c.remove(key);
        if (key == null) {
            return null;
        }
        if (key instanceof C3048g) {
            return (C3048g) key;
        }
        return new C3048g(key, true);
    }

    /* renamed from: a */
    public void m11947a(Resource resource) {
        C0987h.m3411a();
        if (resource instanceof C3048g) {
            ((C3048g) resource).m12003c();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: a */
    public void mo1276a(Key key, C3048g<?> c3048g) {
        C0987h.m3411a();
        if (c3048g != null) {
            c3048g.m12000a(key, this);
            if (c3048g.m12001a()) {
                this.f9447e.put(key, new C1005e(key, c3048g, m11942a()));
            }
        }
        this.f9443a.remove(key);
    }

    /* renamed from: a */
    public void mo1277a(C4087c c4087c, Key key) {
        C0987h.m3411a();
        if (c4087c.equals((C4087c) this.f9443a.get(key)) != null) {
            this.f9443a.remove(key);
        }
    }

    public void onResourceRemoved(Resource<?> resource) {
        C0987h.m3411a();
        this.f9448f.m3567a(resource);
    }

    /* renamed from: b */
    public void mo1278b(Key key, C3048g c3048g) {
        C0987h.m3411a();
        this.f9447e.remove(key);
        if (c3048g.m12001a()) {
            this.f9445c.put(key, c3048g);
        } else {
            this.f9448f.m3567a(c3048g);
        }
    }

    /* renamed from: a */
    private ReferenceQueue<C3048g<?>> m11942a() {
        if (this.f9450h == null) {
            this.f9450h = new ReferenceQueue();
            Looper.myQueue().addIdleHandler(new C1004d(this.f9447e, this.f9450h));
        }
        return this.f9450h;
    }
}
