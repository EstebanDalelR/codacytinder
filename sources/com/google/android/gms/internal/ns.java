package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;

final class ns extends nq {
    /* renamed from: a */
    private /* synthetic */ ProxyRequest f29177a;

    ns(nr nrVar, GoogleApiClient googleApiClient, ProxyRequest proxyRequest) {
        this.f29177a = proxyRequest;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final void mo7625a(Context context, zzawl zzawl) throws RemoteException {
        zzawl.zza(new nt(this), this.f29177a);
    }
}
