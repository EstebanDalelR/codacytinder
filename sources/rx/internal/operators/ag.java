package rx.internal.operators;

import rx.C19571c;
import rx.Observable.Operator;
import rx.exceptions.C19410a;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.util.UtilityFunctions;

public final class ag<T, U> implements Operator<T, T>, Func2<U, U, Boolean> {
    /* renamed from: a */
    final Func1<? super T, ? extends U> f61997a;
    /* renamed from: b */
    final Func2<? super U, ? super U, Boolean> f61998b = this;

    /* renamed from: rx.internal.operators.ag$a */
    static final class C19423a {
        /* renamed from: a */
        static final ag<?, ?> f60616a = new ag(UtilityFunctions.m69918b());
    }

    public /* synthetic */ Object call(Object obj) {
        return m71438a((C19571c) obj);
    }

    public /* synthetic */ Object call(Object obj, Object obj2) {
        return m71437a(obj, obj2);
    }

    /* renamed from: a */
    public static <T> ag<T, T> m71436a() {
        return C19423a.f60616a;
    }

    public ag(Func1<? super T, ? extends U> func1) {
        this.f61997a = func1;
    }

    /* renamed from: a */
    public Boolean m71437a(U u, U u2) {
        if (u != u2) {
            if (u == null || u.equals(u2) == null) {
                u = null;
                return Boolean.valueOf(u);
            }
        }
        u = true;
        return Boolean.valueOf(u);
    }

    /* renamed from: a */
    public C19571c<? super T> m71438a(final C19571c<? super T> c19571c) {
        return new C19571c<T>(this, c19571c) {
            /* renamed from: a */
            U f61580a;
            /* renamed from: b */
            boolean f61581b;
            /* renamed from: d */
            final /* synthetic */ ag f61583d;

            public void onNext(T t) {
                try {
                    Object call = this.f61583d.f61997a.call(t);
                    Object obj = this.f61580a;
                    this.f61580a = call;
                    if (this.f61581b) {
                        try {
                            if (((Boolean) this.f61583d.f61998b.call(obj, call)).booleanValue()) {
                                request(1);
                            } else {
                                c19571c.onNext(t);
                            }
                        } catch (Throwable th) {
                            C19410a.m69870a(th, c19571c, call);
                            return;
                        }
                    }
                    this.f61581b = true;
                    c19571c.onNext(t);
                } catch (Throwable th2) {
                    C19410a.m69870a(th2, c19571c, (Object) t);
                }
            }

            public void onError(Throwable th) {
                c19571c.onError(th);
            }

            public void onCompleted() {
                c19571c.onCompleted();
            }
        };
    }
}
