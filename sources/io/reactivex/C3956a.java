package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.observers.C17390f;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import io.reactivex.internal.observers.EmptyCompletableObserver;
import io.reactivex.internal.operators.completable.C18346a;
import io.reactivex.internal.operators.completable.C18347b;
import io.reactivex.internal.operators.completable.C18348c;
import io.reactivex.internal.operators.completable.C18349d;
import io.reactivex.internal.operators.completable.C18350e;
import io.reactivex.internal.operators.completable.C18352f;
import io.reactivex.internal.operators.completable.C18354h;
import io.reactivex.internal.operators.completable.C18356j;
import io.reactivex.internal.operators.completable.C18357k;
import io.reactivex.internal.operators.completable.C18358l;
import io.reactivex.internal.operators.completable.C18359m;
import io.reactivex.internal.operators.completable.C18360n;
import io.reactivex.internal.operators.completable.C18361o;
import io.reactivex.internal.operators.completable.C18362p;
import io.reactivex.internal.operators.completable.CompletableConcatArray;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.internal.operators.completable.CompletableDoFinally;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.internal.operators.completable.CompletableTimer;
import io.reactivex.internal.operators.observable.C18411t;
import io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import io.reactivex.p079d.C2667a;
import io.reactivex.schedulers.C15756a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;

/* renamed from: io.reactivex.a */
public abstract class C3956a implements CompletableSource {
    /* renamed from: a */
    protected abstract void m15291a(CompletableObserver completableObserver);

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static C3956a m15269a() {
        return C2667a.m10274a(C18347b.f56822a);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static C3956a m15280a(CompletableSource... completableSourceArr) {
        C15684a.a(completableSourceArr, "sources is null");
        if (completableSourceArr.length == 0) {
            return C3956a.m15269a();
        }
        if (completableSourceArr.length == 1) {
            return C3956a.m15273a(completableSourceArr[0]);
        }
        return C2667a.m10274a(new CompletableConcatArray(completableSourceArr));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static C3956a m15272a(CompletableOnSubscribe completableOnSubscribe) {
        C15684a.a(completableOnSubscribe, "source is null");
        return C2667a.m10274a(new CompletableCreate(completableOnSubscribe));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static C3956a m15275a(Action action) {
        C15684a.a(action, "run is null");
        return C2667a.m10274a(new C18348c(action));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static C3956a m15278a(Callable<?> callable) {
        C15684a.a(callable, "callable is null");
        return C2667a.m10274a(new C18349d(callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3956a m15274a(ObservableSource<T> observableSource) {
        C15684a.a(observableSource, "observable is null");
        return C2667a.m10274a(new C18350e(observableSource));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3956a m15279a(Publisher<T> publisher) {
        C15684a.a(publisher, "publisher is null");
        return C2667a.m10274a(new C18352f(publisher));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static C3956a m15277a(Iterable<? extends CompletableSource> iterable) {
        C15684a.a(iterable, "sources is null");
        return C2667a.m10274a(new C18356j(iterable));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    /* renamed from: a */
    public static C3956a m15270a(long j, TimeUnit timeUnit) {
        return C3956a.m15271a(j, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    /* renamed from: a */
    public static C3956a m15271a(long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10274a(new CompletableTimer(j, timeUnit, c15679f));
    }

    /* renamed from: a */
    private static NullPointerException m15281a(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static C3956a m15273a(CompletableSource completableSource) {
        C15684a.a(completableSource, "source is null");
        if (completableSource instanceof C3956a) {
            return C2667a.m10274a((C3956a) completableSource);
        }
        return C2667a.m10274a(new C18354h(completableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final <T> C3959e<T> m15298b(ObservableSource<T> observableSource) {
        C15684a.a(observableSource, "next is null");
        return C2667a.m10279a(new C18411t(observableSource, m15308f()));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <T> C3960g<T> m15289a(SingleSource<T> singleSource) {
        C15684a.a(singleSource, "next is null");
        return C2667a.m10283a(new SingleDelayWithCompletable(singleSource, this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3956a m15293b(CompletableSource completableSource) {
        return m15302c(completableSource);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final Throwable m15300b() {
        Object c17390f = new C17390f();
        subscribe(c17390f);
        return c17390f.c();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3956a m15283a(CompletableTransformer completableTransformer) {
        return C3956a.m15273a(((CompletableTransformer) C15684a.a(completableTransformer, "transformer is null")).apply(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3956a m15302c(CompletableSource completableSource) {
        C15684a.a(completableSource, "other is null");
        return C3956a.m15280a(this, completableSource);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    /* renamed from: b */
    public final C3956a m15292b(long j, TimeUnit timeUnit, C15679f c15679f) {
        return m15282a(j, timeUnit, c15679f, false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    /* renamed from: a */
    public final C3956a m15282a(long j, TimeUnit timeUnit, C15679f c15679f, boolean z) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10274a(new C18346a(this, j, timeUnit, c15679f, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3956a m15295b(Action action) {
        return m15276a(Functions.b(), Functions.b(), action, Functions.f48541c, Functions.f48541c, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3956a m15303c(Action action) {
        return m15276a(Functions.b(), Functions.b(), Functions.f48541c, Functions.f48541c, Functions.f48541c, action);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3956a m15285a(Consumer<? super Throwable> consumer) {
        return m15276a(Functions.b(), consumer, Functions.f48541c, Functions.f48541c, Functions.f48541c, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    private C3956a m15276a(Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2, Action action3, Action action4) {
        C15684a.a(consumer, "onSubscribe is null");
        C15684a.a(consumer2, "onError is null");
        C15684a.a(action, "onComplete is null");
        C15684a.a(action2, "onTerminate is null");
        C15684a.a(action3, "onAfterTerminate is null");
        C15684a.a(action4, "onDispose is null");
        return C2667a.m10274a(new C18358l(this, consumer, consumer2, action, action2, action3, action4));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3956a m15296b(Consumer<? super Disposable> consumer) {
        return m15276a(consumer, Functions.b(), Functions.f48541c, Functions.f48541c, Functions.f48541c, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: d */
    public final C3956a m15304d(Action action) {
        return m15276a(Functions.b(), Functions.b(), Functions.f48541c, action, Functions.f48541c, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: e */
    public final C3956a m15306e(Action action) {
        C15684a.a(action, "onFinally is null");
        return C2667a.m10274a(new CompletableDoFinally(this, action));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    /* renamed from: a */
    public final C3956a m15284a(C15679f c15679f) {
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10274a(new CompletableObserveOn(this, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3956a m15301c() {
        return m15287a(Functions.c());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3956a m15287a(Predicate<? super Throwable> predicate) {
        C15684a.a(predicate, "predicate is null");
        return C2667a.m10274a(new C18357k(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3956a m15286a(Function<? super Throwable, ? extends CompletableSource> function) {
        C15684a.a(function, "errorMapper is null");
        return C2667a.m10274a(new C18359m(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3956a m15297b(Function<? super C3957b<Throwable>, ? extends Publisher<?>> function) {
        return C3956a.m15279a(m15307e().m15395h(function));
    }

    @SchedulerSupport("none")
    /* renamed from: d */
    public final Disposable m15305d() {
        Object emptyCompletableObserver = new EmptyCompletableObserver();
        subscribe(emptyCompletableObserver);
        return emptyCompletableObserver;
    }

    @SchedulerSupport("none")
    public final void subscribe(CompletableObserver completableObserver) {
        C15684a.a(completableObserver, "s is null");
        try {
            m15291a(C2667a.m10270a(this, completableObserver));
        } catch (CompletableObserver completableObserver2) {
            throw completableObserver2;
        } catch (Throwable th) {
            C15678a.b(th);
            C2667a.m10289a(th);
            completableObserver2 = C3956a.m15281a(th);
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final Disposable m15288a(Action action, Consumer<? super Throwable> consumer) {
        C15684a.a(consumer, "onError is null");
        C15684a.a(action, "onComplete is null");
        Object callbackCompletableObserver = new CallbackCompletableObserver(consumer, action);
        subscribe(callbackCompletableObserver);
        return callbackCompletableObserver;
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    /* renamed from: b */
    public final C3956a m15294b(C15679f c15679f) {
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10274a(new CompletableSubscribeOn(this, c15679f));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: e */
    public final <T> C3957b<T> m15307e() {
        if (this instanceof FuseToFlowable) {
            return ((FuseToFlowable) this).fuseToFlowable();
        }
        return C2667a.m10276a(new C18360n(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: f */
    public final <T> C3959e<T> m15308f() {
        if (this instanceof FuseToObservable) {
            return ((FuseToObservable) this).fuseToObservable();
        }
        return C2667a.m10279a(new C18361o(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final <T> C3960g<T> m15299b(Callable<? extends T> callable) {
        C15684a.a(callable, "completionValueSupplier is null");
        return C2667a.m10283a(new C18362p(this, callable, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <T> C3960g<T> m15290a(T t) {
        C15684a.a(t, "completionValue is null");
        return C2667a.m10283a(new C18362p(this, null, t));
    }
}
