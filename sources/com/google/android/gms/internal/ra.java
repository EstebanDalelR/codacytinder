package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.be;
import com.google.android.gms.location.LocationListener;

final class ra extends rc {
    /* renamed from: a */
    private /* synthetic */ LocationListener f29390a;

    ra(qr qrVar, GoogleApiClient googleApiClient, LocationListener locationListener) {
        this.f29390a = locationListener;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35046a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34601a(be.a(this.f29390a, LocationListener.class.getSimpleName()), new rd(this));
    }
}
