package com.tinder.application;

import com.tinder.analytics.C2634g;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.core.p201a.C8588a;
import com.tinder.data.places.p330b.C10893a;
import com.tinder.data.places.p330b.C10894b;
import com.tinder.data.places.p330b.C10895c;
import com.tinder.data.places.p330b.C10896d;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.injection.modules.C13156x9c0cf4b0;
import com.tinder.domain.injection.modules.CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.PlacesLoadedStateProvider;
import com.tinder.domain.places.PlacesRepository;
import com.tinder.domain.places.provider.PlacesOnboardingProgressProvider;
import com.tinder.module.ex;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent;
import com.tinder.places.analytics.AddPlacesRecentPlaceViewEvent;
import com.tinder.places.analytics.AddPlacesRemoveRecentPlaceEvent;
import com.tinder.places.analytics.AddPlacesViewEvent;
import com.tinder.places.analytics.C10112a;
import com.tinder.places.analytics.C10114d;
import com.tinder.places.analytics.C10115e;
import com.tinder.places.analytics.C10118h;
import com.tinder.places.card.presenter.C10127a;
import com.tinder.places.card.presenter.C10129c;
import com.tinder.places.card.presenter.C10133f;
import com.tinder.places.card.presenter.PlacesCardViewPresenter;
import com.tinder.places.card.view.C12317d;
import com.tinder.places.card.view.C12320h;
import com.tinder.places.card.view.C12322k;
import com.tinder.places.card.view.C12323l;
import com.tinder.places.card.view.PlaceCardAlternativesView;
import com.tinder.places.card.view.PlaceCardFrontView;
import com.tinder.places.card.view.PlaceCardView;
import com.tinder.places.card.view.PlaceRecTeasersView;
import com.tinder.places.carousel.p309a.C10190b;
import com.tinder.places.carousel.presenter.C10194c;
import com.tinder.places.carousel.presenter.PlacesCarouselLoadingContainerPresenter;
import com.tinder.places.carousel.view.C12333h;
import com.tinder.places.carousel.view.C12334i;
import com.tinder.places.carousel.view.CarouselLayoutManager;
import com.tinder.places.carousel.view.PlacesCarouselLoadingContainerView;
import com.tinder.places.carousel.view.PlacesCarouselView;
import com.tinder.places.injection.C10213b;
import com.tinder.places.injection.C13577c;
import com.tinder.places.injection.C13578d;
import com.tinder.places.injection.C13579e;
import com.tinder.places.injection.C13580f;
import com.tinder.places.injection.C13585l;
import com.tinder.places.injection.PlacesComponent;
import com.tinder.places.main.presenter.C10217a;
import com.tinder.places.main.presenter.C10220d;
import com.tinder.places.main.presenter.C10223f;
import com.tinder.places.main.view.C12370a;
import com.tinder.places.main.view.C12371b;
import com.tinder.places.main.view.C12373d;
import com.tinder.places.main.view.C12376g;
import com.tinder.places.main.view.PlacesPinDropView;
import com.tinder.places.main.view.PlacesView;
import com.tinder.places.map.p314a.C10229a;
import com.tinder.places.map.view.C12391e;
import com.tinder.places.map.view.C14217c;
import com.tinder.places.p311f.C12337b;
import com.tinder.places.p311f.C12338c;
import com.tinder.places.p311f.C12339d;
import com.tinder.places.p311f.C12340e;
import com.tinder.places.p311f.C12342g;
import com.tinder.places.p311f.C12345i;
import com.tinder.places.p311f.C12347l;
import com.tinder.places.provider.C10271c;
import com.tinder.places.provider.C12412a;
import com.tinder.places.provider.PlacesEnabledProvider;
import com.tinder.places.provider.SelectedPlaceProvider;
import com.tinder.places.recs.presenter.C10279f;
import com.tinder.places.recs.view.C12446e;
import com.tinder.places.recs.view.PlacesUserRecCardView;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.UserRecCardHeadLineView_MembersInjector;
import com.tinder.views.grid.C17263c;
import com.tinder.views.grid.GridUserRecCardHeadlineView;
import com.tinder.views.grid.p449a.C15453a;
import dagger.internal.C17281c;
import javax.inject.Provider;

final class a$q implements PlacesComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f33665a;
    /* renamed from: b */
    private C10213b f33666b;
    /* renamed from: c */
    private Provider<SelectedPlaceProvider> f33667c;
    /* renamed from: d */
    private Provider<C15453a> f33668d;

    private a$q(C4423a c4423a, a$p a_p) {
        this.f33665a = c4423a;
        m42003a(a_p);
    }

    /* renamed from: a */
    private C10896d m41990a() {
        return new C10896d((PlacesRepository) C4423a.eG(this.f33665a).get());
    }

    /* renamed from: b */
    private C10894b m42004b() {
        return new C10894b((PlacesRepository) C4423a.eG(this.f33665a).get());
    }

    /* renamed from: c */
    private AddPlacesViewEvent m42005c() {
        return new AddPlacesViewEvent((C2630h) C4423a.u(this.f33665a).get(), m42004b());
    }

    /* renamed from: d */
    private C10114d m42006d() {
        return new C10114d((C2630h) C4423a.u(this.f33665a).get());
    }

    /* renamed from: e */
    private AddPlacesManageEnabledEvent m42007e() {
        return new AddPlacesManageEnabledEvent((C2630h) C4423a.u(this.f33665a).get());
    }

    /* renamed from: f */
    private C10223f m42008f() {
        return new C10223f((PlacesConfigProvider) C4423a.bG(this.f33665a).get(), (PlacesLoadedStateProvider) C4423a.eI(this.f33665a).get(), m41990a(), (SelectedPlaceProvider) this.f33667c.get(), C4423a.eJ(this.f33665a), (PlacesEnabledProvider) C4423a.eK(this.f33665a).get(), this.f33665a.loadProfileOptionData(), m42005c(), m42006d(), m42004b(), new C12345i(), (CurrentScreenNotifier) C4423a.M(this.f33665a).get(), (C2634g) C4423a.eL(this.f33665a).get(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(C4423a.aI(this.f33665a)), m42007e(), (C10271c) C4423a.bI(this.f33665a).get(), (PlacesOnboardingProgressProvider) C4423a.eM(this.f33665a).get(), C4423a.eN(this.f33665a));
    }

    /* renamed from: g */
    private C12337b m42009g() {
        return C13577c.m52999a(this.f33666b, (PlacesRepository) C4423a.eG(this.f33665a).get());
    }

    /* renamed from: h */
    private PlacesCarouselLoadingContainerPresenter m42010h() {
        return new PlacesCarouselLoadingContainerPresenter(C13156x9c0cf4b0.proxyProvidesRxJava1ComputationScheduler$domain_release(C4423a.aF(this.f33665a)), (PlacesLoadedStateProvider) C4423a.eI(this.f33665a).get(), m42004b(), m42009g());
    }

    /* renamed from: i */
    private C12342g m42011i() {
        return new C12342g((PlacesRepository) C4423a.eG(this.f33665a).get());
    }

    /* renamed from: j */
    private C10194c m42012j() {
        return new C10194c(m42009g(), (SelectedPlaceProvider) this.f33667c.get(), m42011i());
    }

    /* renamed from: k */
    private CarouselLayoutManager m42013k() {
        return new CarouselLayoutManager(new C10190b());
    }

    /* renamed from: l */
    private C10115e m42014l() {
        return new C10115e((C2630h) C4423a.u(this.f33665a).get());
    }

    /* renamed from: m */
    private C10229a m42015m() {
        return new C10229a(m42009g(), (SelectedPlaceProvider) this.f33667c.get(), (C8588a) C4423a.aJ(this.f33665a).get(), (C12412a) C4423a.eO(this.f33665a).get(), m42014l(), (PlacesLoadedStateProvider) C4423a.eI(this.f33665a).get());
    }

    /* renamed from: n */
    private C12340e m42016n() {
        return new C12340e((PlacesRepository) C4423a.eG(this.f33665a).get());
    }

    /* renamed from: o */
    private C12339d m42017o() {
        return new C12339d((PlacesRepository) C4423a.eG(this.f33665a).get());
    }

    /* renamed from: p */
    private C10893a m42018p() {
        return new C10893a((PlacesRepository) C4423a.eG(this.f33665a).get());
    }

    /* renamed from: q */
    private C10895c m42019q() {
        return new C10895c((PlacesRepository) C4423a.eG(this.f33665a).get());
    }

    /* renamed from: r */
    private C10112a m42020r() {
        return new C10112a((C2630h) C4423a.u(this.f33665a).get());
    }

    /* renamed from: s */
    private AddPlacesRecentPlaceViewEvent m42021s() {
        return new AddPlacesRecentPlaceViewEvent((C2630h) C4423a.u(this.f33665a).get());
    }

    /* renamed from: t */
    private C12338c m42022t() {
        return new C12338c((PlacesRepository) C4423a.eG(this.f33665a).get());
    }

    /* renamed from: u */
    private AddPlacesRemoveRecentPlaceEvent m42023u() {
        return new AddPlacesRemoveRecentPlaceEvent((C2630h) C4423a.u(this.f33665a).get());
    }

    /* renamed from: v */
    private C10118h m42024v() {
        return new C10118h((C2630h) C4423a.u(this.f33665a).get());
    }

    /* renamed from: w */
    private PlacesCardViewPresenter m42025w() {
        return new PlacesCardViewPresenter(m42016n(), m42017o(), m42018p(), m42019q(), (SelectedPlaceProvider) this.f33667c.get(), (C12412a) C4423a.eO(this.f33665a).get(), m42020r(), m42021s(), m42022t(), m42023u(), m42024v());
    }

    /* renamed from: x */
    private C12347l m42026x() {
        return new C12347l((PlacesRepository) C4423a.eG(this.f33665a).get());
    }

    /* renamed from: y */
    private C10127a m42027y() {
        return new C10127a(m42026x(), m42019q(), m42020r());
    }

    /* renamed from: z */
    private C10129c m42028z() {
        return new C10129c(C4423a.ay(this.f33665a), C4423a.aM(this.f33665a));
    }

    /* renamed from: A */
    private C10279f m41988A() {
        return new C10279f(C4423a.ec(this.f33665a));
    }

    /* renamed from: B */
    private C10217a m41989B() {
        return new C10217a(this.f33665a.loadProfileOptionData());
    }

    /* renamed from: a */
    private void m42003a(a$p a_p) {
        this.f33667c = C17281c.a(C13580f.m53009b(a_p.f33662b));
        this.f33666b = a_p.f33662b;
        this.f33668d = C17281c.a(C13585l.m53029b(a_p.f33663c));
    }

    public void inject(PlacesView placesView) {
        m41998a(placesView);
    }

    public void inject(PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView) {
        m41995a(placesCarouselLoadingContainerView);
    }

    public void inject(PlacesCarouselView placesCarouselView) {
        m41996a(placesCarouselView);
    }

    public void inject(C14217c c14217c) {
        m42000a(c14217c);
    }

    public void inject(PlaceCardView placeCardView) {
        m41993a(placeCardView);
    }

    public void inject(PlaceCardAlternativesView placeCardAlternativesView) {
        m41991a(placeCardAlternativesView);
    }

    public void inject(PlaceCardFrontView placeCardFrontView) {
        m41992a(placeCardFrontView);
    }

    public void inject(PlacesUserRecCardView placesUserRecCardView) {
        m42001a(placesUserRecCardView);
    }

    public void inject(GridUserRecCardHeadlineView gridUserRecCardHeadlineView) {
        m42002a(gridUserRecCardHeadlineView);
    }

    public void inject(PlaceRecTeasersView placeRecTeasersView) {
        m41994a(placeRecTeasersView);
    }

    public void inject(PlacesPinDropView placesPinDropView) {
        m41997a(placesPinDropView);
    }

    public void inject(C12370a c12370a) {
        m41999a(c12370a);
    }

    /* renamed from: a */
    private PlacesView m41998a(PlacesView placesView) {
        C12376g.m48777a(placesView, m42008f());
        C12376g.m48778a(placesView, ex.m52497b(C4423a.eP(this.f33665a)));
        return placesView;
    }

    /* renamed from: a */
    private PlacesCarouselLoadingContainerView m41995a(PlacesCarouselLoadingContainerView placesCarouselLoadingContainerView) {
        C12333h.m48714a(placesCarouselLoadingContainerView, m42010h());
        return placesCarouselLoadingContainerView;
    }

    /* renamed from: a */
    private PlacesCarouselView m41996a(PlacesCarouselView placesCarouselView) {
        C12334i.m48716a(placesCarouselView, C13579e.m53006b(this.f33666b));
        C12334i.m48717a(placesCarouselView, m42012j());
        C12334i.m48718a(placesCarouselView, m42013k());
        return placesCarouselView;
    }

    /* renamed from: a */
    private C14217c m42000a(C14217c c14217c) {
        C12391e.m48794a(c14217c, m42015m());
        return c14217c;
    }

    /* renamed from: a */
    private PlaceCardView m41993a(PlaceCardView placeCardView) {
        C12322k.m48659a(placeCardView, m42025w());
        return placeCardView;
    }

    /* renamed from: a */
    private PlaceCardAlternativesView m41991a(PlaceCardAlternativesView placeCardAlternativesView) {
        C12317d.m48653a(placeCardAlternativesView, m42027y());
        return placeCardAlternativesView;
    }

    /* renamed from: a */
    private PlaceCardFrontView m41992a(PlaceCardFrontView placeCardFrontView) {
        C12320h.m48657a(placeCardFrontView, m42028z());
        return placeCardFrontView;
    }

    /* renamed from: a */
    private PlacesUserRecCardView m42001a(PlacesUserRecCardView placesUserRecCardView) {
        C17263c.a(placesUserRecCardView, (UserRecActivePhotoIndexProvider) C4423a.cB(this.f33665a).get());
        C17263c.a(placesUserRecCardView, (C15453a) this.f33668d.get());
        C12446e.m48932a(placesUserRecCardView, m41988A());
        return placesUserRecCardView;
    }

    /* renamed from: a */
    private GridUserRecCardHeadlineView m42002a(GridUserRecCardHeadlineView gridUserRecCardHeadlineView) {
        UserRecCardHeadLineView_MembersInjector.injectFastMatchConfigProvider(gridUserRecCardHeadlineView, (FastMatchConfigProvider) C4423a.ao(this.f33665a).get());
        UserRecCardHeadLineView_MembersInjector.injectTopPicksConfig(gridUserRecCardHeadlineView, this.f33665a.topPicksConfig());
        return gridUserRecCardHeadlineView;
    }

    /* renamed from: a */
    private PlaceRecTeasersView m41994a(PlaceRecTeasersView placeRecTeasersView) {
        C12323l.m48661a(placeRecTeasersView, new C10133f());
        return placeRecTeasersView;
    }

    /* renamed from: a */
    private PlacesPinDropView m41997a(PlacesPinDropView placesPinDropView) {
        C12373d.m48775a(placesPinDropView, new C10220d());
        return placesPinDropView;
    }

    /* renamed from: a */
    private C12370a m41999a(C12370a c12370a) {
        C12371b.m48769a(c12370a, m41989B());
        C12371b.m48770a(c12370a, C13578d.m53003b(this.f33666b));
        return c12370a;
    }
}
