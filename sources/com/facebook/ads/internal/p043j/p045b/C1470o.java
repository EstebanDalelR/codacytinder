package com.facebook.ads.internal.p043j.p045b;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.tinder.api.ManagerWebServices;
import java.io.File;

/* renamed from: com.facebook.ads.internal.j.b.o */
final class C1470o {
    /* renamed from: a */
    public static File m5147a(Context context) {
        return new File(C1470o.m5148a(context, true), "video-cache");
    }

    /* renamed from: a */
    private static java.io.File m5148a(android.content.Context r2, boolean r3) {
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
        r0 = android.os.Environment.getExternalStorageState();	 Catch:{ NullPointerException -> 0x0005 }
        goto L_0x0007;
    L_0x0005:
        r0 = "";
    L_0x0007:
        if (r3 == 0) goto L_0x0016;
    L_0x0009:
        r3 = "mounted";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0016;
    L_0x0011:
        r3 = com.facebook.ads.internal.p043j.p045b.C1470o.m5149b(r2);
        goto L_0x0017;
    L_0x0016:
        r3 = 0;
    L_0x0017:
        if (r3 != 0) goto L_0x001d;
    L_0x0019:
        r3 = r2.getCacheDir();
    L_0x001d:
        if (r3 != 0) goto L_0x0059;
    L_0x001f:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r0 = "/data/data/";
        r3.append(r0);
        r2 = r2.getPackageName();
        r3.append(r2);
        r2 = "/cache/";
        r3.append(r2);
        r2 = r3.toString();
        r3 = "ProxyCache";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Can't define system cache directory! '";
        r0.append(r1);
        r0.append(r2);
        r1 = "%s' will be used.";
        r0.append(r1);
        r0 = r0.toString();
        android.util.Log.w(r3, r0);
        r3 = new java.io.File;
        r3.<init>(r2);
    L_0x0059:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.j.b.o.a(android.content.Context, boolean):java.io.File");
    }

    /* renamed from: b */
    private static File m5149b(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), ManagerWebServices.FB_DATA), context.getPackageName()), "cache");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        Log.w("ProxyCache", "Unable to create external cache directory");
        return null;
    }
}
