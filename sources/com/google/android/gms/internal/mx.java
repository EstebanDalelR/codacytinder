package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.C2422a;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ck;

abstract class mx<R extends Result> extends ck<R, mz> {
    mx(GoogleApiClient googleApiClient) {
        super(C2422a.f7346d, googleApiClient);
    }

    /* renamed from: a */
    protected abstract void mo7624a(Context context, zzawd zzawd) throws DeadObjectException, RemoteException;

    /* renamed from: a */
    protected final /* synthetic */ void m34022a(zzb zzb) throws RemoteException {
        mz mzVar = (mz) zzb;
        mo7624a(mzVar.j(), (zzawd) mzVar.m());
    }

    public final /* synthetic */ void setResult(Object obj) {
        super.a((Result) obj);
    }
}
