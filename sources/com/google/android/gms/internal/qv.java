package com.google.android.gms.internal;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class qv extends rc {
    /* renamed from: a */
    private /* synthetic */ Location f29381a;

    qv(qr qrVar, GoogleApiClient googleApiClient, Location location) {
        this.f29381a = location;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35041a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34600a(this.f29381a);
        a(Status.zzfni);
    }
}
