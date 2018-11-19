package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.k */
final class C4396k extends C4287a {
    /* renamed from: a */
    private /* synthetic */ C4448j f14571a;

    C4396k(C4448j c4448j) {
        this.f14571a = c4448j;
    }

    public final void zzj(Status status) throws RemoteException {
        this.f14571a.m14223a((Result) status);
    }
}
