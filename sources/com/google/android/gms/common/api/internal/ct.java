package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

final class ct implements zzcd {
    /* renamed from: a */
    private /* synthetic */ cr f11988a;

    private ct(cr crVar) {
        this.f11988a = crVar;
    }

    public final void zzc(@NonNull ConnectionResult connectionResult) {
        this.f11988a.f11986m.lock();
        try {
            this.f11988a.f11983j = connectionResult;
            this.f11988a.m14347a();
        } finally {
            this.f11988a.f11986m.unlock();
        }
    }

    public final void zzf(int i, boolean z) {
        this.f11988a.f11986m.lock();
        try {
            if (!(this.f11988a.f11985l || this.f11988a.f11984k == null)) {
                if (this.f11988a.f11984k.isSuccess()) {
                    this.f11988a.f11985l = true;
                    this.f11988a.f11978e.onConnectionSuspended(i);
                    this.f11988a.f11986m.unlock();
                }
            }
            this.f11988a.f11985l = false;
            this.f11988a.m14348a(i, z);
            this.f11988a.f11986m.unlock();
        } catch (Throwable th) {
            this.f11988a.f11986m.unlock();
        }
    }

    public final void zzj(@Nullable Bundle bundle) {
        this.f11988a.f11986m.lock();
        try {
            this.f11988a.m14349a(bundle);
            this.f11988a.f11983j = ConnectionResult.zzfkr;
            this.f11988a.m14347a();
        } finally {
            this.f11988a.f11986m.unlock();
        }
    }
}
