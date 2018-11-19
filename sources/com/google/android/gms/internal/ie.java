package com.google.android.gms.internal;

import java.util.concurrent.ExecutionException;

final /* synthetic */ class ie implements Runnable {
    /* renamed from: a */
    private final zzaki f16171a;
    /* renamed from: b */
    private final zzakv f16172b;

    ie(zzaki zzaki, zzakv zzakv) {
        this.f16171a = zzaki;
        this.f16172b = zzakv;
    }

    public final void run() {
        Throwable cause;
        zzaki zzaki = this.f16171a;
        try {
            zzaki.onSuccess(this.f16172b.get());
        } catch (ExecutionException e) {
            cause = e.getCause();
            zzaki.zzb(cause);
        } catch (InterruptedException e2) {
            cause = e2;
            Thread.currentThread().interrupt();
            zzaki.zzb(cause);
        } catch (Exception e3) {
            cause = e3;
            zzaki.zzb(cause);
        }
    }
}
