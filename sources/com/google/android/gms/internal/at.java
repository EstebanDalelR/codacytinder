package com.google.android.gms.internal;

import java.util.concurrent.Future;

final class at implements Runnable {
    /* renamed from: a */
    private /* synthetic */ Future f15699a;

    at(aq aqVar, Future future) {
        this.f15699a = future;
    }

    public final void run() {
        if (!this.f15699a.isDone()) {
            this.f15699a.cancel(true);
        }
    }
}
