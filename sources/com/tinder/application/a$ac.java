package com.tinder.application;

import android.arch.lifecycle.Lifecycle;
import android.support.v7.app.AppCompatActivity;
import com.spotify.sdk.android.authentication.AuthenticationRequest.Builder;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.TinderUserApi;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.base.ActivityBase;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.adapter.C10735f;
import com.tinder.data.adapter.C10737j;
import com.tinder.data.adapter.C10745y;
import com.tinder.data.adapter.C12830d;
import com.tinder.data.adapter.C12831e;
import com.tinder.data.adapter.ag;
import com.tinder.data.adapter.an;
import com.tinder.data.user.C11086a;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.af;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.managers.bq;
import com.tinder.messageads.activity.C12118b;
import com.tinder.messageads.activity.MessageAdMatchProfileActivity;
import com.tinder.overflow.analytics.C12239a;
import com.tinder.overflow.analytics.C12245c;
import com.tinder.overflow.analytics.C13539b;
import com.tinder.profile.activities.C16070d;
import com.tinder.profile.activities.C16071f;
import com.tinder.profile.activities.CurrentUserProfileActivity;
import com.tinder.profile.activities.MatchProfileActivity;
import com.tinder.profile.activities.ProfileInstagramAuthActivity;
import com.tinder.profile.activities.ProfileSpotifyAuthActivity;
import com.tinder.profile.adapters.C14369o;
import com.tinder.profile.adapters.C17748l;
import com.tinder.profile.adapters.C17749n;
import com.tinder.profile.adapters.C17750r;
import com.tinder.profile.dialogs.C16104i;
import com.tinder.profile.dialogs.CensorMenuDialog;
import com.tinder.profile.dialogs.InstagramPhotoViewerDialog;
import com.tinder.profile.model.C17761b;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.profile.module.C14421a;
import com.tinder.profile.module.C17762b;
import com.tinder.profile.module.C17763c;
import com.tinder.profile.module.ProfileComponent;
import com.tinder.profile.p362a.C14358a;
import com.tinder.profile.p363b.C14372a;
import com.tinder.profile.p363b.C14376b;
import com.tinder.profile.p363b.C14385i;
import com.tinder.profile.p363b.C14392s;
import com.tinder.profile.p363b.C16075g;
import com.tinder.profile.p363b.C16076h;
import com.tinder.profile.p363b.C16080m;
import com.tinder.profile.p363b.C16082r;
import com.tinder.profile.p363b.C17753j;
import com.tinder.profile.p363b.C17755o;
import com.tinder.profile.p363b.C17756q;
import com.tinder.profile.p363b.ai;
import com.tinder.profile.presenter.C14422a;
import com.tinder.profile.presenter.C14424c;
import com.tinder.profile.presenter.C14429h;
import com.tinder.profile.presenter.C14434z;
import com.tinder.profile.presenter.C17768p;
import com.tinder.profile.presenter.ae;
import com.tinder.profile.presenter.ak;
import com.tinder.profile.presenter.ax;
import com.tinder.profile.presenter.bb;
import com.tinder.profile.presenter.bd;
import com.tinder.profile.presenter.be;
import com.tinder.profile.presenter.bn;
import com.tinder.profile.presenter.bp;
import com.tinder.profile.presenter.bt;
import com.tinder.profile.view.BasicInfoShareRecView;
import com.tinder.profile.view.BasicInfoView;
import com.tinder.profile.view.C16156a;
import com.tinder.profile.view.C16157c;
import com.tinder.profile.view.C16159k;
import com.tinder.profile.view.C16160l;
import com.tinder.profile.view.C16161m;
import com.tinder.profile.view.C16163p;
import com.tinder.profile.view.C16168v;
import com.tinder.profile.view.C16169w;
import com.tinder.profile.view.C16170x;
import com.tinder.profile.view.C17774o;
import com.tinder.profile.view.CurrentUserProfileView;
import com.tinder.profile.view.MatchProfileView;
import com.tinder.profile.view.ProfileAnthemView;
import com.tinder.profile.view.ProfileInstagramConnectView;
import com.tinder.profile.view.ProfileInstagramView;
import com.tinder.profile.view.ProfilePhotosView;
import com.tinder.profile.view.ProfileRecommendToFriendView;
import com.tinder.profile.view.ProfileReportUserView;
import com.tinder.profile.view.ProfileTopArtistsView;
import com.tinder.profile.view.ProfileView;
import com.tinder.profile.view.UserRecProfileView;
import com.tinder.profile.view.ac;
import com.tinder.profile.view.tappy.C16166a;
import com.tinder.profile.view.tappy.TappyProfileGamePadView;
import com.tinder.purchase.register.Register;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.recs.RecsPhotoUrlFactory;
import com.tinder.recs.analytics.AddRecsAllPhotosViewedEvent;
import com.tinder.recs.analytics.AddRecsPhotoViewEvent;
import com.tinder.recs.analytics.AddRecsProfileCloseEvent_Factory;
import com.tinder.recs.analytics.AddRecsProfileOpenEvent_Factory;
import com.tinder.recs.analytics.dedupe.RecsAllPhotosViewedDuplicateEventChecker;
import com.tinder.recs.analytics.dedupe.RecsPhotoViewDuplicateEventChecker;
import com.tinder.recs.card.CardSizeProvider;
import com.tinder.recs.model.TappyConfig;
import com.tinder.screenshotty.C14830c;
import com.tinder.spotify.audio.SpotifyAudioPlayer;
import com.tinder.spotify.p415a.C15035a;
import com.tinder.spotify.p416b.C18165v;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import com.tinder.updates.UpdatesScheduler;
import dagger.internal.C17281c;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

final class a$ac implements ProfileComponent {
    /* renamed from: a */
    final /* synthetic */ C4423a f33440a;
    /* renamed from: b */
    private C14421a f33441b;
    /* renamed from: c */
    private AppCompatActivity f33442c;
    /* renamed from: d */
    private Provider<TappyConfig> f33443d;
    /* renamed from: e */
    private C17761b f33444e;
    /* renamed from: f */
    private C17756q f33445f;
    /* renamed from: g */
    private AddRecsProfileOpenEvent_Factory f33446g;
    /* renamed from: h */
    private AddRecsProfileCloseEvent_Factory f33447h;
    /* renamed from: i */
    private C13539b f33448i;
    /* renamed from: j */
    private Provider<bp> f33449j;

    public void inject(CensorMenuDialog censorMenuDialog) {
    }

    public void inject(ProfileInstagramConnectView profileInstagramConnectView) {
    }

    public void inject(ProfilePhotosView profilePhotosView) {
    }

    private a$ac(C4423a c4423a, a$ab a_ab) {
        this.f33440a = c4423a;
        m41720a(a_ab);
    }

    /* renamed from: a */
    private be m41707a() {
        return new be((SpotifyAudioPlayer) C4423a.G(this.f33440a).get());
    }

    /* renamed from: b */
    private C14392s m41721b() {
        return new C14392s((C2630h) C4423a.u(this.f33440a).get(), (bk) C4423a.j(this.f33440a).get());
    }

    /* renamed from: c */
    private C14424c m41722c() {
        return new C14424c(C4423a.H(this.f33440a), m41721b());
    }

    /* renamed from: d */
    private C16080m m41723d() {
        return C17755o.a((C2630h) C4423a.u(this.f33440a).get());
    }

    /* renamed from: e */
    private C18165v m41724e() {
        return new C18165v((C15035a) C4423a.I(this.f33440a).get(), m41723d());
    }

    /* renamed from: f */
    private AddRecsPhotoViewEvent m41725f() {
        return new AddRecsPhotoViewEvent((C2630h) C4423a.u(this.f33440a).get(), (RecsPhotoViewDuplicateEventChecker) C4423a.J(this.f33440a).get());
    }

    /* renamed from: g */
    private AddRecsAllPhotosViewedEvent m41726g() {
        return new AddRecsAllPhotosViewedEvent((C2630h) C4423a.u(this.f33440a).get(), (RecsAllPhotosViewedDuplicateEventChecker) C4423a.K(this.f33440a).get());
    }

    /* renamed from: h */
    private ak m41727h() {
        return new ak((TappyConfig) this.f33443d.get(), m41725f(), m41726g(), (C14830c) C4423a.L(this.f33440a).get(), (AbTestUtility) C4423a.f(this.f33440a).get(), (CurrentScreenTracker) C4423a.M(this.f33440a).get(), C4423a.N(this.f33440a), C4423a.O(this.f33440a), (CurrentScreenNotifier) C4423a.M(this.f33440a).get(), C4423a.P(this.f33440a), C4423a.Q(this.f33440a));
    }

    /* renamed from: i */
    private C14369o m41728i() {
        return C17750r.a(C17749n.c());
    }

    /* renamed from: j */
    private Lifecycle m41729j() {
        return C17762b.a(this.f33441b, this.f33442c);
    }

    /* renamed from: k */
    private bn m41730k() {
        return new bn((LikeStatusProvider) C4423a.R(this.f33440a).get());
    }

    /* renamed from: l */
    private C16082r m41731l() {
        return new C16082r((C2630h) C4423a.u(this.f33440a).get());
    }

    /* renamed from: m */
    private C16075g m41732m() {
        return new C16075g((C2630h) C4423a.u(this.f33440a).get());
    }

    /* renamed from: n */
    private C16076h m41733n() {
        return new C16076h((C2630h) C4423a.u(this.f33440a).get());
    }

    /* renamed from: o */
    private C14358a m41734o() {
        return new C14358a(m41731l(), m41732m(), m41733n());
    }

    /* renamed from: p */
    private Object m41735p() {
        return C17774o.a(C4423a.r(this.f33440a));
    }

    /* renamed from: q */
    private ax m41736q() {
        return new ax(C4423a.H(this.f33440a), C4423a.P(this.f33440a), C4423a.Q(this.f33440a));
    }

    /* renamed from: r */
    private C12239a m41737r() {
        return new C12239a((C2630h) C4423a.u(this.f33440a).get());
    }

    /* renamed from: s */
    private bb m41738s() {
        return new bb(C4423a.S(this.f33440a), m41737r());
    }

    /* renamed from: t */
    private C14376b m41739t() {
        return new C14376b((C2630h) C4423a.u(this.f33440a).get());
    }

    /* renamed from: u */
    private C14372a m41740u() {
        return new C14372a((C2630h) C4423a.u(this.f33440a).get());
    }

    /* renamed from: v */
    private ae m41741v() {
        return new ae(m41739t(), (EnvironmentProvider) C4423a.c(this.f33440a).get(), m41740u(), C4423a.T(this.f33440a), (C2630h) C4423a.u(this.f33440a).get());
    }

    /* renamed from: w */
    private C12245c m41742w() {
        return new C12245c(C4423a.U(this.f33440a), m41737r());
    }

    /* renamed from: x */
    private C14422a m41743x() {
        return new C14422a(m41742w());
    }

    /* renamed from: y */
    private bd m41744y() {
        return new bd((C15035a) C4423a.I(this.f33440a).get(), (Builder) C4423a.V(this.f33440a).get());
    }

    /* renamed from: z */
    private C14385i m41745z() {
        return C17753j.a((C2630h) C4423a.u(this.f33440a).get());
    }

    /* renamed from: A */
    private C14418b m41694A() {
        return new C14418b(this.f33440a.resources(), (bj) C4423a.W(this.f33440a).get(), C4423a.X(this.f33440a), (CurrentUserProvider) C4423a.Y(this.f33440a).get());
    }

    /* renamed from: B */
    private C14429h m41695B() {
        return C17768p.a(m41745z(), C4423a.Z(this.f33440a), C17748l.d(), (bk) C4423a.j(this.f33440a).get(), m41694A(), C4423a.aa(this.f33440a), this.f33440a.loadProfileOptionData());
    }

    /* renamed from: C */
    private ag m41696C() {
        return new ag(new an(), C4423a.ab(this.f33440a), C4423a.ac(this.f33440a), C12830d.m50400d(), C4423a.ad(this.f33440a), new C10735f(), C12831e.m50404d());
    }

    /* renamed from: D */
    private C10745y m41697D() {
        return new C10745y(m41696C(), C4423a.ae(this.f33440a), new C10737j());
    }

    /* renamed from: E */
    private C11086a m41698E() {
        return new C11086a(m41697D(), (TinderUserApi) C4423a.af(this.f33440a).get());
    }

    /* renamed from: F */
    private ai m41699F() {
        return new ai(m41698E());
    }

    /* renamed from: G */
    private C14434z m41700G() {
        return new C14434z(m41699F(), m41694A(), C4423a.U(this.f33440a), (CurrentScreenNotifier) C4423a.M(this.f33440a).get());
    }

    /* renamed from: a */
    private void m41720a(a$ab a_ab) {
        this.f33443d = C17281c.a(C17763c.b(a_ab.f33438b, C4423a.ag(this.f33440a)));
        this.f33441b = a_ab.f33438b;
        this.f33442c = a_ab.f33439c;
        this.f33444e = C17761b.b(C4423a.ah(this.f33440a), C4423a.W(this.f33440a), C4423a.ai(this.f33440a), C4423a.Y(this.f33440a));
        this.f33445f = C17756q.b(C4423a.u(this.f33440a));
        this.f33446g = AddRecsProfileOpenEvent_Factory.create(C4423a.u(this.f33440a));
        this.f33447h = AddRecsProfileCloseEvent_Factory.create(C4423a.u(this.f33440a));
        this.f33448i = C13539b.m52919b(C4423a.u(this.f33440a));
        this.f33449j = C17281c.a(bt.b(this.f33444e, C4423a.aj(this.f33440a), this.f33445f, this.f33446g, this.f33447h, C4423a.u(this.f33440a), C4423a.f(this.f33440a), this.f33448i));
    }

    public void inject(ProfileTopArtistsView profileTopArtistsView) {
        m41716a(profileTopArtistsView);
    }

    public void inject(BasicInfoShareRecView basicInfoShareRecView) {
        m41708a(basicInfoShareRecView);
    }

    public void inject(ProfileAnthemView profileAnthemView) {
        m41712a(profileAnthemView);
    }

    public void inject(ProfileView profileView) {
        m41717a(profileView);
    }

    public void inject(TappyProfileGamePadView tappyProfileGamePadView) {
        m41719a(tappyProfileGamePadView);
    }

    public void inject(ProfileInstagramView profileInstagramView) {
        m41713a(profileInstagramView);
    }

    public void inject(ProfileRecommendToFriendView profileRecommendToFriendView) {
        m41714a(profileRecommendToFriendView);
    }

    public void inject(ProfileReportUserView profileReportUserView) {
        m41715a(profileReportUserView);
    }

    public void inject(InstagramPhotoViewerDialog instagramPhotoViewerDialog) {
        m41706a(instagramPhotoViewerDialog);
    }

    public void inject(ProfileInstagramAuthActivity profileInstagramAuthActivity) {
        m41704a(profileInstagramAuthActivity);
    }

    public void inject(MatchProfileActivity matchProfileActivity) {
        m41703a(matchProfileActivity);
    }

    public void inject(BasicInfoView basicInfoView) {
        m41709a(basicInfoView);
    }

    public void inject(ProfileSpotifyAuthActivity profileSpotifyAuthActivity) {
        m41705a(profileSpotifyAuthActivity);
    }

    public void inject(CurrentUserProfileView currentUserProfileView) {
        m41710a(currentUserProfileView);
    }

    public void inject(MatchProfileView matchProfileView) {
        m41711a(matchProfileView);
    }

    public void inject(UserRecProfileView userRecProfileView) {
        m41718a(userRecProfileView);
    }

    public void inject(CurrentUserProfileActivity currentUserProfileActivity) {
        m41702a(currentUserProfileActivity);
    }

    public void inject(MessageAdMatchProfileActivity messageAdMatchProfileActivity) {
        m41701a(messageAdMatchProfileActivity);
    }

    /* renamed from: a */
    private ProfileTopArtistsView m41716a(ProfileTopArtistsView profileTopArtistsView) {
        C16170x.a(profileTopArtistsView, m41707a());
        return profileTopArtistsView;
    }

    /* renamed from: a */
    private BasicInfoShareRecView m41708a(BasicInfoShareRecView basicInfoShareRecView) {
        C16156a.a(basicInfoShareRecView, m41722c());
        return basicInfoShareRecView;
    }

    /* renamed from: a */
    private ProfileAnthemView m41712a(ProfileAnthemView profileAnthemView) {
        C16161m.a(profileAnthemView, m41724e());
        C16161m.a(profileAnthemView, C4423a.ak(this.f33440a));
        C16161m.a(profileAnthemView, C17749n.c());
        return profileAnthemView;
    }

    /* renamed from: a */
    private ProfileView m41717a(ProfileView profileView) {
        ac.a(profileView, m41727h());
        ac.a(profileView, m41728i());
        ac.a(profileView, m41729j());
        ac.a(profileView, (C14548a) C4423a.al(this.f33440a).get());
        ac.a(profileView, C4423a.am(this.f33440a));
        return profileView;
    }

    /* renamed from: a */
    private TappyProfileGamePadView m41719a(TappyProfileGamePadView tappyProfileGamePadView) {
        C16166a.a(tappyProfileGamePadView, m41730k());
        return tappyProfileGamePadView;
    }

    /* renamed from: a */
    private ProfileInstagramView m41713a(ProfileInstagramView profileInstagramView) {
        C16163p.a(profileInstagramView, m41734o());
        C16163p.a(profileInstagramView, m41735p());
        return profileInstagramView;
    }

    /* renamed from: a */
    private ProfileRecommendToFriendView m41714a(ProfileRecommendToFriendView profileRecommendToFriendView) {
        C16168v.a(profileRecommendToFriendView, m41736q());
        C16168v.a(profileRecommendToFriendView, C4423a.O(this.f33440a));
        return profileRecommendToFriendView;
    }

    /* renamed from: a */
    private ProfileReportUserView m41715a(ProfileReportUserView profileReportUserView) {
        C16169w.a(profileReportUserView, m41738s());
        return profileReportUserView;
    }

    /* renamed from: a */
    private InstagramPhotoViewerDialog m41706a(InstagramPhotoViewerDialog instagramPhotoViewerDialog) {
        C16104i.a(instagramPhotoViewerDialog, (ManagerProfile) C4423a.v(this.f33440a).get());
        C16104i.a(instagramPhotoViewerDialog, (ManagerAnalytics) C4423a.p(this.f33440a).get());
        return instagramPhotoViewerDialog;
    }

    /* renamed from: a */
    private ProfileInstagramAuthActivity m41704a(ProfileInstagramAuthActivity profileInstagramAuthActivity) {
        C10358b.m42176a((ActivityBase) profileInstagramAuthActivity, (bk) C4423a.j(this.f33440a).get());
        C10358b.m42174a((ActivityBase) profileInstagramAuthActivity, (C2652a) C4423a.k(this.f33440a).get());
        C10358b.m42173a((ActivityBase) profileInstagramAuthActivity, (UserMetaManager) C4423a.l(this.f33440a).get());
        C10358b.m42172a((ActivityBase) profileInstagramAuthActivity, (ManagerFusedLocation) C4423a.m(this.f33440a).get());
        C10358b.m42177a((ActivityBase) profileInstagramAuthActivity, (com.tinder.managers.bt) C4423a.h(this.f33440a).get());
        C10358b.m42175a((ActivityBase) profileInstagramAuthActivity, (af) C4423a.n(this.f33440a).get());
        C10358b.m42178a((ActivityBase) profileInstagramAuthActivity, (C2664c) C4423a.o(this.f33440a).get());
        C10358b.m42171a((ActivityBase) profileInstagramAuthActivity, (ManagerAnalytics) C4423a.p(this.f33440a).get());
        C16070d.a(profileInstagramAuthActivity, m41741v());
        return profileInstagramAuthActivity;
    }

    /* renamed from: a */
    private MatchProfileActivity m41703a(MatchProfileActivity matchProfileActivity) {
        C10358b.m42176a((ActivityBase) matchProfileActivity, (bk) C4423a.j(this.f33440a).get());
        C10358b.m42174a((ActivityBase) matchProfileActivity, (C2652a) C4423a.k(this.f33440a).get());
        C10358b.m42173a((ActivityBase) matchProfileActivity, (UserMetaManager) C4423a.l(this.f33440a).get());
        C10358b.m42172a((ActivityBase) matchProfileActivity, (ManagerFusedLocation) C4423a.m(this.f33440a).get());
        C10358b.m42177a((ActivityBase) matchProfileActivity, (com.tinder.managers.bt) C4423a.h(this.f33440a).get());
        C10358b.m42175a((ActivityBase) matchProfileActivity, (af) C4423a.n(this.f33440a).get());
        C10358b.m42178a((ActivityBase) matchProfileActivity, (C2664c) C4423a.o(this.f33440a).get());
        C10358b.m42171a((ActivityBase) matchProfileActivity, (ManagerAnalytics) C4423a.p(this.f33440a).get());
        C10363g.m42184a((ActivitySignedInBase) matchProfileActivity, (bk) C4423a.j(this.f33440a).get());
        C10363g.m42183a((ActivitySignedInBase) matchProfileActivity, (ManagerProfile) C4423a.v(this.f33440a).get());
        C10363g.m42191a((ActivitySignedInBase) matchProfileActivity, (UpdatesScheduler) C4423a.w(this.f33440a).get());
        C10363g.m42182a((ActivitySignedInBase) matchProfileActivity, (ManagerDeepLinking) C4423a.x(this.f33440a).get());
        C10363g.m42185a((ActivitySignedInBase) matchProfileActivity, (bq) C4423a.y(this.f33440a).get());
        C10363g.m42187a((ActivitySignedInBase) matchProfileActivity, C4423a.z(this.f33440a));
        C10363g.m42186a((ActivitySignedInBase) matchProfileActivity, C4423a.A(this.f33440a));
        C10363g.m42192a((ActivitySignedInBase) matchProfileActivity, (C2664c) C4423a.B(this.f33440a).get());
        C10363g.m42189a((ActivitySignedInBase) matchProfileActivity, (Register) C4423a.C(this.f33440a).get());
        C10363g.m42181a((ActivitySignedInBase) matchProfileActivity, (C8259d) C4423a.D(this.f33440a).get());
        C10363g.m42188a((ActivitySignedInBase) matchProfileActivity, C4423a.E(this.f33440a));
        C10363g.m42190a((ActivitySignedInBase) matchProfileActivity, C4423a.F(this.f33440a));
        return matchProfileActivity;
    }

    /* renamed from: a */
    private BasicInfoView m41709a(BasicInfoView basicInfoView) {
        C16157c.a(basicInfoView, (CardSizeProvider) C4423a.an(this.f33440a).get());
        C16157c.a(basicInfoView, new RecsPhotoUrlFactory());
        C16157c.a(basicInfoView, (FastMatchConfigProvider) C4423a.ao(this.f33440a).get());
        C16157c.a(basicInfoView, this.f33440a.topPicksConfig());
        C16157c.a(basicInfoView, m41743x());
        return basicInfoView;
    }

    /* renamed from: a */
    private ProfileSpotifyAuthActivity m41705a(ProfileSpotifyAuthActivity profileSpotifyAuthActivity) {
        C10358b.m42176a((ActivityBase) profileSpotifyAuthActivity, (bk) C4423a.j(this.f33440a).get());
        C10358b.m42174a((ActivityBase) profileSpotifyAuthActivity, (C2652a) C4423a.k(this.f33440a).get());
        C10358b.m42173a((ActivityBase) profileSpotifyAuthActivity, (UserMetaManager) C4423a.l(this.f33440a).get());
        C10358b.m42172a((ActivityBase) profileSpotifyAuthActivity, (ManagerFusedLocation) C4423a.m(this.f33440a).get());
        C10358b.m42177a((ActivityBase) profileSpotifyAuthActivity, (com.tinder.managers.bt) C4423a.h(this.f33440a).get());
        C10358b.m42175a((ActivityBase) profileSpotifyAuthActivity, (af) C4423a.n(this.f33440a).get());
        C10358b.m42178a((ActivityBase) profileSpotifyAuthActivity, (C2664c) C4423a.o(this.f33440a).get());
        C10358b.m42171a((ActivityBase) profileSpotifyAuthActivity, (ManagerAnalytics) C4423a.p(this.f33440a).get());
        C16071f.a(profileSpotifyAuthActivity, m41744y());
        return profileSpotifyAuthActivity;
    }

    /* renamed from: a */
    private CurrentUserProfileView m41710a(CurrentUserProfileView currentUserProfileView) {
        C16159k.a(currentUserProfileView, m41695B());
        return currentUserProfileView;
    }

    /* renamed from: a */
    private MatchProfileView m41711a(MatchProfileView matchProfileView) {
        C16160l.a(matchProfileView, m41700G());
        return matchProfileView;
    }

    /* renamed from: a */
    private UserRecProfileView m41718a(UserRecProfileView userRecProfileView) {
        com.tinder.profile.view.ae.a(userRecProfileView, (bp) this.f33449j.get());
        com.tinder.profile.view.ae.a(userRecProfileView, (TappyConfig) this.f33443d.get());
        return userRecProfileView;
    }

    /* renamed from: a */
    private CurrentUserProfileActivity m41702a(CurrentUserProfileActivity currentUserProfileActivity) {
        C10358b.m42176a((ActivityBase) currentUserProfileActivity, (bk) C4423a.j(this.f33440a).get());
        C10358b.m42174a((ActivityBase) currentUserProfileActivity, (C2652a) C4423a.k(this.f33440a).get());
        C10358b.m42173a((ActivityBase) currentUserProfileActivity, (UserMetaManager) C4423a.l(this.f33440a).get());
        C10358b.m42172a((ActivityBase) currentUserProfileActivity, (ManagerFusedLocation) C4423a.m(this.f33440a).get());
        C10358b.m42177a((ActivityBase) currentUserProfileActivity, (com.tinder.managers.bt) C4423a.h(this.f33440a).get());
        C10358b.m42175a((ActivityBase) currentUserProfileActivity, (af) C4423a.n(this.f33440a).get());
        C10358b.m42178a((ActivityBase) currentUserProfileActivity, (C2664c) C4423a.o(this.f33440a).get());
        C10358b.m42171a((ActivityBase) currentUserProfileActivity, (ManagerAnalytics) C4423a.p(this.f33440a).get());
        C10363g.m42184a((ActivitySignedInBase) currentUserProfileActivity, (bk) C4423a.j(this.f33440a).get());
        C10363g.m42183a((ActivitySignedInBase) currentUserProfileActivity, (ManagerProfile) C4423a.v(this.f33440a).get());
        C10363g.m42191a((ActivitySignedInBase) currentUserProfileActivity, (UpdatesScheduler) C4423a.w(this.f33440a).get());
        C10363g.m42182a((ActivitySignedInBase) currentUserProfileActivity, (ManagerDeepLinking) C4423a.x(this.f33440a).get());
        C10363g.m42185a((ActivitySignedInBase) currentUserProfileActivity, (bq) C4423a.y(this.f33440a).get());
        C10363g.m42187a((ActivitySignedInBase) currentUserProfileActivity, C4423a.z(this.f33440a));
        C10363g.m42186a((ActivitySignedInBase) currentUserProfileActivity, C4423a.A(this.f33440a));
        C10363g.m42192a((ActivitySignedInBase) currentUserProfileActivity, (C2664c) C4423a.B(this.f33440a).get());
        C10363g.m42189a((ActivitySignedInBase) currentUserProfileActivity, (Register) C4423a.C(this.f33440a).get());
        C10363g.m42181a((ActivitySignedInBase) currentUserProfileActivity, (C8259d) C4423a.D(this.f33440a).get());
        C10363g.m42188a((ActivitySignedInBase) currentUserProfileActivity, C4423a.E(this.f33440a));
        C10363g.m42190a((ActivitySignedInBase) currentUserProfileActivity, C4423a.F(this.f33440a));
        return currentUserProfileActivity;
    }

    /* renamed from: a */
    private MessageAdMatchProfileActivity m41701a(MessageAdMatchProfileActivity messageAdMatchProfileActivity) {
        C10358b.m42176a((ActivityBase) messageAdMatchProfileActivity, (bk) C4423a.j(this.f33440a).get());
        C10358b.m42174a((ActivityBase) messageAdMatchProfileActivity, (C2652a) C4423a.k(this.f33440a).get());
        C10358b.m42173a((ActivityBase) messageAdMatchProfileActivity, (UserMetaManager) C4423a.l(this.f33440a).get());
        C10358b.m42172a((ActivityBase) messageAdMatchProfileActivity, (ManagerFusedLocation) C4423a.m(this.f33440a).get());
        C10358b.m42177a((ActivityBase) messageAdMatchProfileActivity, (com.tinder.managers.bt) C4423a.h(this.f33440a).get());
        C10358b.m42175a((ActivityBase) messageAdMatchProfileActivity, (af) C4423a.n(this.f33440a).get());
        C10358b.m42178a((ActivityBase) messageAdMatchProfileActivity, (C2664c) C4423a.o(this.f33440a).get());
        C10358b.m42171a((ActivityBase) messageAdMatchProfileActivity, (ManagerAnalytics) C4423a.p(this.f33440a).get());
        C10363g.m42184a((ActivitySignedInBase) messageAdMatchProfileActivity, (bk) C4423a.j(this.f33440a).get());
        C10363g.m42183a((ActivitySignedInBase) messageAdMatchProfileActivity, (ManagerProfile) C4423a.v(this.f33440a).get());
        C10363g.m42191a((ActivitySignedInBase) messageAdMatchProfileActivity, (UpdatesScheduler) C4423a.w(this.f33440a).get());
        C10363g.m42182a((ActivitySignedInBase) messageAdMatchProfileActivity, (ManagerDeepLinking) C4423a.x(this.f33440a).get());
        C10363g.m42185a((ActivitySignedInBase) messageAdMatchProfileActivity, (bq) C4423a.y(this.f33440a).get());
        C10363g.m42187a((ActivitySignedInBase) messageAdMatchProfileActivity, C4423a.z(this.f33440a));
        C10363g.m42186a((ActivitySignedInBase) messageAdMatchProfileActivity, C4423a.A(this.f33440a));
        C10363g.m42192a((ActivitySignedInBase) messageAdMatchProfileActivity, (C2664c) C4423a.B(this.f33440a).get());
        C10363g.m42189a((ActivitySignedInBase) messageAdMatchProfileActivity, (Register) C4423a.C(this.f33440a).get());
        C10363g.m42181a((ActivitySignedInBase) messageAdMatchProfileActivity, (C8259d) C4423a.D(this.f33440a).get());
        C10363g.m42188a((ActivitySignedInBase) messageAdMatchProfileActivity, C4423a.E(this.f33440a));
        C10363g.m42190a((ActivitySignedInBase) messageAdMatchProfileActivity, C4423a.F(this.f33440a));
        C12118b.m48257a(messageAdMatchProfileActivity, C4423a.ap(this.f33440a));
        C12118b.m48258a(messageAdMatchProfileActivity, m41694A());
        C12118b.m48256a(messageAdMatchProfileActivity, C4423a.aq(this.f33440a));
        return messageAdMatchProfileActivity;
    }
}
