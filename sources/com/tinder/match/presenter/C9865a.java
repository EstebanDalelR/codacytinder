package com.tinder.match.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.updates.InitialUpdatesStatusProvider;
import com.tinder.domain.updates.InitialUpdatesStatusProvider.Status;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.fastmatch.preview.C9402a;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import com.tinder.match.analytics.C12035a;
import com.tinder.match.analytics.C12037d;
import com.tinder.match.analytics.C12038f;
import com.tinder.match.provider.C9877d;
import com.tinder.match.provider.MatchesSearchQueryProvider;
import com.tinder.match.provider.MatchesSearchStateProvider;
import com.tinder.match.target.MatchListTarget;
import com.tinder.match.viewmodel.MatchListItem;
import com.tinder.match.views.MatchesSearchView.State;
import com.tinder.module.ViewScope;
import io.reactivex.C15679f;
import io.reactivex.C3959e;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B[\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0002\u0010\u0015J\b\u0010\u001e\u001a\u00020\u001fH\u0007J\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002J\u0006\u0010$\u001a\u00020\u001fJ\u0006\u0010%\u001a\u00020\u001fJ\u0006\u0010&\u001a\u00020\u001fJ\u0006\u0010'\u001a\u00020\u001fJ\u0006\u0010(\u001a\u00020\u001fJ\b\u0010)\u001a\u00020\u001fH\u0002J\u0006\u0010*\u001a\u00020\u001fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00198\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/tinder/match/presenter/MatchListPresenter;", "", "searchStateProvider", "Lcom/tinder/match/provider/MatchesSearchStateProvider;", "searchQueryProvider", "Lcom/tinder/match/provider/MatchesSearchQueryProvider;", "initialUpdatesStatusProvider", "Lcom/tinder/domain/updates/InitialUpdatesStatusProvider;", "fastMatchPreviewFetcher", "Lcom/tinder/fastmatch/preview/FastMatchPreviewFetcher;", "addMatchStartSearchEvent", "Lcom/tinder/match/analytics/AddMatchStartSearchEvent;", "addMatchStopSearchEvent", "Lcom/tinder/match/analytics/AddMatchStopSearchEvent;", "addMatchListEvent", "Lcom/tinder/match/analytics/AddMatchListEvent;", "matchListItemsProvider", "Lcom/tinder/match/provider/MatchListItemsProvider;", "ioScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "(Lcom/tinder/match/provider/MatchesSearchStateProvider;Lcom/tinder/match/provider/MatchesSearchQueryProvider;Lcom/tinder/domain/updates/InitialUpdatesStatusProvider;Lcom/tinder/fastmatch/preview/FastMatchPreviewFetcher;Lcom/tinder/match/analytics/AddMatchStartSearchEvent;Lcom/tinder/match/analytics/AddMatchStopSearchEvent;Lcom/tinder/match/analytics/AddMatchListEvent;Lcom/tinder/match/provider/MatchListItemsProvider;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/match/target/MatchListTarget;", "getTarget$Tinder_release", "()Lcom/tinder/match/target/MatchListTarget;", "setTarget$Tinder_release", "(Lcom/tinder/match/target/MatchListTarget;)V", "dropTarget", "", "loadMatchListItems", "observeSearchState", "Lio/reactivex/Observable;", "Lcom/tinder/match/views/MatchesSearchView$State;", "onMatchListInFocus", "searchOverlayClick", "setSearchState", "startFastMatchPreviewPolling", "stopFastMatchPreviewPolling", "subscribeToMatches", "updateFastmatchPreview", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ViewScope
/* renamed from: com.tinder.match.presenter.a */
public final class C9865a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public MatchListTarget f32660a;
    /* renamed from: b */
    private final C17356a f32661b = new C17356a();
    /* renamed from: c */
    private final MatchesSearchStateProvider f32662c;
    /* renamed from: d */
    private final MatchesSearchQueryProvider f32663d;
    /* renamed from: e */
    private final InitialUpdatesStatusProvider f32664e;
    /* renamed from: f */
    private final C9402a f32665f;
    /* renamed from: g */
    private final C12037d f32666g;
    /* renamed from: h */
    private final C12038f f32667h;
    /* renamed from: i */
    private final C12035a f32668i;
    /* renamed from: j */
    private final C9877d f32669j;
    /* renamed from: k */
    private final C15679f f32670k;
    /* renamed from: l */
    private final C15679f f32671l;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "status", "Lcom/tinder/domain/updates/InitialUpdatesStatusProvider$Status;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.a$a */
    static final class C12059a<T> implements Predicate<Status> {
        /* renamed from: a */
        public static final C12059a f39201a = new C12059a();

        C12059a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m48166a((Status) obj);
        }

        /* renamed from: a */
        public final boolean m48166a(@NotNull Status status) {
            C2668g.b(status, "status");
            return status == Status.COMPLETED ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/updates/InitialUpdatesStatusProvider$Status;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.a$b */
    static final class C12060b<T> implements Consumer<Status> {
        /* renamed from: a */
        final /* synthetic */ C9865a f39202a;

        C12060b(C9865a c9865a) {
            this.f39202a = c9865a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48167a((Status) obj);
        }

        /* renamed from: a */
        public final void m48167a(Status status) {
            this.f39202a.m40584j();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.a$c */
    static final class C12061c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12061c f39203a = new C12061c();

        C12061c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48168a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48168a(Throwable th) {
            C0001a.c(th, "Unable to get Updates loading status.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/match/views/MatchesSearchView$State;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.a$d */
    static final class C12062d<T> implements Consumer<State> {
        /* renamed from: a */
        final /* synthetic */ C9865a f39204a;

        C12062d(C9865a c9865a) {
            this.f39204a = c9865a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48169a((State) obj);
        }

        /* renamed from: a */
        public final void m48169a(State state) {
            if (state == null) {
                C2668g.a();
            }
            switch (C9866b.f32672a[state.ordinal()]) {
                case 1:
                    if ((((CharSequence) this.f39204a.f32663d.getSearchQuery()).length() == null ? true : null) != null) {
                        this.f39204a.m40586a().fadeInSearchOverlay();
                    }
                    this.f39204a.f32666g.execute();
                    return;
                case 2:
                    this.f39204a.m40586a().fadeOutSearchOverlay();
                    return;
                case 3:
                    this.f39204a.m40586a().hideSearchOverlay();
                    this.f39204a.m40586a().hideKeyboard();
                    this.f39204a.f32667h.execute();
                    return;
                default:
                    return;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.a$e */
    static final class C12063e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12063e f39205a = new C12063e();

        C12063e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48170a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48170a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "matchListItems", "", "Lcom/tinder/match/viewmodel/MatchListItem;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.a$f */
    static final class C12064f<T> implements Consumer<List<? extends MatchListItem>> {
        /* renamed from: a */
        final /* synthetic */ C9865a f39206a;

        C12064f(C9865a c9865a) {
            this.f39206a = c9865a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48171a((List) obj);
        }

        /* renamed from: a */
        public final void m48171a(List<? extends MatchListItem> list) {
            if (!list.isEmpty()) {
                this.f39206a.m40586a().displayMatches(list);
            } else if (this.f39206a.f32662c.getSearchState() == State.SEARCHING) {
                this.f39206a.m40586a().displayMatches(list);
                this.f39206a.m40586a().displayNoSearchResults();
            } else {
                this.f39206a.m40586a().displayEmptyScreen();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.a$g */
    static final class C12065g<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12065g f39207a = new C12065g();

        C12065g() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48172a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48172a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Inject
    public C9865a(@NotNull MatchesSearchStateProvider matchesSearchStateProvider, @NotNull MatchesSearchQueryProvider matchesSearchQueryProvider, @NotNull InitialUpdatesStatusProvider initialUpdatesStatusProvider, @NotNull C9402a c9402a, @NotNull C12037d c12037d, @NotNull C12038f c12038f, @NotNull C12035a c12035a, @NotNull C9877d c9877d, @NotNull @IoScheduler C15679f c15679f, @NotNull @MainThreadScheduler C15679f c15679f2) {
        C2668g.b(matchesSearchStateProvider, "searchStateProvider");
        C2668g.b(matchesSearchQueryProvider, "searchQueryProvider");
        C2668g.b(initialUpdatesStatusProvider, "initialUpdatesStatusProvider");
        C2668g.b(c9402a, "fastMatchPreviewFetcher");
        C2668g.b(c12037d, "addMatchStartSearchEvent");
        C2668g.b(c12038f, "addMatchStopSearchEvent");
        C2668g.b(c12035a, "addMatchListEvent");
        C2668g.b(c9877d, "matchListItemsProvider");
        C2668g.b(c15679f, "ioScheduler");
        C2668g.b(c15679f2, "mainThreadScheduler");
        this.f32662c = matchesSearchStateProvider;
        this.f32663d = matchesSearchQueryProvider;
        this.f32664e = initialUpdatesStatusProvider;
        this.f32665f = c9402a;
        this.f32666g = c12037d;
        this.f32667h = c12038f;
        this.f32668i = c12035a;
        this.f32669j = c9877d;
        this.f32670k = c15679f;
        this.f32671l = c15679f2;
    }

    @NotNull
    /* renamed from: a */
    public final MatchListTarget m40586a() {
        MatchListTarget matchListTarget = this.f32660a;
        if (matchListTarget == null) {
            C2668g.b("target");
        }
        return matchListTarget;
    }

    @Drop
    /* renamed from: b */
    public final void m40587b() {
        this.f32661b.a();
    }

    /* renamed from: c */
    public final void m40588c() {
        this.f32665f.m39350a();
    }

    /* renamed from: d */
    public final void m40589d() {
        this.f32665f.m39351b();
    }

    /* renamed from: e */
    public final void m40590e() {
        MatchListTarget matchListTarget = this.f32660a;
        if (matchListTarget == null) {
            C2668g.b("target");
        }
        matchListTarget.displayLoadingScreen();
        this.f32661b.add(this.f32664e.observeInitialUpdatesStatus().a(C12059a.f39201a).f().a(new C12060b(this), C12061c.f39203a));
    }

    /* renamed from: f */
    public final void m40591f() {
        this.f32661b.add(m40585k().subscribeOn(this.f32670k).observeOn(this.f32671l).subscribe(new C12062d(this), C12063e.f39205a));
    }

    /* renamed from: g */
    public final void m40592g() {
        if (this.f32662c.getSearchState() == State.SEARCH_ON) {
            this.f32662c.updateSearchState(State.SEARCH_OFF);
        }
    }

    /* renamed from: h */
    public final void m40593h() {
        this.f32668i.execute();
    }

    /* renamed from: i */
    public final void m40594i() {
        this.f32665f.m39352c();
    }

    /* renamed from: j */
    private final void m40584j() {
        this.f32661b.add(this.f32669j.m40639a().subscribeOn(this.f32670k).observeOn(this.f32671l).subscribe(new C12064f(this), C12065g.f39207a));
    }

    /* renamed from: k */
    private final C3959e<State> m40585k() {
        return RxJavaInteropExtKt.toV2Observable(this.f32662c.observeSearchState());
    }
}
