package com.google.android.m4b.maps.cg;

import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class by {
    /* renamed from: a */
    private static by f19149a = new by();

    /* renamed from: com.google.android.m4b.maps.cg.by$1 */
    class C51571 implements Executor {
        /* renamed from: a */
        private /* synthetic */ boolean f19146a;
        /* renamed from: b */
        private /* synthetic */ Handler f19147b;

        C51571(boolean z, Handler handler) {
            this.f19146a = z;
            this.f19147b = handler;
        }

        public final void execute(Runnable runnable) {
            if (this.f19146a && Looper.myLooper() == this.f19147b.getLooper()) {
                runnable.run();
            } else if (this.f19147b.post(runnable) == null) {
                throw new RuntimeException("Operation could not be posted on handler. Looper may be exiting.");
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.cg.by$2 */
    class C51582 implements ScheduledExecutorService {
        /* renamed from: a */
        private /* synthetic */ Handler f19148a;

        C51582(Handler handler) {
            this.f19148a = handler;
        }

        public final void execute(Runnable runnable) {
            this.f19148a.post(runnable);
        }

        public final <T> Future<T> submit(Runnable runnable, T t) {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final Future<?> submit(Runnable runnable) {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final <T> Future<T> submit(Callable<T> callable) {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final void shutdown() {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final boolean isTerminated() {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final boolean isShutdown() {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("Not implemented.");
        }

        public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            this.f19148a.postDelayed(runnable, timeUnit.toMillis(j));
            return null;
        }
    }

    private by() {
    }

    /* renamed from: a */
    public static Executor m23061a() {
        return m23062a(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: b */
    public static ScheduledExecutorService m23063b(Handler handler) {
        return new C51582(handler);
    }

    /* renamed from: a */
    public static Executor m23062a(Handler handler) {
        return new C51571(false, handler);
    }
}
