package com.tinder.application;

import android.content.Context;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.places.provider.PlacesOnboardingProgressProvider;
import com.tinder.managers.bj;
import com.tinder.places.analytics.AddPlacesManageEnabledEvent;
import com.tinder.places.analytics.AddPlacesOnboardingEvent;
import com.tinder.places.injection.C10213b;
import com.tinder.places.injection.C13578d;
import com.tinder.places.injection.C13585l;
import com.tinder.places.injection.PlacesOnboardingComponent;
import com.tinder.places.main.presenter.C10220d;
import com.tinder.places.main.view.C12373d;
import com.tinder.places.main.view.PlacesPinDropView;
import com.tinder.places.onboarding.C12394a;
import com.tinder.places.onboarding.C12397b;
import com.tinder.places.onboarding.C12398c;
import com.tinder.places.onboarding.C12399d;
import com.tinder.places.onboarding.C12400e;
import com.tinder.places.onboarding.C12401f;
import com.tinder.places.onboarding.C12402g;
import com.tinder.places.onboarding.C12403h;
import com.tinder.places.onboarding.C12404i;
import com.tinder.places.onboarding.PlacesOnboardingActivity;
import com.tinder.places.onboarding.p316b.C12396a;
import com.tinder.places.onboarding.presenter.C10265a;
import com.tinder.places.onboarding.presenter.C10267c;
import com.tinder.places.p311f.C12345i;
import com.tinder.places.provider.PlacesEnabledProvider;
import com.tinder.places.recs.presenter.C10279f;
import com.tinder.places.recs.view.C12446e;
import com.tinder.places.recs.view.PlacesUserRecCardView;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.recs.RecsCardFactory;
import com.tinder.recs.RecsPhotoUrlFactory;
import com.tinder.recs.card.CardSizeProvider;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.UserRecCardHeadLineView_MembersInjector;
import com.tinder.views.grid.C17263c;
import com.tinder.views.grid.GridUserRecCardHeadlineView;
import com.tinder.views.grid.p449a.C15453a;
import dagger.internal.C17281c;
import javax.inject.Provider;

final class a$u implements PlacesOnboardingComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f33676a;
    /* renamed from: b */
    private C10213b f33677b;
    /* renamed from: c */
    private Provider<C15453a> f33678c;

    private a$u(C4423a c4423a, a$t a_t) {
        this.f33676a = c4423a;
        m42045a(a_t);
    }

    /* renamed from: a */
    private C12396a m42039a() {
        return new C12396a((Context) C4423a.aR(this.f33676a).get(), this.f33676a.loadProfileOptionData());
    }

    /* renamed from: b */
    private AddPlacesOnboardingEvent m42046b() {
        return new AddPlacesOnboardingEvent((C2630h) C4423a.u(this.f33676a).get());
    }

    /* renamed from: c */
    private AddPlacesManageEnabledEvent m42047c() {
        return new AddPlacesManageEnabledEvent((C2630h) C4423a.u(this.f33676a).get());
    }

    /* renamed from: d */
    private C10267c m42048d() {
        return new C10267c(m42039a(), C4423a.aM(this.f33676a), (PlacesEnabledProvider) C4423a.eK(this.f33676a).get(), m42046b(), new C12345i(), m42047c(), (PlacesOnboardingProgressProvider) C4423a.eM(this.f33676a).get(), (AbTestUtility) C4423a.f(this.f33676a).get());
    }

    /* renamed from: e */
    private C14418b m42049e() {
        return new C14418b(this.f33676a.resources(), (bj) C4423a.W(this.f33676a).get(), C4423a.X(this.f33676a), (CurrentUserProvider) C4423a.Y(this.f33676a).get());
    }

    /* renamed from: f */
    private RecsCardFactory m42050f() {
        return new RecsCardFactory(new RecsPhotoUrlFactory(), (CardSizeProvider) C4423a.an(this.f33676a).get(), m42049e(), (AbTestUtility) C4423a.f(this.f33676a).get());
    }

    /* renamed from: g */
    private C10265a m42051g() {
        return new C10265a(m42050f());
    }

    /* renamed from: h */
    private C10279f m42052h() {
        return new C10279f(C4423a.ec(this.f33676a));
    }

    /* renamed from: a */
    private void m42045a(a$t a_t) {
        this.f33677b = a_t.f33673b;
        this.f33678c = C17281c.a(C13585l.m53029b(a_t.f33674c));
    }

    public void inject(PlacesOnboardingActivity placesOnboardingActivity) {
        m42037a(placesOnboardingActivity);
    }

    public void inject(C12399d c12399d) {
        m42040a(c12399d);
    }

    public void inject(C12401f c12401f) {
        m42041a(c12401f);
    }

    public void inject(C12394a c12394a) {
        m42038a(c12394a);
    }

    public void inject(C12403h c12403h) {
        m42042a(c12403h);
    }

    public void inject(PlacesUserRecCardView placesUserRecCardView) {
        m42043a(placesUserRecCardView);
    }

    public void inject(GridUserRecCardHeadlineView gridUserRecCardHeadlineView) {
        m42044a(gridUserRecCardHeadlineView);
    }

    public void inject(PlacesPinDropView placesPinDropView) {
        m42036a(placesPinDropView);
    }

    /* renamed from: a */
    private PlacesOnboardingActivity m42037a(PlacesOnboardingActivity placesOnboardingActivity) {
        C12398c.m48821a(placesOnboardingActivity, m42048d());
        return placesOnboardingActivity;
    }

    /* renamed from: a */
    private C12399d m42040a(C12399d c12399d) {
        C12400e.m48825a(c12399d, m42051g());
        return c12399d;
    }

    /* renamed from: a */
    private C12401f m42041a(C12401f c12401f) {
        C12402g.m48832a(c12401f, C13578d.m53003b(this.f33677b));
        return c12401f;
    }

    /* renamed from: a */
    private C12394a m42038a(C12394a c12394a) {
        C12397b.m48819a(c12394a, C13578d.m53003b(this.f33677b));
        return c12394a;
    }

    /* renamed from: a */
    private C12403h m42042a(C12403h c12403h) {
        C12404i.m48836a(c12403h, C13578d.m53003b(this.f33677b));
        return c12403h;
    }

    /* renamed from: a */
    private PlacesUserRecCardView m42043a(PlacesUserRecCardView placesUserRecCardView) {
        C17263c.a(placesUserRecCardView, (UserRecActivePhotoIndexProvider) C4423a.cB(this.f33676a).get());
        C17263c.a(placesUserRecCardView, (C15453a) this.f33678c.get());
        C12446e.m48932a(placesUserRecCardView, m42052h());
        return placesUserRecCardView;
    }

    /* renamed from: a */
    private GridUserRecCardHeadlineView m42044a(GridUserRecCardHeadlineView gridUserRecCardHeadlineView) {
        UserRecCardHeadLineView_MembersInjector.injectFastMatchConfigProvider(gridUserRecCardHeadlineView, (FastMatchConfigProvider) C4423a.ao(this.f33676a).get());
        UserRecCardHeadLineView_MembersInjector.injectTopPicksConfig(gridUserRecCardHeadlineView, this.f33676a.topPicksConfig());
        return gridUserRecCardHeadlineView;
    }

    /* renamed from: a */
    private PlacesPinDropView m42036a(PlacesPinDropView placesPinDropView) {
        C12373d.m48775a(placesPinDropView, new C10220d());
        return placesPinDropView;
    }
}
