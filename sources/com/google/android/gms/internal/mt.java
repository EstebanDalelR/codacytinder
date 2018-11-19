package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class mt extends mx<Status> {
    /* renamed from: a */
    private /* synthetic */ Credential f29175a;

    mt(mq mqVar, GoogleApiClient googleApiClient, Credential credential) {
        this.f29175a = credential;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ Result m34586a(Status status) {
        return status;
    }

    /* renamed from: a */
    protected final void mo7624a(Context context, zzawd zzawd) throws RemoteException {
        zzawd.zza(new mw(this), new zzawf(this.f29175a));
    }
}
