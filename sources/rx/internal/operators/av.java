package rx.internal.operators;

import rx.C19571c;
import rx.C2671a;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.a$a;
import rx.functions.Action0;

public final class av<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final C2671a f62224a;
    /* renamed from: b */
    final Observable<T> f62225b;
    /* renamed from: c */
    final boolean f62226c;

    /* renamed from: rx.internal.operators.av$a */
    static final class C19827a<T> extends C19571c<T> implements Action0 {
        /* renamed from: a */
        final C19571c<? super T> f62038a;
        /* renamed from: b */
        final boolean f62039b;
        /* renamed from: c */
        final a$a f62040c;
        /* renamed from: d */
        Observable<T> f62041d;
        /* renamed from: e */
        Thread f62042e;

        C19827a(C19571c<? super T> c19571c, boolean z, a$a a_a, Observable<T> observable) {
            this.f62038a = c19571c;
            this.f62039b = z;
            this.f62040c = a_a;
            this.f62041d = observable;
        }

        public void onNext(T t) {
            this.f62038a.onNext(t);
        }

        public void onError(Throwable th) {
            try {
                this.f62038a.onError(th);
            } finally {
                this.f62040c.unsubscribe();
            }
        }

        public void onCompleted() {
            try {
                this.f62038a.onCompleted();
            } finally {
                this.f62040c.unsubscribe();
            }
        }

        public void call() {
            Observable observable = this.f62041d;
            this.f62041d = null;
            this.f62042e = Thread.currentThread();
            observable.m69661a((C19571c) this);
        }

        public void setProducer(final Producer producer) {
            this.f62038a.setProducer(new Producer(this) {
                /* renamed from: b */
                final /* synthetic */ C19827a f61199b;

                public void request(final long j) {
                    if (this.f61199b.f62042e != Thread.currentThread()) {
                        if (this.f61199b.f62039b) {
                            this.f61199b.f62040c.mo14740a(new Action0(this) {
                                /* renamed from: b */
                                final /* synthetic */ C195861 f62037b;

                                public void call() {
                                    producer.request(j);
                                }
                            });
                            return;
                        }
                    }
                    producer.request(j);
                }
            });
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71581a((C19571c) obj);
    }

    public av(Observable<T> observable, C2671a c2671a, boolean z) {
        this.f62224a = c2671a;
        this.f62225b = observable;
        this.f62226c = z;
    }

    /* renamed from: a */
    public void m71581a(C19571c<? super T> c19571c) {
        Object createWorker = this.f62224a.createWorker();
        Object c19827a = new C19827a(c19571c, this.f62226c, createWorker, this.f62225b);
        c19571c.add(c19827a);
        c19571c.add(createWorker);
        createWorker.mo14740a(c19827a);
    }
}
