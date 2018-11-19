package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.schedulers.NonBlockingThread;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.CountDownLatch;

/* renamed from: io.reactivex.internal.util.b */
public final class C15736b {
    /* renamed from: a */
    public static void m58972a(CountDownLatch countDownLatch, Disposable disposable) {
        if (countDownLatch.getCount() != 0) {
            try {
                C15736b.m58971a();
                countDownLatch.await();
            } catch (CountDownLatch countDownLatch2) {
                disposable.dispose();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", countDownLatch2);
            }
        }
    }

    /* renamed from: a */
    public static void m58971a() {
        if (!C2667a.a()) {
            return;
        }
        if ((Thread.currentThread() instanceof NonBlockingThread) || C2667a.b()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Attempt to block on a Scheduler ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" that doesn't support blocking operators as they may lead to deadlock");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
