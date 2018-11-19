package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.ad;

public final class bb<L> {
    /* renamed from: a */
    private final bc f7487a;
    /* renamed from: b */
    private volatile L f7488b;
    /* renamed from: c */
    private final bd<L> f7489c;

    bb(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.f7487a = new bc(this, looper);
        this.f7488b = ad.m9046a((Object) l, (Object) "Listener must not be null");
        this.f7489c = new bd(l, ad.m9047a(str));
    }

    /* renamed from: a */
    public final void m8971a() {
        this.f7488b = null;
    }

    /* renamed from: a */
    public final void m8972a(zzcl<? super L> zzcl) {
        ad.m9046a((Object) zzcl, (Object) "Notifier must not be null");
        this.f7487a.sendMessage(this.f7487a.obtainMessage(1, zzcl));
    }

    @NonNull
    /* renamed from: b */
    public final bd<L> m8973b() {
        return this.f7489c;
    }

    /* renamed from: b */
    final void m8974b(zzcl<? super L> zzcl) {
        Object obj = this.f7488b;
        if (obj == null) {
            zzcl.zzahz();
            return;
        }
        try {
            zzcl.zzu(obj);
        } catch (RuntimeException e) {
            zzcl.zzahz();
            throw e;
        }
    }
}
