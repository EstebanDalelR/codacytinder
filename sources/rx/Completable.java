package rx;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import rx.exceptions.C19410a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.internal.operators.C19877d;
import rx.internal.operators.C19878e;
import rx.internal.operators.CompletableFromEmitter;
import rx.internal.operators.CompletableOnSubscribeConcatArray;
import rx.internal.operators.CompletableOnSubscribeConcatIterable;
import rx.internal.util.UtilityFunctions;
import rx.observers.C19619b;
import rx.p498c.C19401c;
import rx.p500e.C19574c;
import rx.schedulers.Schedulers;

public class Completable {
    /* renamed from: a */
    static final Completable f8466a = new Completable(new Completable$1(), false);
    /* renamed from: b */
    static final Completable f8467b = new Completable(new Completable$8(), false);
    /* renamed from: c */
    private final Completable$OnSubscribe f8468c;

    public interface Transformer extends Func1<Completable, Completable> {
    }

    /* renamed from: a */
    public static Completable m10369a(Completable... completableArr) {
        m10356a((Object) completableArr);
        if (completableArr.length == 0) {
            return m10357a();
        }
        if (completableArr.length == 1) {
            return completableArr[0];
        }
        return m10363a(new Completable$17(completableArr));
    }

    /* renamed from: a */
    public static Completable m10357a() {
        Completable$OnSubscribe a = C19401c.a(f8466a.f8468c);
        if (a == f8466a.f8468c) {
            return f8466a;
        }
        return new Completable(a, false);
    }

    /* renamed from: b */
    public static Completable m10373b(Completable... completableArr) {
        m10356a((Object) completableArr);
        if (completableArr.length == 0) {
            return m10357a();
        }
        if (completableArr.length == 1) {
            return completableArr[0];
        }
        return m10363a(new CompletableOnSubscribeConcatArray(completableArr));
    }

    /* renamed from: a */
    public static Completable m10360a(Iterable<? extends Completable> iterable) {
        m10356a((Object) iterable);
        return m10363a(new CompletableOnSubscribeConcatIterable(iterable));
    }

    /* renamed from: a */
    public static Completable m10363a(Completable$OnSubscribe completable$OnSubscribe) {
        m10356a((Object) completable$OnSubscribe);
        try {
            return new Completable(completable$OnSubscribe);
        } catch (Completable$OnSubscribe completable$OnSubscribe2) {
            throw completable$OnSubscribe2;
        } catch (Throwable th) {
            C19401c.a(th);
            completable$OnSubscribe2 = m10371b(th);
        }
    }

    /* renamed from: a */
    public static Completable m10368a(Func0<? extends Completable> func0) {
        m10356a((Object) func0);
        return m10363a(new Completable$23(func0));
    }

    /* renamed from: a */
    public static Completable m10361a(Throwable th) {
        m10356a((Object) th);
        return m10363a(new Completable$24(th));
    }

    /* renamed from: a */
    public static Completable m10366a(Action0 action0) {
        m10356a((Object) action0);
        return m10363a(new Completable$25(action0));
    }

    /* renamed from: a */
    public static Completable m10362a(Callable<?> callable) {
        m10356a((Object) callable);
        return m10363a(new Completable$26(callable));
    }

    /* renamed from: a */
    public static Completable m10367a(Action1<CompletableEmitter> action1) {
        return m10363a(new CompletableFromEmitter(action1));
    }

    /* renamed from: a */
    public static Completable m10364a(Observable<?> observable) {
        m10356a((Object) observable);
        return m10363a(new Completable$2(observable));
    }

    /* renamed from: a */
    public static Completable m10365a(Single<?> single) {
        m10356a((Object) single);
        return m10363a(new Completable$3(single));
    }

    /* renamed from: c */
    public static Completable m10374c(Completable... completableArr) {
        m10356a((Object) completableArr);
        return m10363a(new C19877d(completableArr));
    }

    /* renamed from: b */
    public static Completable m10372b(Iterable<? extends Completable> iterable) {
        m10356a((Object) iterable);
        return m10363a(new C19878e(iterable));
    }

    /* renamed from: a */
    static <T> T m10356a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static Completable m10358a(long j, TimeUnit timeUnit) {
        return m10359a(j, timeUnit, Schedulers.computation());
    }

    /* renamed from: a */
    public static Completable m10359a(long j, TimeUnit timeUnit, C2671a c2671a) {
        m10356a((Object) timeUnit);
        m10356a((Object) c2671a);
        return m10363a(new Completable$4(c2671a, j, timeUnit));
    }

    /* renamed from: b */
    static NullPointerException m10371b(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    protected Completable(Completable$OnSubscribe completable$OnSubscribe) {
        this.f8468c = C19401c.a(completable$OnSubscribe);
    }

    protected Completable(Completable$OnSubscribe completable$OnSubscribe, boolean z) {
        if (z) {
            completable$OnSubscribe = C19401c.a(completable$OnSubscribe);
        }
        this.f8468c = completable$OnSubscribe;
    }

    /* renamed from: a */
    public final Completable m10376a(Transformer transformer) {
        return (Completable) m10403e((Func1) transformer);
    }

    /* renamed from: b */
    public final <T> Observable<T> m10390b(Observable<T> observable) {
        m10356a((Object) observable);
        return observable.g(m10404e());
    }

    /* renamed from: b */
    public final <T> Single<T> m10392b(Single<T> single) {
        m10356a((Object) single);
        return single.b(m10404e());
    }

    /* renamed from: a */
    public final Completable m10377a(Completable completable) {
        return m10385b(completable);
    }

    /* renamed from: b */
    public final Completable m10385b(Completable completable) {
        m10356a((Object) completable);
        return m10373b(this, completable);
    }

    /* renamed from: b */
    public final Completable m10387b(Action0 action0) {
        return m10379a(Actions.a(), Actions.a(), action0, Actions.a(), Actions.a());
    }

    /* renamed from: b */
    public final Completable m10388b(Action1<Notification<Object>> action1) {
        if (action1 != null) {
            return m10379a(Actions.a(), new Completable$5(this, action1), new Completable$6(this, action1), Actions.a(), Actions.a());
        }
        throw new IllegalArgumentException("onNotification is null");
    }

    /* renamed from: c */
    public final Completable m10396c(Action0 action0) {
        return m10379a(Actions.a(), Actions.a(), Actions.a(), Actions.a(), action0);
    }

    /* renamed from: c */
    public final Completable m10397c(Action1<? super Throwable> action1) {
        return m10379a(Actions.a(), action1, Actions.a(), Actions.a(), Actions.a());
    }

    /* renamed from: a */
    protected final Completable m10379a(Action1<? super Subscription> action1, Action1<? super Throwable> action12, Action0 action0, Action0 action02, Action0 action03) {
        m10356a((Object) action1);
        m10356a((Object) action12);
        m10356a((Object) action0);
        m10356a((Object) action02);
        m10356a((Object) action03);
        return m10363a(new Completable$7(this, action0, action02, action12, action1, action03));
    }

    /* renamed from: d */
    public final Completable m10400d(Action1<? super Subscription> action1) {
        return m10379a(action1, Actions.a(), Actions.a(), Actions.a(), Actions.a());
    }

    /* renamed from: d */
    public final Completable m10399d(Action0 action0) {
        return m10379a(Actions.a(), new Completable$9(this, action0), action0, Actions.a(), Actions.a());
    }

    /* renamed from: b */
    public final Throwable m10384b() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        m10382a(new Completable$10(this, countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            countDownLatch.await();
            return thArr[0];
        } catch (Throwable e) {
            throw C19410a.a(e);
        }
    }

    /* renamed from: a */
    public final Completable m10378a(C2671a c2671a) {
        m10356a((Object) c2671a);
        return m10363a(new Completable$11(this, c2671a));
    }

    /* renamed from: c */
    public final Completable m10395c() {
        return m10380a(UtilityFunctions.a());
    }

    /* renamed from: a */
    public final Completable m10380a(Func1<? super Throwable, Boolean> func1) {
        m10356a((Object) func1);
        return m10363a(new Completable$12(this, func1));
    }

    /* renamed from: b */
    public final Completable m10389b(Func1<? super Throwable, ? extends Completable> func1) {
        m10356a((Object) func1);
        return m10363a(new Completable$13(this, func1));
    }

    /* renamed from: c */
    public final Completable m10398c(Func1<? super Observable<? extends Void>, ? extends Observable<?>> func1) {
        m10356a((Object) func1);
        return m10364a(m10404e().n(func1));
    }

    /* renamed from: d */
    public final Completable m10401d(Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return m10364a(m10404e().o(func1));
    }

    /* renamed from: d */
    public final Subscription m10402d() {
        Subscription c19574c = new C19574c();
        m10382a(new Completable$14(this, c19574c));
        return c19574c;
    }

    /* renamed from: e */
    public final Subscription m10405e(Action0 action0) {
        m10356a((Object) action0);
        Subscription c19574c = new C19574c();
        m10382a(new Completable$15(this, action0, c19574c));
        return c19574c;
    }

    /* renamed from: a */
    public final Subscription m10381a(Action0 action0, Action1<? super Throwable> action1) {
        m10356a((Object) action0);
        m10356a((Object) action1);
        Subscription c19574c = new C19574c();
        m10382a(new Completable$16(this, action0, c19574c, action1));
        return c19574c;
    }

    /* renamed from: c */
    static void m10375c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: a */
    public final void m10382a(CompletableSubscriber completableSubscriber) {
        m10356a((Object) completableSubscriber);
        try {
            C19401c.a(this, this.f8468c).call(completableSubscriber);
        } catch (CompletableSubscriber completableSubscriber2) {
            throw completableSubscriber2;
        } catch (CompletableSubscriber completableSubscriber22) {
            C19410a.b(completableSubscriber22);
            Throwable e = C19401c.e(completableSubscriber22);
            C19401c.a(e);
            completableSubscriber22 = m10371b(e);
        }
    }

    /* renamed from: b */
    public final void m10394b(CompletableSubscriber completableSubscriber) {
        if (!(completableSubscriber instanceof C19619b)) {
            completableSubscriber = new C19619b(completableSubscriber);
        }
        m10382a(completableSubscriber);
    }

    /* renamed from: a */
    public final <T> void m10383a(C19571c<T> c19571c) {
        m10370a((C19571c) c19571c, true);
    }

    /* renamed from: a */
    private <T> void m10370a(C19571c<T> c19571c, boolean z) {
        m10356a((Object) c19571c);
        if (z) {
            try {
                c19571c.onStart();
            } catch (C19571c<T> c19571c2) {
                throw c19571c2;
            } catch (C19571c<T> c19571c22) {
                C19410a.b(c19571c22);
                Throwable c = C19401c.c(c19571c22);
                C19401c.a(c);
                c19571c22 = m10371b(c);
            }
        }
        m10382a(new Completable$18(this, c19571c22));
        C19401c.a(c19571c22);
    }

    /* renamed from: b */
    public final Completable m10386b(C2671a c2671a) {
        m10356a((Object) c2671a);
        return m10363a(new Completable$19(this, c2671a));
    }

    /* renamed from: e */
    public final <R> R m10403e(Func1<? super Completable, R> func1) {
        return func1.call(this);
    }

    /* renamed from: e */
    public final <T> Observable<T> m10404e() {
        return Observable.b(new Completable$20(this));
    }

    /* renamed from: b */
    public final <T> Single<T> m10393b(Func0<? extends T> func0) {
        m10356a((Object) func0);
        return Single.a(new Completable$21(this, func0));
    }

    /* renamed from: b */
    public final <T> Single<T> m10391b(T t) {
        m10356a((Object) t);
        return m10393b(new Completable$22(this, t));
    }
}
