package io.fabric.sdk.android.services.concurrency;

import android.annotation.TargetApi;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.fabric.sdk.android.services.concurrency.e */
public class C15641e extends ThreadPoolExecutor {
    /* renamed from: a */
    private static final int f48410a = Runtime.getRuntime().availableProcessors();
    /* renamed from: b */
    private static final int f48411b = (f48410a + 1);
    /* renamed from: c */
    private static final int f48412c = ((f48410a * 2) + 1);

    /* renamed from: io.fabric.sdk.android.services.concurrency.e$a */
    protected static final class C15640a implements ThreadFactory {
        /* renamed from: a */
        private final int f48409a;

        public C15640a(int i) {
            this.f48409a = i;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.f48409a);
            thread.setName("Queue");
            return thread;
        }
    }

    public /* synthetic */ BlockingQueue getQueue() {
        return m58740b();
    }

    <T extends Runnable & Dependency & Task & PriorityProvider> C15641e(int i, int i2, long j, TimeUnit timeUnit, DependencyPriorityBlockingQueue<T> dependencyPriorityBlockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, dependencyPriorityBlockingQueue, threadFactory);
        prestartAllCoreThreads();
    }

    /* renamed from: a */
    public static <T extends Runnable & Dependency & Task & PriorityProvider> C15641e m58739a(int i, int i2) {
        return new C15641e(i, i2, 1, TimeUnit.SECONDS, new DependencyPriorityBlockingQueue(), new C15640a(10));
    }

    /* renamed from: a */
    public static C15641e m58738a() {
        return C15641e.m58739a(f48411b, f48412c);
    }

    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C17338c(runnable, t);
    }

    protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C17338c(callable);
    }

    @TargetApi(9)
    public void execute(Runnable runnable) {
        if (C17339d.isProperDelegate(runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    protected void afterExecute(Runnable runnable, Throwable th) {
        Task task = (Task) runnable;
        task.setFinished(true);
        task.setError(th);
        m58740b().m58736d();
        super.afterExecute(runnable, th);
    }

    /* renamed from: b */
    public DependencyPriorityBlockingQueue m58740b() {
        return (DependencyPriorityBlockingQueue) super.getQueue();
    }
}
