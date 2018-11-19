package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class qj extends qk {
    /* renamed from: a */
    private /* synthetic */ PendingIntent f29376a;

    qj(qh qhVar, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        this.f29376a = pendingIntent;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35037a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34598a(this.f29376a);
        a(Status.zzfni);
    }
}
