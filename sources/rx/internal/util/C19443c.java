package rx.internal.util;

import java.util.concurrent.CountDownLatch;
import rx.Subscription;

/* renamed from: rx.internal.util.c */
public final class C19443c {
    /* renamed from: a */
    public static void m69971a(CountDownLatch countDownLatch, Subscription subscription) {
        if (countDownLatch.getCount() != 0) {
            try {
                countDownLatch.await();
            } catch (CountDownLatch countDownLatch2) {
                subscription.unsubscribe();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", countDownLatch2);
            }
        }
    }
}
