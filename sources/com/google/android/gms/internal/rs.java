package com.google.android.gms.internal;

import com.google.android.gms.common.api.internal.zzcl;
import com.google.android.gms.location.C4485e;
import com.google.android.gms.location.LocationAvailability;

final class rs implements zzcl<C4485e> {
    /* renamed from: a */
    private /* synthetic */ LocationAvailability f23430a;

    rs(rq rqVar, LocationAvailability locationAvailability) {
        this.f23430a = locationAvailability;
    }

    public final void zzahz() {
    }

    public final /* synthetic */ void zzu(Object obj) {
        ((C4485e) obj).onLocationAvailability(this.f23430a);
    }
}
