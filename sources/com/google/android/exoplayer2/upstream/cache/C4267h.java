package com.google.android.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.google.android.exoplayer2.upstream.cache.h */
public final class C4267h implements CacheEvictor, Comparator<C2280a> {
    /* renamed from: a */
    private final long f13817a;
    /* renamed from: b */
    private final TreeSet<C2280a> f13818b = new TreeSet(this);
    /* renamed from: c */
    private long f13819c;

    public void onCacheInitialized() {
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return m17074a((C2280a) obj, (C2280a) obj2);
    }

    public C4267h(long j) {
        this.f13817a = j;
    }

    public void onStartFile(Cache cache, String str, long j, long j2) {
        m17073a(cache, j2);
    }

    public void onSpanAdded(Cache cache, C2280a c2280a) {
        this.f13818b.add(c2280a);
        this.f13819c += c2280a.f6853c;
        m17073a(cache, 0);
    }

    public void onSpanRemoved(Cache cache, C2280a c2280a) {
        this.f13818b.remove(c2280a);
        this.f13819c -= c2280a.f6853c;
    }

    public void onSpanTouched(Cache cache, C2280a c2280a, C2280a c2280a2) {
        onSpanRemoved(cache, c2280a);
        onSpanAdded(cache, c2280a2);
    }

    /* renamed from: a */
    public int m17074a(C2280a c2280a, C2280a c2280a2) {
        if (c2280a.f6856f - c2280a2.f6856f == 0) {
            return c2280a.m8250a(c2280a2);
        }
        return c2280a.f6856f < c2280a2.f6856f ? -1 : true;
    }

    /* renamed from: a */
    private void m17073a(com.google.android.exoplayer2.upstream.cache.Cache r6, long r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r5 = this;
    L_0x0000:
        r0 = r5.f13819c;
        r2 = r0 + r7;
        r0 = r5.f13817a;
        r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r4 <= 0) goto L_0x001e;
    L_0x000a:
        r0 = r5.f13818b;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x001e;
    L_0x0012:
        r0 = r5.f13818b;	 Catch:{ CacheException -> 0x0000 }
        r0 = r0.first();	 Catch:{ CacheException -> 0x0000 }
        r0 = (com.google.android.exoplayer2.upstream.cache.C2280a) r0;	 Catch:{ CacheException -> 0x0000 }
        r6.removeSpan(r0);	 Catch:{ CacheException -> 0x0000 }
        goto L_0x0000;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.h.a(com.google.android.exoplayer2.upstream.cache.Cache, long):void");
    }
}
