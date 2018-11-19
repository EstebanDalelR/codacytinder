package rx.internal.util;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.C19571c;
import rx.C2671a;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Observer;
import rx.Producer;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.producers.SingleProducer;
import rx.internal.schedulers.C19602b;
import rx.observers.C19450f;
import rx.p498c.C19401c;

public final class ScalarSynchronousObservable<T> extends Observable<T> {
    /* renamed from: c */
    static final boolean f61282c = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();
    /* renamed from: b */
    final T f61283b;

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$c */
    static final class C19608c<T> implements Producer {
        /* renamed from: a */
        final C19571c<? super T> f61279a;
        /* renamed from: b */
        final T f61280b;
        /* renamed from: c */
        boolean f61281c;

        public C19608c(C19571c<? super T> c19571c, T t) {
            this.f61279a = c19571c;
            this.f61280b = t;
        }

        public void request(long j) {
            if (!this.f61281c) {
                if (j < 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("n >= required but it was ");
                    stringBuilder.append(j);
                    throw new IllegalStateException(stringBuilder.toString());
                } else if (j != 0) {
                    this.f61281c = 1;
                    Observer observer = this.f61279a;
                    if (!observer.isUnsubscribed()) {
                        Object obj = this.f61280b;
                        try {
                            observer.onNext(obj);
                            if (!observer.isUnsubscribed()) {
                                observer.onCompleted();
                            }
                        } catch (Throwable th) {
                            C19410a.m69870a(th, observer, obj);
                        }
                    }
                }
            }
        }
    }

    static final class ScalarAsyncProducer<T> extends AtomicBoolean implements Producer, Action0 {
        private static final long serialVersionUID = -2466317989629281651L;
        /* renamed from: a */
        final C19571c<? super T> f62129a;
        /* renamed from: b */
        final T f62130b;
        /* renamed from: c */
        final Func1<Action0, Subscription> f62131c;

        public ScalarAsyncProducer(C19571c<? super T> c19571c, T t, Func1<Action0, Subscription> func1) {
            this.f62129a = c19571c;
            this.f62130b = t;
            this.f62131c = func1;
        }

        public void request(long j) {
            if (j < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("n >= 0 required but it was ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (j != 0 && compareAndSet(0, true) != null) {
                this.f62129a.add((Subscription) this.f62131c.call(this));
            }
        }

        public void call() {
            Observer observer = this.f62129a;
            if (!observer.isUnsubscribed()) {
                Object obj = this.f62130b;
                try {
                    observer.onNext(obj);
                    if (!observer.isUnsubscribed()) {
                        observer.onCompleted();
                    }
                } catch (Throwable th) {
                    C19410a.m69870a(th, observer, obj);
                }
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ScalarAsyncProducer[");
            stringBuilder.append(this.f62130b);
            stringBuilder.append(", ");
            stringBuilder.append(get());
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$a */
    static final class C19902a<T> implements OnSubscribe<T> {
        /* renamed from: a */
        final T f62329a;

        public /* synthetic */ void call(Object obj) {
            m71640a((C19571c) obj);
        }

        C19902a(T t) {
            this.f62329a = t;
        }

        /* renamed from: a */
        public void m71640a(C19571c<? super T> c19571c) {
            c19571c.setProducer(ScalarSynchronousObservable.m70624a(c19571c, this.f62329a));
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$b */
    static final class C19903b<T> implements OnSubscribe<T> {
        /* renamed from: a */
        final T f62330a;
        /* renamed from: b */
        final Func1<Action0, Subscription> f62331b;

        public /* synthetic */ void call(Object obj) {
            m71641a((C19571c) obj);
        }

        C19903b(T t, Func1<Action0, Subscription> func1) {
            this.f62330a = t;
            this.f62331b = func1;
        }

        /* renamed from: a */
        public void m71641a(C19571c<? super T> c19571c) {
            c19571c.setProducer(new ScalarAsyncProducer(c19571c, this.f62330a, this.f62331b));
        }
    }

    /* renamed from: a */
    static <T> Producer m70624a(C19571c<? super T> c19571c, T t) {
        if (f61282c) {
            return new SingleProducer(c19571c, t);
        }
        return new C19608c(c19571c, t);
    }

    /* renamed from: f */
    public static <T> ScalarSynchronousObservable<T> m70625f(T t) {
        return new ScalarSynchronousObservable(t);
    }

    protected ScalarSynchronousObservable(T t) {
        super(C19401c.m69802a(new C19902a(t)));
        this.f61283b = t;
    }

    /* renamed from: w */
    public T m70628w() {
        return this.f61283b;
    }

    /* renamed from: c */
    public Observable<T> m70627c(final C2671a c2671a) {
        Func1 c197731;
        if (c2671a instanceof C19602b) {
            final C19602b c19602b = (C19602b) c2671a;
            c197731 = new Func1<Action0, Subscription>(this) {
                /* renamed from: b */
                final /* synthetic */ ScalarSynchronousObservable f61845b;

                public /* synthetic */ Object call(Object obj) {
                    return m71055a((Action0) obj);
                }

                /* renamed from: a */
                public Subscription m71055a(Action0 action0) {
                    return c19602b.m70615a(action0);
                }
            };
        } else {
            c197731 = new Func1<Action0, Subscription>(this) {
                /* renamed from: b */
                final /* synthetic */ ScalarSynchronousObservable f61847b;

                public /* synthetic */ Object call(Object obj) {
                    return m71056a((Action0) obj);
                }

                /* renamed from: a */
                public Subscription m71056a(final Action0 action0) {
                    final Subscription createWorker = c2671a.createWorker();
                    createWorker.mo14740a(new Action0(this) {
                        /* renamed from: c */
                        final /* synthetic */ C197742 f62128c;

                        public void call() {
                            try {
                                action0.call();
                            } finally {
                                createWorker.unsubscribe();
                            }
                        }
                    });
                    return createWorker;
                }
            };
        }
        return Observable.m69634b((OnSubscribe) new C19903b(this.f61283b, c197731));
    }

    /* renamed from: a */
    public <R> Observable<R> m70626a(final Func1<? super T, ? extends Observable<? extends R>> func1) {
        return Observable.m69634b(new OnSubscribe<R>(this) {
            /* renamed from: b */
            final /* synthetic */ ScalarSynchronousObservable f62328b;

            public /* synthetic */ void call(Object obj) {
                m71639a((C19571c) obj);
            }

            /* renamed from: a */
            public void m71639a(C19571c<? super R> c19571c) {
                Observable observable = (Observable) func1.call(this.f62328b.f61283b);
                if (observable instanceof ScalarSynchronousObservable) {
                    c19571c.setProducer(ScalarSynchronousObservable.m70624a(c19571c, ((ScalarSynchronousObservable) observable).f61283b));
                } else {
                    observable.m69661a(C19450f.m69991a((C19571c) c19571c));
                }
            }
        });
    }
}
