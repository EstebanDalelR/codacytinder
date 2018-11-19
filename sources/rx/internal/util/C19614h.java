package rx.internal.util;

import rx.C19566b;
import rx.C2671a;
import rx.Single;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.schedulers.C19602b;

/* renamed from: rx.internal.util.h */
public final class C19614h<T> extends Single<T> {
    /* renamed from: b */
    final T f61296b;

    /* renamed from: rx.internal.util.h$c */
    static final class C19855c<T> implements Action0 {
        /* renamed from: a */
        private final C19566b<? super T> f62132a;
        /* renamed from: b */
        private final T f62133b;

        C19855c(C19566b<? super T> c19566b, T t) {
            this.f62132a = c19566b;
            this.f62133b = t;
        }

        public void call() {
            try {
                this.f62132a.mo14737a(this.f62133b);
            } catch (Throwable th) {
                this.f62132a.onError(th);
            }
        }
    }

    /* renamed from: rx.internal.util.h$1 */
    class C199041 implements OnSubscribe<T> {
        /* renamed from: a */
        final /* synthetic */ Object f62332a;

        C199041(Object obj) {
            this.f62332a = obj;
        }

        public /* synthetic */ void call(Object obj) {
            m71642a((C19566b) obj);
        }

        /* renamed from: a */
        public void m71642a(C19566b<? super T> c19566b) {
            c19566b.mo14737a(this.f62332a);
        }
    }

    /* renamed from: rx.internal.util.h$a */
    static final class C19906a<T> implements OnSubscribe<T> {
        /* renamed from: a */
        private final C19602b f62335a;
        /* renamed from: b */
        private final T f62336b;

        public /* synthetic */ void call(Object obj) {
            m71644a((C19566b) obj);
        }

        C19906a(C19602b c19602b, T t) {
            this.f62335a = c19602b;
            this.f62336b = t;
        }

        /* renamed from: a */
        public void m71644a(C19566b<? super T> c19566b) {
            c19566b.m70541a(this.f62335a.m70615a(new C19855c(c19566b, this.f62336b)));
        }
    }

    /* renamed from: rx.internal.util.h$b */
    static final class C19907b<T> implements OnSubscribe<T> {
        /* renamed from: a */
        private final C2671a f62337a;
        /* renamed from: b */
        private final T f62338b;

        public /* synthetic */ void call(Object obj) {
            m71645a((C19566b) obj);
        }

        C19907b(C2671a c2671a, T t) {
            this.f62337a = c2671a;
            this.f62338b = t;
        }

        /* renamed from: a */
        public void m71645a(C19566b<? super T> c19566b) {
            Subscription createWorker = this.f62337a.createWorker();
            c19566b.m70541a(createWorker);
            createWorker.mo14740a(new C19855c(c19566b, this.f62338b));
        }
    }

    /* renamed from: b */
    public static <T> C19614h<T> m70643b(T t) {
        return new C19614h(t);
    }

    protected C19614h(T t) {
        super(new C199041(t));
        this.f61296b = t;
    }

    /* renamed from: c */
    public Single<T> m70644c(C2671a c2671a) {
        if (c2671a instanceof C19602b) {
            return Single.m69745a(new C19906a((C19602b) c2671a, this.f61296b));
        }
        return Single.m69745a(new C19907b(c2671a, this.f61296b));
    }

    /* renamed from: h */
    public <R> Single<R> m70645h(final Func1<? super T, ? extends Single<? extends R>> func1) {
        return Single.m69745a(new OnSubscribe<R>(this) {
            /* renamed from: b */
            final /* synthetic */ C19614h f62334b;

            public /* synthetic */ void call(Object obj) {
                m71643a((C19566b) obj);
            }

            /* renamed from: a */
            public void m71643a(final C19566b<? super R> c19566b) {
                Single single = (Single) func1.call(this.f62334b.f61296b);
                if (single instanceof C19614h) {
                    c19566b.mo14737a(((C19614h) single).f61296b);
                    return;
                }
                C19566b c197771 = new C19566b<R>(this) {
                    /* renamed from: b */
                    final /* synthetic */ C199052 f61853b;

                    public void onError(Throwable th) {
                        c19566b.onError(th);
                    }

                    /* renamed from: a */
                    public void mo14737a(R r) {
                        c19566b.mo14737a((Object) r);
                    }
                };
                c19566b.m70541a((Subscription) c197771);
                single.m69762a(c197771);
            }
        });
    }
}
