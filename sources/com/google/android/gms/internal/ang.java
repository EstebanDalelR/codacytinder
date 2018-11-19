package com.google.android.gms.internal;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.ar;

final class ang implements Runnable {
    /* renamed from: a */
    private /* synthetic */ amv f15519a;
    /* renamed from: b */
    private /* synthetic */ anf f15520b;

    ang(anf anf, amv amv) {
        this.f15520b = anf;
        this.f15519a = amv;
    }

    public final void run() {
        zzanh c;
        if (this.f15520b.f26734f) {
            if (this.f15520b.f26733e == null) {
                this.f15520b.f26733e = new View(this.f15520b.f26732d.getContext());
                this.f15520b.f26733e.setLayoutParams(new LayoutParams(-1, 0));
            }
            if (this.f15520b.f26732d != this.f15520b.f26733e.getParent()) {
                this.f15520b.f26732d.addView(this.f15520b.f26733e);
            }
        }
        try {
            c = this.f15519a.mo6849c();
        } catch (Throwable e) {
            ar.g();
            if (fq.m19763e()) {
                hx.m19916e("Privileged processes cannot create HTML overlays.");
            } else {
                hx.m19912b("Error obtaining overlay.", e);
            }
            c = null;
        }
        if (!(c == null || this.f15520b.f26730a == null)) {
            FrameLayout frameLayout = this.f15520b.f26730a;
            if (c == null) {
                throw null;
            }
            frameLayout.addView((View) c);
        }
        this.f15520b.m31461a(this.f15519a);
    }
}
