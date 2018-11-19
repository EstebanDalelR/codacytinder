package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.zzcf;

final class bc extends az {
    /* renamed from: a */
    private /* synthetic */ Intent f12062a;
    /* renamed from: b */
    private /* synthetic */ zzcf f12063b;
    /* renamed from: c */
    private /* synthetic */ int f12064c;

    bc(Intent intent, zzcf zzcf, int i) {
        this.f12062a = intent;
        this.f12063b = zzcf;
        this.f12064c = i;
    }

    /* renamed from: a */
    public final void mo2578a() {
        if (this.f12062a != null) {
            this.f12063b.startActivityForResult(this.f12062a, this.f12064c);
        }
    }
}
