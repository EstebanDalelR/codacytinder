package io.reactivex.internal.schedulers;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.C15676b;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.internal.schedulers.i */
public final class C17519i extends C15679f {
    /* renamed from: b */
    private static final C17519i f54134b = new C17519i();

    /* renamed from: io.reactivex.internal.schedulers.i$a */
    static final class C15732a implements Runnable {
        /* renamed from: a */
        private final Runnable f48642a;
        /* renamed from: b */
        private final C18428c f48643b;
        /* renamed from: c */
        private final long f48644c;

        C15732a(Runnable runnable, C18428c c18428c, long j) {
            this.f48642a = runnable;
            this.f48643b = c18428c;
            this.f48644c = j;
        }

        public void run() {
            if (!this.f48643b.f57383c) {
                long a = this.f48643b.m63452a(TimeUnit.MILLISECONDS);
                if (this.f48644c > a) {
                    long j = this.f48644c - a;
                    if (j > 0) {
                        try {
                            Thread.sleep(j);
                        } catch (Throwable e) {
                            Thread.currentThread().interrupt();
                            C2667a.a(e);
                            return;
                        }
                    }
                }
                if (!this.f48643b.f57383c) {
                    this.f48642a.run();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.i$b */
    static final class C15733b implements Comparable<C15733b> {
        /* renamed from: a */
        final Runnable f48645a;
        /* renamed from: b */
        final long f48646b;
        /* renamed from: c */
        final int f48647c;
        /* renamed from: d */
        volatile boolean f48648d;

        public /* synthetic */ int compareTo(Object obj) {
            return m58954a((C15733b) obj);
        }

        C15733b(Runnable runnable, Long l, int i) {
            this.f48645a = runnable;
            this.f48646b = l.longValue();
            this.f48647c = i;
        }

        /* renamed from: a */
        public int m58954a(C15733b c15733b) {
            int a = C15684a.m58892a(this.f48646b, c15733b.f48646b);
            return a == 0 ? C15684a.m58890a(this.f48647c, c15733b.f48647c) : a;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.i$c */
    static final class C18428c extends C17362c implements Disposable {
        /* renamed from: a */
        final PriorityBlockingQueue<C15733b> f57381a = new PriorityBlockingQueue();
        /* renamed from: b */
        final AtomicInteger f57382b = new AtomicInteger();
        /* renamed from: c */
        volatile boolean f57383c;
        /* renamed from: d */
        private final AtomicInteger f57384d = new AtomicInteger();

        /* renamed from: io.reactivex.internal.schedulers.i$c$a */
        final class C15734a implements Runnable {
            /* renamed from: a */
            final C15733b f48649a;
            /* renamed from: b */
            final /* synthetic */ C18428c f48650b;

            C15734a(C18428c c18428c, C15733b c15733b) {
                this.f48650b = c18428c;
                this.f48649a = c15733b;
            }

            public void run() {
                this.f48649a.f48648d = true;
                this.f48650b.f57381a.remove(this.f48649a);
            }
        }

        C18428c() {
        }

        @NonNull
        /* renamed from: a */
        public Disposable mo13593a(@NonNull Runnable runnable) {
            return m66594a(runnable, m63452a(TimeUnit.MILLISECONDS));
        }

        @NonNull
        /* renamed from: a */
        public Disposable mo13559a(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            long a = m63452a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return m66594a(new C15732a(runnable, this, a), a);
        }

        /* renamed from: a */
        Disposable m66594a(Runnable runnable, long j) {
            if (this.f57383c) {
                return EmptyDisposable.INSTANCE;
            }
            C15733b c15733b = new C15733b(runnable, Long.valueOf(j), this.f57382b.incrementAndGet());
            this.f57381a.add(c15733b);
            if (this.f57384d.getAndIncrement() != null) {
                return C15676b.m58841a(new C15734a(this, c15733b));
            }
            runnable = true;
            while (this.f57383c == null) {
                C15733b c15733b2 = (C15733b) this.f57381a.poll();
                if (c15733b2 == null) {
                    runnable = this.f57384d.addAndGet(-runnable);
                    if (runnable == null) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!c15733b2.f48648d) {
                    c15733b2.f48645a.run();
                }
            }
            this.f57381a.clear();
            return EmptyDisposable.INSTANCE;
        }

        public void dispose() {
            this.f57383c = true;
        }

        public boolean isDisposed() {
            return this.f57383c;
        }
    }

    /* renamed from: c */
    public static C17519i m63743c() {
        return f54134b;
    }

    @NonNull
    /* renamed from: a */
    public C17362c mo12872a() {
        return new C18428c();
    }

    C17519i() {
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo12918a(@NonNull Runnable runnable) {
        C2667a.a(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @NonNull
    /* renamed from: a */
    public Disposable mo12871a(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C2667a.a(runnable).run();
        } catch (Runnable runnable2) {
            Thread.currentThread().interrupt();
            C2667a.a(runnable2);
        }
        return EmptyDisposable.INSTANCE;
    }
}
