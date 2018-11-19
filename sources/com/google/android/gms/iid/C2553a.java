package com.google.android.gms.iid;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.util.C2880a;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Map;

/* renamed from: com.google.android.gms.iid.a */
public class C2553a {
    /* renamed from: a */
    private static Map<String, C2553a> f7756a = new C2880a();
    /* renamed from: c */
    private static C2565n f7757c;
    /* renamed from: d */
    private static C2562k f7758d;
    /* renamed from: h */
    private static String f7759h;
    /* renamed from: b */
    private Context f7760b;
    /* renamed from: e */
    private KeyPair f7761e;
    /* renamed from: f */
    private String f7762f = "";
    /* renamed from: g */
    private long f7763g;

    private C2553a(Context context, String str, Bundle bundle) {
        this.f7760b = context.getApplicationContext();
        this.f7762f = str;
    }

    /* renamed from: a */
    static int m9291a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
            stringBuilder.append("Never happens: can't find own package ");
            stringBuilder.append(valueOf);
            Log.w("InstanceID", stringBuilder.toString());
            return 0;
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public static synchronized C2553a m9292a(Context context, Bundle bundle) {
        C2553a c2553a;
        synchronized (C2553a.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            if (string == null) {
                string = "";
            }
            context = context.getApplicationContext();
            if (f7757c == null) {
                f7757c = new C2565n(context);
                f7758d = new C2562k(context);
            }
            f7759h = Integer.toString(C2553a.m9291a(context));
            c2553a = (C2553a) f7756a.get(string);
            if (c2553a == null) {
                c2553a = new C2553a(context, string, bundle);
                f7756a.put(string, c2553a);
            }
        }
        return c2553a;
    }

    /* renamed from: a */
    static java.lang.String m9293a(java.security.KeyPair r3) {
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
        r3 = r3.getPublic();
        r3 = r3.getEncoded();
        r0 = "SHA1";	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r3 = r0.digest(r3);	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r0 = 0;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r1 = r3[r0];	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r1 = r1 & 15;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r1 = r1 + 112;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r1 = (byte) r1;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r3[r0] = r1;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r1 = 8;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r2 = 11;	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        r3 = android.util.Base64.encodeToString(r3, r0, r1, r2);	 Catch:{ NoSuchAlgorithmException -> 0x0025 }
        return r3;
    L_0x0025:
        r3 = "InstanceID";
        r0 = "Unexpected error, device missing required algorithms";
        android.util.Log.w(r3, r0);
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.a.a(java.security.KeyPair):java.lang.String");
    }

    /* renamed from: a */
    static String m9294a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    static String m9295b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
            stringBuilder.append("Never happens: can't find own package ");
            stringBuilder.append(valueOf);
            Log.w("InstanceID", stringBuilder.toString());
            return null;
        }
    }

    /* renamed from: c */
    public static C2553a m9296c(Context context) {
        return C2553a.m9292a(context, null);
    }

    /* renamed from: d */
    public static C2565n m9297d() {
        return f7757c;
    }

    /* renamed from: e */
    private final KeyPair m9298e() {
        if (this.f7761e == null) {
            this.f7761e = f7757c.m9340d(this.f7762f);
        }
        if (this.f7761e == null) {
            this.f7763g = System.currentTimeMillis();
            this.f7761e = f7757c.m9333a(this.f7762f, this.f7763g);
        }
        return this.f7761e;
    }

    /* renamed from: a */
    public String m9299a() {
        return C2553a.m9293a(m9298e());
    }

    /* renamed from: a */
    public final void m9300a(String str, String str2, Bundle bundle) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        f7757c.m9338b(this.f7762f, str, str2);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("sender", str);
        if (str2 != null) {
            bundle.putString(QueryParams.SCOPE, str2);
        }
        bundle.putString("subscription", str);
        bundle.putString("delete", "1");
        bundle.putString("X-delete", "1");
        bundle.putString("subtype", "".equals(this.f7762f) ? str : this.f7762f);
        str2 = "X-subtype";
        if (!"".equals(this.f7762f)) {
            str = this.f7762f;
        }
        bundle.putString(str2, str);
        C2562k.m9312a(f7758d.m9325a(bundle, m9298e()));
    }

    /* renamed from: b */
    public String m9301b(String str, String str2, Bundle bundle) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        Object obj;
        String c;
        String a = f7757c.m9330a("appVersion");
        Object obj2 = null;
        Object obj3 = 1;
        if (a != null) {
            if (a.equals(f7759h)) {
                a = f7757c.m9330a("lastToken");
                if (a != null) {
                    if ((System.currentTimeMillis() / 1000) - Long.valueOf(Long.parseLong(a)).longValue() <= 604800) {
                        obj = null;
                        a = obj == null ? null : f7757c.m9332a(this.f7762f, str, str2);
                        if (a != null) {
                            return a;
                        }
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        if (bundle.getString("ttl") != null) {
                            obj3 = null;
                        }
                        if ("jwt".equals(bundle.getString("type"))) {
                            obj2 = obj3;
                        }
                        c = m9303c(str, str2, bundle);
                        if (!(c == null || r1 == null)) {
                            f7757c.m9334a(this.f7762f, str, str2, c, f7759h);
                        }
                        return c;
                    }
                }
            }
        }
        obj = 1;
        if (obj == null) {
        }
        if (a != null) {
            return a;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle.getString("ttl") != null) {
            obj3 = null;
        }
        if ("jwt".equals(bundle.getString("type"))) {
            obj2 = obj3;
        }
        c = m9303c(str, str2, bundle);
        f7757c.m9334a(this.f7762f, str, str2, c, f7759h);
        return c;
    }

    /* renamed from: b */
    public void m9302b() throws IOException {
        m9300a("*", "*", null);
        m9304c();
    }

    /* renamed from: c */
    public final String m9303c(String str, String str2, Bundle bundle) throws IOException {
        if (str2 != null) {
            bundle.putString(QueryParams.SCOPE, str2);
        }
        bundle.putString("sender", str);
        str2 = "".equals(this.f7762f) ? str : this.f7762f;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str2);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str2);
        }
        return C2562k.m9312a(f7758d.m9325a(bundle, m9298e()));
    }

    /* renamed from: c */
    public final void m9304c() {
        this.f7763g = 0;
        f7757c.m9337b(String.valueOf(this.f7762f).concat("|"));
        this.f7761e = null;
    }
}
