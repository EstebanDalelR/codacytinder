package io.reactivex;

import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.observers.C17390f;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.completable.C18353g;
import io.reactivex.internal.operators.flowable.C18365b;
import io.reactivex.internal.operators.flowable.C18380r;
import io.reactivex.internal.operators.maybe.C18387d;
import io.reactivex.internal.operators.single.C18412a;
import io.reactivex.internal.operators.single.C18413b;
import io.reactivex.internal.operators.single.C18414c;
import io.reactivex.internal.operators.single.C18415d;
import io.reactivex.internal.operators.single.C18416e;
import io.reactivex.internal.operators.single.C18417f;
import io.reactivex.internal.operators.single.C18418g;
import io.reactivex.internal.operators.single.C18419h;
import io.reactivex.internal.operators.single.C18420i;
import io.reactivex.internal.operators.single.C18421j;
import io.reactivex.internal.operators.single.C18422k;
import io.reactivex.internal.operators.single.SingleDoFinally;
import io.reactivex.internal.operators.single.SingleDoOnDispose;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleFlatMapCompletable;
import io.reactivex.internal.operators.single.SingleInternalHelper;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.operators.single.SingleTimer;
import io.reactivex.internal.operators.single.SingleToFlowable;
import io.reactivex.internal.operators.single.SingleZipArray;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.p079d.C2667a;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;

/* renamed from: io.reactivex.g */
public abstract class C3960g<T> implements SingleSource<T> {
    /* renamed from: a */
    protected abstract void m15464a(@NonNull SingleObserver<? super T> singleObserver);

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3957b<T> m15442a(Publisher<? extends SingleSource<? extends T>> publisher) {
        return C3960g.m15443a((Publisher) publisher, 2);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3957b<T> m15443a(Publisher<? extends SingleSource<? extends T>> publisher, int i) {
        C15684a.a(publisher, "sources is null");
        C15684a.a(i, "prefetch");
        return C2667a.m10276a(new C18365b(publisher, SingleInternalHelper.a(), i, ErrorMode.IMMEDIATE));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3957b<T> m15441a(SingleSource<? extends T> singleSource, SingleSource<? extends T> singleSource2, SingleSource<? extends T> singleSource3) {
        C15684a.a(singleSource, "source1 is null");
        C15684a.a(singleSource2, "source2 is null");
        C15684a.a(singleSource3, "source3 is null");
        return C3960g.m15442a(C3957b.m15324a(singleSource, singleSource2, singleSource3));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3960g<T> m15452a(Callable<? extends SingleSource<? extends T>> callable) {
        C15684a.a(callable, "singleSupplier is null");
        return C2667a.m10283a(new C18412a(callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public static <T> C3960g<T> m15453b(Callable<? extends Throwable> callable) {
        C15684a.a(callable, "errorSupplier is null");
        return C2667a.m10283a(new C18417f(callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3960g<T> m15451a(Throwable th) {
        C15684a.a(th, "error is null");
        return C3960g.m15453b(Functions.a(th));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: c */
    public static <T> C3960g<T> m15454c(Callable<? extends T> callable) {
        C15684a.a(callable, "callable is null");
        return C2667a.m10283a(new C18418g(callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3960g<T> m15450a(T t) {
        C15684a.a(t, "value is null");
        return C2667a.m10283a(new C18420i(t));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    /* renamed from: a */
    public static C3960g<Long> m15444a(long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10283a(new SingleTimer(j, timeUnit, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3960g<T> m15445a(SingleSource<T> singleSource) {
        C15684a.a(singleSource, "source is null");
        if (singleSource instanceof C3960g) {
            return C2667a.m10283a((C3960g) singleSource);
        }
        return C2667a.m10283a(new C18419h(singleSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T1, T2, R> C3960g<R> m15447a(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C15684a.a(singleSource, "source1 is null");
        C15684a.a(singleSource2, "source2 is null");
        return C3960g.m15449a(Functions.a(biFunction), singleSource, singleSource2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, R> C3960g<R> m15446a(SingleSource<? extends T1> singleSource, SingleSource<? extends T2> singleSource2, SingleSource<? extends T3> singleSource3, SingleSource<? extends T4> singleSource4, SingleSource<? extends T5> singleSource5, SingleSource<? extends T6> singleSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        C15684a.a(singleSource, "source1 is null");
        C15684a.a(singleSource2, "source2 is null");
        C15684a.a(singleSource3, "source3 is null");
        C15684a.a(singleSource4, "source4 is null");
        C15684a.a(singleSource5, "source5 is null");
        C15684a.a(singleSource6, "source6 is null");
        return C3960g.m15449a(Functions.a(function6), singleSource, singleSource2, singleSource3, singleSource4, singleSource5, singleSource6);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T, R> C3960g<R> m15449a(Function<? super Object[], ? extends R> function, SingleSource<? extends T>... singleSourceArr) {
        C15684a.a(function, "zipper is null");
        C15684a.a(singleSourceArr, "sources is null");
        if (singleSourceArr.length == 0) {
            return C3960g.m15451a(new NoSuchElementException());
        }
        return C2667a.m10283a(new SingleZipArray(singleSourceArr, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <R> C3960g<R> m15458a(SingleTransformer<? super T, ? extends R> singleTransformer) {
        return C3960g.m15445a(((SingleTransformer) C15684a.a(singleTransformer, "transformer is null")).apply(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3960g<T> m15460a(Action action) {
        C15684a.a(action, "onAfterTerminate is null");
        return C2667a.m10283a(new C18413b(this, action));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3960g<T> m15468b(Action action) {
        C15684a.a(action, "onFinally is null");
        return C2667a.m10283a(new SingleDoFinally(this, action));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3960g<T> m15461a(Consumer<? super Disposable> consumer) {
        C15684a.a(consumer, "onSubscribe is null");
        return C2667a.m10283a(new C18415d(this, consumer));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3960g<T> m15469b(Consumer<? super T> consumer) {
        C15684a.a(consumer, "onSuccess is null");
        return C2667a.m10283a(new C18416e(this, consumer));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3960g<T> m15473c(Consumer<? super Throwable> consumer) {
        C15684a.a(consumer, "onError is null");
        return C2667a.m10283a(new C18414c(this, consumer));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3960g<T> m15472c(Action action) {
        C15684a.a(action, "onDispose is null");
        return C2667a.m10283a(new SingleDoOnDispose(this, action));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3958c<T> m15455a(Predicate<? super T> predicate) {
        C15684a.a(predicate, "predicate is null");
        return C2667a.m10278a(new C18387d(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <R> C3960g<R> m15462a(Function<? super T, ? extends SingleSource<? extends R>> function) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10283a(new SingleFlatMap(this, function));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: b */
    public final <R> C3957b<R> m15466b(Function<? super T, ? extends Publisher<? extends R>> function) {
        return m15475d().m15366b((Function) function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: c */
    public final <R> C3959e<R> m15471c(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return m15477e().flatMap(function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: d */
    public final C3956a m15474d(Function<? super T, ? extends CompletableSource> function) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10274a(new SingleFlatMapCompletable(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final T m15463a() {
        Object c17390f = new C17390f();
        subscribe(c17390f);
        return c17390f.b();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: e */
    public final <R> C3960g<R> m15478e(Function<? super T, ? extends R> function) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10283a(new C18421j(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    /* renamed from: a */
    public final C3960g<T> m15459a(C15679f c15679f) {
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10283a(new SingleObserveOn(this, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: f */
    public final C3960g<T> m15479f(Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
        C15684a.a(function, "resumeFunctionInCaseOfError is null");
        return C2667a.m10283a(new SingleResumeNext(this, function));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3957b<T> m15465b() {
        return m15475d().m15400l();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: g */
    public final C3960g<T> m15480g(Function<? super C3957b<Throwable>, ? extends Publisher<?>> function) {
        return C3960g.m15448a(m15475d().m15395h(function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: d */
    public final Disposable m15476d(Consumer<? super T> consumer) {
        return m15456a((Consumer) consumer, Functions.f48544f);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final Disposable m15456a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        C15684a.a(consumer, "onSuccess is null");
        C15684a.a(consumer2, "onError is null");
        Object consumerSingleObserver = new ConsumerSingleObserver(consumer, consumer2);
        subscribe(consumerSingleObserver);
        return consumerSingleObserver;
    }

    @SchedulerSupport("none")
    public final void subscribe(SingleObserver<? super T> singleObserver) {
        C15684a.a(singleObserver, "subscriber is null");
        SingleObserver a = C2667a.m10273a(this, (SingleObserver) singleObserver);
        C15684a.a(a, "subscriber returned by the RxJavaPlugins hook is null");
        try {
            m15464a(a);
        } catch (SingleObserver<? super T> singleObserver2) {
            throw singleObserver2;
        } catch (SingleObserver<? super T> singleObserver22) {
            C15678a.b(singleObserver22);
            new NullPointerException("subscribeActual failed").initCause(singleObserver22);
        }
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    /* renamed from: b */
    public final C3960g<T> m15467b(C15679f c15679f) {
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10283a(new SingleSubscribeOn(this, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3956a m15470c() {
        return C2667a.m10274a(new C18353g(this));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: d */
    public final C3957b<T> m15475d() {
        if (this instanceof FuseToFlowable) {
            return ((FuseToFlowable) this).fuseToFlowable();
        }
        return C2667a.m10276a(new SingleToFlowable(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: e */
    public final C3959e<T> m15477e() {
        if (this instanceof FuseToObservable) {
            return ((FuseToObservable) this).fuseToObservable();
        }
        return C2667a.m10279a(new C18422k(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <U, R> C3960g<R> m15457a(SingleSource<U> singleSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return C3960g.m15447a((SingleSource) this, (SingleSource) singleSource, (BiFunction) biFunction);
    }

    /* renamed from: a */
    private static <T> C3960g<T> m15448a(C3957b<T> c3957b) {
        return C2667a.m10283a(new C18380r(c3957b, null));
    }
}
