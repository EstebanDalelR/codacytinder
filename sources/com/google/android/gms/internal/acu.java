package com.google.android.gms.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class acu {
    /* renamed from: a */
    private static final acu f15021a = new acu();
    /* renamed from: b */
    private final acy f15022b;
    /* renamed from: c */
    private final ConcurrentMap<Class<?>, acx<?>> f15023c = new ConcurrentHashMap();

    private acu() {
        String[] strArr = new String[]{"com.google.protobuf.AndroidProto3SchemaFactory"};
        acy acy = null;
        for (int i = 0; i <= 0; i++) {
            acy = m18883a(strArr[0]);
            if (acy != null) {
                break;
            }
        }
        if (acy == null) {
            acy = new ach();
        }
        this.f15022b = acy;
    }

    /* renamed from: a */
    public static acu m18882a() {
        return f15021a;
    }

    /* renamed from: a */
    private static com.google.android.gms.internal.acy m18883a(java.lang.String r2) {
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
        r2 = java.lang.Class.forName(r2);	 Catch:{ Throwable -> 0x0014 }
        r0 = 0;	 Catch:{ Throwable -> 0x0014 }
        r1 = new java.lang.Class[r0];	 Catch:{ Throwable -> 0x0014 }
        r2 = r2.getConstructor(r1);	 Catch:{ Throwable -> 0x0014 }
        r0 = new java.lang.Object[r0];	 Catch:{ Throwable -> 0x0014 }
        r2 = r2.newInstance(r0);	 Catch:{ Throwable -> 0x0014 }
        r2 = (com.google.android.gms.internal.acy) r2;	 Catch:{ Throwable -> 0x0014 }
        return r2;
    L_0x0014:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.acu.a(java.lang.String):com.google.android.gms.internal.acy");
    }

    /* renamed from: a */
    public final <T> acx<T> m18884a(Class<T> cls) {
        abx.m18860a(cls, "messageType");
        acx<T> acx = (acx) this.f15023c.get(cls);
        if (acx != null) {
            return acx;
        }
        acx = this.f15022b.mo4200a(cls);
        abx.m18860a(cls, "messageType");
        abx.m18860a(acx, "schema");
        acx<T> acx2 = (acx) this.f15023c.putIfAbsent(cls, acx);
        return acx2 != null ? acx2 : acx;
    }
}
