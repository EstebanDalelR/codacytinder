package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.common.api.internal.zzcl;
import com.google.android.gms.location.LocationListener;

final class rv implements zzcl<LocationListener> {
    /* renamed from: a */
    private /* synthetic */ Location f23431a;

    rv(ru ruVar, Location location) {
        this.f23431a = location;
    }

    public final void zzahz() {
    }

    public final /* synthetic */ void zzu(Object obj) {
        ((LocationListener) obj).onLocationChanged(this.f23431a);
    }
}
