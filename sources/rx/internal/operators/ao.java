package rx.internal.operators;

import rx.C19571c;
import rx.Observable;
import rx.Observable.Operator;
import rx.Producer;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.Func1;
import rx.internal.producers.C19598a;
import rx.p498c.C19401c;
import rx.p500e.C19575d;

public final class ao<T> implements Operator<T, T> {
    /* renamed from: a */
    final Func1<? super Throwable, ? extends Observable<? extends T>> f62018a;

    public /* synthetic */ Object call(Object obj) {
        return m71454a((C19571c) obj);
    }

    /* renamed from: a */
    public static <T> ao<T> m71453a(final Func1<? super Throwable, ? extends T> func1) {
        return new ao(new Func1<Throwable, Observable<? extends T>>() {
            public /* synthetic */ Object call(Object obj) {
                return m70961a((Throwable) obj);
            }

            /* renamed from: a */
            public Observable<? extends T> m70961a(Throwable th) {
                return Observable.m69614a(func1.call(th));
            }
        });
    }

    public ao(Func1<? super Throwable, ? extends Observable<? extends T>> func1) {
        this.f62018a = func1;
    }

    /* renamed from: a */
    public C19571c<? super T> m71454a(final C19571c<? super T> c19571c) {
        final Producer c19598a = new C19598a();
        final Subscription c19575d = new C19575d();
        Object c196962 = new C19571c<T>(this) {
            /* renamed from: a */
            long f61604a;
            /* renamed from: e */
            final /* synthetic */ ao f61608e;
            /* renamed from: f */
            private boolean f61609f;

            /* renamed from: rx.internal.operators.ao$2$1 */
            class C196951 extends C19571c<T> {
                /* renamed from: a */
                final /* synthetic */ C196962 f61603a;

                C196951(C196962 c196962) {
                    this.f61603a = c196962;
                }

                public void onNext(T t) {
                    c19571c.onNext(t);
                }

                public void onError(Throwable th) {
                    c19571c.onError(th);
                }

                public void onCompleted() {
                    c19571c.onCompleted();
                }

                public void setProducer(Producer producer) {
                    c19598a.m70607a(producer);
                }
            }

            public void onCompleted() {
                if (!this.f61609f) {
                    this.f61609f = true;
                    c19571c.onCompleted();
                }
            }

            public void onError(Throwable th) {
                if (this.f61609f) {
                    C19410a.m69874b(th);
                    C19401c.m69811a(th);
                    return;
                }
                this.f61609f = true;
                try {
                    unsubscribe();
                    C19571c c196951 = new C196951(this);
                    c19575d.m70554a(c196951);
                    long j = this.f61604a;
                    if (j != 0) {
                        c19598a.m70606a(j);
                    }
                    ((Observable) this.f61608e.f62018a.call(th)).m69661a(c196951);
                } catch (Throwable th2) {
                    C19410a.m69869a(th2, c19571c);
                }
            }

            public void onNext(T t) {
                if (!this.f61609f) {
                    this.f61604a++;
                    c19571c.onNext(t);
                }
            }

            public void setProducer(Producer producer) {
                c19598a.m70607a(producer);
            }
        };
        c19575d.m70554a(c196962);
        c19571c.add(c19575d);
        c19571c.setProducer(c19598a);
        return c196962;
    }
}
