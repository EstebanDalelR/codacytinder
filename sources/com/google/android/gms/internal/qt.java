package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.be;
import com.google.android.gms.location.C4485e;

final class qt extends rc {
    /* renamed from: a */
    private /* synthetic */ C4485e f29379a;

    qt(qr qrVar, GoogleApiClient googleApiClient, C4485e c4485e) {
        this.f29379a = c4485e;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35039a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34610b(be.a(this.f29379a, C4485e.class.getSimpleName()), new rd(this));
    }
}
