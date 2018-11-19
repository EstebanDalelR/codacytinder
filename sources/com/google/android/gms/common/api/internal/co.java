package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class co extends aw {
    /* renamed from: a */
    private /* synthetic */ Dialog f11969a;
    /* renamed from: b */
    private /* synthetic */ cn f11970b;

    co(cn cnVar, Dialog dialog) {
        this.f11970b = cnVar;
        this.f11969a = dialog;
    }

    /* renamed from: a */
    public final void mo2520a() {
        this.f11970b.f7532a.m14340h();
        if (this.f11969a.isShowing()) {
            this.f11969a.dismiss();
        }
    }
}
