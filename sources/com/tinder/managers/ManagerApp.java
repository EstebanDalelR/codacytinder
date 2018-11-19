package com.tinder.managers;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.annotation.VisibleForTesting;
import android.support.multidex.C0274a;
import android.support.text.emoji.EmojiCompat;
import android.support.text.emoji.EmojiCompat.C0282c;
import com.android.volley.RequestQueue;
import com.bumptech.glide.C0994i;
import com.facebook.FacebookSdk;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.LeanplumPushService;
import com.squareup.p070a.C2598a;
import com.squareup.p070a.C2599b;
import com.tinder.activities.LoginActivity;
import com.tinder.activities.MainActivity;
import com.tinder.analytics.C2634g;
import com.tinder.analytics.attribution.AttributionTracker;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.C3918c;
import com.tinder.application.ApplicationComponent;
import com.tinder.application.C4423a;
import com.tinder.apprating.p086a.C3919h;
import com.tinder.apprating.p087d.C3920a;
import com.tinder.bitmoji.C3922i;
import com.tinder.bitmoji.di.BitmojiComponent;
import com.tinder.bitmoji.di.BitmojiComponentProvider;
import com.tinder.bitmoji.di.C3921a;
import com.tinder.common.CrashReporter;
import com.tinder.common.log.LoggingInitializer;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.C2644k;
import com.tinder.crashindicator.reporter.UncaughtExceptionTracker;
import com.tinder.domain.auth.DeleteUserData;
import com.tinder.domain.common.usecase.CompletableUseCase.EmptyRequest;
import com.tinder.domain.experiments.BucketsWorker;
import com.tinder.domain.match.usecase.DeleteAllMatches;
import com.tinder.domain.message.usecase.CleanUpPendingMessages;
import com.tinder.domain.places.tracker.PlacesLocationTracker;
import com.tinder.events.EventLoggedOut;
import com.tinder.events.EventUnregisterManagers;
import com.tinder.feed.view.C3929a;
import com.tinder.home.injector.MainActivityInjector;
import com.tinder.home.injector.MainActivityInjector.Factory;
import com.tinder.intropricing.C3930b;
import com.tinder.intropricing.C3931c;
import com.tinder.intropricing.di.C3932a;
import com.tinder.intropricing.di.IntroPricingApplicationComponent;
import com.tinder.intropricing.di.IntroPricingApplicationComponent.IntroPricingApplicationComponentProvider;
import com.tinder.loops.di.C3933a;
import com.tinder.loops.di.LoopsApplicationComponent;
import com.tinder.loops.di.LoopsApplicationComponentProvider;
import com.tinder.model.auth.LogoutFrom;
import com.tinder.model.auth.LogoutFrom$FORCED;
import com.tinder.model.auth.LogoutFrom.Merge;
import com.tinder.module.Default;
import com.tinder.module.TinderComponent;
import com.tinder.notifications.di.C3943a;
import com.tinder.notifications.di.SettingsNotificationComponent;
import com.tinder.notifications.di.SettingsNotificationComponentProvider;
import com.tinder.onboarding.component.C3944a;
import com.tinder.onboarding.component.CountdownComponent;
import com.tinder.onboarding.component.CountdownComponentProvider;
import com.tinder.onboarding.module.C2655a;
import com.tinder.p071a.C2602d;
import com.tinder.passport.p093d.C3945a;
import com.tinder.recs.engine.RecsEngineResolver;
import com.tinder.settings.module.C2656a;
import com.tinder.settings.module.ExitSurveyComponent;
import com.tinder.settingsemail.email.component.EmailSettingsComponent$EmailSettingsComponentParentProvider;
import com.tinder.settingsemail.email.component.EmailSettingsComponent$Parent;
import com.tinder.toppicks.di.C3946a;
import com.tinder.toppicks.di.TopPicksApplicationComponent;
import com.tinder.toppicks.di.TopPicksApplicationComponentProvider;
import com.tinder.toppicks.notifications.C3947n;
import com.tinder.toppicks.notifications.C3947n.C2659a;
import com.tinder.toppicks.notifications.ScheduleTopPicksNotification$Reason;
import com.tinder.typingindicator.C3948a;
import com.tinder.typingindicator.worker.TypingIndicatorWorker;
import com.tinder.updates.C3949b;
import com.tinder.updates.UpdatesScheduler;
import com.tinder.usecase.C3950a;
import com.tinder.usecase.C3951c;
import com.tinder.usecase.C3952i;
import com.tinder.usecase.C3953l;
import com.tinder.utils.AppLifeCycleTracker;
import com.tinder.utils.AppLifeCycleTracker.LifeCycleHelperInterface;
import com.tinder.utils.RxUtils;
import com.tinder.utils.ad;
import com.tinder.utils.av;
import com.tinder.video.injection.C3954a;
import com.tinder.video.injection.VideoComponent;
import com.tinder.video.injection.VideoComponentProvider;
import com.tinder.webprofile.di.C3955a;
import com.tinder.webprofile.di.WebProfileComponent;
import com.tinder.webprofile.di.WebProfileComponentProvider;
import de.greenrobot.event.C2664c;
import de.greenrobot.event.C2665f;
import de.javakaffee.kryoserializers.jodatime.JodaDateTimeSerializer;
import de.javakaffee.kryoserializers.jodatime.JodaLocalDateSerializer;
import de.javakaffee.kryoserializers.jodatime.JodaLocalDateTimeSerializer;
import io.branch.referral.Branch;
import io.paperdb.Paper;
import io.reactivex.p079d.C2667a;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import net.danlew.android.joda.C2669b;
import okhttp3.C2670b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import rx.schedulers.Schedulers;

public class ManagerApp extends Application implements BitmojiComponentProvider, Factory, IntroPricingApplicationComponentProvider, LoopsApplicationComponentProvider, SettingsNotificationComponentProvider, CountdownComponentProvider, EmailSettingsComponent$EmailSettingsComponentParentProvider, TopPicksApplicationComponentProvider, LifeCycleHelperInterface, VideoComponentProvider, WebProfileComponentProvider {
    public static final String APP_BUILD_NUMBER = String.valueOf(2776);
    @Deprecated
    /* renamed from: V */
    private static Context f12340V = null;
    @Nullable
    /* renamed from: W */
    private static String f12341W = null;
    /* renamed from: X */
    private static ApplicationComponent f12342X = null;
    /* renamed from: Y */
    private static ExitSurveyComponent f12343Y = null;
    /* renamed from: Z */
    private static Info f12344Z = null;
    /* renamed from: a */
    public static boolean f12345a = true;
    /* renamed from: b */
    public static String f12346b;
    /* renamed from: c */
    public static String f12347c;
    @Inject
    /* renamed from: A */
    C3929a f12348A;
    @Inject
    /* renamed from: B */
    AbTestUtility f12349B;
    @Inject
    /* renamed from: C */
    RecsEngineResolver f12350C;
    @Inject
    /* renamed from: D */
    C3953l f12351D;
    @Inject
    /* renamed from: E */
    C3951c f12352E;
    @Inject
    /* renamed from: F */
    CleanUpPendingMessages f12353F;
    @Inject
    /* renamed from: G */
    C3920a f12354G;
    @Inject
    /* renamed from: H */
    UncaughtExceptionTracker f12355H;
    @Inject
    /* renamed from: I */
    PlacesLocationTracker f12356I;
    @Inject
    /* renamed from: J */
    C3952i f12357J;
    @Inject
    /* renamed from: K */
    C3918c f12358K;
    @Inject
    /* renamed from: L */
    C0282c f12359L;
    @Inject
    /* renamed from: M */
    TypingIndicatorWorker f12360M;
    @Inject
    /* renamed from: N */
    C3948a f12361N;
    @Inject
    /* renamed from: O */
    C3930b f12362O;
    @Inject
    /* renamed from: P */
    C3931c f12363P;
    @Inject
    /* renamed from: Q */
    C3947n f12364Q;
    @Inject
    /* renamed from: R */
    C3922i f12365R;
    @Inject
    /* renamed from: S */
    BucketsWorker f12366S;
    /* renamed from: T */
    protected C2599b f12367T = C2599b.f8129a;
    /* renamed from: U */
    protected C2644k f12368U = new C2644k();
    private final Handler aa = new Handler(Looper.getMainLooper());
    @Inject
    /* renamed from: d */
    C2652a f12369d;
    @Inject
    /* renamed from: e */
    UserMetaManager f12370e;
    @Default
    @Inject
    /* renamed from: f */
    C2664c f12371f;
    @Inject
    /* renamed from: g */
    C2670b f12372g;
    @Inject
    /* renamed from: h */
    C2670b f12373h;
    @Inject
    /* renamed from: i */
    RequestQueue f12374i;
    @Inject
    /* renamed from: j */
    bj f12375j;
    @Inject
    /* renamed from: k */
    bk f12376k;
    @Inject
    /* renamed from: l */
    C3945a f12377l;
    @Inject
    /* renamed from: m */
    bq f12378m;
    @Inject
    /* renamed from: n */
    ManagerProfile f12379n;
    @Inject
    /* renamed from: o */
    C2634g f12380o;
    @Inject
    /* renamed from: p */
    ManagerFusedLocation f12381p;
    @Inject
    /* renamed from: q */
    C2630h f12382q;
    @Inject
    /* renamed from: r */
    LoggingInitializer f12383r;
    @Inject
    /* renamed from: s */
    CrashReporter f12384s;
    @Inject
    /* renamed from: t */
    DeleteAllMatches f12385t;
    @Inject
    /* renamed from: u */
    UpdatesScheduler f12386u;
    @Inject
    /* renamed from: v */
    AppVisibilityTracker f12387v;
    @Inject
    /* renamed from: w */
    C3949b f12388w;
    @Inject
    /* renamed from: x */
    C3950a f12389x;
    @Inject
    /* renamed from: y */
    AttributionTracker f12390y;
    @Inject
    /* renamed from: z */
    DeleteUserData f12391z;

    /* renamed from: com.tinder.managers.ManagerApp$1 */
    class C26491 extends AsyncTask<Void, Void, Info> {
        /* renamed from: a */
        final /* synthetic */ ManagerApp f8299a;

        C26491(ManagerApp managerApp) {
            this.f8299a = managerApp;
        }

        @Nullable
        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m10055a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m10056a((Info) obj);
        }

        @Nullable
        /* renamed from: a */
        protected Info m10055a(Void... voidArr) {
            try {
                return AdvertisingIdClient.getAdvertisingIdInfo(this.f8299a);
            } catch (Throwable e) {
                ad.m10193a("Failed to load Advertising ID", e);
                return null;
            } catch (Throwable e2) {
                ad.m10193a("Failed to load Advertising ID, Google Play Services missing!", e2);
                return null;
            } catch (Throwable e22) {
                ad.m10193a("Failed to load Advertising ID, Google Play Services not setup properly!", e22);
                return null;
            }
        }

        /* renamed from: a */
        protected void m10056a(Info info) {
            ManagerApp.f12344Z = info;
        }
    }

    /* renamed from: com.tinder.managers.ManagerApp$2 */
    class C26502 implements ComponentCallbacks2 {
        /* renamed from: a */
        final /* synthetic */ ManagerApp f8300a;

        public void onConfigurationChanged(Configuration configuration) {
        }

        C26502(ManagerApp managerApp) {
            this.f8300a = managerApp;
        }

        public void onTrimMemory(int i) {
            C0994i.m3486b(this.f8300a).m11777a(i);
        }

        public void onLowMemory() {
            C0994i.m3486b(this.f8300a).m11776a();
        }
    }

    @Nullable
    /* renamed from: a */
    public static Info m14845a() {
        return (f12344Z == null || f12344Z.isLimitAdTrackingEnabled()) ? null : f12344Z;
    }

    @Deprecated
    /* renamed from: b */
    public static Context m14852b() {
        return f12340V;
    }

    /* renamed from: c */
    public static String m14855c() {
        return f12346b;
    }

    /* renamed from: a */
    public static ManagerApp m14847a(Context context) {
        return (ManagerApp) context.getApplicationContext();
    }

    /* renamed from: d */
    public boolean m14876d() {
        if (VERSION.SDK_INT >= 21) {
            return AppLifeCycleTracker.f8377a;
        }
        List runningTasks = ((ActivityManager) getSystemService("activity")).getRunningTasks(1);
        if (runningTasks.isEmpty()) {
            ad.m10190a("Foreground = false");
            return false;
        }
        boolean equalsIgnoreCase = ((RunningTaskInfo) runningTasks.get(0)).topActivity.getPackageName().equalsIgnoreCase(getPackageName());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Foreground = ");
        stringBuilder.append(equalsIgnoreCase);
        ad.m10190a(stringBuilder.toString());
        return equalsIgnoreCase;
    }

    @Deprecated
    /* renamed from: e */
    public static TinderComponent m14858e() {
        return f12342X;
    }

    @NotNull
    public WebProfileComponent provideWebProfileComponent() {
        return C3955a.m15174a().m10236a(f12342X).m10235a();
    }

    @NotNull
    public CountdownComponent provideCountdownComponent() {
        return C3944a.m15045a().m10153a(f12342X.plus(new C2655a())).m10152a();
    }

    @NotNull
    public TopPicksApplicationComponent provideTopPicksApplicationComponent() {
        return C3946a.m15125a().m10171a(f12342X).m10170a();
    }

    @NonNull
    public EmailSettingsComponent$Parent getEmailSettingsParentComponent() {
        return m14877h();
    }

    /* renamed from: f */
    public static void m14860f() {
        f12343Y = null;
    }

    /* renamed from: g */
    public static ExitSurveyComponent m14862g() {
        if (f12343Y == null) {
            f12343Y = m14858e().plus(new C2656a());
        }
        return f12343Y;
    }

    /* renamed from: a */
    public static void m14850a(@Nullable String str) {
        f12341W = str;
    }

    /* renamed from: b */
    public static boolean m14854b(@NonNull String str) {
        return (f12341W == null || str.equals(f12341W) == null) ? null : true;
    }

    @NonNull
    /* renamed from: h */
    public ApplicationComponent m14877h() {
        return f12342X;
    }

    public void onCreate() {
        super.onCreate();
        if (!m14878i()) {
            ad.m10190a("****************************************** APP START ******************************************");
            f12340V = getApplicationContext();
            m14880k();
        }
    }

    /* renamed from: i */
    protected boolean m14878i() {
        return C2598a.m9747a((Context) this);
    }

    /* renamed from: j */
    protected void m14879j() {
        this.f12367T = C2598a.m9746a((Application) this);
    }

    /* renamed from: k */
    protected void m14880k() {
        m14869u();
        m14879j();
        m14870v();
        av.m10208a((Context) this);
        C2669b.m10312a(this);
        try {
            f12346b = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            ManagerWebServices.PARAM_OS_VERSION_VALUE = String.valueOf(VERSION.SDK_INT);
            f12347c = String.format(Locale.US, "%s (%s)", new Object[]{f12346b, "android"});
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("app version (platform)=");
            stringBuilder.append(f12347c);
            ad.m10190a(stringBuilder.toString());
        } catch (Throwable e) {
            ad.m10193a("Failed to load app version", e);
        }
        m14871w();
        m14881l();
        m14873y();
        this.f12383r.initialize();
        this.f12384s.initialize(this);
        this.f12390y.initialize();
        this.f12356I.initialize();
        FacebookSdk.m3983a(true);
        m14868t();
        registerActivityLifecycleCallbacks(AppLifeCycleTracker.m10173a((LifeCycleHelperInterface) this));
        new C26491(this).execute(new Void[0]);
        this.f12378m.m10147a();
        this.f12380o.m9874a();
        registerComponentCallbacks(new C26502(this));
        m14867s();
        m14874a(this.f12387v);
        this.f12351D.execute();
        this.f12353F.execute();
        this.f12357J.execute();
        this.f12362O.execute();
        this.f12366S.start();
    }

    public void onTerminate() {
        this.f12381p.m14901f();
        this.f12371f.m10260d(new EventUnregisterManagers());
        this.f12371f.m10259c(this);
        this.f12374i.m3037b();
        super.onTerminate();
    }

    /* renamed from: l */
    protected void m14881l() {
        f12342X = m14882m();
        f12342X.inject(this);
    }

    @NonNull
    /* renamed from: m */
    protected ApplicationComponent m14882m() {
        return C4423a.m18249a().application(this).refWatcher(this.f12367T).leanplumAbTestVariables(this.f12368U).build();
    }

    /* renamed from: s */
    private void m14867s() {
        Branch c = Branch.m15222c((Context) this);
        c.m15251a(Arrays.asList(new String[]{"tinder", "http", "https"}));
        c.m15250a("callback");
    }

    public void onEvent(C2665f c2665f) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No subscribers for event: ");
        stringBuilder.append(c2665f.f8427b);
        ad.m10197c(stringBuilder.toString());
    }

    public void onEventMainThread(EventLoggedOut eventLoggedOut) {
        this.f12370e.clearMetadata();
        try {
            this.f12374i.m3040d().clear();
            this.f12373h.m10318a();
        } catch (Throwable e) {
            ad.m10193a("Failed to evict all entries from OkHTTP cache", e);
        }
        Intent intent = new Intent(this, LoginActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("extra_show_intro", true);
        eventLoggedOut = eventLoggedOut.getLogoutFrom();
        if (eventLoggedOut instanceof Merge) {
            intent.putExtra("extra_auth_type", ((Merge) eventLoggedOut).getAuthType().getKey());
        }
        startActivity(intent);
    }

    /* renamed from: a */
    public void m14875a(@Nullable final LogoutFrom logoutFrom, final Runnable runnable) {
        this.f12386u.unschedule();
        this.f12360M.stop();
        this.f12363P.execute();
        this.f12391z.execute().m10386b(Schedulers.io()).m10381a(C4424n.f14702a, C4425o.f14703a);
        this.f12348A.execute().m10386b(Schedulers.io()).m10381a(C4426q.f14704a, C4427r.f14705a);
        this.f12364Q.m15128a(new C2659a(ScheduleTopPicksNotification$Reason.LOGOUT));
        new AsyncTask<Void, Void, Void>(this) {
            /* renamed from: c */
            final /* synthetic */ ManagerApp f8303c;

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return m10057a((Void[]) objArr);
            }

            protected /* synthetic */ void onPostExecute(Object obj) {
                m10058a((Void) obj);
            }

            protected void onPreExecute() {
                this.f8303c.f12371f.m10260d(new EventUnregisterManagers());
            }

            /* renamed from: a */
            protected Void m10057a(Void... voidArr) {
                this.f8303c.m14883n();
                if (logoutFrom != null) {
                    this.f8303c.f12371f.m10260d(new EventLoggedOut(logoutFrom));
                }
                return null;
            }

            /* renamed from: a */
            protected void m10058a(Void voidR) {
                if ((logoutFrom instanceof LogoutFrom$FORCED) != null) {
                    this.f8303c.m14868t();
                }
                if (runnable != null) {
                    runnable.run();
                }
            }
        }.execute(new Void[null]);
        this.f12365R.execute();
    }

    @VisibleForTesting
    /* renamed from: n */
    public void m14883n() {
        this.f12371f.m10256b();
        this.f12350C.clearEngines();
        this.f12389x.m15146a(EmptyRequest.get()).m10386b(Schedulers.io()).m10394b(RxUtils.m10187b());
        this.f12379n.m10105b(null);
        this.f12375j.m10135b(false);
        this.f12352E.execute();
        this.f12385t.execute().m15288a(C3935s.f12409a, C3936t.f12410a);
        this.f12369d.m10122a(null);
        this.f12382q.m9858a();
        bk.m14906a();
        C2602d.m9760c();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("location after clear, lat: ");
        stringBuilder.append(this.f12376k.m15011y());
        stringBuilder.append(" lon:");
        stringBuilder.append(this.f12376k.m15013z());
        ad.m10190a(stringBuilder.toString());
        this.f12377l.m15071a(null);
        this.f12381p.m14903h();
    }

    @UiThread
    /* renamed from: t */
    private void m14868t() {
        if (this.f12371f != null && this.f12371f.m10257b(this)) {
            this.f12371f.m10259c(this);
        }
        this.f12371f.m10254a((Object) this);
        AppLifeCycleTracker.m10174b((LifeCycleHelperInterface) this);
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        m14884o();
    }

    /* renamed from: o */
    protected void m14884o() {
        C0274a.m1007a((Context) this);
    }

    @CallSuper
    /* renamed from: a */
    protected void m14874a(@NonNull AppVisibilityTracker appVisibilityTracker) {
        appVisibilityTracker = appVisibilityTracker.trackVisibility();
        appVisibilityTracker.subscribe(this.f12388w, C3937u.f12411a);
        appVisibilityTracker.subscribe(this.f12358K, C3938v.f12412a);
        appVisibilityTracker.subscribe(this.f12361N, C3939w.f12413a);
    }

    public void onAppOpen() {
        this.f12382q.m9861b();
        if (this.f12349B.appRatingV2()) {
            this.f12354G.execute();
            this.f12355H.startUncaughtExceptionTracker();
            return;
        }
        C3919h.m14697a().onAppOpen();
    }

    public void onAppClosed() {
        ad.m10190a("Shutting down the app.");
        if (this.f12349B.appRatingV2()) {
            this.f12355H.stopUncaughtExceptionTracker();
        } else {
            C3919h.m14697a().onAppClosed();
        }
    }

    public MainActivityInjector createMainActivityInjector(MainActivity mainActivity) {
        return m14877h().newMainActivityComponentBuilder().mainActivity(mainActivity).build();
    }

    /* renamed from: u */
    private void m14869u() {
        C2667a.m10288a(C3940x.f12414a);
    }

    /* renamed from: v */
    private void m14870v() {
        Paper.init(this);
        Paper.addSerializer(DateTime.class, new JodaDateTimeSerializer());
        Paper.addSerializer(LocalDate.class, new JodaLocalDateSerializer());
        Paper.addSerializer(LocalDateTime.class, new JodaLocalDateTimeSerializer());
    }

    /* renamed from: w */
    private void m14871w() {
        Leanplum.setApplicationContext(this);
        LeanplumActivityHelper.enableLifecycleCallbacks(this);
        Leanplum.setAppIdForProductionMode("app_laEitk47uoJnyWx7Jn9Su85T6rcjovOYm3FfGYCIgRk", "prod_3KGkhu6G0UinNYbG10uoiL6r3hJbv8ab4W3Y6lVLFhE");
        LeanplumPushService.setGcmSenderId("465293127427");
        LeanplumPushService.setCustomizer(C3934p.f12408a);
        LeanplumActivityHelper.deferMessagesForActivities(LoginActivity.class);
        Leanplum.disableLocationCollection();
        Leanplum.start(this);
        m14872x();
    }

    /* renamed from: x */
    private void m14872x() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = new android.content.Intent;	 Catch:{ Exception -> 0x000b }
        r1 = com.leanplum.LeanplumPushRegistrationService.class;	 Catch:{ Exception -> 0x000b }
        r0.<init>(r2, r1);	 Catch:{ Exception -> 0x000b }
        r2.startService(r0);	 Catch:{ Exception -> 0x000b }
        goto L_0x0013;
    L_0x000b:
        r0 = "Error completing Leanplum GCM Registration.";
        r1 = 0;
        r1 = new java.lang.Object[r1];
        p000a.p001a.C0001a.m32e(r0, r1);
    L_0x0013:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.managers.ManagerApp.x():void");
    }

    /* renamed from: y */
    private void m14873y() {
        EmojiCompat.m1054a(this.f12359L);
    }

    @NotNull
    public SettingsNotificationComponent provideSettingsNotificationComponent() {
        return C3943a.m15035a().m10150a(f12342X).m10149a();
    }

    @NotNull
    public VideoComponent provideVideoComponent() {
        return C3954a.m15149a().m10233a(f12342X).m10232a();
    }

    @NotNull
    public BitmojiComponent provideBitmojiComponent() {
        return C3921a.m14711a().m9959a(f12342X).m9958a();
    }

    @NotNull
    public IntroPricingApplicationComponent provideIntroPricingApplicationComponent() {
        return C3932a.m14830a().resources(getResources()).parent(f12342X).build();
    }

    @NotNull
    public LoopsApplicationComponent provideLoopsApplicationComponent() {
        return C3933a.m14836a().m10054a(f12342X).m10053a();
    }
}
