package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.C19571c;
import rx.Observable;
import rx.Observable.Operator;
import rx.Producer;
import rx.a$a;
import rx.functions.Action0;
import rx.functions.Func2;
import rx.internal.producers.C19598a;
import rx.p500e.C19575d;
import rx.schedulers.Schedulers;

public final class ap<T> implements Operator<T, Observable<T>> {
    /* renamed from: a */
    final Func2<Integer, Throwable, Boolean> f62021a;

    /* renamed from: rx.internal.operators.ap$a */
    static final class C19698a<T> extends C19571c<Observable<T>> {
        /* renamed from: a */
        final C19571c<? super T> f61613a;
        /* renamed from: b */
        final Func2<Integer, Throwable, Boolean> f61614b;
        /* renamed from: c */
        final a$a f61615c;
        /* renamed from: d */
        final C19575d f61616d;
        /* renamed from: e */
        final C19598a f61617e;
        /* renamed from: f */
        final AtomicInteger f61618f = new AtomicInteger();

        public void onCompleted() {
        }

        public /* synthetic */ void onNext(Object obj) {
            m70962a((Observable) obj);
        }

        public C19698a(C19571c<? super T> c19571c, Func2<Integer, Throwable, Boolean> func2, a$a a_a, C19575d c19575d, C19598a c19598a) {
            this.f61613a = c19571c;
            this.f61614b = func2;
            this.f61615c = a_a;
            this.f61616d = c19575d;
            this.f61617e = c19598a;
        }

        public void onError(Throwable th) {
            this.f61613a.onError(th);
        }

        /* renamed from: a */
        public void m70962a(final Observable<T> observable) {
            this.f61615c.mo14740a(new Action0(this) {
                /* renamed from: b */
                final /* synthetic */ C19698a f62020b;

                public void call() {
                    this.f62020b.f61618f.incrementAndGet();
                    C19571c c196971 = new C19571c<T>(this) {
                        /* renamed from: a */
                        boolean f61610a;
                        /* renamed from: c */
                        final /* synthetic */ C198241 f61612c;

                        public void onCompleted() {
                            if (!this.f61610a) {
                                this.f61610a = true;
                                this.f61612c.f62020b.f61613a.onCompleted();
                            }
                        }

                        public void onError(Throwable th) {
                            if (!this.f61610a) {
                                this.f61610a = true;
                                if (!((Boolean) this.f61612c.f62020b.f61614b.call(Integer.valueOf(this.f61612c.f62020b.f61618f.get()), th)).booleanValue() || this.f61612c.f62020b.f61615c.isUnsubscribed()) {
                                    this.f61612c.f62020b.f61613a.onError(th);
                                } else {
                                    this.f61612c.f62020b.f61615c.mo14740a(this);
                                }
                            }
                        }

                        public void onNext(T t) {
                            if (!this.f61610a) {
                                this.f61612c.f62020b.f61613a.onNext(t);
                                this.f61612c.f62020b.f61617e.m70606a(1);
                            }
                        }

                        public void setProducer(Producer producer) {
                            this.f61612c.f62020b.f61617e.m70607a(producer);
                        }
                    };
                    this.f62020b.f61616d.m70554a(c196971);
                    observable.m69661a(c196971);
                }
            });
        }
    }

    public /* synthetic */ Object call(Object obj) {
        return m71455a((C19571c) obj);
    }

    public ap(Func2<Integer, Throwable, Boolean> func2) {
        this.f62021a = func2;
    }

    /* renamed from: a */
    public C19571c<? super Observable<T>> m71455a(C19571c<? super T> c19571c) {
        Object createWorker = Schedulers.trampoline().createWorker();
        c19571c.add(createWorker);
        Object c19575d = new C19575d();
        c19571c.add(c19575d);
        Object c19598a = new C19598a();
        c19571c.setProducer(c19598a);
        return new C19698a(c19571c, this.f62021a, createWorker, c19575d, c19598a);
    }
}
