package io.reactivex.internal.schedulers;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.h */
public final class C17518h extends C15679f {
    /* renamed from: d */
    static final RxThreadFactory f54130d = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    /* renamed from: e */
    static final ScheduledExecutorService f54131e = Executors.newScheduledThreadPool(0);
    /* renamed from: b */
    final ThreadFactory f54132b;
    /* renamed from: c */
    final AtomicReference<ScheduledExecutorService> f54133c;

    /* renamed from: io.reactivex.internal.schedulers.h$a */
    static final class C18427a extends C17362c {
        /* renamed from: a */
        final ScheduledExecutorService f57378a;
        /* renamed from: b */
        final C17356a f57379b = new C17356a();
        /* renamed from: c */
        volatile boolean f57380c;

        C18427a(ScheduledExecutorService scheduledExecutorService) {
            this.f57378a = scheduledExecutorService;
        }

        @NonNull
        /* renamed from: a */
        public Disposable mo13559a(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (this.f57380c) {
                return EmptyDisposable.INSTANCE;
            }
            Disposable scheduledRunnable = new ScheduledRunnable(C2667a.a(runnable), this.f57379b);
            this.f57379b.add(scheduledRunnable);
            if (j <= 0) {
                try {
                    runnable = this.f57378a.submit(scheduledRunnable);
                } catch (Runnable runnable2) {
                    dispose();
                    C2667a.a(runnable2);
                    return EmptyDisposable.INSTANCE;
                }
            }
            runnable2 = this.f57378a.schedule(scheduledRunnable, j, timeUnit);
            scheduledRunnable.m63724a(runnable2);
            return scheduledRunnable;
        }

        public void dispose() {
            if (!this.f57380c) {
                this.f57380c = true;
                this.f57379b.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f57380c;
        }
    }

    static {
        f54131e.shutdown();
    }

    public C17518h() {
        this(f54130d);
    }

    public C17518h(ThreadFactory threadFactory) {
        this.f54133c = new AtomicReference();
        this.f54132b = threadFactory;
        this.f54133c.lazySet(C17518h.m63738a(threadFactory));
    }

    /* renamed from: a */
    static ScheduledExecutorService m63738a(ThreadFactory threadFactory) {
        return C15731g.m58952a(threadFactory);
    }

    /* renamed from: b */
    public void mo12921b() {
        ScheduledExecutorService scheduledExecutorService = null;
        ScheduledExecutorService scheduledExecutorService2;
        do {
            scheduledExecutorService2 = (ScheduledExecutorService) this.f54133c.get();
            if (scheduledExecutorService2 != f54131e) {
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                return;
            } else if (scheduledExecutorService == null) {
                scheduledExecutorService = C17518h.m63738a(this.f54132b);
            }
        } while (!this.f54133c.compareAndSet(scheduledExecutorService2, scheduledExecutorService));
    }

    @NonNull
    /* renamed from: a */
    public C17362c mo12872a() {
        return new C18427a((ScheduledExecutorService) this.f54133c.get());
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo12871a(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        Disposable scheduledDirectTask = new ScheduledDirectTask(C2667a.a(runnable));
        if (j <= 0) {
            try {
                runnable = ((ScheduledExecutorService) this.f54133c.get()).submit(scheduledDirectTask);
            } catch (Runnable runnable2) {
                C2667a.a(runnable2);
                return EmptyDisposable.INSTANCE;
            }
        }
        runnable2 = ((ScheduledExecutorService) this.f54133c.get()).schedule(scheduledDirectTask, j, timeUnit);
        scheduledDirectTask.m63719a(runnable2);
        return scheduledDirectTask;
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo12919a(@NonNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable = C2667a.a(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f54133c.get();
            Disposable c17515c = new C17515c(runnable, scheduledExecutorService);
            if (j <= 0) {
                try {
                    runnable = scheduledExecutorService.submit(c17515c);
                } catch (Runnable runnable2) {
                    C2667a.a(runnable2);
                    return EmptyDisposable.INSTANCE;
                }
            }
            runnable2 = scheduledExecutorService.schedule(c17515c, j, timeUnit);
            c17515c.m63733a(runnable2);
            return c17515c;
        }
        Disposable scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnable2);
        try {
            scheduledDirectPeriodicTask.m63719a(((ScheduledExecutorService) this.f54133c.get()).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (Runnable runnable22) {
            C2667a.a(runnable22);
            return EmptyDisposable.INSTANCE;
        }
    }
}
