package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzn;

final class mw extends mo {
    /* renamed from: a */
    private zzn<Status> f28802a;

    mw(zzn<Status> zzn) {
        this.f28802a = zzn;
    }

    public final void zze(Status status) {
        this.f28802a.setResult(status);
    }
}
