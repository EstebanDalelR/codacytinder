package com.facebook.ads.internal.p047k;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.ads.internal.k.ab */
public class ab implements ThreadFactory {
    /* renamed from: a */
    protected final AtomicLong f4052a = new AtomicLong();
    /* renamed from: b */
    private int f4053b = Thread.currentThread().getPriority();

    /* renamed from: a */
    protected String m5174a() {
        return String.format(Locale.ENGLISH, "com.facebook.ads thread-%d %tF %<tT", new Object[]{Long.valueOf(this.f4052a.incrementAndGet()), Long.valueOf(System.currentTimeMillis())});
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(null, runnable, m5174a(), 0);
        thread.setPriority(this.f4053b);
        return thread;
    }
}
