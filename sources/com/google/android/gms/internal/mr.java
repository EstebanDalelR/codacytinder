package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class mr extends mx<CredentialRequestResult> {
    /* renamed from: a */
    private /* synthetic */ CredentialRequest f29174a;

    mr(mq mqVar, GoogleApiClient googleApiClient, CredentialRequest credentialRequest) {
        this.f29174a = credentialRequest;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ Result m34584a(Status status) {
        return mp.m31613a(status);
    }

    /* renamed from: a */
    protected final void mo7624a(Context context, zzawd zzawd) throws RemoteException {
        zzawd.zza(new ms(this), this.f29174a);
    }
}
