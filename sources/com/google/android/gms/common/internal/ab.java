package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.zza;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4501b;
import java.util.concurrent.TimeUnit;

final class ab implements zza {
    /* renamed from: a */
    private /* synthetic */ PendingResult f12047a;
    /* renamed from: b */
    private /* synthetic */ C4501b f12048b;
    /* renamed from: c */
    private /* synthetic */ zzbo f12049c;
    /* renamed from: d */
    private /* synthetic */ zzbp f12050d;

    ab(PendingResult pendingResult, C4501b c4501b, zzbo zzbo, zzbp zzbp) {
        this.f12047a = pendingResult;
        this.f12048b = c4501b;
        this.f12049c = zzbo;
        this.f12050d = zzbp;
    }

    public final void zzr(Status status) {
        if (status.isSuccess()) {
            this.f12048b.a(this.f12049c.zzb(this.f12047a.mo2484a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f12048b.a(this.f12050d.zzz(status));
    }
}
