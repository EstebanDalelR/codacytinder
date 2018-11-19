package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;

/* renamed from: com.google.android.gms.common.api.internal.x */
abstract class C2479x implements Runnable {
    /* renamed from: a */
    private /* synthetic */ C3803n f7538a;

    private C2479x(C3803n c3803n) {
        this.f7538a = c3803n;
    }

    @WorkerThread
    /* renamed from: a */
    protected abstract void mo2565a();

    @WorkerThread
    public void run() {
        this.f7538a.f12007b.lock();
        try {
            if (!Thread.interrupted()) {
                mo2565a();
            }
        } catch (RuntimeException e) {
            this.f7538a.f12006a.m17178a(e);
        } catch (Throwable th) {
            this.f7538a.f12007b.unlock();
        }
        this.f7538a.f12007b.unlock();
    }
}
