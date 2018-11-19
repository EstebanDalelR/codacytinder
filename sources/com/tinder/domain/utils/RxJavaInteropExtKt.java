package com.tinder.domain.utils;

import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Observable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a$\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\n\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u000b\u001a\n\u0010\f\u001a\u00020\r*\u00020\u0001\u001a\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000f\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u0004\u001a\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0011\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u0004\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0013\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\n¨\u0006\u0014"}, d2 = {"toV1Completable", "Lrx/Completable;", "Lio/reactivex/CompletableSource;", "toV1Observable", "Lrx/Observable;", "T", "Lio/reactivex/ObservableSource;", "strategy", "Lio/reactivex/BackpressureStrategy;", "toV1Single", "Lrx/Single;", "Lio/reactivex/SingleSource;", "toV2Completable", "Lio/reactivex/Completable;", "toV2Flowable", "Lio/reactivex/Flowable;", "toV2Observable", "Lio/reactivex/Observable;", "toV2Single", "Lio/reactivex/Single;", "domain_release"}, k = 2, mv = {1, 1, 10})
public final class RxJavaInteropExtKt {
    @NotNull
    public static final <T> Observable<T> toV1Observable(@NotNull ObservableSource<T> observableSource, @NotNull BackpressureStrategy backpressureStrategy) {
        C2668g.b(observableSource, "$receiver");
        C2668g.b(backpressureStrategy, "strategy");
        observableSource = C15551e.a(observableSource, backpressureStrategy);
        C2668g.a(observableSource, "RxJavaInterop.toV1Observable(this, strategy)");
        return observableSource;
    }

    @NotNull
    public static final <T> Single<T> toV1Single(@NotNull SingleSource<T> singleSource) {
        C2668g.b(singleSource, "$receiver");
        singleSource = C15551e.a(singleSource);
        C2668g.a(singleSource, "RxJavaInterop.toV1Single(this)");
        return singleSource;
    }

    @NotNull
    public static final Completable toV1Completable(@NotNull CompletableSource completableSource) {
        C2668g.b(completableSource, "$receiver");
        completableSource = C15551e.a(completableSource);
        C2668g.a(completableSource, "RxJavaInterop.toV1Completable(this)");
        return completableSource;
    }

    @NotNull
    public static final <T> C3959e<T> toV2Observable(@NotNull Observable<T> observable) {
        C2668g.b(observable, "$receiver");
        observable = C15551e.b(observable);
        C2668g.a(observable, "RxJavaInterop.toV2Observable(this)");
        return observable;
    }

    @NotNull
    public static final <T> C3957b<T> toV2Flowable(@NotNull Observable<T> observable) {
        C2668g.b(observable, "$receiver");
        observable = C15551e.a(observable);
        C2668g.a(observable, "RxJavaInterop.toV2Flowable(this)");
        return observable;
    }

    @NotNull
    public static final <T> C3960g<T> toV2Single(@NotNull Single<T> single) {
        C2668g.b(single, "$receiver");
        single = C15551e.a(single);
        C2668g.a(single, "RxJavaInterop.toV2Single(this)");
        return single;
    }

    @NotNull
    public static final C3956a toV2Completable(@NotNull Completable completable) {
        C2668g.b(completable, "$receiver");
        completable = C15551e.a(completable);
        C2668g.a(completable, "RxJavaInterop.toV2Completable(this)");
        return completable;
    }
}
