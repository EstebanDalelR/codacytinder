package com.tinder.data.fastmatch;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApi;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.api.response.v2.FastMatchNewCountResponse;
import com.tinder.data.fastmatch.p324a.C10767b;
import com.tinder.domain.fastmatch.model.FastMatchConfig;
import com.tinder.domain.fastmatch.model.FastMatchNewCount;
import com.tinder.domain.fastmatch.model.PollingMode;
import com.tinder.domain.fastmatch.newCount.NewCountFetcher;
import com.tinder.domain.fastmatch.newCount.NewCountFetcher.State;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Single;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R2\u0010\u000b\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/data/fastmatch/DefaultNewCountFetcher;", "Lcom/tinder/domain/fastmatch/newCount/NewCountFetcher;", "api", "Lcom/tinder/api/TinderApi;", "adapter", "Lcom/tinder/data/fastmatch/adapter/FastMatchNewCountAdapter;", "configProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/fastmatch/adapter/FastMatchNewCountAdapter;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;)V", "count", "", "stateSubject", "Lrx/subjects/BehaviorSubject;", "Lcom/tinder/domain/fastmatch/newCount/NewCountFetcher$State;", "kotlin.jvm.PlatformType", "token", "", "fetchCount", "Lrx/Single;", "initFetch", "", "observeState", "Lrx/Observable;", "rescheduleState", "resetState", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.fastmatch.a */
public final class C10768a implements NewCountFetcher {
    /* renamed from: a */
    private int f35165a;
    /* renamed from: b */
    private String f35166b;
    /* renamed from: c */
    private final C19785a<State> f35167c = C19785a.f(State.UNINITIALIZED);
    /* renamed from: d */
    private final TinderApi f35168d;
    /* renamed from: e */
    private final C10767b f35169e;
    /* renamed from: f */
    private final FastMatchConfigProvider f35170f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lrx/Single;", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.fastmatch.a$a */
    static final class C8648a<V> implements Callable<Single<T>> {
        /* renamed from: a */
        final /* synthetic */ C10768a f30497a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.fastmatch.a$a$4 */
        static final class C128634<T, R> implements Func1<T, R> {
            /* renamed from: a */
            public static final C128634 f41311a = new C128634();

            C128634() {
            }

            /* renamed from: a */
            public final int m50499a(Pair<Integer, String> pair) {
                return ((Number) pair.c()).intValue();
            }

            public /* synthetic */ Object call(Object obj) {
                return Integer.valueOf(m50499a((Pair) obj));
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.fastmatch.a$a$5 */
        static final class C138015<T> implements Action1<Throwable> {
            /* renamed from: a */
            public static final C138015 f43808a = new C138015();

            C138015() {
            }

            public /* synthetic */ void call(Object obj) {
                m53373a((Throwable) obj);
            }

            /* renamed from: a */
            public final void m53373a(Throwable th) {
                C0001a.c(th, "Error trying to fetch new fast match count", new Object[0]);
            }
        }

        C8648a(C10768a c10768a) {
            this.f30497a = c10768a;
        }

        public /* synthetic */ Object call() {
            return m36882a();
        }

        /* renamed from: a */
        public final Single<Integer> m36882a() {
            if (this.f30497a.f35166b == null) {
                return Single.a(Integer.valueOf(0));
            }
            final FastMatchConfig fastMatchConfig = this.f30497a.f35170f.get();
            return this.f30497a.f35168d.fetchNewFastMatchCount(this.f30497a.f35166b, fastMatchConfig.getPollingMode().getValue()).d(new Func1<T, R>() {
                public /* synthetic */ Object call(Object obj) {
                    return m50497a((DataResponse) obj);
                }

                @NotNull
                /* renamed from: a */
                public final FastMatchNewCount m50497a(DataResponse<FastMatchNewCountResponse> dataResponse) {
                    dataResponse = dataResponse.data();
                    if (dataResponse == null) {
                        throw new IllegalStateException("Received null data".toString());
                    }
                    return this.f30497a.f35169e.m43171a((FastMatchNewCountResponse) dataResponse);
                }
            }).d(new Func1<T, R>() {
                public /* synthetic */ Object call(Object obj) {
                    return m50498a((FastMatchNewCount) obj);
                }

                @NotNull
                /* renamed from: a */
                public final Pair<Integer, String> m50498a(FastMatchNewCount fastMatchNewCount) {
                    if (fastMatchConfig.getPollingMode() == PollingMode.ADDITIVE) {
                        return C15811g.a(Integer.valueOf(this.f30497a.f35165a + fastMatchNewCount.getCount()), fastMatchNewCount.getNewCountToken());
                    }
                    return C15811g.a(Integer.valueOf(fastMatchNewCount.getCount()), this.f30497a.f35166b);
                }
            }).d(new Action1<Pair<? extends Integer, ? extends String>>() {
                public /* synthetic */ void call(Object obj) {
                    m53372a((Pair) obj);
                }

                /* renamed from: a */
                public final void m53372a(Pair<Integer, String> pair) {
                    int intValue = ((Number) pair.c()).intValue();
                    this.f30497a.f35166b = (String) pair.d();
                    this.f30497a.f35165a = intValue;
                }
            }).d(C128634.f41311a).c(C138015.f43808a);
        }
    }

    @Inject
    public C10768a(@NotNull TinderApi tinderApi, @NotNull C10767b c10767b, @NotNull FastMatchConfigProvider fastMatchConfigProvider) {
        C2668g.b(tinderApi, "api");
        C2668g.b(c10767b, "adapter");
        C2668g.b(fastMatchConfigProvider, "configProvider");
        this.f35168d = tinderApi;
        this.f35169e = c10767b;
        this.f35170f = fastMatchConfigProvider;
    }

    public void initFetch(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
        this.f35166b = str;
        this.f35165a = null;
        this.f35167c.onNext(State.INITIALIZED);
    }

    @NotNull
    public Single<Integer> fetchCount() {
        Single<Integer> b = Single.b(new C8648a(this));
        C2668g.a(b, "Single.defer {\n         …              }\n        }");
        return b;
    }

    public void resetState() {
        this.f35167c.onNext(State.UNINITIALIZED);
    }

    public void rescheduleState() {
        this.f35167c.onNext(State.RESCHEDULED);
    }

    @NotNull
    public Observable<State> observeState() {
        Observable<State> e = this.f35167c.e();
        C2668g.a(e, "stateSubject.asObservable()");
        return e;
    }
}
