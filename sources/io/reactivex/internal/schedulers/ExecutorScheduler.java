package io.reactivex.internal.schedulers;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.p079d.C2667a;
import io.reactivex.schedulers.C15756a;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ExecutorScheduler extends C15679f {
    /* renamed from: c */
    static final C15679f f54099c = C15756a.m59012d();
    @NonNull
    /* renamed from: b */
    final Executor f54100b;

    /* renamed from: io.reactivex.internal.schedulers.ExecutorScheduler$a */
    final class C15727a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ExecutorScheduler f48626a;
        /* renamed from: b */
        private final DelayedRunnable f48627b;

        C15727a(ExecutorScheduler executorScheduler, DelayedRunnable delayedRunnable) {
            this.f48626a = executorScheduler;
            this.f48627b = delayedRunnable;
        }

        public void run() {
            this.f48627b.f54097b.m63458b(this.f48626a.mo12918a(this.f48627b));
        }
    }

    static final class DelayedRunnable extends AtomicReference<Runnable> implements Disposable, SchedulerRunnableIntrospection, Runnable {
        private static final long serialVersionUID = -4101336210206799084L;
        /* renamed from: a */
        final SequentialDisposable f54096a = new SequentialDisposable();
        /* renamed from: b */
        final SequentialDisposable f54097b = new SequentialDisposable();

        DelayedRunnable(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                } finally {
                    Object obj = null;
                    lazySet(null);
                    this.f54096a.lazySet(DisposableHelper.DISPOSED);
                    this.f54097b.lazySet(DisposableHelper.DISPOSED);
                }
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }

        public void dispose() {
            if (getAndSet(null) != null) {
                this.f54096a.dispose();
                this.f54097b.dispose();
            }
        }

        public Runnable getWrappedRunnable() {
            Runnable runnable = (Runnable) get();
            return runnable != null ? runnable : Functions.f48540b;
        }
    }

    public static final class ExecutorWorker extends C17362c implements Runnable {
        /* renamed from: a */
        final Executor f57362a;
        /* renamed from: b */
        final MpscLinkedQueue<Runnable> f57363b;
        /* renamed from: c */
        volatile boolean f57364c;
        /* renamed from: d */
        final AtomicInteger f57365d = new AtomicInteger();
        /* renamed from: e */
        final C17356a f57366e = new C17356a();

        /* renamed from: io.reactivex.internal.schedulers.ExecutorScheduler$ExecutorWorker$a */
        final class C15726a implements Runnable {
            /* renamed from: a */
            final /* synthetic */ ExecutorWorker f48623a;
            /* renamed from: b */
            private final SequentialDisposable f48624b;
            /* renamed from: c */
            private final Runnable f48625c;

            C15726a(ExecutorWorker executorWorker, SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.f48623a = executorWorker;
                this.f48624b = sequentialDisposable;
                this.f48625c = runnable;
            }

            public void run() {
                this.f48624b.m63458b(this.f48623a.mo13593a(this.f48625c));
            }
        }

        static final class BooleanRunnable extends AtomicBoolean implements Disposable, Runnable {
            private static final long serialVersionUID = -2421395018820541164L;
            /* renamed from: a */
            final Runnable f54098a;

            BooleanRunnable(Runnable runnable) {
                this.f54098a = runnable;
            }

            public void run() {
                if (!get()) {
                    try {
                        this.f54098a.run();
                    } finally {
                        lazySet(true);
                    }
                }
            }

            public void dispose() {
                lazySet(true);
            }

            public boolean isDisposed() {
                return get();
            }
        }

        public ExecutorWorker(Executor executor) {
            this.f57362a = executor;
            this.f57363b = new MpscLinkedQueue();
        }

        @NonNull
        /* renamed from: a */
        public Disposable mo13593a(@NonNull Runnable runnable) {
            if (this.f57364c) {
                return EmptyDisposable.INSTANCE;
            }
            Disposable booleanRunnable = new BooleanRunnable(C2667a.a(runnable));
            this.f57363b.offer(booleanRunnable);
            if (this.f57365d.getAndIncrement() == null) {
                try {
                    this.f57362a.execute(this);
                } catch (Runnable runnable2) {
                    this.f57364c = true;
                    this.f57363b.clear();
                    C2667a.a(runnable2);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return booleanRunnable;
        }

        @NonNull
        /* renamed from: a */
        public Disposable mo13559a(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (j <= 0) {
                return mo13593a(runnable);
            }
            if (this.f57364c) {
                return EmptyDisposable.INSTANCE;
            }
            Object sequentialDisposable = new SequentialDisposable();
            Disposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Disposable scheduledRunnable = new ScheduledRunnable(new C15726a(this, sequentialDisposable2, C2667a.a(runnable)), this.f57366e);
            this.f57366e.add(scheduledRunnable);
            if ((this.f57362a instanceof ScheduledExecutorService) != null) {
                try {
                    scheduledRunnable.m63724a(((ScheduledExecutorService) this.f57362a).schedule(scheduledRunnable, j, timeUnit));
                } catch (Runnable runnable2) {
                    this.f57364c = 1;
                    C2667a.a(runnable2);
                    return EmptyDisposable.INSTANCE;
                }
            }
            scheduledRunnable.m63724a(new C15728b(ExecutorScheduler.f54099c.mo12871a(scheduledRunnable, j, timeUnit)));
            sequentialDisposable.m63458b(scheduledRunnable);
            return sequentialDisposable2;
        }

        public void dispose() {
            if (!this.f57364c) {
                this.f57364c = true;
                this.f57366e.dispose();
                if (this.f57365d.getAndIncrement() == 0) {
                    this.f57363b.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f57364c;
        }

        public void run() {
            MpscLinkedQueue mpscLinkedQueue = this.f57363b;
            int i = 1;
            while (!this.f57364c) {
                while (true) {
                    Runnable runnable = (Runnable) mpscLinkedQueue.poll();
                    if (runnable == null) {
                        break;
                    }
                    runnable.run();
                    if (this.f57364c) {
                        mpscLinkedQueue.clear();
                        return;
                    }
                }
                if (this.f57364c) {
                    mpscLinkedQueue.clear();
                    return;
                }
                i = this.f57365d.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            mpscLinkedQueue.clear();
        }
    }

    public ExecutorScheduler(@NonNull Executor executor) {
        this.f54100b = executor;
    }

    @NonNull
    /* renamed from: a */
    public C17362c mo12872a() {
        return new ExecutorWorker(this.f54100b);
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo12918a(@NonNull Runnable runnable) {
        runnable = C2667a.a(runnable);
        try {
            if (this.f54100b instanceof ExecutorService) {
                Disposable scheduledDirectTask = new ScheduledDirectTask(runnable);
                scheduledDirectTask.m63719a(((ExecutorService) this.f54100b).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            Object booleanRunnable = new BooleanRunnable(runnable);
            this.f54100b.execute(booleanRunnable);
            return booleanRunnable;
        } catch (Runnable runnable2) {
            C2667a.a(runnable2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo12871a(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        runnable = C2667a.a(runnable);
        if (this.f54100b instanceof ScheduledExecutorService) {
            try {
                Disposable scheduledDirectTask = new ScheduledDirectTask(runnable);
                scheduledDirectTask.m63719a(((ScheduledExecutorService) this.f54100b).schedule(scheduledDirectTask, j, timeUnit));
                return scheduledDirectTask;
            } catch (Runnable runnable2) {
                C2667a.a(runnable2);
                return EmptyDisposable.INSTANCE;
            }
        }
        scheduledDirectTask = new DelayedRunnable(runnable2);
        scheduledDirectTask.f54096a.m63458b(f54099c.mo12871a(new C15727a(this, scheduledDirectTask), j, timeUnit));
        return scheduledDirectTask;
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo12919a(@NonNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.f54100b instanceof ScheduledExecutorService)) {
            return super.mo12919a(runnable, j, j2, timeUnit);
        }
        try {
            Disposable scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(C2667a.a(runnable));
            scheduledDirectPeriodicTask.m63719a(((ScheduledExecutorService) this.f54100b).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (Runnable runnable2) {
            C2667a.a(runnable2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
