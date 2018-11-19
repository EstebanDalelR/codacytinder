package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class mu extends mx<Status> {
    /* renamed from: a */
    private /* synthetic */ Credential f29176a;

    mu(mq mqVar, GoogleApiClient googleApiClient, Credential credential) {
        this.f29176a = credential;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ Result m34588a(Status status) {
        return status;
    }

    /* renamed from: a */
    protected final void mo7624a(Context context, zzawd zzawd) throws RemoteException {
        zzawd.zza(new mw(this), new zzavz(this.f29176a));
    }
}
