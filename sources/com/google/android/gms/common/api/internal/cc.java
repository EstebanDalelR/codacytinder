package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.tasks.C4501b;

public abstract class cc<A extends zzb, L> {
    /* renamed from: a */
    private final bd<L> f7515a;

    protected cc(bd<L> bdVar) {
        this.f7515a = bdVar;
    }

    /* renamed from: a */
    public final bd<L> m8989a() {
        return this.f7515a;
    }

    /* renamed from: a */
    protected abstract void m8990a(A a, C4501b<Boolean> c4501b) throws RemoteException;
}
