package com.google.android.gms.internal;

import android.content.Context;

final class fm implements Runnable {
    /* renamed from: a */
    private /* synthetic */ Context f16068a;
    /* renamed from: b */
    private /* synthetic */ fk f16069b;

    fm(fk fkVar, Context context) {
        this.f16069b = fkVar;
        this.f16068a = context;
    }

    public final void run() {
        synchronized (this.f16069b.f16061b) {
            this.f16069b.f16063d = fk.m19724d(this.f16068a);
            this.f16069b.f16061b.notifyAll();
        }
    }
}
