package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzn;

final class rd extends rj {
    /* renamed from: a */
    private final zzn<Status> f27051a;

    public rd(zzn<Status> zzn) {
        this.f27051a = zzn;
    }

    public final void zza(zzceo zzceo) {
        this.f27051a.setResult(zzceo.getStatus());
    }
}
