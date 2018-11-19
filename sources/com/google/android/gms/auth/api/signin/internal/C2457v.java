package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ad;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.gms.auth.api.signin.internal.v */
public final class C2457v {
    /* renamed from: a */
    private static final Lock f7398a = new ReentrantLock();
    /* renamed from: b */
    private static C2457v f7399b;
    /* renamed from: c */
    private final Lock f7400c = new ReentrantLock();
    /* renamed from: d */
    private final SharedPreferences f7401d;

    private C2457v(Context context) {
        this.f7401d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount m8828a(java.lang.String r3) {
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
        r2 = this;
        r0 = android.text.TextUtils.isEmpty(r3);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = "googleSignInAccount";
        r3 = com.google.android.gms.auth.api.signin.internal.C2457v.m8831b(r0, r3);
        r3 = r2.m8832c(r3);
        if (r3 == 0) goto L_0x0019;
    L_0x0014:
        r3 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.zzeu(r3);	 Catch:{ JSONException -> 0x0019 }
        return r3;
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.v.a(java.lang.String):com.google.android.gms.auth.api.signin.GoogleSignInAccount");
    }

    /* renamed from: a */
    public static C2457v m8829a(Context context) {
        ad.m9045a((Object) context);
        f7398a.lock();
        try {
            if (f7399b == null) {
                f7399b = new C2457v(context.getApplicationContext());
            }
            C2457v c2457v = f7399b;
            return c2457v;
        } finally {
            f7398a.unlock();
        }
    }

    /* renamed from: b */
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions m8830b(java.lang.String r3) {
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
        r2 = this;
        r0 = android.text.TextUtils.isEmpty(r3);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = "googleSignInOptions";
        r3 = com.google.android.gms.auth.api.signin.internal.C2457v.m8831b(r0, r3);
        r3 = r2.m8832c(r3);
        if (r3 == 0) goto L_0x0019;
    L_0x0014:
        r3 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zzev(r3);	 Catch:{ JSONException -> 0x0019 }
        return r3;
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.v.b(java.lang.String):com.google.android.gms.auth.api.signin.GoogleSignInOptions");
    }

    /* renamed from: b */
    private static String m8831b(String str, String str2) {
        String str3 = ":";
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + String.valueOf(str3).length()) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(str3);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: c */
    private final String m8832c(String str) {
        this.f7400c.lock();
        try {
            str = this.f7401d.getString(str, null);
            return str;
        } finally {
            this.f7400c.unlock();
        }
    }

    /* renamed from: d */
    private final void m8833d(String str) {
        this.f7400c.lock();
        try {
            this.f7401d.edit().remove(str).apply();
        } finally {
            this.f7400c.unlock();
        }
    }

    /* renamed from: a */
    public final GoogleSignInAccount m8834a() {
        return m8828a(m8832c("defaultGoogleSignInAccount"));
    }

    /* renamed from: a */
    final void m8835a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        ad.m9045a((Object) googleSignInAccount);
        ad.m9045a((Object) googleSignInOptions);
        String zzaba = googleSignInAccount.zzaba();
        m8836a(C2457v.m8831b("googleSignInAccount", zzaba), googleSignInAccount.zzabc());
        m8836a(C2457v.m8831b("googleSignInOptions", zzaba), googleSignInOptions.zzabg());
    }

    /* renamed from: a */
    protected final void m8836a(String str, String str2) {
        this.f7400c.lock();
        try {
            this.f7401d.edit().putString(str, str2).apply();
        } finally {
            this.f7400c.unlock();
        }
    }

    /* renamed from: b */
    public final GoogleSignInOptions m8837b() {
        return m8830b(m8832c("defaultGoogleSignInAccount"));
    }

    /* renamed from: c */
    public final void m8838c() {
        String c = m8832c("defaultGoogleSignInAccount");
        m8833d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c)) {
            m8833d(C2457v.m8831b("googleSignInAccount", c));
            m8833d(C2457v.m8831b("googleSignInOptions", c));
        }
    }

    /* renamed from: d */
    public final void m8839d() {
        this.f7400c.lock();
        try {
            this.f7401d.edit().clear().apply();
        } finally {
            this.f7400c.unlock();
        }
    }
}
