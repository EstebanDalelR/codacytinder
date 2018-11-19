package com.facebook.ads.internal.p047k;

import android.content.Context;
import android.support.annotation.Nullable;
import java.io.File;

/* renamed from: com.facebook.ads.internal.k.v */
public class C1509v {
    @Nullable
    /* renamed from: a */
    public static final String m5305a(Context context, String str) {
        try {
            return C1509v.m5309b(context.getPackageManager().getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e) {
            C1502p.m5285a(e, context);
            return null;
        }
    }

    @android.support.annotation.Nullable
    /* renamed from: a */
    public static final java.lang.String m5306a(java.io.File r4) {
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
        r0 = "MD5";	 Catch:{ Exception -> 0x0028 }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ Exception -> 0x0028 }
        r1 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ Exception -> 0x0028 }
        r1 = new byte[r1];	 Catch:{ Exception -> 0x0028 }
        r2 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x0028 }
        r2.<init>(r4);	 Catch:{ Exception -> 0x0028 }
    L_0x000f:
        r4 = r2.read(r1);	 Catch:{ Exception -> 0x0028 }
        if (r4 <= 0) goto L_0x0019;	 Catch:{ Exception -> 0x0028 }
    L_0x0015:
        r3 = 0;	 Catch:{ Exception -> 0x0028 }
        r0.update(r1, r3, r4);	 Catch:{ Exception -> 0x0028 }
    L_0x0019:
        r3 = -1;	 Catch:{ Exception -> 0x0028 }
        if (r4 != r3) goto L_0x000f;	 Catch:{ Exception -> 0x0028 }
    L_0x001c:
        r2.close();	 Catch:{ Exception -> 0x0028 }
        r4 = r0.digest();	 Catch:{ Exception -> 0x0028 }
        r4 = com.facebook.ads.internal.p047k.C1509v.m5310b(r4);	 Catch:{ Exception -> 0x0028 }
        return r4;
    L_0x0028:
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.v.a(java.io.File):java.lang.String");
    }

    @android.support.annotation.Nullable
    /* renamed from: a */
    public static java.lang.String m5307a(java.lang.String r2) {
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
        r0 = "MD5";	 Catch:{ Exception -> 0x0015 }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ Exception -> 0x0015 }
        r1 = "utf-8";	 Catch:{ Exception -> 0x0015 }
        r2 = r2.getBytes(r1);	 Catch:{ Exception -> 0x0015 }
        r2 = r0.digest(r2);	 Catch:{ Exception -> 0x0015 }
        r2 = com.facebook.ads.internal.p047k.C1509v.m5310b(r2);	 Catch:{ Exception -> 0x0015 }
        return r2;
    L_0x0015:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.v.a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m5308a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bArr) {
            int i = (b >>> 4) & 15;
            int i2 = 0;
            while (true) {
                i = (i < 0 || i > 9) ? (i - 10) + 97 : i + 48;
                stringBuilder.append((char) i);
                i = b & 15;
                int i3 = i2 + 1;
                if (i2 >= 1) {
                    break;
                }
                i2 = i3;
            }
        }
        return stringBuilder.toString();
    }

    @Nullable
    /* renamed from: b */
    public static final String m5309b(String str) {
        return C1509v.m5306a(new File(str));
    }

    /* renamed from: b */
    private static final String m5310b(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bArr) {
            stringBuilder.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return stringBuilder.toString();
    }
}
