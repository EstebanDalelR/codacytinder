package com.google.android.gms.ads.internal;

import android.view.View;
import android.view.View.OnClickListener;

final class bg implements OnClickListener {
    /* renamed from: a */
    private /* synthetic */ bo f7203a;
    /* renamed from: b */
    private /* synthetic */ bd f7204b;

    bg(bd bdVar, bo boVar) {
        this.f7204b = bdVar;
        this.f7203a = boVar;
    }

    public final void onClick(View view) {
        this.f7203a.m8688a();
        if (this.f7204b.f7197b != null) {
            this.f7204b.f7197b.zzom();
        }
    }
}
