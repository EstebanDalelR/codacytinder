package io.reactivex;

import com.google.android.exoplayer2.Format;
import com.tinder.api.ManagerWebServices;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function7;
import io.reactivex.functions.Function8;
import io.reactivex.functions.Function9;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.observers.C17393i;
import io.reactivex.internal.observers.C18343d;
import io.reactivex.internal.observers.C18344e;
import io.reactivex.internal.observers.ForEachWhileObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.flowable.C18374l;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.internal.operators.observable.BlockingObservableIterable;
import io.reactivex.internal.operators.observable.C15711b;
import io.reactivex.internal.operators.observable.C15717c;
import io.reactivex.internal.operators.observable.C15719d;
import io.reactivex.internal.operators.observable.C15720i;
import io.reactivex.internal.operators.observable.C18403f;
import io.reactivex.internal.operators.observable.C18404h;
import io.reactivex.internal.operators.observable.C18407n;
import io.reactivex.internal.operators.observable.C18408p;
import io.reactivex.internal.operators.observable.C18410r;
import io.reactivex.internal.operators.observable.C18411t;
import io.reactivex.internal.operators.observable.C19021j;
import io.reactivex.internal.operators.observable.C19022k;
import io.reactivex.internal.operators.observable.C19023l;
import io.reactivex.internal.operators.observable.C19026q;
import io.reactivex.internal.operators.observable.C19027s;
import io.reactivex.internal.operators.observable.C19028u;
import io.reactivex.internal.operators.observable.C19029v;
import io.reactivex.internal.operators.observable.C19030w;
import io.reactivex.internal.operators.observable.C19031x;
import io.reactivex.internal.operators.observable.C19032y;
import io.reactivex.internal.operators.observable.C19033z;
import io.reactivex.internal.operators.observable.ObservableAmb;
import io.reactivex.internal.operators.observable.ObservableBuffer;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.internal.operators.observable.ObservableCache;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.operators.observable.ObservableConcatMapCompletable;
import io.reactivex.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import io.reactivex.internal.operators.observable.ObservableDoFinally;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.internal.operators.observable.ObservableGroupBy;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.operators.observable.ObservableInternalHelper;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.internal.operators.observable.ObservableJoin;
import io.reactivex.internal.operators.observable.ObservableMergeWithCompletable;
import io.reactivex.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.internal.operators.observable.ObservablePublishSelector;
import io.reactivex.internal.operators.observable.ObservableRange;
import io.reactivex.internal.operators.observable.ObservableRangeLong;
import io.reactivex.internal.operators.observable.ObservableRepeat;
import io.reactivex.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.internal.operators.observable.ObservableReplay;
import io.reactivex.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.internal.operators.observable.ObservableSkipLast;
import io.reactivex.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.ObservableTakeLast;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed;
import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.internal.operators.observable.ObservableUsing;
import io.reactivex.internal.operators.observable.ObservableWindow;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.internal.operators.observable.ObservableZip;
import io.reactivex.internal.operators.observable.aa;
import io.reactivex.internal.operators.observable.ac;
import io.reactivex.internal.operators.observable.ad;
import io.reactivex.internal.operators.observable.ae;
import io.reactivex.internal.operators.observable.af;
import io.reactivex.internal.operators.observable.ag;
import io.reactivex.internal.operators.observable.ah;
import io.reactivex.internal.operators.observable.ai;
import io.reactivex.internal.operators.observable.aj;
import io.reactivex.internal.operators.observable.ak;
import io.reactivex.internal.operators.observable.al;
import io.reactivex.internal.operators.observable.am;
import io.reactivex.internal.operators.observable.an;
import io.reactivex.internal.operators.observable.ao;
import io.reactivex.internal.operators.observable.ap;
import io.reactivex.internal.operators.observable.aq;
import io.reactivex.internal.operators.observable.ar;
import io.reactivex.internal.operators.observable.as;
import io.reactivex.internal.operators.observable.at;
import io.reactivex.internal.operators.observable.au;
import io.reactivex.internal.operators.observable.av;
import io.reactivex.internal.operators.observable.aw;
import io.reactivex.internal.operators.observable.ax;
import io.reactivex.internal.operators.observable.ay;
import io.reactivex.internal.operators.observable.az;
import io.reactivex.internal.operators.observable.ba;
import io.reactivex.internal.operators.observable.bb;
import io.reactivex.internal.operators.observable.bc;
import io.reactivex.internal.operators.observable.bd;
import io.reactivex.internal.operators.observable.be;
import io.reactivex.internal.operators.observable.bf;
import io.reactivex.internal.operators.observable.bg;
import io.reactivex.internal.operators.observable.bh;
import io.reactivex.internal.operators.observable.bi;
import io.reactivex.internal.operators.observable.bj;
import io.reactivex.internal.operators.observable.bk;
import io.reactivex.internal.operators.observable.bl;
import io.reactivex.internal.operators.observable.bm;
import io.reactivex.internal.operators.observable.bn;
import io.reactivex.internal.operators.observable.bo;
import io.reactivex.internal.operators.observable.bp;
import io.reactivex.internal.operators.observable.bq;
import io.reactivex.internal.operators.observable.br;
import io.reactivex.internal.operators.observable.bs;
import io.reactivex.internal.operators.observable.bt;
import io.reactivex.internal.operators.observable.bu;
import io.reactivex.internal.operators.observable.bv;
import io.reactivex.internal.operators.observable.bw;
import io.reactivex.internal.operators.observable.bx;
import io.reactivex.internal.operators.observable.by;
import io.reactivex.internal.operators.observable.bz;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.observers.C17529c;
import io.reactivex.observers.TestObserver;
import io.reactivex.p079d.C2667a;
import io.reactivex.p491c.C18340a;
import io.reactivex.p491c.C18341b;
import io.reactivex.schedulers.C15756a;
import io.reactivex.schedulers.C15757b;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;

/* renamed from: io.reactivex.e */
public abstract class C3959e<T> implements ObservableSource<T> {
    protected abstract void subscribeActual(Observer<? super T> observer);

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> amb(Iterable<? extends ObservableSource<? extends T>> iterable) {
        C15684a.a(iterable, "sources is null");
        return C2667a.m10279a(new ObservableAmb(null, iterable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> ambArray(ObservableSource<? extends T>... observableSourceArr) {
        C15684a.a(observableSourceArr, "sources is null");
        int length = observableSourceArr.length;
        if (length == 0) {
            return C3959e.empty();
        }
        if (length == 1) {
            return C3959e.wrap(observableSourceArr[0]);
        }
        return C2667a.m10279a(new ObservableAmb(observableSourceArr, null));
    }

    public static int bufferSize() {
        return C3957b.m15309a();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> combineLatest(Function<? super Object[], ? extends R> function, int i, ObservableSource<? extends T>... observableSourceArr) {
        return C3959e.combineLatest((ObservableSource[]) observableSourceArr, (Function) function, i);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> combineLatest(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return C3959e.combineLatest((Iterable) iterable, (Function) function, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> combineLatest(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i) {
        C15684a.a(iterable, "sources is null");
        C15684a.a(function, "combiner is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new ObservableCombineLatest(null, iterable, function, i << 1, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> combineLatest(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function) {
        return C3959e.combineLatest((ObservableSource[]) observableSourceArr, (Function) function, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> combineLatest(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function, int i) {
        C15684a.a(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return C3959e.empty();
        }
        C15684a.a(function, "combiner is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new ObservableCombineLatest(observableSourceArr, null, function, i << 1, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, R> C3959e<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        return C3959e.combineLatest(Functions.a(biFunction), C3959e.bufferSize(), observableSource, observableSource2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, R> C3959e<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        return C3959e.combineLatest(Functions.a(function3), C3959e.bufferSize(), observableSource, observableSource2, observableSource3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, R> C3959e<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        return C3959e.combineLatest(Functions.a(function4), C3959e.bufferSize(), observableSource, observableSource2, observableSource3, observableSource4);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, R> C3959e<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        C15684a.a(observableSource5, "source5 is null");
        return C3959e.combineLatest(Functions.a(function5), C3959e.bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, R> C3959e<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        C15684a.a(observableSource5, "source5 is null");
        C15684a.a(observableSource6, "source6 is null");
        return C3959e.combineLatest(Functions.a(function6), C3959e.bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> C3959e<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        C15684a.a(observableSource5, "source5 is null");
        C15684a.a(observableSource6, "source6 is null");
        C15684a.a(observableSource7, "source7 is null");
        return C3959e.combineLatest(Functions.a(function7), C3959e.bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C3959e<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        C15684a.a(observableSource5, "source5 is null");
        C15684a.a(observableSource6, "source6 is null");
        C15684a.a(observableSource7, "source7 is null");
        C15684a.a(observableSource8, "source8 is null");
        return C3959e.combineLatest(Functions.a(function8), C3959e.bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C3959e<R> combineLatest(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, ObservableSource<? extends T9> observableSource9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        C15684a.a(observableSource5, "source5 is null");
        C15684a.a(observableSource6, "source6 is null");
        C15684a.a(observableSource7, "source7 is null");
        C15684a.a(observableSource8, "source8 is null");
        C15684a.a(observableSource9, "source9 is null");
        return C3959e.combineLatest(Functions.a(function9), C3959e.bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> combineLatestDelayError(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function) {
        return C3959e.combineLatestDelayError((ObservableSource[]) observableSourceArr, (Function) function, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> combineLatestDelayError(Function<? super Object[], ? extends R> function, int i, ObservableSource<? extends T>... observableSourceArr) {
        return C3959e.combineLatestDelayError((ObservableSource[]) observableSourceArr, (Function) function, i);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> combineLatestDelayError(ObservableSource<? extends T>[] observableSourceArr, Function<? super Object[], ? extends R> function, int i) {
        C15684a.a(i, "bufferSize");
        C15684a.a(function, "combiner is null");
        if (observableSourceArr.length == 0) {
            return C3959e.empty();
        }
        return C2667a.m10279a(new ObservableCombineLatest(observableSourceArr, null, function, i << 1, true));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> combineLatestDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return C3959e.combineLatestDelayError((Iterable) iterable, (Function) function, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> combineLatestDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i) {
        C15684a.a(iterable, "sources is null");
        C15684a.a(function, "combiner is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new ObservableCombineLatest(null, iterable, function, i << 1, true));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concat(Iterable<? extends ObservableSource<? extends T>> iterable) {
        C15684a.a(iterable, "sources is null");
        return C3959e.fromIterable(iterable).concatMapDelayError(Functions.a(), C3959e.bufferSize(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concat(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return C3959e.concat((ObservableSource) observableSource, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concat(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        C15684a.a(observableSource, "sources is null");
        C15684a.a(i, "prefetch");
        return C2667a.m10279a(new ObservableConcatMap(observableSource, Functions.a(), i, ErrorMode.IMMEDIATE));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        return C3959e.concatArray(observableSource, observableSource2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        return C3959e.concatArray(observableSource, observableSource2, observableSource3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concat(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        return C3959e.concatArray(observableSource, observableSource2, observableSource3, observableSource4);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concatArray(ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return C3959e.empty();
        }
        if (observableSourceArr.length == 1) {
            return C3959e.wrap(observableSourceArr[0]);
        }
        return C2667a.m10279a(new ObservableConcatMap(C3959e.fromArray(observableSourceArr), Functions.a(), C3959e.bufferSize(), ErrorMode.BOUNDARY));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concatArrayDelayError(ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return C3959e.empty();
        }
        if (observableSourceArr.length == 1) {
            return C3959e.wrap(observableSourceArr[0]);
        }
        return C3959e.concatDelayError(C3959e.fromArray(observableSourceArr));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concatArrayEager(ObservableSource<? extends T>... observableSourceArr) {
        return C3959e.concatArrayEager(C3959e.bufferSize(), C3959e.bufferSize(), observableSourceArr);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concatArrayEager(int i, int i2, ObservableSource<? extends T>... observableSourceArr) {
        return C3959e.fromArray(observableSourceArr).concatMapEagerDelayError(Functions.a(), i, i2, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concatDelayError(Iterable<? extends ObservableSource<? extends T>> iterable) {
        C15684a.a(iterable, "sources is null");
        return C3959e.concatDelayError(C3959e.fromIterable(iterable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concatDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return C3959e.concatDelayError(observableSource, C3959e.bufferSize(), true);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concatDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i, boolean z) {
        C15684a.a(observableSource, "sources is null");
        C15684a.a(i, "prefetch is null");
        return C2667a.m10279a(new ObservableConcatMap(observableSource, Functions.a(), i, z ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concatEager(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return C3959e.concatEager((ObservableSource) observableSource, C3959e.bufferSize(), C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concatEager(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i, int i2) {
        C15684a.a(Integer.valueOf(i), "maxConcurrency is null");
        C15684a.a(Integer.valueOf(i2), "prefetch is null");
        return C3959e.wrap(observableSource).concatMapEager(Functions.a(), i, i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concatEager(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return C3959e.concatEager((Iterable) iterable, C3959e.bufferSize(), C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> concatEager(Iterable<? extends ObservableSource<? extends T>> iterable, int i, int i2) {
        C15684a.a(Integer.valueOf(i), "maxConcurrency is null");
        C15684a.a(Integer.valueOf(i2), "prefetch is null");
        return C3959e.fromIterable(iterable).concatMapEagerDelayError(Functions.a(), i, i2, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> create(ObservableOnSubscribe<T> observableOnSubscribe) {
        C15684a.a(observableOnSubscribe, "source is null");
        return C2667a.m10279a(new ObservableCreate(observableOnSubscribe));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> defer(Callable<? extends ObservableSource<? extends T>> callable) {
        C15684a.a(callable, "supplier is null");
        return C2667a.m10279a(new C18410r(callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> empty() {
        return C2667a.m10279a(ae.f57236a);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> error(Callable<? extends Throwable> callable) {
        C15684a.a(callable, "errorSupplier is null");
        return C2667a.m10279a(new af(callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> error(Throwable th) {
        C15684a.a(th, "e is null");
        return C3959e.error(Functions.a(th));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> fromArray(T... tArr) {
        C15684a.a(tArr, "items is null");
        if (tArr.length == 0) {
            return C3959e.empty();
        }
        if (tArr.length == 1) {
            return C3959e.just(tArr[0]);
        }
        return C2667a.m10279a(new ai(tArr));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> fromCallable(Callable<? extends T> callable) {
        C15684a.a(callable, "supplier is null");
        return C2667a.m10279a(new aj(callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> fromFuture(Future<? extends T> future) {
        C15684a.a(future, "future is null");
        return C2667a.m10279a(new ak(future, 0, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        C15684a.a(future, "future is null");
        C15684a.a(timeUnit, "unit is null");
        return C2667a.m10279a(new ak(future, j, timeUnit));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static <T> C3959e<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(c15679f, "scheduler is null");
        return C3959e.fromFuture(future, j, timeUnit).subscribeOn(c15679f);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static <T> C3959e<T> fromFuture(Future<? extends T> future, C15679f c15679f) {
        C15684a.a(c15679f, "scheduler is null");
        return C3959e.fromFuture(future).subscribeOn(c15679f);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> fromIterable(Iterable<? extends T> iterable) {
        C15684a.a(iterable, "source is null");
        return C2667a.m10279a(new al(iterable));
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @SchedulerSupport("none")
    public static <T> C3959e<T> fromPublisher(Publisher<? extends T> publisher) {
        C15684a.a(publisher, "publisher is null");
        return C2667a.m10279a(new am(publisher));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> generate(Consumer<Emitter<T>> consumer) {
        C15684a.a(consumer, "generator  is null");
        return C3959e.generate(Functions.e(), ObservableInternalHelper.a(consumer), Functions.b());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, S> C3959e<T> generate(Callable<S> callable, BiConsumer<S, Emitter<T>> biConsumer) {
        C15684a.a(biConsumer, "generator  is null");
        return C3959e.generate((Callable) callable, ObservableInternalHelper.a(biConsumer), Functions.b());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, S> C3959e<T> generate(Callable<S> callable, BiConsumer<S, Emitter<T>> biConsumer, Consumer<? super S> consumer) {
        C15684a.a(biConsumer, "generator  is null");
        return C3959e.generate((Callable) callable, ObservableInternalHelper.a(biConsumer), (Consumer) consumer);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, S> C3959e<T> generate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction) {
        return C3959e.generate((Callable) callable, (BiFunction) biFunction, Functions.b());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, S> C3959e<T> generate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        C15684a.a(callable, "initialState is null");
        C15684a.a(biFunction, "generator  is null");
        C15684a.a(consumer, "disposeState is null");
        return C2667a.m10279a(new ao(callable, biFunction, consumer));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static C3959e<Long> interval(long j, long j2, TimeUnit timeUnit) {
        return C3959e.interval(j, j2, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static C3959e<Long> interval(long j, long j2, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10279a(new ObservableInterval(Math.max(0, j), Math.max(0, j2), timeUnit, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static C3959e<Long> interval(long j, TimeUnit timeUnit) {
        return C3959e.interval(j, j, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static C3959e<Long> interval(long j, TimeUnit timeUnit, C15679f c15679f) {
        return C3959e.interval(j, j, timeUnit, c15679f);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static C3959e<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return C3959e.intervalRange(j, j2, j3, j4, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static C3959e<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, C15679f c15679f) {
        long j5 = j2;
        long j6 = j3;
        TimeUnit timeUnit2 = timeUnit;
        C15679f c15679f2 = c15679f;
        if (j5 < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("count >= 0 required but it was ");
            stringBuilder.append(j5);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j5 == 0) {
            return C3959e.empty().delay(j6, timeUnit2, c15679f2);
        } else {
            j5 = j + (j5 - 1);
            if (j <= 0 || j5 >= 0) {
                C15684a.a(timeUnit2, "unit is null");
                C15684a.a(c15679f2, "scheduler is null");
                return C2667a.m10279a(new ObservableIntervalRange(j, j5, Math.max(0, j6), Math.max(0, j4), timeUnit2, c15679f2));
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> just(T t) {
        C15684a.a(t, "The item is null");
        return C2667a.m10279a(new as(t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> just(T t, T t2) {
        C15684a.a(t, "The first item is null");
        C15684a.a(t2, "The second item is null");
        return C3959e.fromArray(t, t2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> just(T t, T t2, T t3) {
        C15684a.a(t, "The first item is null");
        C15684a.a(t2, "The second item is null");
        C15684a.a(t3, "The third item is null");
        return C3959e.fromArray(t, t2, t3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> just(T t, T t2, T t3, T t4) {
        C15684a.a(t, "The first item is null");
        C15684a.a(t2, "The second item is null");
        C15684a.a(t3, "The third item is null");
        C15684a.a(t4, "The fourth item is null");
        return C3959e.fromArray(t, t2, t3, t4);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> just(T t, T t2, T t3, T t4, T t5) {
        C15684a.a(t, "The first item is null");
        C15684a.a(t2, "The second item is null");
        C15684a.a(t3, "The third item is null");
        C15684a.a(t4, "The fourth item is null");
        C15684a.a(t5, "The fifth item is null");
        return C3959e.fromArray(t, t2, t3, t4, t5);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        C15684a.a(t, "The first item is null");
        C15684a.a(t2, "The second item is null");
        C15684a.a(t3, "The third item is null");
        C15684a.a(t4, "The fourth item is null");
        C15684a.a(t5, "The fifth item is null");
        C15684a.a(t6, "The sixth item is null");
        return C3959e.fromArray(t, t2, t3, t4, t5, t6);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        C15684a.a(t, "The first item is null");
        C15684a.a(t2, "The second item is null");
        C15684a.a(t3, "The third item is null");
        C15684a.a(t4, "The fourth item is null");
        C15684a.a(t5, "The fifth item is null");
        C15684a.a(t6, "The sixth item is null");
        C15684a.a(t7, "The seventh item is null");
        return C3959e.fromArray(t, t2, t3, t4, t5, t6, t7);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        C15684a.a(t, "The first item is null");
        C15684a.a(t2, "The second item is null");
        C15684a.a(t3, "The third item is null");
        C15684a.a(t4, "The fourth item is null");
        C15684a.a(t5, "The fifth item is null");
        C15684a.a(t6, "The sixth item is null");
        C15684a.a(t7, "The seventh item is null");
        C15684a.a(t8, "The eighth item is null");
        return C3959e.fromArray(t, t2, t3, t4, t5, t6, t7, t8);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        C15684a.a(t, "The first item is null");
        C15684a.a(t2, "The second item is null");
        C15684a.a(t3, "The third item is null");
        C15684a.a(t4, "The fourth item is null");
        C15684a.a(t5, "The fifth item is null");
        C15684a.a(t6, "The sixth item is null");
        C15684a.a(t7, "The seventh item is null");
        C15684a.a(t8, "The eighth item is null");
        C15684a.a(t9, "The ninth item is null");
        return C3959e.fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        C15684a.a(t, "The first item is null");
        C15684a.a(t2, "The second item is null");
        C15684a.a(t3, "The third item is null");
        C15684a.a(t4, "The fourth item is null");
        C15684a.a(t5, "The fifth item is null");
        C15684a.a(t6, "The sixth item is null");
        C15684a.a(t7, "The seventh item is null");
        C15684a.a(t8, "The eighth item is null");
        C15684a.a(t9, "The ninth item is null");
        C15684a.a(t10, "The tenth item is null");
        return C3959e.fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable, int i, int i2) {
        return C3959e.fromIterable(iterable).flatMap(Functions.a(), false, i, i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> mergeArray(int i, int i2, ObservableSource<? extends T>... observableSourceArr) {
        return C3959e.fromArray(observableSourceArr).flatMap(Functions.a(), false, i, i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return C3959e.fromIterable(iterable).flatMap(Functions.a());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> merge(Iterable<? extends ObservableSource<? extends T>> iterable, int i) {
        return C3959e.fromIterable(iterable).flatMap(Functions.a(), i);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> merge(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        C15684a.a(observableSource, "sources is null");
        return C2667a.m10279a(new ObservableFlatMap(observableSource, Functions.a(), false, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, C3959e.bufferSize()));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> merge(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        C15684a.a(observableSource, "sources is null");
        C15684a.a(i, "maxConcurrency");
        return C2667a.m10279a(new ObservableFlatMap(observableSource, Functions.a(), false, i, C3959e.bufferSize()));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        return C3959e.fromArray(observableSource, observableSource2).flatMap(Functions.a(), false, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        return C3959e.fromArray(observableSource, observableSource2, observableSource3).flatMap(Functions.a(), false, 3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> merge(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        return C3959e.fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap(Functions.a(), false, 4);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> mergeArray(ObservableSource<? extends T>... observableSourceArr) {
        return C3959e.fromArray(observableSourceArr).flatMap(Functions.a(), observableSourceArr.length);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable) {
        return C3959e.fromIterable(iterable).flatMap(Functions.a(), true);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, int i, int i2) {
        return C3959e.fromIterable(iterable).flatMap(Functions.a(), true, i, i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> mergeArrayDelayError(int i, int i2, ObservableSource<? extends T>... observableSourceArr) {
        return C3959e.fromArray(observableSourceArr).flatMap(Functions.a(), true, i, i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> mergeDelayError(Iterable<? extends ObservableSource<? extends T>> iterable, int i) {
        return C3959e.fromIterable(iterable).flatMap(Functions.a(), true, i);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> mergeDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        C15684a.a(observableSource, "sources is null");
        return C2667a.m10279a(new ObservableFlatMap(observableSource, Functions.a(), true, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, C3959e.bufferSize()));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> mergeDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        C15684a.a(observableSource, "sources is null");
        C15684a.a(i, "maxConcurrency");
        return C2667a.m10279a(new ObservableFlatMap(observableSource, Functions.a(), true, i, C3959e.bufferSize()));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        return C3959e.fromArray(observableSource, observableSource2).flatMap(Functions.a(), true, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        return C3959e.fromArray(observableSource, observableSource2, observableSource3).flatMap(Functions.a(), true, 3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> mergeDelayError(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, ObservableSource<? extends T> observableSource3, ObservableSource<? extends T> observableSource4) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        return C3959e.fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap(Functions.a(), true, 4);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> mergeArrayDelayError(ObservableSource<? extends T>... observableSourceArr) {
        return C3959e.fromArray(observableSourceArr).flatMap(Functions.a(), true, observableSourceArr.length);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> never() {
        return C2667a.m10279a(az.f57256a);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static C3959e<Integer> range(int i, int i2) {
        if (i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("count >= 0 required but it was ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i2 == 0) {
            return C3959e.empty();
        } else {
            if (i2 == 1) {
                return C3959e.just(Integer.valueOf(i));
            }
            if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
                return C2667a.m10279a(new ObservableRange(i, i2));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static C3959e<Long> rangeLong(long j, long j2) {
        if (j2 < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("count >= 0 required but it was ");
            stringBuilder.append(j2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j2 == 0) {
            return C3959e.empty();
        } else {
            if (j2 == 1) {
                return C3959e.just(Long.valueOf(j));
            }
            long j3 = j + (j2 - 1);
            if (j <= 0 || j3 >= 0) {
                return C2667a.m10279a(new ObservableRangeLong(j, j2));
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3960g<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2) {
        return C3959e.sequenceEqual(observableSource, observableSource2, C15684a.a(), C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3960g<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate) {
        return C3959e.sequenceEqual(observableSource, observableSource2, biPredicate, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3960g<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, BiPredicate<? super T, ? super T> biPredicate, int i) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(biPredicate, "isEqual is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10283a(new ObservableSequenceEqualSingle(observableSource, observableSource2, biPredicate, i));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3960g<Boolean> sequenceEqual(ObservableSource<? extends T> observableSource, ObservableSource<? extends T> observableSource2, int i) {
        return C3959e.sequenceEqual(observableSource, observableSource2, C15684a.a(), i);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> switchOnNext(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        C15684a.a(observableSource, "sources is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new ObservableSwitchMap(observableSource, Functions.a(), i, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> switchOnNext(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return C3959e.switchOnNext(observableSource, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> switchOnNextDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource) {
        return C3959e.switchOnNextDelayError(observableSource, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> switchOnNextDelayError(ObservableSource<? extends ObservableSource<? extends T>> observableSource, int i) {
        C15684a.a(observableSource, "sources is null");
        C15684a.a(i, "prefetch");
        return C2667a.m10279a(new ObservableSwitchMap(observableSource, Functions.a(), i, true));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public static C3959e<Long> timer(long j, TimeUnit timeUnit) {
        return C3959e.timer(j, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public static C3959e<Long> timer(long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10279a(new ObservableTimer(Math.max(j, 0), timeUnit, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> unsafeCreate(ObservableSource<T> observableSource) {
        C15684a.a(observableSource, "source is null");
        C15684a.a(observableSource, "onSubscribe is null");
        if (!(observableSource instanceof C3959e)) {
            return C2667a.m10279a(new an(observableSource));
        }
        throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, D> C3959e<T> using(Callable<? extends D> callable, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer) {
        return C3959e.using(callable, function, consumer, true);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, D> C3959e<T> using(Callable<? extends D> callable, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer, boolean z) {
        C15684a.a(callable, "resourceSupplier is null");
        C15684a.a(function, "sourceSupplier is null");
        C15684a.a(consumer, "disposer is null");
        return C2667a.m10279a(new ObservableUsing(callable, function, consumer, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T> C3959e<T> wrap(ObservableSource<T> observableSource) {
        C15684a.a(observableSource, "source is null");
        if (observableSource instanceof C3959e) {
            return C2667a.m10279a((C3959e) observableSource);
        }
        return C2667a.m10279a(new an(observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> zip(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        C15684a.a(function, "zipper is null");
        C15684a.a(iterable, "sources is null");
        return C2667a.m10279a(new ObservableZip(null, iterable, function, C3959e.bufferSize(), false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> zip(ObservableSource<? extends ObservableSource<? extends T>> observableSource, Function<? super Object[], ? extends R> function) {
        C15684a.a(function, "zipper is null");
        C15684a.a(observableSource, "sources is null");
        return C2667a.m10279a(new bt(observableSource, 16).flatMap(ObservableInternalHelper.c(function)));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, R> C3959e<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        return C3959e.zipArray(Functions.a(biFunction), false, C3959e.bufferSize(), observableSource, observableSource2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, R> C3959e<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        return C3959e.zipArray(Functions.a(biFunction), z, C3959e.bufferSize(), observableSource, observableSource2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, R> C3959e<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z, int i) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        return C3959e.zipArray(Functions.a(biFunction), z, i, observableSource, observableSource2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, R> C3959e<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        return C3959e.zipArray(Functions.a(function3), false, C3959e.bufferSize(), observableSource, observableSource2, observableSource3);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, R> C3959e<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        return C3959e.zipArray(Functions.a(function4), false, C3959e.bufferSize(), observableSource, observableSource2, observableSource3, observableSource4);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, R> C3959e<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        C15684a.a(observableSource5, "source5 is null");
        return C3959e.zipArray(Functions.a(function5), false, C3959e.bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, R> C3959e<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        C15684a.a(observableSource5, "source5 is null");
        C15684a.a(observableSource6, "source6 is null");
        return C3959e.zipArray(Functions.a(function6), false, C3959e.bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> C3959e<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        C15684a.a(observableSource5, "source5 is null");
        C15684a.a(observableSource6, "source6 is null");
        C15684a.a(observableSource7, "source7 is null");
        return C3959e.zipArray(Functions.a(function7), false, C3959e.bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C3959e<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        C15684a.a(observableSource5, "source5 is null");
        C15684a.a(observableSource6, "source6 is null");
        C15684a.a(observableSource7, "source7 is null");
        C15684a.a(observableSource8, "source8 is null");
        return C3959e.zipArray(Functions.a(function8), false, C3959e.bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C3959e<R> zip(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, ObservableSource<? extends T7> observableSource7, ObservableSource<? extends T8> observableSource8, ObservableSource<? extends T9> observableSource9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        C15684a.a(observableSource, "source1 is null");
        C15684a.a(observableSource2, "source2 is null");
        C15684a.a(observableSource3, "source3 is null");
        C15684a.a(observableSource4, "source4 is null");
        C15684a.a(observableSource5, "source5 is null");
        C15684a.a(observableSource6, "source6 is null");
        C15684a.a(observableSource7, "source7 is null");
        C15684a.a(observableSource8, "source8 is null");
        C15684a.a(observableSource9, "source9 is null");
        return C3959e.zipArray(Functions.a(function9), false, C3959e.bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> zipArray(Function<? super Object[], ? extends R> function, boolean z, int i, ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return C3959e.empty();
        }
        C15684a.a(function, "zipper is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new ObservableZip(observableSourceArr, null, function, i, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public static <T, R> C3959e<R> zipIterable(Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, boolean z, int i) {
        C15684a.a(function, "zipper is null");
        C15684a.a(iterable, "sources is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new ObservableZip(null, iterable, function, i, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<Boolean> all(Predicate<? super T> predicate) {
        C15684a.a(predicate, "predicate is null");
        return C2667a.m10283a(new C18403f(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> ambWith(ObservableSource<? extends T> observableSource) {
        C15684a.a(observableSource, "other is null");
        return C3959e.ambArray(this, observableSource);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<Boolean> any(Predicate<? super T> predicate) {
        C15684a.a(predicate, "predicate is null");
        return C2667a.m10283a(new C18404h(this, predicate));
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final <R> R as(@NonNull ObservableConverter<T, ? extends R> observableConverter) {
        return ((ObservableConverter) C15684a.a(observableConverter, "converter is null")).apply(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final T blockingFirst() {
        Observer c18343d = new C18343d();
        subscribe(c18343d);
        T a = c18343d.a();
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final T blockingFirst(T t) {
        Observer c18343d = new C18343d();
        subscribe(c18343d);
        T a = c18343d.a();
        return a != null ? a : t;
    }

    @SchedulerSupport("none")
    public final void blockingForEach(Consumer<? super T> consumer) {
        Iterator it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                consumer.accept(it.next());
            } catch (Consumer<? super T> consumer2) {
                C15678a.b(consumer2);
                ((Disposable) it).dispose();
                consumer2 = ExceptionHelper.a(consumer2);
            }
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable<T> blockingIterable() {
        return blockingIterable(C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable<T> blockingIterable(int i) {
        C15684a.a(i, "bufferSize");
        return new BlockingObservableIterable(this, i);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final T blockingLast() {
        Observer c18344e = new C18344e();
        subscribe(c18344e);
        T a = c18344e.a();
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final T blockingLast(T t) {
        Observer c18344e = new C18344e();
        subscribe(c18344e);
        T a = c18344e.a();
        return a != null ? a : t;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable<T> blockingLatest() {
        return new C15711b(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable<T> blockingMostRecent(T t) {
        return new C15717c(this, t);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Iterable<T> blockingNext() {
        return new C15719d(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final T blockingSingle() {
        T b = singleElement().m15430b();
        if (b != null) {
            return b;
        }
        throw new NoSuchElementException();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final T blockingSingle(T t) {
        return single(t).m15463a();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new C17393i());
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe() {
        C15720i.a(this);
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer<? super T> consumer) {
        C15720i.a(this, consumer, Functions.f48544f, Functions.f48541c);
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        C15720i.a(this, consumer, consumer2, Functions.f48541c);
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        C15720i.a(this, consumer, consumer2, action);
    }

    @SchedulerSupport("none")
    public final void blockingSubscribe(Observer<? super T> observer) {
        C15720i.a(this, observer);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<List<T>> buffer(int i) {
        return buffer(i, i);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<List<T>> buffer(int i, int i2) {
        return buffer(i, i2, ArrayListSupplier.asCallable());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U extends Collection<? super T>> C3959e<U> buffer(int i, int i2, Callable<U> callable) {
        C15684a.a(i, ManagerWebServices.FB_PARAM_FIELD_COUNT);
        C15684a.a(i2, "skip");
        C15684a.a(callable, "bufferSupplier is null");
        return C2667a.m10279a(new ObservableBuffer(this, i, i2, callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U extends Collection<? super T>> C3959e<U> buffer(int i, Callable<U> callable) {
        return buffer(i, i, (Callable) callable);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<List<T>> buffer(long j, long j2, TimeUnit timeUnit) {
        return buffer(j, j2, timeUnit, C15756a.a(), ArrayListSupplier.asCallable());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<List<T>> buffer(long j, long j2, TimeUnit timeUnit, C15679f c15679f) {
        return buffer(j, j2, timeUnit, c15679f, ArrayListSupplier.asCallable());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <U extends Collection<? super T>> C3959e<U> buffer(long j, long j2, TimeUnit timeUnit, C15679f c15679f, Callable<U> callable) {
        TimeUnit timeUnit2 = timeUnit;
        C15684a.a(timeUnit2, "unit is null");
        C15679f c15679f2 = c15679f;
        C15684a.a(c15679f2, "scheduler is null");
        Callable<U> callable2 = callable;
        C15684a.a(callable2, "bufferSupplier is null");
        return C2667a.m10279a(new C19023l(this, j, j2, timeUnit2, c15679f2, callable2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, false));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<List<T>> buffer(long j, TimeUnit timeUnit) {
        return buffer(j, timeUnit, C15756a.a(), (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<List<T>> buffer(long j, TimeUnit timeUnit, int i) {
        return buffer(j, timeUnit, C15756a.a(), i);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<List<T>> buffer(long j, TimeUnit timeUnit, C15679f c15679f, int i) {
        return buffer(j, timeUnit, c15679f, i, ArrayListSupplier.asCallable(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <U extends Collection<? super T>> C3959e<U> buffer(long j, TimeUnit timeUnit, C15679f c15679f, int i, Callable<U> callable, boolean z) {
        TimeUnit timeUnit2 = timeUnit;
        C15684a.a(timeUnit2, "unit is null");
        C15679f c15679f2 = c15679f;
        C15684a.a(c15679f2, "scheduler is null");
        Callable<U> callable2 = callable;
        C15684a.a(callable2, "bufferSupplier is null");
        int i2 = i;
        C15684a.a(i2, ManagerWebServices.FB_PARAM_FIELD_COUNT);
        return C2667a.m10279a(new C19023l(this, j, j, timeUnit2, c15679f2, callable2, i2, z));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<List<T>> buffer(long j, TimeUnit timeUnit, C15679f c15679f) {
        return buffer(j, timeUnit, c15679f, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ArrayListSupplier.asCallable(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <TOpening, TClosing> C3959e<List<T>> buffer(ObservableSource<? extends TOpening> observableSource, Function<? super TOpening, ? extends ObservableSource<? extends TClosing>> function) {
        return buffer((ObservableSource) observableSource, (Function) function, ArrayListSupplier.asCallable());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <TOpening, TClosing, U extends Collection<? super T>> C3959e<U> buffer(ObservableSource<? extends TOpening> observableSource, Function<? super TOpening, ? extends ObservableSource<? extends TClosing>> function, Callable<U> callable) {
        C15684a.a(observableSource, "openingIndicator is null");
        C15684a.a(function, "closingIndicator is null");
        C15684a.a(callable, "bufferSupplier is null");
        return C2667a.m10279a(new ObservableBufferBoundary(this, observableSource, function, callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B> C3959e<List<T>> buffer(ObservableSource<B> observableSource) {
        return buffer((ObservableSource) observableSource, ArrayListSupplier.asCallable());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B> C3959e<List<T>> buffer(ObservableSource<B> observableSource, int i) {
        C15684a.a(i, "initialCapacity");
        return buffer((ObservableSource) observableSource, Functions.a(i));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B, U extends Collection<? super T>> C3959e<U> buffer(ObservableSource<B> observableSource, Callable<U> callable) {
        C15684a.a(observableSource, "boundary is null");
        C15684a.a(callable, "bufferSupplier is null");
        return C2667a.m10279a(new C19022k(this, observableSource, callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B> C3959e<List<T>> buffer(Callable<? extends ObservableSource<B>> callable) {
        return buffer((Callable) callable, ArrayListSupplier.asCallable());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B, U extends Collection<? super T>> C3959e<U> buffer(Callable<? extends ObservableSource<B>> callable, Callable<U> callable2) {
        C15684a.a(callable, "boundarySupplier is null");
        C15684a.a(callable2, "bufferSupplier is null");
        return C2667a.m10279a(new C19021j(this, callable, callable2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> cache() {
        return ObservableCache.a(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> cacheWithInitialCapacity(int i) {
        return ObservableCache.a(this, i);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3959e<U> cast(Class<U> cls) {
        C15684a.a(cls, "clazz is null");
        return map(Functions.a(cls));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3960g<U> collect(Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        C15684a.a(callable, "initialValueSupplier is null");
        C15684a.a(biConsumer, "collector is null");
        return C2667a.m10283a(new C18407n(this, callable, biConsumer));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3960g<U> collectInto(U u, BiConsumer<? super U, ? super T> biConsumer) {
        C15684a.a(u, "initialValue is null");
        return collect(Functions.a(u), biConsumer);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> compose(ObservableTransformer<? super T, ? extends R> observableTransformer) {
        return C3959e.wrap(((ObservableTransformer) C15684a.a(observableTransformer, "composer is null")).apply(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> concatMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMap(function, 2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> concatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "prefetch");
        if (!(this instanceof ScalarCallable)) {
            return C2667a.m10279a(new ObservableConcatMap(this, function, i, ErrorMode.IMMEDIATE));
        }
        i = ((ScalarCallable) this).call();
        if (i == 0) {
            return C3959e.empty();
        }
        return ObservableScalarXMap.a(i, function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> concatMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMapDelayError(function, C3959e.bufferSize(), true);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> concatMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "prefetch");
        if (this instanceof ScalarCallable) {
            i = ((ScalarCallable) this).call();
            if (i == 0) {
                return C3959e.empty();
            }
            return ObservableScalarXMap.a(i, function);
        }
        return C2667a.m10279a(new ObservableConcatMap(this, function, i, z ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> concatMapEager(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return concatMapEager(function, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> concatMapEager(Function<? super T, ? extends ObservableSource<? extends R>> function, int i, int i2) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "maxConcurrency");
        C15684a.a(i2, "prefetch");
        return C2667a.m10279a(new ObservableConcatMapEager(this, function, ErrorMode.IMMEDIATE, i, i2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> concatMapEagerDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z) {
        return concatMapEagerDelayError(function, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, C3959e.bufferSize(), z);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> concatMapEagerDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, int i, int i2, boolean z) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "maxConcurrency");
        C15684a.a(i2, "prefetch");
        return C2667a.m10279a(new ObservableConcatMapEager(this, function, z ? ErrorMode.END : ErrorMode.BOUNDARY, i, i2));
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final C3956a concatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletable(function, 2);
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final C3956a concatMapCompletable(Function<? super T, ? extends CompletableSource> function, int i) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "capacityHint");
        return C2667a.m10274a(new ObservableConcatMapCompletable(this, function, i));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3959e<U> concatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10279a(new ah(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3959e<U> concatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, int i) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "prefetch");
        return concatMap(ObservableInternalHelper.b(function), i);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> concatWith(ObservableSource<? extends T> observableSource) {
        C15684a.a(observableSource, "other is null");
        return C3959e.concat((ObservableSource) this, (ObservableSource) observableSource);
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final C3959e<T> concatWith(@NonNull SingleSource<? extends T> singleSource) {
        C15684a.a(singleSource, "other is null");
        return C2667a.m10279a(new ObservableConcatWithSingle(this, singleSource));
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final C3959e<T> concatWith(@NonNull MaybeSource<? extends T> maybeSource) {
        C15684a.a(maybeSource, "other is null");
        return C2667a.m10279a(new ObservableConcatWithMaybe(this, maybeSource));
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final C3959e<T> concatWith(@NonNull CompletableSource completableSource) {
        C15684a.a(completableSource, "other is null");
        return C2667a.m10279a(new ObservableConcatWithCompletable(this, completableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<Boolean> contains(Object obj) {
        C15684a.a(obj, "element is null");
        return any(Functions.c(obj));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<Long> count() {
        return C2667a.m10283a(new C18408p(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3959e<T> debounce(Function<? super T, ? extends ObservableSource<U>> function) {
        C15684a.a(function, "debounceSelector is null");
        return C2667a.m10279a(new C19026q(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<T> debounce(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> debounce(long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10279a(new ObservableDebounceTimed(this, j, timeUnit, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> defaultIfEmpty(T t) {
        C15684a.a(t, "defaultItem is null");
        return switchIfEmpty(C3959e.just(t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3959e<T> delay(Function<? super T, ? extends ObservableSource<U>> function) {
        C15684a.a(function, "itemDelay is null");
        return flatMap(ObservableInternalHelper.a(function));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, C15756a.a(), false);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<T> delay(long j, TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, C15756a.a(), z);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> delay(long j, TimeUnit timeUnit, C15679f c15679f) {
        return delay(j, timeUnit, c15679f, false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> delay(long j, TimeUnit timeUnit, C15679f c15679f, boolean z) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10279a(new C19027s(this, j, timeUnit, c15679f, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, V> C3959e<T> delay(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function) {
        return delaySubscription(observableSource).delay(function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3959e<T> delaySubscription(ObservableSource<U> observableSource) {
        C15684a.a(observableSource, "other is null");
        return C2667a.m10279a(new C18411t(this, observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> delaySubscription(long j, TimeUnit timeUnit, C15679f c15679f) {
        return delaySubscription(C3959e.timer(j, timeUnit, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <T2> C3959e<T2> dematerialize() {
        return C2667a.m10279a(new C19028u(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> distinct() {
        return distinct(Functions.a(), Functions.g());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> C3959e<T> distinct(Function<? super T, K> function) {
        return distinct(function, Functions.g());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> C3959e<T> distinct(Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        C15684a.a(function, "keySelector is null");
        C15684a.a(callable, "collectionSupplier is null");
        return C2667a.m10279a(new C19030w(this, function, callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> distinctUntilChanged() {
        return distinctUntilChanged(Functions.a());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> C3959e<T> distinctUntilChanged(Function<? super T, K> function) {
        C15684a.a(function, "keySelector is null");
        return C2667a.m10279a(new C19031x(this, function, C15684a.a()));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> distinctUntilChanged(BiPredicate<? super T, ? super T> biPredicate) {
        C15684a.a(biPredicate, "comparer is null");
        return C2667a.m10279a(new C19031x(this, Functions.a(), biPredicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> doAfterNext(Consumer<? super T> consumer) {
        C15684a.a(consumer, "onAfterNext is null");
        return C2667a.m10279a(new C19032y(this, consumer));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> doAfterTerminate(Action action) {
        C15684a.a(action, "onFinally is null");
        return doOnEach(Functions.b(), Functions.b(), Functions.f48541c, action);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> doFinally(Action action) {
        C15684a.a(action, "onFinally is null");
        return C2667a.m10279a(new ObservableDoFinally(this, action));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> doOnDispose(Action action) {
        return doOnLifecycle(Functions.b(), action);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> doOnComplete(Action action) {
        return doOnEach(Functions.b(), Functions.b(), action, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    private C3959e<T> doOnEach(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        C15684a.a(consumer, "onNext is null");
        C15684a.a(consumer2, "onError is null");
        C15684a.a(action, "onComplete is null");
        C15684a.a(action2, "onAfterTerminate is null");
        return C2667a.m10279a(new C19033z(this, consumer, consumer2, action, action2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> doOnEach(Consumer<? super C15675d<T>> consumer) {
        C15684a.a(consumer, "consumer is null");
        return doOnEach(Functions.a(consumer), Functions.b(consumer), Functions.c(consumer), Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> doOnEach(Observer<? super T> observer) {
        C15684a.a(observer, "observer is null");
        return doOnEach(ObservableInternalHelper.a(observer), ObservableInternalHelper.b(observer), ObservableInternalHelper.c(observer), Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> doOnError(Consumer<? super Throwable> consumer) {
        return doOnEach(Functions.b(), consumer, Functions.f48541c, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> doOnLifecycle(Consumer<? super Disposable> consumer, Action action) {
        C15684a.a(consumer, "onSubscribe is null");
        C15684a.a(action, "onDispose is null");
        return C2667a.m10279a(new aa(this, consumer, action));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> doOnNext(Consumer<? super T> consumer) {
        return doOnEach(consumer, Functions.b(), Functions.f48541c, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> doOnSubscribe(Consumer<? super Disposable> consumer) {
        return doOnLifecycle(consumer, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> doOnTerminate(Action action) {
        C15684a.a(action, "onTerminate is null");
        return doOnEach(Functions.b(), Functions.a(action), action, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3958c<T> elementAt(long j) {
        if (j >= 0) {
            return C2667a.m10278a(new ac(this, j));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("index >= 0 required but it was ");
        stringBuilder.append(j);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<T> elementAt(long j, T t) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("index >= 0 required but it was ");
            stringBuilder.append(j);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        C15684a.a(t, "defaultItem is null");
        return C2667a.m10283a(new ad(this, j, t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<T> elementAtOrError(long j) {
        if (j >= 0) {
            return C2667a.m10283a(new ad(this, j, null));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("index >= 0 required but it was ");
        stringBuilder.append(j);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> filter(Predicate<? super T> predicate) {
        C15684a.a(predicate, "predicate is null");
        return C2667a.m10279a(new ag(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3958c<T> firstElement() {
        return elementAt(0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<T> first(T t) {
        return elementAt(0, t);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<T> firstOrError() {
        return elementAtOrError(0);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return flatMap((Function) function, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z) {
        return flatMap((Function) function, z, (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i) {
        return flatMap((Function) function, z, i, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, boolean z, int i, int i2) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "maxConcurrency");
        C15684a.a(i2, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return C2667a.m10279a(new ObservableFlatMap(this, function, z, i, i2));
        }
        z = ((ScalarCallable) this).call();
        if (z) {
            return ObservableScalarXMap.a(z, function);
        }
        return C3959e.empty();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, Function<? super Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable) {
        C15684a.a(function, "onNextMapper is null");
        C15684a.a(function2, "onErrorMapper is null");
        C15684a.a(callable, "onCompleteSupplier is null");
        return C3959e.merge(new ax(this, function, function2, callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, Function<Throwable, ? extends ObservableSource<? extends R>> function2, Callable<? extends ObservableSource<? extends R>> callable, int i) {
        C15684a.a(function, "onNextMapper is null");
        C15684a.a(function2, "onErrorMapper is null");
        C15684a.a(callable, "onCompleteSupplier is null");
        return C3959e.merge(new ax(this, function, function2, callable), i);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> flatMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        return flatMap((Function) function, false, i, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> C3959e<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return flatMap(function, biFunction, false, C3959e.bufferSize(), C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> C3959e<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z) {
        return flatMap(function, biFunction, z, C3959e.bufferSize(), C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> C3959e<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z, int i) {
        return flatMap(function, biFunction, z, i, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> C3959e<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z, int i, int i2) {
        C15684a.a(function, "mapper is null");
        C15684a.a(biFunction, "combiner is null");
        return flatMap(ObservableInternalHelper.a(function, biFunction), z, i, i2);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> C3959e<R> flatMap(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, int i) {
        return flatMap(function, biFunction, false, i, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3956a flatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        return flatMapCompletable(function, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3956a flatMapCompletable(Function<? super T, ? extends CompletableSource> function, boolean z) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10274a(new ObservableFlatMapCompletableCompletable(this, function, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3959e<U> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10279a(new ah(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, V> C3959e<V> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        C15684a.a(function, "mapper is null");
        C15684a.a(biFunction, "resultSelector is null");
        return flatMap(ObservableInternalHelper.b(function), biFunction, false, C3959e.bufferSize(), C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return flatMapMaybe(function, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10279a(new ObservableFlatMapMaybe(this, function, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> flatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return flatMapSingle(function, false);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> flatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10279a(new ObservableFlatMapSingle(this, function, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEach(Consumer<? super T> consumer) {
        return subscribe((Consumer) consumer);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEachWhile(Predicate<? super T> predicate) {
        return forEachWhile(predicate, Functions.f48544f, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEachWhile(Predicate<? super T> predicate, Consumer<? super Throwable> consumer) {
        return forEachWhile(predicate, consumer, Functions.f48541c);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable forEachWhile(Predicate<? super T> predicate, Consumer<? super Throwable> consumer, Action action) {
        C15684a.a(predicate, "onNext is null");
        C15684a.a(consumer, "onError is null");
        C15684a.a(action, "onComplete is null");
        Observer forEachWhileObserver = new ForEachWhileObserver(predicate, consumer, action);
        subscribe(forEachWhileObserver);
        return forEachWhileObserver;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> C3959e<C18341b<K, T>> groupBy(Function<? super T, ? extends K> function) {
        return groupBy(function, Functions.a(), false, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> C3959e<C18341b<K, T>> groupBy(Function<? super T, ? extends K> function, boolean z) {
        return groupBy(function, Functions.a(), z, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> C3959e<C18341b<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return groupBy(function, function2, false, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> C3959e<C18341b<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z) {
        return groupBy(function, function2, z, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> C3959e<C18341b<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z, int i) {
        C15684a.a(function, "keySelector is null");
        C15684a.a(function2, "valueSelector is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new ObservableGroupBy(this, function, function2, i, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <TRight, TLeftEnd, TRightEnd, R> C3959e<R> groupJoin(ObservableSource<? extends TRight> observableSource, Function<? super T, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super T, ? super C3959e<TRight>, ? extends R> biFunction) {
        C15684a.a(observableSource, "other is null");
        C15684a.a(function, "leftEnd is null");
        C15684a.a(function2, "rightEnd is null");
        C15684a.a(biFunction, "resultSelector is null");
        return C2667a.m10279a(new ObservableGroupJoin(this, observableSource, function, function2, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> hide() {
        return C2667a.m10279a(new ap(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3956a ignoreElements() {
        return C2667a.m10274a(new ar(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<Boolean> isEmpty() {
        return all(Functions.d());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <TRight, TLeftEnd, TRightEnd, R> C3959e<R> join(ObservableSource<? extends TRight> observableSource, Function<? super T, ? extends ObservableSource<TLeftEnd>> function, Function<? super TRight, ? extends ObservableSource<TRightEnd>> function2, BiFunction<? super T, ? super TRight, ? extends R> biFunction) {
        C15684a.a(observableSource, "other is null");
        C15684a.a(function, "leftEnd is null");
        C15684a.a(function2, "rightEnd is null");
        C15684a.a(biFunction, "resultSelector is null");
        return C2667a.m10279a(new ObservableJoin(this, observableSource, function, function2, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3958c<T> lastElement() {
        return C2667a.m10278a(new at(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<T> last(T t) {
        C15684a.a(t, "defaultItem is null");
        return C2667a.m10283a(new au(this, t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<T> lastOrError() {
        return C2667a.m10283a(new au(this, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> lift(ObservableOperator<? extends R, ? super T> observableOperator) {
        C15684a.a(observableOperator, "onLift is null");
        return C2667a.m10279a(new av(this, observableOperator));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> map(Function<? super T, ? extends R> function) {
        C15684a.a(function, "mapper is null");
        return C2667a.m10279a(new aw(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<C15675d<T>> materialize() {
        return C2667a.m10279a(new ay(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> mergeWith(ObservableSource<? extends T> observableSource) {
        C15684a.a(observableSource, "other is null");
        return C3959e.merge((ObservableSource) this, (ObservableSource) observableSource);
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final C3959e<T> mergeWith(@NonNull SingleSource<? extends T> singleSource) {
        C15684a.a(singleSource, "other is null");
        return C2667a.m10279a(new ObservableMergeWithSingle(this, singleSource));
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final C3959e<T> mergeWith(@NonNull MaybeSource<? extends T> maybeSource) {
        C15684a.a(maybeSource, "other is null");
        return C2667a.m10279a(new ObservableMergeWithMaybe(this, maybeSource));
    }

    @CheckReturnValue
    @Experimental
    @SchedulerSupport("none")
    public final C3959e<T> mergeWith(@NonNull CompletableSource completableSource) {
        C15684a.a(completableSource, "other is null");
        return C2667a.m10279a(new ObservableMergeWithCompletable(this, completableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> observeOn(C15679f c15679f) {
        return observeOn(c15679f, false, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> observeOn(C15679f c15679f, boolean z) {
        return observeOn(c15679f, z, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> observeOn(C15679f c15679f, boolean z, int i) {
        C15684a.a(c15679f, "scheduler is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new ObservableObserveOn(this, c15679f, z, i));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3959e<U> ofType(Class<U> cls) {
        C15684a.a(cls, "clazz is null");
        return filter(Functions.b(cls)).cast(cls);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> onErrorResumeNext(Function<? super Throwable, ? extends ObservableSource<? extends T>> function) {
        C15684a.a(function, "resumeFunction is null");
        return C2667a.m10279a(new ba(this, function, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> onErrorResumeNext(ObservableSource<? extends T> observableSource) {
        C15684a.a(observableSource, "next is null");
        return onErrorResumeNext(Functions.b(observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> onErrorReturn(Function<? super Throwable, ? extends T> function) {
        C15684a.a(function, "valueSupplier is null");
        return C2667a.m10279a(new bb(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> onErrorReturnItem(T t) {
        C15684a.a(t, "item is null");
        return onErrorReturn(Functions.b(t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> onExceptionResumeNext(ObservableSource<? extends T> observableSource) {
        C15684a.a(observableSource, "next is null");
        return C2667a.m10279a(new ba(this, Functions.b(observableSource), true));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> onTerminateDetach() {
        return C2667a.m10279a(new C19029v(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C18340a<T> publish() {
        return ObservablePublish.a(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> publish(Function<? super C3959e<T>, ? extends ObservableSource<R>> function) {
        C15684a.a(function, "selector is null");
        return C2667a.m10279a(new ObservablePublishSelector(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3958c<T> reduce(BiFunction<T, T, T> biFunction) {
        C15684a.a(biFunction, "reducer is null");
        return C2667a.m10278a(new bc(this, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3960g<R> reduce(R r, BiFunction<R, ? super T, R> biFunction) {
        C15684a.a(r, "seed is null");
        C15684a.a(biFunction, "reducer is null");
        return C2667a.m10283a(new bd(this, r, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3960g<R> reduceWith(Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        C15684a.a(callable, "seedSupplier is null");
        C15684a.a(biFunction, "reducer is null");
        return C2667a.m10283a(new be(this, callable, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> repeat() {
        return repeat(Format.OFFSET_SAMPLE_RELATIVE);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> repeat(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("times >= 0 required but it was ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (j == 0) {
            return C3959e.empty();
        } else {
            return C2667a.m10279a(new ObservableRepeat(this, j));
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> repeatUntil(BooleanSupplier booleanSupplier) {
        C15684a.a(booleanSupplier, "stop is null");
        return C2667a.m10279a(new ObservableRepeatUntil(this, booleanSupplier));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> repeatWhen(Function<? super C3959e<Object>, ? extends ObservableSource<?>> function) {
        C15684a.a(function, "handler is null");
        return C2667a.m10279a(new ObservableRepeatWhen(this, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C18340a<T> replay() {
        return ObservableReplay.a(this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> replay(Function<? super C3959e<T>, ? extends ObservableSource<R>> function) {
        C15684a.a(function, "selector is null");
        return ObservableReplay.a(ObservableInternalHelper.a(this), function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> replay(Function<? super C3959e<T>, ? extends ObservableSource<R>> function, int i) {
        C15684a.a(function, "selector is null");
        C15684a.a(i, "bufferSize");
        return ObservableReplay.a(ObservableInternalHelper.a(this, i), function);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final <R> C3959e<R> replay(Function<? super C3959e<T>, ? extends ObservableSource<R>> function, int i, long j, TimeUnit timeUnit) {
        return replay(function, i, j, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <R> C3959e<R> replay(Function<? super C3959e<T>, ? extends ObservableSource<R>> function, int i, long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(function, "selector is null");
        C15684a.a(i, "bufferSize");
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return ObservableReplay.a(ObservableInternalHelper.a(this, i, j, timeUnit, c15679f), function);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <R> C3959e<R> replay(Function<? super C3959e<T>, ? extends ObservableSource<R>> function, int i, C15679f c15679f) {
        C15684a.a(function, "selector is null");
        C15684a.a(c15679f, "scheduler is null");
        C15684a.a(i, "bufferSize");
        return ObservableReplay.a(ObservableInternalHelper.a(this, i), ObservableInternalHelper.a(function, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final <R> C3959e<R> replay(Function<? super C3959e<T>, ? extends ObservableSource<R>> function, long j, TimeUnit timeUnit) {
        return replay((Function) function, j, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <R> C3959e<R> replay(Function<? super C3959e<T>, ? extends ObservableSource<R>> function, long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(function, "selector is null");
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return ObservableReplay.a(ObservableInternalHelper.a(this, j, timeUnit, c15679f), function);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final <R> C3959e<R> replay(Function<? super C3959e<T>, ? extends ObservableSource<R>> function, C15679f c15679f) {
        C15684a.a(function, "selector is null");
        C15684a.a(c15679f, "scheduler is null");
        return ObservableReplay.a(ObservableInternalHelper.a(this), ObservableInternalHelper.a(function, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C18340a<T> replay(int i) {
        C15684a.a(i, "bufferSize");
        return ObservableReplay.a(this, i);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C18340a<T> replay(int i, long j, TimeUnit timeUnit) {
        return replay(i, j, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C18340a<T> replay(int i, long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(i, "bufferSize");
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return ObservableReplay.a(this, j, timeUnit, c15679f, i);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C18340a<T> replay(int i, C15679f c15679f) {
        C15684a.a(i, "bufferSize");
        return ObservableReplay.a(replay(i), c15679f);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C18340a<T> replay(long j, TimeUnit timeUnit) {
        return replay(j, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C18340a<T> replay(long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return ObservableReplay.a(this, j, timeUnit, c15679f);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C18340a<T> replay(C15679f c15679f) {
        C15684a.a(c15679f, "scheduler is null");
        return ObservableReplay.a(replay(), c15679f);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> retry() {
        return retry(Format.OFFSET_SAMPLE_RELATIVE, Functions.c());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> retry(BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        C15684a.a(biPredicate, "predicate is null");
        return C2667a.m10279a(new ObservableRetryBiPredicate(this, biPredicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> retry(long j) {
        return retry(j, Functions.c());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> retry(long j, Predicate<? super Throwable> predicate) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("times >= 0 required but it was ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        C15684a.a(predicate, "predicate is null");
        return C2667a.m10279a(new ObservableRetryPredicate(this, j, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> retry(Predicate<? super Throwable> predicate) {
        return retry(Format.OFFSET_SAMPLE_RELATIVE, predicate);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> retryUntil(BooleanSupplier booleanSupplier) {
        C15684a.a(booleanSupplier, "stop is null");
        return retry(Format.OFFSET_SAMPLE_RELATIVE, Functions.a(booleanSupplier));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> retryWhen(Function<? super C3959e<Throwable>, ? extends ObservableSource<?>> function) {
        C15684a.a(function, "handler is null");
        return C2667a.m10279a(new ObservableRetryWhen(this, function));
    }

    @SchedulerSupport("none")
    public final void safeSubscribe(Observer<? super T> observer) {
        C15684a.a(observer, "s is null");
        if (observer instanceof C17529c) {
            subscribe((Observer) observer);
        } else {
            subscribe(new C17529c(observer));
        }
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<T> sample(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<T> sample(long j, TimeUnit timeUnit, boolean z) {
        return sample(j, timeUnit, C15756a.a(), z);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> sample(long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10279a(new ObservableSampleTimed(this, j, timeUnit, c15679f, false));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> sample(long j, TimeUnit timeUnit, C15679f c15679f, boolean z) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10279a(new ObservableSampleTimed(this, j, timeUnit, c15679f, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3959e<T> sample(ObservableSource<U> observableSource) {
        C15684a.a(observableSource, "sampler is null");
        return C2667a.m10279a(new ObservableSampleWithObservable(this, observableSource, false));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3959e<T> sample(ObservableSource<U> observableSource, boolean z) {
        C15684a.a(observableSource, "sampler is null");
        return C2667a.m10279a(new ObservableSampleWithObservable(this, observableSource, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> scan(BiFunction<T, T, T> biFunction) {
        C15684a.a(biFunction, "accumulator is null");
        return C2667a.m10279a(new bf(this, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> scan(R r, BiFunction<R, ? super T, R> biFunction) {
        C15684a.a(r, "seed is null");
        return scanWith(Functions.a(r), biFunction);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> scanWith(Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        C15684a.a(callable, "seedSupplier is null");
        C15684a.a(biFunction, "accumulator is null");
        return C2667a.m10279a(new bg(this, callable, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> serialize() {
        return C2667a.m10279a(new bh(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> share() {
        return publish().a();
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3958c<T> singleElement() {
        return C2667a.m10278a(new bi(this));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<T> single(T t) {
        C15684a.a(t, "defaultItem is null");
        return C2667a.m10283a(new bj(this, t));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<T> singleOrError() {
        return C2667a.m10283a(new bj(this, null));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> skip(long j) {
        if (j <= 0) {
            return C2667a.m10279a(this);
        }
        return C2667a.m10279a(new bk(this, j));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<T> skip(long j, TimeUnit timeUnit) {
        return skipUntil(C3959e.timer(j, timeUnit));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> skip(long j, TimeUnit timeUnit, C15679f c15679f) {
        return skipUntil(C3959e.timer(j, timeUnit, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> skipLast(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("count >= 0 required but it was ");
            stringBuilder.append(i);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else if (i == 0) {
            return C2667a.m10279a(this);
        } else {
            return C2667a.m10279a(new ObservableSkipLast(this, i));
        }
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final C3959e<T> skipLast(long j, TimeUnit timeUnit) {
        return skipLast(j, timeUnit, C15756a.c(), false, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final C3959e<T> skipLast(long j, TimeUnit timeUnit, boolean z) {
        return skipLast(j, timeUnit, C15756a.c(), z, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> skipLast(long j, TimeUnit timeUnit, C15679f c15679f) {
        return skipLast(j, timeUnit, c15679f, false, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> skipLast(long j, TimeUnit timeUnit, C15679f c15679f, boolean z) {
        return skipLast(j, timeUnit, c15679f, z, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> skipLast(long j, TimeUnit timeUnit, C15679f c15679f, boolean z, int i) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new ObservableSkipLastTimed(this, j, timeUnit, c15679f, i << 1, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3959e<T> skipUntil(ObservableSource<U> observableSource) {
        C15684a.a(observableSource, "other is null");
        return C2667a.m10279a(new bl(this, observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> skipWhile(Predicate<? super T> predicate) {
        C15684a.a(predicate, "predicate is null");
        return C2667a.m10279a(new bm(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> sorted() {
        return toList().m15477e().map(Functions.a(Functions.h())).flatMapIterable(Functions.a());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> sorted(Comparator<? super T> comparator) {
        C15684a.a(comparator, "sortFunction is null");
        return toList().m15477e().map(Functions.a(comparator)).flatMapIterable(Functions.a());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> startWith(Iterable<? extends T> iterable) {
        return C3959e.concatArray(C3959e.fromIterable(iterable), this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> startWith(ObservableSource<? extends T> observableSource) {
        C15684a.a(observableSource, "other is null");
        return C3959e.concatArray(observableSource, this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> startWith(T t) {
        C15684a.a(t, "item is null");
        return C3959e.concatArray(C3959e.just(t), this);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> startWithArray(T... tArr) {
        if (C3959e.fromArray(tArr) == C3959e.empty()) {
            return C2667a.m10279a(this);
        }
        return C3959e.concatArray(C3959e.fromArray(tArr), this);
    }

    @SchedulerSupport("none")
    public final Disposable subscribe() {
        return subscribe(Functions.b(), Functions.f48544f, Functions.f48541c, Functions.b());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.f48544f, Functions.f48541c, Functions.b());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.f48541c, Functions.b());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        return subscribe(consumer, consumer2, action, Functions.b());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Disposable> consumer3) {
        C15684a.a(consumer, "onNext is null");
        C15684a.a(consumer2, "onError is null");
        C15684a.a(action, "onComplete is null");
        C15684a.a(consumer3, "onSubscribe is null");
        Observer lambdaObserver = new LambdaObserver(consumer, consumer2, action, consumer3);
        subscribe(lambdaObserver);
        return lambdaObserver;
    }

    @SchedulerSupport("none")
    public final void subscribe(Observer<? super T> observer) {
        C15684a.a(observer, "observer is null");
        try {
            observer = C2667a.m10272a(this, (Observer) observer);
            C15684a.a(observer, "Plugin returned null Observer");
            subscribeActual(observer);
        } catch (Observer<? super T> observer2) {
            throw observer2;
        } catch (Throwable th) {
            C15678a.b(th);
            C2667a.m10289a(th);
            new NullPointerException("Actually not, but can't throw other exceptions due to RS").initCause(th);
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <E extends Observer<? super T>> E subscribeWith(E e) {
        subscribe((Observer) e);
        return e;
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> subscribeOn(C15679f c15679f) {
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10279a(new ObservableSubscribeOn(this, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> switchIfEmpty(ObservableSource<? extends T> observableSource) {
        C15684a.a(observableSource, "other is null");
        return C2667a.m10279a(new bn(this, observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> switchMap(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return switchMap(function, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> switchMap(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return C2667a.m10279a(new ObservableSwitchMap(this, function, i, false));
        }
        i = ((ScalarCallable) this).call();
        if (i == 0) {
            return C3959e.empty();
        }
        return ObservableScalarXMap.a(i, function);
    }

    @CheckReturnValue
    @Experimental
    @NonNull
    @SchedulerSupport("none")
    public final <R> C3959e<R> switchMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        return ObservableInternalHelper.a(this, function);
    }

    @CheckReturnValue
    @Experimental
    @NonNull
    @SchedulerSupport("none")
    public final <R> C3959e<R> switchMapSingleDelayError(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        return ObservableInternalHelper.b(this, function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> switchMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function) {
        return switchMapDelayError(function, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> switchMapDelayError(Function<? super T, ? extends ObservableSource<? extends R>> function, int i) {
        C15684a.a(function, "mapper is null");
        C15684a.a(i, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return C2667a.m10279a(new ObservableSwitchMap(this, function, i, true));
        }
        i = ((ScalarCallable) this).call();
        if (i == 0) {
            return C3959e.empty();
        }
        return ObservableScalarXMap.a(i, function);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> take(long j) {
        if (j >= 0) {
            return C2667a.m10279a(new bo(this, j));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("count >= 0 required but it was ");
        stringBuilder.append(j);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> take(long j, TimeUnit timeUnit) {
        return takeUntil(C3959e.timer(j, timeUnit));
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> take(long j, TimeUnit timeUnit, C15679f c15679f) {
        return takeUntil(C3959e.timer(j, timeUnit, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> takeLast(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("count >= 0 required but it was ");
            stringBuilder.append(i);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else if (i == 0) {
            return C2667a.m10279a(new aq(this));
        } else {
            if (i == 1) {
                return C2667a.m10279a(new bp(this));
            }
            return C2667a.m10279a(new ObservableTakeLast(this, i));
        }
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final C3959e<T> takeLast(long j, long j2, TimeUnit timeUnit) {
        return takeLast(j, j2, timeUnit, C15756a.c(), false, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> takeLast(long j, long j2, TimeUnit timeUnit, C15679f c15679f) {
        return takeLast(j, j2, timeUnit, c15679f, false, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> takeLast(long j, long j2, TimeUnit timeUnit, C15679f c15679f, boolean z, int i) {
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        C15684a.a(timeUnit2, "unit is null");
        C15679f c15679f2 = c15679f;
        C15684a.a(c15679f2, "scheduler is null");
        int i2 = i;
        C15684a.a(i2, "bufferSize");
        if (j3 >= 0) {
            return C2667a.m10279a(new ObservableTakeLastTimed(this, j3, j2, timeUnit2, c15679f2, i2, z));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("count >= 0 required but it was ");
        stringBuilder.append(j3);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final C3959e<T> takeLast(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit, C15756a.c(), false, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:trampoline")
    public final C3959e<T> takeLast(long j, TimeUnit timeUnit, boolean z) {
        return takeLast(j, timeUnit, C15756a.c(), z, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> takeLast(long j, TimeUnit timeUnit, C15679f c15679f) {
        return takeLast(j, timeUnit, c15679f, false, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> takeLast(long j, TimeUnit timeUnit, C15679f c15679f, boolean z) {
        return takeLast(j, timeUnit, c15679f, z, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> takeLast(long j, TimeUnit timeUnit, C15679f c15679f, boolean z, int i) {
        return takeLast(Format.OFFSET_SAMPLE_RELATIVE, j, timeUnit, c15679f, z, i);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U> C3959e<T> takeUntil(ObservableSource<U> observableSource) {
        C15684a.a(observableSource, "other is null");
        return C2667a.m10279a(new ObservableTakeUntil(this, observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> takeUntil(Predicate<? super T> predicate) {
        C15684a.a(predicate, "predicate is null");
        return C2667a.m10279a(new bq(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<T> takeWhile(Predicate<? super T> predicate) {
        C15684a.a(predicate, "predicate is null");
        return C2667a.m10279a(new br(this, predicate));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<T> throttleFirst(long j, TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> throttleFirst(long j, TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10279a(new ObservableThrottleFirstTimed(this, j, timeUnit, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<T> throttleLast(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> throttleLast(long j, TimeUnit timeUnit, C15679f c15679f) {
        return sample(j, timeUnit, c15679f);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<T> throttleWithTimeout(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> throttleWithTimeout(long j, TimeUnit timeUnit, C15679f c15679f) {
        return debounce(j, timeUnit, c15679f);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<C15757b<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<C15757b<T>> timeInterval(C15679f c15679f) {
        return timeInterval(TimeUnit.MILLISECONDS, c15679f);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<C15757b<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<C15757b<T>> timeInterval(TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10279a(new bs(this, timeUnit, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <V> C3959e<T> timeout(Function<? super T, ? extends ObservableSource<V>> function) {
        return timeout0(null, function, null);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <V> C3959e<T> timeout(Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource) {
        C15684a.a(observableSource, "other is null");
        return timeout0(null, function, observableSource);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, null, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<T> timeout(long j, TimeUnit timeUnit, ObservableSource<? extends T> observableSource) {
        C15684a.a(observableSource, "other is null");
        return timeout0(j, timeUnit, observableSource, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> timeout(long j, TimeUnit timeUnit, C15679f c15679f, ObservableSource<? extends T> observableSource) {
        C15684a.a(observableSource, "other is null");
        return timeout0(j, timeUnit, observableSource, c15679f);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> timeout(long j, TimeUnit timeUnit, C15679f c15679f) {
        return timeout0(j, timeUnit, null, c15679f);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, V> C3959e<T> timeout(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function) {
        C15684a.a(observableSource, "firstTimeoutIndicator is null");
        return timeout0(observableSource, function, null);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, V> C3959e<T> timeout(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        C15684a.a(observableSource, "firstTimeoutIndicator is null");
        C15684a.a(observableSource2, "other is null");
        return timeout0(observableSource, function, observableSource2);
    }

    private C3959e<T> timeout0(long j, TimeUnit timeUnit, ObservableSource<? extends T> observableSource, C15679f c15679f) {
        C15684a.a(timeUnit, "timeUnit is null");
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10279a(new ObservableTimeoutTimed(this, j, timeUnit, c15679f, observableSource));
    }

    private <U, V> C3959e<T> timeout0(ObservableSource<U> observableSource, Function<? super T, ? extends ObservableSource<V>> function, ObservableSource<? extends T> observableSource2) {
        C15684a.a(function, "itemTimeoutIndicator is null");
        return C2667a.m10279a(new ObservableTimeout(this, observableSource, function, observableSource2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<C15757b<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<C15757b<T>> timestamp(C15679f c15679f) {
        return timestamp(TimeUnit.MILLISECONDS, c15679f);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<C15757b<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, C15756a.a());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<C15757b<T>> timestamp(TimeUnit timeUnit, C15679f c15679f) {
        C15684a.a(timeUnit, "unit is null");
        C15684a.a(c15679f, "scheduler is null");
        return map(Functions.a(timeUnit, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> R to(Function<? super C3959e<T>, R> function) {
        try {
            return ((Function) C15684a.a(function, "converter is null")).apply(this);
        } catch (Function<? super C3959e<T>, R> function2) {
            C15678a.b(function2);
            function2 = ExceptionHelper.a(function2);
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<List<T>> toList() {
        return toList(16);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<List<T>> toList(int i) {
        C15684a.a(i, "capacityHint");
        return C2667a.m10283a(new bu(this, i));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U extends Collection<? super T>> C3960g<U> toList(Callable<U> callable) {
        C15684a.a(callable, "collectionSupplier is null");
        return C2667a.m10283a(new bu(this, callable));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> C3960g<Map<K, T>> toMap(Function<? super T, ? extends K> function) {
        C15684a.a(function, "keySelector is null");
        return collect(HashMapSupplier.asCallable(), Functions.a(function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> C3960g<Map<K, V>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        C15684a.a(function, "keySelector is null");
        C15684a.a(function2, "valueSelector is null");
        return collect(HashMapSupplier.asCallable(), Functions.a(function, function2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> C3960g<Map<K, V>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Callable<? extends Map<K, V>> callable) {
        C15684a.a(function, "keySelector is null");
        C15684a.a(function2, "valueSelector is null");
        C15684a.a(callable, "mapSupplier is null");
        return collect(callable, Functions.a(function, function2));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K> C3960g<Map<K, Collection<T>>> toMultimap(Function<? super T, ? extends K> function) {
        return toMultimap(function, Functions.a(), HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> C3960g<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return toMultimap(function, function2, HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> C3960g<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Callable<? extends Map<K, Collection<V>>> callable, Function<? super K, ? extends Collection<? super V>> function3) {
        C15684a.a(function, "keySelector is null");
        C15684a.a(function2, "valueSelector is null");
        C15684a.a(callable, "mapSupplier is null");
        C15684a.a(function3, "collectionFactory is null");
        return collect(callable, Functions.a(function, function2, function3));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <K, V> C3960g<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(function, function2, callable, ArrayListSupplier.asFunction());
    }

    @CheckReturnValue
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @SchedulerSupport("none")
    public final C3957b<T> toFlowable(BackpressureStrategy backpressureStrategy) {
        C3957b<T> c18374l = new C18374l(this);
        switch (e$1.f48533a[backpressureStrategy.ordinal()]) {
            case 1:
                return c18374l.m15396i();
            case 2:
                return c18374l.m15398j();
            case 3:
                return c18374l;
            case 4:
                return C2667a.m10276a(new FlowableOnBackpressureError(c18374l));
            default:
                return c18374l.m15394h();
        }
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<List<T>> toSortedList() {
        return toSortedList(Functions.f());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<List<T>> toSortedList(Comparator<? super T> comparator) {
        C15684a.a(comparator, "comparator is null");
        return toList().m15478e(Functions.a(comparator));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<List<T>> toSortedList(Comparator<? super T> comparator, int i) {
        C15684a.a(comparator, "comparator is null");
        return toList(i).m15478e(Functions.a(comparator));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3960g<List<T>> toSortedList(int i) {
        return toSortedList(Functions.f(), i);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<T> unsubscribeOn(C15679f c15679f) {
        C15684a.a(c15679f, "scheduler is null");
        return C2667a.m10279a(new ObservableUnsubscribeOn(this, c15679f));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<C3959e<T>> window(long j) {
        return window(j, j, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<C3959e<T>> window(long j, long j2) {
        return window(j, j2, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final C3959e<C3959e<T>> window(long j, long j2, int i) {
        C15684a.a(j, ManagerWebServices.FB_PARAM_FIELD_COUNT);
        C15684a.a(j2, "skip");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new ObservableWindow(this, j, j2, i));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<C3959e<T>> window(long j, long j2, TimeUnit timeUnit) {
        return window(j, j2, timeUnit, C15756a.a(), C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<C3959e<T>> window(long j, long j2, TimeUnit timeUnit, C15679f c15679f) {
        return window(j, j2, timeUnit, c15679f, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<C3959e<T>> window(long j, long j2, TimeUnit timeUnit, C15679f c15679f, int i) {
        long j3 = j;
        C15684a.a(j3, "timespan");
        long j4 = j2;
        C15684a.a(j4, "timeskip");
        int i2 = i;
        C15684a.a(i2, "bufferSize");
        C15679f c15679f2 = c15679f;
        C15684a.a(c15679f2, "scheduler is null");
        TimeUnit timeUnit2 = timeUnit;
        C15684a.a(timeUnit2, "unit is null");
        return C2667a.m10279a(new by(this, j3, j4, timeUnit2, c15679f2, Format.OFFSET_SAMPLE_RELATIVE, i2, false));
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<C3959e<T>> window(long j, TimeUnit timeUnit) {
        return window(j, timeUnit, C15756a.a(), (long) Format.OFFSET_SAMPLE_RELATIVE, false);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<C3959e<T>> window(long j, TimeUnit timeUnit, long j2) {
        return window(j, timeUnit, C15756a.a(), j2, false);
    }

    @CheckReturnValue
    @SchedulerSupport("io.reactivex:computation")
    public final C3959e<C3959e<T>> window(long j, TimeUnit timeUnit, long j2, boolean z) {
        return window(j, timeUnit, C15756a.a(), j2, z);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<C3959e<T>> window(long j, TimeUnit timeUnit, C15679f c15679f) {
        return window(j, timeUnit, c15679f, (long) Format.OFFSET_SAMPLE_RELATIVE, false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<C3959e<T>> window(long j, TimeUnit timeUnit, C15679f c15679f, long j2) {
        return window(j, timeUnit, c15679f, j2, false);
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<C3959e<T>> window(long j, TimeUnit timeUnit, C15679f c15679f, long j2, boolean z) {
        return window(j, timeUnit, c15679f, j2, z, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("custom")
    public final C3959e<C3959e<T>> window(long j, TimeUnit timeUnit, C15679f c15679f, long j2, boolean z, int i) {
        int i2 = i;
        C15684a.a(i2, "bufferSize");
        C15679f c15679f2 = c15679f;
        C15684a.a(c15679f2, "scheduler is null");
        TimeUnit timeUnit2 = timeUnit;
        C15684a.a(timeUnit2, "unit is null");
        long j3 = j2;
        C15684a.a(j3, ManagerWebServices.FB_PARAM_FIELD_COUNT);
        return C2667a.m10279a(new by(this, j, j, timeUnit2, c15679f2, j3, i2, z));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B> C3959e<C3959e<T>> window(ObservableSource<B> observableSource) {
        return window((ObservableSource) observableSource, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B> C3959e<C3959e<T>> window(ObservableSource<B> observableSource, int i) {
        C15684a.a(observableSource, "boundary is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new bv(this, observableSource, i));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, V> C3959e<C3959e<T>> window(ObservableSource<U> observableSource, Function<? super U, ? extends ObservableSource<V>> function) {
        return window((ObservableSource) observableSource, (Function) function, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, V> C3959e<C3959e<T>> window(ObservableSource<U> observableSource, Function<? super U, ? extends ObservableSource<V>> function, int i) {
        C15684a.a(observableSource, "openingIndicator is null");
        C15684a.a(function, "closingIndicator is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new bw(this, observableSource, function, i));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B> C3959e<C3959e<T>> window(Callable<? extends ObservableSource<B>> callable) {
        return window((Callable) callable, C3959e.bufferSize());
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <B> C3959e<C3959e<T>> window(Callable<? extends ObservableSource<B>> callable, int i) {
        C15684a.a(callable, "boundary is null");
        C15684a.a(i, "bufferSize");
        return C2667a.m10279a(new bx(this, callable, i));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> C3959e<R> withLatestFrom(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        C15684a.a(observableSource, "other is null");
        C15684a.a(biFunction, "combiner is null");
        return C2667a.m10279a(new ObservableWithLatestFrom(this, biFunction, observableSource));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <T1, T2, R> C3959e<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, Function3<? super T, ? super T1, ? super T2, R> function3) {
        C15684a.a(observableSource, "o1 is null");
        C15684a.a(observableSource2, "o2 is null");
        C15684a.a(function3, "combiner is null");
        return withLatestFrom(new ObservableSource[]{observableSource, observableSource2}, Functions.a(function3));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <T1, T2, T3, R> C3959e<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, Function4<? super T, ? super T1, ? super T2, ? super T3, R> function4) {
        C15684a.a(observableSource, "o1 is null");
        C15684a.a(observableSource2, "o2 is null");
        C15684a.a(observableSource3, "o3 is null");
        C15684a.a(function4, "combiner is null");
        return withLatestFrom(new ObservableSource[]{observableSource, observableSource2, observableSource3}, Functions.a(function4));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, R> C3959e<R> withLatestFrom(ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, ObservableSource<T4> observableSource4, Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> function5) {
        C15684a.a(observableSource, "o1 is null");
        C15684a.a(observableSource2, "o2 is null");
        C15684a.a(observableSource3, "o3 is null");
        C15684a.a(observableSource4, "o4 is null");
        C15684a.a(function5, "combiner is null");
        return withLatestFrom(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4}, Functions.a(function5));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> withLatestFrom(ObservableSource<?>[] observableSourceArr, Function<? super Object[], R> function) {
        C15684a.a(observableSourceArr, "others is null");
        C15684a.a(function, "combiner is null");
        return C2667a.m10279a(new ObservableWithLatestFromMany(this, observableSourceArr, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <R> C3959e<R> withLatestFrom(Iterable<? extends ObservableSource<?>> iterable, Function<? super Object[], R> function) {
        C15684a.a(iterable, "others is null");
        C15684a.a(function, "combiner is null");
        return C2667a.m10279a(new ObservableWithLatestFromMany(this, iterable, function));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> C3959e<R> zipWith(Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        C15684a.a(iterable, "other is null");
        C15684a.a(biFunction, "zipper is null");
        return C2667a.m10279a(new bz(this, iterable, biFunction));
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> C3959e<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        C15684a.a(observableSource, "other is null");
        return C3959e.zip(this, observableSource, biFunction);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> C3959e<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z) {
        return C3959e.zip((ObservableSource) this, (ObservableSource) observableSource, (BiFunction) biFunction, z);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final <U, R> C3959e<R> zipWith(ObservableSource<? extends U> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z, int i) {
        return C3959e.zip((ObservableSource) this, (ObservableSource) observableSource, (BiFunction) biFunction, z, i);
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final TestObserver<T> test() {
        Observer testObserver = new TestObserver();
        subscribe(testObserver);
        return testObserver;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    public final TestObserver<T> test(boolean z) {
        Observer testObserver = new TestObserver();
        if (z) {
            testObserver.dispose();
        }
        subscribe(testObserver);
        return testObserver;
    }
}
