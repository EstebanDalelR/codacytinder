package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzn;
import com.google.android.gms.location.C4487g;

final class ry extends rl {
    /* renamed from: a */
    private zzn<Status> f27055a;

    public ry(zzn<Status> zzn) {
        this.f27055a = zzn;
    }

    /* renamed from: a */
    private final void m31653a(int i) {
        if (this.f27055a == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times");
            return;
        }
        this.f27055a.setResult(C4487g.m20359b(C4487g.m20358a(i)));
        this.f27055a = null;
    }

    public final void zza(int i, PendingIntent pendingIntent) {
        m31653a(i);
    }

    public final void zza(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult");
    }

    public final void zzb(int i, String[] strArr) {
        m31653a(i);
    }
}
