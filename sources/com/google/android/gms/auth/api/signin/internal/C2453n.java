package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ad;

/* renamed from: com.google.android.gms.auth.api.signin.internal.n */
public final class C2453n {
    /* renamed from: a */
    private static C2453n f7392a;
    /* renamed from: b */
    private C2457v f7393b;
    /* renamed from: c */
    private GoogleSignInAccount f7394c = this.f7393b.m8834a();
    /* renamed from: d */
    private GoogleSignInOptions f7395d = this.f7393b.m8837b();

    private C2453n(Context context) {
        this.f7393b = C2457v.m8829a(context);
    }

    /* renamed from: a */
    public static synchronized C2453n m8819a(@NonNull Context context) {
        C2453n b;
        synchronized (C2453n.class) {
            b = C2453n.m8820b(context.getApplicationContext());
        }
        return b;
    }

    /* renamed from: b */
    private static synchronized C2453n m8820b(Context context) {
        C2453n c2453n;
        synchronized (C2453n.class) {
            if (f7392a == null) {
                f7392a = new C2453n(context);
            }
            c2453n = f7392a;
        }
        return c2453n;
    }

    /* renamed from: a */
    public final synchronized void m8821a() {
        this.f7393b.m8839d();
        this.f7394c = null;
        this.f7395d = null;
    }

    /* renamed from: a */
    public final synchronized void m8822a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        C2457v c2457v = this.f7393b;
        ad.m9045a((Object) googleSignInAccount);
        ad.m9045a((Object) googleSignInOptions);
        c2457v.m8836a("defaultGoogleSignInAccount", googleSignInAccount.zzaba());
        c2457v.m8835a(googleSignInAccount, googleSignInOptions);
        this.f7394c = googleSignInAccount;
        this.f7395d = googleSignInOptions;
    }

    /* renamed from: b */
    public final synchronized GoogleSignInAccount m8823b() {
        return this.f7394c;
    }

    /* renamed from: c */
    public final synchronized GoogleSignInOptions m8824c() {
        return this.f7395d;
    }
}
