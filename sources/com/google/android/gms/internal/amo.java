package com.google.android.gms.internal;

final class amo implements Runnable {
    /* renamed from: a */
    private /* synthetic */ amn f15508a;

    amo(amn amn) {
        this.f15508a = amn;
    }

    public final void run() {
        if (this.f15508a.f26700p != null) {
            this.f15508a.f26700p.zzki();
            this.f15508a.f26700p.zzkh();
        }
        this.f15508a.f26700p = null;
    }
}
