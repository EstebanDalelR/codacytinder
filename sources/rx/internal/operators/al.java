package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.C2671a;
import rx.Observable.Operator;
import rx.Producer;
import rx.a$a;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.internal.schedulers.C19605e;
import rx.internal.schedulers.C19607i;
import rx.internal.util.C19613g;
import rx.internal.util.atomic.C19611d;
import rx.internal.util.unsafe.C19924r;
import rx.internal.util.unsafe.af;
import rx.p498c.C19401c;

public final class al<T> implements Operator<T, T> {
    /* renamed from: a */
    private final C2671a f62011a;
    /* renamed from: b */
    private final boolean f62012b;
    /* renamed from: c */
    private final int f62013c;

    /* renamed from: rx.internal.operators.al$a */
    static final class C19823a<T> extends C19571c<T> implements Action0 {
        /* renamed from: a */
        final C19571c<? super T> f62001a;
        /* renamed from: b */
        final a$a f62002b;
        /* renamed from: c */
        final boolean f62003c;
        /* renamed from: d */
        final Queue<Object> f62004d;
        /* renamed from: e */
        final int f62005e;
        /* renamed from: f */
        volatile boolean f62006f;
        /* renamed from: g */
        final AtomicLong f62007g = new AtomicLong();
        /* renamed from: h */
        final AtomicLong f62008h = new AtomicLong();
        /* renamed from: i */
        Throwable f62009i;
        /* renamed from: j */
        long f62010j;

        /* renamed from: rx.internal.operators.al$a$1 */
        class C195831 implements Producer {
            /* renamed from: a */
            final /* synthetic */ C19823a f61186a;

            C195831(C19823a c19823a) {
                this.f61186a = c19823a;
            }

            public void request(long j) {
                if (j > 0) {
                    C19419a.m69900a(this.f61186a.f62007g, j);
                    this.f61186a.m71447b();
                }
            }
        }

        public C19823a(C2671a c2671a, C19571c<? super T> c19571c, boolean z, int i) {
            this.f62001a = c19571c;
            this.f62002b = c2671a.createWorker();
            this.f62003c = z;
            if (i <= 0) {
                i = C19613g.f61292b;
            }
            this.f62005e = i - (i >> 2);
            if (af.m69984a() != null) {
                this.f62004d = new C19924r(i);
            } else {
                this.f62004d = new C19611d(i);
            }
            request((long) i);
        }

        /* renamed from: a */
        void m71445a() {
            C19571c c19571c = this.f62001a;
            c19571c.setProducer(new C195831(this));
            c19571c.add(this.f62002b);
            c19571c.add(this);
        }

        public void onNext(T t) {
            if (!isUnsubscribed()) {
                if (!this.f62006f) {
                    if (this.f62004d.offer(NotificationLite.m69885a((Object) t)) == null) {
                        onError(new MissingBackpressureException());
                    } else {
                        m71447b();
                    }
                }
            }
        }

        public void onCompleted() {
            if (!isUnsubscribed()) {
                if (!this.f62006f) {
                    this.f62006f = true;
                    m71447b();
                }
            }
        }

        public void onError(Throwable th) {
            if (!isUnsubscribed()) {
                if (!this.f62006f) {
                    this.f62009i = th;
                    this.f62006f = true;
                    m71447b();
                    return;
                }
            }
            C19401c.m69811a(th);
        }

        /* renamed from: b */
        protected void m71447b() {
            if (this.f62008h.getAndIncrement() == 0) {
                this.f62002b.mo14740a(this);
            }
        }

        public void call() {
            long j = this.f62010j;
            Queue queue = this.f62004d;
            C19571c c19571c = this.f62001a;
            long j2 = j;
            j = 1;
            do {
                long j3 = this.f62007g.get();
                while (j3 != j2) {
                    boolean z = this.f62006f;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!m71446a(z, z2, c19571c, queue)) {
                        if (z2) {
                            break;
                        }
                        c19571c.onNext(NotificationLite.m69891e(poll));
                        long j4 = j2 + 1;
                        if (j4 == ((long) this.f62005e)) {
                            j2 = C19419a.m69902b(this.f62007g, j4);
                            request(j4);
                            j3 = j2;
                            j2 = 0;
                        } else {
                            j2 = j4;
                        }
                    } else {
                        return;
                    }
                }
                if (j3 != j2 || !m71446a(this.f62006f, queue.isEmpty(), c19571c, queue)) {
                    this.f62010j = j2;
                    j = this.f62008h.addAndGet(-j);
                } else {
                    return;
                }
            } while (j != 0);
        }

        /* renamed from: a */
        boolean m71446a(boolean z, boolean z2, C19571c<? super T> c19571c, Queue<Object> queue) {
            if (c19571c.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (z) {
                if (!this.f62003c) {
                    z = this.f62009i;
                    if (z) {
                        queue.clear();
                        try {
                            c19571c.onError(z);
                            return true;
                        } finally {
                            this.f62002b.unsubscribe();
                        }
                    } else if (z2) {
                        try {
                            c19571c.onCompleted();
                            return true;
                        } finally {
                            this.f62002b.unsubscribe();
                        }
                    }
                } else if (z2) {
                    z = this.f62009i;
                    if (z) {
                        try {
                            c19571c.onError(z);
                        } catch (Throwable th) {
                            this.f62002b.unsubscribe();
                        }
                    } else {
                        c19571c.onCompleted();
                    }
                    this.f62002b.unsubscribe();
                }
            }
            return false;
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71448a((C19571c) obj);
    }

    public al(C2671a c2671a, boolean z, int i) {
        this.f62011a = c2671a;
        this.f62012b = z;
        if (i <= 0) {
            i = C19613g.f61292b;
        }
        this.f62013c = i;
    }

    /* renamed from: a */
    public C19571c<? super T> m71448a(C19571c<? super T> c19571c) {
        if ((this.f62011a instanceof C19605e) || (this.f62011a instanceof C19607i)) {
            return c19571c;
        }
        C19571c c19823a = new C19823a(this.f62011a, c19571c, this.f62012b, this.f62013c);
        c19823a.m71445a();
        return c19823a;
    }
}
