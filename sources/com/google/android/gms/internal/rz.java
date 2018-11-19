package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.zzn;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.location.LocationSettingsResult;

final class rz extends ro {
    /* renamed from: a */
    private zzn<LocationSettingsResult> f27056a;

    public rz(zzn<LocationSettingsResult> zzn) {
        ad.b(zzn != null, "listener can't be null.");
        this.f27056a = zzn;
    }

    public final void zza(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.f27056a.setResult(locationSettingsResult);
        this.f27056a = null;
    }
}
