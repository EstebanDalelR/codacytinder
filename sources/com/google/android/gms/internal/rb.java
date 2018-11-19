package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;

final class rb extends rc {
    /* renamed from: a */
    private /* synthetic */ PendingIntent f29391a;

    rb(qr qrVar, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        this.f29391a = pendingIntent;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35047a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34599a(this.f29391a, new rd(this));
    }
}
