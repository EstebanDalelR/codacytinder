package com.google.android.gms.internal;

import com.google.android.gms.common.api.internal.zzcl;
import com.google.android.gms.location.C4485e;
import com.google.android.gms.location.LocationResult;

final class rr implements zzcl<C4485e> {
    /* renamed from: a */
    private /* synthetic */ LocationResult f23429a;

    rr(rq rqVar, LocationResult locationResult) {
        this.f23429a = locationResult;
    }

    public final void zzahz() {
    }

    public final /* synthetic */ void zzu(Object obj) {
        ((C4485e) obj).onLocationResult(this.f23429a);
    }
}
