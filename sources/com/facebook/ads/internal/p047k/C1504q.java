package com.facebook.ads.internal.p047k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;

/* renamed from: com.facebook.ads.internal.k.q */
public class C1504q {
    /* renamed from: a */
    private static final String f4168a = "q";

    /* renamed from: com.facebook.ads.internal.k.q$a */
    public enum C1503a {
        UNKNOWN(0),
        UNROOTED(1),
        ROOTED(2);
        
        /* renamed from: d */
        public final int f4167d;

        private C1503a(int i) {
            this.f4167d = i;
        }
    }

    /* renamed from: a */
    public static com.facebook.ads.internal.p047k.C1504q.C1503a m5290a() {
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
        r0 = com.facebook.ads.internal.p047k.C1504q.m5297c();	 Catch:{ Throwable -> 0x0020 }
        if (r0 != 0) goto L_0x0017;	 Catch:{ Throwable -> 0x0020 }
    L_0x0006:
        r0 = com.facebook.ads.internal.p047k.C1504q.m5294b();	 Catch:{ Throwable -> 0x0020 }
        if (r0 != 0) goto L_0x0017;	 Catch:{ Throwable -> 0x0020 }
    L_0x000c:
        r0 = "su";	 Catch:{ Throwable -> 0x0020 }
        r0 = com.facebook.ads.internal.p047k.C1504q.m5293a(r0);	 Catch:{ Throwable -> 0x0020 }
        if (r0 == 0) goto L_0x0015;	 Catch:{ Throwable -> 0x0020 }
    L_0x0014:
        goto L_0x0017;	 Catch:{ Throwable -> 0x0020 }
    L_0x0015:
        r0 = 0;	 Catch:{ Throwable -> 0x0020 }
        goto L_0x0018;	 Catch:{ Throwable -> 0x0020 }
    L_0x0017:
        r0 = 1;	 Catch:{ Throwable -> 0x0020 }
    L_0x0018:
        if (r0 == 0) goto L_0x001d;	 Catch:{ Throwable -> 0x0020 }
    L_0x001a:
        r0 = com.facebook.ads.internal.p047k.C1504q.C1503a.ROOTED;	 Catch:{ Throwable -> 0x0020 }
        return r0;	 Catch:{ Throwable -> 0x0020 }
    L_0x001d:
        r0 = com.facebook.ads.internal.p047k.C1504q.C1503a.UNROOTED;	 Catch:{ Throwable -> 0x0020 }
        return r0;
    L_0x0020:
        r0 = com.facebook.ads.internal.p047k.C1504q.C1503a.UNKNOWN;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.q.a():com.facebook.ads.internal.k.q$a");
    }

    /* renamed from: a */
    private static PublicKey m5291a(Signature signature) {
        return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signature.toByteArray())).getPublicKey();
    }

    /* renamed from: a */
    public static boolean m5292a(Context context) {
        return C1504q.m5295b(context) && ap.m5212c(context);
    }

    /* renamed from: a */
    private static boolean m5293a(String str) {
        for (String file : System.getenv("PATH").split(":")) {
            File file2 = new File(file);
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        for (File name : listFiles) {
                            if (name.getName().equals(str)) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m5294b() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* renamed from: b */
    public static boolean m5295b(Context context) {
        if (context == null) {
            Log.v(f4168a, "Invalid context in screen interactive check, assuming interactive.");
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            return VERSION.SDK_INT >= 20 ? powerManager.isInteractive() : powerManager.isScreenOn();
        } catch (Exception e) {
            Log.e(f4168a, "Exception in screen interactive check, assuming interactive.", e);
            C1502p.m5285a(e, context);
            return true;
        }
    }

    @android.support.annotation.Nullable
    /* renamed from: c */
    public static java.lang.String m5296c(android.content.Context r0) {
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
        r0 = com.facebook.ads.internal.p047k.C1504q.m5298d(r0);	 Catch:{ Exception -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.q.c(android.content.Context):java.lang.String");
    }

    /* renamed from: c */
    private static boolean m5297c() {
        return new File("/system/app/Superuser.apk").exists();
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: d */
    private static String m5298d(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Signature a : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
            stringBuilder.append(C1509v.m5308a(MessageDigest.getInstance("SHA1").digest(C1504q.m5291a(a).getEncoded())));
            stringBuilder.append(";");
        }
        return stringBuilder.toString();
    }
}
