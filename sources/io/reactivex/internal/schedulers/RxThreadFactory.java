package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    /* renamed from: a */
    final String f48628a;
    /* renamed from: b */
    final int f48629b;
    /* renamed from: c */
    final boolean f48630c;

    /* renamed from: io.reactivex.internal.schedulers.RxThreadFactory$a */
    static final class C17512a extends Thread implements NonBlockingThread {
        C17512a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    public RxThreadFactory(String str, int i) {
        this(str, i, false);
    }

    public RxThreadFactory(String str, int i, boolean z) {
        this.f48628a = str;
        this.f48629b = i;
        this.f48630c = z;
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder(this.f48628a);
        stringBuilder.append('-');
        stringBuilder.append(incrementAndGet());
        String stringBuilder2 = stringBuilder.toString();
        Thread c17512a = this.f48630c ? new C17512a(runnable, stringBuilder2) : new Thread(runnable, stringBuilder2);
        c17512a.setPriority(this.f48629b);
        c17512a.setDaemon(true);
        return c17512a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RxThreadFactory[");
        stringBuilder.append(this.f48628a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
