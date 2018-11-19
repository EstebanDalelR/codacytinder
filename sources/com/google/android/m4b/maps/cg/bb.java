package com.google.android.m4b.maps.cg;

import android.view.View;
import android.view.View.OnClickListener;

public final class bb {
    /* renamed from: a */
    private final View f19107a;

    public bb(View view) {
        this.f19107a = view;
    }

    /* renamed from: a */
    public final View m22940a() {
        return this.f19107a;
    }

    /* renamed from: a */
    public final void m22942a(boolean z) {
        this.f19107a.setVisibility(z ? false : true);
    }

    /* renamed from: a */
    public final void m22941a(OnClickListener onClickListener) {
        this.f19107a.setOnClickListener(onClickListener);
    }
}
