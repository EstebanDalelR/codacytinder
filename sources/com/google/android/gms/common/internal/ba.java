package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class ba extends az {
    /* renamed from: a */
    private /* synthetic */ Intent f12056a;
    /* renamed from: b */
    private /* synthetic */ Activity f12057b;
    /* renamed from: c */
    private /* synthetic */ int f12058c;

    ba(Intent intent, Activity activity, int i) {
        this.f12056a = intent;
        this.f12057b = activity;
        this.f12058c = i;
    }

    /* renamed from: a */
    public final void mo2578a() {
        if (this.f12056a != null) {
            this.f12057b.startActivityForResult(this.f12056a, this.f12058c);
        }
    }
}
