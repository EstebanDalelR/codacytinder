package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult.zza;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.g */
final class C3797g implements zza {
    /* renamed from: a */
    private /* synthetic */ BasePendingResult f11997a;
    /* renamed from: b */
    private /* synthetic */ C2477f f11998b;

    C3797g(C2477f c2477f, BasePendingResult basePendingResult) {
        this.f11998b = c2477f;
        this.f11997a = basePendingResult;
    }

    public final void zzr(Status status) {
        this.f11998b.f7535a.remove(this.f11997a);
    }
}
