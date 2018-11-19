package com.tinder.data.toppicks;

import com.tinder.api.TinderApi;
import com.tinder.api.model.toppicks.TopPicksRecResponse;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.data.recs.C8786k;
import com.tinder.data.recs.C8786k.C10994b;
import com.tinder.data.recs.C8786k.C10996d;
import com.tinder.domain.injection.qualifiers.UtcOffsetMins;
import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecSource;
import com.tinder.domain.recs.model.RecSource.TopPicks;
import com.tinder.domain.toppicks.TopPicksDiscoveryNotificationDispatcher;
import com.tinder.domain.toppicks.TopPicksLoadingStatus;
import com.tinder.domain.toppicks.TopPicksLoadingStatusNotifier;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.recs.domain.model.CustomRecEngineResetReason.DiscoverySettingsUpdate;
import com.tinder.recs.domain.model.CustomRecEngineResetReason.PassportLocationUpdate;
import com.tinder.util.ConnectivityProvider;
import com.tinder.util.ConnectivityProvider.NoInternetConnectionException;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.C15756a;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001/B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\"H\u0016J\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c0$J\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cJ\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180)J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020 H\u0017J\u0006\u0010,\u001a\u00020+J\u0018\u0010-\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010.\u001a\u00020+2\u0006\u0010\u001b\u001a\u00020\u0018H\u0003R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/tinder/data/toppicks/TopPicksApiClient;", "Lcom/tinder/domain/recs/RecsApiClient;", "tinderApi", "Lcom/tinder/api/TinderApi;", "topPickResponseDomainApiAdapter", "Lcom/tinder/data/toppicks/TopPickResponseDomainApiAdapter;", "utcOffsetMins", "Lkotlin/Function0;", "", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "topPicksLoadingStatusNotifier", "Lcom/tinder/domain/toppicks/TopPicksLoadingStatusNotifier;", "topPicksDiscoveryNotificationDispatcher", "Lcom/tinder/domain/toppicks/TopPicksDiscoveryNotificationDispatcher;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/toppicks/TopPickResponseDomainApiAdapter;Lkotlin/jvm/functions/Function0;Lcom/tinder/util/ConnectivityProvider;Lcom/tinder/domain/toppicks/TopPicksLoadingStatusNotifier;Lcom/tinder/domain/toppicks/TopPicksDiscoveryNotificationDispatcher;)V", "recSource", "Lcom/tinder/domain/recs/model/RecSource;", "getRecSource", "()Lcom/tinder/domain/recs/model/RecSource;", "state", "Lcom/tinder/data/toppicks/TopPicksApiClient$State;", "topPicksResponseSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/tinder/api/model/toppicks/TopPicksRecResponse;", "createRecsFetchResults", "Lcom/tinder/data/recs/RecsFetchResults;", "response", "Lcom/tinder/api/response/v2/DataResponse;", "isRediscover", "", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "loadRecs", "Lrx/Single;", "loadTeasers", "Lio/reactivex/Single;", "mapResponseToRecs", "", "Lcom/tinder/domain/recs/model/Rec;", "observeApiResponse", "Lio/reactivex/Flowable;", "reset", "", "resetEndTopPicksState", "showDiscoveryNotification", "updateState", "State", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.j */
public final class C11016j implements RecsApiClient {
    /* renamed from: a */
    private final PublishSubject<TopPicksRecResponse> f35753a;
    /* renamed from: b */
    private C8796a f35754b = new C8796a(false, null, false, 7, null);
    @NotNull
    /* renamed from: c */
    private final RecSource f35755c = ((RecSource) TopPicks.INSTANCE);
    /* renamed from: d */
    private final TinderApi f35756d;
    /* renamed from: e */
    private final C8795i f35757e;
    /* renamed from: f */
    private final Function0<Integer> f35758f;
    /* renamed from: g */
    private final ConnectivityProvider f35759g;
    /* renamed from: h */
    private final TopPicksLoadingStatusNotifier f35760h;
    /* renamed from: i */
    private final TopPicksDiscoveryNotificationDispatcher f35761i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/data/toppicks/TopPicksApiClient$State;", "", "hasMoreRecs", "", "nextPageToken", "", "isRediscover", "(ZLjava/lang/String;Z)V", "getHasMoreRecs", "()Z", "getNextPageToken", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.j$a */
    private static final class C8796a {
        /* renamed from: a */
        private final boolean f30870a;
        @Nullable
        /* renamed from: b */
        private final String f30871b;
        /* renamed from: c */
        private final boolean f30872c;

        public C8796a() {
            this(false, null, false, 7, null);
        }

        @NotNull
        /* renamed from: a */
        public static /* synthetic */ C8796a m37431a(C8796a c8796a, boolean z, String str, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = c8796a.f30870a;
            }
            if ((i & 2) != 0) {
                str = c8796a.f30871b;
            }
            if ((i & 4) != 0) {
                z2 = c8796a.f30872c;
            }
            return c8796a.m37432a(z, str, z2);
        }

        @NotNull
        /* renamed from: a */
        public final C8796a m37432a(boolean z, @Nullable String str, boolean z2) {
            return new C8796a(z, str, z2);
        }

        /* renamed from: d */
        public final boolean m37436d() {
            return this.f30870a;
        }

        @Nullable
        /* renamed from: e */
        public final String m37437e() {
            return this.f30871b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8796a) {
                C8796a c8796a = (C8796a) obj;
                if ((this.f30870a == c8796a.f30870a ? 1 : null) != null && C2668g.a(this.f30871b, c8796a.f30871b)) {
                    if ((this.f30872c == c8796a.f30872c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: f */
        public final boolean m37438f() {
            return this.f30872c;
        }

        public int hashCode() {
            int i = this.f30870a;
            int i2 = 1;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            String str = this.f30871b;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.f30872c;
            if (!z) {
                i2 = z;
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("State(hasMoreRecs=");
            stringBuilder.append(this.f30870a);
            stringBuilder.append(", nextPageToken=");
            stringBuilder.append(this.f30871b);
            stringBuilder.append(", isRediscover=");
            stringBuilder.append(this.f30872c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8796a(boolean z, @Nullable String str, boolean z2) {
            this.f30870a = z;
            this.f30871b = str;
            this.f30872c = z2;
        }

        /* renamed from: a */
        public final boolean m37433a() {
            return this.f30870a;
        }

        public /* synthetic */ C8796a(boolean z, String str, boolean z2, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                z = true;
            }
            if ((i & 2) != null) {
                str = null;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            this(z, str, z2);
        }

        @Nullable
        /* renamed from: b */
        public final String m37434b() {
            return this.f30871b;
        }

        /* renamed from: c */
        public final boolean m37435c() {
            return this.f30872c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/data/recs/RecsFetchResults;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.j$b */
    static final class C8797b<V> implements Callable<SingleSource<? extends T>> {
        /* renamed from: a */
        final /* synthetic */ C11016j f30873a;

        C8797b(C11016j c11016j) {
            this.f30873a = c11016j;
        }

        public /* synthetic */ Object call() {
            return m37439a();
        }

        /* renamed from: a */
        public final C3960g<? extends C8786k> m37439a() {
            C8796a a = this.f30873a.f35754b;
            boolean d = a.m37436d();
            final String e = a.m37437e();
            final boolean f = a.m37438f();
            if (d) {
                return this.f30873a.f35756d.fetchTopPicksRecs(((Number) this.f30873a.f35758f.invoke()).intValue(), e, Boolean.valueOf(f)).a(new Consumer<Disposable>() {
                    public /* synthetic */ void accept(Object obj) {
                        m43657a((Disposable) obj);
                    }

                    /* renamed from: a */
                    public final void m43657a(Disposable disposable) {
                        if (e == null) {
                            this.f30873a.f35760h.update(TopPicksLoadingStatus.LOADING_FIRST_TIME);
                        } else {
                            this.f30873a.f35760h.update(TopPicksLoadingStatus.LOADING_PAGINATED);
                        }
                    }
                }).c(new Consumer<Throwable>() {
                    public /* synthetic */ void accept(Object obj) {
                        m43658a((Throwable) obj);
                    }

                    /* renamed from: a */
                    public final void m43658a(Throwable th) {
                        if (e == null) {
                            this.f30873a.f35760h.update(TopPicksLoadingStatus.ERROR);
                        } else {
                            this.f30873a.f35760h.update(TopPicksLoadingStatus.ERROR_PAGINATED);
                        }
                        C0001a.c(th, "Error fetching top picks recs.", new Object[0]);
                    }
                }).b(new Consumer<DataResponse<TopPicksRecResponse>>() {
                    public /* synthetic */ void accept(Object obj) {
                        m43659a((DataResponse) obj);
                    }

                    /* renamed from: a */
                    public final void m43659a(DataResponse<TopPicksRecResponse> dataResponse) {
                        TopPicksRecResponse topPicksRecResponse = (TopPicksRecResponse) dataResponse.data();
                        if (topPicksRecResponse == null) {
                            return;
                        }
                        if (new DateTime(topPicksRecResponse.getTopPicksRefreshTime()).i()) {
                            this.f30873a.f35760h.update(TopPicksLoadingStatus.ERROR);
                            return;
                        }
                        this.f30873a.f35753a.onNext(topPicksRecResponse);
                        C11016j c11016j = this.f30873a;
                        C2668g.a(topPicksRecResponse, "response");
                        c11016j.m43665a(topPicksRecResponse);
                        this.f30873a.m43666a(topPicksRecResponse, f);
                        this.f30873a.f35760h.update(TopPicksLoadingStatus.SUCCESS);
                        this.f30873a.f35754b = C8796a.m37431a(this.f30873a.f35754b, false, null, false, 3, null);
                    }
                }).e(new Function<T, R>() {
                    public /* synthetic */ Object apply(Object obj) {
                        return m43660a((DataResponse) obj);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8786k m43660a(@NotNull DataResponse<TopPicksRecResponse> dataResponse) {
                        C2668g.b(dataResponse, "it");
                        return this.f30873a.m43672b((DataResponse) dataResponse);
                    }
                });
            }
            return C3960g.a(new C10994b(null, 1, null));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.j$c */
    static final class C11013c<T> implements Consumer<Disposable> {
        /* renamed from: a */
        final /* synthetic */ C11016j f35750a;

        C11013c(C11016j c11016j) {
            this.f35750a = c11016j;
        }

        public /* synthetic */ void accept(Object obj) {
            m43661a((Disposable) obj);
        }

        /* renamed from: a */
        public final void m43661a(Disposable disposable) {
            if (this.f35750a.f35759g.a() == null) {
                throw ((Throwable) new NoInternetConnectionException());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.j$d */
    static final class C11014d implements Action {
        /* renamed from: a */
        public static final C11014d f35751a = new C11014d();

        C11014d() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.j$e */
    static final class C11015e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11015e f35752a = new C11015e();

        C11015e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m43662a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m43662a(Throwable th) {
            C0001a.c(th, "Error dispatching notification", new Object[0]);
        }
    }

    public C11016j(@NotNull TinderApi tinderApi, @NotNull C8795i c8795i, @NotNull @UtcOffsetMins Function0<Integer> function0, @NotNull ConnectivityProvider connectivityProvider, @NotNull TopPicksLoadingStatusNotifier topPicksLoadingStatusNotifier, @NotNull TopPicksDiscoveryNotificationDispatcher topPicksDiscoveryNotificationDispatcher) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c8795i, "topPickResponseDomainApiAdapter");
        C2668g.b(function0, "utcOffsetMins");
        C2668g.b(connectivityProvider, "connectivityProvider");
        C2668g.b(topPicksLoadingStatusNotifier, "topPicksLoadingStatusNotifier");
        C2668g.b(topPicksDiscoveryNotificationDispatcher, "topPicksDiscoveryNotificationDispatcher");
        this.f35756d = tinderApi;
        this.f35757e = c8795i;
        this.f35758f = function0;
        this.f35759g = connectivityProvider;
        this.f35760h = topPicksLoadingStatusNotifier;
        this.f35761i = topPicksDiscoveryNotificationDispatcher;
        tinderApi = PublishSubject.a();
        C2668g.a(tinderApi, "PublishSubject.create()");
        this.f35753a = tinderApi;
    }

    public /* synthetic */ Rec$Source getRecSource() {
        return m43677a();
    }

    @NotNull
    /* renamed from: a */
    public RecSource m43677a() {
        return this.f35755c;
    }

    @NotNull
    public Single<C8786k> loadRecs() {
        C3960g a = C3960g.a(new C8797b(this));
        C2668g.a(a, "Single.defer {\n         …}\n            }\n        }");
        return RxJavaInteropExtKt.toV1Single(a);
    }

    @NotNull
    /* renamed from: b */
    public final C3957b<TopPicksRecResponse> m43679b() {
        C3957b<TopPicksRecResponse> toFlowable = this.f35753a.toFlowable(BackpressureStrategy.LATEST);
        C2668g.a(toFlowable, "topPicksResponseSubject.…kpressureStrategy.LATEST)");
        return toFlowable;
    }

    @NotNull
    /* renamed from: c */
    public final C3960g<DataResponse<TopPicksRecResponse>> m43680c() {
        C3960g<DataResponse<TopPicksRecResponse>> a = this.f35756d.fetchTopPicksTeaser(((Number) this.f35758f.invoke()).intValue()).a(new C11013c(this));
        C2668g.a(a, "tinderApi.fetchTopPicksT…ption()\n                }");
        return a;
    }

    /* renamed from: a */
    private final synchronized void m43665a(TopPicksRecResponse topPicksRecResponse) {
        this.f35754b = C8796a.m37431a(this.f35754b, true ^ C2668g.a(topPicksRecResponse.isAtEnd(), Boolean.valueOf(true)), topPicksRecResponse.getNextPageToken(), false, 4, null);
    }

    public synchronized void reset(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "reason");
        this.f35754b = new C8796a(false, null, m43670a(resetReason), 3, null);
    }

    @NotNull
    /* renamed from: a */
    public final List<Rec> m43678a(@NotNull DataResponse<TopPicksRecResponse> dataResponse) {
        List recs;
        TopPicksRecResponse topPicksRecResponse;
        C2668g.b(dataResponse, "response");
        TopPicksRecResponse topPicksRecResponse2 = (TopPicksRecResponse) dataResponse.data();
        if (topPicksRecResponse2 != null) {
            recs = topPicksRecResponse2.getRecs();
            if (recs != null) {
                topPicksRecResponse = (TopPicksRecResponse) dataResponse.data();
                if (topPicksRecResponse != null) {
                    dataResponse = topPicksRecResponse.getTeasers();
                    if (dataResponse != null) {
                        return this.f35757e.m37430a(recs, dataResponse);
                    }
                }
                dataResponse = C19301m.a();
                return this.f35757e.m37430a(recs, dataResponse);
            }
        }
        recs = C19301m.a();
        topPicksRecResponse = (TopPicksRecResponse) dataResponse.data();
        if (topPicksRecResponse != null) {
            dataResponse = topPicksRecResponse.getTeasers();
            if (dataResponse != null) {
                return this.f35757e.m37430a(recs, dataResponse);
            }
        }
        dataResponse = C19301m.a();
        return this.f35757e.m37430a(recs, dataResponse);
    }

    /* renamed from: d */
    public final void m43681d() {
        if (!this.f35754b.m37433a()) {
            this.f35754b = C8796a.m37431a(this.f35754b, true, this.f35754b.m37434b(), false, 4, null);
        }
    }

    /* renamed from: b */
    private final C8786k m43672b(DataResponse<TopPicksRecResponse> dataResponse) {
        TopPicksRecResponse topPicksRecResponse = (TopPicksRecResponse) dataResponse.data();
        Object isAtEnd = topPicksRecResponse != null ? topPicksRecResponse.isAtEnd() : null;
        dataResponse = m43678a((DataResponse) dataResponse);
        if (C2668g.a(isAtEnd, Boolean.valueOf(false))) {
            return new C10996d(dataResponse);
        }
        return new C10994b(dataResponse);
    }

    /* renamed from: a */
    private final void m43666a(TopPicksRecResponse topPicksRecResponse, boolean z) {
        Boolean hasPurchasableTopPicks = topPicksRecResponse.getHasPurchasableTopPicks();
        if (!(hasPurchasableTopPicks != null ? hasPurchasableTopPicks.booleanValue() : false) && z) {
            topPicksRecResponse = topPicksRecResponse.getTopPicksRefreshTime();
            if (topPicksRecResponse != null) {
                this.f35761i.dispatch(new DateTime(((Number) topPicksRecResponse).longValue())).b(C15756a.b()).a((Action) C11014d.f35751a, C11015e.f35752a);
            }
        }
    }

    /* renamed from: a */
    private final boolean m43670a(ResetReason resetReason) {
        if (!C2668g.a(resetReason, DiscoverySettingsUpdate.INSTANCE)) {
            if (C2668g.a(resetReason, PassportLocationUpdate.INSTANCE) == null) {
                return this.f35754b.m37435c();
            }
        }
        return true;
    }
}
