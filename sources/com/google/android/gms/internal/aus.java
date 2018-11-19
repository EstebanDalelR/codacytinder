package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C2406p;
import java.util.concurrent.CountDownLatch;

final class aus implements Runnable {
    /* renamed from: a */
    private /* synthetic */ CountDownLatch f15738a;
    /* renamed from: b */
    private /* synthetic */ aur f15739b;

    aus(aur aur, CountDownLatch countDownLatch) {
        this.f15739b = aur;
        this.f15738a = countDownLatch;
    }

    public final void run() {
        synchronized (this.f15739b.d) {
            this.f15739b.f28711m = C2406p.a(this.f15739b.f28710l, this.f15739b.f28705g, this.f15738a);
        }
    }
}
