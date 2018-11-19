package rx;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import rx.exceptions.C19410a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.FuncN;
import rx.internal.operators.C19874b;
import rx.internal.operators.SingleFromEmitter;
import rx.internal.operators.bd;
import rx.internal.operators.be;
import rx.internal.operators.bf;
import rx.internal.operators.bg;
import rx.internal.operators.bh;
import rx.internal.operators.bi;
import rx.internal.operators.bl;
import rx.internal.operators.bm;
import rx.internal.operators.bn;
import rx.internal.operators.bo;
import rx.internal.operators.bp;
import rx.internal.operators.bq;
import rx.internal.operators.br;
import rx.internal.operators.bs;
import rx.internal.util.C19614h;
import rx.internal.util.UtilityFunctions;
import rx.p498c.C19401c;
import rx.p499d.C19406a;
import rx.schedulers.Schedulers;

public class Single<T> {
    /* renamed from: a */
    final OnSubscribe<T> f60544a;

    public interface OnSubscribe<T> extends Action1<C19566b<? super T>> {
    }

    protected Single(OnSubscribe<T> onSubscribe) {
        this.f60544a = C19401c.m69805a((OnSubscribe) onSubscribe);
    }

    /* renamed from: a */
    public static <T> Single<T> m69745a(OnSubscribe<T> onSubscribe) {
        return new Single(onSubscribe);
    }

    /* renamed from: a */
    public <R> Single<R> m69756a(Single$Transformer<? super T, ? extends R> single$Transformer) {
        return (Single) single$Transformer.call(this);
    }

    /* renamed from: c */
    private static <T> Observable<T> m69751c(Single<T> single) {
        return Observable.m69634b(new bs(single.f60544a));
    }

    /* renamed from: a */
    public static <T> Observable<T> m69740a(Single<? extends T> single, Single<? extends T> single2) {
        return Observable.m69622a(m69751c((Single) single), m69751c((Single) single2));
    }

    /* renamed from: a */
    public static <T> Single<T> m69743a(final Throwable th) {
        return m69745a(new OnSubscribe<T>() {
            public /* synthetic */ void call(Object obj) {
                m71560a((C19566b) obj);
            }

            /* renamed from: a */
            public void m71560a(C19566b<? super T> c19566b) {
                c19566b.onError(th);
            }
        });
    }

    /* renamed from: a */
    public static <T> Single<T> m69744a(Callable<? extends T> callable) {
        return m69745a(new bi(callable));
    }

    /* renamed from: a */
    public static <T> Single<T> m69748a(Action1<SingleEmitter<T>> action1) {
        if (action1 != null) {
            return m69745a(new SingleFromEmitter(action1));
        }
        throw new NullPointerException("producer is null");
    }

    /* renamed from: a */
    public static <T> Single<T> m69742a(T t) {
        return C19614h.m70643b(t);
    }

    /* renamed from: a */
    public static <T> Single<T> m69746a(final Single<? extends Single<? extends T>> single) {
        if (single instanceof C19614h) {
            return ((C19614h) single).m70645h(UtilityFunctions.m69918b());
        }
        return m69745a(new OnSubscribe<T>() {
            public /* synthetic */ void call(Object obj) {
                m71563a((C19566b) obj);
            }

            /* renamed from: a */
            public void m71563a(final C19566b<? super T> c19566b) {
                C19566b c196541 = new C19566b<Single<? extends T>>(this) {
                    /* renamed from: b */
                    final /* synthetic */ C198706 f61439b;

                    /* renamed from: a */
                    public void m70874a(Single<? extends T> single) {
                        single.m69762a(c19566b);
                    }

                    public void onError(Throwable th) {
                        c19566b.onError(th);
                    }
                };
                c19566b.m70541a((Subscription) c196541);
                single.m69762a(c196541);
            }
        });
    }

    /* renamed from: a */
    public static <T1, T2, R> Single<R> m69747a(Single<? extends T1> single, Single<? extends T2> single2, final Func2<? super T1, ? super T2, ? extends R> func2) {
        return bq.m69907a(new Single[]{single, single2}, new FuncN<R>() {
            public R call(Object... objArr) {
                return func2.call(objArr[0], objArr[1]);
            }
        });
    }

    /* renamed from: a */
    public static <R> Single<R> m69741a(Iterable<? extends Single<?>> iterable, FuncN<? extends R> funcN) {
        return bq.m69907a(m69749a((Iterable) iterable), funcN);
    }

    /* renamed from: a */
    public final <R> Single<R> m69760a(Func1<? super T, ? extends Single<? extends R>> func1) {
        if (this instanceof C19614h) {
            return ((C19614h) this).m70645h(func1);
        }
        return m69746a(m69776d((Func1) func1));
    }

    /* renamed from: b */
    public final <R> Observable<R> m69765b(Func1<? super T, ? extends Observable<? extends R>> func1) {
        return Observable.m69635b(m69751c(m69776d((Func1) func1)));
    }

    /* renamed from: c */
    public final Completable m69771c(Func1<? super T, ? extends Completable> func1) {
        return Completable.a(new C19874b(this, func1));
    }

    /* renamed from: d */
    public final <R> Single<R> m69776d(Func1<? super T, ? extends R> func1) {
        return m69745a(new bo(this, func1));
    }

    /* renamed from: a */
    public final Single<T> m69758a(C2671a c2671a) {
        if (this instanceof C19614h) {
            return ((C19614h) this).m70644c(c2671a);
        }
        if (c2671a != null) {
            return m69745a(new bl(this.f60544a, c2671a));
        }
        throw new NullPointerException("scheduler is null");
    }

    /* renamed from: e */
    public final Single<T> m69777e(Func1<Throwable, ? extends T> func1) {
        return m69745a(new bm(this.f60544a, func1));
    }

    /* renamed from: b */
    public final Single<T> m69767b(Single<? extends T> single) {
        return new Single(bp.m71596a(this, (Single) single));
    }

    /* renamed from: f */
    public final Single<T> m69778f(Func1<Throwable, ? extends Single<? extends T>> func1) {
        return new Single(bp.m71597a(this, (Func1) func1));
    }

    /* renamed from: b */
    public final Subscription m69770b(Action1<? super T> action1) {
        return m69763a((Action1) action1, Actions.m69878b());
    }

    /* renamed from: a */
    public final Subscription m69763a(final Action1<? super T> action1, final Action1<Throwable> action12) {
        if (action1 == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        } else if (action12 != null) {
            return m69762a(new C19566b<T>(this) {
                /* renamed from: c */
                final /* synthetic */ Single f61436c;

                public final void onError(Throwable th) {
                    try {
                        action12.call(th);
                    } finally {
                        unsubscribe();
                    }
                }

                /* renamed from: a */
                public final void mo14737a(T t) {
                    try {
                        action1.call(t);
                    } finally {
                        unsubscribe();
                    }
                }
            });
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    /* renamed from: a */
    public final Subscription m69762a(C19566b<? super T> c19566b) {
        if (c19566b == null) {
            throw new IllegalArgumentException("te is null");
        }
        try {
            C19401c.m69806a(this, this.f60544a).call(c19566b);
            return C19401c.m69813b((Subscription) c19566b);
        } catch (C19566b<? super T> c19566b2) {
            C19410a.m69874b(c19566b2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error occurred attempting to subscribe [");
            stringBuilder.append(th.getMessage());
            stringBuilder.append("] and then again while trying to pass to onError.");
            C19401c.m69820d(new RuntimeException(stringBuilder.toString(), c19566b2));
        }
    }

    /* renamed from: b */
    public final Single<T> m69768b(final C2671a c2671a) {
        if (this instanceof C19614h) {
            return ((C19614h) this).m70644c(c2671a);
        }
        return m69745a(new OnSubscribe<T>(this) {
            /* renamed from: b */
            final /* synthetic */ Single f62192b;

            public /* synthetic */ void call(Object obj) {
                m71561a((C19566b) obj);
            }

            /* renamed from: a */
            public void m71561a(final C19566b<? super T> c19566b) {
                final Subscription createWorker = c2671a.createWorker();
                c19566b.m70541a(createWorker);
                createWorker.mo14740a(new Action0(this) {
                    /* renamed from: c */
                    final /* synthetic */ C198683 f61961c;

                    /* renamed from: rx.Single$3$1$1 */
                    class C196531 extends C19566b<T> {
                        /* renamed from: a */
                        final /* synthetic */ C198091 f61437a;

                        C196531(C198091 c198091) {
                            this.f61437a = c198091;
                        }

                        /* renamed from: a */
                        public void mo14737a(T t) {
                            try {
                                c19566b.mo14737a((Object) t);
                            } finally {
                                createWorker.unsubscribe();
                            }
                        }

                        public void onError(Throwable th) {
                            try {
                                c19566b.onError(th);
                            } finally {
                                createWorker.unsubscribe();
                            }
                        }
                    }

                    public void call() {
                        C19566b c196531 = new C196531(this);
                        c19566b.m70541a((Subscription) c196531);
                        this.f61961c.f62192b.m69762a(c196531);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public final <E> Single<T> m69755a(Observable<? extends E> observable) {
        return m69745a(new br(this.f60544a, observable));
    }

    /* renamed from: a */
    public final Observable<T> m69752a() {
        return m69751c(this);
    }

    /* renamed from: b */
    public final Completable m69764b() {
        return Completable.a(this);
    }

    /* renamed from: c */
    public final C19406a<T> m69774c() {
        return C19406a.m69850a(this);
    }

    /* renamed from: a */
    public final <T2, R> Single<R> m69757a(Single<? extends T2> single, Func2<? super T, ? super T2, ? extends R> func2) {
        return m69747a(this, (Single) single, (Func2) func2);
    }

    /* renamed from: c */
    public final Single<T> m69773c(final Action1<Throwable> action1) {
        if (action1 != null) {
            return m69745a(new bf(this, Actions.m69877a(), new Action1<Throwable>(this) {
                /* renamed from: b */
                final /* synthetic */ Single f61963b;

                public /* synthetic */ void call(Object obj) {
                    m71414a((Throwable) obj);
                }

                /* renamed from: a */
                public void m71414a(Throwable th) {
                    action1.call(th);
                }
            }));
        }
        throw new IllegalArgumentException("onError is null");
    }

    /* renamed from: d */
    public final Single<T> m69775d(Action1<? super T> action1) {
        if (action1 != null) {
            return m69745a(new bf(this, action1, Actions.m69877a()));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    /* renamed from: a */
    public final Single<T> m69759a(Action0 action0) {
        return m69745a(new bg(this.f60544a, action0));
    }

    /* renamed from: a */
    public final Single<T> m69754a(long j, TimeUnit timeUnit, C2671a c2671a) {
        return m69745a(new bd(this.f60544a, j, timeUnit, c2671a));
    }

    /* renamed from: a */
    public final Single<T> m69753a(long j, TimeUnit timeUnit) {
        return m69754a(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: b */
    public static <T> Single<T> m69750b(final Callable<Single<T>> callable) {
        return m69745a(new OnSubscribe<T>() {
            public /* synthetic */ void call(Object obj) {
                m71562a((C19566b) obj);
            }

            /* renamed from: a */
            public void m71562a(C19566b<? super T> c19566b) {
                try {
                    ((Single) callable.call()).m69762a((C19566b) c19566b);
                } catch (Throwable th) {
                    C19410a.m69874b(th);
                    c19566b.onError(th);
                }
            }
        });
    }

    /* renamed from: b */
    public final Single<T> m69769b(Action0 action0) {
        return m69745a(new bh(this.f60544a, action0));
    }

    /* renamed from: c */
    public final Single<T> m69772c(Action0 action0) {
        return m69745a(new be(this, action0));
    }

    /* renamed from: a */
    static <T> Single<? extends T>[] m69749a(Iterable<? extends Single<? extends T>> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return (Single[]) collection.toArray(new Single[collection.size()]);
        }
        Iterable<? extends Single<? extends T>> iterable2 = new Single[8];
        Iterable<? extends Single<? extends T>> iterable3 = iterable2;
        int i = 0;
        for (Single single : iterable) {
            if (i == iterable3.length) {
                Iterable<? extends Single<? extends T>> iterable4 = new Single[((i >> 2) + i)];
                System.arraycopy(iterable3, 0, iterable4, 0, i);
                iterable3 = iterable4;
            }
            iterable3[i] = single;
            i++;
        }
        if (iterable3.length == i) {
            return iterable3;
        }
        iterable = new Single[i];
        System.arraycopy(iterable3, 0, iterable, 0, i);
        return iterable;
    }

    /* renamed from: a */
    public final Single<T> m69761a(Func2<Integer, Throwable, Boolean> func2) {
        return m69752a().m69658a((Func2) func2).m69659a();
    }

    /* renamed from: g */
    public final Single<T> m69779g(Func1<Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return m69752a().m69727o(func1).m69659a();
    }

    /* renamed from: b */
    public final Single<T> m69766b(Observable<?> observable) {
        if (observable != null) {
            return m69745a(new bn(this, observable));
        }
        throw new NullPointerException();
    }
}
