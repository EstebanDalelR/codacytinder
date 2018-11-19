package com.tinder.utils;

import android.support.annotation.Nullable;
import com.tinder.util.RxUtils.RetryListener;
import rx.C2671a;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

public class RxUtils {
    /* renamed from: a */
    public static <T> RxUtils$b<T> m10183a() {
        return m10184a(Schedulers.io(), C19397a.a());
    }

    /* renamed from: a */
    public static <T> RxUtils$b<T> m10184a(C2671a c2671a, C2671a c2671a2) {
        return RxUtils$b.a(c2671a, c2671a2);
    }

    /* renamed from: a */
    public static boolean m10186a(Subscription subscription) {
        return (subscription == null || subscription.isUnsubscribed() != null) ? null : true;
    }

    /* renamed from: b */
    public static void m10188b(Subscription subscription) {
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }

    @Deprecated
    /* renamed from: b */
    public static CompletableSubscriber m10187b() {
        return new RxUtils$1();
    }

    /* renamed from: a */
    public static CompletableSubscriber m10185a(String str) {
        return new RxUtils$2(str);
    }

    /* renamed from: a */
    public static <T> RxUtils$a<T> m10181a(int i, long j) {
        return m10182a(i, j, null);
    }

    /* renamed from: a */
    public static <T> RxUtils$a<T> m10182a(int i, long j, @Nullable RetryListener retryListener) {
        return RxUtils$a.a(i, j, retryListener);
    }
}
