package com.tinder.match.analytics;

import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.GetMessagesMatches;
import com.tinder.domain.match.usecase.GetNewMatches;
import com.tinder.etl.event.lo;
import com.tinder.etl.event.lu;
import com.tinder.etl.event.lv;
import com.tinder.etl.event.lw;
import com.tinder.match.provider.MatchesSearchQueryProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/match/analytics/MatchListAnalyticsFactory;", "", "getMessagesMatches", "Lcom/tinder/domain/match/usecase/GetMessagesMatches;", "getNewMatches", "Lcom/tinder/domain/match/usecase/GetNewMatches;", "searchQueryProvider", "Lcom/tinder/match/provider/MatchesSearchQueryProvider;", "matchListEventsFactory", "Lcom/tinder/match/analytics/MatchListEventsFactory;", "matchSearchEventsFactory", "Lcom/tinder/match/analytics/MatchSearchEventsFactory;", "(Lcom/tinder/domain/match/usecase/GetMessagesMatches;Lcom/tinder/domain/match/usecase/GetNewMatches;Lcom/tinder/match/provider/MatchesSearchQueryProvider;Lcom/tinder/match/analytics/MatchListEventsFactory;Lcom/tinder/match/analytics/MatchSearchEventsFactory;)V", "createMatchListEvent", "Lrx/Single;", "Lcom/tinder/etl/event/MatchListEvent;", "createMatchSearchEvent", "Lcom/tinder/etl/event/MatchSearchEvent;", "createMatchSearchSelectEvent", "Lcom/tinder/etl/event/MatchSearchSelectEvent;", "match", "Lcom/tinder/domain/match/model/Match;", "createMatchStartSearchEvent", "Lcom/tinder/etl/event/MatchStartSearchEvent;", "createMatchStopSearchEvent", "Lcom/tinder/etl/event/MatchStopSearchEvent;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.analytics.l */
public final class C9845l {
    /* renamed from: a */
    private final GetMessagesMatches f32615a;
    /* renamed from: b */
    private final GetNewMatches f32616b;
    /* renamed from: c */
    private final MatchesSearchQueryProvider f32617c;
    /* renamed from: d */
    private final C9846q f32618d;
    /* renamed from: e */
    private final C9848s f32619e;

    @Inject
    public C9845l(@NotNull GetMessagesMatches getMessagesMatches, @NotNull GetNewMatches getNewMatches, @NotNull MatchesSearchQueryProvider matchesSearchQueryProvider, @NotNull C9846q c9846q, @NotNull C9848s c9848s) {
        C2668g.b(getMessagesMatches, "getMessagesMatches");
        C2668g.b(getNewMatches, "getNewMatches");
        C2668g.b(matchesSearchQueryProvider, "searchQueryProvider");
        C2668g.b(c9846q, "matchListEventsFactory");
        C2668g.b(c9848s, "matchSearchEventsFactory");
        this.f32615a = getMessagesMatches;
        this.f32616b = getNewMatches;
        this.f32617c = matchesSearchQueryProvider;
        this.f32618d = c9846q;
        this.f32619e = c9848s;
    }

    @NotNull
    /* renamed from: a */
    public final Single<lo> m40528a() {
        String searchQuery = this.f32617c.getSearchQuery();
        Single<lo> a = Observable.b(this.f32615a.execute(searchQuery), this.f32616b.execute(searchQuery), new C13409m(new MatchListAnalyticsFactory$createMatchListEvent$1(this.f32618d))).h().a();
        C2668g.a(a, "Observable.zip(\n        …              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: a */
    public final Single<lu> m40529a(@NotNull Match match) {
        C2668g.b(match, "match");
        String searchQuery = this.f32617c.getSearchQuery();
        match = Observable.b(Observable.a(searchQuery), Observable.a(match), this.f32615a.execute(searchQuery), this.f32616b.execute(searchQuery), new C13411o(new MatchListAnalyticsFactory$createMatchSearchSelectEvent$1(this.f32619e))).h().a();
        C2668g.a(match, "Observable.zip(\n        …              .toSingle()");
        return match;
    }

    @NotNull
    /* renamed from: b */
    public final Single<lv> m40530b() {
        String searchQuery = this.f32617c.getSearchQuery();
        Single<lv> a = Observable.b(Observable.a(searchQuery), this.f32615a.execute(searchQuery), this.f32616b.execute(searchQuery), new C13410n(new MatchListAnalyticsFactory$createMatchStartSearchEvent$1(this.f32619e))).h().a();
        C2668g.a(a, "Observable.zip(\n        …              .toSingle()");
        return a;
    }

    @NotNull
    /* renamed from: c */
    public final Single<lw> m40531c() {
        String searchQuery = this.f32617c.getSearchQuery();
        Single<lw> a = Observable.b(this.f32615a.execute(searchQuery), this.f32616b.execute(searchQuery), new C13409m(new MatchListAnalyticsFactory$createMatchStopSearchEvent$1(this.f32619e))).h().a();
        C2668g.a(a, "Observable.zip(\n        …              .toSingle()");
        return a;
    }
}
