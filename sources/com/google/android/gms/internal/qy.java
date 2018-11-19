package com.google.android.gms.internal;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.be;
import com.google.android.gms.location.C4485e;
import com.google.android.gms.location.LocationRequest;

final class qy extends rc {
    /* renamed from: a */
    private /* synthetic */ LocationRequest f29385a;
    /* renamed from: b */
    private /* synthetic */ C4485e f29386b;
    /* renamed from: d */
    private /* synthetic */ Looper f29387d;

    qy(qr qrVar, GoogleApiClient googleApiClient, LocationRequest locationRequest, C4485e c4485e, Looper looper) {
        this.f29385a = locationRequest;
        this.f29386b = c4485e;
        this.f29387d = looper;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35044a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34603a(zzcfo.zza(this.f29385a), be.a(this.f29386b, sg.m20169a(this.f29387d), C4485e.class.getSimpleName()), new rd(this));
    }
}
