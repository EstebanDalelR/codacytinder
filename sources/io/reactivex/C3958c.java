package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.observers.C17390f;
import io.reactivex.internal.operators.maybe.C18386b;
import io.reactivex.internal.operators.maybe.C18388e;
import io.reactivex.internal.operators.maybe.C18389f;
import io.reactivex.internal.operators.maybe.C18390i;
import io.reactivex.internal.operators.maybe.C19013c;
import io.reactivex.internal.operators.maybe.C19014g;
import io.reactivex.internal.operators.maybe.C19015h;
import io.reactivex.internal.operators.maybe.C19016j;
import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import io.reactivex.internal.operators.maybe.MaybeCreate;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingle;
import io.reactivex.internal.operators.maybe.MaybeFlatten;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle;
import io.reactivex.internal.operators.maybe.MaybeToFlowable;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.maybe.MaybeZipArray;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;

/* renamed from: io.reactivex.c */
public abstract class C3958c<T> implements MaybeSource<T> {
    /* renamed from: a */
    protected abstract void m15422a(MaybeObserver<? super T> maybeObserver);

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3958c<T> m15406a(MaybeOnSubscribe<T> maybeOnSubscribe) {
        C15684a.a(maybeOnSubscribe, "onSubscribe is null");
        return C2667a.m10278a(new MaybeCreate(maybeOnSubscribe));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3958c<T> m15405a() {
        return C2667a.m10278a(C18386b.f57155a);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3958c<T> m15411a(@NonNull Callable<? extends T> callable) {
        C15684a.a(callable, "callable is null");
        return C2667a.m10278a(new C18388e(callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3958c<T> m15410a(T t) {
        C15684a.a(t, "item is null");
        return C2667a.m10278a(new C18389f(t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3958c<T> m15407a(MaybeSource<T> maybeSource) {
        if (maybeSource instanceof C3958c) {
            return C2667a.m10278a((C3958c) maybeSource);
        }
        C15684a.a(maybeSource, "onSubscribe is null");
        return C2667a.m10278a(new C19016j(maybeSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T1, T2, R> C3958c<R> m15408a(MaybeSource<? extends T1> maybeSource, MaybeSource<? extends T2> maybeSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C15684a.a(maybeSource, "source1 is null");
        C15684a.a(maybeSource2, "source2 is null");
        return C3958c.m15409a(Functions.a(biFunction), maybeSource, maybeSource2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T, R> C3958c<R> m15409a(Function<? super Object[], ? extends R> function, MaybeSource<? extends T>... maybeSourceArr) {
        C15684a.a(maybeSourceArr, "sources is null");
        if (maybeSourceArr.length == 0) {
            return C3958c.m15405a();
        }
        C15684a.a(function, "zipper is null");
        return C2667a.m10278a(new MaybeZipArray(maybeSourceArr, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final T m15430b() {
        Object c17390f = new C17390f();
        subscribe(c17390f);
        return c17390f.b();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <U> C3958c<U> m15418a(Class<? extends U> cls) {
        C15684a.a(cls, "clazz is null");
        return m15440f(Functions.a(cls));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <R> C3958c<R> m15412a(MaybeTransformer<? super T, ? extends R> maybeTransformer) {
        return C3958c.m15407a(((MaybeTransformer) C15684a.a(maybeTransformer, "transformer is null")).apply(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3958c<T> m15428b(T t) {
        C15684a.a(t, "item is null");
        return m15424b(C3958c.m15410a((Object) t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3958c<T> m15414a(Action action) {
        return C2667a.m10278a(new C19015h(this, Functions.b(), Functions.b(), Functions.b(), (Action) C15684a.a(action, "onComplete is null"), Functions.f48541c, Functions.f48541c));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3958c<T> m15415a(Consumer<? super Throwable> consumer) {
        return C2667a.m10278a(new C19015h(this, Functions.b(), Functions.b(), (Consumer) C15684a.a(consumer, "onError is null"), Functions.f48541c, Functions.f48541c, Functions.f48541c));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3958c<T> m15426b(Consumer<? super Disposable> consumer) {
        return C2667a.m10278a(new C19015h(this, (Consumer) C15684a.a(consumer, "onSubscribe is null"), Functions.b(), Functions.b(), Functions.f48541c, Functions.f48541c, Functions.f48541c));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3958c<T> m15433c(Consumer<? super T> consumer) {
        return C2667a.m10278a(new C19015h(this, Functions.b(), (Consumer) C15684a.a(consumer, "onSubscribe is null"), Functions.b(), Functions.f48541c, Functions.f48541c, Functions.f48541c));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3958c<T> m15417a(Predicate<? super T> predicate) {
        C15684a.a(predicate, "predicate is null");
        return C2667a.m10278a(new C19013c(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <R> C3958c<R> m15416a(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10278a(new MaybeFlatten(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final <R> C3959e<R> m15429b(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return m15436d().flatMap(function);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: c */
    public final <R> C3957b<R> m15432c(Function<? super T, ? extends Publisher<? extends R>> function) {
        return m15431c().m15366b((Function) function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: d */
    public final <R> C3960g<R> m15437d(Function<? super T, ? extends SingleSource<? extends R>> function) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10283a(new MaybeFlatMapSingle(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: e */
    public final C3956a m15438e(Function<? super T, ? extends CompletableSource> function) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10274a(new MaybeFlatMapCompletable(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: f */
    public final <R> C3958c<R> m15440f(Function<? super T, ? extends R> function) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10278a(new C19014g(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    /* renamed from: a */
    public final C3958c<T> m15413a(C15679f c15679f) {
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10278a(new MaybeObserveOn(this, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final <U> C3958c<U> m15427b(Class<U> cls) {
        C15684a.a(cls, "clazz is null");
        return m15417a(Functions.b(cls)).m15418a((Class) cls);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3957b<T> m15431c() {
        if (this instanceof FuseToFlowable) {
            return ((FuseToFlowable) this).fuseToFlowable();
        }
        return C2667a.m10276a(new MaybeToFlowable(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: d */
    public final C3959e<T> m15436d() {
        if (this instanceof FuseToObservable) {
            return ((FuseToObservable) this).fuseToObservable();
        }
        return C2667a.m10279a(new MaybeToObservable(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3960g<T> m15434c(T t) {
        C15684a.a(t, "defaultValue is null");
        return C2667a.m10283a(new C18390i(this, t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: e */
    public final C3960g<T> m15439e() {
        return C2667a.m10283a(new C18390i(this, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: d */
    public final Disposable m15435d(Consumer<? super T> consumer) {
        return m15420a((Consumer) consumer, Functions.f48544f, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final Disposable m15419a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return m15420a((Consumer) consumer, (Consumer) consumer2, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final Disposable m15420a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        C15684a.a(consumer, "onSuccess is null");
        C15684a.a(consumer2, "onError is null");
        C15684a.a(action, "onComplete is null");
        return (Disposable) m15423b(new MaybeCallbackObserver(consumer, consumer2, action));
    }

    @SchedulerSupport("none")
    public final void subscribe(MaybeObserver<? super T> maybeObserver) {
        C15684a.a(maybeObserver, "observer is null");
        MaybeObserver a = C2667a.m10271a(this, (MaybeObserver) maybeObserver);
        C15684a.a(a, "observer returned by the RxJavaPlugins hook is null");
        try {
            m15422a(a);
        } catch (MaybeObserver<? super T> maybeObserver2) {
            throw maybeObserver2;
        } catch (MaybeObserver<? super T> maybeObserver22) {
            C15678a.b(maybeObserver22);
            new NullPointerException("subscribeActual failed").initCause(maybeObserver22);
        }
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    /* renamed from: b */
    public final C3958c<T> m15425b(C15679f c15679f) {
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10278a(new MaybeSubscribeOn(this, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final <E extends MaybeObserver<? super T>> E m15423b(E e) {
        subscribe(e);
        return e;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3958c<T> m15424b(MaybeSource<? extends T> maybeSource) {
        C15684a.a(maybeSource, "other is null");
        return C2667a.m10278a(new MaybeSwitchIfEmpty(this, maybeSource));
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3960g<T> m15421a(SingleSource<? extends T> singleSource) {
        C15684a.a(singleSource, "other is null");
        return C2667a.m10283a(new MaybeSwitchIfEmptySingle(this, singleSource));
    }
}
