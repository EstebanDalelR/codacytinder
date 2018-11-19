package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.bs;
import com.google.android.gms.common.api.internal.bt;
import com.google.android.gms.tasks.C4501b;

abstract class np extends bs<nl, Void> {
    /* renamed from: a */
    private C4501b<Void> f23413a;

    private np() {
    }

    /* renamed from: a */
    protected final /* synthetic */ void m27433a(zzb zzb, C4501b c4501b) throws RemoteException {
        nl nlVar = (nl) zzb;
        this.f23413a = c4501b;
        mo6895a((zzawn) nlVar.m());
    }

    /* renamed from: a */
    protected final void m27434a(Status status) {
        bt.a(status, null, this.f23413a);
    }

    /* renamed from: a */
    protected abstract void mo6895a(zzawn zzawn) throws RemoteException;
}
