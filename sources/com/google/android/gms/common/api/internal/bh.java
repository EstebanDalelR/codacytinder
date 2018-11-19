package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.tasks.C4501b;

public abstract class bh<A extends zzb, L> {
    /* renamed from: a */
    private final bb<L> f7497a;

    protected bh(bb<L> bbVar) {
        this.f7497a = bbVar;
    }

    /* renamed from: a */
    public final bd<L> m8978a() {
        return this.f7497a.m8973b();
    }

    /* renamed from: a */
    protected abstract void m8979a(A a, C4501b<Void> c4501b) throws RemoteException;

    /* renamed from: b */
    public final void m8980b() {
        this.f7497a.m8971a();
    }
}
