package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.C3781a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.f */
final class C4446f extends C4397l<C3781a> {
    /* renamed from: a */
    final /* synthetic */ Context f14813a;
    /* renamed from: b */
    final /* synthetic */ GoogleSignInOptions f14814b;

    C4446f(GoogleApiClient googleApiClient, Context context, GoogleSignInOptions googleSignInOptions) {
        this.f14813a = context;
        this.f14814b = googleSignInOptions;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ Result mo3568a(Status status) {
        return new C3781a(null, status);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo4016a(zzb zzb) throws RemoteException {
        ((zzu) ((C4393d) zzb).m9098m()).zza(new C4394g(this), this.f14814b);
    }
}
