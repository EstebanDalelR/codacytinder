package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.exceptions.C19410a;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Func1;
import rx.internal.producers.C19598a;
import rx.internal.util.ExceptionsUtils;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.atomic.C19611d;
import rx.internal.util.unsafe.C19924r;
import rx.internal.util.unsafe.af;
import rx.observers.C19781e;
import rx.p498c.C19401c;
import rx.p500e.C19575d;

/* renamed from: rx.internal.operators.h */
public final class C19879h<T, R> implements OnSubscribe<R> {
    /* renamed from: a */
    final Observable<? extends T> f62266a;
    /* renamed from: b */
    final Func1<? super T, ? extends Observable<? extends R>> f62267b;
    /* renamed from: c */
    final int f62268c;
    /* renamed from: d */
    final int f62269d;

    /* renamed from: rx.internal.operators.h$a */
    static final class C19595a<T, R> implements Producer {
        /* renamed from: a */
        final R f61222a;
        /* renamed from: b */
        final C19733c<T, R> f61223b;
        /* renamed from: c */
        boolean f61224c;

        public C19595a(R r, C19733c<T, R> c19733c) {
            this.f61222a = r;
            this.f61223b = c19733c;
        }

        public void request(long j) {
            if (!this.f61224c && j > 0) {
                this.f61224c = 1;
                j = this.f61223b;
                j.m71001a(this.f61222a);
                j.m71004b(1);
            }
        }
    }

    /* renamed from: rx.internal.operators.h$b */
    static final class C19732b<T, R> extends C19571c<R> {
        /* renamed from: a */
        final C19733c<T, R> f61731a;
        /* renamed from: b */
        long f61732b;

        public C19732b(C19733c<T, R> c19733c) {
            this.f61731a = c19733c;
        }

        public void setProducer(Producer producer) {
            this.f61731a.f61736d.m70607a(producer);
        }

        public void onNext(R r) {
            this.f61732b++;
            this.f61731a.m71001a((Object) r);
        }

        public void onError(Throwable th) {
            this.f61731a.m71003a(th, this.f61732b);
        }

        public void onCompleted() {
            this.f61731a.m71004b(this.f61732b);
        }
    }

    /* renamed from: rx.internal.operators.h$c */
    static final class C19733c<T, R> extends C19571c<T> {
        /* renamed from: a */
        final C19571c<? super R> f61733a;
        /* renamed from: b */
        final Func1<? super T, ? extends Observable<? extends R>> f61734b;
        /* renamed from: c */
        final int f61735c;
        /* renamed from: d */
        final C19598a f61736d = new C19598a();
        /* renamed from: e */
        final Queue<Object> f61737e;
        /* renamed from: f */
        final AtomicInteger f61738f = new AtomicInteger();
        /* renamed from: g */
        final AtomicReference<Throwable> f61739g = new AtomicReference();
        /* renamed from: h */
        final C19575d f61740h;
        /* renamed from: i */
        volatile boolean f61741i;
        /* renamed from: j */
        volatile boolean f61742j;

        public C19733c(C19571c<? super R> c19571c, Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2) {
            this.f61733a = c19571c;
            this.f61734b = func1;
            this.f61735c = i2;
            if (af.m69984a() != null) {
                c19571c = new C19924r(i);
            } else {
                c19571c = new C19611d(i);
            }
            this.f61737e = c19571c;
            this.f61740h = new C19575d();
            request((long) i);
        }

        public void onNext(T t) {
            if (this.f61737e.offer(NotificationLite.m69885a((Object) t)) == null) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            m70999a();
        }

        public void onError(Throwable th) {
            if (ExceptionsUtils.addThrowable(this.f61739g, th)) {
                this.f61741i = true;
                if (this.f61735c == null) {
                    th = ExceptionsUtils.terminate(this.f61739g);
                    if (!ExceptionsUtils.isTerminated(th)) {
                        this.f61733a.onError(th);
                    }
                    this.f61740h.unsubscribe();
                    return;
                }
                m70999a();
                return;
            }
            m71002a(th);
        }

        public void onCompleted() {
            this.f61741i = true;
            m70999a();
        }

        /* renamed from: a */
        void m71000a(long j) {
            if (j > 0) {
                this.f61736d.request(j);
            } else if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("n >= 0 required but it was ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        /* renamed from: a */
        void m71001a(R r) {
            this.f61733a.onNext(r);
        }

        /* renamed from: a */
        void m71003a(Throwable th, long j) {
            if (!ExceptionsUtils.addThrowable(this.f61739g, th)) {
                m71002a(th);
            } else if (this.f61735c == null) {
                th = ExceptionsUtils.terminate(this.f61739g);
                if (ExceptionsUtils.isTerminated(th) == null) {
                    this.f61733a.onError(th);
                }
                unsubscribe();
            } else {
                if (j != 0) {
                    this.f61736d.m70606a(j);
                }
                this.f61742j = null;
                m70999a();
            }
        }

        /* renamed from: b */
        void m71004b(long j) {
            if (j != 0) {
                this.f61736d.m70606a(j);
            }
            this.f61742j = 0;
            m70999a();
        }

        /* renamed from: a */
        void m71002a(Throwable th) {
            C19401c.m69811a(th);
        }

        /* renamed from: a */
        void m70999a() {
            if (this.f61738f.getAndIncrement() == 0) {
                int i = this.f61735c;
                while (!this.f61733a.isUnsubscribed()) {
                    if (!this.f61742j) {
                        Throwable terminate;
                        if (i != 1 || this.f61739g.get() == null) {
                            boolean z = this.f61741i;
                            Object poll = this.f61737e.poll();
                            Object obj = poll == null ? 1 : null;
                            if (z && obj != null) {
                                terminate = ExceptionsUtils.terminate(this.f61739g);
                                if (terminate == null) {
                                    this.f61733a.onCompleted();
                                } else if (!ExceptionsUtils.isTerminated(terminate)) {
                                    this.f61733a.onError(terminate);
                                }
                                return;
                            } else if (obj == null) {
                                try {
                                    Observable observable = (Observable) this.f61734b.call(NotificationLite.m69891e(poll));
                                    if (observable == null) {
                                        m71005b(new NullPointerException("The source returned by the mapper was null"));
                                        return;
                                    } else if (observable != Observable.m69640c()) {
                                        if (observable instanceof ScalarSynchronousObservable) {
                                            ScalarSynchronousObservable scalarSynchronousObservable = (ScalarSynchronousObservable) observable;
                                            this.f61742j = true;
                                            this.f61736d.m70607a(new C19595a(scalarSynchronousObservable.m70628w(), this));
                                        } else {
                                            C19571c c19732b = new C19732b(this);
                                            this.f61740h.m70554a(c19732b);
                                            if (!c19732b.isUnsubscribed()) {
                                                this.f61742j = true;
                                                observable.m69661a(c19732b);
                                            } else {
                                                return;
                                            }
                                        }
                                        request(1);
                                    } else {
                                        request(1);
                                    }
                                } catch (Throwable terminate2) {
                                    C19410a.m69874b(terminate2);
                                    m71005b(terminate2);
                                    return;
                                }
                            }
                        }
                        terminate2 = ExceptionsUtils.terminate(this.f61739g);
                        if (!ExceptionsUtils.isTerminated(terminate2)) {
                            this.f61733a.onError(terminate2);
                        }
                        return;
                    }
                    if (this.f61738f.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        void m71005b(Throwable th) {
            unsubscribe();
            if (ExceptionsUtils.addThrowable(this.f61739g, th)) {
                th = ExceptionsUtils.terminate(this.f61739g);
                if (!ExceptionsUtils.isTerminated(th)) {
                    this.f61733a.onError(th);
                    return;
                }
                return;
            }
            m71002a(th);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71606a((C19571c) obj);
    }

    public C19879h(Observable<? extends T> observable, Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2) {
        this.f62266a = observable;
        this.f62267b = func1;
        this.f62268c = i;
        this.f62269d = i2;
    }

    /* renamed from: a */
    public void m71606a(C19571c<? super R> c19571c) {
        final C19571c c19733c = new C19733c(this.f62269d == 0 ? new C19781e(c19571c) : c19571c, this.f62267b, this.f62268c, this.f62269d);
        c19571c.add(c19733c);
        c19571c.add(c19733c.f61740h);
        c19571c.setProducer(new Producer(this) {
            /* renamed from: b */
            final /* synthetic */ C19879h f61221b;

            public void request(long j) {
                c19733c.m71000a(j);
            }
        });
        if (c19571c.isUnsubscribed() == null) {
            this.f62266a.m69661a(c19733c);
        }
    }
}
