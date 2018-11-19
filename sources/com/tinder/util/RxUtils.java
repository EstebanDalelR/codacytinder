package com.tinder.util;

import com.tinder.util.ConnectivityProvider.NoInternetConnectionException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Observable$Transformer;
import rx.Single;
import rx.Single$Transformer;
import rx.Subscription;
import rx.functions.Func1;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000e\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J,\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000e\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\u001a"}, d2 = {"Lcom/tinder/util/RxUtils;", "", "()V", "applySchedulers", "Lcom/tinder/util/RxUtils$SchedulersTransformer;", "T", "schedulerSubscribedOn", "Lrx/Scheduler;", "schedulerObservedOn", "isSubscribed", "", "subscription", "Lrx/Subscription;", "retryOnError", "Lcom/tinder/util/RxUtils$RetryOnErrorTransformer;", "retryMaxCount", "", "intervalMs", "", "retryListener", "Lcom/tinder/util/RxUtils$RetryListener;", "unsubscribe", "", "RetryListener", "RetryOnErrorTransformer", "SchedulersTransformer", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class RxUtils {
    /* renamed from: a */
    public static final RxUtils f47590a = new RxUtils();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/util/RxUtils$RetryListener;", "", "onRetry", "", "retryCount", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    public interface RetryListener {
        void onRetry(int i);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0015B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u001e\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000bH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0001\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/util/RxUtils$RetryOnErrorTransformer;", "T", "Lrx/Observable$Transformer;", "retryMaxCount", "", "intervalMs", "", "retryListener", "Lcom/tinder/util/RxUtils$RetryListener;", "(IJLcom/tinder/util/RxUtils$RetryListener;)V", "call", "Lrx/Observable;", "observable", "createRetryNotification", "errorObservable", "", "forCompletable", "Lrx/Completable$Transformer;", "forSingle", "Lrx/Single$Transformer;", "R", "Companion", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.util.RxUtils$a */
    public static final class C18989a<T> implements Observable$Transformer<T, T> {
        /* renamed from: a */
        public static final C15348a f58731a = new C15348a();
        /* renamed from: b */
        private final int f58732b;
        /* renamed from: c */
        private final long f58733c;
        /* renamed from: d */
        private final RetryListener f58734d;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/util/RxUtils$RetryOnErrorTransformer$Companion;", "", "()V", "create", "Lcom/tinder/util/RxUtils$RetryOnErrorTransformer;", "T", "retryMaxCount", "", "intervalMs", "", "retryListener", "Lcom/tinder/util/RxUtils$RetryListener;", "engine_release"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.util.RxUtils$a$a */
        public static final class C15348a {
            private C15348a() {
            }

            @NotNull
            /* renamed from: a */
            public final <T> C18989a<T> m57561a(int i, long j, @Nullable RetryListener retryListener) {
                return new C18989a(i, j, retryListener);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022.\u0010\u0003\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Observable;", "T", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.util.RxUtils$a$b */
        static final class C18280b<T, R> implements Func1<Observable<? extends Throwable>, Observable<?>> {
            /* renamed from: a */
            final /* synthetic */ C18989a f56616a;

            C18280b(C18989a c18989a) {
                this.f56616a = c18989a;
            }

            public /* synthetic */ Object call(Object obj) {
                return m66216a((Observable) obj);
            }

            @Nullable
            /* renamed from: a */
            public final Observable<?> m66216a(Observable<? extends Throwable> observable) {
                C18989a c18989a = this.f56616a;
                C2668g.a(observable, "it");
                return c18989a.m67504b((Observable) observable);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00042\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "T", "currentRetry", "", "call", "(Ljava/lang/Integer;)Lrx/Observable;"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.util.RxUtils$a$c */
        static final class C18281c<T, R> implements Func1<T, Observable<? extends R>> {
            /* renamed from: a */
            final /* synthetic */ C18989a f56617a;

            C18281c(C18989a c18989a) {
                this.f56617a = c18989a;
            }

            public /* synthetic */ Object call(Object obj) {
                return m66217a((Integer) obj);
            }

            /* renamed from: a */
            public final Observable<Long> m66217a(Integer num) {
                return Observable.b(this.f56617a.f58733c, TimeUnit.MILLISECONDS);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\u000e\u0010\u0006\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "T", "throwable", "", "i", "call", "(Ljava/lang/Throwable;Ljava/lang/Integer;)Ljava/lang/Integer;"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.util.RxUtils$a$d */
        static final class C18282d<T1, T2, R> implements Func2<T, T2, R> {
            /* renamed from: a */
            final /* synthetic */ C18989a f56618a;

            C18282d(C18989a c18989a) {
                this.f56618a = c18989a;
            }

            public /* synthetic */ Object call(Object obj, Object obj2) {
                return m66218a((Throwable) obj, (Integer) obj2);
            }

            /* renamed from: a */
            public final Integer m66218a(Throwable th, Integer num) {
                boolean z = th instanceof NoInternetConnectionException;
                if (C2668g.a(num.intValue(), this.f56618a.f58732b) <= 0) {
                    if (!z) {
                        th = this.f56618a.f58734d;
                        if (th != null) {
                            if (num == null) {
                                C2668g.a();
                            }
                            th.onRetry(num.intValue());
                        }
                        return num;
                    }
                }
                num = (RuntimeException) ((th instanceof RuntimeException) == null ? null : th);
                if (num == null) {
                    num = new RuntimeException(th);
                }
                throw ((Throwable) num);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00042*\u0010\u0005\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "R", "kotlin.jvm.PlatformType", "T", "single", "call"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.util.RxUtils$a$e */
        static final class C18988e<T, R> implements Single$Transformer<R, R> {
            /* renamed from: a */
            final /* synthetic */ C18989a f58730a;

            C18988e(C18989a c18989a) {
                this.f58730a = c18989a;
            }

            public /* synthetic */ Object call(Object obj) {
                return m67500a((Single) obj);
            }

            /* renamed from: a */
            public final Single<R> m67500a(Single<R> single) {
                return this.f58730a.f58732b <= 0 ? single : single.g(new Func1<Observable<? extends Throwable>, Observable<?>>() {
                    public /* synthetic */ Object call(Object obj) {
                        return m66219a((Observable) obj);
                    }

                    @Nullable
                    /* renamed from: a */
                    public final Observable<?> m66219a(Observable<? extends Throwable> observable) {
                        C18989a c18989a = this.f58730a;
                        C2668g.a(observable, "it");
                        return c18989a.m67504b((Observable) observable);
                    }
                });
            }
        }

        private C18989a(int i, long j, RetryListener retryListener) {
            this.f58732b = i;
            this.f58733c = j;
            this.f58734d = retryListener;
        }

        public /* synthetic */ Object call(Object obj) {
            return m67506a((Observable) obj);
        }

        @NotNull
        /* renamed from: a */
        public Observable<T> m67506a(@NotNull Observable<T> observable) {
            C2668g.b(observable, "observable");
            if (this.f58732b <= 0) {
                return observable;
            }
            observable = observable.o(new C18280b(this));
            C2668g.a(observable, "observable.retryWhen { c…teRetryNotification(it) }");
            return observable;
        }

        @NotNull
        /* renamed from: a */
        public final <R> Single$Transformer<R, R> m67507a() {
            return new C18988e(this);
        }

        /* renamed from: b */
        private final Observable<?> m67504b(Observable<? extends Throwable> observable) {
            observable = observable.b(Observable.a(1, this.f58732b + 1), new C18282d(this));
            return this.f58733c > 0 ? observable.h(new C18281c(this)) : observable;
        }
    }

    private RxUtils() {
    }

    /* renamed from: a */
    public final boolean m57564a(@Nullable Subscription subscription) {
        return (subscription == null || subscription.isUnsubscribed() != null) ? null : true;
    }

    /* renamed from: b */
    public final void m57565b(@Nullable Subscription subscription) {
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }

    @NotNull
    /* renamed from: a */
    public final <T> C18989a<T> m57562a(int i, long j) {
        return m57563a(i, j, null);
    }

    @NotNull
    /* renamed from: a */
    public final <T> C18989a<T> m57563a(int i, long j, @Nullable RetryListener retryListener) {
        return C18989a.f58731a.m57561a(i, j, retryListener);
    }
}
