package com.google.android.m4b.maps.p126z;

import com.google.android.m4b.maps.p125y.C5580q;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.m4b.maps.z.i */
final class C5601i {
    /* renamed from: a */
    private static final C5580q<C5600h> f20685a;

    /* renamed from: com.google.android.m4b.maps.z.i$1 */
    static class C68911 implements C5580q<C5600h> {
        C68911() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo5823a() {
            return new C6894j();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.i$2 */
    static class C68922 implements C5580q<C5600h> {
        C68922() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo5823a() {
            return new C6893a();
        }
    }

    /* renamed from: com.google.android.m4b.maps.z.i$a */
    static final class C6893a extends AtomicLong implements C5600h {
        private C6893a() {
        }

        /* renamed from: a */
        public final void mo5859a() {
            getAndIncrement();
        }

        /* renamed from: a */
        public final void mo5860a(long j) {
            getAndAdd(j);
        }
    }

    static {
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
        r0 = new com.google.android.m4b.maps.z.j;	 Catch:{ Throwable -> 0x000b }
        r0.<init>();	 Catch:{ Throwable -> 0x000b }
        r0 = new com.google.android.m4b.maps.z.i$1;	 Catch:{ Throwable -> 0x000b }
        r0.<init>();	 Catch:{ Throwable -> 0x000b }
        goto L_0x0010;
    L_0x000b:
        r0 = new com.google.android.m4b.maps.z.i$2;
        r0.<init>();
    L_0x0010:
        f20685a = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.z.i.<clinit>():void");
    }

    /* renamed from: a */
    public static C5600h m24441a() {
        return (C5600h) f20685a.mo5823a();
    }
}
