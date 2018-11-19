package com.tinder.data.match;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.model.Photo.Quality;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.domain.match.model.visitor.MatchAvatarUrlsVisitor;
import com.tinder.domain.match.provider.UnMatchNotifier;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00112\u0006\u0010\u0017\u001a\u00020\rH\u0016J$\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u001c2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\u0006\u0010 \u001a\u00020\rH\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0016\u0010\"\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\fH\u0016J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\f0\u0011H\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0016\u0010&\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0014\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0011H\u0016J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\f0\u00112\u0006\u0010)\u001a\u00020\rH\u0016J\u0010\u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010+\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH\u0016J \u0010,\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000fH\u0016J\u0018\u00100\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/tinder/data/match/MatchDataRepository;", "Lcom/tinder/domain/match/repository/MatchRepository;", "matchDataStore", "Lcom/tinder/data/match/MatchDataStore;", "matchApiClient", "Lcom/tinder/data/match/MatchApiClient;", "unMatchNotifier", "Lcom/tinder/domain/match/provider/UnMatchNotifier;", "(Lcom/tinder/data/match/MatchDataStore;Lcom/tinder/data/match/MatchApiClient;Lcom/tinder/domain/match/provider/UnMatchNotifier;)V", "blockMatches", "Lrx/Completable;", "matchIds", "", "", "notifyUnMatch", "", "countMatches", "Lrx/Observable;", "", "countUnTouchedMatches", "deleteAll", "deleteExpiredSponsoredMatches", "deleteMatch", "matchId", "getMatch", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "getMatchAvatarUrls", "Lrx/Single;", "photoQuality", "Lcom/tinder/domain/common/model/Photo$Quality;", "getMatchByUserId", "userId", "getMatchFromStoreOrApi", "insertMatches", "matches", "loadMatches", "muteMatch", "notifyUnMatchForMatchId", "observeLastMessageAdMatch", "search", "query", "unMatch", "unMuteMatch", "updateTouchAndLastActivityDate", "lastActivityDate", "Lorg/joda/time/DateTime;", "isTouched", "updateTouchState", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.match.q */
public final class C10798q implements MatchRepository {
    /* renamed from: a */
    private final C8676s f35248a;
    /* renamed from: b */
    private final C8674m f35249b;
    /* renamed from: c */
    private final UnMatchNotifier f35250c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u000e\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "", "match", "Lcom/tinder/domain/match/model/Match;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.q$a */
    static final class C12922a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ Quality f41435a;

        C12922a(Quality quality) {
            this.f41435a = quality;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50603a((Match) obj);
        }

        /* renamed from: a */
        public final List<String> m50603a(Match match) {
            return (List) match.accept(new MatchAvatarUrlsVisitor(this.f41435a));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "it", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.q$b */
    static final class C12923b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12923b f41436a = new C12923b();

        C12923b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50604a((Optional) obj);
        }

        /* renamed from: a */
        public final Match m50604a(Optional<Match> optional) {
            return (Match) optional.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "it", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.q$c */
    static final class C12924c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12924c f41437a = new C12924c();

        C12924c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50605a((Optional) obj);
        }

        /* renamed from: a */
        public final Match m50605a(Optional<Match> optional) {
            return (Match) optional.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "it", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.q$d */
    static final class C12925d<T, R> implements Func1<Throwable, Single<? extends Match>> {
        /* renamed from: a */
        final /* synthetic */ C10798q f41438a;
        /* renamed from: b */
        final /* synthetic */ String f41439b;

        C12925d(C10798q c10798q, String str) {
            this.f41438a = c10798q;
            this.f41439b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50606a((Throwable) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<Match> m50606a(Throwable th) {
            return RxJavaInteropExtKt.toV1Single(this.f41438a.f35249b.m36965d(this.f41439b));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "it", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.q$f */
    static final class C12926f<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C12926f f41440a = new C12926f();

        C12926f() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50607a((Optional) obj);
        }

        /* renamed from: a */
        public final Match m50607a(Optional<Match> optional) {
            return (Match) optional.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "match", "Lcom/tinder/domain/match/model/Match;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.q$g */
    static final class C12927g<T, R> implements Func1<Match, Completable> {
        /* renamed from: a */
        final /* synthetic */ C10798q f41441a;

        C12927g(C10798q c10798q) {
            this.f41441a = c10798q;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50608a((Match) obj);
        }

        /* renamed from: a */
        public final Completable m50608a(Match match) {
            if (match instanceof CoreMatch) {
                return RxJavaInteropExtKt.toV1Completable(this.f41441a.f35249b.m36964c(match.getId()));
            }
            if (match instanceof MessageAdMatch) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can't un-match with ");
                stringBuilder.append(match.getClass().getSimpleName());
                return Completable.a(new IllegalStateException(stringBuilder.toString()));
            } else if (match instanceof PlacesMatch) {
                return RxJavaInteropExtKt.toV1Completable(this.f41441a.f35249b.m36964c(match.getId()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.q$e */
    static final class C13824e implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10798q f43856a;
        /* renamed from: b */
        final /* synthetic */ List f43857b;

        C13824e(C10798q c10798q, List list) {
            this.f43856a = c10798q;
            this.f43857b = list;
        }

        public final void call() {
            for (String notifyUnMatch : this.f43857b) {
                this.f43856a.f35250c.notifyUnMatch(notifyUnMatch);
            }
        }
    }

    @Inject
    public C10798q(@NotNull C8676s c8676s, @NotNull C8674m c8674m, @NotNull UnMatchNotifier unMatchNotifier) {
        C2668g.b(c8676s, "matchDataStore");
        C2668g.b(c8674m, "matchApiClient");
        C2668g.b(unMatchNotifier, "unMatchNotifier");
        this.f35248a = c8676s;
        this.f35249b = c8674m;
        this.f35250c = unMatchNotifier;
    }

    @NotNull
    public Observable<List<Match>> loadMatches() {
        return this.f35248a.m36977a();
    }

    @NotNull
    public Completable insertMatches(@NotNull List<? extends Match> list) {
        C2668g.b(list, ManagerWebServices.PARAM_MATCHES);
        return this.f35248a.m36975a((List) list);
    }

    @NotNull
    public Observable<List<Match>> search(@NotNull String str) {
        C2668g.b(str, "query");
        return this.f35248a.m36978a(str);
    }

    @NotNull
    public Observable<Long> countMatches() {
        return this.f35248a.m36981b();
    }

    @NotNull
    public Observable<Long> countUnTouchedMatches() {
        return this.f35248a.m36982c();
    }

    @NotNull
    public Completable updateTouchState(@NotNull String str, boolean z) {
        C2668g.b(str, "matchId");
        return this.f35248a.m36974a(str, z);
    }

    @NotNull
    public Completable blockMatches(@NotNull List<String> list) {
        C2668g.b(list, "matchIds");
        return m43254a(list, true);
    }

    @NotNull
    public Completable deleteMatch(@NotNull String str) {
        C2668g.b(str, "matchId");
        return this.f35248a.m36979b(str);
    }

    @NotNull
    public Completable updateTouchAndLastActivityDate(@NotNull String str, @NotNull DateTime dateTime, boolean z) {
        C2668g.b(str, "matchId");
        C2668g.b(dateTime, "lastActivityDate");
        return this.f35248a.m36973a(str, dateTime, z);
    }

    @NotNull
    public Completable deleteAll() {
        return this.f35248a.m36984d();
    }

    @NotNull
    public Completable muteMatch(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = RxJavaInteropExtKt.toV1Completable(this.f35249b.m36962a(str)).b(this.f35248a.m36980b(str, true));
        C2668g.a(str, "matchApiClient\n         …matchId, isMuted = true))");
        return str;
    }

    @NotNull
    public Completable unMuteMatch(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = RxJavaInteropExtKt.toV1Completable(this.f35249b.m36963b(str)).b(this.f35248a.m36980b(str, false));
        C2668g.a(str, "matchApiClient\n         …atchId, isMuted = false))");
        return str;
    }

    @NotNull
    public Observable<Optional<Match>> getMatch(@NotNull String str) {
        C2668g.b(str, "matchId");
        return this.f35248a.m36983c(str);
    }

    @NotNull
    public Observable<Optional<Match>> observeLastMessageAdMatch() {
        return this.f35248a.m36986e();
    }

    @NotNull
    public Completable unMatch(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = this.f35248a.m36983c(str).h().k(C12926f.f41440a).a().c(new C12927g(this)).a(m43254a(C19301m.a(str), false)).a(m43253a(C19301m.a(str)));
        C2668g.a(str, "matchDataStore.getMatch(…MatchId(listOf(matchId)))");
        return str;
    }

    @NotNull
    public Single<List<String>> getMatchAvatarUrls(@NotNull String str, @NotNull Quality quality) {
        C2668g.b(str, "matchId");
        C2668g.b(quality, "photoQuality");
        str = m43255a(str).d(new C12922a(quality));
        C2668g.a(str, "getMatchFromStoreOrApi(m…sVisitor(photoQuality)) }");
        return str;
    }

    @NotNull
    public Single<Match> getMatchByUserId(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_USER_ID);
        str = this.f35248a.m36985d(str).d(C12923b.f41436a);
        C2668g.a(str, "matchDataStore.getMatchB…(userId).map { it.get() }");
        return str;
    }

    @NotNull
    public Completable deleteExpiredSponsoredMatches() {
        return this.f35248a.m36987f();
    }

    /* renamed from: a */
    private final Single<Match> m43255a(String str) {
        str = this.f35248a.m36983c(str).k(C12924c.f41437a).h().a().f(new C12925d(this, str));
        C2668g.a(str, "matchDataStore.getMatch(…h(matchId).toV1Single() }");
        return str;
    }

    /* renamed from: a */
    private final Completable m43254a(List<String> list, boolean z) {
        Completable a = this.f35248a.m36976a((List) list, true);
        if (z) {
            a = a.a(m43253a((List) list));
            C2668g.a(a, "blockCompletable.andThen…atchForMatchId(matchIds))");
            return a;
        } else if (!z) {
            return a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final Completable m43253a(List<String> list) {
        list = Completable.a(new C13824e(this, list));
        C2668g.a(list, "Completable.fromAction {…)\n            }\n        }");
        return list;
    }
}
