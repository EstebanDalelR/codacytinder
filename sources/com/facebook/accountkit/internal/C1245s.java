package com.facebook.accountkit.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Base64;

/* renamed from: com.facebook.accountkit.internal.s */
public class C1245s {
    @Nullable
    /* renamed from: a */
    public static String m4450a(Context context, String str) {
        return C1245s.m4451a(context, str, 0);
    }

    @Nullable
    /* renamed from: a */
    public static String m4451a(Context context, String str, int i) {
        context = C1245s.m4452b(context, str);
        if (context == null) {
            return null;
        }
        return Base64.encodeToString(context, i);
    }

    @android.support.annotation.Nullable
    /* renamed from: b */
    private static byte[] m4452b(android.content.Context r2, java.lang.String r3) {
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
        r2 = r2.getPackageManager();
        r0 = 64;
        r1 = 0;
        r2 = r2.getPackageInfo(r3, r0);	 Catch:{ NameNotFoundException -> 0x0045 }
        r0 = "SHA-256";	 Catch:{ NoSuchAlgorithmException -> 0x0044 }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0044 }
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r3);
        r3 = " ";
        r1.append(r3);
        r2 = r2.signatures;
        r3 = 0;
        r2 = r2[r3];
        r2 = r2.toCharsString();
        r1.append(r2);
        r2 = r1.toString();
        r2 = r2.trim();
        r3 = "US-ASCII";
        r3 = java.nio.charset.Charset.forName(r3);
        r2 = r2.getBytes(r3);
        r0.update(r2);
        r2 = r0.digest();
        return r2;
    L_0x0044:
        return r1;
    L_0x0045:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.s.b(android.content.Context, java.lang.String):byte[]");
    }
}
