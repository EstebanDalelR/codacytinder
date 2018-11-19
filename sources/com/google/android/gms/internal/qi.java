package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class qi extends qk {
    /* renamed from: a */
    private /* synthetic */ long f29374a;
    /* renamed from: b */
    private /* synthetic */ PendingIntent f29375b;

    qi(qh qhVar, GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        this.f29374a = j;
        this.f29375b = pendingIntent;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35036a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34597a(this.f29374a, this.f29375b);
        a(Status.zzfni);
    }
}
