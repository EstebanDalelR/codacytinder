package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zzn;
import com.google.android.gms.location.zzag;

final class rh extends ri {
    /* renamed from: a */
    private /* synthetic */ zzag f29394a;

    rh(rf rfVar, GoogleApiClient googleApiClient, zzag zzag) {
        this.f29394a = zzag;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m35049a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34608a(this.f29394a, (zzn) this);
    }
}
