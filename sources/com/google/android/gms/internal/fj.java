package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class fj implements ThreadFactory {
    /* renamed from: a */
    private final AtomicInteger f16058a = new AtomicInteger(1);
    /* renamed from: b */
    private /* synthetic */ String f16059b;

    fj(String str) {
        this.f16059b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f16059b;
        int andIncrement = this.f16058a.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
        stringBuilder.append("AdWorker(");
        stringBuilder.append(str);
        stringBuilder.append(") #");
        stringBuilder.append(andIncrement);
        return new Thread(runnable, stringBuilder.toString());
    }
}
