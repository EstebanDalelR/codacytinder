package com.tinder.data.match;

import com.tinder.api.TinderApi;
import com.tinder.api.response.MatchResponse;
import com.tinder.data.match.C10799v.C8678a;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/data/match/MatchApiClient;", "", "tinderApi", "Lcom/tinder/api/TinderApi;", "matchDomainApiAdapter", "Lcom/tinder/data/match/MatchDomainApiAdapter;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/match/MatchDomainApiAdapter;)V", "getMatch", "Lio/reactivex/Single;", "Lcom/tinder/domain/match/model/Match;", "matchId", "", "muteMatch", "Lio/reactivex/Completable;", "setMatchSeen", "unMatch", "unMuteMatch", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.match.m */
public final class C8674m {
    /* renamed from: a */
    private final TinderApi f30537a;
    /* renamed from: b */
    private final C10799v f30538b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/data/match/MatchDomainApiAdapter$MatchData;", "matchResponse", "Lcom/tinder/api/response/MatchResponse;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.match.m$a */
    static final class C10796a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10796a f35246a = new C10796a();

        C10796a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43251a((MatchResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C8678a m43251a(@NotNull MatchResponse matchResponse) {
            C2668g.b(matchResponse, "matchResponse");
            matchResponse = matchResponse.getMatch();
            if (matchResponse != null) {
                return new C8678a(matchResponse, false);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    @Inject
    public C8674m(@NotNull TinderApi tinderApi, @NotNull C10799v c10799v) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c10799v, "matchDomainApiAdapter");
        this.f30537a = tinderApi;
        this.f30538b = c10799v;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m36962a(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = this.f30537a.muteMatch(str);
        C2668g.a(str, "tinderApi.muteMatch(matchId)");
        return RxJavaInteropExtKt.toV2Completable(str);
    }

    @NotNull
    /* renamed from: b */
    public final C3956a m36963b(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = this.f30537a.unMuteMatch(str);
        C2668g.a(str, "tinderApi.unMuteMatch(matchId)");
        return RxJavaInteropExtKt.toV2Completable(str);
    }

    @NotNull
    /* renamed from: c */
    public final C3956a m36964c(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = this.f30537a.unMatch(str);
        C2668g.a(str, "tinderApi.unMatch(matchId)");
        return RxJavaInteropExtKt.toV2Completable(str);
    }

    @NotNull
    /* renamed from: d */
    public final C3960g<Match> m36965d(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = this.f30537a.getMatch(str);
        C2668g.a(str, "tinderApi.getMatch(matchId)");
        str = RxJavaInteropExtKt.toV2Single(str).e(C10796a.f35246a).e(new C10797n(new MatchApiClient$getMatch$2(this.f30538b)));
        C2668g.a(str, "tinderApi.getMatch(match…omainApiAdapter::fromApi)");
        return str;
    }
}
