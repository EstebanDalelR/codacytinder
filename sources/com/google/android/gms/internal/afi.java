package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.view.View;
import java.lang.ref.WeakReference;

public final class afi implements zzhd {
    /* renamed from: a */
    private WeakReference<zzos> f22904a;

    public afi(zzos zzos) {
        this.f22904a = new WeakReference(zzos);
    }

    @Nullable
    public final View zzgd() {
        zzos zzos = (zzos) this.f22904a.get();
        return zzos != null ? zzos.zzkj() : null;
    }

    public final boolean zzge() {
        return this.f22904a.get() == null;
    }

    public final zzhd zzgf() {
        return new afk((zzos) this.f22904a.get());
    }
}
