package com.tinder.settings.presenter;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.purchase.PurchaseLog.Source;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C8279j;
import com.tinder.auth.model.AuthType;
import com.tinder.auth.p168c.C10331c;
import com.tinder.boost.p178a.C10400d;
import com.tinder.common.p077b.C2641a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.AccountDeleteVariant;
import com.tinder.crashindicator.analytics.C3924c;
import com.tinder.crashindicator.analytics.FeedbackSource;
import com.tinder.crashindicator.analytics.SettingsOptionType;
import com.tinder.crashindicator.analytics.c$a;
import com.tinder.data.p218g.p220b.C8665a;
import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.profile.model.ProfileOption.WebProfile;
import com.tinder.domain.profile.model.settings.WebProfileSettings;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.pushnotifications.usecase.UnregisterPushToken;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecs;
import com.tinder.domain.recs.usecase.ObserveRecsEngineLoadingStatuses;
import com.tinder.listeners.ListenerDeleteAccount;
import com.tinder.managers.C2652a;
import com.tinder.managers.FacebookManager;
import com.tinder.managers.FacebookManager.ListenerFacebookEmailRequest;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.model.SparksEvent;
import com.tinder.model.auth.LogoutFrom;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.presenters.PresenterBase;
import com.tinder.purchase.domain.exception.PurchaseClientException.EmptyPurchasesException;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.Transaction;
import com.tinder.purchase.domain.model.Transaction.Status;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.logging.C14522a;
import com.tinder.purchase.model.RestoreFlowError;
import com.tinder.purchase.register.Register.RestoreType;
import com.tinder.purchase.usecase.C14541j;
import com.tinder.recs.usecase.UpdateDiscoverySettings;
import com.tinder.settings.analytics.C16614a;
import com.tinder.settings.analytics.C16614a.C14863a;
import com.tinder.settings.p404b.C14865b;
import com.tinder.settings.targets.SettingsTarget;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tindergold.p426a.C16920i;
import com.tinder.tinderplus.analytics.C16938d;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.RxUtils;
import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3958c;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.Collection;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.Subscription;
import rx.functions.Actions;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.settings.presenter.q */
public class C18077q extends PresenterBase<SettingsTarget> {
    /* renamed from: a */
    public static final String f56130a = "q";
    /* renamed from: A */
    private final PlacesAvailableProvider f56131A;
    /* renamed from: B */
    private final C19573b f56132B = new C19573b();
    /* renamed from: C */
    private final C17356a f56133C = new C17356a();
    /* renamed from: D */
    private Subscription f56134D = null;
    /* renamed from: b */
    private final C14865b f56135b;
    /* renamed from: c */
    private final UpdateDiscoverySettings f56136c;
    /* renamed from: d */
    private final ManagerAnalytics f56137d;
    /* renamed from: e */
    private final C10400d f56138e;
    /* renamed from: f */
    private final AbTestUtility f56139f;
    /* renamed from: g */
    private final C15071e f56140g;
    /* renamed from: h */
    private final C15193i f56141h;
    /* renamed from: i */
    private final OfferRepository f56142i;
    /* renamed from: j */
    private final C10333h f56143j;
    /* renamed from: k */
    private final FacebookManager f56144k;
    /* renamed from: l */
    private final C8279j f56145l;
    /* renamed from: m */
    private final C14541j f56146m;
    /* renamed from: n */
    private final FastMatchConfigProvider f56147n;
    /* renamed from: o */
    private final C10331c f56148o;
    /* renamed from: p */
    private final UnregisterPushToken f56149p;
    /* renamed from: q */
    private final C2652a f56150q;
    /* renamed from: r */
    private final C14522a f56151r;
    /* renamed from: s */
    private final C8665a f56152s;
    /* renamed from: t */
    private final AppRatingRepository f56153t;
    /* renamed from: u */
    private final C3924c f56154u;
    /* renamed from: v */
    private final C16920i f56155v;
    /* renamed from: w */
    private final C16938d f56156w;
    /* renamed from: x */
    private final LoadProfileOptionData f56157x;
    /* renamed from: y */
    private final ObserveRecsEngineLoadingStatuses f56158y;
    /* renamed from: z */
    private final C16614a f56159z;

    /* renamed from: com.tinder.settings.presenter.q$1 */
    class C166741 implements ListenerDeleteAccount {
        /* renamed from: a */
        final /* synthetic */ C18077q f51592a;

        C166741(C18077q c18077q) {
            this.f51592a = c18077q;
        }

        public void onDeleteAccountSuccess() {
            if (this.f51592a.H() != null) {
                ((SettingsTarget) this.f51592a.H()).onAccountDeleted();
            }
        }

        public void onDeleteAccountFailure() {
            if (this.f51592a.H() != null) {
                ((SettingsTarget) this.f51592a.H()).onAccountDeleteFailed();
            }
        }
    }

    /* renamed from: com.tinder.settings.presenter.q$2 */
    class C166752 implements ListenerFacebookEmailRequest {
        /* renamed from: a */
        final /* synthetic */ C18077q f51593a;

        C166752(C18077q c18077q) {
            this.f51593a = c18077q;
        }

        public void onFbEmailResponse(@Nullable String str) {
            this.f51593a.a(new bd(str));
        }

        public void onError() {
            this.f51593a.a(be.f58434a);
        }
    }

    @Inject
    public C18077q(C14865b c14865b, UpdateDiscoverySettings updateDiscoverySettings, ManagerAnalytics managerAnalytics, C10400d c10400d, AbTestUtility abTestUtility, C15071e c15071e, C15193i c15193i, OfferRepository offerRepository, C10333h c10333h, FacebookManager facebookManager, C8279j c8279j, C14541j c14541j, FastMatchConfigProvider fastMatchConfigProvider, C10331c c10331c, UnregisterPushToken unregisterPushToken, C2652a c2652a, C14522a c14522a, C8665a c8665a, AppRatingRepository appRatingRepository, C3924c c3924c, C16938d c16938d, C16920i c16920i, LoadProfileOptionData loadProfileOptionData, ObserveRecsEngineLoadingStatuses observeRecsEngineLoadingStatuses, C16614a c16614a, PlacesAvailableProvider placesAvailableProvider) {
        this.f56135b = c14865b;
        this.f56136c = updateDiscoverySettings;
        this.f56137d = managerAnalytics;
        this.f56138e = c10400d;
        this.f56139f = abTestUtility;
        this.f56140g = c15071e;
        this.f56141h = c15193i;
        this.f56142i = offerRepository;
        this.f56143j = c10333h;
        this.f56144k = facebookManager;
        this.f56145l = c8279j;
        this.f56146m = c14541j;
        this.f56147n = fastMatchConfigProvider;
        this.f56148o = c10331c;
        this.f56149p = unregisterPushToken;
        this.f56150q = c2652a;
        this.f56151r = c14522a;
        this.f56152s = c8665a;
        this.f56153t = appRatingRepository;
        this.f56154u = c3924c;
        this.f56155v = c16920i;
        this.f56156w = c16938d;
        this.f56157x = loadProfileOptionData;
        this.f56158y = observeRecsEngineLoadingStatuses;
        this.f56159z = c16614a;
        this.f56131A = placesAvailableProvider;
    }

    /* renamed from: a */
    public void m65620a() {
        super.a();
        this.f56132B.unsubscribe();
        this.f56133C.m63446a();
    }

    /* renamed from: b */
    public void m65628b() {
        m65647o();
        m65617u();
        m65618v();
        m65631c();
        SettingsTarget settingsTarget = (SettingsTarget) H();
        if (settingsTarget != null) {
            if (this.f56139f.getAccountDeleteVariant() == AccountDeleteVariant.NO_PAUSE_OR_DELETE) {
                settingsTarget.hideDeleteButton();
            } else if (this.f56139f.getAccountDeleteVariant() == AccountDeleteVariant.PAUSE_ONLY) {
                settingsTarget.setDeleteButtonText(R.string.pause_account);
            } else if (this.f56139f.getAccountDeleteVariant() == AccountDeleteVariant.DEACTIVATE_ONLY) {
                settingsTarget.setDeleteButtonText(R.string.deactivate_account);
            }
            Observable a = C15551e.m58078a(this.f56131A.observePlacesAvailable()).g().a(RxUtils.a());
            settingsTarget.getClass();
            this.f56132B.a(a.a(C18852r.m67301a(settingsTarget), C18853s.f58440a));
            if (!this.f56147n.get().isEnabled()) {
                this.f56132B.a(this.f56141h.m57122b().b(1).a(bindToLifecycle()).a(RxUtils.a()).a(new ad(this), ao.f58420a));
            }
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m65625a(Boolean bool) {
        m65647o();
    }

    /* renamed from: c */
    void m65631c() {
        if (this.f56139f.isEmailSettingsEnabled()) {
            a(ax.f58428a);
        }
    }

    /* renamed from: d */
    public void m65634d() {
        SettingsTarget settingsTarget = (SettingsTarget) H();
        if (settingsTarget != null) {
            if (this.f56141h.m57121a()) {
                SparksEvent sparksEvent = new SparksEvent("Passport.MapOpen");
                sparksEvent.put(ManagerWebServices.PARAM_FROM, 2);
                this.f56137d.a(sparksEvent);
                settingsTarget.launchActivityPassport();
            } else {
                settingsTarget.launchPaywallFlow(C10076o.a(PlusPaywallSource.PASSPORT_ADD_LOCATION));
            }
        }
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public void m65621a(DiscoverySettings discoverySettings) {
        if (((SettingsTarget) H()) != null) {
            this.f56136c.execute(discoverySettings).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new ay(this), new az(this));
        }
    }

    /* renamed from: t */
    final /* synthetic */ void m65652t() throws Exception {
        a(aw.f58427a);
    }

    /* renamed from: g */
    final /* synthetic */ void m65639g(Throwable th) throws Exception {
        C0001a.c(th, "Error updating discovery settings", new Object[0]);
        a(av.f58426a);
    }

    /* renamed from: e */
    public void m65636e() {
        this.f56137d.a(new SparksEvent("Account.Delete"));
        SettingsTarget settingsTarget = (SettingsTarget) H();
        if (settingsTarget != null) {
            settingsTarget.showProgressDialog();
            this.f56135b.m56286a(new C166741(this));
        }
    }

    /* renamed from: f */
    public void m65637f() {
        a(ba.f58430a);
    }

    /* renamed from: g */
    public void m65638g() {
        a(bb.f58431a);
    }

    /* renamed from: h */
    public void m65640h() {
        a(bc.f58432a);
    }

    /* renamed from: i */
    public boolean m65641i() {
        return this.f56139f.isMoreGenderEnabled();
    }

    /* renamed from: j */
    public void m65642j() {
        this.f56143j.a(1);
    }

    /* renamed from: k */
    public void m65643k() {
        this.f56143j.b(1);
    }

    /* renamed from: l */
    public void m65644l() {
        this.f56137d.a(new SparksEvent("Menu.Faq"));
        if (this.f56145l.a() == AuthType.FACEBOOK) {
            this.f56144k.a(new C166752(this));
        } else {
            a(C18854t.f58441a);
        }
    }

    /* renamed from: m */
    public void m65645m() {
        SettingsTarget settingsTarget = (SettingsTarget) H();
        if (settingsTarget != null) {
            settingsTarget.showRestoreInProgressMessage();
            this.f56146m.m55544a(RestoreType.FROM_NETWORK).a().a(bindToLifecycle()).a(RxUtils.a()).a(new C18855u(this), new C18856v(settingsTarget));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m65603a(SettingsTarget settingsTarget, Throwable th) {
        C0001a.c(th, "Failed to restore purchases.", new Object[0]);
        settingsTarget.showRestoreFailureMessage(R.string.generic_restore_failure, th.getClass().getSimpleName());
    }

    /* renamed from: n */
    public void m65646n() {
        this.f56133C.add(this.f56158y.execute(Core.INSTANCE).f().a(new C16676w(this), C16677x.f51595a));
    }

    /* renamed from: a */
    final /* synthetic */ void m65622a(RecsLoadingStatus recsLoadingStatus) throws Exception {
        this.f56159z.m62058a(new C14863a(recsLoadingStatus == NoMoreRecs.INSTANCE ? true : null));
    }

    @VisibleForTesting
    /* renamed from: o */
    void m65647o() {
        SettingsTarget settingsTarget = (SettingsTarget) H();
        if (settingsTarget != null) {
            if (this.f56147n.get().isEnabled()) {
                settingsTarget.hideGetPlus();
                settingsTarget.hideBoostAlc();
                settingsTarget.hideSuperlikeAlc();
                settingsTarget.showSettingsPurchaseView();
                return;
            }
            settingsTarget.hideSettingsPurchaseView();
            Collection offers = this.f56142i.getOffers(ProductType.PLUS);
            Collection offers2 = this.f56142i.getOffers(ProductType.BOOST);
            Collection offers3 = this.f56142i.getOffers(ProductType.SUPERLIKE);
            if (!this.f56141h.m57123c() || this.f56141h.m57121a() || C2641a.a(offers)) {
                settingsTarget.hideGetPlus();
            } else {
                settingsTarget.showPlusOffer(R.string.get_tinder_plus);
                settingsTarget.showGetPlus();
            }
            if (!this.f56138e.a() || C2641a.a(offers2)) {
                settingsTarget.hideBoostAlc();
            } else {
                settingsTarget.showBoostAlc();
            }
            if (!this.f56140g.m56817a() || C2641a.a(offers3)) {
                settingsTarget.hideSuperlikeAlc();
            } else {
                settingsTarget.showSuperlikeAlc();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    void m65624a(@NonNull Transaction transaction) {
        SettingsTarget settingsTarget = (SettingsTarget) H();
        if (settingsTarget != null) {
            String d = transaction.mo11881d();
            if (d != null) {
                C14510e offer = this.f56142i.getOffer(d);
                if (offer != null) {
                    if (offer.mo11840b() == ProductType.PLUS) {
                        this.f56156w.m62629a(offer).b(Schedulers.io()).d();
                    } else {
                        this.f56155v.m62581a(d).b(Schedulers.io()).d();
                    }
                }
            }
            if (transaction.mo11878a().equals(Status.SUCCESS)) {
                transaction = transaction.mo11882e();
                if (transaction != null) {
                    settingsTarget.showRestoreSuccessMessage(transaction.getSuccessMessageRes());
                }
            } else {
                transaction = transaction.mo11880c();
                if (transaction == null || !transaction.shouldNotifyUser()) {
                    settingsTarget.showRestoreFailureMessage(RestoreFlowError.GENERIC.getUserFacingMessageResId(), "");
                } else {
                    settingsTarget.showRestoreFailureMessage(transaction.getUserFacingMessageResId(), "");
                    if (transaction == RestoreFlowError.NOTHING_TO_RESTORE) {
                        this.f56151r.m55476a(Source.RESTORE, new EmptyPurchasesException());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m65623a(LogoutFrom logoutFrom) {
        Single a = C15551e.m58079a(this.f56152s.a());
        UnregisterPushToken unregisterPushToken = this.f56149p;
        unregisterPushToken.getClass();
        a.c(C18078y.m65653a(unregisterPushToken)).a(new C18079z(this)).a(C15551e.m58076a(this.f56148o.a(logoutFrom))).a(new aa(this)).a(m65610c(logoutFrom)).b(Schedulers.io()).a(C19397a.a()).d(new ab(this)).a(Actions.a(), ac.f58412a);
    }

    /* renamed from: e */
    final /* synthetic */ Boolean m65635e(Throwable th) {
        return Boolean.valueOf(m65605a("UnregisterPush call failed", th));
    }

    /* renamed from: d */
    final /* synthetic */ Boolean m65633d(Throwable th) {
        return Boolean.valueOf(m65605a("Logout API call failed", th));
    }

    /* renamed from: s */
    final /* synthetic */ void m65651s() {
        a(au.f58425a);
    }

    /* renamed from: p */
    public void m65648p() {
        this.f56133C.add(m65619w().a(new ae(this), af.f51551a));
    }

    /* renamed from: c */
    final /* synthetic */ void m65632c(String str) throws Exception {
        a(new at(str));
    }

    /* renamed from: c */
    static final /* synthetic */ void m65612c(String str, SettingsTarget settingsTarget) {
        if (!TextUtils.isEmpty(str)) {
            settingsTarget.launchMyWebProfile(str);
        }
    }

    /* renamed from: q */
    public void m65649q() {
        this.f56133C.add(m65619w().a(new ag(this), ah.f51553a));
    }

    /* renamed from: b */
    final /* synthetic */ void m65630b(String str) throws Exception {
        a(new as(str));
    }

    /* renamed from: b */
    static final /* synthetic */ void m65608b(String str, SettingsTarget settingsTarget) {
        if (!TextUtils.isEmpty(str)) {
            settingsTarget.createShareWebProfileIntent(str);
        }
    }

    /* renamed from: u */
    private void m65617u() {
        if (this.f56153t.readIsFeedbackDismissed()) {
            a(ai.f58414a);
            m65600a(SettingsOptionType.FEEDBACK);
        } else if (this.f56153t.readIsRatingDismissed()) {
            a(aj.f58415a);
            m65600a(SettingsOptionType.RATE_US);
        }
    }

    /* renamed from: a */
    private void m65600a(SettingsOptionType settingsOptionType) {
        this.f56154u.a(new c$a(FeedbackSource.SETTINGS.getAnalyticsValue(), settingsOptionType.getAnalyticsValue()));
    }

    /* renamed from: c */
    private Completable m65610c(LogoutFrom logoutFrom) {
        return Completable.a(new ak(this, logoutFrom));
    }

    /* renamed from: b */
    final /* synthetic */ void m65629b(LogoutFrom logoutFrom) {
        this.f56150q.a(logoutFrom);
    }

    /* renamed from: a */
    private boolean m65605a(String str, Throwable th) {
        C0001a.c(th, str, new Object[0]);
        return true;
    }

    /* renamed from: v */
    private void m65618v() {
        RxUtils.b(this.f56134D);
        this.f56134D = C15551e.m58077a(this.f56157x.execute(WebProfile.INSTANCE), BackpressureStrategy.LATEST).h().k(al.f56121a).b(Schedulers.io()).a(C19397a.a()).a(new am(this), new an(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m65626a(String str) {
        a(new ar(str));
    }

    /* renamed from: a */
    static final /* synthetic */ void m65604a(String str, SettingsTarget settingsTarget) {
        if (str == null || str.isEmpty()) {
            settingsTarget.showWebProfileUsernameUnavailable();
        } else {
            settingsTarget.showWebProfileUsername(str);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m65627a(Throwable th) {
        a(aq.f58421a);
    }

    /* renamed from: w */
    private C3958c<String> m65619w() {
        return this.f56157x.execute(WebProfile.INSTANCE).firstElement().a(ap.f51554a).b(C15756a.m59010b()).a(C15674a.m58830a());
    }

    /* renamed from: a */
    static final /* synthetic */ MaybeSource m65599a(WebProfileSettings webProfileSettings) throws Exception {
        if (webProfileSettings.getUsername() == null) {
            return C3958c.a();
        }
        return C3958c.a(webProfileSettings.getUsername());
    }

    /* renamed from: r */
    public void m65650r() {
        SettingsTarget settingsTarget = (SettingsTarget) H();
        if (settingsTarget != null) {
            settingsTarget.navigateToPlacesSettings();
        }
    }
}
