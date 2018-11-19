package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.dynamic.C4296b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.ajw;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: com.google.android.gms.ads.internal.v */
public final class C4277v extends ajw {
    /* renamed from: b */
    private static final Object f13922b = new Object();
    @Nullable
    /* renamed from: c */
    private static C4277v f13923c;
    /* renamed from: a */
    private final Context f13924a;
    /* renamed from: d */
    private final Object f13925d = new Object();
    /* renamed from: e */
    private boolean f13926e;
    /* renamed from: f */
    private zzakd f13927f;

    private C4277v(Context context, zzakd zzakd) {
        this.f13924a = context;
        this.f13927f = zzakd;
        this.f13926e = false;
    }

    /* renamed from: a */
    public static C4277v m17156a(Context context, zzakd zzakd) {
        C4277v c4277v;
        synchronized (f13922b) {
            if (f13923c == null) {
                f13923c = new C4277v(context.getApplicationContext(), zzakd);
            }
            c4277v = f13923c;
        }
        return c4277v;
    }

    public final void initialize() {
        synchronized (f13922b) {
            if (this.f13926e) {
                ec.e("Mobile ads is initialized already.");
                return;
            }
            this.f13926e = true;
            alo.a(this.f13924a);
            ar.m8652i().a(this.f13924a, this.f13927f);
            ar.m8653j().a(this.f13924a);
        }
    }

    public final void setAppMuted(boolean z) {
        ar.m8641B().a(z);
    }

    public final void setAppVolume(float f) {
        ar.m8641B().a(f);
    }

    public final void zza(String str, IObjectWrapper iObjectWrapper) {
        if (!TextUtils.isEmpty(str)) {
            alo.a(this.f13924a);
            int booleanValue = ((Boolean) aja.f().a(alo.cc)).booleanValue() | ((Boolean) aja.f().a(alo.as)).booleanValue();
            Runnable runnable = null;
            if (((Boolean) aja.f().a(alo.as)).booleanValue()) {
                booleanValue = 1;
                runnable = new C2407w(this, (Runnable) C4296b.m17262a(iObjectWrapper));
            }
            if (booleanValue != 0) {
                ar.m8655l().m8692a(this.f13924a, this.f13927f, str, runnable);
            }
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            ec.c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) C4296b.m17262a(iObjectWrapper);
        if (context == null) {
            ec.c("Context is null. Failed to open debug menu.");
            return;
        }
        gd gdVar = new gd(context);
        gdVar.a(str);
        gdVar.b(this.f13927f.zzcv);
        gdVar.a();
    }

    public final float zzdn() {
        return ar.m8641B().a();
    }

    public final boolean zzdo() {
        return ar.m8641B().b();
    }

    public final void zzu(String str) {
        alo.a(this.f13924a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) aja.f().a(alo.cc)).booleanValue()) {
                ar.m8655l().m8692a(this.f13924a, this.f13927f, str, null);
            }
        }
    }
}
