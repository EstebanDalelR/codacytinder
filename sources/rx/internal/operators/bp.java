package rx.internal.operators;

import rx.C19566b;
import rx.Single;
import rx.Single.OnSubscribe;
import rx.Subscription;
import rx.exceptions.C19410a;
import rx.functions.Func1;

public final class bp<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Func1<Throwable, ? extends Single<? extends T>> f62254a;
    /* renamed from: b */
    private final Single<? extends T> f62255b;

    public /* synthetic */ void call(Object obj) {
        m71598a((C19566b) obj);
    }

    private bp(Single<? extends T> single, Func1<Throwable, ? extends Single<? extends T>> func1) {
        if (single == null) {
            throw new NullPointerException("originalSingle must not be null");
        } else if (func1 == null) {
            throw new NullPointerException("resumeFunctionInCaseOfError must not be null");
        } else {
            this.f62255b = single;
            this.f62254a = func1;
        }
    }

    /* renamed from: a */
    public static <T> bp<T> m71597a(Single<? extends T> single, Func1<Throwable, ? extends Single<? extends T>> func1) {
        return new bp(single, func1);
    }

    /* renamed from: a */
    public static <T> bp<T> m71596a(Single<? extends T> single, final Single<? extends T> single2) {
        if (single2 != null) {
            return new bp(single, new Func1<Throwable, Single<? extends T>>() {
                public /* synthetic */ Object call(Object obj) {
                    return m70985a((Throwable) obj);
                }

                /* renamed from: a */
                public Single<? extends T> m70985a(Throwable th) {
                    return single2;
                }
            });
        }
        throw new NullPointerException("resumeSingleInCaseOfError must not be null");
    }

    /* renamed from: a */
    public void m71598a(final C19566b<? super T> c19566b) {
        C19566b c197262 = new C19566b<T>(this) {
            /* renamed from: b */
            final /* synthetic */ bp f61709b;

            /* renamed from: a */
            public void mo14737a(T t) {
                c19566b.mo14737a((Object) t);
            }

            public void onError(Throwable th) {
                try {
                    ((Single) this.f61709b.f62254a.call(th)).m69762a(c19566b);
                } catch (Throwable th2) {
                    C19410a.m69871a(th2, c19566b);
                }
            }
        };
        c19566b.m70541a((Subscription) c197262);
        this.f62255b.m69762a(c197262);
    }
}
