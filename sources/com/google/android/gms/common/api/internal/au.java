package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

final class au implements Runnable {
    /* renamed from: a */
    private /* synthetic */ ConnectionResult f7481a;
    /* renamed from: b */
    private /* synthetic */ at f7482b;

    au(at atVar, ConnectionResult connectionResult) {
        this.f7482b = atVar;
        this.f7481a = connectionResult;
    }

    public final void run() {
        if (this.f7481a.isSuccess()) {
            this.f7482b.f11920f = true;
            if (this.f7482b.f11916b.zzaay()) {
                this.f7482b.m14269a();
                return;
            } else {
                this.f7482b.f11916b.zza(null, Collections.emptySet());
                return;
            }
        }
        ((an) this.f7482b.f11915a.f7471m.get(this.f7482b.f11917c)).onConnectionFailed(this.f7481a);
    }
}
