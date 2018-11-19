package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.be;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

final class qs extends rc {
    /* renamed from: a */
    private /* synthetic */ LocationRequest f29377a;
    /* renamed from: b */
    private /* synthetic */ LocationListener f29378b;

    qs(qr qrVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        this.f29377a = locationRequest;
        this.f29378b = locationListener;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35038a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34606a(this.f29377a, be.a(this.f29378b, sg.m20168a(), LocationListener.class.getSimpleName()), new rd(this));
    }
}
