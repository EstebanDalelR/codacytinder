package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zzn;
import com.google.android.gms.location.GeofencingRequest;

final class rg extends ri {
    /* renamed from: a */
    private /* synthetic */ GeofencingRequest f29392a;
    /* renamed from: b */
    private /* synthetic */ PendingIntent f29393b;

    rg(rf rfVar, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.f29392a = geofencingRequest;
        this.f29393b = pendingIntent;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35048a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34604a(this.f29392a, this.f29393b, (zzn) this);
    }
}
