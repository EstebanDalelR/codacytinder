package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

final class cu implements zzcd {
    /* renamed from: a */
    private /* synthetic */ cr f11989a;

    private cu(cr crVar) {
        this.f11989a = crVar;
    }

    public final void zzc(@NonNull ConnectionResult connectionResult) {
        this.f11989a.f11986m.lock();
        try {
            this.f11989a.f11984k = connectionResult;
            this.f11989a.m14347a();
        } finally {
            this.f11989a.f11986m.unlock();
        }
    }

    public final void zzf(int i, boolean z) {
        this.f11989a.f11986m.lock();
        try {
            if (this.f11989a.f11985l) {
                this.f11989a.f11985l = false;
                this.f11989a.m14348a(i, z);
            } else {
                this.f11989a.f11985l = true;
                this.f11989a.f11977d.onConnectionSuspended(i);
            }
            this.f11989a.f11986m.unlock();
        } catch (Throwable th) {
            this.f11989a.f11986m.unlock();
        }
    }

    public final void zzj(@Nullable Bundle bundle) {
        this.f11989a.f11986m.lock();
        try {
            this.f11989a.f11984k = ConnectionResult.zzfkr;
            this.f11989a.m14347a();
        } finally {
            this.f11989a.f11986m.unlock();
        }
    }
}
