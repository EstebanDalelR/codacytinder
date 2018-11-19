package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.h */
final class C4447h extends C4397l<Status> {
    C4447h(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ Result mo3568a(Status status) {
        return status;
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo4016a(zzb zzb) throws RemoteException {
        C4393d c4393d = (C4393d) zzb;
        ((zzu) c4393d.m9098m()).zzb(new C4395i(this), c4393d.mo3771c());
    }
}
