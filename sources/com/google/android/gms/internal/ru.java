package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.common.api.internal.bb;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.ab;

final class ru extends ab {
    /* renamed from: a */
    private final bb<LocationListener> f27053a;

    ru(bb<LocationListener> bbVar) {
        this.f27053a = bbVar;
    }

    /* renamed from: a */
    public final synchronized void m31652a() {
        this.f27053a.a();
    }

    public final synchronized void onLocationChanged(Location location) {
        this.f27053a.a(new rv(this, location));
    }
}
