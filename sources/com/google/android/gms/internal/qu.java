package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class qu extends rc {
    /* renamed from: a */
    private /* synthetic */ boolean f29380a;

    qu(qr qrVar, GoogleApiClient googleApiClient, boolean z) {
        this.f29380a = z;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35040a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34609a(this.f29380a);
        a(Status.zzfni);
    }
}
