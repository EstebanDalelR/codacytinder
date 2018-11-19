package com.tinder.application;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.places.provider.PlacesConfigExpansionProvider;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.injection.modules.C13156x9c0cf4b0;
import com.tinder.domain.match.provider.NewMatchProvider;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.PlacesRepository;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.domain.recs.model.RecSource;
import com.tinder.managers.bj;
import com.tinder.places.analytics.C10116f;
import com.tinder.places.analytics.C10117g;
import com.tinder.places.analytics.C10119i;
import com.tinder.places.card.presenter.C12306h;
import com.tinder.places.card.view.C12319g;
import com.tinder.places.card.view.C14184e;
import com.tinder.places.injection.C13581h;
import com.tinder.places.injection.C13582i;
import com.tinder.places.injection.C13583j;
import com.tinder.places.injection.C13584k;
import com.tinder.places.injection.C13585l;
import com.tinder.places.injection.PlacesRecsComponent;
import com.tinder.places.p311f.C12339d;
import com.tinder.places.p311f.C12341f;
import com.tinder.places.p311f.C12343h;
import com.tinder.places.recs.presenter.C12433a;
import com.tinder.places.recs.view.C12445d;
import com.tinder.places.recs.view.PlacesRecsView;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.recs.RecsCardFactory;
import com.tinder.recs.RecsPhotoUrlFactory;
import com.tinder.recs.card.CardSizeProvider;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.rule.LocalOutOfLikesBouncerRule;
import com.tinder.recs.view.UserRecCardHeadLineView_MembersInjector;
import com.tinder.recsgrid.C14782d;
import com.tinder.recsgrid.C16487f;
import com.tinder.recsgrid.ScrollStatusNotifier;
import com.tinder.recsgrid.ScrollStatusProvider;
import com.tinder.views.grid.C17263c;
import com.tinder.views.grid.C17264e;
import com.tinder.views.grid.GridUserRecCardHeadlineView;
import com.tinder.views.grid.GridUserRecCardView;
import com.tinder.views.grid.p449a.C15453a;
import dagger.internal.C17281c;
import javax.inject.Provider;

final class a$w implements PlacesRecsComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f33682a;
    /* renamed from: b */
    private RecSource f33683b;
    /* renamed from: c */
    private Provider<C15453a> f33684c;
    /* renamed from: d */
    private Provider<C16487f> f33685d;
    /* renamed from: e */
    private Provider<ScrollStatusNotifier> f33686e;
    /* renamed from: f */
    private Provider<ScrollStatusProvider> f33687f;
    /* renamed from: g */
    private Provider<C14782d> f33688g;

    private a$w(C4423a c4423a, a$v a_v) {
        this.f33682a = c4423a;
        m42061a(a_v);
    }

    /* renamed from: a */
    private C12339d m42057a() {
        return new C12339d((PlacesRepository) C4423a.eG(this.f33682a).get());
    }

    /* renamed from: b */
    private C10117g m42062b() {
        return new C10117g((C2630h) C4423a.u(this.f33682a).get());
    }

    /* renamed from: c */
    private C12306h m42063c() {
        return new C12306h(this.f33683b, (RecsEngineRegistry) C4423a.cq(this.f33682a).get(), C13156x9c0cf4b0.proxyProvidesRxJava1ComputationScheduler$domain_release(C4423a.aF(this.f33682a)), (PlacesConfigExpansionProvider) C4423a.eH(this.f33682a).get(), m42057a(), m42062b());
    }

    /* renamed from: d */
    private C14418b m42064d() {
        return new C14418b(this.f33682a.resources(), (bj) C4423a.W(this.f33682a).get(), C4423a.X(this.f33682a), (CurrentUserProvider) C4423a.Y(this.f33682a).get());
    }

    /* renamed from: e */
    private RecsCardFactory m42065e() {
        return new RecsCardFactory(new RecsPhotoUrlFactory(), (CardSizeProvider) C4423a.an(this.f33682a).get(), m42064d(), (AbTestUtility) C4423a.f(this.f33682a).get());
    }

    /* renamed from: f */
    private C12341f m42066f() {
        return new C12341f((PlacesRepository) C4423a.eG(this.f33682a).get());
    }

    /* renamed from: g */
    private C10119i m42067g() {
        return new C10119i((C2630h) C4423a.u(this.f33682a).get());
    }

    /* renamed from: h */
    private C10116f m42068h() {
        return new C10116f((C2630h) C4423a.u(this.f33682a).get());
    }

    /* renamed from: i */
    private C12343h m42069i() {
        return new C12343h((PlacesConfigProvider) C4423a.bG(this.f33682a).get());
    }

    /* renamed from: j */
    private C12433a m42070j() {
        return new C12433a(m42065e(), this.f33683b, (RecsEngineRegistry) C4423a.cq(this.f33682a).get(), (RatingProcessor) C4423a.cK(this.f33682a).get(), (C15453a) this.f33684c.get(), (NewMatchProvider) C4423a.eE(this.f33682a).get(), (ScrollStatusNotifier) this.f33686e.get(), (ScrollStatusProvider) this.f33687f.get(), (C14782d) this.f33688g.get(), m42066f(), m42067g(), m42057a(), m42068h(), (CurrentScreenNotifier) C4423a.M(this.f33682a).get(), (LocalOutOfLikesBouncerRule) C4423a.cJ(this.f33682a).get(), (PlacesConfigProvider) C4423a.bG(this.f33682a).get(), m42069i());
    }

    /* renamed from: a */
    private void m42061a(a$v a_v) {
        this.f33683b = a_v.f33681c;
        this.f33684c = C17281c.a(C13585l.m53029b(a_v.f33680b));
        this.f33685d = C17281c.a(C13583j.m53021b(a_v.f33680b));
        this.f33686e = C17281c.a(C13582i.m53018b(a_v.f33680b, this.f33685d));
        this.f33687f = C17281c.a(C13584k.m53026b(a_v.f33680b, this.f33685d));
        this.f33688g = C17281c.a(C13581h.m53013b(a_v.f33680b));
    }

    public void inject(C14184e c14184e) {
        m42056a(c14184e);
    }

    public void inject(PlacesRecsView placesRecsView) {
        m42058a(placesRecsView);
    }

    public void inject(GridUserRecCardView gridUserRecCardView) {
        m42060a(gridUserRecCardView);
    }

    public void inject(GridUserRecCardHeadlineView gridUserRecCardHeadlineView) {
        m42059a(gridUserRecCardHeadlineView);
    }

    /* renamed from: a */
    private C14184e m42056a(C14184e c14184e) {
        C12319g.m48655a(c14184e, m42063c());
        return c14184e;
    }

    /* renamed from: a */
    private PlacesRecsView m42058a(PlacesRecsView placesRecsView) {
        C17264e.a(placesRecsView, (UserRecActivePhotoIndexProvider) C4423a.cB(this.f33682a).get());
        C17264e.a(placesRecsView, C4423a.aS(this.f33682a));
        C12445d.m48930a(placesRecsView, m42070j());
        return placesRecsView;
    }

    /* renamed from: a */
    private GridUserRecCardView m42060a(GridUserRecCardView gridUserRecCardView) {
        C17263c.a(gridUserRecCardView, (UserRecActivePhotoIndexProvider) C4423a.cB(this.f33682a).get());
        C17263c.a(gridUserRecCardView, (C15453a) this.f33684c.get());
        return gridUserRecCardView;
    }

    /* renamed from: a */
    private GridUserRecCardHeadlineView m42059a(GridUserRecCardHeadlineView gridUserRecCardHeadlineView) {
        UserRecCardHeadLineView_MembersInjector.injectFastMatchConfigProvider(gridUserRecCardHeadlineView, (FastMatchConfigProvider) C4423a.ao(this.f33682a).get());
        UserRecCardHeadLineView_MembersInjector.injectTopPicksConfig(gridUserRecCardHeadlineView, this.f33682a.topPicksConfig());
        return gridUserRecCardHeadlineView;
    }
}
