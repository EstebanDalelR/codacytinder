package com.google.android.gms.common.api.internal;

abstract class ai {
    /* renamed from: a */
    private final zzbh f7456a;

    protected ai(zzbh zzbh) {
        this.f7456a = zzbh;
    }

    /* renamed from: a */
    protected abstract void mo2564a();

    /* renamed from: a */
    public final void m8932a(ah ahVar) {
        ahVar.f13949f.lock();
        try {
            if (ahVar.f13957n == this.f7456a) {
                mo2564a();
            }
            ahVar.f13949f.unlock();
        } catch (Throwable th) {
            ahVar.f13949f.unlock();
        }
    }
}
