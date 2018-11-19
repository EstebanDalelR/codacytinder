package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzg;

final class ahp implements zzg {
    /* renamed from: a */
    private /* synthetic */ ahl f22956a;

    ahp(ahl ahl) {
        this.f22956a = ahl;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        synchronized (this.f22956a.f15275b) {
            this.f22956a.f15278e = null;
            if (this.f22956a.f15276c != null) {
                this.f22956a.f15276c = null;
            }
            this.f22956a.f15275b.notifyAll();
        }
    }
}
