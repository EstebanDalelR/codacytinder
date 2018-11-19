package com.google.android.gms.internal;

import com.google.android.gms.common.api.internal.bb;
import com.google.android.gms.location.C4485e;
import com.google.android.gms.location.C6287z;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

final class rq extends C6287z {
    /* renamed from: a */
    private final bb<C4485e> f27052a;

    rq(bb<C4485e> bbVar) {
        this.f27052a = bbVar;
    }

    /* renamed from: a */
    public final synchronized void m31651a() {
        this.f27052a.a();
    }

    public final void onLocationAvailability(LocationAvailability locationAvailability) {
        this.f27052a.a(new rs(this, locationAvailability));
    }

    public final void onLocationResult(LocationResult locationResult) {
        this.f27052a.a(new rr(this, locationResult));
    }
}
