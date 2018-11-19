package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class dg implements ThreadFactory {
    /* renamed from: a */
    private final AtomicInteger f15953a = new AtomicInteger(1);

    dg(de deVar) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f15953a.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(42);
        stringBuilder.append("AdWorker(SCION_TASK_EXECUTOR) #");
        stringBuilder.append(andIncrement);
        return new Thread(runnable, stringBuilder.toString());
    }
}
