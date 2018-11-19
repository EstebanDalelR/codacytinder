package rx.internal.operators;

import com.google.android.exoplayer2.Format;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.Observable.Operator;
import rx.Observer;
import rx.Producer;
import rx.exceptions.C19410a;
import rx.functions.Func0;
import rx.functions.Func2;
import rx.internal.util.atomic.C19612f;
import rx.internal.util.unsafe.C19915y;
import rx.internal.util.unsafe.af;

public final class as<R, T> implements Operator<R, T> {
    /* renamed from: c */
    private static final Object f62030c = new Object();
    /* renamed from: a */
    final Func2<R, ? super T, R> f62031a;
    /* renamed from: b */
    private final Func0<R> f62032b;

    /* renamed from: rx.internal.operators.as$a */
    static final class C19585a<R> implements Observer<R>, Producer {
        /* renamed from: a */
        final C19571c<? super R> f61189a;
        /* renamed from: b */
        final Queue<Object> f61190b;
        /* renamed from: c */
        boolean f61191c;
        /* renamed from: d */
        boolean f61192d;
        /* renamed from: e */
        long f61193e;
        /* renamed from: f */
        final AtomicLong f61194f;
        /* renamed from: g */
        volatile Producer f61195g;
        /* renamed from: h */
        volatile boolean f61196h;
        /* renamed from: i */
        Throwable f61197i;

        public C19585a(R r, C19571c<? super R> c19571c) {
            this.f61189a = c19571c;
            if (af.m69984a() != null) {
                c19571c = new C19915y();
            } else {
                c19571c = new C19612f();
            }
            this.f61190b = c19571c;
            c19571c.offer(NotificationLite.m69885a((Object) r));
            this.f61194f = new AtomicLong();
        }

        public void onNext(R r) {
            this.f61190b.offer(NotificationLite.m69885a((Object) r));
            m70597a();
        }

        /* renamed from: a */
        boolean m70599a(boolean z, boolean z2, C19571c<? super R> c19571c) {
            if (c19571c.isUnsubscribed()) {
                return true;
            }
            if (z) {
                z = this.f61197i;
                if (z) {
                    c19571c.onError(z);
                    return true;
                } else if (z2) {
                    c19571c.onCompleted();
                    return true;
                }
            }
            return false;
        }

        public void onError(Throwable th) {
            this.f61197i = th;
            this.f61196h = true;
            m70597a();
        }

        public void onCompleted() {
            this.f61196h = true;
            m70597a();
        }

        public void request(long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("n >= required but it was ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (j != 0) {
                C19419a.m69900a(this.f61194f, j);
                Producer producer = this.f61195g;
                if (producer == null) {
                    synchronized (this.f61194f) {
                        producer = this.f61195g;
                        if (producer == null) {
                            this.f61193e = C19419a.m69899a(this.f61193e, j);
                        }
                    }
                }
                if (producer != null) {
                    producer.request(j);
                }
                m70597a();
            }
        }

        /* renamed from: a */
        public void m70598a(Producer producer) {
            if (producer == null) {
                throw new NullPointerException();
            }
            synchronized (this.f61194f) {
                if (this.f61195g != null) {
                    throw new IllegalStateException("Can't set more than one Producer!");
                }
                long j = this.f61193e;
                if (j != Format.OFFSET_SAMPLE_RELATIVE) {
                    j--;
                }
                this.f61193e = 0;
                this.f61195g = producer;
            }
            if (j > 0) {
                producer.request(j);
            }
            m70597a();
        }

        /* renamed from: a */
        void m70597a() {
            synchronized (this) {
                if (this.f61191c) {
                    this.f61192d = true;
                    return;
                }
                this.f61191c = true;
                m70600b();
            }
        }

        /* renamed from: b */
        void m70600b() {
            Observer observer = this.f61189a;
            Queue queue = this.f61190b;
            AtomicLong atomicLong = this.f61194f;
            long j = atomicLong.get();
            while (!m70599a(this.f61196h, queue.isEmpty(), observer)) {
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f61196h;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!m70599a(z, z2, observer)) {
                        if (z2) {
                            break;
                        }
                        Object e = NotificationLite.m69891e(poll);
                        try {
                            observer.onNext(e);
                            j2++;
                        } catch (Throwable th) {
                            C19410a.m69870a(th, observer, e);
                            return;
                        }
                    }
                    return;
                }
                if (!(j2 == 0 || j == Format.OFFSET_SAMPLE_RELATIVE)) {
                    j = C19419a.m69902b(atomicLong, j2);
                }
                synchronized (this) {
                    if (this.f61192d) {
                        this.f61192d = false;
                    } else {
                        this.f61191c = false;
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.as$1 */
    class C197011 implements Func0<R> {
        /* renamed from: a */
        final /* synthetic */ Object f61627a;

        C197011(Object obj) {
            this.f61627a = obj;
        }

        public R call() {
            return this.f61627a;
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71459a((C19571c) obj);
    }

    public as(R r, Func2<R, ? super T, R> func2) {
        this(new C197011(r), (Func2) func2);
    }

    public as(Func0<R> func0, Func2<R, ? super T, R> func2) {
        this.f62032b = func0;
        this.f62031a = func2;
    }

    /* renamed from: a */
    public C19571c<? super T> m71459a(final C19571c<? super R> c19571c) {
        final Object call = this.f62032b.call();
        if (call == f62030c) {
            return new C19571c<T>(this, c19571c) {
                /* renamed from: a */
                boolean f61628a;
                /* renamed from: b */
                R f61629b;
                /* renamed from: d */
                final /* synthetic */ as f61631d;

                public void onNext(T t) {
                    if (this.f61628a) {
                        try {
                            t = this.f61631d.f62031a.call(this.f61629b, t);
                        } catch (Throwable th) {
                            C19410a.m69870a(th, c19571c, (Object) t);
                            return;
                        }
                    }
                    this.f61628a = true;
                    this.f61629b = t;
                    c19571c.onNext(t);
                }

                public void onError(Throwable th) {
                    c19571c.onError(th);
                }

                public void onCompleted() {
                    c19571c.onCompleted();
                }
            };
        }
        final Producer c19585a = new C19585a(call, c19571c);
        Object c197033 = new C19571c<T>(this) {
            /* renamed from: c */
            final /* synthetic */ as f61634c;
            /* renamed from: d */
            private R f61635d = call;

            public void onNext(T t) {
                try {
                    Object call = this.f61634c.f62031a.call(this.f61635d, t);
                    this.f61635d = call;
                    c19585a.onNext(call);
                } catch (Throwable th) {
                    C19410a.m69870a(th, (Observer) this, (Object) t);
                }
            }

            public void onError(Throwable th) {
                c19585a.onError(th);
            }

            public void onCompleted() {
                c19585a.onCompleted();
            }

            public void setProducer(Producer producer) {
                c19585a.m70598a(producer);
            }
        };
        c19571c.add(c197033);
        c19571c.setProducer(c19585a);
        return c197033;
    }
}
