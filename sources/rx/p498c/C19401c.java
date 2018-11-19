package rx.p498c;

import java.io.PrintStream;
import java.util.concurrent.ScheduledExecutorService;
import rx.C2671a;
import rx.Completable;
import rx.Completable$OnSubscribe;
import rx.Completable$Operator;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Observable.Operator;
import rx.Single;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.operators.bj;
import rx.internal.operators.bs;
import rx.p498c.C19403f;
import rx.p498c.C19405h;
import rx.p498c.C19570i;

/* renamed from: rx.c.c */
public final class C19401c {
    /* renamed from: a */
    static volatile Action1<Throwable> f60554a;
    /* renamed from: b */
    static volatile Func1<OnSubscribe, OnSubscribe> f60555b;
    /* renamed from: c */
    static volatile Func1<Single.OnSubscribe, Single.OnSubscribe> f60556c;
    /* renamed from: d */
    static volatile Func1<Completable$OnSubscribe, Completable$OnSubscribe> f60557d;
    /* renamed from: e */
    static volatile Func2<Observable, OnSubscribe, OnSubscribe> f60558e;
    /* renamed from: f */
    static volatile Func2<Single, Single.OnSubscribe, Single.OnSubscribe> f60559f;
    /* renamed from: g */
    static volatile Func2<Completable, Completable$OnSubscribe, Completable$OnSubscribe> f60560g;
    /* renamed from: h */
    static volatile Func1<C2671a, C2671a> f60561h;
    /* renamed from: i */
    static volatile Func1<C2671a, C2671a> f60562i;
    /* renamed from: j */
    static volatile Func1<C2671a, C2671a> f60563j;
    /* renamed from: k */
    static volatile Func1<Action0, Action0> f60564k;
    /* renamed from: l */
    static volatile Func1<Subscription, Subscription> f60565l;
    /* renamed from: m */
    static volatile Func1<Subscription, Subscription> f60566m;
    /* renamed from: n */
    static volatile Func0<? extends ScheduledExecutorService> f60567n;
    /* renamed from: o */
    static volatile Func1<Throwable, Throwable> f60568o;
    /* renamed from: p */
    static volatile Func1<Throwable, Throwable> f60569p;
    /* renamed from: q */
    static volatile Func1<Throwable, Throwable> f60570q;
    /* renamed from: r */
    static volatile Func1<Operator, Operator> f60571r;
    /* renamed from: s */
    static volatile Func1<Operator, Operator> f60572s;
    /* renamed from: t */
    static volatile Func1<Completable$Operator, Completable$Operator> f60573t;

    /* renamed from: rx.c.c$2 */
    static class C196582 implements Func1<Throwable, Throwable> {
        C196582() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m70884a((Throwable) obj);
        }

        /* renamed from: a */
        public Throwable m70884a(Throwable th) {
            return C19403f.m69828a().m69831d().m69845a(th);
        }
    }

    /* renamed from: rx.c.c$3 */
    static class C196593 implements Func1<Operator, Operator> {
        C196593() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m70885a((Operator) obj);
        }

        /* renamed from: a */
        public Operator m70885a(Operator operator) {
            return C19403f.m69828a().m69831d().m69847a(operator);
        }
    }

    /* renamed from: rx.c.c$4 */
    static class C196604 implements Func1<Throwable, Throwable> {
        C196604() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m70886a((Throwable) obj);
        }

        /* renamed from: a */
        public Throwable m70886a(Throwable th) {
            return C19403f.m69828a().m69832e().m69793a(th);
        }
    }

    /* renamed from: rx.c.c$5 */
    static class C196615 implements Func1<Completable$Operator, Completable$Operator> {
        C196615() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m70887a((Completable$Operator) obj);
        }

        /* renamed from: a */
        public Completable$Operator m70887a(Completable$Operator completable$Operator) {
            return C19403f.m69828a().m69832e().m69796a(completable$Operator);
        }
    }

    /* renamed from: rx.c.c$6 */
    static class C196626 implements Func1<OnSubscribe, OnSubscribe> {
        C196626() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m70888a((OnSubscribe) obj);
        }

        /* renamed from: a */
        public OnSubscribe m70888a(OnSubscribe onSubscribe) {
            return C19403f.m69828a().m69830c().m69823a(onSubscribe);
        }
    }

    /* renamed from: rx.c.c$7 */
    static class C196637 implements Func1<Single.OnSubscribe, Single.OnSubscribe> {
        C196637() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m70889a((Single.OnSubscribe) obj);
        }

        /* renamed from: a */
        public Single.OnSubscribe m70889a(Single.OnSubscribe onSubscribe) {
            return C19403f.m69828a().m69831d().m69848a(onSubscribe);
        }
    }

    /* renamed from: rx.c.c$8 */
    static class C196648 implements Func1<Completable$OnSubscribe, Completable$OnSubscribe> {
        C196648() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m70890a((Completable$OnSubscribe) obj);
        }

        /* renamed from: a */
        public Completable$OnSubscribe m70890a(Completable$OnSubscribe completable$OnSubscribe) {
            return C19403f.m69828a().m69832e().m69794a(completable$OnSubscribe);
        }
    }

    /* renamed from: rx.c.c$9 */
    static class C196659 implements Func2<Observable, OnSubscribe, OnSubscribe> {
        C196659() {
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m70891a((Observable) obj, (OnSubscribe) obj2);
        }

        /* renamed from: a */
        public OnSubscribe m70891a(Observable observable, OnSubscribe onSubscribe) {
            return C19403f.m69828a().m69830c().m69824a(observable, onSubscribe);
        }
    }

    /* renamed from: rx.c.c$1 */
    static class C198121 implements Action1<Throwable> {
        C198121() {
        }

        public /* synthetic */ void call(Object obj) {
            m71415a((Throwable) obj);
        }

        /* renamed from: a */
        public void m71415a(Throwable th) {
            C19403f.m69828a().m69829b().m69798a(th);
        }
    }

    static {
        C19401c.m69810a();
    }

    /* renamed from: a */
    static void m69810a() {
        f60554a = new C198121();
        f60558e = new C196659();
        f60565l = new Func1<Subscription, Subscription>() {
            public /* synthetic */ Object call(Object obj) {
                return m70877a((Subscription) obj);
            }

            /* renamed from: a */
            public Subscription m70877a(Subscription subscription) {
                return C19403f.m69828a().m69830c().m69826a(subscription);
            }
        };
        f60559f = new Func2<Single, Single.OnSubscribe, Single.OnSubscribe>() {
            public /* synthetic */ Object call(Object obj, Object obj2) {
                return m70878a((Single) obj, (Single.OnSubscribe) obj2);
            }

            /* renamed from: a */
            public Single.OnSubscribe m70878a(Single single, Single.OnSubscribe onSubscribe) {
                C19405h d = C19403f.m69828a().m69831d();
                if (d == C19570i.m70543a()) {
                    return onSubscribe;
                }
                return new bj(d.m69846a(single, new bs(onSubscribe)));
            }
        };
        f60566m = new Func1<Subscription, Subscription>() {
            public /* synthetic */ Object call(Object obj) {
                return m70879a((Subscription) obj);
            }

            /* renamed from: a */
            public Subscription m70879a(Subscription subscription) {
                return C19403f.m69828a().m69831d().m69849a(subscription);
            }
        };
        f60560g = new Func2<Completable, Completable$OnSubscribe, Completable$OnSubscribe>() {
            public /* synthetic */ Object call(Object obj, Object obj2) {
                return m70880a((Completable) obj, (Completable$OnSubscribe) obj2);
            }

            /* renamed from: a */
            public Completable$OnSubscribe m70880a(Completable completable, Completable$OnSubscribe completable$OnSubscribe) {
                return C19403f.m69828a().m69832e().m69795a(completable, completable$OnSubscribe);
            }
        };
        f60564k = new Func1<Action0, Action0>() {
            public /* synthetic */ Object call(Object obj) {
                return m70881a((Action0) obj);
            }

            /* renamed from: a */
            public Action0 m70881a(Action0 action0) {
                return C19403f.m69828a().m69833f().m69841a(action0);
            }
        };
        f60568o = new Func1<Throwable, Throwable>() {
            public /* synthetic */ Object call(Object obj) {
                return m70882a((Throwable) obj);
            }

            /* renamed from: a */
            public Throwable m70882a(Throwable th) {
                return C19403f.m69828a().m69830c().m69822a(th);
            }
        };
        f60571r = new Func1<Operator, Operator>() {
            public /* synthetic */ Object call(Object obj) {
                return m70883a((Operator) obj);
            }

            /* renamed from: a */
            public Operator m70883a(Operator operator) {
                return C19403f.m69828a().m69830c().m69825a(operator);
            }
        };
        f60569p = new C196582();
        f60572s = new C196593();
        f60570q = new C196604();
        f60573t = new C196615();
        C19401c.m69815b();
    }

    /* renamed from: b */
    static void m69815b() {
        f60555b = new C196626();
        f60556c = new C196637();
        f60557d = new C196648();
    }

    /* renamed from: a */
    public static void m69811a(Throwable th) {
        Action1 action1 = f60554a;
        if (action1 != null) {
            try {
                action1.call(th);
                return;
            } catch (Throwable th2) {
                PrintStream printStream = System.err;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The onError handler threw an Exception. It shouldn't. => ");
                stringBuilder.append(th2.getMessage());
                printStream.println(stringBuilder.toString());
                th2.printStackTrace();
                C19401c.m69816b(th2);
            }
        }
        C19401c.m69816b(th);
    }

    /* renamed from: b */
    static void m69816b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: a */
    public static <T> OnSubscribe<T> m69802a(OnSubscribe<T> onSubscribe) {
        Func1 func1 = f60555b;
        return func1 != null ? (OnSubscribe) func1.call(onSubscribe) : onSubscribe;
    }

    /* renamed from: a */
    public static <T> Single.OnSubscribe<T> m69805a(Single.OnSubscribe<T> onSubscribe) {
        Func1 func1 = f60556c;
        return func1 != null ? (Single.OnSubscribe) func1.call(onSubscribe) : onSubscribe;
    }

    /* renamed from: a */
    public static Completable$OnSubscribe m69800a(Completable$OnSubscribe completable$OnSubscribe) {
        Func1 func1 = f60557d;
        return func1 != null ? (Completable$OnSubscribe) func1.call(completable$OnSubscribe) : completable$OnSubscribe;
    }

    /* renamed from: a */
    public static C2671a m69808a(C2671a c2671a) {
        Func1 func1 = f60561h;
        return func1 != null ? (C2671a) func1.call(c2671a) : c2671a;
    }

    /* renamed from: b */
    public static C2671a m69814b(C2671a c2671a) {
        Func1 func1 = f60562i;
        return func1 != null ? (C2671a) func1.call(c2671a) : c2671a;
    }

    /* renamed from: c */
    public static C2671a m69818c(C2671a c2671a) {
        Func1 func1 = f60563j;
        return func1 != null ? (C2671a) func1.call(c2671a) : c2671a;
    }

    /* renamed from: a */
    public static Action0 m69809a(Action0 action0) {
        Func1 func1 = f60564k;
        return func1 != null ? (Action0) func1.call(action0) : action0;
    }

    /* renamed from: a */
    public static <T> OnSubscribe<T> m69803a(Observable<T> observable, OnSubscribe<T> onSubscribe) {
        Func2 func2 = f60558e;
        return func2 != null ? (OnSubscribe) func2.call(observable, onSubscribe) : onSubscribe;
    }

    /* renamed from: a */
    public static Subscription m69807a(Subscription subscription) {
        Func1 func1 = f60565l;
        return func1 != null ? (Subscription) func1.call(subscription) : subscription;
    }

    /* renamed from: c */
    public static Throwable m69817c(Throwable th) {
        Func1 func1 = f60568o;
        return func1 != null ? (Throwable) func1.call(th) : th;
    }

    /* renamed from: a */
    public static <T, R> Operator<R, T> m69804a(Operator<R, T> operator) {
        Func1 func1 = f60571r;
        return func1 != null ? (Operator) func1.call(operator) : operator;
    }

    /* renamed from: a */
    public static <T> Single.OnSubscribe<T> m69806a(Single<T> single, Single.OnSubscribe<T> onSubscribe) {
        Func2 func2 = f60559f;
        return func2 != null ? (Single.OnSubscribe) func2.call(single, onSubscribe) : onSubscribe;
    }

    /* renamed from: b */
    public static Subscription m69813b(Subscription subscription) {
        Func1 func1 = f60566m;
        return func1 != null ? (Subscription) func1.call(subscription) : subscription;
    }

    /* renamed from: d */
    public static Throwable m69820d(Throwable th) {
        Func1 func1 = f60569p;
        return func1 != null ? (Throwable) func1.call(th) : th;
    }

    /* renamed from: b */
    public static <T, R> Operator<R, T> m69812b(Operator<R, T> operator) {
        Func1 func1 = f60572s;
        return func1 != null ? (Operator) func1.call(operator) : operator;
    }

    /* renamed from: a */
    public static <T> Completable$OnSubscribe m69801a(Completable completable, Completable$OnSubscribe completable$OnSubscribe) {
        Func2 func2 = f60560g;
        return func2 != null ? (Completable$OnSubscribe) func2.call(completable, completable$OnSubscribe) : completable$OnSubscribe;
    }

    /* renamed from: e */
    public static Throwable m69821e(Throwable th) {
        Func1 func1 = f60570q;
        return func1 != null ? (Throwable) func1.call(th) : th;
    }

    /* renamed from: c */
    public static Func0<? extends ScheduledExecutorService> m69819c() {
        return f60567n;
    }
}
