package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.tasks.q */
final class C4512q implements Runnable {
    /* renamed from: a */
    private /* synthetic */ C6293p f16754a;
    /* renamed from: b */
    private /* synthetic */ Callable f16755b;

    public final void run() {
        try {
            this.f16754a.m27626a(this.f16755b.call());
        } catch (Exception e) {
            this.f16754a.m27625a(e);
        }
    }
}
