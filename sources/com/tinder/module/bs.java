package com.tinder.module;

import android.app.Application;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.support.text.emoji.EmojiCompat.C0282c;
import android.support.text.emoji.p009a.C2788a;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.RequestManager;
import com.google.android.gms.gcm.C2544a;
import com.google.android.gms.gcm.PeriodicTask;
import com.google.android.gms.gcm.PeriodicTask.C3845a;
import com.google.android.gms.iid.C2553a;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.snapchat.kit.sdk.SnapLogin;
import com.spotify.sdk.android.authentication.AuthenticationRequest.Builder;
import com.spotify.sdk.android.authentication.AuthenticationResponse.Type;
import com.squareup.moshi.C5987p;
import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.analytics.performance.C8157y;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApiClient;
import com.tinder.api.moshi.MoshiFactory;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.C10295a;
import com.tinder.app.dagger.module.aa;
import com.tinder.app.dagger.module.p160b.C8245a;
import com.tinder.bitmoji.C8321a;
import com.tinder.bitmoji.C8323c;
import com.tinder.bitmoji.repository.BitmojiAuthRepository;
import com.tinder.bitmoji.repository.BitmojiImageUrlRepository;
import com.tinder.bitmoji.repository.C10390a;
import com.tinder.bitmoji.repository.C10391b;
import com.tinder.bitmoji.repository.C10395c;
import com.tinder.bitmoji.repository.C10396d;
import com.tinder.boost.repository.BoostStatusRepository;
import com.tinder.boost.repository.C10447a;
import com.tinder.common.C12791q;
import com.tinder.common.CrashReporter;
import com.tinder.common.provider.C12789e;
import com.tinder.common.repository.C10697a;
import com.tinder.common.repository.C10698c;
import com.tinder.common.repository.MyUserRepository;
import com.tinder.common.utils.StringLinkDetector;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.C10710r;
import com.tinder.data.adapter.C8614a;
import com.tinder.data.meta.module.C8702a;
import com.tinder.data.places.C10898g;
import com.tinder.data.places.C8747h;
import com.tinder.data.places.PlacesApiClient;
import com.tinder.data.places.PlacesRecsApiClient.C8736b;
import com.tinder.data.places.p329a.C10888a;
import com.tinder.data.places.provider.PlacesConfigExpansionProvider;
import com.tinder.data.profile.C8763n;
import com.tinder.data.user.CurrentUserIdProvider;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.discovery.analytics.C13147g;
import com.tinder.discovery.domain.DiscoverySegmentDataStore;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p232b.C11132a;
import com.tinder.discovery.p232b.C11135c;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.meta.providers.AuthStatusProvider;
import com.tinder.domain.meta.usecase.FetchMeta;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.PlacesRepository;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.domain.places.provider.PlacesOnboardingProgressProvider;
import com.tinder.domain.profile.experiment.LoopsPhase1Experiment;
import com.tinder.domain.profile.experiment.MaxPhotoExperiment;
import com.tinder.domain.profile.experiment.NewPhotoGridExperiment;
import com.tinder.domain.profile.model.ProfileV2Experiment;
import com.tinder.domain.profile.repository.CustomGenderRepository;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.SaveLikeStatus;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.interactors.C9717h;
import com.tinder.interactors.p262a.C9712i;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.managers.bu;
import com.tinder.model.network.ErrorResponseConverter;
import com.tinder.p071a.C2603i;
import com.tinder.p238f.p243e.C9368a;
import com.tinder.p238f.p336c.C11600a;
import com.tinder.p238f.p337d.C11601a;
import com.tinder.passport.p093d.C3945a;
import com.tinder.passport.provider.PassportLocationProvider;
import com.tinder.places.provider.C12414e;
import com.tinder.places.provider.C12415f;
import com.tinder.places.provider.C12416g;
import com.tinder.places.provider.C12422j;
import com.tinder.purchase.logging.repository.C16232a;
import com.tinder.purchase.logging.repository.PurchaseLogRepository;
import com.tinder.purchase.p371a.C14479a;
import com.tinder.screenshot.C16569e;
import com.tinder.screenshotty.C14830c;
import com.tinder.services.ProcessingPhotosTaskService;
import com.tinder.settings.p405c.C16617a;
import com.tinder.spotify.api.AdjustClient;
import com.tinder.spotify.api.SpotifyLogMauApiClient;
import com.tinder.spotify.audio.C16852a;
import com.tinder.spotify.audio.SpotifyAudioStreamer;
import com.tinder.spotify.repository.C16860a;
import com.tinder.spotify.repository.SpotifyDataRepository;
import com.tinder.superlike.p418a.C15066a;
import com.tinder.tinderplus.provider.C16973a;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import com.tinder.util.ConnectivityProvider;
import com.tinder.utils.aq;
import dagger.Module;
import dagger.Provides;
import de.greenrobot.event.C2664c;
import io.paperdb.Paper;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Named;
import javax.inject.Singleton;

@Module(includes = {C8702a.class, dx.class, C8763n.class, C8614a.class, aa.class, bj.class, C8245a.class})
public class bs {
    @Singleton
    @Provides
    /* renamed from: a */
    CurrentUserProvider m40806a(C12791q c12791q) {
        return c12791q;
    }

    @Singleton
    @Provides
    /* renamed from: a */
    AuthStatusProvider m40809a(C10698c c10698c) {
        return c10698c;
    }

    @Singleton
    @Provides
    /* renamed from: a */
    CustomGenderRepository m40814a(C16617a c16617a) {
        return c16617a;
    }

    @Singleton
    @Provides
    /* renamed from: a */
    PassportLocationProvider m40819a(C3945a c3945a) {
        return c3945a;
    }

    @Default
    @Singleton
    @Provides
    /* renamed from: a */
    C2664c m40823a() {
        return C2664c.a().b(false).a(false).c(false).a();
    }

    @Notification
    @Singleton
    @Provides
    /* renamed from: b */
    C2664c m40828b() {
        return C2664c.a().b(false).a(false).c(false).a();
    }

    @Singleton
    @Provides
    /* renamed from: c */
    Gson m40830c() {
        return new GsonBuilder().create();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    C2544a m40799a(@ForApplication Context context) {
        return C2544a.a(context);
    }

    @Provides
    /* renamed from: b */
    Resources m40824b(@ForApplication Context context) {
        return context.getResources();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    LegacyBreadCrumbTracker m40816a(CrashReporter crashReporter) {
        return new LegacyBreadCrumbTracker(crashReporter);
    }

    @Singleton
    @Provides
    /* renamed from: c */
    TelephonyManager m40829c(@ForApplication Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    @Provides
    /* renamed from: d */
    C10888a m40834d() {
        return new C10888a();
    }

    @Singleton
    @Provides
    /* renamed from: e */
    C8747h m40836e() {
        return new C8747h();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    PlacesRepository m40811a(C8747h c8747h, PlacesApiClient placesApiClient, @Named("places") C8736b c8736b, RecsEngineRegistry recsEngineRegistry, C8157y c8157y) {
        c8157y.a(placesApiClient);
        return new C10898g(c8747h, placesApiClient, c8736b, recsEngineRegistry);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    PlacesConfigProvider m40810a(@Default SharedPreferences sharedPreferences) {
        return new C12416g(sharedPreferences);
    }

    @Singleton
    @Provides
    /* renamed from: b */
    PlacesAvailableProvider m40826b(@Default SharedPreferences sharedPreferences) {
        return new C12414e(sharedPreferences);
    }

    @Singleton
    @Provides
    /* renamed from: f */
    PlacesConfigExpansionProvider m40838f() {
        return new C12415f();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    SpotifyDataRepository m40821a(TinderApiClient tinderApiClient, ManagerProfile managerProfile, AdjustClient adjustClient, SpotifyLogMauApiClient spotifyLogMauApiClient) {
        return new C16860a(tinderApiClient, managerProfile, adjustClient, spotifyLogMauApiClient);
    }

    @Singleton
    @Provides
    /* renamed from: g */
    Builder m40839g() {
        return new Builder("b06a803d686e4612bdc074e786e94062", Type.CODE, ManagerWebServices.REDIRECT_URI);
    }

    @Singleton
    @Provides
    /* renamed from: h */
    BriteDatabase m40841h() {
        return C2603i.b().a();
    }

    @Singleton
    @Provides
    /* renamed from: i */
    SpotifyAudioStreamer m40844i() {
        return new C16852a();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    C10698c m40805a(bk bkVar) {
        return new C10698c(bkVar);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    ErrorResponseConverter m40818a(Gson gson) {
        return new ErrorResponseConverter(gson);
    }

    @Singleton
    @Provides
    /* renamed from: d */
    InputMethodManager m40833d(@ForApplication Context context) {
        return (InputMethodManager) context.getSystemService("input_method");
    }

    @Singleton
    @Provides
    /* renamed from: a */
    BoostStatusRepository m40803a(TinderApiClient tinderApiClient, Gson gson) {
        return new C10447a(tinderApiClient, gson);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    LikeStatusProvider m40822a(AbTestUtility abTestUtility, LoadProfileOptionData loadProfileOptionData, SaveLikeStatus saveLikeStatus) {
        return new C16973a(abTestUtility, loadProfileOptionData, saveLikeStatus);
    }

    @Provides
    /* renamed from: a */
    MyUserRepository m40804a(bk bkVar, bj bjVar) {
        return new C10697a(bkVar, bjVar);
    }

    @Singleton
    @Provides
    /* renamed from: e */
    C2553a m40835e(@ForApplication Context context) {
        return C2553a.c(context);
    }

    @Singleton
    @Provides
    /* renamed from: f */
    ConnectivityManager m40837f(@ForApplication Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    @Singleton
    @Provides
    /* renamed from: g */
    PurchaseLogRepository m40840g(@ForApplication Context context) {
        Paper.init(context);
        return new C16232a(Paper.book("purchase-logs"));
    }

    @Singleton
    @Provides
    /* renamed from: j */
    C5987p m40846j() {
        return MoshiFactory.create();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    C9717h m40815a(C9712i c9712i, C15066a c15066a, C14479a c14479a, AbTestUtility abTestUtility) {
        return new C9717h(c9712i, c15066a, c14479a, abTestUtility);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    UserMetaManager m40817a(FetchMeta fetchMeta, C11601a c11601a, C11600a c11600a, C9368a c9368a) {
        return new bu(fetchMeta, c11601a, c11600a, c9368a);
    }

    @Singleton
    @Provides
    /* renamed from: h */
    ConnectivityProvider m40842h(@ForApplication Context context) {
        return new ConnectivityProvider(context, (ConnectivityManager) context.getSystemService("connectivity"));
    }

    @Provides
    /* renamed from: i */
    ContentResolver m40843i(@ForApplication Context context) {
        return context.getContentResolver();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    NotificationManager m40797a(ManagerApp managerApp) {
        return (NotificationManager) managerApp.getSystemService("notification");
    }

    @Singleton
    @Provides
    /* renamed from: a */
    AppVisibilityTracker m40800a(ManagerApp managerApp, C10295a c10295a) {
        managerApp.registerActivityLifecycleCallbacks(c10295a);
        return c10295a;
    }

    @Default
    @Provides
    /* renamed from: a */
    SharedPreferences m40798a(Application application) {
        return application.getSharedPreferences("sp", 0);
    }

    @Singleton
    @Provides
    /* renamed from: c */
    CurrentUserIdProvider m40831c(@Default SharedPreferences sharedPreferences) {
        return new C12789e(sharedPreferences);
    }

    @Singleton
    @Provides
    /* renamed from: k */
    PeriodicTask m40847k() {
        return new C3845a().a(ProcessingPhotosTaskService.class).a("ProcessingPhotosTaskService").a(5).b(1).b(false).b();
    }

    @Singleton
    @Provides
    @Named("main_thread_handler")
    /* renamed from: l */
    Handler m40849l() {
        return new Handler(Looper.getMainLooper());
    }

    @Singleton
    @Provides
    /* renamed from: j */
    RequestManager m40845j(@ForApplication Context context) {
        return C0994i.b(context);
    }

    @Provides
    /* renamed from: m */
    public StringLinkDetector m40850m() {
        return new aq();
    }

    @Provides
    /* renamed from: a */
    public ProfileV2Experiment m40813a(AbTestUtility abTestUtility) {
        return new C10710r(abTestUtility);
    }

    @Provides
    /* renamed from: b */
    public LoopsPhase1Experiment m40827b(AbTestUtility abTestUtility) {
        return new LoopsPhase1Experiment(abTestUtility.isLoopsPhase1Enabled());
    }

    @Provides
    /* renamed from: c */
    public NewPhotoGridExperiment m40832c(AbTestUtility abTestUtility) {
        return new NewPhotoGridExperiment(abTestUtility.isNewPhotoGridEnabled());
    }

    @Provides
    /* renamed from: a */
    public MaxPhotoExperiment m40812a(LoopsPhase1Experiment loopsPhase1Experiment) {
        if (loopsPhase1Experiment.getEnabled() != null) {
            return new MaxPhotoExperiment(9);
        }
        return new MaxPhotoExperiment(6);
    }

    @Provides
    /* renamed from: b */
    public C0282c m40825b(Application application) {
        return new C2788a(application);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    public C14830c m40820a(ContentResolver contentResolver, C16569e c16569e) {
        return new C14830c(contentResolver, c16569e);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    BitmojiAuthRepository m40801a(AbTestUtility abTestUtility, @ForApplication Context context) {
        if (abTestUtility.isBitmojiEnabled() != null) {
            return new C10390a(SnapLogin.getLoginStateController(context), SnapLogin.getAuthTokenManager(context));
        }
        return new C10391b();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    BitmojiImageUrlRepository m40802a(AbTestUtility abTestUtility, @ForApplication Context context, @Default SharedPreferences sharedPreferences, C8321a c8321a) {
        if (abTestUtility.isBitmojiEnabled() != null) {
            return new C10395c(sharedPreferences, c8321a);
        }
        return new C10396d();
    }

    @Provides
    /* renamed from: k */
    C8323c m40848k(@ForApplication Context context) {
        return new C8323c(context);
    }

    @Singleton
    @Provides
    /* renamed from: n */
    PlacesOnboardingProgressProvider m40851n() {
        return new C12422j();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    DiscoverySegmentRepository m40808a(DiscoverySegmentDataStore discoverySegmentDataStore) {
        return new C11135c(discoverySegmentDataStore);
    }

    @Provides
    /* renamed from: a */
    DiscoverySegmentDataStore m40807a(TopPicksConfig topPicksConfig, @Default SharedPreferences sharedPreferences) {
        Map hashMap = new HashMap();
        hashMap.put(DiscoverySegment.RECS, Boolean.valueOf(true));
        hashMap.put(DiscoverySegment.TOP_PICKS, Boolean.valueOf(topPicksConfig.isEnabled()));
        hashMap.put(DiscoverySegment.PLACES, Boolean.valueOf(false));
        return new C11132a(hashMap, sharedPreferences, DiscoverySegment.values());
    }

    @Provides
    /* renamed from: o */
    C13147g m40852o() {
        return new C13147g();
    }
}
