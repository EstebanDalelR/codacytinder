package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.util.Log;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class FifoPriorityThreadPoolExecutor extends ThreadPoolExecutor {
    /* renamed from: a */
    private final AtomicInteger f2832a;
    /* renamed from: b */
    private final UncaughtThrowableStrategy f2833b;

    public enum UncaughtThrowableStrategy {
        IGNORE,
        LOG {
            protected void handle(Throwable th) {
                if (Log.isLoggable("PriorityExecutor", 6)) {
                    Log.e("PriorityExecutor", "Request threw uncaught throwable", th);
                }
            }
        },
        THROW {
            protected void handle(Throwable th) {
                super.handle(th);
                throw new RuntimeException(th);
            }
        };

        protected void handle(Throwable th) {
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.executor.FifoPriorityThreadPoolExecutor$a */
    public static class C1027a implements ThreadFactory {
        /* renamed from: a */
        int f2829a = 0;

        public Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fifo-pool-thread-");
            stringBuilder.append(this.f2829a);
            Thread c10261 = new Thread(this, runnable, stringBuilder.toString()) {
                /* renamed from: a */
                final /* synthetic */ C1027a f2828a;

                public void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            };
            this.f2829a++;
            return c10261;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.executor.FifoPriorityThreadPoolExecutor$b */
    static class C1028b<T> extends FutureTask<T> implements Comparable<C1028b<?>> {
        /* renamed from: a */
        private final int f2830a;
        /* renamed from: b */
        private final int f2831b;

        public /* synthetic */ int compareTo(Object obj) {
            return m3564a((C1028b) obj);
        }

        public C1028b(Runnable runnable, T t, int i) {
            super(runnable, t);
            if ((runnable instanceof Prioritized) == null) {
                throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
            }
            this.f2830a = ((Prioritized) runnable).getPriority();
            this.f2831b = i;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C1028b)) {
                return false;
            }
            C1028b c1028b = (C1028b) obj;
            if (this.f2831b == c1028b.f2831b && this.f2830a == c1028b.f2830a) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return (this.f2830a * 31) + this.f2831b;
        }

        /* renamed from: a */
        public int m3564a(C1028b<?> c1028b) {
            int i = this.f2830a - c1028b.f2830a;
            return i == 0 ? this.f2831b - c1028b.f2831b : i;
        }
    }

    public FifoPriorityThreadPoolExecutor(int i) {
        this(i, UncaughtThrowableStrategy.LOG);
    }

    public FifoPriorityThreadPoolExecutor(int i, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        this(i, i, 0, TimeUnit.MILLISECONDS, new C1027a(), uncaughtThrowableStrategy);
    }

    public FifoPriorityThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, ThreadFactory threadFactory, UncaughtThrowableStrategy uncaughtThrowableStrategy) {
        super(i, i2, j, timeUnit, new PriorityBlockingQueue(), threadFactory);
        this.f2832a = new AtomicInteger();
        this.f2833b = uncaughtThrowableStrategy;
    }

    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C1028b(runnable, t, this.f2832a.getAndIncrement());
    }

    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future) != null) {
            Future future = (Future) runnable;
            if (future.isDone() != null && future.isCancelled() == null) {
                try {
                    future.get();
                } catch (Runnable runnable2) {
                    this.f2833b.handle(runnable2);
                } catch (Runnable runnable22) {
                    this.f2833b.handle(runnable22);
                }
            }
        }
    }
}
