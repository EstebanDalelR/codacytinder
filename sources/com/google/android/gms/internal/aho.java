package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.zzf;

final class aho implements zzf {
    /* renamed from: a */
    private /* synthetic */ ahl f22955a;

    aho(ahl ahl) {
        this.f22955a = ahl;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.f22955a.f15275b) {
            try {
                if (this.f22955a.f15276c != null) {
                    this.f22955a.f15278e = this.f22955a.f15276c.m27089c();
                }
            } catch (Throwable e) {
                hx.m19912b("Unable to obtain a cache service instance.", e);
                this.f22955a.m19180c();
            }
            this.f22955a.f15275b.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i) {
        synchronized (this.f22955a.f15275b) {
            this.f22955a.f15278e = null;
            this.f22955a.f15275b.notifyAll();
        }
    }
}
