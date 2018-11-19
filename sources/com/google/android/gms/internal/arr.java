package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class arr implements Callable<aro> {
    /* renamed from: a */
    private /* synthetic */ arl f15669a;
    /* renamed from: b */
    private /* synthetic */ arq f15670b;

    arr(arq arq, arl arl) {
        this.f15670b = arq;
        this.f15669a = arl;
    }

    /* renamed from: a */
    private final aro m19465a() throws Exception {
        synchronized (this.f15670b.f23088i) {
            if (this.f15670b.f23089j) {
                return null;
            }
            return this.f15669a.m27223a(this.f15670b.f23085f, this.f15670b.f23086g);
        }
    }

    public final /* synthetic */ Object call() throws Exception {
        return m19465a();
    }
}
