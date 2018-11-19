package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.widget.FrameLayout;

@zzzv
public class aiq {
    /* renamed from: a */
    private zzla f15310a;
    /* renamed from: b */
    private final Object f15311b = new Object();
    /* renamed from: c */
    private final aik f15312c;
    /* renamed from: d */
    private final aij f15313d;
    /* renamed from: e */
    private final akm f15314e;
    /* renamed from: f */
    private final aot f15315f;
    /* renamed from: g */
    private final ca f15316g;
    /* renamed from: h */
    private final atw f15317h;
    /* renamed from: i */
    private final aou f15318i;

    @VisibleForTesting
    /* renamed from: com.google.android.gms.internal.aiq$a */
    abstract class C4466a<T> {
        /* renamed from: a */
        private /* synthetic */ aiq f15309a;

        C4466a(aiq aiq) {
            this.f15309a = aiq;
        }

        @Nullable
        /* renamed from: a */
        protected abstract T mo4251a() throws RemoteException;

        @Nullable
        /* renamed from: a */
        protected abstract T mo4252a(zzla zzla) throws RemoteException;

        @Nullable
        /* renamed from: b */
        protected final T m19199b() {
            zzla a = this.f15309a.m19207b();
            if (a == null) {
                hx.m19916e("ClientApi class cannot be loaded.");
                return null;
            }
            try {
                return mo4252a(a);
            } catch (Throwable e) {
                hx.m19914c("Cannot invoke local loader using ClientApi class", e);
                return null;
            }
        }

        @Nullable
        /* renamed from: c */
        protected final T m19200c() {
            try {
                return mo4251a();
            } catch (Throwable e) {
                hx.m19914c("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public aiq(aik aik, aij aij, akm akm, aot aot, ca caVar, atw atw, aou aou) {
        this.f15312c = aik;
        this.f15313d = aij;
        this.f15314e = akm;
        this.f15315f = aot;
        this.f15316g = caVar;
        this.f15317h = atw;
        this.f15318i = aou;
    }

    @Nullable
    /* renamed from: a */
    private static zzla m19201a() {
        try {
            Object newInstance = aiq.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return ajs.asInterface((IBinder) newInstance);
            }
            hx.m19916e("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Throwable e) {
            hx.m19914c("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    static <T> T m19203a(Context context, boolean z, C4466a<T> c4466a) {
        T b;
        if (!z) {
            aja.m19216a();
            if (!hn.m19877c(context)) {
                hx.m19911b("Google Play Services is not available");
                z = true;
            }
        }
        aja.m19216a();
        int e = hn.m19879e(context);
        aja.m19216a();
        if (e > hn.m19878d(context)) {
            z = true;
        }
        if (z) {
            b = c4466a.m19199b();
            if (b == null) {
                return c4466a.m19200c();
            }
        }
        b = c4466a.m19200c();
        if (b == null) {
            b = c4466a.m19199b();
        }
        return b;
    }

    /* renamed from: a */
    private static void m19204a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        aja.m19216a().m19884a(context, null, "gmob-apps", bundle, true);
    }

    @Nullable
    /* renamed from: b */
    private final zzla m19207b() {
        zzla zzla;
        synchronized (this.f15311b) {
            if (this.f15310a == null) {
                this.f15310a = m19201a();
            }
            zzla = this.f15310a;
        }
        return zzla;
    }

    /* renamed from: a */
    public final zzkn m19213a(Context context, String str, zzux zzux) {
        return (zzkn) m19203a(context, false, new aiu(this, context, str, zzux));
    }

    /* renamed from: a */
    public final zzpu m19214a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzpu) m19203a(context, false, new aiw(this, frameLayout, frameLayout2, context));
    }

    @Nullable
    /* renamed from: a */
    public final zzxe m19215a(Activity activity) {
        String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
        Intent intent = activity.getIntent();
        boolean z = false;
        if (intent.hasExtra(str)) {
            z = intent.getBooleanExtra(str, false);
        } else {
            hx.m19913c("useClientJar flag not found in activity intent extras.");
        }
        return (zzxe) m19203a((Context) activity, z, new aiz(this, activity));
    }
}
