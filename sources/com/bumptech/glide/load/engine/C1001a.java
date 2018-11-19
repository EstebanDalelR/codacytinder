package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.DiskCache.Writer;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.p026d.C0982d;
import com.bumptech.glide.provider.DataLoadProvider;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.engine.a */
class C1001a<A, T, Z> {
    /* renamed from: a */
    private static final C0999b f2790a = new C0999b();
    /* renamed from: b */
    private final C3045e f2791b;
    /* renamed from: c */
    private final int f2792c;
    /* renamed from: d */
    private final int f2793d;
    /* renamed from: e */
    private final DataFetcher<A> f2794e;
    /* renamed from: f */
    private final DataLoadProvider<A, T> f2795f;
    /* renamed from: g */
    private final Transformation<T> f2796g;
    /* renamed from: h */
    private final ResourceTranscoder<T, Z> f2797h;
    /* renamed from: i */
    private final C0998a f2798i;
    /* renamed from: j */
    private final DiskCacheStrategy f2799j;
    /* renamed from: k */
    private final Priority f2800k;
    /* renamed from: l */
    private final C0999b f2801l;
    /* renamed from: m */
    private volatile boolean f2802m;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    interface C0998a {
        /* renamed from: a */
        DiskCache mo1275a();
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    static class C0999b {
        C0999b() {
        }

        /* renamed from: a */
        public OutputStream m3508a(File file) throws FileNotFoundException {
            return new BufferedOutputStream(new FileOutputStream(file));
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    class C3028c<DataType> implements Writer {
        /* renamed from: a */
        final /* synthetic */ C1001a f9438a;
        /* renamed from: b */
        private final Encoder<DataType> f9439b;
        /* renamed from: c */
        private final DataType f9440c;

        public C3028c(C1001a c1001a, Encoder<DataType> encoder, DataType dataType) {
            this.f9438a = c1001a;
            this.f9439b = encoder;
            this.f9440c = dataType;
        }

        public boolean write(java.io.File r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = 0;
            r1 = r4.f9438a;	 Catch:{ FileNotFoundException -> 0x0025 }
            r1 = r1.f2801l;	 Catch:{ FileNotFoundException -> 0x0025 }
            r5 = r1.m3508a(r5);	 Catch:{ FileNotFoundException -> 0x0025 }
            r0 = r4.f9439b;	 Catch:{ FileNotFoundException -> 0x001e, all -> 0x0019 }
            r1 = r4.f9440c;	 Catch:{ FileNotFoundException -> 0x001e, all -> 0x0019 }
            r0 = r0.encode(r1, r5);	 Catch:{ FileNotFoundException -> 0x001e, all -> 0x0019 }
            if (r5 == 0) goto L_0x003c;
        L_0x0015:
            r5.close();	 Catch:{ IOException -> 0x003c }
            goto L_0x003c;
        L_0x0019:
            r0 = move-exception;
            r3 = r0;
            r0 = r5;
            r5 = r3;
            goto L_0x003d;
        L_0x001e:
            r0 = move-exception;
            r3 = r0;
            r0 = r5;
            r5 = r3;
            goto L_0x0026;
        L_0x0023:
            r5 = move-exception;
            goto L_0x003d;
        L_0x0025:
            r5 = move-exception;
        L_0x0026:
            r1 = "DecodeJob";	 Catch:{ all -> 0x0023 }
            r2 = 3;	 Catch:{ all -> 0x0023 }
            r1 = android.util.Log.isLoggable(r1, r2);	 Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0036;	 Catch:{ all -> 0x0023 }
        L_0x002f:
            r1 = "DecodeJob";	 Catch:{ all -> 0x0023 }
            r2 = "Failed to find file to write to disk cache";	 Catch:{ all -> 0x0023 }
            android.util.Log.d(r1, r2, r5);	 Catch:{ all -> 0x0023 }
        L_0x0036:
            if (r0 == 0) goto L_0x003b;
        L_0x0038:
            r0.close();	 Catch:{ IOException -> 0x003b }
        L_0x003b:
            r0 = 0;
        L_0x003c:
            return r0;
        L_0x003d:
            if (r0 == 0) goto L_0x0042;
        L_0x003f:
            r0.close();	 Catch:{ IOException -> 0x0042 }
        L_0x0042:
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.a.c.write(java.io.File):boolean");
        }
    }

    public C1001a(C3045e c3045e, int i, int i2, DataFetcher<A> dataFetcher, DataLoadProvider<A, T> dataLoadProvider, Transformation<T> transformation, ResourceTranscoder<T, Z> resourceTranscoder, C0998a c0998a, DiskCacheStrategy diskCacheStrategy, Priority priority) {
        this(c3045e, i, i2, dataFetcher, dataLoadProvider, transformation, resourceTranscoder, c0998a, diskCacheStrategy, priority, f2790a);
    }

    C1001a(C3045e c3045e, int i, int i2, DataFetcher<A> dataFetcher, DataLoadProvider<A, T> dataLoadProvider, Transformation<T> transformation, ResourceTranscoder<T, Z> resourceTranscoder, C0998a c0998a, DiskCacheStrategy diskCacheStrategy, Priority priority, C0999b c0999b) {
        this.f2791b = c3045e;
        this.f2792c = i;
        this.f2793d = i2;
        this.f2794e = dataFetcher;
        this.f2795f = dataLoadProvider;
        this.f2796g = transformation;
        this.f2797h = resourceTranscoder;
        this.f2798i = c0998a;
        this.f2799j = diskCacheStrategy;
        this.f2800k = priority;
        this.f2801l = c0999b;
    }

    /* renamed from: a */
    public Resource<Z> m3519a() throws Exception {
        if (!this.f2799j.cacheResult()) {
            return null;
        }
        long a = C0982d.m3393a();
        Resource a2 = m3509a(this.f2791b);
        if (Log.isLoggable("DecodeJob", 2)) {
            m3513a("Decoded transformed from cache", a);
        }
        a = C0982d.m3393a();
        Resource<Z> d = m3517d(a2);
        if (Log.isLoggable("DecodeJob", 2)) {
            m3513a("Transcoded transformed from cache", a);
        }
        return d;
    }

    /* renamed from: b */
    public Resource<Z> m3520b() throws Exception {
        if (!this.f2799j.cacheSource()) {
            return null;
        }
        long a = C0982d.m3393a();
        Resource a2 = m3509a(this.f2791b.m11999a());
        if (Log.isLoggable("DecodeJob", 2)) {
            m3513a("Decoded source from cache", a);
        }
        return m3510a(a2);
    }

    /* renamed from: c */
    public Resource<Z> m3521c() throws Exception {
        return m3510a(m3518e());
    }

    /* renamed from: d */
    public void m3522d() {
        this.f2802m = true;
        this.f2794e.cancel();
    }

    /* renamed from: a */
    private Resource<Z> m3510a(Resource<T> resource) {
        long a = C0982d.m3393a();
        Resource c = m3516c(resource);
        if (Log.isLoggable("DecodeJob", 2)) {
            m3513a("Transformed resource from source", a);
        }
        m3515b(c);
        a = C0982d.m3393a();
        resource = m3517d(c);
        if (Log.isLoggable("DecodeJob", 2)) {
            m3513a("Transcoded transformed from source", a);
        }
        return resource;
    }

    /* renamed from: b */
    private void m3515b(Resource<T> resource) {
        if (resource != null) {
            if (this.f2799j.cacheResult()) {
                long a = C0982d.m3393a();
                this.f2798i.mo1275a().put(this.f2791b, new C3028c(this, this.f2795f.getEncoder(), resource));
                if (Log.isLoggable("DecodeJob", 2) != null) {
                    m3513a("Wrote transformed from source to cache", a);
                }
            }
        }
    }

    /* renamed from: e */
    private Resource<T> m3518e() throws Exception {
        try {
            long a = C0982d.m3393a();
            Object loadData = this.f2794e.loadData(this.f2800k);
            if (Log.isLoggable("DecodeJob", 2)) {
                m3513a("Fetched data", a);
            }
            if (this.f2802m) {
                return null;
            }
            Resource<T> a2 = m3511a(loadData);
            this.f2794e.cleanup();
            return a2;
        } finally {
            this.f2794e.cleanup();
        }
    }

    /* renamed from: a */
    private Resource<T> m3511a(A a) throws IOException {
        if (this.f2799j.cacheSource()) {
            return m3514b((Object) a);
        }
        long a2 = C0982d.m3393a();
        a = this.f2795f.getSourceDecoder().decode(a, this.f2792c, this.f2793d);
        if (!Log.isLoggable("DecodeJob", 2)) {
            return a;
        }
        m3513a("Decoded from source", a2);
        return a;
    }

    /* renamed from: b */
    private Resource<T> m3514b(A a) throws IOException {
        long a2 = C0982d.m3393a();
        this.f2798i.mo1275a().put(this.f2791b.m11999a(), new C3028c(this, this.f2795f.getSourceEncoder(), a));
        if (Log.isLoggable("DecodeJob", 2) != null) {
            m3513a("Wrote source to cache", a2);
        }
        a2 = C0982d.m3393a();
        a = m3509a(this.f2791b.m11999a());
        if (Log.isLoggable("DecodeJob", 2) && a != null) {
            m3513a("Decoded source from cache", a2);
        }
        return a;
    }

    /* renamed from: a */
    private Resource<T> m3509a(Key key) throws IOException {
        File file = this.f2798i.mo1275a().get(key);
        if (file == null) {
            return null;
        }
        try {
            Resource<T> decode = this.f2795f.getCacheDecoder().decode(file, this.f2792c, this.f2793d);
            if (decode == null) {
            }
            return decode;
        } finally {
            this.f2798i.mo1275a().delete(key);
        }
    }

    /* renamed from: c */
    private Resource<T> m3516c(Resource<T> resource) {
        if (resource == null) {
            return null;
        }
        Resource<T> transform = this.f2796g.transform(resource, this.f2792c, this.f2793d);
        if (!resource.equals(transform)) {
            resource.recycle();
        }
        return transform;
    }

    /* renamed from: d */
    private Resource<Z> m3517d(Resource<T> resource) {
        return resource == null ? null : this.f2797h.transcode(resource);
    }

    /* renamed from: a */
    private void m3513a(String str, long j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(C0982d.m3392a(j));
        stringBuilder.append(", key: ");
        stringBuilder.append(this.f2791b);
        Log.v("DecodeJob", stringBuilder.toString());
    }
}
