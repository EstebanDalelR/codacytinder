package com.tinder.match.presenter;

import com.jakewharton.rxbinding.support.design.widget.TabLayoutSelectionEvent.Kind;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.match.provider.C9876b;
import com.tinder.match.provider.C9879g;
import com.tinder.match.provider.C9879g.C9878a;
import com.tinder.match.target.MatchTabsTarget;
import com.tinder.match.viewmodel.MatchTabsPage;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0007R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/tinder/match/presenter/MatchTabsPresenter;", "", "matchesTabSelectedProvider", "Lcom/tinder/match/provider/MatchesTabSelectedProvider;", "feedTabReselectedProvider", "Lcom/tinder/match/provider/FeedTabReselectedProvider;", "(Lcom/tinder/match/provider/MatchesTabSelectedProvider;Lcom/tinder/match/provider/FeedTabReselectedProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "matchTabPages", "", "Lcom/tinder/match/viewmodel/MatchTabsPage;", "[Lcom/tinder/match/viewmodel/MatchTabsPage;", "target", "Lcom/tinder/match/target/MatchTabsTarget;", "getTarget$Tinder_release", "()Lcom/tinder/match/target/MatchTabsTarget;", "setTarget$Tinder_release", "(Lcom/tinder/match/target/MatchTabsTarget;)V", "drop", "", "observeTabSelections", "onTabSelected", "tabPosition", "", "kind", "Lcom/jakewharton/rxbinding/support/design/widget/TabLayoutSelectionEvent$Kind;", "selectTab", "matchTabsPage", "take", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.presenter.k */
public final class C9870k {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public MatchTabsTarget f32684a;
    /* renamed from: b */
    private final MatchTabsPage[] f32685b = MatchTabsPage.values();
    /* renamed from: c */
    private final C17356a f32686c = new C17356a();
    /* renamed from: d */
    private final C9879g f32687d;
    /* renamed from: e */
    private final C9876b f32688e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/match/provider/MatchesTabSelectedProvider$TabSelectedEvent;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.k$a */
    static final class C12066a<T> implements Predicate<C9878a> {
        /* renamed from: a */
        public static final C12066a f39211a = new C12066a();

        C12066a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m48173a((C9878a) obj);
        }

        /* renamed from: a */
        public final boolean m48173a(@NotNull C9878a c9878a) {
            C2668g.b(c9878a, "it");
            return c9878a.m40641b() == Kind.SELECTED ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/match/viewmodel/MatchTabsPage;", "it", "Lcom/tinder/match/provider/MatchesTabSelectedProvider$TabSelectedEvent;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.k$b */
    static final class C12067b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C12067b f39212a = new C12067b();

        C12067b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48174a((C9878a) obj);
        }

        @NotNull
        /* renamed from: a */
        public final MatchTabsPage m48174a(@NotNull C9878a c9878a) {
            C2668g.b(c9878a, "it");
            return c9878a.m40640a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/match/viewmodel/MatchTabsPage;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.k$c */
    static final class C12068c<T> implements Consumer<MatchTabsPage> {
        /* renamed from: a */
        final /* synthetic */ C9870k f39213a;

        C12068c(C9870k c9870k) {
            this.f39213a = c9870k;
        }

        public /* synthetic */ void accept(Object obj) {
            m48175a((MatchTabsPage) obj);
        }

        /* renamed from: a */
        public final void m48175a(MatchTabsPage matchTabsPage) {
            C9870k c9870k = this.f39213a;
            C2668g.a(matchTabsPage, "it");
            c9870k.m40612a(matchTabsPage);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.presenter.k$d */
    static final class C12069d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12069d f39214a = new C12069d();

        C12069d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48176a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48176a(Throwable th) {
            C0001a.c(th, "Error observing matches tab selection events", new Object[0]);
        }
    }

    @Inject
    public C9870k(@NotNull C9879g c9879g, @NotNull C9876b c9876b) {
        C2668g.b(c9879g, "matchesTabSelectedProvider");
        C2668g.b(c9876b, "feedTabReselectedProvider");
        this.f32687d = c9879g;
        this.f32688e = c9876b;
    }

    @Take
    /* renamed from: a */
    public final void m40614a() {
        m40613c();
    }

    @Drop
    /* renamed from: b */
    public final void m40616b() {
        this.f32686c.a();
    }

    /* renamed from: a */
    public final void m40615a(int i, @NotNull Kind kind) {
        C2668g.b(kind, "kind");
        C9878a c9878a = new C9878a(i, this.f32685b[i], kind);
        this.f32687d.m40643a(c9878a);
        if (c9878a.m40641b() == Kind.SELECTED) {
            kind = this.f32684a;
            if (kind == null) {
                C2668g.b("target");
            }
            kind.showTab(i);
        }
        if (c9878a.m40641b() == Kind.RESELECTED && c9878a.m40640a() == MatchTabsPage.FEED) {
            this.f32688e.m40636a(C15813i.f49016a);
        }
    }

    /* renamed from: c */
    private final void m40613c() {
        this.f32686c.add(this.f32687d.m40642a().filter(C12066a.f39211a).map(C12067b.f39212a).distinctUntilChanged().subscribe(new C12068c(this), C12069d.f39214a));
    }

    /* renamed from: a */
    private final void m40612a(MatchTabsPage matchTabsPage) {
        MatchTabsTarget matchTabsTarget = this.f32684a;
        if (matchTabsTarget == null) {
            C2668g.b("target");
        }
        matchTabsTarget.showTab(matchTabsPage.ordinal());
    }
}
