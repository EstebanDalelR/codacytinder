package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

final class qz extends rc {
    /* renamed from: a */
    private /* synthetic */ LocationRequest f29388a;
    /* renamed from: b */
    private /* synthetic */ PendingIntent f29389b;

    qz(qr qrVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        this.f29388a = locationRequest;
        this.f29389b = pendingIntent;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35045a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34605a(this.f29388a, this.f29389b, new rd(this));
    }
}
