package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.C18426f;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.p079d.C2667a;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.f */
public abstract class C15679f {
    /* renamed from: a */
    static final long f48537a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: io.reactivex.f$a */
    static final class C17359a implements Disposable, SchedulerRunnableIntrospection, Runnable {
        /* renamed from: a */
        final Runnable f53095a;
        /* renamed from: b */
        final C17362c f53096b;
        /* renamed from: c */
        Thread f53097c;

        C17359a(Runnable runnable, C17362c c17362c) {
            this.f53095a = runnable;
            this.f53096b = c17362c;
        }

        public void run() {
            this.f53097c = Thread.currentThread();
            try {
                this.f53095a.run();
            } finally {
                dispose();
                this.f53097c = null;
            }
        }

        public void dispose() {
            if (this.f53097c == Thread.currentThread() && (this.f53096b instanceof C18426f)) {
                ((C18426f) this.f53096b).m66591b();
            } else {
                this.f53096b.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f53096b.isDisposed();
        }

        public Runnable getWrappedRunnable() {
            return this.f53095a;
        }
    }

    /* renamed from: io.reactivex.f$b */
    static class C17360b implements Disposable, SchedulerRunnableIntrospection, Runnable {
        /* renamed from: a */
        final Runnable f53098a;
        @NonNull
        /* renamed from: b */
        final C17362c f53099b;
        @NonNull
        /* renamed from: c */
        volatile boolean f53100c;

        C17360b(@NonNull Runnable runnable, @NonNull C17362c c17362c) {
            this.f53098a = runnable;
            this.f53099b = c17362c;
        }

        public void run() {
            if (!this.f53100c) {
                try {
                    this.f53098a.run();
                } catch (Throwable th) {
                    C15678a.m58850b(th);
                    this.f53099b.dispose();
                    RuntimeException a = ExceptionHelper.m58962a(th);
                }
            }
        }

        public void dispose() {
            this.f53100c = true;
            this.f53099b.dispose();
        }

        public boolean isDisposed() {
            return this.f53100c;
        }

        public Runnable getWrappedRunnable() {
            return this.f53098a;
        }
    }

    /* renamed from: io.reactivex.f$c */
    public static abstract class C17362c implements Disposable {

        /* renamed from: io.reactivex.f$c$a */
        final class C17361a implements SchedulerRunnableIntrospection, Runnable {
            @NonNull
            /* renamed from: a */
            final Runnable f53101a;
            @NonNull
            /* renamed from: b */
            final SequentialDisposable f53102b;
            /* renamed from: c */
            final long f53103c;
            /* renamed from: d */
            long f53104d;
            /* renamed from: e */
            long f53105e;
            /* renamed from: f */
            long f53106f;
            /* renamed from: g */
            final /* synthetic */ C17362c f53107g;

            C17361a(C17362c c17362c, long j, @NonNull Runnable runnable, long j2, @NonNull SequentialDisposable sequentialDisposable, long j3) {
                this.f53107g = c17362c;
                this.f53101a = runnable;
                this.f53102b = sequentialDisposable;
                this.f53103c = j3;
                this.f53105e = j2;
                this.f53106f = j;
            }

            public void run() {
                this.f53101a.run();
                if (!this.f53102b.isDisposed()) {
                    long j;
                    long j2;
                    long a = this.f53107g.m63452a(TimeUnit.NANOSECONDS);
                    if (a + C15679f.f48537a >= this.f53105e) {
                        if (a < (this.f53105e + this.f53103c) + C15679f.f48537a) {
                            j = this.f53106f;
                            long j3 = this.f53104d + 1;
                            this.f53104d = j3;
                            j2 = j + (j3 * this.f53103c);
                            this.f53105e = a;
                            this.f53102b.m63458b(this.f53107g.mo13559a(this, j2 - a, TimeUnit.NANOSECONDS));
                        }
                    }
                    long j4 = a + this.f53103c;
                    j = this.f53103c;
                    long j5 = this.f53104d + 1;
                    this.f53104d = j5;
                    this.f53106f = j4 - (j * j5);
                    j2 = j4;
                    this.f53105e = a;
                    this.f53102b.m63458b(this.f53107g.mo13559a(this, j2 - a, TimeUnit.NANOSECONDS));
                }
            }

            public Runnable getWrappedRunnable() {
                return this.f53101a;
            }
        }

        @NonNull
        /* renamed from: a */
        public abstract Disposable mo13559a(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit);

        @NonNull
        /* renamed from: a */
        public Disposable mo13593a(@NonNull Runnable runnable) {
            return mo13559a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        @NonNull
        /* renamed from: a */
        public Disposable m63454a(@NonNull Runnable runnable, long j, long j2, @NonNull TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            Disposable sequentialDisposable = new SequentialDisposable();
            Disposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable a = C2667a.a(runnable);
            long toNanos = timeUnit2.toNanos(j2);
            long a2 = m63452a(TimeUnit.NANOSECONDS);
            Disposable disposable = sequentialDisposable;
            C17361a c17361a = r0;
            C17361a c17361a2 = new C17361a(this, a2 + timeUnit2.toNanos(j3), a, a2, sequentialDisposable2, toNanos);
            Disposable a3 = mo13559a(c17361a, j3, timeUnit2);
            if (a3 == EmptyDisposable.INSTANCE) {
                return a3;
            }
            disposable.m63458b(a3);
            return sequentialDisposable2;
        }

        /* renamed from: a */
        public long m63452a(@NonNull TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    @NonNull
    /* renamed from: a */
    public abstract C17362c mo12872a();

    /* renamed from: b */
    public void mo12921b() {
    }

    /* renamed from: a */
    public long m58851a(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo12918a(@NonNull Runnable runnable) {
        return mo12871a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo12871a(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        C17362c a = mo12872a();
        Object c17359a = new C17359a(C2667a.a(runnable), a);
        a.mo13559a(c17359a, j, timeUnit);
        return c17359a;
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo12919a(@NonNull Runnable runnable, long j, long j2, @NonNull TimeUnit timeUnit) {
        C17362c a = mo12872a();
        Disposable c17360b = new C17360b(C2667a.a(runnable), a);
        runnable = a.m63454a(c17360b, j, j2, timeUnit);
        return runnable == EmptyDisposable.INSTANCE ? runnable : c17360b;
    }
}
