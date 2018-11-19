package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class avc implements Runnable {
    /* renamed from: a */
    private /* synthetic */ AtomicInteger f15768a;
    /* renamed from: b */
    private /* synthetic */ int f15769b;
    /* renamed from: c */
    private /* synthetic */ iw f15770c;
    /* renamed from: d */
    private /* synthetic */ List f15771d;

    avc(AtomicInteger atomicInteger, int i, iw iwVar, List list) {
        this.f15768a = atomicInteger;
        this.f15769b = i;
        this.f15770c = iwVar;
        this.f15771d = list;
    }

    public final void run() {
        if (this.f15768a.incrementAndGet() >= this.f15769b) {
            try {
                this.f15770c.m27364b(aux.m19512c(this.f15771d));
            } catch (Throwable e) {
                hx.m19914c("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
