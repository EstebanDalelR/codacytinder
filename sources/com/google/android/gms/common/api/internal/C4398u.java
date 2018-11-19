package com.google.android.gms.common.api.internal;

import android.support.annotation.BinderThread;
import com.google.android.gms.internal.tj;
import com.google.android.gms.internal.zzcxq;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.u */
final class C4398u extends tj {
    /* renamed from: a */
    private final WeakReference<C3803n> f14580a;

    C4398u(C3803n c3803n) {
        this.f14580a = new WeakReference(c3803n);
    }

    @BinderThread
    public final void zzb(zzcxq zzcxq) {
        C3803n c3803n = (C3803n) this.f14580a.get();
        if (c3803n != null) {
            c3803n.f12006a.m17177a(new C3809v(this, c3803n, c3803n, zzcxq));
        }
    }
}
