package com.google.android.gms.internal;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class ik implements Runnable {
    /* renamed from: a */
    private final iw f16186a;
    /* renamed from: b */
    private final zzakv f16187b;

    ik(iw iwVar, zzakv zzakv) {
        this.f16186a = iwVar;
        this.f16187b = zzakv;
    }

    public final void run() {
        Throwable cause;
        iw iwVar = this.f16186a;
        try {
            iwVar.m27364b(this.f16187b.get());
        } catch (ExecutionException e) {
            cause = e.getCause();
            iwVar.m27363a(cause);
        } catch (InterruptedException e2) {
            cause = e2;
            Thread.currentThread().interrupt();
            iwVar.m27363a(cause);
        } catch (Throwable cause2) {
            iwVar.m27363a(cause2);
        }
    }
}
