package com.tinder.application;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.TinderApi;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.provider.C12790h;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.fastmatch.p324a.C10766a;
import com.tinder.data.fastmatch.p324a.C12864c;
import com.tinder.data.fastmatch.usecase.C10770b;
import com.tinder.data.fastmatch.usecase.C8650a;
import com.tinder.data.fastmatch.usecase.C8651f;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.fastmatch.RefreshNotifier;
import com.tinder.domain.fastmatch.newCount.NewCountFetcher;
import com.tinder.domain.fastmatch.newCount.usecase.ObserveNewCountUpdate;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.fastmatch.repository.FastMatchRecsResponseRepository;
import com.tinder.domain.fastmatch.repository.NewCountRepository;
import com.tinder.domain.match.provider.NewMatchProvider;
import com.tinder.domain.meta.providers.AuthStatusProvider;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.fastmatch.C13188b;
import com.tinder.fastmatch.C13189c;
import com.tinder.fastmatch.C13190d;
import com.tinder.fastmatch.C13191e;
import com.tinder.fastmatch.C13192f;
import com.tinder.fastmatch.C13193g;
import com.tinder.fastmatch.C13194h;
import com.tinder.fastmatch.C13195i;
import com.tinder.fastmatch.C13196j;
import com.tinder.fastmatch.C13197k;
import com.tinder.fastmatch.FastMatchRecsActivityComponent;
import com.tinder.fastmatch.analytics.C11613a;
import com.tinder.fastmatch.analytics.C11614b;
import com.tinder.fastmatch.analytics.C11615c;
import com.tinder.fastmatch.analytics.C11616d;
import com.tinder.fastmatch.analytics.C11617e;
import com.tinder.fastmatch.analytics.C11618f;
import com.tinder.fastmatch.analytics.C13183h;
import com.tinder.fastmatch.analytics.C9372g;
import com.tinder.fastmatch.analytics.LikesYouListEtlEventsFactory;
import com.tinder.fastmatch.newcount.C13200d;
import com.tinder.fastmatch.newcount.C9380a;
import com.tinder.fastmatch.newcount.C9383e;
import com.tinder.fastmatch.p246f.C9379a;
import com.tinder.fastmatch.presenter.C11629g;
import com.tinder.fastmatch.presenter.C11648i;
import com.tinder.fastmatch.presenter.C9395n;
import com.tinder.fastmatch.presenter.C9397p;
import com.tinder.fastmatch.view.C11676e;
import com.tinder.fastmatch.view.C11677f;
import com.tinder.fastmatch.view.C11678h;
import com.tinder.fastmatch.view.C11679i;
import com.tinder.fastmatch.view.FastMatchRecsActivity;
import com.tinder.fastmatch.view.FastMatchRecsActivity.Source;
import com.tinder.fastmatch.view.FastMatchRecsToolbarView;
import com.tinder.fastmatch.view.FastMatchRecsView;
import com.tinder.fastmatch.view.FastMatchUserRecCardView;
import com.tinder.gamepadcounters.C9673c;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.recs.RecsCardFactory;
import com.tinder.recs.RecsPhotoUrlFactory;
import com.tinder.recs.card.CardSizeProvider;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.view.UserRecCardHeadLineView;
import com.tinder.recs.view.UserRecCardHeadLineView_MembersInjector;
import com.tinder.recsgrid.C14782d;
import com.tinder.recsgrid.C16487f;
import com.tinder.recsgrid.ScrollStatusNotifier;
import com.tinder.recsgrid.ScrollStatusProvider;
import com.tinder.views.grid.C17263c;
import com.tinder.views.grid.C17264e;
import com.tinder.views.grid.p449a.C15453a;
import dagger.internal.C17281c;
import javax.inject.Provider;

final class a$j implements FastMatchRecsActivityComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f33527a;
    /* renamed from: b */
    private Source f33528b;
    /* renamed from: c */
    private Provider<C9372g> f33529c;
    /* renamed from: d */
    private Provider<NewCountRepository> f33530d;
    /* renamed from: e */
    private Provider<RefreshNotifier> f33531e;
    /* renamed from: f */
    private Provider<FastMatchRecsResponseRepository> f33532f;
    /* renamed from: g */
    private Provider<NewCountFetcher> f33533g;
    /* renamed from: h */
    private C13200d f33534h;
    /* renamed from: i */
    private Provider<C9383e> f33535i;
    /* renamed from: j */
    private Provider<C15453a> f33536j;
    /* renamed from: k */
    private Provider<C16487f> f33537k;
    /* renamed from: l */
    private Provider<ScrollStatusNotifier> f33538l;
    /* renamed from: m */
    private Provider<ScrollStatusProvider> f33539m;
    /* renamed from: n */
    private Provider<C14782d> f33540n;

    private a$j(C4423a c4423a, a$i a_i) {
        this.f33527a = c4423a;
        m41827a(a_i);
    }

    /* renamed from: a */
    private C10770b m41821a() {
        return new C10770b((TinderApi) C4423a.cC(this.f33527a).get(), new C10766a(), (FastMatchStatusProvider) C4423a.aC(this.f33527a).get(), (AuthStatusProvider) C4423a.eA(this.f33527a).get());
    }

    /* renamed from: b */
    private C8651f m41828b() {
        return new C8651f((FastMatchStatusProvider) C4423a.aC(this.f33527a).get());
    }

    /* renamed from: c */
    private LikesYouListEtlEventsFactory m41829c() {
        return new LikesYouListEtlEventsFactory(this.f33528b, (FastMatchStatusProvider) C4423a.aC(this.f33527a).get(), (C9372g) this.f33529c.get(), C4423a.eB(this.f33527a), (NewCountRepository) this.f33530d.get());
    }

    /* renamed from: d */
    private C11614b m41830d() {
        return new C11614b((C2630h) C4423a.u(this.f33527a).get(), m41829c());
    }

    /* renamed from: e */
    private C11615c m41831e() {
        return new C11615c((C2630h) C4423a.u(this.f33527a).get(), m41829c());
    }

    /* renamed from: f */
    private C11616d m41832f() {
        return new C11616d((C2630h) C4423a.u(this.f33527a).get(), m41829c());
    }

    /* renamed from: g */
    private C11618f m41833g() {
        return new C11618f((C2630h) C4423a.u(this.f33527a).get(), m41829c(), (C9372g) this.f33529c.get());
    }

    /* renamed from: h */
    private ObserveNewCountUpdate m41834h() {
        return new ObserveNewCountUpdate((NewCountRepository) this.f33530d.get());
    }

    /* renamed from: i */
    private C9380a m41835i() {
        return new C9380a((AbTestUtility) C4423a.f(this.f33527a).get(), (FastMatchConfigProvider) C4423a.ao(this.f33527a).get(), (bk) C4423a.j(this.f33527a).get());
    }

    /* renamed from: j */
    private C11629g m41836j() {
        return new C11629g(C4423a.eC(this.f33527a), (RecsEngineRegistry) C4423a.cq(this.f33527a).get(), m41821a(), C4423a.eD(this.f33527a), m41828b(), (C9372g) this.f33529c.get(), m41830d(), m41831e(), m41832f(), m41833g(), (bk) C4423a.j(this.f33527a).get(), m41834h(), (C9383e) this.f33535i.get(), (RefreshNotifier) this.f33531e.get(), (FastMatchConfigProvider) C4423a.ao(this.f33527a).get(), m41835i(), (C9673c) C4423a.cx(this.f33527a).get(), (CurrentScreenNotifier) C4423a.M(this.f33527a).get());
    }

    /* renamed from: k */
    private C14418b m41837k() {
        return new C14418b(this.f33527a.resources(), (bj) C4423a.W(this.f33527a).get(), C4423a.X(this.f33527a), (CurrentUserProvider) C4423a.Y(this.f33527a).get());
    }

    /* renamed from: l */
    private RecsCardFactory m41838l() {
        return new RecsCardFactory(new RecsPhotoUrlFactory(), (CardSizeProvider) C4423a.an(this.f33527a).get(), m41837k(), (AbTestUtility) C4423a.f(this.f33527a).get());
    }

    /* renamed from: m */
    private C8650a m41839m() {
        return new C8650a((FastMatchStatusProvider) C4423a.aC(this.f33527a).get());
    }

    /* renamed from: n */
    private C9379a m41840n() {
        return new C9379a((bk) C4423a.j(this.f33527a).get(), (FastMatchConfigProvider) C4423a.ao(this.f33527a).get());
    }

    /* renamed from: o */
    private C11613a m41841o() {
        return new C11613a((C2630h) C4423a.u(this.f33527a).get(), m41829c());
    }

    /* renamed from: p */
    private C11648i m41842p() {
        return new C11648i(m41838l(), C4423a.eC(this.f33527a), m41839m(), m41821a(), (FastMatchStatusProvider) C4423a.aC(this.f33527a).get(), (RatingProcessor) C4423a.cK(this.f33527a).get(), (C9372g) this.f33529c.get(), (FastMatchConfigProvider) C4423a.ao(this.f33527a).get(), m41840n(), m41841o(), (C15453a) this.f33536j.get(), (RefreshNotifier) this.f33531e.get(), (NewMatchProvider) C4423a.eE(this.f33527a).get(), m41833g(), m41835i(), (FastMatchRecsResponseRepository) this.f33532f.get(), (ScrollStatusNotifier) this.f33538l.get(), (ScrollStatusProvider) this.f33539m.get(), (C14782d) this.f33540n.get());
    }

    /* renamed from: q */
    private C11617e m41843q() {
        return new C11617e((C2630h) C4423a.u(this.f33527a).get(), m41829c());
    }

    /* renamed from: r */
    private C9395n m41844r() {
        return new C9395n((FastMatchStatusProvider) C4423a.aC(this.f33527a).get(), m41843q(), (C9372g) this.f33529c.get());
    }

    /* renamed from: s */
    private C9397p m41845s() {
        return new C9397p(C4423a.ec(this.f33527a));
    }

    /* renamed from: a */
    private void m41827a(a$i a_i) {
        this.f33529c = C17281c.a(C13183h.m51132b(C12790h.m50280c()));
        this.f33528b = a_i.f33526c;
        this.f33530d = C17281c.a(C13190d.m51147b(a_i.f33525b));
        this.f33531e = C17281c.a(C13197k.m51175b(a_i.f33525b));
        this.f33532f = C17281c.a(C13188b.m51140b(a_i.f33525b, C4423a.eF(this.f33527a)));
        this.f33533g = C17281c.a(C13189c.m51144b(a_i.f33525b, C4423a.cC(this.f33527a), C12864c.m50501c(), C4423a.ao(this.f33527a)));
        this.f33534h = C13200d.m51181b(C4423a.cN(this.f33527a), C4423a.ao(this.f33527a));
        this.f33535i = C17281c.a(C13191e.m51152b(a_i.f33525b, this.f33531e, this.f33532f, this.f33533g, this.f33534h, this.f33530d));
        this.f33536j = C17281c.a(C13196j.m51171b(a_i.f33525b));
        this.f33537k = C17281c.a(C13194h.m51163b(a_i.f33525b));
        this.f33538l = C17281c.a(C13193g.m51160b(a_i.f33525b, this.f33537k));
        this.f33539m = C17281c.a(C13195i.m51168b(a_i.f33525b, this.f33537k));
        this.f33540n = C17281c.a(C13192f.m51155b(a_i.f33525b));
    }

    public void inject(FastMatchRecsActivity fastMatchRecsActivity) {
        m41822a(fastMatchRecsActivity);
    }

    public void inject(FastMatchRecsView fastMatchRecsView) {
        m41824a(fastMatchRecsView);
    }

    public void inject(FastMatchRecsToolbarView fastMatchRecsToolbarView) {
        m41823a(fastMatchRecsToolbarView);
    }

    public void inject(FastMatchUserRecCardView fastMatchUserRecCardView) {
        m41825a(fastMatchUserRecCardView);
    }

    public void inject(UserRecCardHeadLineView userRecCardHeadLineView) {
        m41826a(userRecCardHeadLineView);
    }

    /* renamed from: a */
    private FastMatchRecsActivity m41822a(FastMatchRecsActivity fastMatchRecsActivity) {
        C11676e.m47470a(fastMatchRecsActivity, m41836j());
        C11676e.m47471a(fastMatchRecsActivity, (Register) C4423a.C(this.f33527a).get());
        C11676e.m47472a(fastMatchRecsActivity, C4423a.F(this.f33527a));
        return fastMatchRecsActivity;
    }

    /* renamed from: a */
    private FastMatchRecsView m41824a(FastMatchRecsView fastMatchRecsView) {
        C17264e.a(fastMatchRecsView, (UserRecActivePhotoIndexProvider) C4423a.cB(this.f33527a).get());
        C17264e.a(fastMatchRecsView, C4423a.aS(this.f33527a));
        C11678h.m47476a(fastMatchRecsView, m41842p());
        C11678h.m47477a(fastMatchRecsView, (C14548a) C4423a.al(this.f33527a).get());
        C11678h.m47478a(fastMatchRecsView, C4423a.am(this.f33527a));
        return fastMatchRecsView;
    }

    /* renamed from: a */
    private FastMatchRecsToolbarView m41823a(FastMatchRecsToolbarView fastMatchRecsToolbarView) {
        C11677f.m47474a(fastMatchRecsToolbarView, m41844r());
        return fastMatchRecsToolbarView;
    }

    /* renamed from: a */
    private FastMatchUserRecCardView m41825a(FastMatchUserRecCardView fastMatchUserRecCardView) {
        C17263c.a(fastMatchUserRecCardView, (UserRecActivePhotoIndexProvider) C4423a.cB(this.f33527a).get());
        C17263c.a(fastMatchUserRecCardView, (C15453a) this.f33536j.get());
        C11679i.m47480a(fastMatchUserRecCardView, m41845s());
        return fastMatchUserRecCardView;
    }

    /* renamed from: a */
    private UserRecCardHeadLineView m41826a(UserRecCardHeadLineView userRecCardHeadLineView) {
        UserRecCardHeadLineView_MembersInjector.injectFastMatchConfigProvider(userRecCardHeadLineView, (FastMatchConfigProvider) C4423a.ao(this.f33527a).get());
        UserRecCardHeadLineView_MembersInjector.injectTopPicksConfig(userRecCardHeadLineView, this.f33527a.topPicksConfig());
        return userRecCardHeadLineView;
    }
}
