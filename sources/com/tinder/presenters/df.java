package com.tinder.presenters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKitLoginResult;
import com.facebook.device.p056a.C1677b;
import com.tinder.R;
import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory.IntegrationAction;
import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory.IntegrationFrom;
import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory.IntegrationPartner;
import com.tinder.account.analytics.C3874a;
import com.tinder.account.analytics.C3874a.C2613a;
import com.tinder.account.provider.UpdateAccountPasswordLastShownDateProvider;
import com.tinder.analytics.C7311a;
import com.tinder.analytics.chat.C7318a;
import com.tinder.apprating.p166e.C10314b;
import com.tinder.auth.interactor.AddSmsValidateEvent;
import com.tinder.auth.interactor.AddSmsValidateEvent.C8275a;
import com.tinder.auth.interactor.AddSmsValidateEvent.EventCode;
import com.tinder.auth.interactor.AddSmsValidateEvent.FlagReason;
import com.tinder.auth.interactor.AddSmsValidateEvent.VerifyMethod;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C10336s;
import com.tinder.auth.model.C8291f;
import com.tinder.bitmoji.BitmojiAuthStatus;
import com.tinder.bitmoji.C10376d;
import com.tinder.bitmoji.C10378h;
import com.tinder.bitmoji.C10380k;
import com.tinder.chat.activity.C8406b;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.crashindicator.p321c.C10713a;
import com.tinder.deeplink.DeepLinkedSharedRecInterceptor;
import com.tinder.deeplink.TinderSchemaParser;
import com.tinder.deeplink.TinderSchemaParser.C8817b.C11087a;
import com.tinder.deeplink.TinderSchemaParser.C8817b.C11088b;
import com.tinder.deeplink.TinderSchemaParser.C8817b.C11089c;
import com.tinder.deeplink.TinderSchemaParser.C8817b.C11090d;
import com.tinder.deeplink.TinderSchemaParser.C8817b.C11091e;
import com.tinder.deeplink.TinderSchemaParser.C8817b.C11092f;
import com.tinder.deeplink.TinderSchemaParser.C8817b.C11093g;
import com.tinder.deeplink.TinderSchemaParser.C8817b.C11094h;
import com.tinder.deeplink.TinderSchemaParser.C8817b.C11095i;
import com.tinder.deeplink.TinderSchemaParser.C8817b.C11096j;
import com.tinder.deeplink.TinderSchemaParser.C8817b.C11097k;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p234c.C8890a;
import com.tinder.domain.auth.UserAttribute;
import com.tinder.domain.common.model.DeviceInfo;
import com.tinder.domain.deviceinfo.usecase.LoadAndUpdateDeviceInfo;
import com.tinder.domain.deviceinfo.usecase.LoadAndUpdateDeviceInfo.Request;
import com.tinder.domain.deviceinfo.usecase.ObserveDeviceInfo;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.usecase.CountMatches;
import com.tinder.domain.match.usecase.GetMatchByUserId;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.meta.usecase.GetCurrentUser;
import com.tinder.domain.profile.model.ProfileOption.Purchase;
import com.tinder.domain.profile.model.Tutorial.BitmojiIntro;
import com.tinder.domain.profile.model.Tutorial.FastMatchIntro;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.session.SessionState;
import com.tinder.fastmatch.view.FastMatchRecsActivity;
import com.tinder.fastmatch.view.FastMatchRecsActivity.Source;
import com.tinder.feed.p341b.C11695a;
import com.tinder.interactors.C9714e;
import com.tinder.interactors.TutorialsInteractor;
import com.tinder.interactors.TutorialsInteractor.IntroTutorialType;
import com.tinder.main.model.MainPage;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.bk;
import com.tinder.match.provider.C9879g;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.model.UserMeta;
import com.tinder.model.auth.AccountConfig;
import com.tinder.model.auth.ValidationStatus;
import com.tinder.module.ForApplication;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.places.p156a.C7343b;
import com.tinder.purchase.usecase.C16246h;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.model.TinderNotification.NotificationOrigin;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.recs.analytics.RecsSessionTracker;
import com.tinder.recs.model.DeepLinkReferralInfo;
import com.tinder.session.p474a.C16576a;
import com.tinder.session.usecase.C14838f;
import com.tinder.settings.p404b.C14864a;
import com.tinder.shimmy.ShimmerFrameLayout$ConfigManager;
import com.tinder.targets.MainActivityTarget;
import com.tinder.tindergold.p481c.C16923a;
import com.tinder.toppicks.badge.TopPicksTriggerModule$TopPicksSegmentRelay;
import com.tinder.toppicks.view.TopPicksView$TopPicksDestination;
import com.tinder.usecase.C15346o;
import com.tinder.usecase.C17221d;
import com.tinder.usecase.C17224h;
import com.tinder.utils.RxUtils;
import com.tinder.utils.ar;
import com.tinder.verification.usecase.AddAuthAccountLinkModalEvent.Action;
import com.tinder.verification.usecase.AddAuthAccountLinkModalEvent.C15389a;
import com.tinder.verification.usecase.AddAuthAccountLinkModalEvent.Value;
import com.tinder.verification.usecase.C15390a;
import com.tinder.verification.usecase.C15391b;
import com.tinder.verification.usecase.C15392c;
import com.tinder.verification.worker.C15393a;
import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.SingleSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import io.reactivex.subjects.C18432c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.C15813i;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

public class df extends PresenterBase<MainActivityTarget> {
    /* renamed from: a */
    private static final Days f55266a = Days.f14092e;
    @NonNull
    /* renamed from: A */
    private final C9879g f55267A;
    @NonNull
    /* renamed from: B */
    private final C11695a f55268B;
    @NonNull
    /* renamed from: C */
    private final C15346o f55269C;
    @NonNull
    /* renamed from: D */
    private final ObserveDeviceInfo f55270D;
    @NonNull
    /* renamed from: E */
    private final C16246h f55271E;
    @NonNull
    /* renamed from: F */
    private final C17221d f55272F;
    @NonNull
    /* renamed from: G */
    private final C16576a f55273G;
    @NonNull
    /* renamed from: H */
    private final C10336s f55274H;
    @NonNull
    /* renamed from: I */
    private final ConfirmTutorialsViewed f55275I;
    @NonNull
    /* renamed from: J */
    private final AddSmsValidateEvent f55276J;
    @NonNull
    /* renamed from: K */
    private final C3959e<Boolean> f55277K;
    @NonNull
    /* renamed from: L */
    private final C15392c f55278L;
    @NonNull
    /* renamed from: M */
    private final C17224h f55279M;
    @NonNull
    /* renamed from: N */
    private final C15391b f55280N;
    @NonNull
    /* renamed from: O */
    private final C15390a f55281O;
    @NonNull
    /* renamed from: P */
    private final C15393a f55282P;
    @NonNull
    /* renamed from: Q */
    private final C7343b f55283Q;
    @NonNull
    /* renamed from: R */
    private final C14838f f55284R;
    @NonNull
    /* renamed from: S */
    private final List<MainPage> f55285S;
    @NonNull
    /* renamed from: T */
    private final UpdateAccountPasswordLastShownDateProvider f55286T;
    @NonNull
    /* renamed from: U */
    private final UserMetaManager f55287U;
    @NonNull
    /* renamed from: V */
    private final AbTestUtility f55288V;
    @NonNull
    /* renamed from: W */
    private final C7311a f55289W;
    @NonNull
    /* renamed from: X */
    private final ManagerDeepLinking f55290X;
    @NonNull
    /* renamed from: Y */
    private final C8890a f55291Y;
    @NonNull
    /* renamed from: Z */
    private final CheckTutorialViewed f55292Z;
    @NonNull
    private final LoadProfileOptionData aa;
    @Nullable
    private Subscription ab;
    @Nullable
    private Disposable ac;
    @NonNull
    private final C10380k ad;
    @NonNull
    private final C14548a ae;
    @NonNull
    private final C10378h af;
    @NonNull
    private final C14550a ag;
    @NonNull
    private final C3874a ah;
    @NonNull
    private final C10376d ai;
    @IoScheduler
    private final C15679f aj;
    /* renamed from: b */
    private final C19573b f55293b = new C19573b();
    /* renamed from: c */
    private final C17356a f55294c = new C17356a();
    /* renamed from: d */
    private final C15679f f55295d = C15756a.m59010b();
    /* renamed from: e */
    private final C15679f f55296e = C15674a.m58830a();
    /* renamed from: f */
    private Disposable f55297f = null;
    @NonNull
    /* renamed from: g */
    private final C9714e f55298g;
    @NonNull
    /* renamed from: h */
    private final TutorialsInteractor f55299h;
    @NonNull
    /* renamed from: i */
    private final ManagerAnalytics f55300i;
    @NonNull
    /* renamed from: j */
    private final C10333h f55301j;
    @NonNull
    /* renamed from: k */
    private final FastMatchConfigProvider f55302k;
    @NonNull
    /* renamed from: l */
    private final TinderSchemaParser f55303l;
    @NonNull
    /* renamed from: m */
    private final Context f55304m;
    @NonNull
    /* renamed from: n */
    private final C8406b f55305n;
    @NonNull
    /* renamed from: o */
    private final C16923a f55306o;
    @NonNull
    /* renamed from: p */
    private final ar f55307p;
    @NonNull
    /* renamed from: q */
    private final CountMatches f55308q;
    @NonNull
    /* renamed from: r */
    private final C14864a f55309r;
    @NonNull
    /* renamed from: s */
    private final bk f55310s;
    @NonNull
    /* renamed from: t */
    private final LoadAndUpdateDeviceInfo f55311t;
    @NonNull
    /* renamed from: u */
    private final C10314b f55312u;
    @NonNull
    /* renamed from: v */
    private final C10713a f55313v;
    @NonNull
    /* renamed from: w */
    private final GetMatchByUserId f55314w;
    @NonNull
    /* renamed from: x */
    private final GetCurrentUser f55315x;
    @NonNull
    /* renamed from: y */
    private final RecsSessionTracker f55316y;
    @NonNull
    /* renamed from: z */
    private final C7318a f55317z;

    /* renamed from: com.tinder.presenters.df$1 */
    static /* synthetic */ class C143571 {
        /* renamed from: a */
        static final /* synthetic */ int[] f45552a = new int[IntroTutorialType.values().length];
        /* renamed from: b */
        static final /* synthetic */ int[] f45553b = new int[BitmojiAuthStatus.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.bitmoji.BitmojiAuthStatus.values();
            r0 = r0.length;
            r0 = new int[r0];
            f45553b = r0;
            r0 = 1;
            r1 = f45553b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.tinder.bitmoji.BitmojiAuthStatus.CONNECTED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f45553b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.tinder.bitmoji.BitmojiAuthStatus.AUTH_FAILED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = com.tinder.interactors.TutorialsInteractor.IntroTutorialType.values();
            r2 = r2.length;
            r2 = new int[r2];
            f45552a = r2;
            r2 = f45552a;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = com.tinder.interactors.TutorialsInteractor.IntroTutorialType.UNKNOWN;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0032 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0032 }
        L_0x0032:
            r0 = f45552a;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = com.tinder.interactors.TutorialsInteractor.IntroTutorialType.FAST_MATCH;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r0[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            r0 = f45552a;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r1 = com.tinder.interactors.TutorialsInteractor.IntroTutorialType.REACTIONS_INTRO;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0047 }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0047 }
        L_0x0047:
            r0 = f45552a;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r1 = com.tinder.interactors.TutorialsInteractor.IntroTutorialType.BITMOJI_INTRO;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0052 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0052 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0052 }
        L_0x0052:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.presenters.df.1.<clinit>():void");
        }
    }

    /* renamed from: E */
    static final /* synthetic */ void m64758E() throws Exception {
    }

    /* renamed from: a */
    static final /* synthetic */ void m64781a(C15813i c15813i) {
    }

    /* renamed from: y */
    static final /* synthetic */ void m64804y() throws Exception {
    }

    /* renamed from: z */
    static final /* synthetic */ void m64805z() throws Exception {
    }

    /* renamed from: a */
    final /* synthetic */ void m64818a(ValidationStatus validationStatus) {
        m64785b(validationStatus);
    }

    /* renamed from: j */
    final /* synthetic */ void m64850j(Throwable th) {
        m64803k(th);
    }

    @Inject
    df(@NonNull C9714e c9714e, @NonNull TutorialsInteractor tutorialsInteractor, @NonNull ManagerAnalytics managerAnalytics, @NonNull C10333h c10333h, @NonNull AbTestUtility abTestUtility, @NonNull UserMetaManager userMetaManager, @NonNull UpdateAccountPasswordLastShownDateProvider updateAccountPasswordLastShownDateProvider, @NonNull FastMatchConfigProvider fastMatchConfigProvider, @NonNull TinderSchemaParser tinderSchemaParser, @ForApplication @NonNull Context context, @NonNull C8406b c8406b, @NonNull C16923a c16923a, @NonNull ar arVar, @NonNull CountMatches countMatches, @NonNull C10314b c10314b, @NonNull C7311a c7311a, @NonNull C14864a c14864a, @NonNull bk bkVar, @NonNull LoadAndUpdateDeviceInfo loadAndUpdateDeviceInfo, @NonNull C10713a c10713a, @NonNull ObserveDeviceInfo observeDeviceInfo, @NonNull ManagerDeepLinking managerDeepLinking, @NonNull GetMatchByUserId getMatchByUserId, @NonNull GetCurrentUser getCurrentUser, @NonNull C7318a c7318a, @NonNull @Named("core") RecsSessionTracker recsSessionTracker, @NonNull C9879g c9879g, @NonNull C11695a c11695a, @NonNull C15346o c15346o, @NonNull C8890a c8890a, @NonNull CheckTutorialViewed checkTutorialViewed, @NonNull LoadProfileOptionData loadProfileOptionData, @NonNull C16246h c16246h, @NonNull C17221d c17221d, @NonNull C14838f c14838f, @NonNull C16576a c16576a, @NonNull C7343b c7343b, @NonNull C10336s c10336s, @NonNull List<MainPage> list, @TopPicksTriggerModule$TopPicksSegmentRelay C18432c<Boolean> c18432c, @NonNull C10380k c10380k, @NonNull C14548a c14548a, @NonNull C10378h c10378h, @NonNull C14550a c14550a, @NonNull C3874a c3874a, @NonNull ConfirmTutorialsViewed confirmTutorialsViewed, @NonNull C15392c c15392c, @NonNull C15391b c15391b, @NonNull C15390a c15390a, @NonNull AddSmsValidateEvent addSmsValidateEvent, @NonNull C10376d c10376d, @NonNull C17224h c17224h, @NonNull C15393a c15393a, @IoScheduler C15679f c15679f) {
        this.f55298g = c9714e;
        this.f55299h = tutorialsInteractor;
        this.f55300i = managerAnalytics;
        this.f55301j = c10333h;
        this.f55286T = updateAccountPasswordLastShownDateProvider;
        this.f55287U = userMetaManager;
        this.f55302k = fastMatchConfigProvider;
        this.f55303l = tinderSchemaParser;
        this.f55304m = context;
        this.f55305n = c8406b;
        this.f55306o = c16923a;
        this.f55307p = arVar;
        this.f55288V = abTestUtility;
        this.f55308q = countMatches;
        this.f55312u = c10314b;
        this.f55289W = c7311a;
        this.f55309r = c14864a;
        this.f55310s = bkVar;
        this.f55311t = loadAndUpdateDeviceInfo;
        this.f55313v = c10713a;
        this.f55270D = observeDeviceInfo;
        this.f55290X = managerDeepLinking;
        this.f55314w = getMatchByUserId;
        this.f55315x = getCurrentUser;
        this.f55317z = c7318a;
        this.f55316y = recsSessionTracker;
        this.f55267A = c9879g;
        this.f55268B = c11695a;
        this.f55269C = c15346o;
        this.f55291Y = c8890a;
        this.f55292Z = checkTutorialViewed;
        this.aa = loadProfileOptionData;
        this.f55271E = c16246h;
        this.f55272F = c17221d;
        this.f55284R = c14838f;
        this.f55273G = c16576a;
        this.f55283Q = c7343b;
        this.f55285S = list;
        this.f55277K = c18432c.hide();
        this.ad = c10380k;
        this.ae = c14548a;
        this.af = c10378h;
        this.ag = c14550a;
        this.ah = c3874a;
        this.f55274H = c10336s;
        this.f55278L = c15392c;
        this.f55280N = c15391b;
        this.f55281O = c15390a;
        this.f55275I = confirmTutorialsViewed;
        this.f55276J = addSmsValidateEvent;
        this.ai = c10376d;
        this.f55279M = c17224h;
        this.f55282P = c15393a;
        this.aj = c15679f;
    }

    /* renamed from: I */
    private void m64759I() {
        this.f55294c.add(this.f55309r.m56285b().b(C15756a.m59010b()).a(C15674a.m58830a()).a(new dg(this), new dh(this)));
    }

    /* renamed from: h */
    final /* synthetic */ void m64846h(Boolean bool) throws Exception {
        this.f55310s.J(bool.booleanValue());
        if (bool.booleanValue() != null) {
            m64760J();
        }
    }

    /* renamed from: i */
    final /* synthetic */ void m64848i(Throwable th) throws Exception {
        C0001a.c(th);
        if (this.f55310s.ai() != null) {
            m64760J();
        }
    }

    /* renamed from: J */
    private void m64760J() {
        a(new ds(this));
    }

    /* renamed from: f */
    final /* synthetic */ void m64841f(MainActivityTarget mainActivityTarget) {
        m64769S();
        mainActivityTarget.showAccountPausedDialog();
    }

    /* renamed from: a */
    public void m64811a() {
        super.a();
        RxUtils.b(this.ab);
        if (this.ac != null) {
            this.ac.dispose();
        }
        this.f55293b.a();
        this.f55294c.m63446a();
        if (this.f55297f != null) {
            this.f55297f.dispose();
        }
    }

    /* renamed from: b */
    public void m64828b() {
        m64764N();
        m64761K();
        m64759I();
        m64765O();
        m64766P();
        m64767Q();
        m64768R();
        m64771U();
        this.f55282P.m57727a();
    }

    /* renamed from: c */
    public void m64832c() {
        this.f55282P.m57727a();
    }

    /* renamed from: d */
    public void m64836d() {
        if (this.f55297f != null) {
            this.f55297f.dispose();
        }
        this.f55281O.m57721a().f().b(this.f55295d).a(this.f55295d).a(new ed(this), eo.f49891a);
    }

    /* renamed from: b */
    final /* synthetic */ void m64829b(C8291f c8291f) throws Exception {
        if (c8291f.a() != null) {
            this.f55282P.m57728a(new C15389a(Action.HIDE, Value.APP_CLOSE));
        }
        this.f55282P.m57729b();
    }

    /* renamed from: e */
    public void m64837e() {
        a(ez.f57931a);
        a(fk.f57940a);
    }

    /* renamed from: f */
    public void m64840f() {
        if (H() != null) {
            if (this.f55298g.a()) {
                ((MainActivityTarget) H()).showDiscoveryToolTip();
                this.f55272F.execute();
            }
        }
    }

    /* renamed from: g */
    void m64844g() {
        if (this.f55302k.get().isEnabled()) {
            this.f55294c.add(this.f55292Z.execute(FastMatchIntro.INSTANCE).a(fv.f49907a).d(new gc(this)).d(new gd(this)).b(C15756a.m59010b()).a(di.f49868a, dj.f49869a));
        }
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m64789b(TutorialViewStatus tutorialViewStatus) throws Exception {
        return tutorialViewStatus == TutorialViewStatus.UNSEEN ? true : null;
    }

    /* renamed from: a */
    final /* synthetic */ SingleSource m64810a(TutorialViewStatus tutorialViewStatus) throws Exception {
        return this.aa.execute(Purchase.INSTANCE).map(gb.f49910a).first(Boolean.valueOf(false));
    }

    /* renamed from: g */
    final /* synthetic */ CompletableSource m64843g(Boolean bool) throws Exception {
        if (bool.booleanValue() != null) {
            return this.f55306o.execute();
        }
        return C3956a.a(new fz(this)).b(C15674a.m58830a());
    }

    /* renamed from: F */
    final /* synthetic */ void m64809F() throws Exception {
        a(ga.f57949a);
    }

    /* renamed from: h */
    void m64845h() {
        if (!this.f55288V.isBitmojiEnabled()) {
            return;
        }
        if (this.ac == null || this.ac.isDisposed()) {
            this.ac = this.f55308q.execute().observeOn(this.f55296e).subscribeOn(this.f55295d).filter(dk.f49870a).take(1).subscribe(new dl(this));
        }
    }

    /* renamed from: d */
    static final /* synthetic */ boolean m64796d(Long l) throws Exception {
        return l.longValue() > 0 ? true : null;
    }

    /* renamed from: c */
    final /* synthetic */ void m64834c(Long l) throws Exception {
        if (this.ai.a().booleanValue() == null) {
            a(fy.f57948a);
        } else {
            m64859s();
        }
    }

    /* renamed from: i */
    void m64847i() {
        if (!this.f55288V.isGrandGesturesEnabled() || !this.f55299h.d()) {
            return;
        }
        if (this.ab == null || this.ab.isUnsubscribed()) {
            this.ab = C15551e.m58077a(this.f55308q.execute(), BackpressureStrategy.LATEST).a(RxUtils.a()).f(dm.f55318a).c(1).d(new dn(this));
        }
    }

    /* renamed from: b */
    static final /* synthetic */ Boolean m64783b(Long l) {
        return Boolean.valueOf(l.longValue() > 0 ? true : null);
    }

    /* renamed from: a */
    final /* synthetic */ void m64823a(Long l) {
        ((MainActivityTarget) H()).showTinderReactionsIntro();
    }

    /* renamed from: K */
    private void m64761K() {
        IntroTutorialType e = this.f55299h.e();
        if (e != null) {
            switch (C143571.f45552a[e.ordinal()]) {
                case 1:
                    break;
                case 2:
                    m64844g();
                    break;
                case 3:
                    m64847i();
                    break;
                case 4:
                    m64845h();
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: j */
    public void m64849j() {
        this.f55300i.a(new SparksEvent("Push.Receive").put("type", "photoOptimizer"));
    }

    /* renamed from: k */
    public void m64851k() {
        this.f55301j.h();
    }

    /* renamed from: a */
    public void m64827a(boolean z) {
        this.f55301j.a(z);
    }

    /* renamed from: l */
    public void m64852l() {
        if (m64762L()) {
            this.f55286T.lastShownDate().m59126a(new C16047do(this), new dp(this));
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m64826a(LocalDate localDate) {
        if (Days.a(localDate, LocalDate.a()).a(f55266a) != null) {
            a(fx.f57947a);
        }
    }

    /* renamed from: D */
    final /* synthetic */ void m64808D() {
        a(fw.f57946a);
    }

    /* renamed from: L */
    private boolean m64762L() {
        UserMeta metaUser = this.f55287U.getMetaUser();
        if (metaUser == null) {
            return false;
        }
        AccountConfig accountConfig = metaUser.getAccountConfig();
        if (accountConfig == null || !accountConfig.needPassword()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m64825a(String str, NotificationOrigin notificationOrigin) {
        if (this.f55273G.m62008a() == SessionState.INACTIVE) {
            this.f55284R.m56220a(UserAttribute.RETURNING_USER);
        }
        MainActivityTarget mainActivityTarget = (MainActivityTarget) H();
        if (mainActivityTarget != null) {
            if (str != null) {
                str = this.f55303l.a(str);
                if (str instanceof C11095i) {
                    mainActivityTarget.openIntent(this.f55307p.m57623a(this.f55304m));
                } else if (str instanceof C11087a) {
                    mainActivityTarget.openIntent(this.f55307p.m57624b(this.f55304m));
                } else if (str instanceof C11096j) {
                    mainActivityTarget.openSettingsActivity();
                } else if (str instanceof C11088b) {
                    mainActivityTarget.openIntent(this.f55305n.a(this.f55304m, this.f55317z.a(notificationOrigin), ((C11088b) str).a()));
                } else if ((str instanceof C11090d) != null) {
                    str = FastMatchRecsActivity.a(this.f55304m, Source.PUSH);
                    str.setFlags(335560704);
                    mainActivityTarget.openIntent(str);
                } else if ((str instanceof C11093g) != null) {
                    m64776a(C10076o.a(((C11093g) str).a()));
                } else if ((str instanceof C11089c) != null) {
                    mainActivityTarget.openEditProfileActivity(((C11089c) str).a());
                } else if ((str instanceof C11092f) != null) {
                    m64769S();
                } else if ((str instanceof C11091e) != null) {
                    m64770T();
                } else if ((str instanceof C11094h) != null) {
                    this.f55294c.add(this.f55283Q.a().a(dq.f49873a).e().b(this.f55295d).a(this.f55296e).a(new dr(this), dt.f49875a));
                } else if ((str instanceof C11097k) != null) {
                    m64763M();
                    if (((C11097k) str).a() == TopPicksView$TopPicksDestination.PAYWALL) {
                        m64776a(C10076o.a(GoldPaywallSource.TOP_PICKS_DEEPLINK));
                    }
                }
            }
        }
    }

    /* renamed from: f */
    static final /* synthetic */ boolean m64800f(Boolean bool) throws Exception {
        return bool.booleanValue() == 1;
    }

    /* renamed from: e */
    final /* synthetic */ void m64838e(Boolean bool) throws Exception {
        this.f55291Y.a(DiscoverySegment.PLACES);
    }

    /* renamed from: M */
    private void m64763M() {
        this.f55294c.add(this.f55277K.skipWhile(du.f49876a).observeOn(C15674a.m58830a()).subscribe(new dv(this), dw.f49878a));
    }

    /* renamed from: c */
    final /* synthetic */ void m64833c(Boolean bool) throws Exception {
        this.f55291Y.a(DiscoverySegment.TOP_PICKS);
    }

    /* renamed from: a */
    private void m64776a(C10076o c10076o) {
        this.f55293b.a(this.f55271E.m61399a(c10076o.a().a().getProductType()).c(1).b(Schedulers.io()).a(C19397a.a()).a(new dx(this, c10076o), new dy(this)));
    }

    /* renamed from: a */
    final /* synthetic */ void m64819a(C10076o c10076o, List list) {
        a(new fu(c10076o));
    }

    /* renamed from: f */
    final /* synthetic */ void m64842f(Throwable th) {
        a(ft.f57944a);
    }

    /* renamed from: m */
    public void m64853m() {
        this.f55316y.startTracking();
    }

    /* renamed from: n */
    public void m64854n() {
        this.f55316y.stopTracking();
    }

    /* renamed from: b */
    public void m64831b(boolean z) {
        this.f55316y.setAppOpenFromPushMessage(z);
    }

    /* renamed from: o */
    public void m64855o() {
        this.f55309r.m56283a().a(RxUtils.a().m67520b()).a(new dz(this), new ea(this));
    }

    /* renamed from: C */
    final /* synthetic */ void m64807C() {
        a(fs.f57943a);
    }

    /* renamed from: e */
    final /* synthetic */ void m64839e(Throwable th) {
        MainActivityTarget mainActivityTarget = (MainActivityTarget) H();
        if (mainActivityTarget != null) {
            mainActivityTarget.showSnackbar(R.string.oops);
        }
        C0001a.c(th);
    }

    /* renamed from: a */
    public void m64816a(User user, String str, DeepLinkReferralInfo deepLinkReferralInfo) {
        this.f55315x.execute().a(RxUtils.a().m67518a()).a(new eb(this, user, str, deepLinkReferralInfo), ec.f57920a);
    }

    /* renamed from: a */
    final /* synthetic */ void m64817a(User user, String str, DeepLinkReferralInfo deepLinkReferralInfo, CurrentUser currentUser) {
        MainActivityTarget mainActivityTarget = (MainActivityTarget) H();
        if (mainActivityTarget != null) {
            m64775a(currentUser, user, mainActivityTarget, str, deepLinkReferralInfo);
        }
    }

    /* renamed from: p */
    public void m64856p() {
        this.f55291Y.a(DiscoverySegment.RECS);
    }

    /* renamed from: q */
    public void m64857q() {
        if (this.f55285S.contains(MainPage.RECS)) {
            a(ee.f57921a);
        } else {
            this.f55291Y.a(DiscoverySegment.RECS);
        }
    }

    /* renamed from: a */
    public void m64812a(AccountKitLoginResult accountKitLoginResult) {
        accountKitLoginResult = accountKitLoginResult.getAccessToken();
        if (accountKitLoginResult != null && accountKitLoginResult.getToken() != null) {
            m64773a(EventCode.SUBMIT_VERIFY_CODE);
            this.f55274H.a(accountKitLoginResult.getToken()).b(Schedulers.io()).a(C19397a.a()).a(new ef(this), new eg(this));
        }
    }

    /* renamed from: N */
    private void m64764N() {
        this.f55297f = this.ad.execute().delay(1, TimeUnit.SECONDS, this.aj).observeOn(this.f55296e).subscribeOn(this.f55295d).distinctUntilChanged().subscribe(new eh(this), ei.f49882a);
    }

    /* renamed from: a */
    final /* synthetic */ void m64814a(BitmojiAuthStatus bitmojiAuthStatus) throws Exception {
        switch (C143571.f45553b[bitmojiAuthStatus.ordinal()]) {
            case 1:
                m64798e(true);
                m64794d(true);
                return;
            case 2:
                m64798e(false);
                m64794d(false);
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    private void m64794d(boolean z) {
        this.ah.a(new C2613a(IntegrationAction.CONNECT, IntegrationFrom.MODAL, IntegrationPartner.SNAPCHAT, z));
    }

    /* renamed from: a */
    private void m64775a(CurrentUser currentUser, User user, MainActivityTarget mainActivityTarget, String str, DeepLinkReferralInfo deepLinkReferralInfo) {
        if (currentUser != null) {
            DateTime birthDate = currentUser.birthDate();
            String age = user.getAge();
            if (!(age == null || birthDate == null)) {
                int a = m64772a(birthDate);
                try {
                    int parseInt = Integer.parseInt(age);
                    if (a < 18 || parseInt >= 18) {
                        this.f55314w.execute(user.getId()).b(this.f55295d).a(this.f55296e).a(new ej(this, mainActivityTarget), new ek(this, user, currentUser, mainActivityTarget, str, deepLinkReferralInfo));
                    } else {
                        mainActivityTarget.showSnackbar(R.string.under_18);
                    }
                } catch (CurrentUser currentUser2) {
                    C0001a.b(currentUser2, "deeplink user has invalid age, no navigation being done", new Object[null]);
                }
            }
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m64821a(MainActivityTarget mainActivityTarget, Match match) throws Exception {
        C0001a.b("getMatchByUserId found match for user id - %s", new Object[]{match.getId()});
        m64787b(match.getId(), mainActivityTarget);
    }

    /* renamed from: a */
    final /* synthetic */ void m64815a(User user, CurrentUser currentUser, MainActivityTarget mainActivityTarget, String str, DeepLinkReferralInfo deepLinkReferralInfo, Throwable th) throws Exception {
        C0001a.c(th, "getMatchByUserId no match for this user ", new Object[0]);
        if (m64782a(user, currentUser) != null) {
            mainActivityTarget.goToMyProfile();
        } else {
            m64784b(user, str, deepLinkReferralInfo);
        }
    }

    /* renamed from: a */
    private int m64772a(DateTime dateTime) {
        return Years.a(dateTime.b(), new LocalDate()).b();
    }

    /* renamed from: b */
    private void m64784b(User user, String str, DeepLinkReferralInfo deepLinkReferralInfo) {
        m64857q();
        for (DeepLinkedSharedRecInterceptor interceptOnProfileLoaded : this.f55290X.a()) {
            if (interceptOnProfileLoaded.interceptOnProfileLoaded(user, deepLinkReferralInfo)) {
                return;
            }
        }
    }

    /* renamed from: a */
    private boolean m64782a(User user, CurrentUser currentUser) {
        return (user.getId() == null || user.getId().equals(currentUser.id()) == null) ? null : true;
    }

    /* renamed from: b */
    private void m64787b(String str, MainActivityTarget mainActivityTarget) {
        if (!str.isEmpty()) {
            m64769S();
            mainActivityTarget.goToChat(str);
        }
    }

    /* renamed from: O */
    private void m64765O() {
        this.f55293b.a(this.f55289W.execute().b(Schedulers.io()).a(el.f57924a, em.f57925a));
    }

    /* renamed from: P */
    private void m64766P() {
        this.f55311t.execute(new Request(this.f55288V.isShimmerEnabled(), new en(this)));
    }

    /* renamed from: B */
    final /* synthetic */ Integer m64806B() {
        return Integer.valueOf(C1677b.a(this.f55304m));
    }

    /* renamed from: Q */
    private void m64767Q() {
        this.f55293b.a(C15551e.m58078a(this.f55270D.execute()).a(C19397a.a()).a(ep.f57926a, eq.f57927a));
    }

    /* renamed from: a */
    static final /* synthetic */ void m64774a(DeviceInfo deviceInfo) {
        ShimmerFrameLayout$ConfigManager a = ShimmerFrameLayout$ConfigManager.f46651a.m56417a();
        if (deviceInfo.isShimmerCapable() != null) {
            a.m56423b();
        } else {
            a.m56425c();
        }
    }

    /* renamed from: r */
    public void m64858r() {
        this.f55293b.a(this.f55312u.execute().b(Schedulers.io()).a(C19397a.a()).a(new er(this), es.f57929a));
    }

    /* renamed from: b */
    final /* synthetic */ void m64830b(Boolean bool) {
        if (bool.booleanValue() != null && this.f55288V.appRatingV2() != null) {
            a(fr.f57942a);
        }
    }

    /* renamed from: s */
    public void m64859s() {
        this.f55275I.execute(BitmojiIntro.INSTANCE).b(this.f55295d).a(et.f49892a, eu.f49893a);
    }

    /* renamed from: t */
    public void m64860t() {
        this.f55278L.m57724a().b(C15756a.m59010b()).d();
    }

    /* renamed from: u */
    public void m64861u() {
        a(ev.f57930a);
        this.f55282P.m57728a(new C15389a(Action.HIDE, Value.REMIND_ME_LATER));
        this.f55280N.m57722a().b(C15756a.m59010b()).a(ew.f49894a, ex.f49895a);
    }

    /* renamed from: v */
    public void m64862v() {
        this.f55281O.m57721a().b(this.f55295d).a(this.f55296e).f().a(new ey(this), fa.f49898a);
    }

    /* renamed from: a */
    final /* synthetic */ void m64813a(C8291f c8291f) throws Exception {
        this.f55282P.m57728a(new C15389a(Action.SHOW, c8291f.b() != null ? Value.DISMISSIBLE : Value.NON_DISMISSIBLE));
    }

    /* renamed from: a */
    public void m64824a(@NonNull String str) {
        a(new fb(str));
        this.f55282P.m57728a(new C15389a(Action.HIDE, Value.VIEW_FAQ));
    }

    /* renamed from: w */
    public void m64863w() {
        a(fc.f57933a);
        this.f55282P.m57728a(new C15389a(Action.HIDE, Value.VERIFY));
    }

    /* renamed from: x */
    public void m64864x() {
        a(fd.f57934a);
    }

    /* renamed from: R */
    private void m64768R() {
        this.f55293b.a(this.f55313v.execute().b(Schedulers.io()).a(C19397a.a()).a(new fe(this), ff.f57936a));
    }

    /* renamed from: a */
    final /* synthetic */ void m64822a(Boolean bool) {
        if (bool.booleanValue() != null && this.f55288V.appRatingV2() != null) {
            a(fq.f57941a);
        }
    }

    /* renamed from: S */
    private void m64769S() {
        a(fg.f57937a);
        if (this.f55268B.b() && !this.f55268B.d()) {
            this.f55267A.c();
        }
    }

    /* renamed from: T */
    private void m64770T() {
        if (!this.f55268B.b()) {
            return;
        }
        if (this.f55268B.d()) {
            a(fh.f57938a);
            return;
        }
        a(fi.f57939a);
        this.f55267A.b();
    }

    /* renamed from: U */
    private void m64771U() {
        this.f55269C.m57557a().b(C15756a.m59008a()).a(fj.f49899a, fl.f49900a);
    }

    /* renamed from: e */
    private void m64798e(boolean z) {
        TinderNotification a = this.ae.m55564a(z);
        a.m55582a(new fm(this, z));
        this.ag.m55573a(a);
    }

    /* renamed from: c */
    final /* synthetic */ void m64835c(boolean z) {
        m64799f(z);
    }

    /* renamed from: f */
    private void m64799f(boolean z) {
        if (z) {
            m64769S();
        } else {
            this.af.execute();
        }
    }

    /* renamed from: b */
    private void m64785b(ValidationStatus validationStatus) {
        m64773a(EventCode.SERVER_VERIFY_COMPLETE);
        if (validationStatus.getShouldReLogin() != null) {
            this.f55279M.execute();
        }
        if (H() != null) {
            ((MainActivityTarget) H()).hideProgressBar();
            ((MainActivityTarget) H()).dismissVerificationDialog();
            ((MainActivityTarget) H()).showSmsVerificationSuccessNotification();
        }
    }

    /* renamed from: k */
    private void m64803k(Throwable th) {
        C0001a.c(th);
        m64773a(EventCode.SERVER_VERIFY_ERROR);
        MainActivityTarget mainActivityTarget = (MainActivityTarget) H();
        if (mainActivityTarget != null) {
            C17356a c17356a = this.f55294c;
            C3960g f = this.f55281O.m57721a().b(this.f55295d).a(this.f55296e).f();
            mainActivityTarget.getClass();
            c17356a.add(f.a(fn.m60824a(mainActivityTarget)).a(new fo(this, mainActivityTarget), fp.f49906a));
            mainActivityTarget.showSmsVerificationErrorNotification();
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m64820a(MainActivityTarget mainActivityTarget, C8291f c8291f) throws Exception {
        if (c8291f.b() != null) {
            mainActivityTarget.dismissVerificationDialog();
        } else {
            this.f55282P.m57728a(new C15389a(Action.SHOW, Value.NON_DISMISSIBLE));
        }
    }

    /* renamed from: a */
    private void m64773a(EventCode eventCode) {
        this.f55276J.a(new C8275a(eventCode, VerifyMethod.ACCOUNT_KIT, FlagReason.ACCOUNT_LINKING));
    }
}
