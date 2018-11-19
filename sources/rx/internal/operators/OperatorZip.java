package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.C19571c;
import rx.Observable;
import rx.Observable.Operator;
import rx.Observer;
import rx.Producer;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.C19411a;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.FuncN;
import rx.internal.util.C19613g;
import rx.p500e.C19573b;

public final class OperatorZip<R> implements Operator<R, Observable<?>[]> {
    /* renamed from: a */
    final FuncN<? extends R> f61979a;

    static final class Zip<R> extends AtomicLong {
        /* renamed from: b */
        static final int f60602b = ((int) (((double) C19613g.f61292b) * 0.7d));
        private static final long serialVersionUID = 5995274816189928317L;
        /* renamed from: a */
        final Observer<? super R> f60603a;
        /* renamed from: c */
        int f60604c;
        /* renamed from: d */
        private final FuncN<? extends R> f60605d;
        /* renamed from: e */
        private final C19573b f60606e = new C19573b();
        /* renamed from: f */
        private volatile Object[] f60607f;
        /* renamed from: g */
        private AtomicLong f60608g;

        /* renamed from: rx.internal.operators.OperatorZip$Zip$a */
        final class C19682a extends C19571c {
            /* renamed from: a */
            final C19613g f61552a = C19613g.m70634b();
            /* renamed from: b */
            final /* synthetic */ Zip f61553b;

            C19682a(Zip zip) {
                this.f61553b = zip;
            }

            public void onStart() {
                request((long) C19613g.f61292b);
            }

            /* renamed from: a */
            public void m70954a(long j) {
                request(j);
            }

            public void onCompleted() {
                this.f61552a.m70639d();
                this.f61553b.m69897a();
            }

            public void onError(Throwable th) {
                this.f61553b.f60603a.onError(th);
            }

            public void onNext(Object obj) {
                try {
                    this.f61552a.m70635a(obj);
                } catch (Object obj2) {
                    onError(obj2);
                }
                this.f61553b.m69897a();
            }
        }

        public Zip(C19571c<? super R> c19571c, FuncN<? extends R> funcN) {
            this.f60603a = c19571c;
            this.f60605d = funcN;
            c19571c.add(this.f60606e);
        }

        /* renamed from: a */
        public void m69898a(Observable[] observableArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[observableArr.length];
            for (int i = 0; i < observableArr.length; i++) {
                Subscription c19682a = new C19682a(this);
                objArr[i] = c19682a;
                this.f60606e.m70548a(c19682a);
            }
            this.f60608g = atomicLong;
            this.f60607f = objArr;
            for (int i2 = 0; i2 < observableArr.length; i2++) {
                observableArr[i2].m69661a((C19682a) objArr[i2]);
            }
        }

        /* renamed from: a */
        void m69897a() {
            Object[] objArr = this.f60607f;
            if (objArr != null && getAndIncrement() == 0) {
                int length = objArr.length;
                Observer observer = this.f60603a;
                AtomicLong atomicLong = this.f60608g;
                while (true) {
                    Object obj = new Object[length];
                    Object obj2 = 1;
                    for (int i = 0; i < length; i++) {
                        C19613g c19613g = ((C19682a) objArr[i]).f61552a;
                        Object g = c19613g.m70642g();
                        if (g == null) {
                            obj2 = null;
                        } else if (c19613g.m70636b(g)) {
                            observer.onCompleted();
                            this.f60606e.unsubscribe();
                            return;
                        } else {
                            obj[i] = c19613g.m70637c(g);
                        }
                    }
                    if (obj2 != null && atomicLong.get() > 0) {
                        try {
                            observer.onNext(this.f60605d.call(obj));
                            atomicLong.decrementAndGet();
                            this.f60604c++;
                            for (Object obj3 : objArr) {
                                C19613g c19613g2 = ((C19682a) obj3).f61552a;
                                c19613g2.m70641f();
                                if (c19613g2.m70636b(c19613g2.m70642g())) {
                                    observer.onCompleted();
                                    this.f60606e.unsubscribe();
                                    return;
                                }
                            }
                            if (this.f60604c > f60602b) {
                                for (Object obj32 : objArr) {
                                    ((C19682a) obj32).m70954a((long) this.f60604c);
                                }
                                this.f60604c = 0;
                            }
                        } catch (Throwable th) {
                            C19410a.m69870a(th, observer, obj);
                            return;
                        }
                    } else if (decrementAndGet() <= 0) {
                        break;
                    }
                }
            }
        }
    }

    static final class ZipProducer<R> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1216676403723546796L;
        /* renamed from: a */
        final Zip<R> f61181a;

        public ZipProducer(Zip<R> zip) {
            this.f61181a = zip;
        }

        public void request(long j) {
            C19419a.m69900a((AtomicLong) this, j);
            this.f61181a.m69897a();
        }
    }

    /* renamed from: rx.internal.operators.OperatorZip$a */
    final class C19683a extends C19571c<Observable[]> {
        /* renamed from: a */
        final C19571c<? super R> f61554a;
        /* renamed from: b */
        final Zip<R> f61555b;
        /* renamed from: c */
        final ZipProducer<R> f61556c;
        /* renamed from: d */
        boolean f61557d;
        /* renamed from: e */
        final /* synthetic */ OperatorZip f61558e;

        public /* synthetic */ void onNext(Object obj) {
            m70955a((Observable[]) obj);
        }

        public C19683a(OperatorZip operatorZip, C19571c<? super R> c19571c, Zip<R> zip, ZipProducer<R> zipProducer) {
            this.f61558e = operatorZip;
            this.f61554a = c19571c;
            this.f61555b = zip;
            this.f61556c = zipProducer;
        }

        public void onCompleted() {
            if (!this.f61557d) {
                this.f61554a.onCompleted();
            }
        }

        public void onError(Throwable th) {
            this.f61554a.onError(th);
        }

        /* renamed from: a */
        public void m70955a(Observable[] observableArr) {
            if (observableArr != null) {
                if (observableArr.length != 0) {
                    this.f61557d = true;
                    this.f61555b.m69898a(observableArr, this.f61556c);
                    return;
                }
            }
            this.f61554a.onCompleted();
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71427a((C19571c) obj);
    }

    public OperatorZip(Func2 func2) {
        this.f61979a = C19411a.m69879a(func2);
    }

    public OperatorZip(Func3 func3) {
        this.f61979a = C19411a.m69880a(func3);
    }

    public OperatorZip(Func4 func4) {
        this.f61979a = C19411a.m69881a(func4);
    }

    /* renamed from: a */
    public C19571c<? super Observable[]> m71427a(C19571c<? super R> c19571c) {
        Zip zip = new Zip(c19571c, this.f61979a);
        Producer zipProducer = new ZipProducer(zip);
        Object c19683a = new C19683a(this, c19571c, zip, zipProducer);
        c19571c.add(c19683a);
        c19571c.setProducer(zipProducer);
        return c19683a;
    }
}
