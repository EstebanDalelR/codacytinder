package com.tinder.data.toppicks;

import com.tinder.api.model.toppicks.TopPicksRecResponse;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.data.recs.C8786k;
import com.tinder.data.toppicks.store.C8798a;
import com.tinder.data.toppicks.store.C8799c;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.toppicks.model.TopPickTeaser;
import com.tinder.domain.toppicks.model.TopPicksRefreshTime;
import com.tinder.domain.toppicks.model.TopPicksResponse;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.domain.toppicks.repo.TopPicksRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00180\u001fH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fH\u0016J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00180#H\u0016J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180#H\u0016J\b\u0010%\u001a\u00020\u0011H\u0016J\u0016\u0010&\u001a\u00020\u00132\f\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/tinder/data/toppicks/TopPicksDataRepository;", "Lcom/tinder/domain/toppicks/repo/TopPicksRepository;", "teasersDataStore", "Lcom/tinder/data/toppicks/store/TopPicksTeasersLocalDataStore;", "topPicksApiClient", "Lcom/tinder/data/toppicks/TopPicksApiClient;", "topPicksTeaserAdapterAdapter", "Lcom/tinder/data/toppicks/TeaserRecToTopPickTeaserAdapter;", "topPicksSharedPreferencesDataStore", "Lcom/tinder/data/toppicks/store/TopPicksSharedPreferencesDataStore;", "topPicksApplicationRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "(Lcom/tinder/data/toppicks/store/TopPicksTeasersLocalDataStore;Lcom/tinder/data/toppicks/TopPicksApiClient;Lcom/tinder/data/toppicks/TeaserRecToTopPickTeaserAdapter;Lcom/tinder/data/toppicks/store/TopPicksSharedPreferencesDataStore;Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;)V", "bypassTopPicksEnd", "", "cacheTopPicksCount", "count", "", "clearAllTeaserRecs", "Lio/reactivex/Completable;", "clearExpiredTeaserRecs", "getRecsFromApiResponse", "Lio/reactivex/SingleTransformer;", "Lcom/tinder/data/recs/RecsFetchResults;", "", "Lcom/tinder/domain/recs/model/Rec;", "mapApiResponseToDomainResponse", "Lcom/tinder/domain/toppicks/model/TopPicksResponse;", "apiResponse", "Lcom/tinder/api/model/toppicks/TopPicksRecResponse;", "observeTeaserRecs", "Lio/reactivex/Flowable;", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "observeTopPicksResponse", "retrieveFreshTeasers", "Lio/reactivex/Single;", "retrieveTopPicks", "retrieveTopPicksCountFromCache", "saveLocalTeasers", "teasers", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.toppicks.o */
public final class C11026o implements TopPicksRepository {
    /* renamed from: a */
    private final C8799c f35775a;
    /* renamed from: b */
    private final C11016j f35776b;
    /* renamed from: c */
    private final C11008g f35777c;
    /* renamed from: d */
    private final C8798a f35778d;
    /* renamed from: e */
    private final TopPicksApplicationRepository f35779e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00060\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/tinder/domain/recs/model/Rec;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/data/recs/RecsFetchResults;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.o$a */
    static final class C11021a<Upstream, Downstream> implements SingleTransformer<C8786k, List<? extends Rec>> {
        /* renamed from: a */
        public static final C11021a f35770a = new C11021a();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/recs/model/Rec;", "result", "Lcom/tinder/data/recs/RecsFetchResults;", "apply"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.data.toppicks.o$a$1 */
        static final class C110201<T, R> implements Function<T, R> {
            /* renamed from: a */
            public static final C110201 f35769a = new C110201();

            C110201() {
            }

            public /* synthetic */ Object apply(Object obj) {
                return m43686a((C8786k) obj);
            }

            @NotNull
            /* renamed from: a */
            public final List<Rec> m43686a(@NotNull C8786k c8786k) {
                C2668g.b(c8786k, "result");
                return c8786k.mo9896b();
            }
        }

        C11021a() {
        }

        public /* synthetic */ SingleSource apply(C3960g c3960g) {
            return m43687a(c3960g);
        }

        /* renamed from: a */
        public final C3960g<List<Rec>> m43687a(@NotNull C3960g<C8786k> c3960g) {
            C2668g.b(c3960g, "it");
            return c3960g.e().map(C110201.f35769a).single(C19301m.a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/toppicks/model/TopPicksResponse;", "it", "Lcom/tinder/api/model/toppicks/TopPicksRecResponse;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.o$b */
    static final class C11022b<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C11026o f35771a;

        C11022b(C11026o c11026o) {
            this.f35771a = c11026o;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43688a((TopPicksRecResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final TopPicksResponse m43688a(@NotNull TopPicksRecResponse topPicksRecResponse) {
            C2668g.b(topPicksRecResponse, "it");
            return this.f35771a.m43692a(topPicksRecResponse);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/toppicks/model/TopPicksResponse;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.o$c */
    static final class C11023c<T> implements Consumer<TopPicksResponse> {
        /* renamed from: a */
        final /* synthetic */ C11026o f35772a;

        C11023c(C11026o c11026o) {
            this.f35772a = c11026o;
        }

        public /* synthetic */ void accept(Object obj) {
            m43689a((TopPicksResponse) obj);
        }

        /* renamed from: a */
        public final void m43689a(TopPicksResponse topPicksResponse) {
            this.f35772a.f35779e.saveTopPicksRefreshTime(new TopPicksRefreshTime(topPicksResponse.getRefreshTime()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/api/response/v2/DataResponse;", "Lcom/tinder/api/model/toppicks/TopPicksRecResponse;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.o$d */
    static final class C11024d<T> implements Consumer<DataResponse<TopPicksRecResponse>> {
        /* renamed from: a */
        final /* synthetic */ C11026o f35773a;

        C11024d(C11026o c11026o) {
            this.f35773a = c11026o;
        }

        public /* synthetic */ void accept(Object obj) {
            m43690a((DataResponse) obj);
        }

        /* renamed from: a */
        public final void m43690a(DataResponse<TopPicksRecResponse> dataResponse) {
            TopPicksRecResponse topPicksRecResponse = (TopPicksRecResponse) dataResponse.data();
            if (topPicksRecResponse != null) {
                C11026o c11026o = this.f35773a;
                C2668g.a(topPicksRecResponse, "apiResponse");
                this.f35773a.f35779e.saveTopPicksRefreshTime(new TopPicksRefreshTime(c11026o.m43692a(topPicksRecResponse).getRefreshTime()));
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/toppicks/model/TopPickTeaser;", "kotlin.jvm.PlatformType", "", "it", "Lcom/tinder/api/response/v2/DataResponse;", "Lcom/tinder/api/model/toppicks/TopPicksRecResponse;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.o$e */
    static final class C11025e<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ C11026o f35774a;

        C11025e(C11026o c11026o) {
            this.f35774a = c11026o;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43691a((DataResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<TopPickTeaser> m43691a(@NotNull DataResponse<TopPicksRecResponse> dataResponse) {
            C2668g.b(dataResponse, "it");
            return this.f35774a.f35777c.a(this.f35774a.f35776b.m43678a((DataResponse) dataResponse));
        }
    }

    public C11026o(@NotNull C8799c c8799c, @NotNull C11016j c11016j, @NotNull C11008g c11008g, @NotNull C8798a c8798a, @NotNull TopPicksApplicationRepository topPicksApplicationRepository) {
        C2668g.b(c8799c, "teasersDataStore");
        C2668g.b(c11016j, "topPicksApiClient");
        C2668g.b(c11008g, "topPicksTeaserAdapterAdapter");
        C2668g.b(c8798a, "topPicksSharedPreferencesDataStore");
        C2668g.b(topPicksApplicationRepository, "topPicksApplicationRepository");
        this.f35775a = c8799c;
        this.f35776b = c11016j;
        this.f35777c = c11008g;
        this.f35778d = c8798a;
        this.f35779e = topPicksApplicationRepository;
    }

    @NotNull
    public C3957b<List<TopPickTeaser>> observeTeaserRecs() {
        return RxJavaInteropExtKt.toV2Flowable(this.f35775a.m37468a());
    }

    @NotNull
    public C3956a clearExpiredTeaserRecs() {
        return this.f35775a.m37469b();
    }

    @NotNull
    public C3956a clearAllTeaserRecs() {
        return this.f35775a.m37470c();
    }

    @NotNull
    public C3960g<List<Rec>> retrieveTopPicks() {
        C3960g<List<Rec>> a = RxJavaInteropExtKt.toV2Single(this.f35776b.loadRecs()).a(m43695a());
        C2668g.a(a, "topPicksApiClient.loadRe…getRecsFromApiResponse())");
        return a;
    }

    @NotNull
    public C3960g<List<TopPickTeaser>> retrieveFreshTeasers() {
        C3960g<List<TopPickTeaser>> e = this.f35776b.m43680c().b(new C11024d(this)).e(new C11025e(this));
        C2668g.a(e, "topPicksApiClient.loadTe…i(recs)\n                }");
        return e;
    }

    @NotNull
    public C3956a saveLocalTeasers(@NotNull List<TopPickTeaser> list) {
        C2668g.b(list, "teasers");
        return this.f35775a.m37467a((List) list);
    }

    @NotNull
    public C3957b<TopPicksResponse> observeTopPicksResponse() {
        C3957b<TopPicksResponse> a = this.f35776b.m43679b().f(new C11022b(this)).a(new C11023c(this));
        C2668g.a(a, "topPicksApiClient.observ…shTime(it.refreshTime)) }");
        return a;
    }

    public void bypassTopPicksEnd() {
        this.f35776b.m43681d();
    }

    public void cacheTopPicksCount(int i) {
        this.f35778d.m37441a(i);
    }

    public int retrieveTopPicksCountFromCache() {
        return this.f35778d.m37456j();
    }

    /* renamed from: a */
    private final SingleTransformer<C8786k, List<Rec>> m43695a() {
        return C11021a.f35770a;
    }

    /* renamed from: a */
    private final TopPicksResponse m43692a(TopPicksRecResponse topPicksRecResponse) {
        DateTime dateTime = new DateTime(topPicksRecResponse.getTopPicksRefreshTime());
        Boolean isAtEnd = topPicksRecResponse.isAtEnd();
        boolean booleanValue = isAtEnd != null ? isAtEnd.booleanValue() : false;
        isAtEnd = topPicksRecResponse.getHasUnconsumedTopPicks();
        boolean booleanValue2 = isAtEnd != null ? isAtEnd.booleanValue() : false;
        List recs = topPicksRecResponse.getRecs();
        int size = recs != null ? recs.size() : 0;
        recs = topPicksRecResponse.getTeasers();
        int size2 = recs != null ? recs.size() : 0;
        Integer count = topPicksRecResponse.getCount();
        int intValue = count != null ? count.intValue() : 0;
        topPicksRecResponse = topPicksRecResponse.getHasPurchasableTopPicks();
        return new TopPicksResponse(dateTime, booleanValue, booleanValue2, intValue, size, size2, topPicksRecResponse != null ? topPicksRecResponse.booleanValue() : null);
    }
}
