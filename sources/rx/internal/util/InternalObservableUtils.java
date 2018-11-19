package rx.internal.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.C2671a;
import rx.Notification;
import rx.Observable;
import rx.Observable.Operator;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action1;
import rx.functions.Action2;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.operators.aa;
import rx.p497b.C19565b;

public enum InternalObservableUtils {
    ;
    
    public static final C19762g COUNTER = null;
    static final C19760e ERROR_EXTRACTOR = null;
    public static final Action1<Throwable> ERROR_NOT_IMPLEMENTED = null;
    public static final Operator<Boolean, Object> IS_EMPTY = null;
    public static final C19763h LONG_COUNTER = null;
    public static final C19761f OBJECT_EQUALS = null;
    static final C19770o RETURNS_VOID = null;
    public static final C19772q TO_ARRAY = null;

    /* renamed from: rx.internal.util.InternalObservableUtils$a */
    static final class C19757a<T, R> implements Func2<R, T, R> {
        /* renamed from: a */
        final Action2<R, ? super T> f61825a;

        public C19757a(Action2<R, ? super T> action2) {
            this.f61825a = action2;
        }

        public R call(R r, T t) {
            this.f61825a.call(r, t);
            return r;
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$b */
    static final class C19758b implements Func1<Object, Boolean> {
        /* renamed from: a */
        final Object f61826a;

        public /* synthetic */ Object call(Object obj) {
            return m71040a(obj);
        }

        public C19758b(Object obj) {
            this.f61826a = obj;
        }

        /* renamed from: a */
        public Boolean m71040a(Object obj) {
            if (obj != this.f61826a) {
                if (obj == null || obj.equals(this.f61826a) == null) {
                    obj = null;
                    return Boolean.valueOf(obj);
                }
            }
            obj = true;
            return Boolean.valueOf(obj);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$d */
    static final class C19759d implements Func1<Object, Boolean> {
        /* renamed from: a */
        final Class<?> f61827a;

        public /* synthetic */ Object call(Object obj) {
            return m71041a(obj);
        }

        public C19759d(Class<?> cls) {
            this.f61827a = cls;
        }

        /* renamed from: a */
        public Boolean m71041a(Object obj) {
            return Boolean.valueOf(this.f61827a.isInstance(obj));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$e */
    static final class C19760e implements Func1<Notification<?>, Throwable> {
        C19760e() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m71042a((Notification) obj);
        }

        /* renamed from: a */
        public Throwable m71042a(Notification<?> notification) {
            return notification.m69600b();
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$f */
    static final class C19761f implements Func2<Object, Object, Boolean> {
        C19761f() {
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m71043a(obj, obj2);
        }

        /* renamed from: a */
        public Boolean m71043a(Object obj, Object obj2) {
            if (obj != obj2) {
                if (obj == null || obj.equals(obj2) == null) {
                    obj = null;
                    return Boolean.valueOf(obj);
                }
            }
            obj = true;
            return Boolean.valueOf(obj);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$g */
    static final class C19762g implements Func2<Integer, Object, Integer> {
        C19762g() {
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m71044a((Integer) obj, obj2);
        }

        /* renamed from: a */
        public Integer m71044a(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$h */
    static final class C19763h implements Func2<Long, Object, Long> {
        C19763h() {
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m71045a((Long) obj, obj2);
        }

        /* renamed from: a */
        public Long m71045a(Long l, Object obj) {
            return Long.valueOf(l.longValue() + 1);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$i */
    static final class C19764i implements Func1<Observable<? extends Notification<?>>, Observable<?>> {
        /* renamed from: a */
        final Func1<? super Observable<? extends Void>, ? extends Observable<?>> f61828a;

        public /* synthetic */ Object call(Object obj) {
            return m71046a((Observable) obj);
        }

        public C19764i(Func1<? super Observable<? extends Void>, ? extends Observable<?>> func1) {
            this.f61828a = func1;
        }

        /* renamed from: a */
        public Observable<?> m71046a(Observable<? extends Notification<?>> observable) {
            return (Observable) this.f61828a.call(observable.m69719k(InternalObservableUtils.RETURNS_VOID));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$j */
    static final class C19765j<T> implements Func0<C19565b<T>> {
        /* renamed from: a */
        private final Observable<T> f61829a;
        /* renamed from: b */
        private final int f61830b;

        public /* synthetic */ Object call() {
            return m71047a();
        }

        C19765j(Observable<T> observable, int i) {
            this.f61829a = observable;
            this.f61830b = i;
        }

        /* renamed from: a */
        public C19565b<T> m71047a() {
            return this.f61829a.m69664a(this.f61830b);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$k */
    static final class C19766k<T> implements Func0<C19565b<T>> {
        /* renamed from: a */
        private final TimeUnit f61831a;
        /* renamed from: b */
        private final Observable<T> f61832b;
        /* renamed from: c */
        private final long f61833c;
        /* renamed from: d */
        private final C2671a f61834d;

        public /* synthetic */ Object call() {
            return m71048a();
        }

        C19766k(Observable<T> observable, long j, TimeUnit timeUnit, C2671a c2671a) {
            this.f61831a = timeUnit;
            this.f61832b = observable;
            this.f61833c = j;
            this.f61834d = c2671a;
        }

        /* renamed from: a */
        public C19565b<T> m71048a() {
            return this.f61832b.m69697e(this.f61833c, this.f61831a, this.f61834d);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$l */
    static final class C19767l<T> implements Func0<C19565b<T>> {
        /* renamed from: a */
        private final Observable<T> f61835a;

        public /* synthetic */ Object call() {
            return m71049a();
        }

        C19767l(Observable<T> observable) {
            this.f61835a = observable;
        }

        /* renamed from: a */
        public C19565b<T> m71049a() {
            return this.f61835a.m69729p();
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$m */
    static final class C19768m<T> implements Func0<C19565b<T>> {
        /* renamed from: a */
        private final long f61836a;
        /* renamed from: b */
        private final TimeUnit f61837b;
        /* renamed from: c */
        private final C2671a f61838c;
        /* renamed from: d */
        private final int f61839d;
        /* renamed from: e */
        private final Observable<T> f61840e;

        public /* synthetic */ Object call() {
            return m71050a();
        }

        C19768m(Observable<T> observable, int i, long j, TimeUnit timeUnit, C2671a c2671a) {
            this.f61836a = j;
            this.f61837b = timeUnit;
            this.f61838c = c2671a;
            this.f61839d = i;
            this.f61840e = observable;
        }

        /* renamed from: a */
        public C19565b<T> m71050a() {
            return this.f61840e.m69665a(this.f61839d, this.f61836a, this.f61837b, this.f61838c);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$n */
    static final class C19769n implements Func1<Observable<? extends Notification<?>>, Observable<?>> {
        /* renamed from: a */
        final Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> f61841a;

        public /* synthetic */ Object call(Object obj) {
            return m71051a((Observable) obj);
        }

        public C19769n(Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> func1) {
            this.f61841a = func1;
        }

        /* renamed from: a */
        public Observable<?> m71051a(Observable<? extends Notification<?>> observable) {
            return (Observable) this.f61841a.call(observable.m69719k(InternalObservableUtils.ERROR_EXTRACTOR));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$o */
    static final class C19770o implements Func1<Object, Void> {
        /* renamed from: a */
        public Void m71052a(Object obj) {
            return null;
        }

        C19770o() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m71052a(obj);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$p */
    static final class C19771p<T, R> implements Func1<Observable<T>, Observable<R>> {
        /* renamed from: a */
        final Func1<? super Observable<T>, ? extends Observable<R>> f61842a;
        /* renamed from: b */
        final C2671a f61843b;

        public /* synthetic */ Object call(Object obj) {
            return m71053a((Observable) obj);
        }

        public C19771p(Func1<? super Observable<T>, ? extends Observable<R>> func1, C2671a c2671a) {
            this.f61842a = func1;
            this.f61843b = c2671a;
        }

        /* renamed from: a */
        public Observable<R> m71053a(Observable<T> observable) {
            return ((Observable) this.f61842a.call(observable)).m69651a(this.f61843b);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$q */
    static final class C19772q implements Func1<List<? extends Observable<?>>, Observable<?>[]> {
        C19772q() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m71054a((List) obj);
        }

        /* renamed from: a */
        public Observable<?>[] m71054a(List<? extends Observable<?>> list) {
            return (Observable[]) list.toArray(new Observable[list.size()]);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$c */
    static final class C19853c implements Action1<Throwable> {
        C19853c() {
        }

        public /* synthetic */ void call(Object obj) {
            m71480a((Throwable) obj);
        }

        /* renamed from: a */
        public void m71480a(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    }

    static {
        LONG_COUNTER = new C19763h();
        OBJECT_EQUALS = new C19761f();
        TO_ARRAY = new C19772q();
        RETURNS_VOID = new C19770o();
        COUNTER = new C19762g();
        ERROR_EXTRACTOR = new C19760e();
        ERROR_NOT_IMPLEMENTED = new C19853c();
        IS_EMPTY = new aa(UtilityFunctions.m69917a(), true);
    }

    public static Func1<Object, Boolean> equalsWith(Object obj) {
        return new C19758b(obj);
    }

    public static Func1<Object, Boolean> isInstanceOf(Class<?> cls) {
        return new C19759d(cls);
    }

    public static Func1<Observable<? extends Notification<?>>, Observable<?>> createRepeatDematerializer(Func1<? super Observable<? extends Void>, ? extends Observable<?>> func1) {
        return new C19764i(func1);
    }

    public static <T, R> Func1<Observable<T>, Observable<R>> createReplaySelectorAndObserveOn(Func1<? super Observable<T>, ? extends Observable<R>> func1, C2671a c2671a) {
        return new C19771p(func1, c2671a);
    }

    public static Func1<Observable<? extends Notification<?>>, Observable<?>> createRetryDematerializer(Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return new C19769n(func1);
    }

    public static <T> Func0<C19565b<T>> createReplaySupplier(Observable<T> observable) {
        return new C19767l(observable);
    }

    public static <T> Func0<C19565b<T>> createReplaySupplier(Observable<T> observable, int i) {
        return new C19765j(observable, i);
    }

    public static <T> Func0<C19565b<T>> createReplaySupplier(Observable<T> observable, long j, TimeUnit timeUnit, C2671a c2671a) {
        return new C19766k(observable, j, timeUnit, c2671a);
    }

    public static <T> Func0<C19565b<T>> createReplaySupplier(Observable<T> observable, int i, long j, TimeUnit timeUnit, C2671a c2671a) {
        return new C19768m(observable, i, j, timeUnit, c2671a);
    }

    public static <T, R> Func2<R, T, R> createCollectorCaller(Action2<R, ? super T> action2) {
        return new C19757a(action2);
    }
}
