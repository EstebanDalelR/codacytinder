package io.reactivex.internal.schedulers;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.C17364d;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.a */
public final class C17514a extends C15679f implements SchedulerMultiWorkerSupport {
    /* renamed from: b */
    static final C17513b f54109b = new C17513b(0, f54110c);
    /* renamed from: c */
    static final RxThreadFactory f54110c = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
    /* renamed from: d */
    static final int f54111d = C17514a.m63727a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());
    /* renamed from: e */
    static final C19034c f54112e = new C19034c(new RxThreadFactory("RxComputationShutdown"));
    /* renamed from: f */
    final ThreadFactory f54113f;
    /* renamed from: g */
    final AtomicReference<C17513b> f54114g;

    /* renamed from: io.reactivex.internal.schedulers.a$b */
    static final class C17513b implements SchedulerMultiWorkerSupport {
        /* renamed from: a */
        final int f54106a;
        /* renamed from: b */
        final C19034c[] f54107b;
        /* renamed from: c */
        long f54108c;

        C17513b(int i, ThreadFactory threadFactory) {
            this.f54106a = i;
            this.f54107b = new C19034c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f54107b[i2] = new C19034c(threadFactory);
            }
        }

        /* renamed from: a */
        public C19034c m63725a() {
            int i = this.f54106a;
            if (i == 0) {
                return C17514a.f54112e;
            }
            C19034c[] c19034cArr = this.f54107b;
            long j = this.f54108c;
            this.f54108c = j + 1;
            return c19034cArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void m63726b() {
            for (C19034c dispose : this.f54107b) {
                dispose.dispose();
            }
        }

        public void createWorkers(int i, WorkerCallback workerCallback) {
            int i2 = this.f54106a;
            if (i2 == 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    workerCallback.onWorker(i3, C17514a.f54112e);
                }
                return;
            }
            int i4 = ((int) this.f54108c) % i2;
            for (int i5 = 0; i5 < i; i5++) {
                workerCallback.onWorker(i5, new C18424a(this.f54107b[i4]));
                i4++;
                if (i4 == i2) {
                    i4 = 0;
                }
            }
            this.f54108c = (long) i4;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.a$a */
    static final class C18424a extends C17362c {
        /* renamed from: a */
        volatile boolean f57367a;
        /* renamed from: b */
        private final C17364d f57368b = new C17364d();
        /* renamed from: c */
        private final C17356a f57369c = new C17356a();
        /* renamed from: d */
        private final C17364d f57370d = new C17364d();
        /* renamed from: e */
        private final C19034c f57371e;

        C18424a(C19034c c19034c) {
            this.f57371e = c19034c;
            this.f57370d.add(this.f57368b);
            this.f57370d.add(this.f57369c);
        }

        public void dispose() {
            if (!this.f57367a) {
                this.f57367a = true;
                this.f57370d.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f57367a;
        }

        @NonNull
        /* renamed from: a */
        public Disposable mo13593a(@NonNull Runnable runnable) {
            if (this.f57367a) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f57371e.m66588a(runnable, 0, TimeUnit.MILLISECONDS, this.f57368b);
        }

        @NonNull
        /* renamed from: a */
        public Disposable mo13559a(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (this.f57367a) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f57371e.m66588a(runnable, j, timeUnit, this.f57369c);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.a$c */
    static final class C19034c extends C18426f {
        C19034c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    /* renamed from: a */
    static int m63727a(int i, int i2) {
        return i2 > 0 ? i2 > i ? i : i2 : i;
    }

    static {
        f54112e.dispose();
        f54109b.m63726b();
    }

    public C17514a() {
        this(f54110c);
    }

    public C17514a(ThreadFactory threadFactory) {
        this.f54113f = threadFactory;
        this.f54114g = new AtomicReference(f54109b);
        mo12921b();
    }

    @NonNull
    /* renamed from: a */
    public C17362c mo12872a() {
        return new C18424a(((C17513b) this.f54114g.get()).m63725a());
    }

    public void createWorkers(int i, WorkerCallback workerCallback) {
        C15684a.m58891a(i, "number > 0 required");
        ((C17513b) this.f54114g.get()).createWorkers(i, workerCallback);
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo12871a(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C17513b) this.f54114g.get()).m63725a().m66590b(runnable, j, timeUnit);
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo12919a(@NonNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((C17513b) this.f54114g.get()).m63725a().m66589b(runnable, j, j2, timeUnit);
    }

    /* renamed from: b */
    public void mo12921b() {
        C17513b c17513b = new C17513b(f54111d, this.f54113f);
        if (!this.f54114g.compareAndSet(f54109b, c17513b)) {
            c17513b.m63726b();
        }
    }
}
