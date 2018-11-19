package com.tinder.domain.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.C2671a;
import rx.Completable.Transformer;
import rx.Observable;
import rx.Observable$Transformer;
import rx.Single$Transformer;
import rx.Subscription;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000e\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J,\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000e\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\u001a"}, d2 = {"Lcom/tinder/domain/utils/RxUtils;", "", "()V", "applySchedulers", "Lcom/tinder/domain/utils/RxUtils$SchedulersTransformer;", "T", "schedulerSubscribedOn", "Lrx/Scheduler;", "schedulerObservedOn", "isSubscribed", "", "subscription", "Lrx/Subscription;", "retryOnError", "Lcom/tinder/domain/utils/RxUtils$RetryOnErrorTransformer;", "retryMaxCount", "", "intervalMs", "", "retryListener", "Lcom/tinder/domain/utils/RxUtils$RetryListener;", "unsubscribe", "", "RetryListener", "RetryOnErrorTransformer", "SchedulersTransformer", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class RxUtils {
    public static final RxUtils INSTANCE = new RxUtils();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/utils/RxUtils$RetryListener;", "", "onRetry", "", "retryCount", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public interface RetryListener {
        void onRetry(int i);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0015B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u001e\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000bH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0001\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/domain/utils/RxUtils$RetryOnErrorTransformer;", "T", "Lrx/Observable$Transformer;", "retryMaxCount", "", "intervalMs", "", "retryListener", "Lcom/tinder/domain/utils/RxUtils$RetryListener;", "(IJLcom/tinder/domain/utils/RxUtils$RetryListener;)V", "call", "Lrx/Observable;", "observable", "createRetryNotification", "errorObservable", "", "forCompletable", "Lrx/Completable$Transformer;", "forSingle", "Lrx/Single$Transformer;", "R", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class RetryOnErrorTransformer<T> implements Observable$Transformer<T, T> {
        public static final Companion Companion = new Companion();
        private final long intervalMs;
        private final RetryListener retryListener;
        private final int retryMaxCount;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/domain/utils/RxUtils$RetryOnErrorTransformer$Companion;", "", "()V", "create", "Lcom/tinder/domain/utils/RxUtils$RetryOnErrorTransformer;", "T", "retryMaxCount", "", "intervalMs", "", "retryListener", "Lcom/tinder/domain/utils/RxUtils$RetryListener;", "domain_release"}, k = 1, mv = {1, 1, 10})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final <T> RetryOnErrorTransformer<T> create(int i, long j, @Nullable RetryListener retryListener) {
                return new RetryOnErrorTransformer(i, j, retryListener);
            }
        }

        private RetryOnErrorTransformer(int i, long j, RetryListener retryListener) {
            this.retryMaxCount = i;
            this.intervalMs = j;
            this.retryListener = retryListener;
        }

        @NotNull
        public Observable<T> call(@NotNull Observable<T> observable) {
            C2668g.b(observable, "observable");
            observable = observable.o(new RxUtils$RetryOnErrorTransformer$call$1(this));
            C2668g.a(observable, "observable.retryWhen { t…teRetryNotification(it) }");
            return observable;
        }

        @NotNull
        public final <R> Single$Transformer<R, R> forSingle() {
            return new RxUtils$RetryOnErrorTransformer$forSingle$1(this);
        }

        @NotNull
        public final Transformer forCompletable() {
            return new RxUtils$RetryOnErrorTransformer$forCompletable$1(this);
        }

        private final Observable<?> createRetryNotification(Observable<? extends Throwable> observable) {
            observable = observable.b(Observable.a(1, this.retryMaxCount + 1), new C13165x9d60fb06(this));
            return this.intervalMs > 0 ? observable.h(new RxUtils$RetryOnErrorTransformer$createRetryNotification$1(this)) : observable;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000eB\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\rR\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/domain/utils/RxUtils$SchedulersTransformer;", "T", "Lrx/Observable$Transformer;", "mSchedulerSubscribedOn", "Lrx/Scheduler;", "mSchedulerObservedOn", "(Lrx/Scheduler;Lrx/Scheduler;)V", "call", "Lrx/Observable;", "observable", "forCompletable", "Lrx/Completable$Transformer;", "forSingle", "Lrx/Single$Transformer;", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class SchedulersTransformer<T> implements Observable$Transformer<T, T> {
        public static final Companion Companion = new Companion();
        private final C2671a mSchedulerObservedOn;
        private final C2671a mSchedulerSubscribedOn;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/domain/utils/RxUtils$SchedulersTransformer$Companion;", "", "()V", "create", "Lcom/tinder/domain/utils/RxUtils$SchedulersTransformer;", "T", "subscribeOn", "Lrx/Scheduler;", "observedOn", "domain_release"}, k = 1, mv = {1, 1, 10})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final <T> SchedulersTransformer<T> create(@NotNull C2671a c2671a, @NotNull C2671a c2671a2) {
                C2668g.b(c2671a, "subscribeOn");
                C2668g.b(c2671a2, "observedOn");
                return new SchedulersTransformer(c2671a, c2671a2);
            }
        }

        private SchedulersTransformer(C2671a c2671a, C2671a c2671a2) {
            this.mSchedulerSubscribedOn = c2671a;
            this.mSchedulerObservedOn = c2671a2;
        }

        @NotNull
        public Observable<T> call(@NotNull Observable<T> observable) {
            C2668g.b(observable, "observable");
            observable = observable.b(this.mSchedulerSubscribedOn).a(this.mSchedulerObservedOn);
            C2668g.a(observable, "observable.subscribeOn(m…eOn(mSchedulerObservedOn)");
            return observable;
        }

        @NotNull
        public final Single$Transformer<T, T> forSingle() {
            return new RxUtils$SchedulersTransformer$forSingle$1(this);
        }

        @NotNull
        public final Transformer forCompletable() {
            return new RxUtils$SchedulersTransformer$forCompletable$1(this);
        }
    }

    private RxUtils() {
    }

    @NotNull
    public final <T> SchedulersTransformer<T> applySchedulers(@NotNull C2671a c2671a, @NotNull C2671a c2671a2) {
        C2668g.b(c2671a, "schedulerSubscribedOn");
        C2668g.b(c2671a2, "schedulerObservedOn");
        return SchedulersTransformer.Companion.create(c2671a, c2671a2);
    }

    public final boolean isSubscribed(@Nullable Subscription subscription) {
        return (subscription == null || subscription.isUnsubscribed() != null) ? null : true;
    }

    public final void unsubscribe(@Nullable Subscription subscription) {
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }

    @NotNull
    public final <T> RetryOnErrorTransformer<T> retryOnError(int i, long j) {
        return retryOnError(i, j, null);
    }

    @NotNull
    public final <T> RetryOnErrorTransformer<T> retryOnError(int i, long j, @Nullable RetryListener retryListener) {
        return RetryOnErrorTransformer.Companion.create(i, j, retryListener);
    }
}
