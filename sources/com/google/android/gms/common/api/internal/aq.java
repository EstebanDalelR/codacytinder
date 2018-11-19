package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

final class aq implements Runnable {
    /* renamed from: a */
    private /* synthetic */ ConnectionResult f7478a;
    /* renamed from: b */
    private /* synthetic */ an f7479b;

    aq(an anVar, ConnectionResult connectionResult) {
        this.f7479b = anVar;
        this.f7478a = connectionResult;
    }

    public final void run() {
        this.f7479b.onConnectionFailed(this.f7478a);
    }
}
