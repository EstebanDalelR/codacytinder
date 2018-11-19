package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.j */
final class C4448j extends C4397l<Status> {
    C4448j(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ Result mo3568a(Status status) {
        return status;
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo4016a(zzb zzb) throws RemoteException {
        C4393d c4393d = (C4393d) zzb;
        ((zzu) c4393d.m9098m()).zzc(new C4396k(this), c4393d.mo3771c());
    }
}
