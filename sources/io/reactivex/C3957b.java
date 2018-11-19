package io.reactivex;

import com.google.android.exoplayer2.Format;
import com.tinder.domain.config.model.ProfileEditingConfig;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.Beta;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.operators.flowable.C15696q;
import io.reactivex.internal.operators.flowable.C18366c;
import io.reactivex.internal.operators.flowable.C18370h;
import io.reactivex.internal.operators.flowable.C18372i;
import io.reactivex.internal.operators.flowable.C18373j;
import io.reactivex.internal.operators.flowable.C18375m;
import io.reactivex.internal.operators.flowable.C18377o;
import io.reactivex.internal.operators.flowable.C18380r;
import io.reactivex.internal.operators.flowable.C18384u;
import io.reactivex.internal.operators.flowable.C19004d;
import io.reactivex.internal.operators.flowable.C19005e;
import io.reactivex.internal.operators.flowable.C19006f;
import io.reactivex.internal.operators.flowable.C19007g;
import io.reactivex.internal.operators.flowable.C19008k;
import io.reactivex.internal.operators.flowable.C19009n;
import io.reactivex.internal.operators.flowable.C19010p;
import io.reactivex.internal.operators.flowable.C19011s;
import io.reactivex.internal.operators.flowable.C19012t;
import io.reactivex.internal.operators.flowable.FlowableAmb;
import io.reactivex.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.internal.operators.flowable.FlowableConcatArray;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableDebounceTimed;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper.RequestMax;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.operators.flowable.FlowableRange;
import io.reactivex.internal.operators.flowable.FlowableRepeat;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.internal.operators.flowable.FlowableScanSeed;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableSwitchMap;
import io.reactivex.internal.operators.flowable.FlowableTake;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil;
import io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFrom;
import io.reactivex.internal.operators.flowable.FlowableZip;
import io.reactivex.internal.operators.observable.am;
import io.reactivex.internal.subscribers.C19038d;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.p079d.C2667a;
import io.reactivex.p490b.C18339a;
import io.reactivex.schedulers.C15756a;
import io.reactivex.schedulers.C15757b;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.b */
public abstract class C3957b<T> implements Publisher<T> {
    /* renamed from: b */
    static final int f12606b = Math.max(1, Integer.getInteger("rx2.buffer-size", ProfileEditingConfig.DEFAULT_MAX_LENGTH).intValue());

    /* renamed from: a */
    protected abstract void m15360a(Subscriber<? super T> subscriber);

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3957b<T> m15325a(Publisher<? extends T>... publisherArr) {
        C15684a.a(publisherArr, "sources is null");
        int length = publisherArr.length;
        if (length == 0) {
            return C3957b.m15327b();
        }
        if (length == 1) {
            return C3957b.m15320a(publisherArr[0]);
        }
        return C2667a.m10276a(new FlowableAmb(publisherArr, null));
    }

    /* renamed from: a */
    public static int m15309a() {
        return f12606b;
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T, R> C3957b<R> m15315a(Function<? super Object[], ? extends R> function, Publisher<? extends T>... publisherArr) {
        return C3957b.m15326a((Publisher[]) publisherArr, (Function) function, C3957b.m15309a());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T, R> C3957b<R> m15326a(Publisher<? extends T>[] publisherArr, Function<? super Object[], ? extends R> function, int i) {
        C15684a.a(publisherArr, "sources is null");
        if (publisherArr.length == 0) {
            return C3957b.m15327b();
        }
        C15684a.a(function, "combiner is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10276a(new FlowableCombineLatest(publisherArr, function, i, false));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T, R> C3957b<R> m15316a(Iterable<? extends Publisher<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return C3957b.m15317a((Iterable) iterable, (Function) function, C3957b.m15309a());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T, R> C3957b<R> m15317a(Iterable<? extends Publisher<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i) {
        C15684a.a(iterable, "sources is null");
        C15684a.a(function, "combiner is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10276a(new FlowableCombineLatest(iterable, function, i, false));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T1, T2, R> C3957b<R> m15322a(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C15684a.a(publisher, "source1 is null");
        C15684a.a(publisher2, "source2 is null");
        return C3957b.m15315a(Functions.a(biFunction), publisher, publisher2);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T1, T2, T3, R> C3957b<R> m15323a(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, Publisher<? extends T3> publisher3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        C15684a.a(publisher, "source1 is null");
        C15684a.a(publisher2, "source2 is null");
        C15684a.a(publisher3, "source3 is null");
        return C3957b.m15315a(Functions.a(function3), publisher, publisher2, publisher3);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3957b<T> m15321a(Publisher<? extends T> publisher, Publisher<? extends T> publisher2) {
        C15684a.a(publisher, "source1 is null");
        C15684a.a(publisher2, "source2 is null");
        return C3957b.m15330b(publisher, publisher2);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: b */
    public static <T> C3957b<T> m15330b(Publisher<? extends T>... publisherArr) {
        if (publisherArr.length == 0) {
            return C3957b.m15327b();
        }
        if (publisherArr.length == 1) {
            return C3957b.m15320a(publisherArr[0]);
        }
        return C2667a.m10276a(new FlowableConcatArray(publisherArr, false));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3957b<T> m15312a(FlowableOnSubscribe<T> flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        C15684a.a(flowableOnSubscribe, "source is null");
        C15684a.a(backpressureStrategy, "mode is null");
        return C2667a.m10276a(new FlowableCreate(flowableOnSubscribe, backpressureStrategy));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3957b<T> m15319a(Callable<? extends Publisher<? extends T>> callable) {
        C15684a.a(callable, "supplier is null");
        return C2667a.m10276a(new C18366c(callable));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: b */
    public static <T> C3957b<T> m15327b() {
        return C2667a.m10276a(C18373j.f57116a);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3957b<T> m15324a(T... tArr) {
        C15684a.a(tArr, "items is null");
        if (tArr.length == 0) {
            return C3957b.m15327b();
        }
        if (tArr.length == 1) {
            return C3957b.m15318a(tArr[0]);
        }
        return C2667a.m10276a(new FlowableFromArray(tArr));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3957b<T> m15320a(Publisher<? extends T> publisher) {
        if (publisher instanceof C3957b) {
            return C2667a.m10276a((C3957b) publisher);
        }
        C15684a.a(publisher, "publisher is null");
        return C2667a.m10276a(new C18375m(publisher));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T> C3957b<T> m15318a(T t) {
        C15684a.a(t, "item is null");
        return C2667a.m10276a(new C18377o(t));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: b */
    public static <T> C3957b<T> m15328b(Publisher<? extends T> publisher, Publisher<? extends T> publisher2) {
        C15684a.a(publisher, "source1 is null");
        C15684a.a(publisher2, "source2 is null");
        return C3957b.m15324a(publisher, publisher2).m15346a(Functions.a(), false, 2);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static C3957b<Integer> m15310a(int i, int i2) {
        if (i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("count >= 0 required but it was ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 == 0) {
            return C3957b.m15327b();
        } else {
            if (i2 == 1) {
                return C3957b.m15318a(Integer.valueOf(i));
            }
            if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
                return C2667a.m10276a(new FlowableRange(i, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    /* renamed from: a */
    public static C3957b<Long> m15311a(long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10276a(new FlowableTimer(Math.max(0, j), timeUnit, c15679f));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: b */
    public static <T1, T2, R> C3957b<R> m15329b(Publisher<? extends T1> publisher, Publisher<? extends T2> publisher2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C15684a.a(publisher, "source1 is null");
        C15684a.a(publisher2, "source2 is null");
        return C3957b.m15314a(Functions.a(biFunction), false, C3957b.m15309a(), publisher, publisher2);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public static <T, R> C3957b<R> m15314a(Function<? super Object[], ? extends R> function, boolean z, int i, Publisher<? extends T>... publisherArr) {
        if (publisherArr.length == 0) {
            return C3957b.m15327b();
        }
        C15684a.a(function, "zipper is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10276a(new FlowableZip(publisherArr, null, function, i, z));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: c */
    public final T m15380c() {
        FlowableSubscriber c19038d = new C19038d();
        m15359a(c19038d);
        T a = c19038d.a();
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <U> C3957b<U> m15349a(Class<U> cls) {
        C15684a.a(cls, "clazz is null");
        return m15390f(Functions.a(cls));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <R> C3957b<R> m15335a(FlowableTransformer<? super T, ? extends R> flowableTransformer) {
        return C3957b.m15320a(((FlowableTransformer) C15684a.a(flowableTransformer, "composer is null")).apply(this));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3957b<T> m15369b(Publisher<? extends T> publisher) {
        C15684a.a(publisher, "other is null");
        return C3957b.m15321a((Publisher) this, (Publisher) publisher);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    /* renamed from: b */
    public final C3957b<T> m15362b(long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10276a(new FlowableDebounceTimed(this, j, timeUnit, c15679f));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("io.reactivex:computation")
    /* renamed from: a */
    public final C3957b<T> m15333a(long j, TimeUnit timeUnit) {
        return m15334a(j, timeUnit, C15756a.a(), false);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    /* renamed from: c */
    public final C3957b<T> m15374c(long j, TimeUnit timeUnit, C15679f c15679f) {
        return m15334a(j, timeUnit, c15679f, false);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    /* renamed from: a */
    public final C3957b<T> m15334a(long j, TimeUnit timeUnit, C15679f c15679f, boolean z) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10276a(new C19004d(this, Math.max(0, j), timeUnit, c15679f, z));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: d */
    public final C3957b<T> m15381d() {
        return m15343a(Functions.a());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <K> C3957b<T> m15343a(Function<? super T, K> function) {
        C15684a.a(function, "keySelector is null");
        return C2667a.m10276a(new C19005e(this, function, C15684a.a()));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3957b<T> m15340a(BiPredicate<? super T, ? super T> biPredicate) {
        C15684a.a(biPredicate, "comparer is null");
        return C2667a.m10276a(new C19005e(this, Functions.a(), biPredicate));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3957b<T> m15339a(Action action) {
        C15684a.a(action, "onFinally is null");
        return C2667a.m10276a(new FlowableDoFinally(this, action));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3957b<T> m15364b(Action action) {
        return m15342a(Functions.b(), Functions.f48545g, action);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: a */
    private C3957b<T> m15313a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        C15684a.a(consumer, "onNext is null");
        C15684a.a(consumer2, "onError is null");
        C15684a.a(action, "onComplete is null");
        C15684a.a(action2, "onAfterTerminate is null");
        return C2667a.m10276a(new C19006f(this, consumer, consumer2, action, action2));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3957b<T> m15342a(Consumer<? super Subscription> consumer, LongConsumer longConsumer, Action action) {
        C15684a.a(consumer, "onSubscribe is null");
        C15684a.a(longConsumer, "onRequest is null");
        C15684a.a(action, "onCancel is null");
        return C2667a.m10276a(new C19007g(this, consumer, longConsumer, action));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3957b<T> m15341a(Consumer<? super T> consumer) {
        return m15313a((Consumer) consumer, Functions.b(), Functions.f48541c, Functions.f48541c);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3957b<T> m15365b(Consumer<? super Subscription> consumer) {
        return m15342a((Consumer) consumer, Functions.f48545g, Functions.f48541c);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3958c<T> m15354a(long j) {
        if (j >= 0) {
            return C2667a.m10278a(new C18370h(this, j));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("index >= 0 required but it was ");
        stringBuilder.append(j);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3960g<T> m15358a(long j, T t) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("index >= 0 required but it was ");
            stringBuilder.append(j);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        C15684a.a(t, "defaultItem is null");
        return C2667a.m10283a(new C18372i(this, j, t));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3960g<T> m15370b(long j) {
        if (j >= 0) {
            return C2667a.m10283a(new C18372i(this, j, null));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("index >= 0 required but it was ");
        stringBuilder.append(j);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3957b<T> m15348a(Predicate<? super T> predicate) {
        C15684a.a(predicate, "predicate is null");
        return C2667a.m10276a(new C19008k(this, predicate));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    /* renamed from: e */
    public final C3958c<T> m15389e() {
        return m15354a(0);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3960g<T> m15371b(T t) {
        return m15358a(0, (Object) t);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    /* renamed from: f */
    public final C3960g<T> m15391f() {
        return m15370b(0);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: b */
    public final <R> C3957b<R> m15366b(Function<? super T, ? extends Publisher<? extends R>> function) {
        return m15347a((Function) function, false, C3957b.m15309a(), C3957b.m15309a());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <R> C3957b<R> m15346a(Function<? super T, ? extends Publisher<? extends R>> function, boolean z, int i) {
        return m15347a((Function) function, z, i, C3957b.m15309a());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <R> C3957b<R> m15347a(Function<? super T, ? extends Publisher<? extends R>> function, boolean z, int i, int i2) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "maxConcurrency");
        C15684a.a(i2, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return C2667a.m10276a(new FlowableFlatMap(this, function, z, i, i2));
        }
        z = ((ScalarCallable) this).call();
        if (z) {
            return C15696q.a(z, function);
        }
        return C3957b.m15327b();
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3956a m15372c(Function<? super T, ? extends CompletableSource> function) {
        return m15361b((Function) function, false, (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3956a m15361b(Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "maxConcurrency");
        return C2667a.m10274a(new FlowableFlatMapCompletableCompletable(this, function, z, i));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: d */
    public final <R> C3957b<R> m15384d(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return m15376c((Function) function, false, (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: c */
    public final <R> C3957b<R> m15376c(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z, int i) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "maxConcurrency");
        return C2667a.m10276a(new FlowableFlatMapMaybe(this, function, z, i));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: e */
    public final <R> C3957b<R> m15388e(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return m15385d((Function) function, false, (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: d */
    public final <R> C3957b<R> m15385d(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "maxConcurrency");
        return C2667a.m10276a(new FlowableFlatMapSingle(this, function, z, i));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: g */
    public final C3957b<T> m15392g() {
        return C2667a.m10276a(new C19009n(this));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: f */
    public final <R> C3957b<R> m15390f(Function<? super T, ? extends R> function) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10276a(new C19010p(this, function));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    /* renamed from: a */
    public final C3957b<T> m15336a(C15679f c15679f) {
        return m15338a(c15679f, false, C3957b.m15309a());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("custom")
    /* renamed from: a */
    public final C3957b<T> m15338a(C15679f c15679f, boolean z, int i) {
        C15684a.a(c15679f, "scheduler is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10276a(new FlowableObserveOn(this, c15679f, z, i));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: b */
    public final <U> C3957b<U> m15368b(Class<U> cls) {
        C15684a.a(cls, "clazz is null");
        return m15348a(Functions.b(cls)).m15349a((Class) cls);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: h */
    public final C3957b<T> m15394h() {
        return m15332a(C3957b.m15309a(), false, true);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3957b<T> m15332a(int i, boolean z, boolean z2) {
        C15684a.a(i, "bufferSize");
        return C2667a.m10276a(new FlowableOnBackpressureBuffer(this, i, z2, z, Functions.f48541c));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: i */
    public final C3957b<T> m15396i() {
        return C2667a.m10276a(new FlowableOnBackpressureDrop(this));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: j */
    public final C3957b<T> m15398j() {
        return C2667a.m10276a(new FlowableOnBackpressureLatest(this));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: g */
    public final C3957b<T> m15393g(Function<? super Throwable, ? extends T> function) {
        C15684a.a(function, "valueSupplier is null");
        return C2667a.m10276a(new FlowableOnErrorReturn(this, function));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: k */
    public final C18339a<T> m15399k() {
        return m15331a(C3957b.m15309a());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C18339a<T> m15331a(int i) {
        C15684a.a(i, "bufferSize");
        return FlowablePublish.a(this, i);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: l */
    public final C3957b<T> m15400l() {
        return m15373c((long) Format.OFFSET_SAMPLE_RELATIVE);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3957b<T> m15373c(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("times >= 0 required but it was ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j == 0) {
            return C3957b.m15327b();
        } else {
            return C2667a.m10276a(new FlowableRepeat(this, j));
        }
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: h */
    public final C3957b<T> m15395h(Function<? super C3957b<Throwable>, ? extends Publisher<?>> function) {
        C15684a.a(function, "handler is null");
        return C2667a.m10276a(new FlowableRetryWhen(this, function));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <R> C3957b<R> m15350a(R r, BiFunction<R, ? super T, R> biFunction) {
        C15684a.a(r, "seed is null");
        return m15351a(Functions.a(r), (BiFunction) biFunction);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <R> C3957b<R> m15351a(Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        C15684a.a(callable, "seedSupplier is null");
        C15684a.a(biFunction, "accumulator is null");
        return C2667a.m10276a(new FlowableScanSeed(this, callable, biFunction));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: m */
    public final C3957b<T> m15401m() {
        return m15399k().q();
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: n */
    public final C3960g<T> m15402n() {
        return C2667a.m10283a(new C18380r(this, null));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: d */
    public final C3957b<T> m15382d(long j) {
        if (j <= 0) {
            return C2667a.m10276a(this);
        }
        return C2667a.m10276a(new C19011s(this, j));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: b */
    public final C3957b<T> m15367b(Predicate<? super T> predicate) {
        C15684a.a(predicate, "predicate is null");
        return C2667a.m10276a(new C19012t(this, predicate));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3957b<T> m15377c(T t) {
        C15684a.a(t, "item is null");
        return C3957b.m15330b(C3957b.m15318a((Object) t), this);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: c */
    public final Disposable m15379c(Consumer<? super T> consumer) {
        return m15357a((Consumer) consumer, Functions.f48544f, Functions.f48541c, RequestMax.INSTANCE);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final Disposable m15355a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return m15357a((Consumer) consumer, (Consumer) consumer2, Functions.f48541c, RequestMax.INSTANCE);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final Disposable m15356a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        return m15357a((Consumer) consumer, (Consumer) consumer2, action, RequestMax.INSTANCE);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final Disposable m15357a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Subscription> consumer3) {
        C15684a.a(consumer, "onNext is null");
        C15684a.a(consumer2, "onError is null");
        C15684a.a(action, "onComplete is null");
        C15684a.a(consumer3, "onSubscribe is null");
        FlowableSubscriber lambdaSubscriber = new LambdaSubscriber(consumer, consumer2, action, consumer3);
        m15359a(lambdaSubscriber);
        return lambdaSubscriber;
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final void subscribe(Subscriber<? super T> subscriber) {
        if (subscriber instanceof FlowableSubscriber) {
            m15359a((FlowableSubscriber) subscriber);
            return;
        }
        C15684a.a(subscriber, "s is null");
        m15359a(new StrictSubscriber(subscriber));
    }

    @BackpressureSupport(BackpressureKind.SPECIAL)
    @Beta
    @SchedulerSupport("none")
    /* renamed from: a */
    public final void m15359a(FlowableSubscriber<? super T> flowableSubscriber) {
        C15684a.a(flowableSubscriber, "s is null");
        try {
            Subscriber a = C2667a.m10287a(this, (Subscriber) flowableSubscriber);
            C15684a.a(a, "Plugin returned null Subscriber");
            m15360a(a);
        } catch (FlowableSubscriber<? super T> flowableSubscriber2) {
            throw flowableSubscriber2;
        } catch (Throwable th) {
            C15678a.b(th);
            C2667a.m10289a(th);
            new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th);
        }
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("custom")
    /* renamed from: b */
    public final C3957b<T> m15363b(@NonNull C15679f c15679f) {
        C15684a.a(c15679f, "scheduler is null");
        return m15337a(c15679f, !(this instanceof FlowableCreate));
    }

    @CheckReturnValue
    @Experimental
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("custom")
    /* renamed from: a */
    public final C3957b<T> m15337a(@NonNull C15679f c15679f, boolean z) {
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10276a(new FlowableSubscribeOn(this, c15679f, z));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: i */
    public final <R> C3957b<R> m15397i(Function<? super T, ? extends Publisher<? extends R>> function) {
        return m15344a((Function) function, C3957b.m15309a());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.FULL)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <R> C3957b<R> m15344a(Function<? super T, ? extends Publisher<? extends R>> function, int i) {
        return m15345a((Function) function, i, false);
    }

    /* renamed from: a */
    <R> C3957b<R> m15345a(Function<? super T, ? extends Publisher<? extends R>> function, int i, boolean z) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return C2667a.m10276a(new FlowableSwitchMap(this, function, i, z));
        }
        i = ((ScalarCallable) this).call();
        if (i == 0) {
            return C3957b.m15327b();
        }
        return C15696q.a(i, function);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    /* renamed from: e */
    public final C3957b<T> m15386e(long j) {
        if (j >= 0) {
            return C2667a.m10276a(new FlowableTake(this, j));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("count >= 0 required but it was ");
        stringBuilder.append(j);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: c */
    public final <U> C3957b<T> m15378c(Publisher<U> publisher) {
        C15684a.a(publisher, "other is null");
        return C2667a.m10276a(new FlowableTakeUntil(this, publisher));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    /* renamed from: d */
    public final C3957b<T> m15383d(long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10276a(new FlowableThrottleFirstTimed(this, j, timeUnit, c15679f));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.ERROR)
    @SchedulerSupport("custom")
    /* renamed from: e */
    public final C3957b<T> m15387e(long j, TimeUnit timeUnit, C15679f c15679f) {
        return m15362b(j, timeUnit, c15679f);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: c */
    public final C3957b<C15757b<T>> m15375c(C15679f c15679f) {
        return m15352a(TimeUnit.MILLISECONDS, c15679f);
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final C3957b<C15757b<T>> m15352a(TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return m15390f(Functions.a(timeUnit, c15679f));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    /* renamed from: o */
    public final C3960g<List<T>> m15403o() {
        return C2667a.m10283a(new C18384u(this));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.NONE)
    @SchedulerSupport("none")
    /* renamed from: p */
    public final C3959e<T> m15404p() {
        return C2667a.m10279a(new am(this));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @SchedulerSupport("none")
    /* renamed from: a */
    public final <U, R> C3957b<R> m15353a(Publisher<? extends U> publisher, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        C15684a.a(publisher, "other is null");
        C15684a.a(biFunction, "combiner is null");
        return C2667a.m10276a(new FlowableWithLatestFrom(this, biFunction, publisher));
    }
}
