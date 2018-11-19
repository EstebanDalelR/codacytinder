package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

public final class afm implements zzhd {
    /* renamed from: a */
    private final WeakReference<View> f22908a;
    /* renamed from: b */
    private final WeakReference<dl> f22909b;

    public afm(View view, dl dlVar) {
        this.f22908a = new WeakReference(view);
        this.f22909b = new WeakReference(dlVar);
    }

    public final View zzgd() {
        return (View) this.f22908a.get();
    }

    public final boolean zzge() {
        if (this.f22908a.get() != null) {
            if (this.f22909b.get() != null) {
                return false;
            }
        }
        return true;
    }

    public final zzhd zzgf() {
        return new afl((View) this.f22908a.get(), (dl) this.f22909b.get());
    }
}
