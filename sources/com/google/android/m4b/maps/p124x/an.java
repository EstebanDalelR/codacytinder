package com.google.android.m4b.maps.p124x;

import android.content.Context;
import android.util.Log;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p107g.C5397f;
import com.google.android.m4b.maps.p107g.C5398g;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p114n.C7701d;

/* renamed from: com.google.android.m4b.maps.x.an */
public class an {
    /* renamed from: a */
    private static Context f20547a;
    /* renamed from: b */
    private static C5537e f20548b;

    /* renamed from: a */
    public static C5537e m24121a(Context context) {
        C5462v.m23767a((Object) context);
        if (f20548b != null) {
            return f20548b;
        }
        int a = C5398g.m23576a(context);
        if (a != 0) {
            throw new C5397f(a);
        }
        Log.i(an.class.getSimpleName(), "Making Creator statically");
        f20548b = (C5537e) an.m24123a(an.m24122a());
        try {
            C5537e c5537e = f20548b;
            if (f20547a == null) {
                f20547a = context.getApplicationContext();
            }
            c5537e.mo7250a(C7701d.m33407a(f20547a.getResources()), C5398g.f20336a);
            return f20548b;
        } catch (Context context2) {
            throw new RuntimeRemoteException(context2);
        }
    }

    /* renamed from: a */
    private static Class<?> m24122a() {
        try {
            return Class.forName("com.google.android.m4b.maps.x.b");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static <T> T m24123a(java.lang.Class<?> r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = r3.newInstance();	 Catch:{ InstantiationException -> 0x0025, IllegalAccessException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = new java.lang.IllegalStateException;
        r1 = "Unable to call the default constructor of ";
        r3 = r3.getName();
        r3 = java.lang.String.valueOf(r3);
        r2 = r3.length();
        if (r2 == 0) goto L_0x001c;
    L_0x0017:
        r3 = r1.concat(r3);
        goto L_0x0021;
    L_0x001c:
        r3 = new java.lang.String;
        r3.<init>(r1);
    L_0x0021:
        r0.<init>(r3);
        throw r0;
    L_0x0025:
        r0 = new java.lang.IllegalStateException;
        r1 = "Unable to instantiate the dynamic class ";
        r3 = r3.getName();
        r3 = java.lang.String.valueOf(r3);
        r2 = r3.length();
        if (r2 == 0) goto L_0x003c;
    L_0x0037:
        r3 = r1.concat(r3);
        goto L_0x0041;
    L_0x003c:
        r3 = new java.lang.String;
        r3.<init>(r1);
    L_0x0041:
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.x.an.a(java.lang.Class):T");
    }
}
