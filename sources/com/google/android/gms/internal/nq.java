package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.C2441e;
import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ck;

abstract class nq extends ck<ProxyResult, ng> {
    public nq(GoogleApiClient googleApiClient) {
        super(C2441e.f7379a, googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ Result m34035a(Status status) {
        return new nv(status);
    }

    /* renamed from: a */
    protected abstract void mo7625a(Context context, zzawl zzawl) throws RemoteException;

    /* renamed from: a */
    protected final /* synthetic */ void m34037a(zzb zzb) throws RemoteException {
        ng ngVar = (ng) zzb;
        mo7625a(ngVar.j(), (zzawl) ngVar.m());
    }

    public final /* synthetic */ void setResult(Object obj) {
        super.a((ProxyResult) obj);
    }
}
