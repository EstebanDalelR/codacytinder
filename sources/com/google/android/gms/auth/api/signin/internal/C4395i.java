package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.i */
final class C4395i extends C4287a {
    /* renamed from: a */
    private /* synthetic */ C4447h f14570a;

    C4395i(C4447h c4447h) {
        this.f14570a = c4447h;
    }

    public final void zzi(Status status) throws RemoteException {
        this.f14570a.m14223a((Result) status);
    }
}
