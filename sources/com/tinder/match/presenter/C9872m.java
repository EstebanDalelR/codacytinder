package com.tinder.match.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.match.usecase.CountMatches;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.match.provider.MatchesSearchQueryProvider;
import com.tinder.match.provider.MatchesSearchStateProvider;
import com.tinder.match.target.MatchesSearchViewTarget;
import com.tinder.match.views.MatchesSearchView.State;
import com.tinder.module.ViewScope;
import io.reactivex.C3959e;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0012J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\r\u0010\u001c\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u001dR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/tinder/match/presenter/MatchesSearchViewPresenter;", "", "searchStateProvider", "Lcom/tinder/match/provider/MatchesSearchStateProvider;", "searchQueryProvider", "Lcom/tinder/match/provider/MatchesSearchQueryProvider;", "countMatches", "Lcom/tinder/domain/match/usecase/CountMatches;", "(Lcom/tinder/match/provider/MatchesSearchStateProvider;Lcom/tinder/match/provider/MatchesSearchQueryProvider;Lcom/tinder/domain/match/usecase/CountMatches;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/match/target/MatchesSearchViewTarget;", "getTarget$Tinder_release", "()Lcom/tinder/match/target/MatchesSearchViewTarget;", "setTarget$Tinder_release", "(Lcom/tinder/match/target/MatchesSearchViewTarget;)V", "drop", "", "drop$Tinder_release", "handleQueryTextChange", "newQuery", "", "handleSearchCancel", "handleSearchSubmit", "handleSearchViewInFocus", "observeCountMatches", "observeSearchState", "take", "take$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ViewScope
/* renamed from: com.tinder.match.presenter.m */
public final class C9872m {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public MatchesSearchViewTarget f32689a;
    /* renamed from: b */
    private final C17356a f32690b = new C17356a();
    /* renamed from: c */
    private final MatchesSearchStateProvider f32691c;
    /* renamed from: d */
    private final MatchesSearchQueryProvider f32692d;
    /* renamed from: e */
    private final CountMatches f32693e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.m$a */
    static final class C12070a<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12070a f39215a = new C12070a();

        C12070a() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48177a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48177a(Throwable th) {
            C0001a.c(th, "Error observing count matches", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/match/views/MatchesSearchView$State;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.m$b */
    static final class C12071b<T> implements Predicate<State> {
        /* renamed from: a */
        public static final C12071b f39216a = new C12071b();

        C12071b() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m48178a((State) obj);
        }

        /* renamed from: a */
        public final boolean m48178a(@NotNull State state) {
            C2668g.b(state, "state");
            return state == State.SEARCH_OFF ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/match/views/MatchesSearchView$State;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.m$c */
    static final class C12072c<T> implements Consumer<State> {
        /* renamed from: a */
        final /* synthetic */ C9872m f39217a;

        C12072c(C9872m c9872m) {
            this.f39217a = c9872m;
        }

        public /* synthetic */ void accept(Object obj) {
            m48179a((State) obj);
        }

        /* renamed from: a */
        public final void m48179a(State state) {
            this.f39217a.m40621a().clearSearchState();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.m$d */
    static final class C12073d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12073d f39218a = new C12073d();

        C12073d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48180a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48180a(Throwable th) {
            C0001a.c(th, "Error observing search state", new Object[0]);
        }
    }

    @Inject
    public C9872m(@NotNull MatchesSearchStateProvider matchesSearchStateProvider, @NotNull MatchesSearchQueryProvider matchesSearchQueryProvider, @NotNull CountMatches countMatches) {
        C2668g.b(matchesSearchStateProvider, "searchStateProvider");
        C2668g.b(matchesSearchQueryProvider, "searchQueryProvider");
        C2668g.b(countMatches, "countMatches");
        this.f32691c = matchesSearchStateProvider;
        this.f32692d = matchesSearchQueryProvider;
        this.f32693e = countMatches;
    }

    @NotNull
    /* renamed from: a */
    public final MatchesSearchViewTarget m40621a() {
        MatchesSearchViewTarget matchesSearchViewTarget = this.f32689a;
        if (matchesSearchViewTarget == null) {
            C2668g.b("target");
        }
        return matchesSearchViewTarget;
    }

    @Take
    /* renamed from: b */
    public final void m40623b() {
        MatchesSearchViewTarget matchesSearchViewTarget = this.f32689a;
        if (matchesSearchViewTarget == null) {
            C2668g.b("target");
        }
        matchesSearchViewTarget.setSearchListeners();
        m40619g();
        m40620h();
        this.f32691c.updateSearchState(State.SEARCH_OFF);
    }

    @Drop
    /* renamed from: c */
    public final void m40624c() {
        this.f32690b.a();
    }

    /* renamed from: a */
    public final void m40622a(@NotNull String str) {
        C2668g.b(str, "newQuery");
        if ((((CharSequence) str).length() == 0 ? 1 : null) == null || this.f32691c.getSearchState() != State.SEARCHING) {
            if (this.f32691c.getSearchState() == State.SEARCH_ON) {
                this.f32691c.updateSearchState(State.SEARCHING);
            }
            if ((C2668g.a(str, this.f32692d.getSearchQuery()) ^ 1) != 0) {
                this.f32692d.updateSearchQuery(str);
            }
            return;
        }
        this.f32691c.updateSearchState(State.SEARCH_ON);
        this.f32692d.updateSearchQuery("");
    }

    /* renamed from: d */
    public final void m40625d() {
        this.f32691c.updateSearchState(State.SEARCH_ON);
    }

    /* renamed from: e */
    public final void m40626e() {
        MatchesSearchViewTarget matchesSearchViewTarget = this.f32689a;
        if (matchesSearchViewTarget == null) {
            C2668g.b("target");
        }
        matchesSearchViewTarget.clearSearchFocus();
    }

    /* renamed from: f */
    public final void m40627f() {
        this.f32691c.updateSearchState(State.SEARCH_OFF);
    }

    /* renamed from: g */
    private final void m40619g() {
        C3959e observeOn = this.f32693e.execute().subscribeOn(C15756a.b()).observeOn(C15674a.a());
        MatchesSearchViewTarget matchesSearchViewTarget = this.f32689a;
        if (matchesSearchViewTarget == null) {
            C2668g.b("target");
        }
        this.f32690b.add(observeOn.subscribe(new C12074n(new MatchesSearchViewPresenter$observeCountMatches$1(matchesSearchViewTarget)), C12070a.f39215a));
    }

    /* renamed from: h */
    private final void m40620h() {
        this.f32690b.add(RxJavaInteropExtKt.toV2Observable(this.f32691c.observeSearchState()).filter(C12071b.f39216a).subscribeOn(C15756a.b()).observeOn(C15674a.a()).subscribe(new C12072c(this), C12073d.f39218a));
    }
}
