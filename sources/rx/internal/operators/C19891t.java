package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.Subscription;
import rx.internal.producers.C19598a;
import rx.p500e.C19575d;

/* renamed from: rx.internal.operators.t */
public final class C19891t<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Observable<? extends T> f62296a;
    /* renamed from: b */
    final Observable<? extends T> f62297b;

    /* renamed from: rx.internal.operators.t$a */
    static final class C19745a<T> extends C19571c<T> {
        /* renamed from: a */
        private final C19598a f61770a;
        /* renamed from: b */
        private final C19571c<? super T> f61771b;

        C19745a(C19571c<? super T> c19571c, C19598a c19598a) {
            this.f61771b = c19571c;
            this.f61770a = c19598a;
        }

        public void setProducer(Producer producer) {
            this.f61770a.m70607a(producer);
        }

        public void onCompleted() {
            this.f61771b.onCompleted();
        }

        public void onError(Throwable th) {
            this.f61771b.onError(th);
        }

        public void onNext(T t) {
            this.f61771b.onNext(t);
            this.f61770a.m70606a(1);
        }
    }

    /* renamed from: rx.internal.operators.t$b */
    static final class C19746b<T> extends C19571c<T> {
        /* renamed from: a */
        final AtomicInteger f61772a;
        /* renamed from: b */
        volatile boolean f61773b;
        /* renamed from: c */
        private boolean f61774c = true;
        /* renamed from: d */
        private final C19571c<? super T> f61775d;
        /* renamed from: e */
        private final C19575d f61776e;
        /* renamed from: f */
        private final C19598a f61777f;
        /* renamed from: g */
        private final Observable<? extends T> f61778g;

        C19746b(C19571c<? super T> c19571c, C19575d c19575d, C19598a c19598a, Observable<? extends T> observable) {
            this.f61775d = c19571c;
            this.f61776e = c19575d;
            this.f61777f = c19598a;
            this.f61778g = observable;
            this.f61772a = new AtomicInteger();
        }

        public void setProducer(Producer producer) {
            this.f61777f.m70607a(producer);
        }

        public void onCompleted() {
            if (!this.f61774c) {
                this.f61775d.onCompleted();
            } else if (!this.f61775d.isUnsubscribed()) {
                this.f61773b = false;
                m71011a(null);
            }
        }

        /* renamed from: a */
        void m71011a(Observable<? extends T> observable) {
            if (this.f61772a.getAndIncrement() == 0) {
                while (!this.f61775d.isUnsubscribed()) {
                    if (!this.f61773b) {
                        if (observable == null) {
                            C19571c c19745a = new C19745a(this.f61775d, this.f61777f);
                            this.f61776e.m70554a(c19745a);
                            this.f61773b = true;
                            this.f61778g.m69661a(c19745a);
                        } else {
                            this.f61773b = true;
                            observable.m69661a((C19571c) this);
                            observable = null;
                        }
                    }
                    if (this.f61772a.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void onError(Throwable th) {
            this.f61775d.onError(th);
        }

        public void onNext(T t) {
            this.f61774c = false;
            this.f61775d.onNext(t);
            this.f61777f.m70606a(1);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m71629a((C19571c) obj);
    }

    public C19891t(Observable<? extends T> observable, Observable<? extends T> observable2) {
        this.f62296a = observable;
        this.f62297b = observable2;
    }

    /* renamed from: a */
    public void m71629a(C19571c<? super T> c19571c) {
        Subscription c19575d = new C19575d();
        Producer c19598a = new C19598a();
        Object c19746b = new C19746b(c19571c, c19575d, c19598a, this.f62297b);
        c19575d.m70554a(c19746b);
        c19571c.add(c19575d);
        c19571c.setProducer(c19598a);
        c19746b.m71011a(this.f62296a);
    }
}
