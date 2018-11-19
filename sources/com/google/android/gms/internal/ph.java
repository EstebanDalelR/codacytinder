package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ad;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class ph implements ThreadFactory {
    /* renamed from: a */
    private final String f16380a;
    /* renamed from: b */
    private final int f16381b;
    /* renamed from: c */
    private final AtomicInteger f16382c;
    /* renamed from: d */
    private final ThreadFactory f16383d;

    public ph(String str) {
        this(str, 0);
    }

    private ph(String str, int i) {
        this.f16382c = new AtomicInteger();
        this.f16383d = Executors.defaultThreadFactory();
        this.f16380a = (String) ad.a(str, "Name must not be null");
        this.f16381b = 0;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f16383d.newThread(new pi(runnable, 0));
        String str = this.f16380a;
        int andIncrement = this.f16382c.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
        stringBuilder.append(str);
        stringBuilder.append("[");
        stringBuilder.append(andIncrement);
        stringBuilder.append("]");
        newThread.setName(stringBuilder.toString());
        return newThread;
    }
}
