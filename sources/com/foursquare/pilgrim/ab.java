package com.foursquare.pilgrim;

import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.foursquare.pilgrim.bg.C3547a;
import com.foursquare.pilgrim.bg.C3548b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class ab<T> implements Future<T> {
    @NonNull
    /* renamed from: a */
    private static final Object f5271a = new C19621();
    @Nullable
    /* renamed from: b */
    private volatile Object f5272b = f5271a;
    @NonNull
    /* renamed from: c */
    private final CountDownLatch f5273c = new CountDownLatch(1);

    /* renamed from: com.foursquare.pilgrim.ab$1 */
    class C19621 {
        C19621() {
        }

        @NonNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ab.class.getSimpleName());
            stringBuilder.append("RESULT_NOT_INITIALIZED_SENTINEL");
            return stringBuilder.toString();
        }
    }

    ab() {
    }

    @WorkerThread
    @NonNull
    /* renamed from: a */
    public bg<T, Throwable> m6893a() {
        try {
            return new C3548b(get());
        } catch (Exception e) {
            return new C3547a(e);
        }
    }

    @AnyThread
    /* renamed from: a */
    public boolean m6894a(@Nullable T t) {
        if (this.f5273c.getCount() == 0) {
            return null;
        }
        this.f5272b = t;
        this.f5273c.countDown();
        return true;
    }

    @AnyThread
    public boolean cancel(boolean z) {
        if (this.f5273c.getCount() == 0) {
            return false;
        }
        this.f5273c.countDown();
        return true;
    }

    @AnyThread
    public boolean isCancelled() {
        return isDone() && m6892b(this.f5272b);
    }

    @AnyThread
    public boolean isDone() {
        return this.f5273c.getCount() == 0;
    }

    @Nullable
    @WorkerThread
    public T get() throws InterruptedException, ExecutionException {
        this.f5273c.await();
        return m6891b();
    }

    @Nullable
    @WorkerThread
    public T get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.f5273c.await(j, timeUnit)) {
            return m6891b();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Timed out after ");
        stringBuilder.append(j);
        stringBuilder.append(" ");
        stringBuilder.append(timeUnit);
        throw new TimeoutException(stringBuilder.toString());
    }

    @Nullable
    /* renamed from: b */
    private T m6891b() throws InterruptedException {
        T t = this.f5272b;
        if (!m6892b(t)) {
            return t;
        }
        throw new InterruptedException();
    }

    /* renamed from: b */
    private static boolean m6892b(@Nullable Object obj) {
        return obj == f5271a ? true : null;
    }
}
