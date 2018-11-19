package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ad;

final class cm {
    /* renamed from: a */
    private final int f7530a;
    /* renamed from: b */
    private final ConnectionResult f7531b;

    cm(ConnectionResult connectionResult, int i) {
        ad.m9045a((Object) connectionResult);
        this.f7531b = connectionResult;
        this.f7530a = i;
    }

    /* renamed from: a */
    final int m9002a() {
        return this.f7530a;
    }

    /* renamed from: b */
    final ConnectionResult m9003b() {
        return this.f7531b;
    }
}
