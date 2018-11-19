package com.google.android.gms.internal;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.be;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

final class qx extends rc {
    /* renamed from: a */
    private /* synthetic */ LocationRequest f29382a;
    /* renamed from: b */
    private /* synthetic */ LocationListener f29383b;
    /* renamed from: d */
    private /* synthetic */ Looper f29384d;

    qx(qr qrVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        this.f29382a = locationRequest;
        this.f29383b = locationListener;
        this.f29384d = looper;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35043a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34606a(this.f29382a, be.a(this.f29383b, sg.m20169a(this.f29384d), LocationListener.class.getSimpleName()), new rd(this));
    }
}
