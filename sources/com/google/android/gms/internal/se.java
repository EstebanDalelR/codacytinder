package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzn;
import com.google.android.gms.location.C4486f.C8038a;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

final class se extends C8038a<LocationSettingsResult> {
    /* renamed from: a */
    private /* synthetic */ LocationSettingsRequest f29179a;
    /* renamed from: b */
    private /* synthetic */ String f29180b = null;

    se(sd sdVar, GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest, String str) {
        this.f29179a = locationSettingsRequest;
        super(googleApiClient);
    }

    /* renamed from: a */
    public final /* synthetic */ Result m34613a(Status status) {
        return new LocationSettingsResult(status);
    }

    /* renamed from: a */
    protected final /* synthetic */ void m34614a(zzb zzb) throws RemoteException {
        ((rw) zzb).m34607a(this.f29179a, (zzn) this, this.f29180b);
    }
}
