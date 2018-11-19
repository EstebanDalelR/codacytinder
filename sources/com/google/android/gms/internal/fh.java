package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.ar;
import java.util.concurrent.Callable;

final class fh implements Runnable {
    /* renamed from: a */
    private /* synthetic */ iw f16054a;
    /* renamed from: b */
    private /* synthetic */ Callable f16055b;

    fh(iw iwVar, Callable callable) {
        this.f16054a = iwVar;
        this.f16055b = callable;
    }

    public final void run() {
        try {
            Process.setThreadPriority(10);
            this.f16054a.m27364b(this.f16055b.call());
        } catch (Throwable e) {
            ar.i().m27296a(e, "AdThreadPool.submit");
            this.f16054a.m27363a(e);
        }
    }
}
