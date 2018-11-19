package com.tinder.activities;

import android.app.Activity;
import android.arch.lifecycle.LifecycleObserver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.customtabs.C0164c.C0163a;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.transition.ChangeBounds;
import android.view.KeyEvent;
import android.view.Menu;
import com.facebook.accountkit.AccountKitLoginResult;
import com.facebook.accountkit.ui.AccountKitActivity;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.network.connectionclass.ConnectionClassManager;
import com.facebook.network.connectionclass.ConnectionClassManager.ConnectionClassStateChangeListener;
import com.facebook.network.connectionclass.ConnectionQuality;
import com.google.gson.Gson;
import com.tinder.R;
import com.tinder.account.view.UpdateAccountEmailPasswordActivity;
import com.tinder.activities.ActivityEditProfile.EditProfileDestination;
import com.tinder.analytics.chat.Origin;
import com.tinder.analytics.performance.af;
import com.tinder.app.dagger.component.MainActivityComponent;
import com.tinder.app.dagger.component.TopPicksComponent;
import com.tinder.app.dagger.qualifier.DefaultMainPage;
import com.tinder.apprating.view.AppRatingDialog;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.view.LockableViewPager$LockableViewPagerParent;
import com.tinder.bitmoji.p177a.C10366a;
import com.tinder.chat.activity.C8406b;
import com.tinder.common.p076a.C2640a;
import com.tinder.common.p191d.C8529a;
import com.tinder.common.view.Container;
import com.tinder.common.view.ContainerRegistrar;
import com.tinder.crashindicator.view.AppCrashDialog;
import com.tinder.deeplink.DeepLinkedSharedRecInterceptor;
import com.tinder.dialogs.DiscoveryToolTip;
import com.tinder.dialogs.DiscoveryToolTip.ToolTipState;
import com.tinder.home.injector.MainActivityInjector;
import com.tinder.home.injector.MainActivityInjector.Factory;
import com.tinder.home.injector.MainActivityInjector.Owner;
import com.tinder.home.p259b.C9695a;
import com.tinder.listeners.ListenerUpdateProfileInfo;
import com.tinder.main.BackPressInterceptor;
import com.tinder.main.model.MainPage;
import com.tinder.main.p287c.C13390c;
import com.tinder.main.qualifier.MainActivityQualifier;
import com.tinder.main.trigger.Trigger;
import com.tinder.managers.C2652a;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerFusedLocation.ListenerLocationChanged;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.managers.bq;
import com.tinder.managers.bt;
import com.tinder.model.DeepLinkParams;
import com.tinder.module.FeedViewComponent;
import com.tinder.module.FeedViewComponentProvider;
import com.tinder.module.MainActivityComponentProvider;
import com.tinder.module.MatchesListComponent;
import com.tinder.module.MatchesListComponentProvider;
import com.tinder.module.MatchesViewComponent;
import com.tinder.module.MatchesViewComponentProvider;
import com.tinder.passport.p359e.C13543a;
import com.tinder.passport.target.PassportTarget;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.places.injection.PlacesComponent;
import com.tinder.places.injection.PlacesComponentProvider;
import com.tinder.places.main.util.PlacesSharedViewInjector;
import com.tinder.places.main.view.PlacesPinDropView;
import com.tinder.presenters.df;
import com.tinder.profile.activities.CurrentUserProfileActivity;
import com.tinder.profile.module.ProfileComponent;
import com.tinder.profile.module.ProfileComponentProvider;
import com.tinder.profiletab.injector.ProfileTabViewInjector;
import com.tinder.profiletab.view.ProfileTabView;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.model.TinderNotification.NotificationOrigin;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.reactions.dialog.C16315a;
import com.tinder.recs.component.RecsViewComponent;
import com.tinder.recs.component.RecsViewComponentProvider;
import com.tinder.recs.injection.RecsCardsInjector;
import com.tinder.recs.injection.RecsCardsInjector$Factory;
import com.tinder.settings.activity.SettingsActivity;
import com.tinder.settings.views.AccountPausedDialog;
import com.tinder.superlikeable.injector.SuperLikeableInjector;
import com.tinder.superlikeable.view.SuperLikeableViewContainer;
import com.tinder.targets.MainActivityTarget;
import com.tinder.tindergold.view.TinderGoldIntroDialog;
import com.tinder.tindergold.view.TinderGoldIntroDialog$TinderGoldIntroListener;
import com.tinder.toppicks.TopPicksComponentProvider;
import com.tinder.toppicks.di.TopPicksInjector;
import com.tinder.utils.C15365p;
import com.tinder.utils.RxUtils;
import com.tinder.utils.ad;
import com.tinder.utils.at;
import com.tinder.utils.av;
import com.tinder.verification.C15388c.C15387a;
import com.tinder.verification.C18287b;
import com.tinder.verification.trigger.SmsVerificationDisplayOwner;
import com.tinder.video.injection.VideoInjector;
import com.tinder.video.injection.VideoInjector$Factory;
import io.branch.referral.Branch;
import io.branch.referral.C15583e;
import java.util.Set;
import java8.util.Optional;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Named;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p000a.p001a.C0001a;
import rx.Single;

public class MainActivity extends ActivitySignedInBase implements OnQueryTextListener, ConnectionClassStateChangeListener, LockableViewPager$LockableViewPagerParent, ContainerRegistrar, Owner, ListenerUpdateProfileInfo, ListenerLocationChanged, FeedViewComponentProvider, MainActivityComponentProvider, MatchesListComponentProvider, MatchesViewComponentProvider, PassportTarget, PlacesComponentProvider, PlacesSharedViewInjector, ProfileComponentProvider, RecsViewComponentProvider, RecsCardsInjector$Factory, MainActivityTarget, TinderGoldIntroDialog$TinderGoldIntroListener, TopPicksComponentProvider, SmsVerificationDisplayOwner, VideoInjector$Factory {
    /* renamed from: T */
    private TinderGoldIntroDialog f14924T;
    /* renamed from: U */
    private C16315a f14925U;
    /* renamed from: V */
    private C10366a f14926V;
    @NonNull
    /* renamed from: W */
    private Handler f14927W = new Handler(Looper.getMainLooper());
    /* renamed from: X */
    private DeepLinkParams f14928X;
    /* renamed from: Y */
    private boolean f14929Y;
    /* renamed from: Z */
    private ProfileComponent f14930Z;
    @Inject
    /* renamed from: a */
    C2652a f14931a;
    private Container aa;
    @Nullable
    private AccountPausedDialog ab;
    @Nullable
    private AppRatingDialog ac;
    private RecsViewComponent ad;
    private AppCrashDialog ae;
    private MainActivityInjector af;
    @Nullable
    private ProfileTabViewInjector ag;
    @Nullable
    private TopPicksInjector ah;
    @Nullable
    private VideoInjector ai;
    @Nullable
    private RecsCardsInjector aj;
    @Nullable
    private MatchesViewComponent ak;
    @Nullable
    private MatchesListComponent al;
    @Nullable
    private FeedViewComponent am;
    @Nullable
    private PlacesComponent an;
    @Nullable
    private C18287b ao;
    private C13390c ap;
    @Inject
    /* renamed from: b */
    bk f14932b;
    @Inject
    /* renamed from: c */
    bj f14933c;
    @Inject
    /* renamed from: d */
    ManagerDeepLinking f14934d;
    @Inject
    /* renamed from: e */
    bq f14935e;
    @Inject
    /* renamed from: f */
    ManagerFusedLocation f14936f;
    @Inject
    /* renamed from: g */
    bt f14937g;
    @Inject
    /* renamed from: h */
    LegacyBreadCrumbTracker f14938h;
    @Inject
    /* renamed from: i */
    df f14939i;
    @Inject
    /* renamed from: j */
    C13543a f14940j;
    @Inject
    /* renamed from: k */
    Gson f14941k;
    @Inject
    /* renamed from: l */
    ConnectionClassManager f14942l;
    @Inject
    /* renamed from: m */
    C8406b f14943m;
    @Inject
    /* renamed from: n */
    af f14944n;
    @Inject
    /* renamed from: o */
    C9695a f14945o;
    @Inject
    /* renamed from: p */
    Set<BackPressInterceptor> f14946p;
    @Inject
    @DefaultMainPage
    /* renamed from: q */
    MainPage f14947q;
    @Inject
    @MainActivityQualifier
    /* renamed from: r */
    Set<LifecycleObserver> f14948r;
    @Inject
    /* renamed from: s */
    C14548a f14949s;
    @Inject
    /* renamed from: t */
    C14550a f14950t;
    @Inject
    @Named("validate_configuration")
    /* renamed from: u */
    AccountKitConfiguration f14951u;

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    public void onProfileUpdateFailed() {
    }

    public void onProfileUpdateSuccess() {
    }

    public boolean onQueryTextChange(String str) {
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }

    public void setupProfileAndMatchesTab() {
    }

    public void showTinderFlameNoSocial() {
    }

    public MainActivity() {
        super(true);
    }

    public void onCreate(Bundle bundle) {
        if (VERSION.SDK_INT >= 21) {
            getWindow().requestFeature(12);
            getWindow().setAllowEnterTransitionOverlap(false);
            getWindow().setAllowReturnTransitionOverlap(false);
            getWindow().setSharedElementEnterTransition(new ChangeBounds());
            getWindow().setSharedElementReenterTransition(new ChangeBounds());
        }
        super.onCreate(bundle);
        this.af = ((Factory) getApplicationContext()).createMainActivityInjector(this);
        this.af.inject(this);
        this.f14939i.m();
        for (LifecycleObserver a : this.f14948r) {
            getLifecycle().mo36a(a);
        }
        this.ap = new C13390c(this, (MainActivityComponent) this.af);
        this.ap.setId(R.id.main_activity_container);
        setContentView(this.ap, C8529a.f30276a.a());
        this.f14945o.a(this.f14947q);
        this.f14939i.a(this);
        this.f14939i.e();
        m18779s();
        if (getIntent() != null) {
            m18768a(getIntent());
        }
        this.f14939i.b(m18782v());
    }

    protected void onStart() {
        super.onStart();
        this.f14939i.a(this);
        this.f14939i.b();
        this.f14940j.a(this);
        m18776p();
        this.f14942l.m6184a((ConnectionClassStateChangeListener) this);
    }

    public void onResume() {
        super.onResume();
        this.f14938h.a(this);
        if (m18709l()) {
            m18693a((Activity) this, (ListenerLocationChanged) this);
            m18694a(null);
            if (!m18708k()) {
                t_();
            }
        } else if (!this.F) {
            Object obj = (!this.f14929Y || ActivityCompat.m10978a((Activity) this, "android.permission.ACCESS_COARSE_LOCATION")) ? null : 1;
            if (obj == null) {
                m18777q();
                this.f14929Y = true;
            }
            this.f14939i.c();
        }
        Single.a(C6168w.f22688a).a(RxUtils.m10183a().a()).a(new C8114x(this), C8115z.f29108a);
        this.f14939i.f();
        this.f14940j.b();
        this.f14939i.l();
        this.f14939i.r();
        if (m18783w()) {
            this.f14939i.v();
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m18785a(Boolean bool) {
        if (bool.booleanValue() != null) {
            this.P.a("crash");
        }
    }

    public void onPause() {
        super.onPause();
        ad.m10189a();
        m18698a((ListenerLocationChanged) this);
        this.f14939i.d();
    }

    protected void onStop() {
        super.onStop();
        this.f14939i.a();
        this.f14940j.a();
        this.f14942l.m6187b(this);
    }

    /* renamed from: a */
    private void m18768a(Intent intent) {
        if (intent != null) {
            intent = intent.getExtras();
            if (!(intent == null || !intent.containsKey("notificaiton_photo_optimizer_id") || intent.get("notificaiton_photo_optimizer_id").equals("photo_optimized") == null)) {
                this.f14939i.j();
                startActivity(new Intent(this, ActivityEditProfile.class));
            }
        }
    }

    /* renamed from: p */
    private void m18776p() {
        Uri data = getIntent().getData();
        Uri b = this.f14934d.b();
        if (data != null || b != null) {
            if (data == null) {
                data = b;
            }
            Branch.m15210b().m15261a(new aa(this), data, (Activity) this);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m18786a(JSONObject jSONObject, C15583e c15583e) {
        if (c15583e != null) {
            ad.m10197c(c15583e.a());
        }
        if (jSONObject != null) {
            this.f14928X = (DeepLinkParams) this.f14941k.fromJson(jSONObject.toString(), DeepLinkParams.class);
        }
        if (this.f14928X != null) {
            m18770a(this.f14928X);
        }
    }

    /* renamed from: q */
    private void m18777q() {
        ActivityCompat.m10977a(this, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, 0);
        this.f14939i.k();
    }

    public void s_() {
        this.f14935e.m10147a();
        this.f14932b.m14958a(ManagerApp.f12347c);
    }

    public void onNewIntent(Intent intent) {
        setIntent(intent);
        super.onNewIntent(intent);
        this.f14939i.a(this);
        m18779s();
    }

    public void showDiscoveryToolTip() {
        new DiscoveryToolTip(this, ToolTipState.SELECT).show();
    }

    public void showTinderGoldIntro() {
        if (this.f14924T == null || !this.f14924T.isShowing()) {
            this.f14924T = new TinderGoldIntroDialog(this, this);
            this.f14924T.show();
        }
    }

    public void showTinderReactionsIntro() {
        if (this.f14925U == null || !this.f14925U.isShowing()) {
            this.f14925U = new C16315a(this);
            this.f14925U.show();
        }
    }

    public void showBitmojiIntroDialog() {
        if (this.f14926V == null || !this.f14926V.isShowing()) {
            this.f14926V = new C10366a(this);
            this.f14926V.show();
            this.f14939i.s();
        }
    }

    public void openEditProfileActivity(EditProfileDestination editProfileDestination) {
        openIntent(ActivityEditProfile.a(this, editProfileDestination));
    }

    public void openSettingsActivity() {
        openIntent(SettingsActivity.a(this));
    }

    public void openIntent(Intent intent) {
        startActivity(intent);
    }

    public void onGoldIntroContinueClick() {
        C10076o.a(GoldPaywallSource.FASTMATCH_INTRO).a(this);
    }

    public void hideProgressBar() {
        if (this.ao != null) {
            this.ao.b();
        }
    }

    public void dismissVerificationDialog() {
        av.m10215a(this.ao);
    }

    public void showSmsVerificationSuccessNotification() {
        this.f14950t.a(this.f14949s.a());
    }

    public void showSmsVerificationErrorNotification() {
        TinderNotification b = this.f14949s.b(getString(R.string.sms_verification_error_notification_message), getString(R.string.sms_verification_error_notification_title));
        df dfVar = this.f14939i;
        dfVar.getClass();
        b.a(ab.a(dfVar));
        this.f14950t.a(b);
    }

    /* renamed from: a */
    private void m18770a(@NonNull DeepLinkParams deepLinkParams) {
        String deeplinkPath = deepLinkParams.getDeeplinkPath();
        if (deeplinkPath == null || !deeplinkPath.startsWith("tinder://")) {
            if (!(this.f14934d.b() == null || ManagerDeepLinking.c())) {
                if (!isFinishing()) {
                    if (this.f14931a.m10128d()) {
                        this.f14934d.a(deepLinkParams.getReferringLink(), new MainActivity$1(this, deepLinkParams));
                        this.f14934d.a(deepLinkParams, new MainActivity$2(this));
                        this.f14934d.d();
                    } else {
                        startActivity(new Intent(this, LoginActivity.class));
                        finish();
                    }
                    return;
                }
            }
            return;
        }
        this.f14939i.a(deeplinkPath, NotificationOrigin.UNDEFINED);
    }

    /* renamed from: r */
    private void m18778r() {
        for (DeepLinkedSharedRecInterceptor interceptOnProfileLoadFailed : this.f14934d.a()) {
            if (interceptOnProfileLoadFailed.interceptOnProfileLoadFailed()) {
                return;
            }
        }
    }

    public void t_() {
        if (ManagerApp.m14847a((Context) this).m14876d()) {
            this.f14927W.postDelayed(new MainActivity$3(this, this), 10000);
        } else {
            ad.m10197c("Not refreshing location, we're not in the foreground.");
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i == 0) {
            i = this.f14937g.a(iArr);
            if (i != 0) {
                this.f14936f.m14890a();
            }
            this.f14939i.a(i);
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* renamed from: s */
    private void m18779s() {
        Intent intent = getIntent();
        if (intent != null) {
            String b = m18772b(intent);
            if (b == null) {
                b = m18773c(intent);
            }
            if (b != null) {
                this.f14939i.a(b, m18774d(intent));
            }
        }
    }

    @Nullable
    /* renamed from: b */
    private String m18772b(Intent intent) {
        return intent.getExtras() != null ? intent.getExtras().getString("tinder_url") : null;
    }

    @Nullable
    /* renamed from: c */
    private String m18773c(Intent intent) {
        if (!"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        }
        intent = intent.getDataString();
        if (intent.startsWith("tinder://")) {
            return intent;
        }
        return null;
    }

    /* renamed from: d */
    private NotificationOrigin m18774d(@NonNull Intent intent) {
        intent = intent.getExtras();
        intent = Optional.b(intent != null ? intent.getSerializable("notification_source") : null);
        Class cls = NotificationOrigin.class;
        cls.getClass();
        intent = intent.a(ac.a(cls));
        cls = NotificationOrigin.class;
        cls.getClass();
        return (NotificationOrigin) intent.a(ad.a(cls)).c(NotificationOrigin.UNDEFINED);
    }

    /* renamed from: d */
    public void mo4103d() {
        this.f14939i.q();
    }

    public void showAccountPausedDialog() {
        if (!isFinishing()) {
            this.ab = new AccountPausedDialog(this, new ae(this));
            this.ab.show();
        }
    }

    /* renamed from: f */
    final /* synthetic */ void mo4107f() {
        this.f14939i.o();
    }

    public void dismissPausedDialog() {
        if (this.ab != null) {
            this.ab.dismiss();
            this.ab = null;
        }
    }

    public void onBackPressed() {
        if (this.aa == null || !this.aa.onBackPressed()) {
            for (BackPressInterceptor intercept : this.f14946p) {
                if (intercept.intercept()) {
                    C0001a.m25b("Back Press intercepted by %s", ((BackPressInterceptor) r0.next()).getClass().getSimpleName());
                    return;
                }
            }
            m18781u();
            super.onBackPressed();
        }
    }

    public void showPage(MainPage mainPage) {
        this.ap.setDisplayedPage(mainPage);
    }

    public void showSnackbar(int i) {
        at.a(this, i);
    }

    public void showAppRatingDialog() {
        if (!isFinishing()) {
            if (this.ac == null) {
                this.ac = new AppRatingDialog(this);
                this.ac.setOnDismissListener(new af(this));
                this.ac.show();
            } else if (!this.ac.isShowing()) {
                this.ac.show();
            }
        }
    }

    /* renamed from: c */
    final /* synthetic */ void m18788c(DialogInterface dialogInterface) {
        this.ac = null;
    }

    public void showCrashApologyDialog() {
        if (!isFinishing()) {
            if (this.ae == null) {
                this.ae = new AppCrashDialog(this);
                this.ae.setOnDismissListener(new ag(this));
                this.ae.show();
            } else if (!this.ae.isShowing()) {
                this.ae.show();
            }
        }
    }

    /* renamed from: b */
    final /* synthetic */ void m18787b(DialogInterface dialogInterface) {
        this.ae = null;
    }

    public void goToMyProfile() {
        startActivity(new Intent(this, CurrentUserProfileActivity.class));
    }

    public void goToChat(String str) {
        C2640a.m9986a(str);
        this.f14944n.a("START_TINDER_CHAT_TIMER_KEY");
        startActivity(this.f14943m.a(this, Origin.IN_APP_NOTIFICATION, str));
    }

    /* renamed from: t */
    private void m18780t() {
        this.f14933c.m10144g(true);
        this.f14933c.m10142f(false);
    }

    protected void onActivityResult(int i, int i2, @NonNull Intent intent) {
        ad.m10190a(String.format("onActivityResult: requestCode[%s] responseCode[%s]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        if (i != 1) {
            if (i != 102) {
                if (i != 58345) {
                    super.onActivityResult(i, i2, intent);
                } else if (i2 == 2) {
                    this.f14939i.p();
                }
            } else if (i2 != 0) {
                AccountKitLoginResult accountKitLoginResult = (AccountKitLoginResult) intent.getParcelableExtra(AccountKitLoginResult.RESULT_KEY);
                if (this.ao != 0) {
                    this.ao.a();
                }
                this.f14939i.a(accountKitLoginResult);
            }
        } else if (i2 == 1) {
            mo4103d();
        }
    }

    public void onDestroy() {
        m18781u();
        super.onDestroy();
        this.f14939i.n();
        for (LifecycleObserver b : this.f14948r) {
            getLifecycle().mo37b(b);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 82) {
            if (super.onKeyDown(i, keyEvent) == 0) {
                return false;
            }
        }
        return true;
    }

    public void onLocationChanged(Location location) {
        ad.m10189a();
        m18694a(location);
    }

    public void setPassportLocation() {
        m18780t();
    }

    public void showBoostSummaryFromNotification() {
        Intent intent = getIntent();
        intent.removeExtra("notification_type");
        intent.getExtras().remove("notification_type");
        mo4103d();
    }

    public void onBandwidthStateChange(ConnectionQuality connectionQuality) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bandwidthState changed to ");
        stringBuilder.append(connectionQuality.toString());
        ad.m10190a(stringBuilder.toString());
    }

    public ProfileComponent provideComponent() {
        if (this.f14930Z == null) {
            this.f14930Z = ManagerApp.m14858e().profileComponentBuilder().profileActivityContext(this).build();
        }
        return this.f14930Z;
    }

    public void showUpdateAccountEmailPasswordScreen() {
        startActivity(UpdateAccountEmailPasswordActivity.a(this));
    }

    public MainActivityComponent provideMainActivityComponent() {
        return (MainActivityComponent) this.af;
    }

    @NotNull
    public TopPicksComponent provideTopPicksComponent() {
        return (TopPicksComponent) provideTopPicksInjector();
    }

    @NotNull
    public PlacesComponent getPlacesComponent() {
        return this.an;
    }

    public void setPlacesComponent(@NotNull PlacesComponent placesComponent) {
        this.an = placesComponent;
    }

    @Nonnull
    public MatchesViewComponent provideMatchesViewComponent() {
        return (MatchesViewComponent) C2640a.m9987a(this.ak, "Attempting to inject into MatchesViewComponent without first configuring it");
    }

    @Nonnull
    public MatchesListComponent provideMatchesListComponent() {
        return (MatchesListComponent) C2640a.m9987a(this.al, "Attempting to inject into MatchesListComponent without first configuring it");
    }

    @Nonnull
    public FeedViewComponent provideFeedViewComponent() {
        return (FeedViewComponent) C2640a.m9987a(this.am, "Attempting to inject into FeedViewComponent without first configuring it");
    }

    public void launchPaywall(C10076o c10076o) {
        c10076o.a(this);
    }

    public void setMatchesViewComponent(@Nonnull MatchesViewComponent matchesViewComponent) {
        this.ak = matchesViewComponent;
    }

    public void setMatchesListComponent(@Nonnull MatchesListComponent matchesListComponent) {
        this.al = matchesListComponent;
    }

    public void setFeedViewComponent(@Nonnull FeedViewComponent feedViewComponent) {
        this.am = feedViewComponent;
    }

    public void setContainer(Container container) {
        this.aa = container;
    }

    public void setPagingEnabled(boolean z) {
        this.ap.setPagingEnabled(z);
    }

    public boolean isPagingEnabled() {
        return this.ap.a();
    }

    @NonNull
    public RecsViewComponent getRecsViewComponent() {
        return (RecsViewComponent) C2640a.m9987a(this.ad, "Must be attached to RecsView");
    }

    public void setRecsViewComponent(@NonNull RecsViewComponent recsViewComponent) {
        this.ad = recsViewComponent;
    }

    @NotNull
    public MainActivityInjector getMainActivityInjector() {
        return this.af;
    }

    @NotNull
    public TopPicksInjector provideTopPicksInjector() {
        if (this.ah == null) {
            this.ah = this.af.newTopPicksInjector();
        }
        return this.ah;
    }

    @NotNull
    public VideoInjector provideVideoInjector() {
        if (this.ai == null) {
            this.ai = this.af.newVideoInjector();
        }
        return this.ai;
    }

    @NotNull
    public RecsCardsInjector provideRecsCardsInjector() {
        if (this.aj == null) {
            this.aj = this.af.newRecsCardsInjector();
        }
        return this.aj;
    }

    public SuperLikeableInjector createSuperLikeableInjector(SuperLikeableViewContainer superLikeableViewContainer) {
        return this.af.newSuperLikeableInjector(superLikeableViewContainer);
    }

    public ProfileTabViewInjector getGetProfileTabInjector() {
        return (ProfileTabViewInjector) C2640a.m9987a(this.ag, "Must be attached to Profile View");
    }

    public ProfileTabViewInjector createProfileTabInjector(ProfileTabView profileTabView) {
        this.ag = this.af.newProfileTabInjector(profileTabView);
        return this.ag;
    }

    public void injectPlacesPinDropView(PlacesPinDropView placesPinDropView) {
        this.an.inject(placesPinDropView);
    }

    /* renamed from: e */
    public C13390c mo4106e() {
        return this.ap;
    }

    /* renamed from: u */
    private void m18781u() {
        av.m10218a(this.S, this.ac, this.ae);
    }

    /* renamed from: v */
    private boolean m18782v() {
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("lp_message")) {
                return true;
            }
        }
        return false;
    }

    public void showSmsVerificationDialog(@NotNull C15387a c15387a, boolean z, @NotNull Trigger trigger) {
        if (this.ao == null) {
            this.ao = new C18287b(this);
            this.ao.a(c15387a.a(z, getResources()), new MainActivity$4(this, trigger));
            this.ao.setOnDismissListener(new C6169y(this));
            this.ao.show();
            this.f14939i.v();
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m18784a(DialogInterface dialogInterface) {
        this.f14939i.t();
    }

    public void showAccountKit() {
        Intent intent = new Intent(this, AccountKitActivity.class);
        intent.putExtra(AccountKitActivity.a, this.f14951u);
        startActivityForResult(intent, 102);
    }

    public void showSmsCollectionFaq(@NonNull String str) {
        if (C15365p.a(this)) {
            new C0163a().m597a(this, R.anim.enter_bottom_to_top, R.anim.enter_top_to_bottom).m600b(this, R.anim.exit_top_to_bottom, R.anim.exit_bottom_to_top).m598a(true).m596a(getResources().getColor(R.color.white)).m599a().m601a(this, Uri.parse(str));
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    /* renamed from: w */
    private boolean m18783w() {
        return (this.ao == null || !this.ao.isShowing() || this.ao.c()) ? false : true;
    }
}
