package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

@zzzv
/* renamed from: com.google.android.gms.internal.t */
public final class C7360t extends C6274y {
    /* renamed from: a */
    private final WeakReference<zzaal> f27067a;

    public C7360t(zzaal zzaal) {
        this.f27067a = new WeakReference(zzaal);
    }

    public final void zza(zzaax zzaax) {
        zzaal zzaal = (zzaal) this.f27067a.get();
        if (zzaal != null) {
            zzaal.zza(zzaax);
        }
    }
}
