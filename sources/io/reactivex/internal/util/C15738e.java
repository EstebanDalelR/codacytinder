package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.internal.util.e */
public final class C15738e {
    /* renamed from: a */
    public static <T> void m58981a(Subscriber<? super T> subscriber, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            subscriber.onNext(t);
            if (atomicInteger.decrementAndGet() != null) {
                t = atomicThrowable.m58960a();
                if (t != null) {
                    subscriber.onError(t);
                } else {
                    subscriber.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m58982a(Subscriber<?> subscriber, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.m58961a(th)) {
            C2667a.a(th);
        } else if (atomicInteger.getAndIncrement() == null) {
            subscriber.onError(atomicThrowable.m58960a());
        }
    }

    /* renamed from: a */
    public static void m58983a(Subscriber<?> subscriber, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == null) {
            atomicInteger = atomicThrowable.m58960a();
            if (atomicInteger != null) {
                subscriber.onError(atomicInteger);
            } else {
                subscriber.onComplete();
            }
        }
    }

    /* renamed from: a */
    public static <T> void m58978a(Observer<? super T> observer, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(t);
            if (atomicInteger.decrementAndGet() != null) {
                t = atomicThrowable.m58960a();
                if (t != null) {
                    observer.onError(t);
                } else {
                    observer.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m58979a(Observer<?> observer, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.m58961a(th)) {
            C2667a.a(th);
        } else if (atomicInteger.getAndIncrement() == null) {
            observer.onError(atomicThrowable.m58960a());
        }
    }

    /* renamed from: a */
    public static void m58980a(Observer<?> observer, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == null) {
            atomicInteger = atomicThrowable.m58960a();
            if (atomicInteger != null) {
                observer.onError(atomicInteger);
            } else {
                observer.onComplete();
            }
        }
    }
}
