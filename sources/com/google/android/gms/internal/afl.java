package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.view.View;

public final class afl implements zzhd {
    @Nullable
    /* renamed from: a */
    private final View f22906a;
    @Nullable
    /* renamed from: b */
    private final dl f22907b;

    public afl(View view, dl dlVar) {
        this.f22906a = view;
        this.f22907b = dlVar;
    }

    public final View zzgd() {
        return this.f22906a;
    }

    public final boolean zzge() {
        if (this.f22907b != null) {
            if (this.f22906a != null) {
                return false;
            }
        }
        return true;
    }

    public final zzhd zzgf() {
        return this;
    }
}
