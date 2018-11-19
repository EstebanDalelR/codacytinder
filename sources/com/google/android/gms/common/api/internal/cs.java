package com.google.android.gms.common.api.internal;

final class cs implements Runnable {
    /* renamed from: a */
    private /* synthetic */ cr f7534a;

    cs(cr crVar) {
        this.f7534a = crVar;
    }

    public final void run() {
        this.f7534a.f11986m.lock();
        try {
            this.f7534a.m14347a();
        } finally {
            this.f7534a.f11986m.unlock();
        }
    }
}
