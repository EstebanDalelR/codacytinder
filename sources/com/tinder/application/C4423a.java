package com.tinder.application;

import android.app.Application;
import android.app.NotificationManager;
import android.arch.lifecycle.LifecycleObserver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.support.text.emoji.EmojiCompat.C0282c;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.HttpStack;
import com.appsflyer.C3010d;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.facebook.CallbackManager;
import com.facebook.accountkit.ui.AccountKitActivity.ResponseType;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.accountkit.ui.LoginType;
import com.facebook.accountkit.ui.UIManager;
import com.facebook.network.connectionclass.C1798b;
import com.facebook.network.connectionclass.ConnectionClassManager;
import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.gms.gcm.C2544a;
import com.google.android.gms.gcm.PeriodicTask;
import com.google.android.gms.iid.C2553a;
import com.google.android.gms.iid.InstanceIDListenerService;
import com.google.gson.Gson;
import com.spotify.sdk.android.authentication.AuthenticationRequest.Builder;
import com.squareup.moshi.C5987p;
import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.SqlBrite;
import com.tinder.account.analytics.AccountThirdPartyIntegrationEventFactory;
import com.tinder.account.analytics.C3874a;
import com.tinder.account.data.UpdateAccountDataStore;
import com.tinder.account.p072a.C4298a;
import com.tinder.account.p072a.C4299o;
import com.tinder.account.p072a.C4300p;
import com.tinder.account.p085b.C3876a;
import com.tinder.account.p085b.C3877b;
import com.tinder.account.provider.UpdateAccountPasswordLastShownDateProvider;
import com.tinder.account.view.C7273c;
import com.tinder.account.view.C7275g;
import com.tinder.account.view.C7276i;
import com.tinder.account.view.UpdateAccountEmailPasswordActivity;
import com.tinder.account.view.UpdateEmailView;
import com.tinder.account.view.UpdatePasswordView;
import com.tinder.activities.ActivityAddPhoto;
import com.tinder.activities.ActivityBanned;
import com.tinder.activities.ActivityEditProfile;
import com.tinder.activities.ActivityGiphy;
import com.tinder.activities.ActivityJob;
import com.tinder.activities.ActivityVerification;
import com.tinder.activities.C7280d;
import com.tinder.activities.C7281f;
import com.tinder.activities.C7283h;
import com.tinder.activities.C7284i;
import com.tinder.activities.C7285n;
import com.tinder.activities.C7288r;
import com.tinder.activities.C7289v;
import com.tinder.activities.LoginActivity;
import com.tinder.activities.SchoolActivity;
import com.tinder.activities.WebViewActivityInstagram;
import com.tinder.addy.Addy;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.PublisherAdRequestFactory;
import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.addy.tracker.AdUrlTracker.Listener;
import com.tinder.addy.tracker.TrackingUrlsDecorator;
import com.tinder.ads.AdAggregator;
import com.tinder.ads.AdAggregator$Listener;
import com.tinder.ads.AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener_Factory;
import com.tinder.ads.BrandedProfileCardTrackingUrlsAdAggregatorListener_Factory;
import com.tinder.ads.C7983xedb30ee4;
import com.tinder.ads.C7985x316be0b0;
import com.tinder.ads.C7986xbb8d6348;
import com.tinder.ads.C7987x176dd5ef;
import com.tinder.ads.DfpPublisherAdRequestFactory;
import com.tinder.ads.DfpPublisherAdRequestFactory_Factory;
import com.tinder.ads.NativeVideoAndDisplayTrackingUrlAdAggregatorListener_Factory;
import com.tinder.ads.analytics.AdEventFields;
import com.tinder.ads.analytics.AdEventFields_Factory_Factory;
import com.tinder.ads.analytics.AnalyticsAdAggregatorListener_Factory;
import com.tinder.ads.analytics.LegacyAddAdRequestReceiveEvent_Factory;
import com.tinder.ads.analytics.LegacyAddAdRequestSendEvent_Factory;
import com.tinder.ads.analytics.V1AddAdOpenEvent_Factory;
import com.tinder.ads.analytics.V1AnalyticsAdAggregatorListener_Factory;
import com.tinder.analytics.C2634g;
import com.tinder.analytics.C6233k;
import com.tinder.analytics.C7319e;
import com.tinder.analytics.C7333h;
import com.tinder.analytics.C8000b;
import com.tinder.analytics.C8002d;
import com.tinder.analytics.C8005f;
import com.tinder.analytics.CrmEventTracker;
import com.tinder.analytics.ThirdPartyLocationUpdatesListener;
import com.tinder.analytics.attribution.AttributionTracker;
import com.tinder.analytics.attribution.C7994f;
import com.tinder.analytics.attribution.C7995j;
import com.tinder.analytics.attribution.C7996k;
import com.tinder.analytics.attribution.C7997m;
import com.tinder.analytics.experiment.C8004b;
import com.tinder.analytics.fireworks.BatchScheduleStrategy;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.fireworks.C7322d;
import com.tinder.analytics.fireworks.C7329e;
import com.tinder.analytics.fireworks.C7330k;
import com.tinder.analytics.fireworks.C8011c;
import com.tinder.analytics.fireworks.C8016f;
import com.tinder.analytics.fireworks.FireworksNetworkClient;
import com.tinder.analytics.fireworks.FireworksRepository;
import com.tinder.analytics.fireworks.api.C8006c;
import com.tinder.analytics.fireworks.data.C6229j;
import com.tinder.analytics.p152a.C7989b;
import com.tinder.analytics.p152a.C7990e;
import com.tinder.analytics.p153b.C7998c;
import com.tinder.analytics.p153b.C7999e;
import com.tinder.analytics.p154c.C8001b;
import com.tinder.analytics.performance.C8024z;
import com.tinder.analytics.performance.C8151o;
import com.tinder.analytics.performance.C8157y;
import com.tinder.api.APIHeaderInterceptor;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.InstallIdHeaderInterceptor;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerNetwork_Factory;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.ResponseCodeRequest;
import com.tinder.api.TinderApi;
import com.tinder.api.TinderApiClient;
import com.tinder.api.TinderAuthenticator;
import com.tinder.api.TinderUserApi;
import com.tinder.api.buckets.BucketsService;
import com.tinder.api.giphy.GiphyApi;
import com.tinder.api.keepalive.KeepAliveScarletApi;
import com.tinder.api.model.superlikeable.SuperLikeableGameResponse.Empty;
import com.tinder.api.module.C12449x9ee21d96;
import com.tinder.api.module.C12450x3bbab36c;
import com.tinder.api.module.C12451x21aaf741;
import com.tinder.api.module.LegacyNetworkModule_ProvideAuthHeadersOkHttpClientFactory;
import com.tinder.api.module.LegacyNetworkModule_ProvideAuthServiceFactory;
import com.tinder.api.module.LegacyNetworkModule_ProvideAuthenticatorFactory;
import com.tinder.api.module.LegacyNetworkModule_ProvideHeaderInterceptorFactory;
import com.tinder.api.module.LegacyNetworkModule_ProvideTinderApiClientFactory;
import com.tinder.api.module.NetworkModule;
import com.tinder.api.module.NetworkModule_ProvideKeepAliveServiceFactory;
import com.tinder.api.module.NetworkModule_ProvideOkHttpUrlLoaderFactoryFactory;
import com.tinder.api.module.NetworkModule_ProvidePublicApiClientFactory;
import com.tinder.api.module.NetworkModule_ProvideTinderApiClientFactory;
import com.tinder.api.module.NetworkModule_ProvideTinderUserApiFactory;
import com.tinder.api.module.OkHttpModule;
import com.tinder.api.module.OkHttpModule_ProvideHttpCacheFactory;
import com.tinder.api.module.OkHttpModule_ProvideOkHttpClientBuilderFactory;
import com.tinder.api.module.OkHttpModule_ProvideRequestBuilderFactory;
import com.tinder.api.module.OkHttpModule_ProvideTinderAuthTokenHeaderInterceptorFactory;
import com.tinder.api.module.OkHttpModule_ProvideTinderHeaderInterceptorFactory;
import com.tinder.api.module.RetrofitModule;
import com.tinder.api.module.RetrofitModule_ProvideGsonConverterFactoryFactory;
import com.tinder.api.module.RetrofitModule_ProvideRetrofitBuilderFactory;
import com.tinder.api.module.RetrofitModule_ProvideRxJava2CallAdapterFactoryFactory;
import com.tinder.api.module.RetrofitModule_ProvideRxJavaCallAdapterFactoryFactory;
import com.tinder.api.module.ThirdPartyClientModule_ProvideAdjustClient$Tinder_releaseFactory;
import com.tinder.api.module.ThirdPartyClientModule_ProvideGiphyApi$Tinder_releaseFactory;
import com.tinder.api.module.TinderApiModule;
import com.tinder.api.module.TinderApiModule_ProvideAuthTokenProviderFactory;
import com.tinder.api.module.TinderApiModule_ProvideReauthStrategyFactory;
import com.tinder.api.module.TinderApiModule_ProvideTinderAuthenticatorFactory;
import com.tinder.api.module.TinderApiModule_ProvideTinderHeaderInterceptorBuilderFactory;
import com.tinder.api.module.TinderApiModule_ProvideTinderHeaderInterceptorFactory;
import com.tinder.api.module.TinderApiModule_ProvideTinderRetrofitApiBuilderFactory;
import com.tinder.api.module.VolleyModule_ProvideOkHttpStackFactory;
import com.tinder.api.module.VolleyModule_ProvideRequestQueueFactory;
import com.tinder.api.moshi.ResponseErrorAdapter;
import com.tinder.api.moshi.ResponseErrorAdapter_Factory;
import com.tinder.api.networkperf.PerfEventUrlUtils_Factory;
import com.tinder.api.networkperf.inspector.FastMatchV2NetworkPerfInspector_Factory;
import com.tinder.api.networkperf.inspector.NetworkPerfInspector;
import com.tinder.api.networkperf.inspector.ProfileV2NetworkPerfInspector_Factory;
import com.tinder.api.networkperf.inspector.PurchaseNetworkPerfInspector_Factory;
import com.tinder.api.networkperf.inspector.TopPicksV2NetworkPerfInspector_Factory;
import com.tinder.api.networkperf.inspector.UserProfileNetworkPerfInspector_Factory;
import com.tinder.api.networkperf.interceptor.NetworkPerfInterceptor;
import com.tinder.api.networkperf.module.NetworkPerfModule_ProvideFastMatchV2NetworkPerfInspectorFactory;
import com.tinder.api.networkperf.module.NetworkPerfModule_ProvideProfileV2NetworkPerfInspectorFactory;
import com.tinder.api.networkperf.module.NetworkPerfModule_ProvidePurchaseNetworkPerfInspectorFactory;
import com.tinder.api.networkperf.module.NetworkPerfModule_ProvideTopPicksV2NetworkPerfInspectorFactory;
import com.tinder.api.networkperf.module.NetworkPerfModule_ProvideUserProfileNetworkPerfInspectorFactory;
import com.tinder.api.retrofit.AuthTokenProvider;
import com.tinder.api.retrofit.RetrofitErrorBodyAwareTransformer;
import com.tinder.api.retrofit.TinderAuthHeaderInterceptor_Factory;
import com.tinder.api.retrofit.TinderHeaderInterceptor;
import com.tinder.api.timeout.PlacesTimeoutInterceptor;
import com.tinder.api.timeout.PlacesTimeoutInterceptor_Factory;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.C12452b;
import com.tinder.app.C3918c;
import com.tinder.app.dagger.component.MainActivityComponent;
import com.tinder.app.dagger.module.C12482b;
import com.tinder.app.dagger.module.C12483c;
import com.tinder.app.dagger.module.C12484d;
import com.tinder.app.dagger.module.C12494e;
import com.tinder.app.dagger.module.C12495f;
import com.tinder.app.dagger.module.C12496g;
import com.tinder.app.dagger.module.ac;
import com.tinder.app.dagger.module.p160b.C12457b;
import com.tinder.app.dagger.module.p160b.C12458c;
import com.tinder.app.dagger.module.p160b.C12459d;
import com.tinder.app.dagger.module.p160b.C12460e;
import com.tinder.app.dagger.module.p160b.C12461f;
import com.tinder.app.dagger.module.p160b.C12462g;
import com.tinder.app.dagger.module.p160b.C12463h;
import com.tinder.app.dagger.module.p160b.C12464i;
import com.tinder.app.dagger.module.p160b.C12465j;
import com.tinder.app.dagger.module.p160b.C12466k;
import com.tinder.app.dagger.module.p160b.C12467l;
import com.tinder.app.dagger.module.p160b.C12468m;
import com.tinder.app.dagger.module.p160b.C12469n;
import com.tinder.app.dagger.module.p160b.C12470o;
import com.tinder.app.dagger.module.p160b.C12471p;
import com.tinder.app.dagger.module.p160b.C12472q;
import com.tinder.app.dagger.module.p160b.C12473r;
import com.tinder.app.dagger.module.p160b.C12474s;
import com.tinder.app.dagger.module.p160b.C12475t;
import com.tinder.app.dagger.module.p160b.C12476u;
import com.tinder.app.dagger.module.p160b.C12477v;
import com.tinder.app.dagger.module.p160b.C12478w;
import com.tinder.app.dagger.module.p160b.C12479x;
import com.tinder.app.dagger.module.p160b.C12480y;
import com.tinder.app.dagger.module.p160b.C12481z;
import com.tinder.app.dagger.module.p160b.C8245a;
import com.tinder.app.dagger.module.p163e.C12485b;
import com.tinder.app.dagger.module.p163e.C12486c;
import com.tinder.app.dagger.module.p163e.C12487d;
import com.tinder.app.dagger.module.p163e.C12488e;
import com.tinder.app.dagger.module.p163e.C12489f;
import com.tinder.app.dagger.module.p163e.C12490g;
import com.tinder.app.dagger.module.p163e.C12491h;
import com.tinder.app.dagger.module.p163e.C12492i;
import com.tinder.app.dagger.module.p163e.C12493j;
import com.tinder.app.dagger.module.toppicks.C12545o;
import com.tinder.app.dagger.module.toppicks.TopPicksTinderApplicationModule;
import com.tinder.apprating.p086a.C10311c;
import com.tinder.apprating.p086a.C12560e;
import com.tinder.apprating.p086a.C8257a;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.apprating.p086a.C8260f;
import com.tinder.apprating.p087d.C3920a;
import com.tinder.apprating.p164b.C8261a;
import com.tinder.apprating.p165c.C12561b;
import com.tinder.apprating.p165c.C8264a;
import com.tinder.apprating.p166e.C10313a;
import com.tinder.apprating.p166e.C10314b;
import com.tinder.apprating.p166e.C10315c;
import com.tinder.apprating.view.AppRatingDialog;
import com.tinder.apprating.view.C10322b;
import com.tinder.auth.C12568b;
import com.tinder.auth.C12571c;
import com.tinder.auth.C12572d;
import com.tinder.auth.C12573e;
import com.tinder.auth.C12574f;
import com.tinder.auth.C12575g;
import com.tinder.auth.C12576h;
import com.tinder.auth.C12577i;
import com.tinder.auth.C12594j;
import com.tinder.auth.C12595k;
import com.tinder.auth.C12596l;
import com.tinder.auth.C12597m;
import com.tinder.auth.C12598n;
import com.tinder.auth.C12599o;
import com.tinder.auth.C12600p;
import com.tinder.auth.C12601q;
import com.tinder.auth.C12602r;
import com.tinder.auth.C12607s;
import com.tinder.auth.C12608t;
import com.tinder.auth.C12609u;
import com.tinder.auth.C12610v;
import com.tinder.auth.C12611w;
import com.tinder.auth.C8266a;
import com.tinder.auth.accountkit.AccountKitErrorHeaderFragment;
import com.tinder.auth.accountkit.C10326a;
import com.tinder.auth.accountkit.C10327b;
import com.tinder.auth.accountkit.C10328h;
import com.tinder.auth.accountkit.C10329i;
import com.tinder.auth.accountkit.C12565d;
import com.tinder.auth.accountkit.C12566g;
import com.tinder.auth.accountkit.LoginAccountKitUiManager;
import com.tinder.auth.accountkit.ValidateAccountKitUiManager;
import com.tinder.auth.interactor.AddSmsValidateEvent;
import com.tinder.auth.interactor.C10333h;
import com.tinder.auth.interactor.C10336s;
import com.tinder.auth.interactor.C12578c;
import com.tinder.auth.interactor.C12579f;
import com.tinder.auth.interactor.C12580g;
import com.tinder.auth.interactor.C12581i;
import com.tinder.auth.interactor.C12584k;
import com.tinder.auth.interactor.C12585n;
import com.tinder.auth.interactor.C12586p;
import com.tinder.auth.interactor.C12591r;
import com.tinder.auth.interactor.C12593t;
import com.tinder.auth.interactor.C2637a;
import com.tinder.auth.interactor.C8276b;
import com.tinder.auth.interactor.C8279j;
import com.tinder.auth.interactor.C8280l;
import com.tinder.auth.interactor.C8281o;
import com.tinder.auth.observer.AuthObserver;
import com.tinder.auth.observer.LoginObserver;
import com.tinder.auth.p100a.C4304a;
import com.tinder.auth.p167b.C12567b;
import com.tinder.auth.p168c.C10330a;
import com.tinder.auth.p168c.C10331c;
import com.tinder.auth.p168c.C12569b;
import com.tinder.auth.p168c.C12570e;
import com.tinder.auth.p168c.C8274f;
import com.tinder.auth.repository.AccountService;
import com.tinder.auth.repository.AuthLedgerRepository;
import com.tinder.auth.repository.AuthRepository;
import com.tinder.auth.repository.AuthService;
import com.tinder.auth.repository.AuthSessionDataStore;
import com.tinder.auth.repository.AuthSessionRepository;
import com.tinder.auth.repository.C10350m;
import com.tinder.auth.repository.C10351n;
import com.tinder.auth.repository.C10353p;
import com.tinder.auth.repository.C12604l;
import com.tinder.auth.repository.C12605o;
import com.tinder.auth.repository.C12606q;
import com.tinder.auth.view.C10357a;
import com.tinder.auth.view.LoginButtonGroupView;
import com.tinder.base.ActivityBase;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.base.module.C12613a;
import com.tinder.base.module.C12614b;
import com.tinder.base.module.C12615c;
import com.tinder.base.module.C12616d;
import com.tinder.base.module.ImageNetworkModule;
import com.tinder.base.p172b.C12612b;
import com.tinder.base.p174d.p175a.C8308d;
import com.tinder.bitmoji.C10376d;
import com.tinder.bitmoji.C10377f;
import com.tinder.bitmoji.C10378h;
import com.tinder.bitmoji.C10380k;
import com.tinder.bitmoji.C12618b;
import com.tinder.bitmoji.C12619e;
import com.tinder.bitmoji.C12620g;
import com.tinder.bitmoji.C3922i;
import com.tinder.bitmoji.repository.BitmojiAuthRepository;
import com.tinder.bitmoji.repository.BitmojiImageUrlRepository;
import com.tinder.boost.dialog.BoostPaywallDialog;
import com.tinder.boost.dialog.BoostSummaryDialog;
import com.tinder.boost.dialog.BoostUpdateDialog;
import com.tinder.boost.dialog.C10416c;
import com.tinder.boost.dialog.C10417d;
import com.tinder.boost.dialog.C10419g;
import com.tinder.boost.p178a.C10400d;
import com.tinder.boost.p178a.C12624n;
import com.tinder.boost.p178a.C8337b;
import com.tinder.boost.p179b.C10403e;
import com.tinder.boost.p179b.C12625b;
import com.tinder.boost.p179b.C12626f;
import com.tinder.boost.p179b.C8338a;
import com.tinder.boost.presenter.C12628f;
import com.tinder.boost.presenter.C12629r;
import com.tinder.boost.presenter.C12633s;
import com.tinder.boost.presenter.C8346a;
import com.tinder.boost.provider.BoostUpdateProvider;
import com.tinder.boost.provider.C10443i;
import com.tinder.boost.provider.C10445k;
import com.tinder.boost.provider.C12634b;
import com.tinder.boost.provider.C12635f;
import com.tinder.boost.provider.C12636g;
import com.tinder.boost.provider.C2639c;
import com.tinder.boost.provider.C8349a;
import com.tinder.boost.repository.BoostStatusRepository;
import com.tinder.boost.view.BoostButtonView;
import com.tinder.boost.view.C10454a;
import com.tinder.chat.activity.C8406b;
import com.tinder.chat.analytics.C10522a;
import com.tinder.chat.analytics.C12688c;
import com.tinder.chat.injection.components.ChatActivitySubcomponent;
import com.tinder.common.C10654a;
import com.tinder.common.C12786o;
import com.tinder.common.C12793s;
import com.tinder.common.CrashReporter;
import com.tinder.common.log.LoggingInitializer;
import com.tinder.common.logger.Logger;
import com.tinder.common.navigation.C10694a;
import com.tinder.common.navigation.C12785d;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.common.navigation.Screen;
import com.tinder.common.p078c.C12775b;
import com.tinder.common.p194f.C12778b;
import com.tinder.common.p318g.C10672a;
import com.tinder.common.permissions.IsExternalReadPermissionGranted;
import com.tinder.common.provider.C12787b;
import com.tinder.common.provider.C12788d;
import com.tinder.common.provider.C12790h;
import com.tinder.common.provider.C8549a;
import com.tinder.common.provider.C8550g;
import com.tinder.common.repository.C10698c;
import com.tinder.common.repository.MyUserRepository;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.AuthExperiment.AuthExperimentTimelineProvider;
import com.tinder.core.experiment.C12809b;
import com.tinder.core.experiment.C12810d;
import com.tinder.core.experiment.C12811e;
import com.tinder.core.experiment.C12812f;
import com.tinder.core.experiment.C12813i;
import com.tinder.core.experiment.C12814n;
import com.tinder.core.experiment.C12815q;
import com.tinder.core.experiment.C2644k;
import com.tinder.core.experiment.C8592c;
import com.tinder.core.experiment.C8597m;
import com.tinder.core.p201a.C12805b;
import com.tinder.core.p201a.C12808d;
import com.tinder.core.p201a.C8588a;
import com.tinder.core.p201a.C8589c;
import com.tinder.crashindicator.analytics.C10711a;
import com.tinder.crashindicator.analytics.C10712b;
import com.tinder.crashindicator.analytics.C3924c;
import com.tinder.crashindicator.p203b.C8605a;
import com.tinder.crashindicator.p321c.C10714b;
import com.tinder.crashindicator.p321c.C12820d;
import com.tinder.crashindicator.reporter.C12821b;
import com.tinder.crashindicator.reporter.C12822d;
import com.tinder.crashindicator.reporter.UncaughtExceptionTracker;
import com.tinder.crashindicator.view.AppCrashDialog;
import com.tinder.crashindicator.view.C10724c;
import com.tinder.data.C12843b;
import com.tinder.data.adapter.C10735f;
import com.tinder.data.adapter.C10738l;
import com.tinder.data.adapter.C10742q;
import com.tinder.data.adapter.C10743s;
import com.tinder.data.adapter.C10746z;
import com.tinder.data.adapter.C12828b;
import com.tinder.data.adapter.C12829c;
import com.tinder.data.adapter.C12830d;
import com.tinder.data.adapter.C12831e;
import com.tinder.data.adapter.C12832g;
import com.tinder.data.adapter.C12833k;
import com.tinder.data.adapter.C12834m;
import com.tinder.data.adapter.C12835r;
import com.tinder.data.adapter.C12836t;
import com.tinder.data.adapter.C12837x;
import com.tinder.data.adapter.C8617w;
import com.tinder.data.adapter.aa;
import com.tinder.data.adapter.ab;
import com.tinder.data.adapter.ai;
import com.tinder.data.adapter.am;
import com.tinder.data.adapter.ap;
import com.tinder.data.adapter.ar;
import com.tinder.data.adapter.at;
import com.tinder.data.adapter.p208a.C12827c;
import com.tinder.data.ads.C12838b;
import com.tinder.data.ads.C12839c;
import com.tinder.data.ads.TrackingUrlNotifier;
import com.tinder.data.boost.C12844b;
import com.tinder.data.boost.C12845e;
import com.tinder.data.boost.C12846g;
import com.tinder.data.buckets.C10758e;
import com.tinder.data.buckets.C8627a;
import com.tinder.data.buckets.C8630c;
import com.tinder.data.buckets.C8634g;
import com.tinder.data.crash.module.C12850b;
import com.tinder.data.crash.module.C12851c;
import com.tinder.data.crash.module.C12852d;
import com.tinder.data.crash.p213a.C12849b;
import com.tinder.data.crash.p214b.C8638a;
import com.tinder.data.database.C12854c;
import com.tinder.data.database.C12855d;
import com.tinder.data.database.C12856e;
import com.tinder.data.database.C12857f;
import com.tinder.data.database.C8644g;
import com.tinder.data.fastmatch.C12865c;
import com.tinder.data.fastmatch.usecase.C10771d;
import com.tinder.data.fastmatch.usecase.C12867e;
import com.tinder.data.feed.C12872a;
import com.tinder.data.feed.C12873d;
import com.tinder.data.feed.C12874g;
import com.tinder.data.feed.C12892j;
import com.tinder.data.feed.C12893m;
import com.tinder.data.feed.C12894o;
import com.tinder.data.gif.C12898c;
import com.tinder.data.gif.C12899f;
import com.tinder.data.gif.C12900i;
import com.tinder.data.gif.GifApiClient;
import com.tinder.data.keyboard.C10789c;
import com.tinder.data.keyboard.C12905b;
import com.tinder.data.keyboard.C12906d;
import com.tinder.data.loops.p223a.C12907b;
import com.tinder.data.loops.p223a.C12908c;
import com.tinder.data.match.C10798q;
import com.tinder.data.match.C10799v;
import com.tinder.data.match.C12921o;
import com.tinder.data.match.C12928r;
import com.tinder.data.match.C12936u;
import com.tinder.data.match.C12937w;
import com.tinder.data.match.C8674m;
import com.tinder.data.match.C8676s;
import com.tinder.data.match.aq;
import com.tinder.data.message.C12955j;
import com.tinder.data.message.C12956l;
import com.tinder.data.message.C12957p;
import com.tinder.data.message.C12958s;
import com.tinder.data.message.C12962x;
import com.tinder.data.message.C12963y;
import com.tinder.data.message.C12964z;
import com.tinder.data.message.C8698t;
import com.tinder.data.message.ag;
import com.tinder.data.message.bd;
import com.tinder.data.message.p225a.C10810c;
import com.tinder.data.message.p225a.C12938b;
import com.tinder.data.meta.module.C12982b;
import com.tinder.data.meta.module.C12983c;
import com.tinder.data.meta.module.C12984d;
import com.tinder.data.meta.p226a.C10843a;
import com.tinder.data.meta.p226a.C10844c;
import com.tinder.data.meta.p226a.C10846g;
import com.tinder.data.meta.p226a.C10848k;
import com.tinder.data.meta.p226a.C10849m;
import com.tinder.data.meta.p226a.C12965b;
import com.tinder.data.meta.p226a.C12966d;
import com.tinder.data.meta.p226a.C12967f;
import com.tinder.data.meta.p226a.C12968h;
import com.tinder.data.meta.p226a.C12969j;
import com.tinder.data.meta.p226a.C12970l;
import com.tinder.data.meta.p226a.C12971o;
import com.tinder.data.meta.p226a.C12972q;
import com.tinder.data.meta.p227b.C10851a;
import com.tinder.data.meta.p227b.C12981u;
import com.tinder.data.meta.store.MetaStore;
import com.tinder.data.p206a.p207a.C12825b;
import com.tinder.data.p206a.p207a.C12826c;
import com.tinder.data.p210b.C10748a;
import com.tinder.data.p210b.C12841b;
import com.tinder.data.p210b.C12842e;
import com.tinder.data.p210b.C8620d;
import com.tinder.data.p211c.C12848c;
import com.tinder.data.p211c.p212a.C12847b;
import com.tinder.data.p216f.p217a.C8646a;
import com.tinder.data.p216f.p323b.C10765a;
import com.tinder.data.p218g.p219a.C12895b;
import com.tinder.data.p218g.p219a.C8663a;
import com.tinder.data.p218g.p220b.C12896b;
import com.tinder.data.p218g.p220b.C8665a;
import com.tinder.data.p218g.p221c.C10780a;
import com.tinder.data.p218g.p221c.C12897b;
import com.tinder.data.p222i.C12904b;
import com.tinder.data.p222i.C8669a;
import com.tinder.data.p222i.p354a.C12903b;
import com.tinder.data.p322e.C12858b;
import com.tinder.data.p326h.p327a.C12901b;
import com.tinder.data.places.C13051f;
import com.tinder.data.places.C8747h;
import com.tinder.data.places.PlacesApiClient;
import com.tinder.data.places.PlacesRecsApiClient.C8736b;
import com.tinder.data.places.p330b.C10897e;
import com.tinder.data.places.p330b.C13047f;
import com.tinder.data.places.provider.PlacesConfigExpansionProvider;
import com.tinder.data.profile.C10951l;
import com.tinder.data.profile.C10975q;
import com.tinder.data.profile.C10984x;
import com.tinder.data.profile.C13075b;
import com.tinder.data.profile.C13076d;
import com.tinder.data.profile.C13078f;
import com.tinder.data.profile.C13079h;
import com.tinder.data.profile.C13080j;
import com.tinder.data.profile.C13081m;
import com.tinder.data.profile.C13082p;
import com.tinder.data.profile.C13085r;
import com.tinder.data.profile.C13087t;
import com.tinder.data.profile.C13089w;
import com.tinder.data.profile.C8753a;
import com.tinder.data.profile.C8761i;
import com.tinder.data.profile.adapter.C10913a;
import com.tinder.data.profile.adapter.C10914c;
import com.tinder.data.profile.adapter.C10915e;
import com.tinder.data.profile.adapter.C10916i;
import com.tinder.data.profile.adapter.C10917k;
import com.tinder.data.profile.adapter.C10918m;
import com.tinder.data.profile.adapter.C10919o;
import com.tinder.data.profile.adapter.C10920q;
import com.tinder.data.profile.adapter.C10921s;
import com.tinder.data.profile.adapter.C10922u;
import com.tinder.data.profile.adapter.C10923w;
import com.tinder.data.profile.adapter.C10924y;
import com.tinder.data.profile.adapter.C13061b;
import com.tinder.data.profile.adapter.C13062d;
import com.tinder.data.profile.adapter.C13063f;
import com.tinder.data.profile.adapter.C13064h;
import com.tinder.data.profile.adapter.C13065j;
import com.tinder.data.profile.adapter.C13066l;
import com.tinder.data.profile.adapter.C13067n;
import com.tinder.data.profile.adapter.C13068p;
import com.tinder.data.profile.adapter.C13069r;
import com.tinder.data.profile.adapter.C13070t;
import com.tinder.data.profile.adapter.C13071v;
import com.tinder.data.profile.adapter.C13072x;
import com.tinder.data.profile.adapter.C13073z;
import com.tinder.data.profile.adapter.C8754g;
import com.tinder.data.profile.adapter.ao;
import com.tinder.data.profile.adapter.as;
import com.tinder.data.profile.client.C8756a;
import com.tinder.data.profile.client.C8757b;
import com.tinder.data.profile.client.C8758c;
import com.tinder.data.profile.client.C8759d;
import com.tinder.data.profile.p228a.C10912c;
import com.tinder.data.profile.p228a.C13059b;
import com.tinder.data.profile.p228a.C13060d;
import com.tinder.data.profile.p228a.C8750a;
import com.tinder.data.profile.p331b.C10926a;
import com.tinder.data.profile.p331b.C13074b;
import com.tinder.data.profile.persistence.C10961b;
import com.tinder.data.profile.persistence.C13083c;
import com.tinder.data.profile.persistence.C13084e;
import com.tinder.data.profile.persistence.C8767d;
import com.tinder.data.profile.persistence.ProfileDataStore;
import com.tinder.data.profile.repository.C10977a;
import com.tinder.data.profile.repository.C10979b;
import com.tinder.data.profile.repository.C10981c;
import com.tinder.data.purchase.p091a.C13090b;
import com.tinder.data.purchase.p091a.C13091d;
import com.tinder.data.purchase.p091a.C13092f;
import com.tinder.data.recs.C13100f;
import com.tinder.data.recs.C8776g;
import com.tinder.data.superlikeable.C8794b;
import com.tinder.data.superlikeable.SuperLikeableGameApiClient;
import com.tinder.data.superlikeable.SuperLikeableGameApiClient.C8790a;
import com.tinder.data.toppicks.C11016j;
import com.tinder.data.toppicks.C11017k;
import com.tinder.data.toppicks.C13112b;
import com.tinder.data.toppicks.C13113d;
import com.tinder.data.toppicks.C13114f;
import com.tinder.data.toppicks.C13116l;
import com.tinder.data.toppicks.store.C13117b;
import com.tinder.data.toppicks.store.C8798a;
import com.tinder.data.updates.C11085z;
import com.tinder.data.updates.C13121b;
import com.tinder.data.updates.C13122f;
import com.tinder.data.updates.C13123n;
import com.tinder.data.updates.C13124q;
import com.tinder.data.updates.C13125r;
import com.tinder.data.updates.C13126s;
import com.tinder.data.updates.C13127t;
import com.tinder.data.updates.C13128u;
import com.tinder.data.updates.C13129x;
import com.tinder.data.updates.ae;
import com.tinder.data.updates.ah;
import com.tinder.data.updates.p332a.C13120b;
import com.tinder.data.user.CurrentUserIdProvider;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.deeplink.DeepLinkedSharedRecInterceptor;
import com.tinder.deeplink.p229b.C13132d;
import com.tinder.deeplink.p229b.C8819a;
import com.tinder.dialogs.C11116o;
import com.tinder.dialogs.DialogIsTween;
import com.tinder.discovery.domain.DiscoverySegmentRepository;
import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.auth.AuthStatusRepository;
import com.tinder.domain.auth.ClearSharedPreferences;
import com.tinder.domain.auth.DeleteUserData;
import com.tinder.domain.auth.UniqueIdFactory;
import com.tinder.domain.auth.usecase.MaskEmail_Factory;
import com.tinder.domain.auth.usecase.PasswordValidator;
import com.tinder.domain.auth.usecase.RegexEmailValidator;
import com.tinder.domain.auth.usecase.RegexEmailValidator_Factory;
import com.tinder.domain.boost.repository.BoostProfileFacesRepository;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.connectivity.ConnectivityRepository;
import com.tinder.domain.crash.gateway.CrashTimeStampGateway;
import com.tinder.domain.experiments.BucketsWorker;
import com.tinder.domain.experiments.FetchBuckets;
import com.tinder.domain.experiments.GetBuckets;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider_Factory;
import com.tinder.domain.feed.DraftRepository;
import com.tinder.domain.feed.FeedCarouselItemSelectedRepository;
import com.tinder.domain.feed.FeedRangeRepository;
import com.tinder.domain.feed.FeedRepository;
import com.tinder.domain.feed.usecase.ObserveFeed;
import com.tinder.domain.feed.usecase.ObserveFeed_Factory;
import com.tinder.domain.feed.usecase.ObserveHasNewFeedItems;
import com.tinder.domain.feed.usecase.ObserveHasNewFeedItems_Factory;
import com.tinder.domain.injection.modules.C13153xad945d7;
import com.tinder.domain.injection.modules.C13154xe42f5e5a;
import com.tinder.domain.injection.modules.C13155xa389edd5;
import com.tinder.domain.injection.modules.C13156x9c0cf4b0;
import com.tinder.domain.injection.modules.C13157x3838645d;
import com.tinder.domain.injection.modules.CommonDomainModule;
import com.tinder.domain.injection.modules.CommonDomainModule_ProvideCheckedTutorial$domain_releaseFactory;
import com.tinder.domain.injection.modules.CommonDomainModule_ProvideConfirmTutorial$domain_releaseFactory;
import com.tinder.domain.injection.modules.CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory;
import com.tinder.domain.injection.modules.CommonDomainModule_ProvideUtcOffsetMins$domain_releaseFactory;
import com.tinder.domain.injection.modules.RxSchedulersModule;
import com.tinder.domain.injection.modules.RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory;
import com.tinder.domain.loops.usecase.GetAutoPlayLoopsEnabled;
import com.tinder.domain.loops.usecase.GetAutoPlayLoopsEnabledStatus;
import com.tinder.domain.match.provider.NewMatchProvider;
import com.tinder.domain.match.provider.UnMatchNotifier;
import com.tinder.domain.match.repository.TrackingUrlRepository;
import com.tinder.domain.match.usecase.BlockMatches_Factory;
import com.tinder.domain.match.usecase.CountMatches;
import com.tinder.domain.match.usecase.CreateMessageAdMatch;
import com.tinder.domain.match.usecase.CreateMessageAdMatch_Factory;
import com.tinder.domain.match.usecase.DeleteAllMatches;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.domain.match.usecase.GetMatch_Factory;
import com.tinder.domain.match.usecase.GetMessagesMatches;
import com.tinder.domain.match.usecase.GetNewMatches;
import com.tinder.domain.match.usecase.InsertMatches_Factory;
import com.tinder.domain.match.usecase.UnMatch;
import com.tinder.domain.match.usecase.UnMatch_Factory;
import com.tinder.domain.message.GifRepository;
import com.tinder.domain.message.MessageDeliveryStatusUpdatesProvider;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.message.ReactionSettingsRepository;
import com.tinder.domain.message.usecase.CleanUpPendingMessages;
import com.tinder.domain.message.usecase.InsertMessageLikes_Factory;
import com.tinder.domain.message.usecase.InsertMessages_Factory;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.providers.AuthStatusProvider;
import com.tinder.domain.meta.usecase.FetchMeta_Factory;
import com.tinder.domain.meta.usecase.GetCurrentUser;
import com.tinder.domain.meta.usecase.ObserveCurrentUser;
import com.tinder.domain.meta.usecase.ObserveCurrentUser_Factory;
import com.tinder.domain.onboarding.OnboardingTutorialAdapter;
import com.tinder.domain.onboarding.OnboardingTutorialAdapter_Factory;
import com.tinder.domain.onboarding.TutorialToOnboardingTutorialNameAdapter;
import com.tinder.domain.onboarding.TutorialToOnboardingTutorialNameAdapter_Factory;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.PlacesLoadedStateProvider;
import com.tinder.domain.places.PlacesLoadedStateProvider_Factory;
import com.tinder.domain.places.PlacesRepository;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.domain.places.provider.PlacesOnboardingProgressProvider;
import com.tinder.domain.places.tracker.PlacesLocationTracker;
import com.tinder.domain.places.usecase.ClearAllPlaces;
import com.tinder.domain.profile.experiment.LoopsPhase1Experiment;
import com.tinder.domain.profile.experiment.MaxPhotoExperiment;
import com.tinder.domain.profile.experiment.NewPhotoGridExperiment;
import com.tinder.domain.profile.repository.CustomGenderRepository;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.profile.repository.ProfilePhotoRepository;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import com.tinder.domain.profile.repository.WebProfileRepository;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.CheckTutorialViewedStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed_Factory;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewedStatus;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed_Factory;
import com.tinder.domain.profile.usecase.ConnectInstagram;
import com.tinder.domain.profile.usecase.DisconnectInstagram;
import com.tinder.domain.profile.usecase.GetProfileOptionData;
import com.tinder.domain.profile.usecase.GetProfileOptionData_Factory;
import com.tinder.domain.profile.usecase.LoadMoreGenderList;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.LoadProfileOptionData_Factory;
import com.tinder.domain.profile.usecase.ObserveDiscoverySettings;
import com.tinder.domain.profile.usecase.ObserveDiscoverySettings_Factory;
import com.tinder.domain.profile.usecase.ProfileImageUploader;
import com.tinder.domain.profile.usecase.SMSUpdateJob;
import com.tinder.domain.profile.usecase.SMSUpdateSchool;
import com.tinder.domain.profile.usecase.SavePlusControlSettings;
import com.tinder.domain.profile.usecase.SetDiscoverability;
import com.tinder.domain.profile.usecase.SetDiscoverability_Factory;
import com.tinder.domain.profile.usecase.SyncProfileData_Factory;
import com.tinder.domain.profile.usecase.UpdateJob;
import com.tinder.domain.profile.usecase.UpdateProfile;
import com.tinder.domain.profile.usecase.UpdateSchool;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.pushnotifications.usecase.RegisterPushToken;
import com.tinder.domain.pushnotifications.usecase.UnregisterPushToken;
import com.tinder.domain.recs.RatingsApiClient;
import com.tinder.domain.recs.RecsAdditionalDataPrefetcher;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.SwipeDataStore;
import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.domain.recs.engine.dispatcher.SwipeDispatcher.Factory;
import com.tinder.domain.recs.usecase.ObserveRecsEngineLoadingStatuses;
import com.tinder.domain.settings.email.usecase.LoadEmailDisplaySettings;
import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import com.tinder.domain.settings.notifications.NotificationSettingsRepository;
import com.tinder.domain.superlikeable.C13164x2704b664;
import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator;
import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator_GamePlayFlow_Factory;
import com.tinder.domain.superlikeable.SuperLikeableGameRepository;
import com.tinder.domain.superlikeable.SuperLikeableGameSwipeTracker;
import com.tinder.domain.superlikeable.SuperLikeableGameSwipeTracker.SwipeCountThresholdDetector;
import com.tinder.domain.superlikeable.SuperLikeableGameSwipeTracker_Factory;
import com.tinder.domain.superlikeable.usecase.EndSuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.LoadSuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.LoadSuperLikeableGame_Factory;
import com.tinder.domain.superlikeable.usecase.SkipSuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.SkipSuperLikeableGame_Factory;
import com.tinder.domain.toppicks.TopPicksLoadingStatusProviderAndNotifier;
import com.tinder.domain.toppicks.TopPicksLoadingStatusProviderAndNotifier_Factory;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import com.tinder.domain.toppicks.repo.TopPicksSettingRepository;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksScreenState;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksScreenState_Factory;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksSession;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksSession_Factory;
import com.tinder.domain.toppicks.usecase.ResetScreenState;
import com.tinder.domain.toppicks.usecase.ResetScreenState_Factory;
import com.tinder.domain.toppicks.usecase.ResetTopPickSession;
import com.tinder.domain.toppicks.usecase.ResetTopPickSession_Factory;
import com.tinder.domain.toppicks.usecase.TopPicksNotificationsAreEnabled;
import com.tinder.domain.toppicks.usecase.TopPicksNotificationsAreEnabled_Factory;
import com.tinder.domain.tracker.ListItemViewDurationRepository;
import com.tinder.domain.updates.PollIntervalRepository;
import com.tinder.domain.utils.AgeCalculator;
import com.tinder.domain.utils.AgeCalculator_Factory;
import com.tinder.editprofile.p237a.C8947a;
import com.tinder.editprofile.view.C11156a;
import com.tinder.editprofile.view.EditFeedSettingItemView;
import com.tinder.fastmatch.FastMatchRecsActivityComponent;
import com.tinder.fastmatch.p244b.C11621a;
import com.tinder.fastmatch.presenter.C9385a;
import com.tinder.fastmatch.presenter.C9387c;
import com.tinder.fastmatch.presenter.C9390f;
import com.tinder.fastmatch.presenter.C9399q;
import com.tinder.fastmatch.preview.C13208f;
import com.tinder.fastmatch.preview.C9404e;
import com.tinder.fastmatch.view.C11674b;
import com.tinder.fastmatch.view.C11675d;
import com.tinder.fastmatch.view.C11680j;
import com.tinder.fastmatch.view.FastMatchPreviewRowView;
import com.tinder.fastmatch.view.FastMatchPreviewView;
import com.tinder.fastmatch.view.TinderGoldPaywallDialog;
import com.tinder.fastmatch.view.UpgradeGoldPaywallItem.C9416b;
import com.tinder.fastmatch.viewmodel.C9420a;
import com.tinder.feed.analytics.events.C11691f;
import com.tinder.feed.analytics.p247a.C13218d;
import com.tinder.feed.analytics.p247a.C9423b;
import com.tinder.feed.analytics.session.C13240e;
import com.tinder.feed.analytics.session.C13241g;
import com.tinder.feed.analytics.session.C13244i;
import com.tinder.feed.analytics.session.C13245l;
import com.tinder.feed.analytics.session.C13246m;
import com.tinder.feed.analytics.session.C13247p;
import com.tinder.feed.analytics.session.C9441a;
import com.tinder.feed.analytics.session.C9450f;
import com.tinder.feed.analytics.session.C9451h;
import com.tinder.feed.analytics.session.C9453j;
import com.tinder.feed.analytics.session.C9454k;
import com.tinder.feed.analytics.session.C9455n;
import com.tinder.feed.analytics.session.C9458s;
import com.tinder.feed.analytics.session.FeedPositionRequestProvider;
import com.tinder.feed.p249d.C13264b;
import com.tinder.feed.p249d.C13265d;
import com.tinder.feed.p249d.C9462a;
import com.tinder.feed.p341b.C11695a;
import com.tinder.feed.p341b.C13252b;
import com.tinder.feed.view.C3929a;
import com.tinder.feed.view.model.C13279c;
import com.tinder.feed.view.provider.C13294d;
import com.tinder.feed.view.provider.C13296f;
import com.tinder.feed.view.tracker.C13306h;
import com.tinder.feed.view.tracker.C9551g;
import com.tinder.fireboarding.domain.C11800b;
import com.tinder.fireboarding.domain.C11804j;
import com.tinder.fireboarding.domain.C11809n;
import com.tinder.fireboarding.domain.C11811o;
import com.tinder.fireboarding.domain.C11813p;
import com.tinder.fireboarding.domain.C11824u;
import com.tinder.fireboarding.domain.C9567m;
import com.tinder.fireboarding.domain.CompletedLevelRepository;
import com.tinder.fireboarding.domain.FireboardingEnabledRepository;
import com.tinder.fireboarding.domain.FireboardingGame;
import com.tinder.fireboarding.domain.FireboardingGame.GameListener;
import com.tinder.fireboarding.domain.Level;
import com.tinder.fragments.C11844f;
import com.tinder.fragments.C11849m;
import com.tinder.fragments.C11850o;
import com.tinder.fragments.C11851p;
import com.tinder.fragments.C11852u;
import com.tinder.fragments.C13308g;
import com.tinder.fragments.C13309n;
import com.tinder.fragments.C13310q;
import com.tinder.fragments.EditProfilePhotoView;
import com.tinder.fragments.FragmentAgeMoreGender;
import com.tinder.fragments.FragmentEditProfile;
import com.tinder.fragments.FragmentMap;
import com.tinder.gamepadcounters.C13318e;
import com.tinder.gamepadcounters.C9673c;
import com.tinder.goingout.p357a.C13319a;
import com.tinder.goingout.view.C11856a;
import com.tinder.goingout.view.TimeSinceTextView;
import com.tinder.home.navigation.C13330d;
import com.tinder.home.navigation.C9703a;
import com.tinder.home.p259b.C13324b;
import com.tinder.home.p259b.C9695a;
import com.tinder.injection.p261a.C13332b;
import com.tinder.injection.p261a.C13333c;
import com.tinder.injection.p261a.C13334d;
import com.tinder.injection.p261a.C9707a;
import com.tinder.interactors.C13340b;
import com.tinder.interactors.C13341d;
import com.tinder.interactors.C13342j;
import com.tinder.interactors.C13343n;
import com.tinder.interactors.C2647c;
import com.tinder.interactors.C9715f;
import com.tinder.interactors.C9716g;
import com.tinder.interactors.C9717h;
import com.tinder.interactors.p262a.C13335b;
import com.tinder.interactors.p262a.C13336d;
import com.tinder.interactors.p262a.C13337f;
import com.tinder.interactors.p262a.C13338h;
import com.tinder.interactors.p262a.C13339j;
import com.tinder.intro.C11873a;
import com.tinder.intro.C13345b;
import com.tinder.intro.IntroFragment;
import com.tinder.intropricing.C3930b;
import com.tinder.intropricing.C3931c;
import com.tinder.intropricing.domain.repo.IntroPricingApplicationRepository;
import com.tinder.intropricing.domain.worker.C13350b;
import com.tinder.intropricing.domain.worker.C9733a;
import com.tinder.intropricing.domain.worker.IntroPricingWorker;
import com.tinder.intropricing.p263a.C13347b;
import com.tinder.intropricing.p263a.p343a.C13346b;
import com.tinder.intropricing.p344b.C13348b;
import com.tinder.itsamatch.C9743a;
import com.tinder.managers.C12029y;
import com.tinder.managers.C13395h;
import com.tinder.managers.C13396m;
import com.tinder.managers.C2652a;
import com.tinder.managers.FacebookManager;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.ad;
import com.tinder.managers.af;
import com.tinder.managers.be;
import com.tinder.managers.bf;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.managers.bl;
import com.tinder.managers.bq;
import com.tinder.managers.bt;
import com.tinder.match.C12031a;
import com.tinder.match.DeleteSponsoredMessageJobService;
import com.tinder.match.dialog.C12043a;
import com.tinder.match.dialog.C12049l;
import com.tinder.match.dialog.C9861g;
import com.tinder.match.dialog.C9862h;
import com.tinder.match.p291b.C13415c;
import com.tinder.match.p292c.C13416b;
import com.tinder.match.p292c.C13417c;
import com.tinder.match.p292c.C13418d;
import com.tinder.match.p292c.C13419e;
import com.tinder.match.p292c.C9850a;
import com.tinder.match.provider.C13434c;
import com.tinder.match.provider.C13436h;
import com.tinder.match.provider.C9876b;
import com.tinder.match.provider.C9879g;
import com.tinder.messageads.UserAgentCache;
import com.tinder.messageads.p349f.C13477b;
import com.tinder.model.SparksEvent;
import com.tinder.model.adapter.domain.BadgeLegacyBadgeAdapter_Factory;
import com.tinder.model.adapter.domain.CurrentUserLegacyUserAdapter_Factory;
import com.tinder.model.adapter.domain.GenderLegacyUserAdapter_Factory;
import com.tinder.model.adapter.domain.InstagramInstagramDataSetAdapter_Factory;
import com.tinder.model.adapter.domain.InstagramPhotoLegacyInstagramPhotoAdapter_Factory;
import com.tinder.model.adapter.domain.JobLegacyJobAdapter_Factory;
import com.tinder.model.adapter.domain.PhotoProfilePhotoAdapter_Factory;
import com.tinder.model.adapter.domain.PhotoProfilePhotoAdapter_RenderProcessedFileAdapter_Factory;
import com.tinder.model.adapter.domain.SchoolLegacySchoolAdapter_Factory;
import com.tinder.model.adapter.domain.SpotifyArtistLegacyArtistAdapter_Factory;
import com.tinder.model.adapter.domain.SpotifyTrackSearchTrackAdapter_ArtistAdapter_Factory;
import com.tinder.model.adapter.domain.SpotifyTrackSearchTrackAdapter_Factory;
import com.tinder.model.auth.network.AuthRequestFactory_Factory;
import com.tinder.model.network.ErrorResponseConverter;
import com.tinder.module.C13481b;
import com.tinder.module.C13482c;
import com.tinder.module.C13483do;
import com.tinder.module.C13484e;
import com.tinder.module.C13485f;
import com.tinder.module.C13486g;
import com.tinder.module.C13487h;
import com.tinder.module.C13488i;
import com.tinder.module.C13489j;
import com.tinder.module.C13490k;
import com.tinder.module.C13491l;
import com.tinder.module.C13492m;
import com.tinder.module.C13493n;
import com.tinder.module.C13494o;
import com.tinder.module.C13495p;
import com.tinder.module.C13496q;
import com.tinder.module.C13497r;
import com.tinder.module.C13498s;
import com.tinder.module.C13499t;
import com.tinder.module.C13500u;
import com.tinder.module.C13501v;
import com.tinder.module.C13502w;
import com.tinder.module.C13503x;
import com.tinder.module.C13504y;
import com.tinder.module.C13505z;
import com.tinder.module.C9939a;
import com.tinder.module.C9940d;
import com.tinder.module.CensorViewComponent;
import com.tinder.module.FastMatchModule;
import com.tinder.module.aj;
import com.tinder.module.ak;
import com.tinder.module.au;
import com.tinder.module.av;
import com.tinder.module.aw;
import com.tinder.module.ax;
import com.tinder.module.ay;
import com.tinder.module.az;
import com.tinder.module.ba;
import com.tinder.module.bb;
import com.tinder.module.bc;
import com.tinder.module.bi;
import com.tinder.module.bm;
import com.tinder.module.bn;
import com.tinder.module.bo;
import com.tinder.module.bp;
import com.tinder.module.br;
import com.tinder.module.bs;
import com.tinder.module.bu;
import com.tinder.module.bv;
import com.tinder.module.bx;
import com.tinder.module.by;
import com.tinder.module.bz;
import com.tinder.module.ca;
import com.tinder.module.cb;
import com.tinder.module.cc;
import com.tinder.module.cd;
import com.tinder.module.ce;
import com.tinder.module.cf;
import com.tinder.module.cg;
import com.tinder.module.ch;
import com.tinder.module.ci;
import com.tinder.module.cj;
import com.tinder.module.ck;
import com.tinder.module.cl;
import com.tinder.module.cm;
import com.tinder.module.cn;
import com.tinder.module.co;
import com.tinder.module.cp;
import com.tinder.module.cq;
import com.tinder.module.cr;
import com.tinder.module.cs;
import com.tinder.module.ct;
import com.tinder.module.cu;
import com.tinder.module.cv;
import com.tinder.module.cw;
import com.tinder.module.cx;
import com.tinder.module.cy;
import com.tinder.module.cz;
import com.tinder.module.da;
import com.tinder.module.db;
import com.tinder.module.dc;
import com.tinder.module.dd;
import com.tinder.module.de;
import com.tinder.module.dg;
import com.tinder.module.dh;
import com.tinder.module.di;
import com.tinder.module.dj;
import com.tinder.module.dk;
import com.tinder.module.dl;
import com.tinder.module.dm;
import com.tinder.module.dn;
import com.tinder.module.dp;
import com.tinder.module.dq;
import com.tinder.module.dr;
import com.tinder.module.ds;
import com.tinder.module.dt;
import com.tinder.module.du;
import com.tinder.module.dv;
import com.tinder.module.dw;
import com.tinder.module.dy;
import com.tinder.module.dz;
import com.tinder.module.ea;
import com.tinder.module.eb;
import com.tinder.module.ec;
import com.tinder.module.ed;
import com.tinder.module.ee;
import com.tinder.module.ef;
import com.tinder.module.eg;
import com.tinder.module.eh;
import com.tinder.module.ei;
import com.tinder.module.ej;
import com.tinder.module.ek;
import com.tinder.module.el;
import com.tinder.module.em;
import com.tinder.module.en;
import com.tinder.module.eo;
import com.tinder.module.ep;
import com.tinder.module.eq;
import com.tinder.module.es;
import com.tinder.module.ew;
import com.tinder.module.ey;
import com.tinder.module.ez;
import com.tinder.module.fa;
import com.tinder.module.fd;
import com.tinder.module.ff;
import com.tinder.module.fg;
import com.tinder.module.fh;
import com.tinder.module.fi;
import com.tinder.module.fk;
import com.tinder.module.fl;
import com.tinder.onboarding.dialog.C12167a;
import com.tinder.onboarding.dialog.PhotoSourceSelectorSheetDialog;
import com.tinder.onboarding.module.C2655a;
import com.tinder.onboarding.module.OnboardingComponent;
import com.tinder.onboarding.presenter.gl;
import com.tinder.overflow.actionitem.C12227d;
import com.tinder.overflow.actionitem.C12228e;
import com.tinder.overflow.actionitem.C12231g;
import com.tinder.overflow.actionitem.C12233j;
import com.tinder.overflow.actionitem.C12234k;
import com.tinder.overflow.actionitem.C12235l;
import com.tinder.overflow.actionitem.C12237m;
import com.tinder.overflow.actionitem.C12238n;
import com.tinder.overflow.analytics.C12246e;
import com.tinder.overflow.analytics.RecommendProfileBroadcastReceiver;
import com.tinder.overflow.p299a.C10013a;
import com.tinder.overflow.p299a.C10015c;
import com.tinder.overflow.p299a.C10017e;
import com.tinder.p071a.C2602d;
import com.tinder.p071a.C2603i;
import com.tinder.p071a.C3867k;
import com.tinder.p071a.C4297e;
import com.tinder.p088c.p089a.p090a.C12643b;
import com.tinder.p204d.p205a.C12824b;
import com.tinder.p204d.p205a.C8609a;
import com.tinder.p238f.p239a.C13168b;
import com.tinder.p238f.p239a.C9363a;
import com.tinder.p238f.p243e.C11603e;
import com.tinder.p238f.p243e.C11604g;
import com.tinder.p238f.p243e.C11608k;
import com.tinder.p238f.p243e.C11609m;
import com.tinder.p238f.p243e.C11610o;
import com.tinder.p238f.p243e.C11611q;
import com.tinder.p238f.p243e.C11612s;
import com.tinder.p238f.p243e.C13172b;
import com.tinder.p238f.p243e.C13173d;
import com.tinder.p238f.p243e.C13174f;
import com.tinder.p238f.p243e.C13175h;
import com.tinder.p238f.p243e.C13176j;
import com.tinder.p238f.p243e.C13177l;
import com.tinder.p238f.p243e.C13178n;
import com.tinder.p238f.p243e.C13179p;
import com.tinder.p238f.p243e.C13180r;
import com.tinder.p238f.p243e.C13181t;
import com.tinder.p238f.p243e.C9368a;
import com.tinder.p238f.p336c.C11600a;
import com.tinder.p238f.p336c.C13169b;
import com.tinder.p238f.p337d.C13171c;
import com.tinder.p257g.C13311f;
import com.tinder.p257g.C9648e;
import com.tinder.passport.activities.ActivityPassport;
import com.tinder.passport.activities.C12254j;
import com.tinder.passport.p093d.C3945a;
import com.tinder.passport.p302c.C10039a;
import com.tinder.passport.p302c.C13541c;
import com.tinder.passport.provider.PassportLocationProvider;
import com.tinder.paywall.C10046a;
import com.tinder.paywall.C10052b;
import com.tinder.paywall.C13549c;
import com.tinder.paywall.domain.PaywallRepository;
import com.tinder.paywall.p304b.C10047a;
import com.tinder.paywall.p304b.C10049c;
import com.tinder.paywall.p304b.C12265d;
import com.tinder.paywall.p304b.C12266e;
import com.tinder.paywall.p305d.C10057a;
import com.tinder.paywall.p305d.C13550b;
import com.tinder.paywall.p351a.C13547b;
import com.tinder.paywall.p360c.C13548a;
import com.tinder.paywall.paywallflow.C10067d;
import com.tinder.paywall.paywallflow.C10072h;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.paywall.paywallflow.C10079r;
import com.tinder.paywall.paywallflow.C12280q;
import com.tinder.paywall.paywallflow.C13551g;
import com.tinder.paywall.paywallflow.C13552n;
import com.tinder.paywall.viewmodels.C10083b;
import com.tinder.paywall.viewmodels.C10084g;
import com.tinder.paywall.viewmodels.C10089j;
import com.tinder.paywall.viewmodels.C10090l;
import com.tinder.paywall.viewmodels.C10091m;
import com.tinder.paywall.viewmodels.C10094p;
import com.tinder.paywall.viewmodels.C13553c;
import com.tinder.paywall.viewmodels.C13554k;
import com.tinder.photooptimizer.C10110a;
import com.tinder.photooptimizer.C13557b;
import com.tinder.photooptimizer.C13558c;
import com.tinder.places.analytics.C13560c;
import com.tinder.places.analytics.C13561k;
import com.tinder.places.injection.PlacesComponent;
import com.tinder.places.injection.PlacesDisabledSurveyComponent;
import com.tinder.places.injection.PlacesOnboardingComponent;
import com.tinder.places.injection.PlacesRecsComponent;
import com.tinder.places.injection.PlacesSettingsComponent;
import com.tinder.places.injection.PlacesSurveyOtherComponent;
import com.tinder.places.job.C12348a;
import com.tinder.places.job.SubmitVisitJob;
import com.tinder.places.p311f.C13576k;
import com.tinder.places.provider.C10271c;
import com.tinder.places.provider.C10275k;
import com.tinder.places.provider.C12412a;
import com.tinder.places.provider.C12421h;
import com.tinder.places.provider.C12425m;
import com.tinder.places.provider.C13595b;
import com.tinder.places.provider.C13596d;
import com.tinder.places.provider.C13597i;
import com.tinder.places.provider.C13598l;
import com.tinder.places.provider.C13599n;
import com.tinder.places.tracker.C17736c;
import com.tinder.places.tracker.C17737d;
import com.tinder.places.tracker.TinderTracker;
import com.tinder.presenters.C14354a;
import com.tinder.presenters.C17741b;
import com.tinder.presenters.C17743c;
import com.tinder.presenters.C17744d;
import com.tinder.presenters.PresenterDialogIsTween;
import com.tinder.presenters.bw;
import com.tinder.presenters.df;
import com.tinder.profile.adapters.C17745f;
import com.tinder.profile.adapters.C17746h;
import com.tinder.profile.adapters.C17747j;
import com.tinder.profile.adapters.C17748l;
import com.tinder.profile.module.ProfileComponent;
import com.tinder.profile.p363b.C14386k;
import com.tinder.profile.p363b.C16093z;
import com.tinder.profile.p363b.C17754l;
import com.tinder.profile.p363b.al;
import com.tinder.profile.p363b.an;
import com.tinder.profile.p364c.C17758b;
import com.tinder.profile.p366e.C14413e.C14412a;
import com.tinder.profile.p366e.C14415f.C14414a;
import com.tinder.profile.presenter.C14426e;
import com.tinder.profile.presenter.C14431r;
import com.tinder.profile.view.C16162n;
import com.tinder.profile.view.ProfileBitmojiAuthView;
import com.tinder.profiletab.p367a.C14458a;
import com.tinder.profiletab.p367a.C17776b;
import com.tinder.purchase.C17804b;
import com.tinder.purchase.C17811c;
import com.tinder.purchase.C17812d;
import com.tinder.purchase.C17832e;
import com.tinder.purchase.C17833f;
import com.tinder.purchase.C17834g;
import com.tinder.purchase.PurchaseModule;
import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.billing.C14484a;
import com.tinder.purchase.domain.C14490a;
import com.tinder.purchase.domain.model.C14517l;
import com.tinder.purchase.domain.model.C17820i;
import com.tinder.purchase.domain.model.C17821m;
import com.tinder.purchase.domain.model.p375a.C17819b;
import com.tinder.purchase.domain.p374a.C14489a;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.job.C16230a;
import com.tinder.purchase.job.ReportBillingTimeoutService;
import com.tinder.purchase.logging.C14522a;
import com.tinder.purchase.logging.C17838d;
import com.tinder.purchase.logging.p376a.C14521a;
import com.tinder.purchase.logging.p376a.C17835b;
import com.tinder.purchase.logging.repository.PurchaseLogRepository;
import com.tinder.purchase.model.C14530a;
import com.tinder.purchase.model.C14531b;
import com.tinder.purchase.model.p377a.C14529b;
import com.tinder.purchase.model.p377a.C17850n;
import com.tinder.purchase.p371a.C14479a;
import com.tinder.purchase.p371a.C14480k;
import com.tinder.purchase.p371a.C17799j;
import com.tinder.purchase.p371a.C17801o;
import com.tinder.purchase.p372b.C14482a;
import com.tinder.purchase.p372b.C14483c;
import com.tinder.purchase.p372b.C17802b;
import com.tinder.purchase.p372b.C17803d;
import com.tinder.purchase.p373c.C14488a;
import com.tinder.purchase.providers.BillerVersionCodeProvider;
import com.tinder.purchase.register.Register;
import com.tinder.purchase.register.RegisterImpl;
import com.tinder.purchase.usecase.C14539e;
import com.tinder.purchase.usecase.C14541j;
import com.tinder.purchase.usecase.C17864b;
import com.tinder.purchase.usecase.C17869d;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.C16249d;
import com.tinder.pushnotifications.C17880b;
import com.tinder.pushnotifications.C17881c;
import com.tinder.pushnotifications.TinderGcmListenerService;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.pushnotifications.p380a.C17878c;
import com.tinder.pushnotifications.p381b.C14551a;
import com.tinder.pushnotifications.p381b.C14552c;
import com.tinder.pushnotifications.p381b.C17879b;
import com.tinder.pushnotifications.presenter.InAppNotificationsPresenter;
import com.tinder.pushnotifications.strategy.C16266a;
import com.tinder.pushnotifications.strategy.C16270c;
import com.tinder.pushnotifications.strategy.C17884b;
import com.tinder.pushnotifications.strategy.C17885d;
import com.tinder.pushnotifications.usecase.C14574a;
import com.tinder.pushnotifications.usecase.C14575d;
import com.tinder.pushnotifications.usecase.C14576e;
import com.tinder.pushnotifications.usecase.C17889b;
import com.tinder.pushnotifications.usecase.C17890c;
import com.tinder.pushnotifications.usecase.NotifyPushServer;
import com.tinder.pushnotifications.view.InAppNotificationView;
import com.tinder.reactions.analytics.C16273c;
import com.tinder.reactions.analytics.C16275f;
import com.tinder.reactions.dialog.C16315a;
import com.tinder.reactions.dialog.C16316b;
import com.tinder.reactions.dialog.p390a.C14621a;
import com.tinder.reactions.p385c.C16286e;
import com.tinder.recs.RecsPhotoUrlFactory_Factory;
import com.tinder.recs.analytics.AddNewMatchEvent_Factory;
import com.tinder.recs.analytics.AddRecsRateEvent_Factory;
import com.tinder.recs.analytics.AddRecsSessionEvent_Factory;
import com.tinder.recs.analytics.AddRecsViewEvent;
import com.tinder.recs.analytics.AddRecsViewEvent_Factory;
import com.tinder.recs.analytics.RecsPhotosViewedCache;
import com.tinder.recs.analytics.RecsSessionTracker;
import com.tinder.recs.analytics.RecsSessionTracker_RecsSessionFactory_Factory;
import com.tinder.recs.analytics.dedupe.RecsAllPhotosViewedDuplicateEventChecker;
import com.tinder.recs.analytics.dedupe.RecsAllPhotosViewedDuplicateEventChecker_Factory;
import com.tinder.recs.analytics.dedupe.RecsPhotoViewDuplicateEventChecker;
import com.tinder.recs.card.CardSizeProvider;
import com.tinder.recs.card.CardSizeProvider_Factory;
import com.tinder.recs.data.RatingRequestFactory;
import com.tinder.recs.data.RatingRequestFactory_Factory;
import com.tinder.recs.data.RatingRequestFactory_RatingRequestCommonFields_Factory_Factory;
import com.tinder.recs.data.RatingResultAdapter;
import com.tinder.recs.data.RatingResultAdapter_Factory;
import com.tinder.recs.domain.repository.RewindsAvailableRepository;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import com.tinder.recs.engine.RecsEngineProvider;
import com.tinder.recs.engine.RecsEngineProvider_Factory;
import com.tinder.recs.engine.RecsEngineResolver;
import com.tinder.recs.engine.RecsEngineResolver_Factory;
import com.tinder.recs.module.RecsModule_ProvideCoreRecsApiClientFactory;
import com.tinder.recs.module.RecsModule_ProvideDescrementRewindsAvailableFactory;
import com.tinder.recs.module.RecsModule_ProvideFastMatchApiClientFactory;
import com.tinder.recs.module.RecsModule_ProvideFastMatchRecV2DomainApiAdapterFactory;
import com.tinder.recs.module.RecsModule_ProvideFastMatchSwipeProcessingRulesResolverFactory;
import com.tinder.recs.module.RecsModule_ProvideIncrementRewindsAvailableFactory;
import com.tinder.recs.module.RecsModule_ProvideObserveRewindsAvailableFactory;
import com.tinder.recs.module.RecsModule_ProvidePlacesApiClientFactoryFactory;
import com.tinder.recs.module.RecsModule_ProvidePlacesSwipeProcessingRulesResolverFactory;
import com.tinder.recs.module.RecsModule_ProvideRatingProcessorFactory;
import com.tinder.recs.module.RecsModule_ProvideRatingsApiClientFactory;
import com.tinder.recs.module.RecsModule_ProvideRecV2DomainApiAdapterFactory;
import com.tinder.recs.module.RecsModule_ProvideRecsAdditionalDataPrefetcherFactory;
import com.tinder.recs.module.RecsModule_ProvideRecsAlreadySwipedProviderFactory;
import com.tinder.recs.module.RecsModule_ProvideRecsEngineConfiguratorFactoryFactory;
import com.tinder.recs.module.RecsModule_ProvideRecsEngineRegistryFactory;
import com.tinder.recs.module.RecsModule_ProvideRecsEventFactory;
import com.tinder.recs.module.RecsModule_ProvideRecsPhotoViewDuplicateEventCheckerFactory;
import com.tinder.recs.module.RecsModule_ProvideRecsPhotoViewedCacheFactory;
import com.tinder.recs.module.RecsModule_ProvideRewindsAvailableRepositoryFactory;
import com.tinder.recs.module.RecsModule_ProvideSuperLikeRatingStatusNotifierFactory;
import com.tinder.recs.module.RecsModule_ProvideSuperLikeRatingStatusProviderFactory;
import com.tinder.recs.module.RecsModule_ProvideSwipeDataStoreFactory;
import com.tinder.recs.module.RecsModule_ProvideSwipeDispatcherFactoryFactory;
import com.tinder.recs.module.RecsModule_ProvideTopPickResponseDomainApiAdapterFactory;
import com.tinder.recs.module.RecsModule_ProvideTopPicksApiClientFactory;
import com.tinder.recs.module.RecsModule_ProvideTopPicksRecDomainApiAdapterFactory;
import com.tinder.recs.module.RecsModule_ProvideTopPicksRecV2DomainApiAdapterFactory;
import com.tinder.recs.module.RecsModule_ProvideTopPicksSwipeProcessingRulesResolverFactory;
import com.tinder.recs.module.RecsModule_ProvideTopPicksTeaserRecDomainApiAdapterFactory;
import com.tinder.recs.module.RecsModule_RecsSessionTrackerFactory;
import com.tinder.recs.module.RecsModule_RecsSessionTrackerRuleFactory;
import com.tinder.recs.presenter.UserRecCardPresenter;
import com.tinder.recs.presenter.UserRecCardPresenter_Factory;
import com.tinder.recs.provider.RecSourceProvider;
import com.tinder.recs.provider.RecSourceProvider_Factory;
import com.tinder.recs.provider.SuperLikeRatingStatusNotifier;
import com.tinder.recs.provider.SuperLikeRatingStatusProvider;
import com.tinder.recs.provider.SuperLikeRatingStatusProviderAndNotifier;
import com.tinder.recs.provider.SuperLikeRatingStatusProviderAndNotifier_Factory;
import com.tinder.recs.provider.TappyConfigProvider;
import com.tinder.recs.provider.TappyConfigProvider_Factory;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider_Factory;
import com.tinder.recs.rule.AdSwipeTerminationRule;
import com.tinder.recs.rule.AdSwipeTerminationRule_Factory;
import com.tinder.recs.rule.CardStackSwipeProcessingRulesResolver_Factory;
import com.tinder.recs.rule.DupesPreventionRule;
import com.tinder.recs.rule.DupesPreventionRule_Factory;
import com.tinder.recs.rule.FireboardingSuperlikeRule_Factory;
import com.tinder.recs.rule.LocalOutOfLikesBouncerRule;
import com.tinder.recs.rule.LocalOutOfLikesBouncerRule_Factory;
import com.tinder.recs.rule.NativeDfpAdPostSwipeProcessingRule_Factory;
import com.tinder.recs.rule.SuperLikeableGamePlayRule_Factory;
import com.tinder.recs.rule.SwipeCadenceControlRule_Factory;
import com.tinder.recs.rule.SwipeDispatchRule;
import com.tinder.recs.rule.SwipeDispatchRule_Factory;
import com.tinder.recs.rule.TutorialSwipeRule;
import com.tinder.recs.rule.TutorialSwipeRule_Factory;
import com.tinder.recs.rule.UserRecSwipeAnalyticsRule;
import com.tinder.recs.rule.UserRecSwipeAnalyticsRule_Factory;
import com.tinder.recs.usecase.UpdateDiscoverySettings;
import com.tinder.recsads.C18022e;
import com.tinder.recsads.C18025k;
import com.tinder.recsads.RecsAdsMonitor;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import com.tinder.recsads.analytics.C18006a;
import com.tinder.recsads.analytics.C18009i;
import com.tinder.recsads.analytics.C18011m;
import com.tinder.recsads.analytics.C18012o;
import com.tinder.recsads.analytics.C18013q;
import com.tinder.recsads.analytics.CtaBounceBackTimer;
import com.tinder.recsads.model.RecsAdsConfig;
import com.tinder.recsads.p467b.C18016b;
import com.tinder.recsads.rule.C18031b;
import com.tinder.recsads.rule.C18032d;
import com.tinder.scarlet.Lifecycle;
import com.tinder.screenshot.C16559a;
import com.tinder.screenshot.C18047d;
import com.tinder.screenshot.C18048f;
import com.tinder.screenshot.analytics.C16562a;
import com.tinder.screenshot.analytics.C16566d;
import com.tinder.screenshot.analytics.C18045c;
import com.tinder.screenshot.analytics.C18046f;
import com.tinder.screenshotty.C14830c;
import com.tinder.services.C16573c;
import com.tinder.services.C16575e;
import com.tinder.services.GCMRegistrationIntentService;
import com.tinder.services.ProcessingPhotosTaskService;
import com.tinder.session.analytics.C18053b;
import com.tinder.session.analytics.C18054e;
import com.tinder.session.analytics.p402a.C18052b;
import com.tinder.session.p474a.C16576a;
import com.tinder.session.p474a.C18050b;
import com.tinder.session.usecase.C14838f;
import com.tinder.session.usecase.C18055c;
import com.tinder.session.usecase.C18056e;
import com.tinder.session.usecase.C18057h;
import com.tinder.settings.activity.C16611h;
import com.tinder.settings.activity.C16612p;
import com.tinder.settings.activity.GenderSearchActivity;
import com.tinder.settings.activity.SettingsActivity;
import com.tinder.settings.analytics.C16614a;
import com.tinder.settings.data.C16619a;
import com.tinder.settings.data.C16626c;
import com.tinder.settings.data.C18061b;
import com.tinder.settings.data.C18062e;
import com.tinder.settings.feed.analytics.AddSettingsOptionUseCase;
import com.tinder.settings.feed.injection.FeedSettingsActivityComponent;
import com.tinder.settings.feed.presenter.C14874a;
import com.tinder.settings.feed.view.C16639a;
import com.tinder.settings.feed.view.FeedSettingsItemView;
import com.tinder.settings.jobs.C16641a;
import com.tinder.settings.jobs.ReactivateAccountJob;
import com.tinder.settings.loops.injection.AutoPlayLoopsOptionsActivityComponent;
import com.tinder.settings.loops.p407a.C14885d;
import com.tinder.settings.loops.view.AutoPlayVideoSettingsView;
import com.tinder.settings.loops.view.C16649a;
import com.tinder.settings.module.C2656a;
import com.tinder.settings.module.ExitSurveyComponent;
import com.tinder.settings.p404b.C14864a;
import com.tinder.settings.p404b.C14865b;
import com.tinder.settings.p404b.C18059c;
import com.tinder.settings.p405c.C14867d;
import com.tinder.settings.p405c.C18060c;
import com.tinder.settings.presenter.C18074m;
import com.tinder.settings.presenter.C18075n;
import com.tinder.settings.presenter.C18076p;
import com.tinder.settings.presenter.C18077q;
import com.tinder.settings.presenter.bh;
import com.tinder.settings.views.C16693a;
import com.tinder.settings.views.C16694d;
import com.tinder.settings.views.C16695e;
import com.tinder.settings.views.C16696g;
import com.tinder.settings.views.GenderSearchView;
import com.tinder.settings.views.MoreGenderView;
import com.tinder.settings.views.SettingsPurchaseView;
import com.tinder.settings.views.ShowMeView;
import com.tinder.smsauth.sdk.C14987c;
import com.tinder.sponsoredmessage.C15034e;
import com.tinder.sponsoredmessage.p478c.C18147b;
import com.tinder.spotify.activity.C16848b;
import com.tinder.spotify.activity.SpotifyAuthActivity;
import com.tinder.spotify.adapter.SpotifyTrackSearchAdapter;
import com.tinder.spotify.api.AdjustClient;
import com.tinder.spotify.api.SpotifyLogMauApiClient;
import com.tinder.spotify.audio.C18155c;
import com.tinder.spotify.audio.SpotifyAudioPlayer;
import com.tinder.spotify.audio.SpotifyAudioStreamer;
import com.tinder.spotify.p415a.C15035a;
import com.tinder.spotify.p415a.C18154f;
import com.tinder.spotify.p416b.C18157a;
import com.tinder.spotify.p416b.C18159b;
import com.tinder.spotify.p416b.C18161c;
import com.tinder.spotify.p416b.C18162n;
import com.tinder.spotify.p416b.C18163s;
import com.tinder.spotify.p416b.C18167w;
import com.tinder.spotify.p416b.C18170x;
import com.tinder.spotify.repository.SpotifyDataRepository;
import com.tinder.spotify.views.C16876f;
import com.tinder.spotify.views.C16877g;
import com.tinder.spotify.views.C16878h;
import com.tinder.spotify.views.C16879i;
import com.tinder.spotify.views.C16880j;
import com.tinder.spotify.views.C16881l;
import com.tinder.spotify.views.SpotifyConnectView;
import com.tinder.spotify.views.SpotifyPickArtistView;
import com.tinder.spotify.views.SpotifyPlayerView;
import com.tinder.spotify.views.SpotifyThemeSongView;
import com.tinder.spotify.views.SpotifyTopTrackItemView;
import com.tinder.spotify.views.SpotifyTrackSearchView;
import com.tinder.superlike.dialog.C16893e;
import com.tinder.superlike.dialog.SuperlikePaywallDialog;
import com.tinder.superlike.p418a.C15066a;
import com.tinder.superlike.p418a.C18184b;
import com.tinder.superlike.p419b.C15070b;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.superlike.p419b.C18186d;
import com.tinder.superlike.p419b.C18188k;
import com.tinder.superlike.p421e.C15080a;
import com.tinder.superlike.p421e.C15082f;
import com.tinder.superlike.p421e.C18191b;
import com.tinder.superlike.p421e.C18193e;
import com.tinder.superlike.p421e.C18194h;
import com.tinder.superlike.p489d.C18189a;
import com.tinder.superlikeable.C15139b;
import com.tinder.tindergold.p426a.C15183k;
import com.tinder.tindergold.p426a.C16912a;
import com.tinder.tindergold.p426a.C16913b;
import com.tinder.tindergold.p426a.C16914c;
import com.tinder.tindergold.p426a.C16915d;
import com.tinder.tindergold.p426a.C16916e;
import com.tinder.tindergold.p426a.C16917f;
import com.tinder.tindergold.p426a.C16918g;
import com.tinder.tindergold.p426a.C16919h;
import com.tinder.tindergold.p426a.C16920i;
import com.tinder.tindergold.p427b.C15184a;
import com.tinder.tindergold.p481c.C16923a;
import com.tinder.tindergold.view.C16925a;
import com.tinder.tindergold.view.TinderGoldIntroDialog;
import com.tinder.tinderplus.C18213b;
import com.tinder.tinderplus.C2657a;
import com.tinder.tinderplus.activities.ActivityTPlusControl;
import com.tinder.tinderplus.activities.C16930e;
import com.tinder.tinderplus.adapters.C16934c;
import com.tinder.tinderplus.adapters.RecyclerAdapterTPlusControl;
import com.tinder.tinderplus.analytics.AddUserInteractionPlusControlSettingsEvent;
import com.tinder.tinderplus.analytics.C16935a;
import com.tinder.tinderplus.analytics.C16936b;
import com.tinder.tinderplus.analytics.C16937c;
import com.tinder.tinderplus.analytics.C16938d;
import com.tinder.tinderplus.dialog.C16953c;
import com.tinder.tinderplus.dialog.TinderPlusPaywallDialog;
import com.tinder.tinderplus.model.C15219p;
import com.tinder.tinderplus.p428a.C15188a;
import com.tinder.tinderplus.p428a.C15190c;
import com.tinder.tinderplus.p428a.C15191d;
import com.tinder.tinderplus.p428a.C15192e;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.tinderplus.p428a.C18204h;
import com.tinder.tinderplus.p428a.C18206k;
import com.tinder.tinderplus.p429b.C15201k;
import com.tinder.tinderplus.p429b.C18211a;
import com.tinder.tinderplus.provider.C15220b;
import com.tinder.tinderplus.provider.C18219c;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import com.tinder.toppicks.domain.worker.C15253e;
import com.tinder.toppicks.domain.worker.C18227b;
import com.tinder.toppicks.domain.worker.C18228d;
import com.tinder.toppicks.domain.worker.C18229f;
import com.tinder.toppicks.domain.worker.TopPicksWorker;
import com.tinder.toppicks.notifications.C17037a;
import com.tinder.toppicks.notifications.C17041d;
import com.tinder.toppicks.notifications.C17045f;
import com.tinder.toppicks.notifications.C17049j;
import com.tinder.toppicks.notifications.C18234b;
import com.tinder.toppicks.notifications.C18235c;
import com.tinder.toppicks.notifications.C18236e;
import com.tinder.toppicks.notifications.C18237g;
import com.tinder.toppicks.notifications.C18238i;
import com.tinder.toppicks.notifications.C18239o;
import com.tinder.toppicks.notifications.C3947n;
import com.tinder.toppicks.notifications.ScheduleTopPicksNotification;
import com.tinder.toppicks.notifications.TopPicksNotificationDispatcher;
import com.tinder.toppicks.p430a.C16975a;
import com.tinder.toppicks.p431b.C18220b;
import com.tinder.toppicks.p433e.C15254a;
import com.tinder.toppicks.p433e.C18230c;
import com.tinder.toppicks.p484f.C18231b;
import com.tinder.typingindicator.C3948a;
import com.tinder.typingindicator.api.C18246c;
import com.tinder.typingindicator.p440f.C18249b;
import com.tinder.typingindicator.p440f.C18251d;
import com.tinder.typingindicator.p440f.C18253f;
import com.tinder.typingindicator.p440f.C18257k;
import com.tinder.typingindicator.p441g.C18260b;
import com.tinder.typingindicator.p485c.C17160a;
import com.tinder.typingindicator.p485c.C18247b;
import com.tinder.typingindicator.repository.C17165a;
import com.tinder.typingindicator.repository.C17168c;
import com.tinder.typingindicator.repository.C18262b;
import com.tinder.typingindicator.repository.C18263d;
import com.tinder.typingindicator.repository.TypingIndicatorRepository;
import com.tinder.typingindicator.usecase.C17172a;
import com.tinder.typingindicator.usecase.C17174d;
import com.tinder.typingindicator.usecase.C18264c;
import com.tinder.typingindicator.usecase.C18265e;
import com.tinder.typingindicator.worker.C18268b;
import com.tinder.typingindicator.worker.C18269d;
import com.tinder.typingindicator.worker.C18270f;
import com.tinder.typingindicator.worker.TypingIndicatorWorker;
import com.tinder.updates.C18277c;
import com.tinder.updates.C3949b;
import com.tinder.updates.UpdatesScheduler;
import com.tinder.updates.p443a.C18271b;
import com.tinder.updates.p443a.C18272d;
import com.tinder.updates.p443a.C18273f;
import com.tinder.updates.p443a.C18274h;
import com.tinder.updates.p443a.C18275j;
import com.tinder.updates.p443a.C18276l;
import com.tinder.usecase.C17223f;
import com.tinder.usecase.C18278k;
import com.tinder.usecase.C18279n;
import com.tinder.usecase.C3950a;
import com.tinder.usecase.C3951c;
import com.tinder.usecase.C3952i;
import com.tinder.usecase.C3953l;
import com.tinder.util.ConnectivityProvider;
import com.tinder.utils.AppLifeCycleTracker;
import com.tinder.utils.C15377z;
import com.tinder.utils.C17231j;
import com.tinder.utils.C18284c;
import com.tinder.utils.C18286m;
import com.tinder.utils.OkHttpGlideModule;
import com.tinder.video.injection.p448a.C18291b;
import com.tinder.video.injection.p448a.C18292c;
import com.tinder.video.injection.p448a.C18293d;
import com.tinder.video.injection.p448a.C18294e;
import com.tinder.video.injection.p448a.C18295f;
import com.tinder.video.p446c.C15412a;
import com.tinder.video.p446c.C18290b;
import com.tinder.views.C17265y;
import com.tinder.views.MapFrameLayout;
import com.tinder.views.MatchListLayout;
import dagger.internal.C15522k;
import dagger.internal.C17281c;
import dagger.internal.C18316b;
import dagger.internal.C18317d;
import dagger.internal.C18318f;
import dagger.internal.C18320l;
import de.greenrobot.event.C2664c;
import io.paperdb.Book;
import io.reactivex.C15679f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CyclicBarrier;
import javax.inject.Provider;
import okhttp3.C17692o;
import okhttp3.C2670b;
import okhttp3.Interceptor;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.C2671a;

/* renamed from: com.tinder.application.a */
public final class C4423a implements ApplicationComponent {
    /* renamed from: A */
    private FastMatchModule f14648A;
    /* renamed from: B */
    private ew f14649B;
    /* renamed from: C */
    private RetrofitModule_ProvideRetrofitBuilderFactory f14650C;
    /* renamed from: D */
    private Provider<C5987p> f14651D;
    /* renamed from: E */
    private C12451x21aaf741 f14652E;
    /* renamed from: F */
    private Provider<Map<Class<?>, RetrofitErrorBodyAwareTransformer<?>>> f14653F;
    /* renamed from: G */
    private TinderApiModule_ProvideTinderRetrofitApiBuilderFactory f14654G;
    /* renamed from: H */
    private OkHttpModule_ProvideOkHttpClientBuilderFactory f14655H;
    /* renamed from: I */
    private Provider<ManagerApp> f14656I;
    /* renamed from: J */
    private Provider<Application> f14657J;
    /* renamed from: K */
    private OkHttpModule_ProvideHttpCacheFactory f14658K;
    /* renamed from: L */
    private ci f14659L;
    /* renamed from: M */
    private PhotoProfilePhotoAdapter_Factory f14660M;
    /* renamed from: N */
    private InstagramInstagramDataSetAdapter_Factory f14661N;
    /* renamed from: O */
    private SpotifyTrackSearchTrackAdapter_Factory f14662O;
    /* renamed from: P */
    private SpotifyArtistLegacyArtistAdapter_Factory f14663P;
    /* renamed from: Q */
    private CurrentUserLegacyUserAdapter_Factory f14664Q;
    /* renamed from: R */
    private Provider<C11600a> f14665R;
    /* renamed from: S */
    private C12786o f14666S;
    /* renamed from: T */
    private C13079h f14667T;
    /* renamed from: U */
    private C13082p f14668U;
    /* renamed from: V */
    private Provider<ProfileDataStore> f14669V;
    /* renamed from: W */
    private C13081m f14670W;
    /* renamed from: X */
    private Provider<C2644k> f14671X;
    /* renamed from: Y */
    private Provider<C8592c> f14672Y;
    /* renamed from: Z */
    private Provider<AuthExperimentTimelineProvider> f14673Z;
    /* renamed from: a */
    private bs f14674a;
    private Provider<C6229j> aA;
    private Provider<FireworksRepository> aB;
    private Provider<C7330k> aC;
    private Provider<FireworksNetworkClient> aD;
    private Provider<BatchScheduleStrategy> aE;
    private Provider<C15220b> aF;
    private LoadProfileOptionData_Factory aG;
    private C13087t aH;
    private Provider<LikeStatusProvider> aI;
    private dk aJ;
    private Provider<SubscriptionProvider> aK;
    private C13091d aL;
    private C13092f aM;
    private Provider<C15193i> aN;
    private Provider<C2664c> aO;
    private Provider<bj> aP;
    private Provider<C6233k> aQ;
    private Provider<C2634g> aR;
    private Provider<C17692o> aS;
    private Provider<APIHeaderInterceptor> aT;
    private Provider<C17692o> aU;
    private Provider<RxJavaCallAdapterFactory> aV;
    private Provider<Gson> aW;
    private Provider<GsonConverterFactory> aX;
    private Provider<EnvironmentProvider> aY;
    private Provider<AuthService> aZ;
    private Provider<Context> aa;
    private Provider<C2553a> ab;
    private C12605o ac;
    private C12607s ad;
    private C12559g ae;
    private C12811e af;
    private Provider<AbTestUtility> ag;
    private C12793s ah;
    private Provider<CurrentUserProvider> ai;
    private Provider<CurrentUserIdProvider> aj;
    private Provider<bk> ak;
    private Provider<C1798b> al;
    private Provider<ConnectionClassManager> am;
    private Provider<com.tinder.managers.bs> an;
    private fg ao;
    private FastMatchV2NetworkPerfInspector_Factory ap;
    private NetworkPerfModule_ProvideFastMatchV2NetworkPerfInspectorFactory aq;
    private UserProfileNetworkPerfInspector_Factory ar;
    private NetworkPerfModule_ProvideUserProfileNetworkPerfInspectorFactory as;
    private ProfileV2NetworkPerfInspector_Factory at;
    private NetworkPerfModule_ProvideProfileV2NetworkPerfInspectorFactory au;
    private PurchaseNetworkPerfInspector_Factory av;
    private NetworkPerfModule_ProvidePurchaseNetworkPerfInspectorFactory aw;
    private TopPicksV2NetworkPerfInspector_Factory ax;
    private NetworkPerfModule_ProvideTopPicksV2NetworkPerfInspectorFactory ay;
    private Provider<Set<NetworkPerfInspector>> az;
    /* renamed from: b */
    private TopPicksTinderApplicationModule f14675b;
    private Provider<BriteDatabase> bA;
    private Provider<OfferRepository> bB;
    private MaskEmail_Factory bC;
    private C18052b bD;
    private C18054e bE;
    private C18053b bF;
    private dz bG;
    private dy bH;
    private Provider<TinderApi> bI;
    private aa bJ;
    private C13076d bK;
    private Provider<ProfileImageUploader> bL;
    private C17747j bM;
    private C17758b bN;
    private Provider<TinderUserApi> bO;
    private Provider<Book> bP;
    private Provider<MetaStore> bQ;
    private C12966d bR;
    private C12835r bS;
    private C12967f bT;
    private C12865c bU;
    private C12897b bV;
    private Provider<FastMatchConfigProvider> bW;
    private C13347b bX;
    private C13346b bY;
    private Provider<IntroPricingApplicationRepository> bZ;
    private Provider<ErrorResponseConverter> ba;
    private Provider<C2602d> bb;
    private Provider<C2630h> bc;
    private Provider<ManagerAnalytics> bd;
    private Provider<AuthSessionDataStore> be;
    private Provider<AuthSessionRepository> bf;
    private C12581i bg;
    private Provider<com.tinder.analytics.performance.aa> bh;
    private Provider<AuthRepository> bi;
    private Provider<C10698c> bj;
    private C12843b bk;
    private C12606q bl;
    private C12575g bm;
    private C12602r bn;
    private C12576h bo;
    private C12584k bp;
    private Provider<C10326a> bq;
    private Provider<C10350m> br;
    private AuthRequestFactory_Factory bs;
    private Provider<TinderAuthenticator> bt;
    private Provider<C17692o> bu;
    private Provider<HttpStack> bv;
    private Provider<RequestQueue> bw;
    private Provider<ManagerNetwork> bx;
    private Provider<C2657a> by;
    private Provider<C9648e> bz;
    /* renamed from: c */
    private CommonDomainModule f14676c;
    private Provider<C8669a> cA;
    private Provider<C10851a> cB;
    private Provider<MetaGateway> cC;
    private Provider<ManagerProfile> cD;
    private Provider<C7329e> cE;
    private Provider<TelephonyManager> cF;
    private Provider<ConnectivityManager> cG;
    private C13341d cH;
    private Provider<bt> cI;
    private Provider<ManagerFusedLocation> cJ;
    private cd cK;
    private C12604l cL;
    private C8011c cM;
    private Provider<C7322d> cN;
    private Provider<CrmEventTracker> cO;
    private C7999e cP;
    private Provider<C3010d> cQ;
    private C7994f cR;
    private Provider<AttributionTracker> cS;
    private C7996k cT;
    private Provider<C10330a> cU;
    private aj cV;
    private ResponseErrorAdapter_Factory cW;
    private C12842e cX;
    private Provider<NetworkPerfInterceptor> cY;
    private Provider<PlacesTimeoutInterceptor> cZ;
    private CommonDomainModule_ProvideUtcOffsetMins$domain_releaseFactory ca;
    private Provider<C8665a> cb;
    private Provider<FastMatchStatusProvider> cc;
    private C13117b cd;
    private C13116l ce;
    private C18220b cf;
    private C12545o cg;
    private Provider<BitmojiAuthRepository> ch;
    private C12619e ci;
    private bx cj;
    private C12618b ck;
    private Provider<BitmojiImageUrlRepository> cl;
    private C12620g cm;
    private C13168b cn;
    private Provider<PlacesAvailableProvider> co;
    private ej cp;
    private C18234b cq;
    private Provider<TopPicksSettingRepository> cr;
    private TopPicksNotificationsAreEnabled_Factory cs;
    private C18237g ct;
    private C18236e cu;
    private C18239o cv;
    private CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory cw;
    private C18235c cx;
    private C18061b cy;
    private C18062e cz;
    /* renamed from: d */
    private com.tinder.module.bj f14677d;
    private Provider<C14548a> dA;
    private Provider<NotificationManager> dB;
    private Provider<Handler> dC;
    private Provider<NotifyPushServer> dD;
    private Provider<C14551a> dE;
    private Provider<C16270c> dF;
    private Provider<PlacesConfigProvider> dG;
    private C13547b dH;
    private Provider<PaywallRepository> dI;
    private Provider<AuthStatusProvider> dJ;
    private FetchMeta_Factory dK;
    private C13339j dL;
    private ar dM;
    private Provider<C15066a> dN;
    private Provider<C14529b> dO;
    private Provider<C14531b> dP;
    private Provider<C14530a> dQ;
    private Provider<C14484a> dR;
    private Provider<Biller> dS;
    private Provider<PurchaseLogRepository> dT;
    private Provider<ManagerWebServices> dU;
    private Provider<TinderApiClient> dV;
    private Provider<C3945a> dW;
    private Provider<C15082f> dX;
    private Provider<C15080a> dY;
    private C18193e dZ;
    private fd da;
    private C13396m db;
    private Provider<UIManager> dc;
    private Provider<LoginType> dd;
    private Provider<ResponseType> de;
    private Provider<AccountKitConfiguration> df;
    private C12580g dg;
    private Provider<UIManager> dh;
    private Provider<AccountKitConfiguration> di;
    private C12578c dj;
    private C12579f dk;
    private Provider<C16576a> dl;
    private Provider<C2652a> dm;
    private TinderApiModule_ProvideReauthStrategyFactory dn;
    /* renamed from: do */
    private Provider<AuthTokenProvider> f14678do;
    private TinderApiModule_ProvideTinderAuthenticatorFactory dp;
    private TinderApiModule_ProvideTinderHeaderInterceptorBuilderFactory dq;
    private TinderApiModule_ProvideTinderHeaderInterceptorFactory dr;
    private OkHttpModule_ProvideTinderHeaderInterceptorFactory ds;
    private TinderAuthHeaderInterceptor_Factory dt;
    private OkHttpModule_ProvideTinderAuthTokenHeaderInterceptorFactory du;
    private Provider<Set<Interceptor>> dv;
    private RetrofitModule_ProvideRxJava2CallAdapterFactoryFactory dw;
    private Provider<InputMethodManager> dx;
    private Provider<AppVisibilityTracker> dy;
    private C18286m dz;
    /* renamed from: e */
    private C8620d f14679e;
    private Provider<C11608k> eA;
    private Provider<C11612s> eB;
    private Provider<C11609m> eC;
    private Provider<C11604g> eD;
    private Provider<C11611q> eE;
    private Provider<PeriodicTask> eF;
    private Provider<C2544a> eG;
    private C13342j eH;
    private Provider<C11603e> eI;
    private Provider<FireboardingEnabledRepository> eJ;
    private Provider<C11824u> eK;
    private C13176j eL;
    private Provider<C9368a> eM;
    private Provider<UserMetaManager> eN;
    private Provider<bq> eO;
    private bm eP;
    private bp eQ;
    private bo eR;
    private bn eS;
    private Provider<CrashReporter> eT;
    private Provider<SqlBrite> eU;
    private Provider<C8644g> eV;
    private Provider<BriteDatabase> eW;
    private Provider<C8676s> eX;
    private Provider<aq> eY;
    private Provider<LastActivityDateRepository> eZ;
    private C13075b ea;
    private C12970l eb;
    private C13061b ec;
    private C12836t ed;
    private C13068p ee;
    private C13071v ef;
    private C13070t eg;
    private C13080j eh;
    private C13085r ei;
    private SyncProfileData_Factory ej;
    private Provider<C15071e> ek;
    private Provider<BoostProfileFacesRepository> el;
    private Provider<BoostUpdateProvider> em;
    private Provider<BoostStatusRepository> en;
    private Provider<C8349a> eo;
    private Provider<C2639c> ep;
    private C12624n eq;
    private Provider<C14521a> er;
    private C17838d es;
    private Provider<C14522a> et;
    private Provider<C14479a> eu;
    private Provider<C9717h> ev;
    private C13171c ew;
    private C13173d ex;
    private C12643b ey;
    private Provider<C11610o> ez;
    /* renamed from: f */
    private C8266a f14680f;
    private Provider<KeepAliveScarletApi> fA;
    private C13155xa389edd5 fB;
    private C13122f fC;
    private C13127t fD;
    private C18272d fE;
    private C18273f fF;
    private C18274h fG;
    private RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory fH;
    private C18275j fI;
    private C18271b fJ;
    private C18276l fK;
    private fk fL;
    private C13128u fM;
    private Provider<UpdatesScheduler> fN;
    private Provider<ReactionSettingsRepository> fO;
    private Provider<SharedPreferences> fP;
    private Provider<AppRatingRepository> fQ;
    private Provider<Book> fR;
    private Provider<C8638a> fS;
    private C12849b fT;
    private Provider<CrashTimeStampGateway> fU;
    private C12872a fV;
    private Provider<FeedCarouselItemSelectedRepository> fW;
    private Provider<ListItemViewDurationRepository> fX;
    private Provider<FeedRangeRepository> fY;
    private Provider<C11695a> fZ;
    private C12845e fa;
    private C12844b fb;
    private C13129x fc;
    private C12921o fd;
    private C12928r fe;
    private InsertMatches_Factory ff;
    private ae fg;
    private C12957p fh;
    private Provider<ag> fi;
    private C12958s fj;
    private Provider<com.tinder.data.message.aj> fk;
    private com.tinder.data.message.aa fl;
    private Provider<MessageRepository> fm;
    private InsertMessages_Factory fn;
    private com.tinder.data.updates.aj fo;
    private InsertMessageLikes_Factory fp;
    private ah fq;
    private Provider<PollIntervalRepository> fr;
    private C12857f fs;
    private BlockMatches_Factory ft;
    private Provider<C11085z> fu;
    private C13123n fv;
    private C13126s fw;
    private Provider<AuthStatusRepository> fx;
    private Provider<Lifecycle> fy;
    private Provider<C8597m> fz;
    /* renamed from: g */
    private ec f14681g;
    private dn gA;
    private C17884b gB;
    private C17889b gC;
    private C17880b gD;
    private C18238i gE;
    private Provider<C11016j> gF;
    private Provider<CardSizeProvider> gG;
    private Provider<RecsAdditionalDataPrefetcher> gH;
    private Provider<C8776g> gI;
    private Provider<C11811o> gJ;
    private Provider<TutorialSwipeRule> gK;
    private Provider<LocalOutOfLikesBouncerRule> gL;
    private Provider<AdjustClient> gM;
    private Provider<SpotifyLogMauApiClient> gN;
    private Provider<SpotifyDataRepository> gO;
    private C18284c gP;
    private com.tinder.utils.aa gQ;
    private Provider<C15035a> gR;
    private C13541c gS;
    private Provider<CompletedLevelRepository> gT;
    private Provider<C11809n> gU;
    private Provider<LinkedHashMap<Level, Integer>> gV;
    private C12463h gW;
    private C12475t gX;
    private AddRecsRateEvent_Factory gY;
    private Provider<RecsPhotosViewedCache> gZ;
    private C12893m ga;
    private C12892j gb;
    private Provider<FeedRepository> gc;
    private Provider<DraftRepository> gd;
    private Provider<SharedPreferences> ge;
    private Provider<AutoPlayVideoSettingsRepository> gf;
    private Provider<PlacesLoadedStateProvider> gg;
    private Provider<C8747h> gh;
    private de gi;
    private Provider<ConnectivityProvider> gj;
    private C13047f gk;
    private C13051f gl;
    private am gm;
    private ai gn;
    private AgeCalculator_Factory go;
    private Provider<C8736b> gp;
    private Provider<C8151o> gq;
    private Provider<com.tinder.data.adapter.ah> gr;
    private RecsModule_ProvideCoreRecsApiClientFactory gs;
    private Provider<com.tinder.data.adapter.ah> gt;
    private Provider<C11621a> gu;
    private RecsModule_ProvideTopPicksRecV2DomainApiAdapterFactory gv;
    private RecsModule_ProvideTopPicksRecDomainApiAdapterFactory gw;
    private RecsModule_ProvideTopPicksTeaserRecDomainApiAdapterFactory gx;
    private RecsModule_ProvideTopPickResponseDomainApiAdapterFactory gy;
    private Provider<TopPicksLoadingStatusProviderAndNotifier> gz;
    /* renamed from: h */
    private C9707a f14682h;
    private C13502w hA;
    private Provider<AdAggregator> hB;
    private C13481b hC;
    private C13486g hD;
    private C18031b hE;
    private Provider<C8794b> hF;
    private Provider<ap> hG;
    private Provider<C8790a> hH;
    private Provider<SuperLikeableGameApiClient> hI;
    private Provider<SuperLikeableGameRepository> hJ;
    private LoadSuperLikeableGame_Factory hK;
    private C12487d hL;
    private SkipSuperLikeableGame_Factory hM;
    private SuperLikeableGameSwipeTracker_Factory hN;
    private Provider<SuperLikeableGamePlayCoordinator> hO;
    private C8001b hP;
    private SuperLikeableGamePlayRule_Factory hQ;
    private C13487h hR;
    private C18006a hS;
    private C18013q hT;
    private Provider<CtaBounceBackTimer> hU;
    private C18009i hV;
    private AdEventFields_Factory_Factory hW;
    private V1AddAdOpenEvent_Factory hX;
    private Provider<AdSwipeTerminationRule> hY;
    private NativeDfpAdPostSwipeProcessingRule_Factory hZ;
    private Provider<UserRecSwipeAnalyticsRule> ha;
    private Provider<RecsEngineRegistry> hb;
    private Provider hc;
    private Provider<RatingRequestFactory> hd;
    private Provider<RatingResultAdapter> he;
    private Provider<com.tinder.data.match.aj> hf;
    private AddNewMatchEvent_Factory hg;
    private C13100f hh;
    private C13089w hi;
    private Provider<RatingsApiClient> hj;
    private Provider<SwipeDataStore> hk;
    private Provider<Factory> hl;
    private Provider<SwipeDispatchRule> hm;
    private Provider<DupesPreventionRule> hn;
    private C13491l ho;
    private C13495p hp;
    private Provider<C17692o> hq;
    private C13477b hr;
    private C18147b hs;
    private C13503x ht;
    private Provider<Set<TrackingUrlsDecorator>> hu;
    private C13488i hv;
    private Provider<Set<Listener>> hw;
    private Provider<Addy> hx;
    private Provider<com.tinder.addy.AdAggregator> hy;
    private C13496q hz;
    /* renamed from: i */
    private OkHttpModule f14683i;
    private C12820d iA;
    private C12821b iB;
    private Provider<UncaughtExceptionTracker> iC;
    private C17736c iD;
    private C13576k iE;
    private ey iF;
    private Provider<C12425m> iG;
    private C13561k iH;
    private Provider<TinderTracker> iI;
    private ObserveHasNewFeedItems_Factory iJ;
    private ObserveFeed_Factory iK;
    private ObserveCurrentUser_Factory iL;
    private Provider<C8609a> iM;
    private C13279c iN;
    private C13265d iO;
    private C13296f iP;
    private Provider<C9451h> iQ;
    private Provider<FeedPositionRequestProvider> iR;
    private Provider<CyclicBarrier> iS;
    private Provider<CyclicBarrier> iT;
    private Provider<C2671a> iU;
    private Provider<C9453j> iV;
    private Provider<C9455n> iW;
    private Provider<C9450f> iX;
    private Provider<C17160a> iY;
    private C18251d iZ;
    private CreateMessageAdMatch_Factory ia;
    private C13490k ib;
    private Provider<SwipeCountRepository> ic;
    private ac id;
    private Provider<C8549a> ie;
    /* renamed from: if */
    private Provider<C10694a> f14684if;
    private AddRecsSessionEvent_Factory ig;
    private Provider<RecsSessionTracker> ih;
    private RecsModule_RecsSessionTrackerRuleFactory ii;
    private C12470o ij;
    private FireboardingSuperlikeRule_Factory ik;
    private CardStackSwipeProcessingRulesResolver_Factory il;
    private RecsModule_ProvideFastMatchSwipeProcessingRulesResolverFactory im;
    private RecsModule_ProvidePlacesSwipeProcessingRulesResolverFactory in;
    private RecsModule_ProvideTopPicksSwipeProcessingRulesResolverFactory io;
    private Provider<C8157y> ip;
    private RecsModule_ProvideRecsEngineConfiguratorFactoryFactory iq;
    private Provider<PlacesRepository> ir;
    private Provider<C9551g> is;
    private Provider<RecSourceProvider> it;
    private Provider<RecsEngineProvider> iu;
    private Provider<PassportLocationProvider> iv;
    private ObserveDiscoverySettings_Factory iw;
    private Provider<RecsEngineResolver> ix;
    private C8005f iy;
    private C12822d iz;
    /* renamed from: j */
    private ez f14685j;
    private C13090b jA;
    private C12867e jB;
    private C18278k jC;
    private C18279n jD;
    private Provider<RegisterImpl> jE;
    private Provider<Register> jF;
    private Provider<C8259d> jG;
    private Provider<C8264a> jH;
    private C13340b jI;
    private C13078f jJ;
    private C12567b jK;
    private C12570e jL;
    private C12483c jM;
    private C12484d jN;
    private C12494e jO;
    private C12496g jP;
    private C12495f jQ;
    private C8004b jR;
    private C12482b jS;
    private Provider<Set<LoginObserver>> jT;
    private C12591r jU;
    private C12593t jV;
    private C12585n jW;
    private Provider<RequestManager> jX;
    private C18055c jY;
    private C17819b jZ;
    private C18257k ja;
    private C18246c jb;
    private Provider<C17168c> jc;
    private GetMatch_Factory jd;
    private ds je;
    private C18265e jf;
    private C12688c jg;
    private C18264c jh;
    private C13153xad945d7 ji;
    private C18270f jj;
    private C18268b jk;
    private Provider<TypingIndicatorWorker> jl;
    private C17864b jm;
    private C13348b jn;
    private Provider<IntroPricingWorker> jo;
    private Provider<Set<IntroPricingWorker>> jp;
    private Provider<C9733a> jq;
    private C13343n jr;
    private Provider<af> js;
    private Provider<LegacyBreadCrumbTracker> jt;
    private Provider<C8819a> ju;
    private Provider<DeepLinkedSharedRecInterceptor> jv;
    private Provider<ManagerDeepLinking> jw;
    private Provider<C14480k> jx;
    private Provider<C2664c> jy;
    private Provider<C14488a> jz;
    /* renamed from: k */
    private ea f14686k;
    private C18060c kA;
    private Provider<CustomGenderRepository> kB;
    private Provider<C10072h> kC;
    private Provider<C14482a> kD;
    private Provider<C10067d> kE;
    private Provider<SpotifyAudioStreamer> kF;
    private Provider<AudioManager> kG;
    private Provider<SpotifyAudioPlayer> kH;
    private Provider<C8308d> kI;
    private Provider<C9404e> kJ;
    private Provider<com.tinder.managers.bm> kK;
    private Provider<TappyConfigProvider> kL;
    private Provider<RecsPhotoViewDuplicateEventChecker> kM;
    private Provider<RecsAllPhotosViewedDuplicateEventChecker> kN;
    private com.tinder.profile.p363b.ap kO;
    private an kP;
    private UnMatch_Factory kQ;
    private com.tinder.profile.p363b.ah kR;
    private Provider<C10748a> kS;
    private Provider<C9879g> kT;
    private Provider<C8588a> kU;
    private Provider<ThirdPartyLocationUpdatesListener> kV;
    private GetProfileOptionData_Factory kW;
    private CheckTutorialViewed_Factory kX;
    private ConfirmTutorialsViewed_Factory kY;
    private Provider<C10271c> kZ;
    private C17869d ka;
    private C18056e kb;
    private C18048f kc;
    private Provider<C14830c> kd;
    private Provider<C16559a> ke;
    private C18045c kf;
    private Provider<C16566d> kg;
    private cj kh;
    private Provider<DiscoverySegmentRepository> ki;
    private ca kj;
    private C13332b kk;
    private Provider<C8000b> kl;
    private Provider<C14838f> km;
    private Provider<bw> kn;
    private Provider<CallbackManager> ko;
    private Provider<ad> kp;
    private C17834g kq;
    private Provider<C14517l> kr;
    private Provider<C14483c> ks;
    private Provider<Builder> kt;
    private C18204h ku;
    private Provider<C10052b> kv;
    private Provider<bf> kw;
    private Provider<C8260f> kx;
    private aw ky;
    private Provider<C15070b> kz;
    /* renamed from: l */
    private fh f14687l;
    private LegacyAddAdRequestReceiveEvent_Factory lA;
    private V1AnalyticsAdAggregatorListener_Factory lB;
    private C7983xedb30ee4 lC;
    private AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener_Factory lD;
    private C7986xbb8d6348 lE;
    private C13497r lF;
    private Provider<Set<AdAggregator$Listener>> lG;
    private C18012o lH;
    private C18011m lI;
    private AnalyticsAdAggregatorListener_Factory lJ;
    private BrandedProfileCardTrackingUrlsAdAggregatorListener_Factory lK;
    private NativeVideoAndDisplayTrackingUrlAdAggregatorListener_Factory lL;
    private C13485f lM;
    private Provider<Set<com.tinder.addy.AdAggregator.Listener>> lN;
    private Provider<RecsAdsMonitor> lO;
    private C13498s lP;
    private C13493n lQ;
    private C12808d lR;
    private DfpPublisherAdRequestFactory_Factory lS;
    private C13499t lT;
    private C13482c lU;
    private C13505z lV;
    private C13333c lW;
    private Provider<TrackingUrlNotifier> lX;
    private Provider<com.tinder.data.match.an> lY;
    private Provider<TrackingUrlRepository> lZ;
    private C13598l la;
    private C12813i lb;
    private C12815q lc;
    private C13560c ld;
    private Provider<C12421h> le;
    private Provider<com.tinder.analytics.performance.af> lf;
    private Provider<C9695a> lg;
    private C12481z lh;
    private Provider<C9567m> li;
    private C12476u lj;
    private Provider<C11804j> lk;
    private Provider<GameListener> ll;
    private Provider<RewindsAvailableRepository> lm;
    private RecsModule_ProvideIncrementRewindsAvailableFactory ln;
    private C12457b lo;
    private Provider<GameListener> lp;
    private C12478w lq;
    private Provider<GameListener> lr;
    private Provider<Set<GameListener>> ls;
    private Provider<C11800b> lt;
    private C17812d lu;
    private Provider<FireboardingGame> lv;
    private Provider<LifecycleObserver> lw;
    private es lx;
    private Provider<C9703a> ly;
    private LegacyAddAdRequestSendEvent_Factory lz;
    /* renamed from: m */
    private C9940d f14688m;
    private C13074b mA;
    private C13059b mB;
    private C13084e mC;
    private C13083c mD;
    private C13060d mE;
    private ct mF;
    private cv mG;
    private C13557b mH;
    private C13550b mI;
    private Provider<C15139b> mJ;
    private Provider<TopPicksSessionRepository> mK;
    private Provider<SuperLikeRatingStatusProviderAndNotifier> mL;
    private Provider<SuperLikeRatingStatusProvider> mM;
    private Provider<SuperLikeRatingStatusNotifier> mN;
    private ResetTopPickSession_Factory mO;
    private ObserveTopPicksSession_Factory mP;
    private ObserveTopPicksScreenState_Factory mQ;
    private ResetScreenState_Factory mR;
    private C18231b mS;
    private C18227b mT;
    private C18228d mU;
    private Provider<Set<TopPicksWorker>> mV;
    private Provider<C15253e> mW;
    private Provider<C15254a> mX;
    private Provider<DataSource.Factory> mY;
    private C18293d mZ;
    private Provider<C9876b> ma;
    private Provider<C14458a> mb;
    private C13156x9c0cf4b0 mc;
    private Provider<C9423b> md;
    private Provider<RatingProcessor> me;
    private C12626f mf;
    private C12625b mg;
    private C12459d mh;
    private C12477v mi;
    private C12479x mj;
    private com.tinder.profile.p363b.aa mk;
    private C17754l ml;
    private al mm;
    private RecsModule_ProvideDescrementRewindsAvailableFactory mn;
    private RecsModule_ProvideObserveRewindsAvailableFactory mo;
    private Provider<UserRecActivePhotoIndexProvider> mp;
    private AddRecsViewEvent_Factory mq;
    private Provider<UserRecCardPresenter> mr;
    private Provider<C9673c> ms;
    private SetDiscoverability_Factory mt;
    private C13417c mu;
    private C13418d mv;
    private C13419e mw;
    private C13416b mx;
    private Provider<C9454k> my;
    private Provider<C9462a> mz;
    /* renamed from: n */
    private com.tinder.module.aa f14689n;
    private C18291b na;
    private C18294e nb;
    private C18295f nc;
    private Provider<C15412a> nd;
    private C12848c ne;
    private Provider<ConnectivityRepository> nf;
    private C12905b ng;
    private Provider<C10789c> nh;
    private C12809b ni;
    private Provider<GiphyApi> nj;
    private C12899f nk;
    private C12900i nl;
    private C12898c nm;
    private Provider<GifApiClient> nn;
    private Provider<C17165a> no;
    private Provider<PlacesConfigExpansionProvider> np;
    private Provider<PlacesOnboardingProgressProvider> nq;
    private Provider<C12412a> nr;
    /* renamed from: o */
    private RxSchedulersModule f14690o;
    /* renamed from: p */
    private au f14691p;
    /* renamed from: q */
    private PurchaseModule f14692q;
    /* renamed from: r */
    private RetrofitModule f14693r;
    /* renamed from: s */
    private C9850a f14694s;
    /* renamed from: t */
    private TinderApiModule f14695t;
    /* renamed from: u */
    private NetworkModule f14696u;
    /* renamed from: v */
    private ImageNetworkModule f14697v;
    /* renamed from: w */
    private C9939a f14698w;
    /* renamed from: x */
    private C8245a f14699x;
    /* renamed from: y */
    private ManagerApp f14700y;
    /* renamed from: z */
    private C8698t f14701z;

    public void inject(InstanceIDListenerService instanceIDListenerService) {
    }

    public void inject(C2634g c2634g) {
    }

    public void inject(C10400d c10400d) {
    }

    public void inject(C12628f c12628f) {
    }

    public void inject(C9648e c9648e) {
    }

    public void inject(C9715f c9715f) {
    }

    public void inject(SparksEvent sparksEvent) {
    }

    public void inject(C10090l c10090l) {
    }

    public void inject(C13558c c13558c) {
    }

    public void inject(PresenterDialogIsTween presenterDialogIsTween) {
    }

    public void inject(com.tinder.presenters.bf bfVar) {
    }

    public void inject(df dfVar) {
    }

    public void inject(C14426e c14426e) {
    }

    public void inject(InAppNotificationView inAppNotificationView) {
    }

    public void inject(C14865b c14865b) {
    }

    public void inject(C18077q c18077q) {
    }

    public void inject(SpotifyTrackSearchAdapter spotifyTrackSearchAdapter) {
    }

    public void inject(C18159b c18159b) {
    }

    public void inject(C18161c c18161c) {
    }

    public void inject(C18167w c18167w) {
    }

    public void inject(C15190c c15190c) {
    }

    public void inject(C15193i c15193i) {
    }

    public void inject(C18211a c18211a) {
    }

    public void inject(com.tinder.utils.ap apVar) {
    }

    public void inject(MatchListLayout matchListLayout) {
    }

    private C4423a(a$c a_c) {
        m18326a(a_c);
        m18329b(a_c);
        m18332c(a_c);
        m18335d(a_c);
        m18340e(a_c);
        m18343f(a_c);
        m18346g(a_c);
        m18349h(a_c);
    }

    /* renamed from: a */
    public static ApplicationComponent.Builder m18249a() {
        return new a$c(null);
    }

    /* renamed from: b */
    private C10926a m18327b() {
        return new C10926a(loadProfileOptionData());
    }

    /* renamed from: c */
    private C10746z m18330c() {
        return new C10746z(new ab(), new com.tinder.data.adapter.ad());
    }

    /* renamed from: d */
    private C8750a m18333d() {
        return new C8750a((TinderUserApi) this.bO.get(), m18330c(), new C8617w());
    }

    /* renamed from: e */
    private C8767d m18338e() {
        return new C8767d((ProfileDataStore) this.f14669V.get());
    }

    /* renamed from: f */
    private C10961b m18341f() {
        return new C10961b(m18338e());
    }

    /* renamed from: g */
    private C10912c m18345g() {
        return new C10912c(m18327b(), m18333d(), m18341f(), (ProfileImageUploader) this.bL.get(), loadProfileOptionData());
    }

    /* renamed from: h */
    private C10672a m18347h() {
        return new C10672a((Context) this.aa.get());
    }

    /* renamed from: i */
    private C8759d m18350i() {
        return new C8759d((TinderUserApi) this.bO.get());
    }

    /* renamed from: j */
    private C10984x m18352j() {
        return new C10984x(m18350i(), (ProfileDataStore) this.f14669V.get());
    }

    /* renamed from: k */
    private C16266a m18354k() {
        return new C16266a((Context) this.aa.get(), (NotificationManager) this.dB.get());
    }

    /* renamed from: l */
    private C14574a m18356l() {
        return new C14574a((NotificationManager) this.dB.get());
    }

    /* renamed from: m */
    private C14550a m18358m() {
        return new C14550a((AppVisibilityTracker) this.dy.get(), m18354k(), (C16270c) this.dF.get(), (C2630h) this.bc.get(), m18356l(), (PlacesConfigProvider) this.dG.get());
    }

    /* renamed from: n */
    private SharedPreferences m18360n() {
        return C12843b.a((Application) this.f14657J.get());
    }

    /* renamed from: o */
    private C10780a m18362o() {
        return new C10780a(m18360n());
    }

    /* renamed from: p */
    private TopPicksNotificationsAreEnabled m18364p() {
        return new TopPicksNotificationsAreEnabled(m18362o(), topPicksConfig());
    }

    /* renamed from: q */
    private C17049j m18366q() {
        return new C17049j((C14548a) this.dA.get(), m18358m(), topPicksConfig(), m18364p());
    }

    /* renamed from: r */
    private C8798a m18368r() {
        return new C8798a(m18360n());
    }

    /* renamed from: s */
    private C11017k m18370s() {
        return new C11017k(m18368r(), m18362o());
    }

    /* renamed from: t */
    private C8753a m18372t() {
        return new C8753a((TinderUserApi) this.bO.get(), new C10915e());
    }

    /* renamed from: u */
    private com.tinder.data.adapter.aq m18374u() {
        return new com.tinder.data.adapter.aq(new C10738l());
    }

    /* renamed from: v */
    private C10848k m18376v() {
        return new C10848k(new C10738l());
    }

    /* renamed from: w */
    private C10742q m18378w() {
        return new C10742q(new C10738l());
    }

    /* renamed from: x */
    private C10913a m18380x() {
        return new C10913a(new C10738l(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(this.f14676c));
    }

    /* renamed from: y */
    private C10844c m18382y() {
        return new C10844c(new C10735f(), new C10738l(), m18330c(), C12828b.d(), C12829c.d());
    }

    /* renamed from: z */
    private C10743s m18384z() {
        return new C10743s(new C10738l());
    }

    /* renamed from: A */
    private C10919o m18184A() {
        return new C10919o(m18384z());
    }

    /* renamed from: B */
    private C10922u m18186B() {
        return new C10922u(new C10923w());
    }

    /* renamed from: C */
    private C10921s m18188C() {
        return new C10921s(m18186B());
    }

    /* renamed from: D */
    private C8761i m18190D() {
        TinderApi tinderApi = (TinderApi) this.bI.get();
        C8753a t = m18372t();
        C10849m c10849m = new C10849m();
        com.tinder.data.adapter.aq u = m18374u();
        com.tinder.data.profile.adapter.ag agVar = new com.tinder.data.profile.adapter.ag();
        com.tinder.data.profile.adapter.aq aqVar = new com.tinder.data.profile.adapter.aq();
        C10924y c10924y = new C10924y();
        C10915e c10915e = new C10915e();
        com.tinder.data.profile.adapter.aa aaVar = new com.tinder.data.profile.adapter.aa();
        C10920q c10920q = new C10920q();
        C10843a c10843a = new C10843a();
        C10848k v = m18376v();
        C10742q w = m18378w();
        C10846g c10846g = new C10846g();
        C8754g c8754g = new C8754g();
        C10913a x = m18380x();
        C10846g c10846g2 = c10846g;
        as asVar = new as();
        com.tinder.data.profile.adapter.am amVar = new com.tinder.data.profile.adapter.am();
        C10914c c10914c = new C10914c();
        C10844c y = m18382y();
        C10914c c10914c2 = c10914c;
        C10917k c10917k = new C10917k();
        C10919o A = m18184A();
        C10917k c10917k2 = c10917k;
        ao aoVar = new ao();
        C10918m c10918m = new C10918m();
        as asVar2 = asVar;
        C10916i c10916i = new C10916i();
        return new C8761i(tinderApi, t, c10849m, u, agVar, aqVar, c10924y, c10915e, aaVar, c10920q, c10843a, v, w, c10846g2, c8754g, x, asVar2, amVar, c10914c2, y, c10917k2, A, aoVar, c10918m, c10916i, m18188C());
    }

    /* renamed from: E */
    private C10975q m18192E() {
        return new C10975q(m18190D(), (ProfileDataStore) this.f14669V.get(), new TutorialToOnboardingTutorialNameAdapter());
    }

    /* renamed from: F */
    private C10353p m18194F() {
        return new C10353p(m18360n());
    }

    /* renamed from: G */
    private SharedPreferences m18196G() {
        return ci.a(this.f14674a, (Application) this.f14657J.get());
    }

    /* renamed from: H */
    private AuthLedgerRepository m18198H() {
        return C12575g.a(this.f14680f, m18196G());
    }

    /* renamed from: I */
    private C8274f m18200I() {
        return C12602r.a(this.f14680f, m18198H());
    }

    /* renamed from: J */
    private AuthObserver m18202J() {
        return C12576h.a(this.f14680f, m18200I());
    }

    /* renamed from: K */
    private C8279j m18204K() {
        return new C8279j((AuthRepository) this.bi.get(), (C10698c) this.bj.get(), (bk) this.ak.get(), m18194F(), m18202J());
    }

    /* renamed from: L */
    private C10376d m18206L() {
        return new C10376d((BitmojiAuthRepository) this.ch.get());
    }

    /* renamed from: M */
    private C10377f m18208M() {
        return new C10377f((BitmojiImageUrlRepository) this.cl.get());
    }

    /* renamed from: N */
    private C9363a m18210N() {
        return new C9363a((C15193i) this.aN.get(), (bk) this.ak.get(), (C2634g) this.aR.get(), (FastMatchConfigProvider) this.bW.get(), (FastMatchStatusProvider) this.cc.get(), topPicksConfig(), m18204K(), m18206L(), m18208M());
    }

    /* renamed from: O */
    private FirebaseJobDispatcher m18212O() {
        return ej.a(this.f14681g, (Application) this.f14657J.get());
    }

    /* renamed from: P */
    private C17037a m18215P() {
        return new C17037a(m18212O());
    }

    /* renamed from: Q */
    private C17045f m18217Q() {
        return new C17045f((C2630h) this.bc.get());
    }

    /* renamed from: R */
    private C17041d m18218R() {
        return new C17041d((C2630h) this.bc.get());
    }

    /* renamed from: S */
    private C3947n m18221S() {
        return new C3947n(m18215P(), m18370s(), m18218R());
    }

    /* renamed from: T */
    private ScheduleTopPicksNotification m18223T() {
        return new ScheduleTopPicksNotification(m18215P(), m18370s(), (TopPicksSettingRepository) this.cr.get(), m18364p(), topPicksConfig(), m18217Q(), m18221S(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(this.f14676c));
    }

    /* renamed from: U */
    private C16619a m18225U() {
        return new C16619a(m18223T(), m18221S());
    }

    /* renamed from: V */
    private C16626c m18226V() {
        return new C16626c(m18362o(), (C8665a) this.cb.get(), (TinderApi) this.bI.get(), new C8663a(), (FastMatchConfigProvider) this.bW.get(), m18210N(), topPicksConfig(), (PlacesAvailableProvider) this.co.get(), m18225U());
    }

    /* renamed from: W */
    private C10951l m18228W() {
        return new C10951l((ProfileDataStore) this.f14669V.get());
    }

    /* renamed from: X */
    private GetProfileOptionData m18230X() {
        return new GetProfileOptionData(m18228W());
    }

    /* renamed from: Y */
    private CheckTutorialViewed m18232Y() {
        return new CheckTutorialViewed(m18230X(), new OnboardingTutorialAdapter());
    }

    /* renamed from: Z */
    private ConfirmTutorialsViewed m18235Z() {
        return new ConfirmTutorialsViewed(m18232Y(), m18192E());
    }

    private C2670b aa() {
        return OkHttpModule_ProvideHttpCacheFactory.proxyProvideHttpCache(this.f14683i, (Application) this.f14657J.get());
    }

    private C10654a ab() {
        return fi.a(this.f14687l, (CrashReporter) this.eT.get());
    }

    private LoggingInitializer ac() {
        return fa.a(this.f14685j, eb.b(this.f14686k), ab());
    }

    private C8674m ad() {
        return new C8674m((TinderApi) this.bI.get(), new C10799v());
    }

    private C10798q ae() {
        return new C10798q((C8676s) this.eX.get(), ad(), (UnMatchNotifier) this.eY.get());
    }

    private DeleteAllMatches af() {
        return new DeleteAllMatches(ae());
    }

    private C3949b ag() {
        return C18277c.a((UpdatesScheduler) this.fN.get(), (C2652a) this.dm.get());
    }

    private C3950a ah() {
        return new C3950a((CurrentUserProvider) this.ai.get(), (CurrentUserIdProvider) this.aj.get(), (MetaGateway) this.cC.get());
    }

    private ClearAllPlaces ai() {
        return new ClearAllPlaces((PlacesLoadedStateProvider) this.gg.get(), (PlacesRepository) this.ir.get());
    }

    private ClearSharedPreferences aj() {
        return new ClearSharedPreferences(m18360n());
    }

    private DeleteUserData ak() {
        return new DeleteUserData((MetaGateway) this.cC.get(), (LastActivityDateRepository) this.eZ.get(), (ReactionSettingsRepository) this.fO.get(), (AppRatingRepository) this.fQ.get(), (CrashTimeStampGateway) this.fU.get(), (FeedRepository) this.gc.get(), m18228W(), (DraftRepository) this.gd.get(), (AutoPlayVideoSettingsRepository) this.gf.get(), ai(), (PlacesConfigProvider) this.dG.get(), aj());
    }

    private C3929a al() {
        return new C3929a((C9551g) this.is.get());
    }

    private C3953l am() {
        return new C3953l((AbTestUtility) this.ag.get(), m18212O());
    }

    private C3951c an() {
        return new C3951c(C13505z.c(this.f14688m));
    }

    private CleanUpPendingMessages ao() {
        return new CleanUpPendingMessages((MessageRepository) this.fm.get(), C12842e.c(this.f14679e));
    }

    private C3920a ap() {
        return new C3920a((AppRatingRepository) this.fQ.get(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(this.f14676c));
    }

    private Screen aq() {
        return com.tinder.module.ah.a(this.f14689n, (C11695a) this.fZ.get());
    }

    private C9458s ar() {
        return new C9458s((C9450f) this.iX.get(), (CurrentScreenTracker) this.f14684if.get(), aq());
    }

    private C11691f as() {
        return new C11691f((C2630h) this.bc.get());
    }

    private C9441a at() {
        return new C9441a((C9450f) this.iX.get(), as(), (CurrentScreenTracker) this.f14684if.get(), aq());
    }

    private C3952i au() {
        return new C3952i(ar(), at(), (C11695a) this.fZ.get());
    }

    private C7319e av() {
        return new C7319e((C2630h) this.bc.get());
    }

    private C3918c aw() {
        return new C3918c((C2652a) this.dm.get(), C13153xad945d7.proxyProvideCurrentDateTimeMillis$domain_release(this.f14676c), av());
    }

    private C0282c ax() {
        return cl.a(this.f14674a, (Application) this.f14657J.get());
    }

    private C3948a ay() {
        return new C3948a((TypingIndicatorWorker) this.jl.get(), (C2652a) this.dm.get());
    }

    private C3930b az() {
        return new C3930b((AbTestUtility) this.ag.get(), (C9733a) this.jq.get());
    }

    private C3931c aA() {
        return new C3931c((AbTestUtility) this.ag.get(), (C9733a) this.jq.get());
    }

    private C3922i aB() {
        return new C3922i((BitmojiAuthRepository) this.ch.get(), (BitmojiImageUrlRepository) this.cl.get());
    }

    private BucketsService aC() {
        return C12597m.a(this.f14680f, (C17692o) this.aS.get(), (EnvironmentProvider) this.aY.get());
    }

    private C8630c aD() {
        return new C8630c(aC(), new C8627a());
    }

    private C8634g aE() {
        return new C8634g(m18360n(), new C8627a());
    }

    private C10758e aF() {
        return new C10758e(aD(), aE());
    }

    private C10351n aG() {
        return C12605o.a((C2553a) this.ab.get());
    }

    private UniqueIdFactory aH() {
        return C12607s.a(this.f14680f, aG());
    }

    private FetchBuckets aI() {
        return new FetchBuckets(aF(), aH());
    }

    private BucketsWorker aJ() {
        return new BucketsWorker(aI(), C12842e.c(this.f14679e), C13332b.c(this.f14682h));
    }

    private C10333h aK() {
        return new C10333h((ManagerAnalytics) this.bd.get(), (AbTestUtility) this.ag.get(), (AuthSessionRepository) this.bf.get(), (bk) this.ak.get());
    }

    private C17741b aL() {
        return C17743c.a(aK());
    }

    private C8280l aM() {
        return C12585n.a((C2652a) this.dm.get(), aK(), (UpdatesScheduler) this.fN.get(), (TypingIndicatorWorker) this.jl.get());
    }

    private C15192e aN() {
        return new C15192e((TinderApiClient) this.dV.get(), (C15193i) this.aN.get(), (bk) this.ak.get(), (C2630h) this.bc.get(), (OfferRepository) this.bB.get(), (C14522a) this.et.get(), (C14480k) this.jx.get(), (AbTestUtility) this.ag.get());
    }

    private C13548a aO() {
        return new C13548a(aN(), (OfferRepository) this.bB.get());
    }

    private C9743a aP() {
        return new C9743a(resources());
    }

    private GetCurrentUser aQ() {
        return new GetCurrentUser((MetaGateway) this.cC.get());
    }

    private C9861g aR() {
        return new C9861g((NewMatchProvider) this.hf.get(), aP(), aQ());
    }

    private C10314b aS() {
        return new C10314b((AppRatingRepository) this.fQ.get(), (AbTestUtility) this.ag.get(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(this.f14676c));
    }

    private C14354a aT() {
        return new C14354a((C8264a) this.jH.get(), aS());
    }

    private InAppNotificationsPresenter aU() {
        return new InAppNotificationsPresenter((C14551a) this.dE.get(), C13156x9c0cf4b0.proxyProvidesRxJava1ComputationScheduler$domain_release(this.f14690o), C13334d.b(this.f14682h));
    }

    private FacebookManager aV() {
        return new FacebookManager((ManagerNetwork) this.bx.get(), (C10350m) this.br.get());
    }

    private C15190c aW() {
        return new C15190c((ManagerNetwork) this.bx.get(), (C3945a) this.dW.get(), (C15193i) this.aN.get());
    }

    private C15191d aX() {
        return new C15191d((ManagerProfile) this.cD.get(), (bj) this.aP.get(), (ManagerAnalytics) this.bd.get());
    }

    private C10400d aY() {
        return new C10400d((TinderApiClient) this.dV.get(), (bk) this.ak.get(), (BoostProfileFacesRepository) this.el.get(), (BoostUpdateProvider) this.em.get(), (C2639c) this.ep.get(), (BoostStatusRepository) this.en.get(), (C8349a) this.eo.get());
    }

    private C15188a aZ() {
        return new C15188a((C15220b) this.aF.get(), aY(), (C15071e) this.ek.get());
    }

    private BillerVersionCodeProvider ba() {
        return aw.a(this.f14691p, (RegisterImpl) this.jE.get());
    }

    private C15219p bb() {
        return new C15219p((LikeStatusProvider) this.aI.get(), (bk) this.ak.get(), aN(), (OfferRepository) this.bB.get(), (C15071e) this.ek.get(), (C15193i) this.aN.get(), aZ(), ba());
    }

    private AddUserInteractionPlusControlSettingsEvent bc() {
        return new AddUserInteractionPlusControlSettingsEvent((C2630h) this.bc.get());
    }

    private SavePlusControlSettings bd() {
        return new SavePlusControlSettings(loadProfileOptionData(), m18192E());
    }

    private C18211a be() {
        return new C18211a(aW(), aX(), (C15193i) this.aN.get(), aZ(), bb(), (C2630h) this.bc.get(), (FastMatchConfigProvider) this.bW.get(), (SubscriptionProvider) this.aK.get(), (AbTestUtility) this.ag.get(), bc(), bd(), loadProfileOptionData(), (bk) this.ak.get());
    }

    private C14865b bf() {
        return C18059c.a((bj) this.aP.get(), (C2652a) this.dm.get());
    }

    private UpdateDiscoverySettings bg() {
        return new UpdateDiscoverySettings((ManagerProfile) this.cD.get());
    }

    private C14541j bh() {
        return C17832e.a(this.f14692q, (Register) this.jF.get(), (C14517l) this.kr.get(), (C14483c) this.ks.get());
    }

    private C10331c bi() {
        return new C10331c((TinderApi) this.bI.get(), m18194F());
    }

    private C8646a bj() {
        return new C8646a(m18360n());
    }

    private C10765a bk() {
        return new C10765a((TinderApi) this.bI.get(), bj());
    }

    private UnregisterPushToken bl() {
        return new UnregisterPushToken(bk());
    }

    private C3924c bm() {
        return new C3924c((C2630h) this.bc.get());
    }

    private C16938d bn() {
        return new C16938d((C2630h) this.bc.get(), bb());
    }

    private C15183k bo() {
        return new C15183k((OfferRepository) this.bB.get(), ba(), (SubscriptionProvider) this.aK.get(), (FastMatchStatusProvider) this.cc.get());
    }

    private C16920i bp() {
        return new C16920i((C2630h) this.bc.get(), bo());
    }

    private ObserveRecsEngineLoadingStatuses bq() {
        return new ObserveRecsEngineLoadingStatuses((RecsEngineRegistry) this.hb.get());
    }

    private C16614a br() {
        return new C16614a((C2630h) this.bc.get());
    }

    private C18077q bs() {
        return new C18077q(bf(), bg(), (ManagerAnalytics) this.bd.get(), aY(), (AbTestUtility) this.ag.get(), (C15071e) this.ek.get(), (C15193i) this.aN.get(), (OfferRepository) this.bB.get(), aK(), aV(), m18204K(), bh(), (FastMatchConfigProvider) this.bW.get(), bi(), bl(), (C2652a) this.dm.get(), (C14522a) this.et.get(), (C8665a) this.cb.get(), (AppRatingRepository) this.fQ.get(), bm(), bn(), bp(), loadProfileOptionData(), bq(), br(), (PlacesAvailableProvider) this.co.get());
    }

    private C14412a bt() {
        return new C14412a(resources());
    }

    private C8757b bu() {
        return new C8757b((TinderUserApi) this.bO.get(), C12828b.d(), new at());
    }

    private C10979b bv() {
        return new C10979b(m18228W(), bu(), m18338e());
    }

    private UpdateJob bw() {
        return new UpdateJob(bv());
    }

    private C14431r bx() {
        return new C14431r(new C9716g(), bt(), bv(), bw(), (ManagerAnalytics) this.bd.get());
    }

    private C8758c by() {
        return new C8758c((TinderUserApi) this.bO.get(), C12829c.d());
    }

    private C10981c bz() {
        return new C10981c(m18228W(), by(), m18338e());
    }

    private UpdateSchool bA() {
        return new UpdateSchool(bz());
    }

    private C14414a bB() {
        return new C14414a(resources());
    }

    private com.tinder.profile.presenter.bf bC() {
        return new com.tinder.profile.presenter.bf(bz(), bA(), bB(), (ManagerAnalytics) this.bd.get());
    }

    private C18157a bD() {
        return new C18157a((C15035a) this.gR.get(), (Builder) this.kt.get());
    }

    private UpdateProfile bE() {
        return new UpdateProfile(m18228W(), m18192E());
    }

    private C18074m bF() {
        return new C18074m(bE());
    }

    private UpdateAccountPasswordLastShownDateProvider bG() {
        return C12609u.a(this.f14680f, (bk) this.ak.get());
    }

    private AccountService bH() {
        return C12573e.a(this.f14680f, RetrofitModule_ProvideRetrofitBuilderFactory.proxyProvideRetrofitBuilder(this.f14693r), (C17692o) this.aU.get(), (RxJavaCallAdapterFactory) this.aV.get(), (GsonConverterFactory) this.aX.get(), (EnvironmentProvider) this.aY.get());
    }

    private UpdateAccountDataStore bI() {
        return C12608t.a(this.f14680f, bH(), (ErrorResponseConverter) this.ba.get());
    }

    private C3876a bJ() {
        return new C3876a(bI());
    }

    private C3877b bK() {
        return new C3877b(bI());
    }

    private C2637a bL() {
        return new C2637a((ManagerAnalytics) this.bd.get());
    }

    private C4298a bM() {
        return C4299o.m17289a(bG(), new C8550g(), bJ(), bK(), (UserMetaManager) this.eN.get(), bL());
    }

    private SMSUpdateJob bN() {
        return new SMSUpdateJob(bv());
    }

    private SMSUpdateSchool bO() {
        return new SMSUpdateSchool(bz());
    }

    private NewPhotoGridExperiment bP() {
        return cz.a(this.f14674a, (AbTestUtility) this.ag.get());
    }

    private C17744d bQ() {
        return new C17744d((C15035a) this.gR.get(), (AbTestUtility) this.ag.get(), (ManagerProfile) this.cD.get(), (UserMetaManager) this.eN.get(), (C2630h) this.bc.get(), m18204K(), (C2634g) this.aR.get(), bN(), bE(), bO(), bd(), loadProfileOptionData(), (C15193i) this.aN.get(), (bk) this.ak.get(), bz(), bv(), bc(), bP(), (CurrentScreenNotifier) this.f14684if.get());
    }

    private C15377z bR() {
        return new C15377z((Context) this.aa.get());
    }

    private C8756a bS() {
        return new C8756a((TinderApi) this.bI.get(), m18378w());
    }

    private C10977a bT() {
        return new C10977a(bS(), (ProfileDataStore) this.f14669V.get());
    }

    private ConnectInstagram bU() {
        return new ConnectInstagram(bT());
    }

    private DisconnectInstagram bV() {
        return new DisconnectInstagram(bT());
    }

    private com.tinder.presenters.bf bW() {
        return new com.tinder.presenters.bf(m18230X(), (C2630h) this.bc.get(), bU(), bV());
    }

    private C17223f bX() {
        return new C17223f((C17692o) this.aS.get(), OkHttpModule_ProvideRequestBuilderFactory.proxyProvideRequestBuilder(this.f14683i));
    }

    private C13345b bY() {
        return new C13345b(aK(), (AbTestUtility) this.ag.get());
    }

    private Object bZ() {
        return C12565d.a(C12566g.c());
    }

    private C10057a ca() {
        return new C10057a(resources());
    }

    private C10046a cb() {
        return new C10046a((Application) this.f14657J.get());
    }

    private C9420a cc() {
        return new C9420a(resources());
    }

    private C10049c cd() {
        return new C10049c(ca(), (C15071e) this.ek.get(), aY(), cb(), resources(), cc());
    }

    private C10047a ce() {
        return new C10047a(cd());
    }

    private C10094p cf() {
        return new C10094p(aN(), aY());
    }

    private C15201k cg() {
        return new C15201k(aN(), (OfferRepository) this.bB.get(), (C15193i) this.aN.get(), bb(), (C2630h) this.bc.get(), ce(), cf());
    }

    private C10089j ch() {
        return C13554k.a(resources());
    }

    private C14490a ci() {
        return new C14490a(new C14489a());
    }

    private C10091m cj() {
        return new C10091m((C10052b) this.kv.get(), ch(), aN(), ci(), resources());
    }

    private C10084g ck() {
        return new C10084g(cj(), resources());
    }

    private C9715f cl() {
        return new C9715f(aV(), (C2652a) this.dm.get(), (ManagerNetwork) this.bx.get(), new ResponseCodeRequest.Factory());
    }

    private PresenterDialogIsTween cm() {
        return new PresenterDialogIsTween(cl());
    }

    private CountMatches cn() {
        return C13416b.a(this.f14694s, ae());
    }

    private C16562a co() {
        return new C16562a((C2630h) this.bc.get());
    }

    private C9862h cp() {
        return new C9862h((C2630h) this.bc.get(), cn(), (C8259d) this.jG.get(), (FastMatchConfigProvider) this.bW.get(), (SubscriptionProvider) this.aK.get(), (C8264a) this.jH.get(), topPicksConfig(), (CurrentScreenNotifier) this.f14684if.get(), (C14830c) this.kd.get(), co());
    }

    private C8406b cq() {
        return new C8406b((AbTestUtility) this.ag.get());
    }

    private C8337b cr() {
        return new C8337b((C2630h) this.bc.get(), (C15193i) this.aN.get(), aY(), (OfferRepository) this.bB.get(), ba());
    }

    private C10403e cs() {
        return new C10403e(m18232Y(), (bk) this.ak.get());
    }

    private C12628f ct() {
        return new C12628f((C15193i) this.aN.get(), aY(), ca(), (OfferRepository) this.bB.get(), cr(), (C2639c) this.ep.get(), cs(), m18235Z(), (bk) this.ak.get());
    }

    private C12629r cu() {
        return new C12629r((C15193i) this.aN.get(), aY(), ca(), cr(), (C2639c) this.ep.get());
    }

    private C12633s cv() {
        return new C12633s(aY(), (BoostUpdateProvider) this.em.get(), (C15193i) this.aN.get(), ca(), cr(), (C2639c) this.ep.get());
    }

    private C18189a cw() {
        return new C18189a((C15193i) this.aN.get(), (C15071e) this.ek.get(), (C15070b) this.kz.get(), ca(), (OfferRepository) this.bB.get());
    }

    private RegisterPushToken cx() {
        return new RegisterPushToken(bk());
    }

    private C18159b cy() {
        return new C18159b((ManagerProfile) this.cD.get());
    }

    private C18161c cz() {
        return new C18161c((C15035a) this.gR.get(), (ManagerAnalytics) this.bd.get());
    }

    private C18163s cA() {
        return new C18163s((C15035a) this.gR.get());
    }

    private C18170x cB() {
        return new C18170x((C15035a) this.gR.get());
    }

    private C18167w cC() {
        return new C18167w((C15035a) this.gR.get());
    }

    private C8276b cD() {
        return new C8276b((AccountKitConfiguration) this.df.get(), (AccountKitConfiguration) this.di.get(), (C10326a) this.bq.get());
    }

    private TinderHeaderInterceptor cE() {
        return TinderApiModule_ProvideTinderHeaderInterceptorFactory.proxyProvideTinderHeaderInterceptor(this.f14695t, TinderApiModule_ProvideTinderHeaderInterceptorBuilderFactory.proxyProvideTinderHeaderInterceptorBuilder(this.f14695t));
    }

    private InstallIdHeaderInterceptor cF() {
        return new InstallIdHeaderInterceptor(aH());
    }

    private C7333h cG() {
        return new C7333h((C2630h) this.bc.get());
    }

    private C14987c cH() {
        return C12574f.a(this.f14680f, (EnvironmentProvider) this.aY.get(), cE(), cF(), cG());
    }

    private GetBuckets cI() {
        return new GetBuckets(aF());
    }

    private C4304a cJ() {
        return new C4304a(cD(), new C8281o(), aK(), cH(), (AbTestUtility) this.ag.get(), cI(), C13332b.c(this.f14682h));
    }

    private C18075n cK() {
        return new C18075n((C2630h) this.bc.get(), loadProfileOptionData(), bE());
    }

    private LoadMoreGenderList cL() {
        return new LoadMoreGenderList((CustomGenderRepository) this.kB.get());
    }

    private C18076p cM() {
        return new C18076p(cL());
    }

    private ObserveDiscoverySettings cN() {
        return new ObserveDiscoverySettings((MetaGateway) this.cC.get());
    }

    private bh cO() {
        return com.tinder.settings.presenter.bk.a(cN(), bf());
    }

    private C4300p cP() {
        return new C4300p(new RegexEmailValidator());
    }

    private com.tinder.account.p072a.ad cQ() {
        return new com.tinder.account.p072a.ad(new PasswordValidator());
    }

    private C14539e cR() {
        return C17811c.a(this.f14692q, (Register) this.jF.get(), (C14517l) this.kr.get(), (C14482a) this.kD.get());
    }

    private C16936b cS() {
        return new C16936b((C2630h) this.bc.get(), bb(), cf(), new C10083b());
    }

    private C16937c cT() {
        return new C16937c((C2630h) this.bc.get(), bb());
    }

    private C16935a cU() {
        return new C16935a((C2630h) this.bc.get(), bb(), cf(), new C10083b(), (C15193i) this.aN.get());
    }

    private C16918g cV() {
        return new C16918g((C2630h) this.bc.get(), bo());
    }

    private C16919h cW() {
        return new C16919h((C2630h) this.bc.get(), bo());
    }

    private C16975a cX() {
        return new C16975a((OfferRepository) this.bB.get(), (C2630h) this.bc.get());
    }

    private C10079r cY() {
        return new C10079r((C10072h) this.kC.get(), (C15193i) this.aN.get(), aY(), (C15071e) this.ek.get(), (bk) this.ak.get(), (C14522a) this.et.get(), cR(), (OfferRepository) this.bB.get(), (FastMatchConfigProvider) this.bW.get(), (SubscriptionProvider) this.aK.get(), bh(), cS(), cT(), cU(), cV(), cW(), (C15070b) this.kz.get(), cr(), cX(), (C10067d) this.kE.get());
    }

    private C14552c cZ() {
        return new C14552c((Context) this.aa.get());
    }

    private C18162n da() {
        return new C18162n((SpotifyAudioPlayer) this.kH.get(), (C15035a) this.gR.get(), (ManagerAnalytics) this.bd.get(), (C2664c) this.aO.get());
    }

    private Interceptor db() {
        return C12616d.a(this.f14697v, (C8308d) this.kI.get());
    }

    private Set<Interceptor> dc() {
        return C15522k.a(3).a(C12613a.b(this.f14697v)).a(db()).a(C12614b.b(this.f14697v)).a();
    }

    private OkHttpUrlLoader.Factory dd() {
        return NetworkModule_ProvideOkHttpUrlLoaderFactoryFactory.proxyProvideOkHttpUrlLoaderFactory(this.f14696u, (C17692o) this.aS.get(), dc());
    }

    private AddSmsValidateEvent de() {
        return new AddSmsValidateEvent((C2630h) this.bc.get());
    }

    private C9416b df() {
        return new C9416b((Application) this.f14657J.get(), (Biller) this.dS.get());
    }

    private C16917f dg() {
        return new C16917f((C2630h) this.bc.get(), bo());
    }

    private C16916e dh() {
        return new C16916e((C2630h) this.bc.get(), bo());
    }

    private C16915d di() {
        return new C16915d((C2630h) this.bc.get(), bo());
    }

    private C9399q dj() {
        return new C9399q((OfferRepository) this.bB.get(), ce(), (C15193i) this.aN.get(), df(), (SubscriptionProvider) this.aK.get(), (FastMatchStatusProvider) this.cc.get(), new C10083b(), dg(), dh(), di(), topPicksConfig());
    }

    private C9385a dk() {
        return new C9385a((FastMatchStatusProvider) this.cc.get(), (SubscriptionProvider) this.aK.get(), new C9390f());
    }

    private C9387c dl() {
        return new C9387c((FastMatchStatusProvider) this.cc.get(), (SubscriptionProvider) this.aK.get(), new C9390f());
    }

    private C16923a dm() {
        return new C16923a(m18235Z(), (bk) this.ak.get());
    }

    private C16914c dn() {
        return new C16914c((C2630h) this.bc.get(), (SubscriptionProvider) this.aK.get());
    }

    /* renamed from: do */
    private C16912a m18337do() {
        return new C16912a((C2630h) this.bc.get(), (SubscriptionProvider) this.aK.get());
    }

    private C16913b dp() {
        return new C16913b((C2630h) this.bc.get(), (SubscriptionProvider) this.aK.get());
    }

    private C15184a dq() {
        return new C15184a((SubscriptionProvider) this.aK.get(), dm(), dn(), m18337do(), dp());
    }

    private com.tinder.settings.presenter.bf dr() {
        return new com.tinder.settings.presenter.bf((C15193i) this.aN.get(), (C15071e) this.ek.get(), aY(), (OfferRepository) this.bB.get(), (FastMatchConfigProvider) this.bW.get(), (SubscriptionProvider) this.aK.get());
    }

    private C16286e ds() {
        return new C16286e((com.tinder.managers.bm) this.kK.get(), (bk) this.ak.get());
    }

    private C16275f dt() {
        return new C16275f((C2630h) this.bc.get());
    }

    private C16273c du() {
        return new C16273c((C2630h) this.bc.get());
    }

    private C14621a dv() {
        return new C14621a(ds(), dt(), du());
    }

    private SetDiscoverability dw() {
        return SetDiscoverability_Factory.newSetDiscoverability((ManagerProfile) this.cD.get());
    }

    private C14576e dx() {
        return new C14576e((C8665a) this.cb.get(), (TinderApi) this.bI.get());
    }

    private C14575d dy() {
        return new C14575d(dx(), (bk) this.ak.get());
    }

    private C14864a dz() {
        return new C14864a(dw(), dy(), (bk) this.ak.get(), (C2634g) this.aR.get(), (TinderApi) this.bI.get(), loadProfileOptionData(), m18212O());
    }

    private C2647c dA() {
        return new C2647c((TelephonyManager) this.cF.get(), (ConnectivityManager) this.cG.get());
    }

    private C10315c dB() {
        return new C10315c((TinderUserApi) this.bO.get(), dA());
    }

    private C10714b dC() {
        return new C10714b((CrashTimeStampGateway) this.fU.get());
    }

    private C10711a dD() {
        return new C10711a((C2630h) this.bc.get());
    }

    private C10712b dE() {
        return new C10712b((C2630h) this.bc.get());
    }

    private C8605a dF() {
        return new C8605a(dB(), C13156x9c0cf4b0.proxyProvidesRxJava1ComputationScheduler$domain_release(this.f14690o), dC(), dD(), dE(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(this.f14676c));
    }

    private C10313a dG() {
        return new C10313a((AppRatingRepository) this.fQ.get());
    }

    private C8261a dH() {
        return new C8261a(dB(), C13156x9c0cf4b0.proxyProvidesRxJava1ComputationScheduler$domain_release(this.f14690o), (AppRatingRepository) this.fQ.get(), dD(), dE(), dG(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(this.f14676c));
    }

    private C8338a dI() {
        return new C8338a(aY());
    }

    private C8346a dJ() {
        return new C8346a((C2639c) this.ep.get(), dI(), (BoostUpdateProvider) this.em.get(), cr(), aY(), cs());
    }

    private AddSettingsOptionUseCase dK() {
        return new AddSettingsOptionUseCase((C2630h) this.bc.get());
    }

    private C14874a dL() {
        return new C14874a((C11695a) this.fZ.get(), dK());
    }

    private UnMatch dM() {
        return new UnMatch(ae());
    }

    private com.tinder.profile.p363b.am dN() {
        return an.a((TinderApi) this.bI.get());
    }

    private C10017e dO() {
        return new C10017e(dM(), dN());
    }

    private com.tinder.profile.p363b.ao dP() {
        return com.tinder.profile.p363b.ap.a((TinderApi) this.bI.get());
    }

    private C10015c dQ() {
        return new C10015c(dN(), dP());
    }

    private com.tinder.profile.p363b.ab dR() {
        return new com.tinder.profile.p363b.ab((TinderApi) this.bI.get(), (C2630h) this.bc.get(), (AbTestUtility) this.ag.get());
    }

    private C14386k dS() {
        return new C14386k((C2630h) this.bc.get());
    }

    private com.tinder.profile.p363b.aj dT() {
        return new com.tinder.profile.p363b.aj((bk) this.ak.get(), (C3945a) this.dW.get());
    }

    private C10013a dU() {
        return new C10013a(dR(), dS(), dT());
    }

    private C16093z dV() {
        return new C16093z((TinderApi) this.bI.get());
    }

    private C8947a dW() {
        return new C8947a((C11695a) this.fZ.get());
    }

    private C10897e dX() {
        return new C10897e((ProfileDataStore) this.f14669V.get());
    }

    private ResponseErrorAdapter dY() {
        return new ResponseErrorAdapter((C5987p) this.f14651D.get());
    }

    private PlacesApiClient dZ() {
        return new PlacesApiClient((TinderApi) this.bI.get(), de.c(this.f14674a), (ConnectivityProvider) this.gj.get(), (PlacesConfigProvider) this.dG.get(), dX(), dY());
    }

    private C10110a ea() {
        return new C10110a((ManagerProfile) this.cD.get(), (bk) this.ak.get());
    }

    private C13558c eb() {
        return new C13558c(ea(), (ManagerAnalytics) this.bd.get());
    }

    private C14885d ec() {
        return new C14885d((C8609a) this.iM.get());
    }

    private C10378h ed() {
        return new C10378h((BitmojiAuthRepository) this.ch.get());
    }

    private C10380k ee() {
        return new C10380k((BitmojiAuthRepository) this.ch.get());
    }

    private C3874a ef() {
        return new C3874a((C2630h) this.bc.get(), new AccountThirdPartyIntegrationEventFactory(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(this.f14690o));
    }

    private C14426e eg() {
        return new C14426e((AbTestUtility) this.ag.get(), ed(), aB(), m18206L(), ee(), (C14548a) this.dA.get(), m18358m(), ef(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(this.f14690o), C13333c.c(this.f14682h), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(this.f14690o));
    }

    private GetMatch eh() {
        return new GetMatch(ae());
    }

    private MyUserRepository ei() {
        return cy.a(this.f14674a, (bk) this.ak.get(), (bj) this.aP.get());
    }

    private AgeCalculator ej() {
        return new AgeCalculator(C12842e.c(this.f14679e));
    }

    private com.tinder.data.adapter.al ek() {
        return new com.tinder.data.adapter.al(new com.tinder.data.adapter.an());
    }

    private AdUrlTracker el() {
        return C13487h.a(this.f14688m, (Addy) this.hx.get());
    }

    private C17174d em() {
        return new C17174d((TypingIndicatorRepository) this.jc.get());
    }

    private C10522a en() {
        return new C10522a((MessageRepository) this.fm.get(), eh(), (MetaGateway) this.cC.get(), ds.c(this.f14674a), em());
    }

    private C10336s eo() {
        return new C10336s((AuthService) this.aZ.get(), (ErrorResponseConverter) this.ba.get());
    }

    private C10039a ep() {
        return C13541c.a((C3945a) this.dW.get());
    }

    private UserAgentCache eq() {
        return C13491l.a(this.f14688m, m18196G());
    }

    private LifecycleObserver er() {
        return C13492m.a(this.f14688m, (Context) this.aa.get(), eq());
    }

    private RecsAdsConfig es() {
        return C13481b.a(this.f14698w, (AbTestUtility) this.ag.get());
    }

    private C14729c et() {
        return new C14729c(es());
    }

    private C15034e eu() {
        return C13482c.a(this.f14698w, (AbTestUtility) this.ag.get());
    }

    private C8589c ev() {
        return new C8589c((C8588a) this.kU.get());
    }

    private DfpPublisherAdRequestFactory ew() {
        return new DfpPublisherAdRequestFactory(ev(), (MetaGateway) this.cC.get(), ej());
    }

    private PublisherAdRequestFactory ex() {
        return C13499t.a(this.f14688m, ew());
    }

    private CreateMessageAdMatch ey() {
        return new CreateMessageAdMatch(ae(), (MessageRepository) this.fm.get(), (MetaGateway) this.cC.get());
    }

    private ObserveCurrentUser ez() {
        return new ObserveCurrentUser((MetaGateway) this.cC.get());
    }

    private C11813p eA() {
        return C12474s.a(this.f14699x, (C11809n) this.gU.get());
    }

    private AdEventFields.Factory eB() {
        return new AdEventFields.Factory(es());
    }

    private ObserveHasNewFeedItems eC() {
        return new ObserveHasNewFeedItems((FeedRepository) this.gc.get());
    }

    private ObserveFeed eD() {
        return new ObserveFeed((FeedRepository) this.gc.get());
    }

    private GetMessagesMatches eE() {
        return C13417c.a(this.f14694s, ae(), (MessageRepository) this.fm.get());
    }

    private GetNewMatches eF() {
        return C13418d.a(this.f14694s, ae(), (MessageRepository) this.fm.get());
    }

    private ClipboardManager eG() {
        return eg.a(this.f14681g, this.f14700y);
    }

    private LoadSuperLikeableGame eH() {
        return new LoadSuperLikeableGame((SuperLikeableGameRepository) this.hJ.get());
    }

    private EndSuperLikeableGame eI() {
        return C12486c.a(eH(), (RecsEngineRegistry) this.hb.get(), (SuperLikeableGamePlayCoordinator) this.hO.get(), C12842e.c(this.f14679e));
    }

    private SkipSuperLikeableGame eJ() {
        return new SkipSuperLikeableGame((SuperLikeableGameRepository) this.hJ.get(), C12842e.c(this.f14679e));
    }

    private SuperLikeableGameSwipeTracker eK() {
        return new SuperLikeableGameSwipeTracker(new SwipeCountThresholdDetector(), C12842e.c(this.f14679e));
    }

    private AddRecsViewEvent eL() {
        return AddRecsViewEvent_Factory.newAddRecsViewEvent((C2630h) this.bc.get(), (bk) this.ak.get());
    }

    private ResetTopPickSession eM() {
        return new ResetTopPickSession((TopPicksSessionRepository) this.mK.get(), (RecsEngineRegistry) this.hb.get());
    }

    private ObserveTopPicksSession eN() {
        return new ObserveTopPicksSession((TopPicksSessionRepository) this.mK.get());
    }

    private ObserveTopPicksScreenState eO() {
        return new ObserveTopPicksScreenState((SubscriptionProvider) this.aK.get(), eN(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(this.f14676c));
    }

    private ResetScreenState eP() {
        return new ResetScreenState((RecsEngineRegistry) this.hb.get(), eM(), eO(), C12842e.c(this.f14679e));
    }

    private GetAutoPlayLoopsEnabled eQ() {
        return new GetAutoPlayLoopsEnabled((AutoPlayVideoSettingsRepository) this.gf.get(), (ConnectivityRepository) this.nf.get());
    }

    private GetAutoPlayLoopsEnabledStatus eR() {
        return C13154xe42f5e5a.proxyProvideGetAutoPlayLoopsEnabledStatus$domain_release(this.f14676c, eQ());
    }

    private C10810c eS() {
        return new C10810c((GifApiClient) this.nn.get());
    }

    private GifRepository eT() {
        return C12963y.a(this.f14701z, eS());
    }

    private MessageDeliveryStatusUpdatesProvider eU() {
        return com.tinder.data.message.ab.a(this.f14701z, (com.tinder.data.message.aj) this.fk.get());
    }

    private C17172a eV() {
        return new C17172a(en(), (C2630h) this.bc.get(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(this.f14690o), C12842e.c(this.f14679e));
    }

    private RecsEngine eW() {
        return br.a(this.f14648A, (RecsEngineRegistry) this.hb.get());
    }

    private C10771d eX() {
        return new C10771d((TinderApi) this.bI.get(), (FastMatchStatusProvider) this.cc.get(), (AuthStatusProvider) this.dJ.get());
    }

    private C10275k eY() {
        return new C10275k(m18360n());
    }

    /* renamed from: a */
    private void m18326a(a$c a_c) {
        this.f14650C = RetrofitModule_ProvideRetrofitBuilderFactory.create(a$c.a(a_c));
        this.f14651D = C17281c.a(cx.b(a$c.b(a_c)));
        this.f14652E = C12451x21aaf741.create(a$c.c(a_c), this.f14651D);
        this.f14653F = C18318f.a(1).a(Empty.class, this.f14652E).a();
        this.f14654G = TinderApiModule_ProvideTinderRetrofitApiBuilderFactory.create(a$c.c(a_c), this.f14650C, this.f14653F);
        this.f14655H = OkHttpModule_ProvideOkHttpClientBuilderFactory.create(a$c.d(a_c));
        this.f14656I = C18317d.a(a$c.e(a_c));
        this.f14657J = C17281c.a(ee.b(a$c.f(a_c), this.f14656I));
        this.f14658K = OkHttpModule_ProvideHttpCacheFactory.create(a$c.d(a_c), this.f14657J);
        this.f14659L = ci.b(a$c.b(a_c), this.f14657J);
        this.f14660M = PhotoProfilePhotoAdapter_Factory.create(PhotoProfilePhotoAdapter_RenderProcessedFileAdapter_Factory.create());
        this.f14661N = InstagramInstagramDataSetAdapter_Factory.create(C12834m.c(), InstagramPhotoLegacyInstagramPhotoAdapter_Factory.create());
        this.f14662O = SpotifyTrackSearchTrackAdapter_Factory.create(SpotifyTrackSearchTrackAdapter_ArtistAdapter_Factory.create());
        this.f14663P = SpotifyArtistLegacyArtistAdapter_Factory.create(this.f14662O);
        this.f14664Q = CurrentUserLegacyUserAdapter_Factory.create(BadgeLegacyBadgeAdapter_Factory.create(), GenderLegacyUserAdapter_Factory.create(), this.f14660M, JobLegacyJobAdapter_Factory.create(), SchoolLegacySchoolAdapter_Factory.create(), this.f14661N, this.f14663P, this.f14662O);
        this.f14665R = C17281c.a(C13169b.c());
        this.f14666S = C12786o.b(this.f14664Q, this.f14665R);
        this.f14667T = C13079h.b(a$c.g(a_c));
        this.f14668U = C13082p.b(this.f14667T);
        this.f14669V = C17281c.a(this.f14668U);
        this.f14670W = C13081m.b(this.f14669V);
        this.f14671X = C18317d.a(a$c.h(a_c));
        this.f14672Y = C17281c.a(C12810d.b(this.f14671X));
        this.f14673Z = C17281c.a(C12557e.c());
        this.aa = C17281c.a(ed.b(a$c.f(a_c), this.f14656I));
        this.ab = C17281c.a(cr.b(a$c.b(a_c), this.aa));
        this.ac = C12605o.b(this.ab);
        this.ad = C12607s.b(a$c.i(a_c), this.ac);
        this.ae = C12559g.b(this.ad);
        this.af = C12811e.b(this.f14673Z, C12812f.c(), C12788d.c(), C12790h.c(), this.ae);
        this.ag = C17281c.a(C12556d.b(this.f14672Y, this.af));
        this.ah = C12793s.b(this.f14666S, this.f14670W, this.ag);
        this.ai = C17281c.a(cf.b(a$c.b(a_c), this.ah));
        this.aj = C17281c.a(ce.b(a$c.b(a_c), this.f14659L));
        this.ak = C17281c.a(bl.b(this.f14659L, this.ai, this.aj));
        this.al = C17281c.a(ei.b(a$c.f(a_c)));
        this.am = C17281c.a(eh.b(a$c.f(a_c)));
        this.an = C17281c.a(eq.b(a$c.f(a_c), this.ak, this.al, this.am));
        this.ao = fg.b(a$c.j(a_c), this.f14657J, this.an, this.ak);
        this.ap = FastMatchV2NetworkPerfInspector_Factory.create(PerfEventUrlUtils_Factory.create());
        this.aq = NetworkPerfModule_ProvideFastMatchV2NetworkPerfInspectorFactory.create(a$c.k(a_c), this.ap);
        this.ar = UserProfileNetworkPerfInspector_Factory.create(PerfEventUrlUtils_Factory.create());
        this.as = NetworkPerfModule_ProvideUserProfileNetworkPerfInspectorFactory.create(a$c.k(a_c), this.ar);
        this.at = ProfileV2NetworkPerfInspector_Factory.create(PerfEventUrlUtils_Factory.create());
        this.au = NetworkPerfModule_ProvideProfileV2NetworkPerfInspectorFactory.create(a$c.k(a_c), this.at);
        this.av = PurchaseNetworkPerfInspector_Factory.create(PerfEventUrlUtils_Factory.create());
        this.aw = NetworkPerfModule_ProvidePurchaseNetworkPerfInspectorFactory.create(a$c.k(a_c), this.av);
        this.ax = TopPicksV2NetworkPerfInspector_Factory.create(PerfEventUrlUtils_Factory.create());
        this.ay = NetworkPerfModule_ProvideTopPicksV2NetworkPerfInspectorFactory.create(a$c.k(a_c), this.ax);
        this.az = C18320l.a(5, 0).a(this.aq).a(this.as).a(this.au).a(this.aw).a(this.ay).a();
        this.aA = C17281c.a(com.tinder.module.am.b(a$c.l(a_c), this.aa));
        this.aB = C17281c.a(com.tinder.module.al.b(a$c.l(a_c), this.aA));
        this.aC = C17281c.a(com.tinder.module.ae.b(a$c.l(a_c), this.aB));
        this.aD = C17281c.a(ak.b(a$c.l(a_c), this.f14655H, C8006c.c()));
        this.aE = C17281c.a(com.tinder.module.as.b(a$c.l(a_c)));
        this.aF = C17281c.a(C18219c.c());
        this.aG = LoadProfileOptionData_Factory.create(this.f14670W);
        this.aH = C13087t.b(this.f14669V);
        this.aI = C17281c.a(cs.b(a$c.b(a_c), this.ag, this.aG, this.aH));
        this.aJ = dk.b(a$c.b(a_c), this.ag);
        this.aK = C17281c.a(C17833f.b(a$c.m(a_c), this.aJ, this.aG));
        this.aL = C13091d.b(this.aK);
        this.aM = C13092f.b(this.aK);
        this.aN = C17281c.a(C18206k.b(this.aF, this.aI, this.aK, this.aL, this.aM));
        this.aO = C17281c.a(ch.b(a$c.b(a_c)));
        this.aP = C17281c.a(en.b(a$c.f(a_c), this.ak, this.aO));
        this.aQ = C17281c.a(com.tinder.module.ao.b(a$c.l(a_c)));
        this.aR = C17281c.a(com.tinder.module.ad.b(a$c.l(a_c), this.aQ));
        this.aS = new C18316b();
        this.aT = C17281c.a(LegacyNetworkModule_ProvideHeaderInterceptorFactory.create(a$c.n(a_c)));
        this.aU = C17281c.a(LegacyNetworkModule_ProvideAuthHeadersOkHttpClientFactory.create(a$c.n(a_c), this.aS, this.aT));
        this.aV = C17281c.a(RetrofitModule_ProvideRxJavaCallAdapterFactoryFactory.create(a$c.a(a_c)));
        this.aW = C17281c.a(cp.b(a$c.b(a_c)));
        this.aX = C17281c.a(RetrofitModule_ProvideGsonConverterFactoryFactory.create(a$c.a(a_c), this.aW));
        this.aY = C17281c.a(C12558f.c());
        this.aZ = C17281c.a(LegacyNetworkModule_ProvideAuthServiceFactory.create(a$c.n(a_c), this.aU, this.f14650C, this.aV, this.aX, this.aY));
        this.ba = C17281c.a(cm.b(a$c.b(a_c), this.aW));
        this.bb = C17281c.a(C4297e.m17264b(this.aa));
        this.bc = new C18316b();
        this.bd = C17281c.a(com.tinder.module.ap.b(a$c.l(a_c), this.bc, C7990e.c()));
        this.be = C17281c.a(C12594j.b(a$c.i(a_c), this.aa));
        this.bf = C17281c.a(C12595k.b(a$c.i(a_c), this.be));
        this.bg = C12581i.b(this.bd, this.ag, this.bf, this.ak);
        this.bh = C17281c.a(com.tinder.module.aq.b(a$c.l(a_c), this.bc, this.ag));
        this.bi = C17281c.a(C12577i.b(a$c.i(a_c), this.aZ, this.ba, this.bb, this.bg, this.ad, this.bc, this.ag, this.bh));
        this.bj = C17281c.a(du.b(a$c.b(a_c), this.ak));
        this.bk = C12843b.b(this.f14657J);
        this.bl = C12606q.b(this.bk);
        this.bm = C12575g.b(a$c.i(a_c), this.f14659L);
        this.bn = C12602r.b(a$c.i(a_c), this.bm);
        this.bo = C12576h.b(a$c.i(a_c), this.bn);
        this.bp = C12584k.b(this.bi, this.bj, this.ak, this.bl, this.bo);
        this.bq = C17281c.a(C12572d.b(a$c.i(a_c)));
        this.br = C17281c.a(C12598n.b(a$c.i(a_c)));
        this.bs = AuthRequestFactory_Factory.create(this.bq, this.br, this.bl);
        this.bt = C17281c.a(LegacyNetworkModule_ProvideAuthenticatorFactory.create(a$c.n(a_c), this.aO, this.bp, this.bj, this.bg, this.bs));
        this.bu = C17281c.a(C12449x9ee21d96.create(a$c.n(a_c), this.aU, this.bt));
        this.bv = C17281c.a(VolleyModule_ProvideOkHttpStackFactory.create(a$c.o(a_c), this.bu, this.aY, C8006c.c()));
        this.bw = C17281c.a(VolleyModule_ProvideRequestQueueFactory.create(a$c.o(a_c), this.bv));
        this.bx = C17281c.a(ManagerNetwork_Factory.create(this.bw));
    }

    /* renamed from: b */
    private void m18329b(a$c a_c) {
        this.by = C17281c.a(C18213b.b(this.ak, this.ag, this.aG));
        this.bz = C17281c.a(C13311f.b(this.aN, this.by, this.aK));
        this.bA = C17281c.a(dr.b(a$c.b(a_c)));
        this.bB = C17281c.a(ba.b(a$c.p(a_c)));
        this.bC = MaskEmail_Factory.create(RegexEmailValidator_Factory.create());
        this.bD = C18052b.b(this.bC);
        this.bE = C18054e.b(this.ak, this.aP, this.bB, this.ai, this.aG, this.bD);
        this.bF = C18053b.b(this.bE, this.bc);
        this.bG = dz.b(a$c.q(a_c), this.bb);
        this.bH = dy.b(a$c.q(a_c), this.bb);
        this.bI = new C18316b();
        this.bJ = aa.b(com.tinder.data.adapter.ac.c(), com.tinder.data.adapter.ae.c());
        this.bK = C13076d.b(this.bI, this.bJ);
        this.bL = C17281c.a(this.bK);
        this.bM = C17747j.b(C17745f.c(), C17746h.c());
        this.bN = C17758b.b(this.bL, this.bM);
        this.bO = new C18316b();
        this.bP = C17281c.a(C12982b.b(a$c.r(a_c)));
        this.bQ = C17281c.a(C12984d.b(a$c.r(a_c), this.bP));
        this.bR = C12966d.b(C12832g.c(), C12834m.c(), this.bJ, C12828b.c(), C12829c.c());
        this.bS = C12835r.b(C12834m.c());
        this.bT = C12967f.b(this.bR, C12834m.c(), this.bS);
        this.bU = C12865c.b(this.bk);
        this.bV = C12897b.b(this.bk);
        this.bW = C17281c.a(com.tinder.module.bq.b(a$c.s(a_c), this.bU, this.ak, this.bV));
        this.bX = C13347b.b(this.bk);
        this.bY = C13346b.b(this.bB, this.bX);
        this.bZ = C17281c.a(this.bY);
        this.ca = CommonDomainModule_ProvideUtcOffsetMins$domain_releaseFactory.create(a$c.t(a_c));
        this.cb = C17281c.a(C12896b.b(this.ab));
        this.cc = C17281c.a(FastMatchStatusProvider_Factory.create());
        this.cd = C13117b.b(this.bk);
        this.ce = C13116l.b(this.cd, this.bV);
        this.cf = C18220b.b(this.ag, this.ce);
        this.cg = C12545o.b(a$c.u(a_c), this.cf);
        this.ch = C17281c.a(dl.b(a$c.b(a_c), this.ag, this.aa));
        this.ci = C12619e.b(this.ch);
        this.cj = bx.b(a$c.b(a_c), this.aa);
        this.ck = C12618b.b(this.cj);
        this.cl = C17281c.a(com.tinder.module.bw.b(a$c.b(a_c), this.ag, this.aa, this.f14659L, this.ck));
        this.cm = C12620g.b(this.cl);
        this.cn = C13168b.b(this.aN, this.ak, this.aR, this.bW, this.cc, this.cg, this.bp, this.ci, this.cm);
        this.co = C17281c.a(com.tinder.module.df.b(a$c.b(a_c), this.f14659L));
        this.cp = ej.b(a$c.f(a_c), this.f14657J);
        this.cq = C18234b.b(this.cp);
        this.cr = C17281c.a(C13113d.c());
        this.cs = TopPicksNotificationsAreEnabled_Factory.create(this.bV, this.cg);
        this.ct = C18237g.b(this.bc);
        this.cu = C18236e.b(this.bc);
        this.cv = C18239o.b(this.cq, this.ce, this.cu);
        this.cw = CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.create(a$c.t(a_c));
        this.cx = C18235c.b(this.cq, this.ce, this.cr, this.cs, this.cg, this.ct, this.cv, this.cw);
        this.cy = C18061b.b(this.cx, this.cv);
        this.cz = C18062e.b(this.bV, this.cb, this.bI, C12895b.c(), this.bW, this.cn, this.cg, this.co, this.cy);
        this.cA = C17281c.a(C12904b.c());
        this.cB = C17281c.a(C12981u.b(this.bO, this.bQ, this.bT, C12968h.c(), C12969j.c(), this.bW, this.bZ, C12971o.c(), this.aK, this.ca, this.cz, C12972q.c(), this.ce, this.cA, this.co, C12903b.c(), this.cr));
        this.cC = C17281c.a(C12983c.b(a$c.r(a_c), this.cB));
        Provider provider = this.ak;
        Provider provider2 = this.aP;
        Provider provider3 = this.aR;
        Provider provider4 = this.bx;
        Provider provider5 = this.bz;
        Provider provider6 = this.bA;
        Provider provider7 = this.aY;
        Provider provider8 = this.aN;
        Provider provider9 = this.bF;
        Provider provider10 = this.f14657J;
        Provider provider11 = this.ai;
        Provider provider12 = this.f14664Q;
        Provider provider13 = this.bu;
        Provider provider14 = this.bG;
        dy dyVar = this.bH;
        dy dyVar2 = dyVar;
        this.cD = C17281c.a(be.b(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, dyVar2, C17748l.c(), this.bN, this.cC));
        this.cE = C17281c.a(C8016f.b(this.aN, this.aP, this.cD));
        this.cF = C17281c.a(dt.b(a$c.b(a_c), this.aa));
        this.cG = C17281c.a(cb.b(a$c.b(a_c), this.aa));
        this.cH = C13341d.b(this.cF, this.cG);
        this.cI = C17281c.a(em.b(a$c.f(a_c), this.aa));
        this.cJ = C17281c.a(com.tinder.managers.ac.b(this.aa, this.ak, this.aO, this.cI));
        this.cK = cd.b(a$c.b(a_c), this.aa);
        this.cL = C12604l.b(this.cK);
        this.cM = C8011c.b(this.cH, this.cJ, this.ad, this.cL);
        this.cN = C17281c.a(com.tinder.module.ab.b(a$c.l(a_c), this.cE, this.cM));
        this.cO = C17281c.a(com.tinder.module.ac.b(a$c.l(a_c), C7998c.c()));
        this.cP = C7999e.b(this.cO, C7989b.c());
        this.cQ = C17281c.a(C7997m.c());
        this.cR = C7994f.b(this.f14657J, this.cQ, this.cL, this.ai);
        this.cS = C17281c.a(this.cR);
        this.cT = C7996k.b(this.cS, C7995j.c());
        this.cU = C17281c.a(C12569b.b(C12788d.c()));
        this.cV = aj.b(a$c.l(a_c));
        C18316b c18316b = (C18316b) this.bc;
        this.bc = C17281c.a(com.tinder.module.ai.b(a$c.l(a_c), this.aC, this.aD, this.aE, this.cN, this.cP, this.cT, C17881c.c(), this.cU, this.cV));
        c18316b.a(this.bc);
        this.cW = ResponseErrorAdapter_Factory.create(this.f14651D);
        this.cX = C12842e.b(a$c.v(a_c));
        this.cY = C17281c.a(ff.b(a$c.j(a_c), this.az, this.bc, this.cW, this.cX));
        this.cZ = C17281c.a(PlacesTimeoutInterceptor_Factory.create());
        this.da = fd.b(a$c.w(a_c), this.ao, this.cY, this.cZ);
        c18316b = (C18316b) this.aS;
        this.aS = C17281c.a(NetworkModule_ProvidePublicApiClientFactory.create(a$c.x(a_c), this.f14655H, this.f14658K, this.da));
        c18316b.a(this.aS);
        this.db = C13396m.b(this.bx, this.br);
        this.dc = C17281c.a(C12601q.b(a$c.i(a_c), this.bg));
        this.dd = C17281c.a(C12568b.b(a$c.i(a_c)));
        this.de = C17281c.a(C12571c.b(a$c.i(a_c)));
        this.df = C17281c.a(C12600p.b(a$c.i(a_c), this.dc, this.dd, this.de));
        this.dg = C12580g.b(this.bc);
        this.dh = C17281c.a(C12611w.b(a$c.i(a_c), this.dg));
        this.di = C17281c.a(C12610v.b(a$c.i(a_c), this.dh, this.dd, this.de));
        this.dj = C12578c.b(this.df, this.di, this.bq);
        this.dk = C12579f.b(this.dj);
        this.dl = C17281c.a(C18050b.c());
        this.dm = C17281c.a(C13395h.b(this.ak, this.aR, this.bx, this.f14656I, this.db, this.bj, this.bg, this.dk, C12586p.c(), this.dl));
        this.dn = TinderApiModule_ProvideReauthStrategyFactory.create(a$c.c(a_c), this.bp, this.bj, this.bg, this.bs, this.dm);
        this.f14678do = C17281c.a(TinderApiModule_ProvideAuthTokenProviderFactory.create(a$c.c(a_c), this.bj));
        this.dp = TinderApiModule_ProvideTinderAuthenticatorFactory.create(a$c.c(a_c), this.dn, this.f14678do);
        this.dq = TinderApiModule_ProvideTinderHeaderInterceptorBuilderFactory.create(a$c.c(a_c));
        this.dr = TinderApiModule_ProvideTinderHeaderInterceptorFactory.create(a$c.c(a_c), this.dq);
    }

    /* renamed from: c */
    private void m18332c(a$c a_c) {
        this.ds = OkHttpModule_ProvideTinderHeaderInterceptorFactory.create(a$c.d(a_c), this.dr);
        this.dt = TinderAuthHeaderInterceptor_Factory.create(this.f14678do);
        this.du = OkHttpModule_ProvideTinderAuthTokenHeaderInterceptorFactory.create(a$c.d(a_c), this.dt);
        this.dv = C18320l.a(2, 0).a(this.ds).a(this.du).a();
        this.dw = RetrofitModule_ProvideRxJava2CallAdapterFactoryFactory.create(a$c.a(a_c));
        C18316b c18316b = (C18316b) this.bI;
        this.bI = C17281c.a(NetworkModule_ProvideTinderApiClientFactory.create(a$c.x(a_c), this.f14654G, this.aS, this.dp, this.dv, this.aV, this.dw, this.f14651D, this.aY));
        c18316b.a(this.bI);
        c18316b = (C18316b) this.bO;
        this.bO = C17281c.a(NetworkModule_ProvideTinderUserApiFactory.create(a$c.x(a_c), this.bI));
        c18316b.a(this.bO);
        this.f14674a = a$c.b(a_c);
        this.dx = C17281c.a(cq.b(a$c.b(a_c), this.aa));
        this.dy = C17281c.a(bu.b(a$c.b(a_c), this.f14656I, C12452b.c()));
        this.dz = C18286m.b(this.aa);
        this.dA = C17281c.a(C17878c.b(this.dy, this.aa, this.dz));
        this.dB = C17281c.a(db.b(a$c.b(a_c), this.f14656I));
        this.dC = C17281c.a(cu.b(a$c.b(a_c)));
        this.dD = C17281c.a(C17890c.b(this.bI, this.dB, this.dm, this.ak, C12788d.c(), this.cb));
        this.dE = C17281c.a(C17879b.c());
        this.dF = C17281c.a(C17885d.b(this.aa, this.dy, this.dC, this.dD, this.dE, this.ag));
        this.dG = C17281c.a(dh.b(a$c.b(a_c), this.f14659L));
        this.f14675b = a$c.u(a_c);
        this.dH = C13547b.b(this.bB);
        this.dI = C17281c.a(this.dH);
        this.f14676c = a$c.t(a_c);
        this.f14677d = a$c.y(a_c);
        this.dJ = C17281c.a(dw.b(a$c.b(a_c), this.bj));
        this.dK = FetchMeta_Factory.create(this.cC, this.dJ);
        this.dL = C13339j.b(C13337f.c(), C13338h.c(), C13335b.c(), C13336d.c(), C12971o.c());
        this.dM = ar.b(C12834m.c());
        this.dN = C17281c.a(C18184b.b(this.dM));
        this.dO = C17281c.a(C17850n.b(com.tinder.data.profile.adapter.af.c(), com.tinder.data.profile.adapter.al.c()));
        this.dP = C17281c.a(az.b(a$c.p(a_c)));
        this.dQ = C17281c.a(ay.b(a$c.p(a_c), this.dP));
        this.dR = C17281c.a(ax.b(a$c.p(a_c)));
        this.dS = C17281c.a(av.b(a$c.p(a_c), this.aa, this.dQ, this.dR));
        this.dT = C17281c.a(dm.b(a$c.b(a_c), this.aa));
        this.dU = C17281c.a(ep.b(a$c.f(a_c), this.aa));
        this.dV = C17281c.a(LegacyNetworkModule_ProvideTinderApiClientFactory.create(a$c.n(a_c), this.bu, this.f14650C, this.aV, this.aX, this.aY));
        this.dW = C17281c.a(el.b(a$c.f(a_c), this.dU, this.bx, this.aO, this.dV, this.aY));
        this.dX = C17281c.a(C18194h.b(this.aG, this.ag));
        this.dY = C17281c.a(C18191b.c());
        this.dZ = C18193e.b(this.bI, this.dN);
        this.ea = C13075b.b(this.bO, C13063f.c());
        this.eb = C12970l.b(C12834m.c());
        this.ec = C13061b.b(C12834m.c(), this.cw);
        this.ed = C12836t.b(C12834m.c());
        this.ee = C13068p.b(this.ed);
        this.ef = C13071v.b(C13072x.c());
        this.eg = C13070t.b(this.ef);
        Provider provider = this.bI;
        Provider provider2 = this.ea;
        Provider c = C12971o.c();
        Provider provider3 = this.dM;
        Provider c2 = com.tinder.data.profile.adapter.ai.c();
        Provider c3 = com.tinder.data.profile.adapter.ar.c();
        Provider c4 = C13073z.c();
        Provider c5 = C13063f.c();
        Provider c6 = com.tinder.data.profile.adapter.ac.c();
        Provider c7 = C13069r.c();
        Provider c8 = C12965b.c();
        Provider provider4 = this.eb;
        Provider provider5 = this.bS;
        Provider c9 = C12968h.c();
        Provider c10 = C13064h.c();
        C13061b c13061b = this.ec;
        Provider c11 = com.tinder.data.profile.adapter.at.c();
        Provider c12 = com.tinder.data.profile.adapter.an.c();
        Provider c13 = C13062d.c();
        C13061b c13061b2 = c13061b;
        C12966d c12966d = this.bR;
        C12966d c12966d2 = c12966d;
        C13061b c13061b3 = c13061b2;
        C12966d c12966d3 = c12966d2;
        this.eh = C13080j.b(provider, provider2, c, provider3, c2, c3, c4, c5, c6, c7, c8, provider4, provider5, c9, c10, c13061b3, c11, c12, c13, c12966d3, C13066l.c(), this.ee, com.tinder.data.profile.adapter.ap.c(), C13067n.c(), C13065j.c(), this.eg);
        this.ei = C13085r.b(this.eh, this.f14669V, TutorialToOnboardingTutorialNameAdapter_Factory.create());
        this.ej = SyncProfileData_Factory.create(this.ei);
        this.ek = C17281c.a(C18188k.b(this.dX, this.dY, this.dZ, this.ag, this.ej));
        this.el = C17281c.a(C12846g.c());
        this.em = C17281c.a(C12636g.c());
        this.en = C17281c.a(by.b(a$c.b(a_c), this.dV, this.aW));
        this.eo = C17281c.a(C12634b.c());
        this.ep = C17281c.a(C12635f.b(this.aI, this.en, this.em, this.eo));
        this.eq = C12624n.b(this.dV, this.ak, this.el, this.em, this.ep, this.en, this.eo);
        this.er = C17281c.a(C17835b.b(this.ak, this.dW, this.ek, this.eq, this.bB, this.cF, this.cG, this.dS, this.aK, this.ag));
        this.es = C17838d.b(this.bI, this.dT, this.er, this.dm);
        this.et = C17281c.a(this.es);
        this.eu = C17281c.a(C17799j.b(this.dO, this.bB, this.dS, this.et));
        this.ev = C17281c.a(cw.b(a$c.b(a_c), this.dL, this.dN, this.eu, this.ag));
        this.ew = C13171c.b(this.cC, this.ev);
        this.ex = C13173d.b(this.cD, this.cX);
        this.ey = C12643b.b(this.aK);
        this.ez = C17281c.a(C13179p.b(this.ak, this.ey, this.by, this.cX));
        this.eA = C17281c.a(C13177l.b(this.dX, this.aI, this.dY, this.ag, this.cX));
        this.eB = C17281c.a(C13181t.b(this.aF, this.cX));
        this.eC = C17281c.a(C13178n.b(this.dW, this.cX));
        this.eD = C17281c.a(C13175h.b(this.eo, this.cX));
        this.eE = C17281c.a(C13180r.b(this.cn, this.aO, this.cX));
        this.eF = C17281c.a(dd.b(a$c.b(a_c)));
        this.eG = C17281c.a(cn.b(a$c.b(a_c), this.aa));
        this.eH = C13342j.b(this.eF, this.eG);
        this.eI = C17281c.a(C13174f.b(this.eH, this.cX));
        this.eJ = C17281c.a(C12464i.b(a$c.z(a_c), this.f14659L));
        this.eK = C17281c.a(C12480y.b(a$c.z(a_c), this.eJ));
        this.eL = C13176j.b(this.eK, this.cX);
        this.eM = C17281c.a(C13172b.b(this.ex, this.ez, this.eA, this.eB, this.eC, this.eD, this.f14665R, this.eE, this.eI, this.eL));
        this.eN = C17281c.a(dv.b(a$c.b(a_c), this.dK, this.ew, this.f14665R, this.eM));
        this.f14679e = a$c.v(a_c);
        this.f14680f = a$c.i(a_c);
        this.f14681g = a$c.f(a_c);
        this.f14682h = a$c.A(a_c);
        this.f14683i = a$c.d(a_c);
        this.eO = C17281c.a(com.tinder.managers.br.b(this.ak, this.aa));
        this.f14685j = a$c.B(a_c);
        this.f14686k = a$c.C(a_c);
        this.f14687l = a$c.D(a_c);
        this.eP = bm.b(a$c.E(a_c));
        this.eQ = bp.b(a$c.E(a_c));
        this.eR = bo.b(a$c.E(a_c));
        this.eS = bn.b(a$c.E(a_c));
        this.eT = C17281c.a(com.tinder.module.bf.b(a$c.F(a_c), this.eP, this.eQ, this.eR, this.eS, this.ai));
        this.eU = C17281c.a(C12856e.b(a$c.G(a_c)));
        this.eV = C17281c.a(C12855d.b(a$c.G(a_c), this.f14657J));
        this.eW = C17281c.a(C12854c.b(a$c.G(a_c), this.eU, this.eV));
        this.eX = C17281c.a(C12936u.b(this.eW));
        this.eY = C17281c.a(com.tinder.data.match.ar.c());
        this.eZ = C17281c.a(C13124q.b(this.f14657J));
    }

    /* renamed from: d */
    private void m18335d(a$c a_c) {
        this.fa = C12845e.b(this.eq);
        this.fb = C12844b.b(this.ak);
        this.fc = C13129x.b(this.eZ, this.fa, this.fb, this.bI);
        this.fd = C12921o.b(this.bI, C12937w.c());
        this.fe = C12928r.b(this.eX, this.fd, this.eY);
        this.ff = InsertMatches_Factory.create(this.fe);
        this.fg = ae.b(C12937w.c(), this.ff);
        this.fh = C12957p.b(C12834m.c(), com.tinder.data.message.aw.c(), C12955j.c(), bd.c(), C12827c.c(), com.tinder.data.message.ap.c());
        this.fi = C17281c.a(C12964z.b(a$c.H(a_c), this.eW));
        this.fj = C12958s.b(this.bI, this.fh, C12858b.c());
        this.fk = C17281c.a(com.tinder.data.message.ak.c());
        this.fl = com.tinder.data.message.aa.b(a$c.H(a_c), this.fk);
        this.fm = C17281c.a(com.tinder.data.message.ac.b(a$c.H(a_c), this.fi, this.fj, this.fl));
        this.fn = InsertMessages_Factory.create(this.fm, this.fe, this.cC);
        this.fo = com.tinder.data.updates.aj.b(C12834m.c(), this.fh, this.fn);
        this.fp = InsertMessageLikes_Factory.create(this.fm, this.fe, this.cC);
        this.fq = ah.b(C12956l.c(), this.fp);
        this.fr = C17281c.a(C13121b.c());
        this.fs = C12857f.b(a$c.G(a_c), this.eW);
        this.ft = BlockMatches_Factory.create(this.fe);
        this.fu = C17281c.a(com.tinder.data.updates.ab.b(this.fg, this.fo, this.fq, C12834m.c(), C13120b.c(), this.eZ, this.fr, this.el, this.fb, this.fs, this.ft, this.dG));
        this.fv = C13123n.b(this.fc, this.fu);
        this.fw = C13126s.b(this.fr);
        this.fx = C17281c.a(C12596l.b(a$c.i(a_c), this.f14659L));
        this.fy = C17281c.a(C13125r.b(this.fx));
        this.fz = C17281c.a(C12814n.b(this.ag));
        this.fA = C17281c.a(NetworkModule_ProvideKeepAliveServiceFactory.create(a$c.x(a_c), this.aS, this.dp, this.dv, this.fy, this.fz, this.f14657J, this.aY));
        this.fB = C13155xa389edd5.create(a$c.I(a_c));
        this.fC = C13122f.b(this.fB);
        this.fD = C13127t.b(this.fA, this.fr, this.fC, this.fB);
        this.fE = C18272d.b(this.bc);
        this.fF = C18273f.b(this.bc);
        this.fG = C18274h.b(this.bc);
        this.fH = RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.create(a$c.I(a_c));
        this.fI = C18275j.b(this.fA, this.fE, this.fF, this.fG, this.fH);
        this.fJ = C18271b.b(this.bc);
        this.fK = C18276l.b(this.fA, this.fu, this.fJ);
        this.fL = fk.b(a$c.J(a_c), this.fw, this.fD, this.fI, this.fK, this.fz);
        this.fM = C13128u.b(this.fv, this.fL);
        this.fN = C17281c.a(fl.b(a$c.J(a_c), this.fM));
        this.fO = C17281c.a(com.tinder.data.message.bf.b(a$c.K(a_c), this.f14657J));
        this.fP = C17281c.a(C12826c.b(a$c.L(a_c), this.f14657J));
        this.fQ = C17281c.a(C12825b.b(a$c.L(a_c), this.fP));
        this.fR = C17281c.a(C12850b.b(a$c.M(a_c)));
        this.fS = C17281c.a(C12852d.b(a$c.M(a_c), this.fR));
        this.fT = C12849b.b(this.fS);
        this.fU = C17281c.a(C12851c.b(a$c.M(a_c), this.fT));
        this.fV = C12872a.b(this.bI, C12827c.c());
        this.fW = C17281c.a(C12873d.c());
        this.fX = C17281c.a(C12901b.c());
        this.fY = C17281c.a(C12874g.c());
        this.fZ = C17281c.a(C13252b.b(this.ag));
        this.ga = C12893m.b(this.fZ);
        this.gb = C12892j.b(this.fV, this.fW, this.fX, this.fY, this.bk, this.eY, this.ga, this.cX);
        this.gc = C17281c.a(this.gb);
        this.gd = C17281c.a(C12894o.c());
        this.ge = C17281c.a(C12908c.b(a$c.N(a_c), this.f14657J));
        this.gf = C17281c.a(C12907b.b(a$c.N(a_c), this.ge));
        this.gg = C17281c.a(PlacesLoadedStateProvider_Factory.create());
        this.gh = C17281c.a(di.b(a$c.b(a_c)));
        this.gi = de.b(a$c.b(a_c));
        this.gj = C17281c.a(cc.b(a$c.b(a_c), this.aa));
        this.gk = C13047f.b(this.f14669V);
        this.gl = C13051f.b(this.bI, this.gi, this.gj, this.dG, this.gk, this.cW);
        this.gm = am.b(com.tinder.data.adapter.ao.c());
        this.gn = ai.b(C12834m.c(), C12830d.c(), C12832g.c(), this.bJ, C12831e.c(), this.gm, com.tinder.data.adapter.ao.c(), this.bS, C12833k.c(), this.ed);
        this.go = AgeCalculator_Factory.create(this.cX);
        this.gp = C17281c.a(RecsModule_ProvidePlacesApiClientFactoryFactory.create(a$c.O(a_c), this.bI, this.gn, this.go, this.cW));
        this.gq = C17281c.a(RecsModule_ProvideRecsEventFactory.create(a$c.O(a_c), this.bc, this.ag));
        this.gr = C17281c.a(RecsModule_ProvideRecV2DomainApiAdapterFactory.create(a$c.O(a_c), this.gn, this.go));
        this.gs = RecsModule_ProvideCoreRecsApiClientFactory.create(a$c.O(a_c), this.bI, this.aP, this.gq, this.gr, this.f14651D, C12788d.c());
        this.gt = C17281c.a(RecsModule_ProvideFastMatchRecV2DomainApiAdapterFactory.create(a$c.O(a_c), this.gn, this.go));
        this.gu = C17281c.a(RecsModule_ProvideFastMatchApiClientFactory.create(a$c.O(a_c), this.bI, this.gt));
        this.gv = RecsModule_ProvideTopPicksRecV2DomainApiAdapterFactory.create(a$c.O(a_c), this.gn, this.go);
        this.gw = RecsModule_ProvideTopPicksRecDomainApiAdapterFactory.create(a$c.O(a_c), this.gv, C13114f.c());
        this.gx = RecsModule_ProvideTopPicksTeaserRecDomainApiAdapterFactory.create(a$c.O(a_c), this.bJ, C13114f.c());
        this.gy = RecsModule_ProvideTopPickResponseDomainApiAdapterFactory.create(a$c.O(a_c), this.gw, this.gx);
        this.gz = C17281c.a(TopPicksLoadingStatusProviderAndNotifier_Factory.create());
        this.gA = dn.b(a$c.b(a_c), this.aa);
        this.gB = C17884b.b(this.aa, this.dB);
        this.gC = C17889b.b(this.dB);
        this.gD = C17880b.b(this.dy, this.gB, this.dF, this.bc, this.gC, this.dG);
        this.gE = C18238i.b(this.gA, this.cw, this.dA, this.gD);
        this.gF = C17281c.a(RecsModule_ProvideTopPicksApiClientFactory.create(a$c.O(a_c), this.bI, this.gy, this.ca, this.gj, this.gz, this.gE));
        this.gG = C17281c.a(CardSizeProvider_Factory.create());
        this.gH = C17281c.a(RecsModule_ProvideRecsAdditionalDataPrefetcherFactory.create(a$c.O(a_c), this.aa, RecsPhotoUrlFactory_Factory.create(), this.gG));
        this.gI = C17281c.a(RecsModule_ProvideRecsAlreadySwipedProviderFactory.create(a$c.O(a_c)));
        this.gJ = C17281c.a(C12473r.b(a$c.z(a_c), this.eJ));
        this.gK = C17281c.a(TutorialSwipeRule_Factory.create(this.ak, this.ag, this.gJ));
        this.gL = C17281c.a(LocalOutOfLikesBouncerRule_Factory.create(this.aI));
        this.gM = C17281c.a(ThirdPartyClientModule_ProvideAdjustClient$Tinder_releaseFactory.create(a$c.P(a_c), this.aS, this.f14650C));
        this.gN = C17281c.a(C12450x3bbab36c.create(a$c.P(a_c), this.aS, this.f14650C));
        this.gO = C17281c.a(dp.b(a$c.b(a_c), this.dV, this.cD, this.gM, this.gN));
        this.gP = C18284c.b(this.aa);
        this.gQ = com.tinder.utils.aa.b(this.aa);
        this.gR = C17281c.a(C18154f.b(this.gO, this.cD, this.ag, this.bd, this.gP, this.gQ));
        this.gS = C13541c.b(this.dW);
        this.gT = C17281c.a(C12462g.b(a$c.z(a_c), this.f14659L));
        this.gU = C17281c.a(C12472q.b(a$c.z(a_c), this.gT));
        this.gV = C17281c.a(C12466k.b(a$c.z(a_c)));
    }

    /* renamed from: e */
    private void m18340e(a$c a_c) {
        this.gW = C12463h.b(a$c.z(a_c), this.gV);
        this.gX = C12475t.b(a$c.z(a_c), this.gU, this.gW, this.gJ);
        this.gY = AddRecsRateEvent_Factory.create(this.bc, this.ak, this.gR, this.eq, this.gS, this.aK, this.bW, this.gX);
        this.gZ = C17281c.a(RecsModule_ProvideRecsPhotoViewedCacheFactory.create(a$c.O(a_c)));
        this.ha = C17281c.a(UserRecSwipeAnalyticsRule_Factory.create(this.gY, this.gZ));
        this.hb = new C18316b();
        this.hc = C17281c.a(RatingRequestFactory_RatingRequestCommonFields_Factory_Factory.create(this.dW, this.eq, this.bW, this.cg, this.aK, this.hb));
        this.hd = C17281c.a(RatingRequestFactory_Factory.create(this.hc));
        this.he = C17281c.a(RatingResultAdapter_Factory.create());
        this.hf = C17281c.a(com.tinder.data.match.ak.c());
        this.hg = AddNewMatchEvent_Factory.create(this.bc, this.ai);
        this.hh = C13100f.b(this.fe, this.fm);
        this.hi = C13089w.b(this.f14669V);
        this.hj = C17281c.a(RecsModule_ProvideRatingsApiClientFactory.create(a$c.O(a_c), this.bI, this.hd, this.he, this.aI, this.dN, this.dX, C12937w.c(), this.hf, this.hb, this.bc, this.ag, this.hg, this.hh, this.hi));
        this.hk = C17281c.a(RecsModule_ProvideSwipeDataStoreFactory.create(a$c.O(a_c)));
        this.hl = C17281c.a(RecsModule_ProvideSwipeDispatcherFactoryFactory.create(a$c.O(a_c), this.hj, this.hk, this.gj));
        this.hm = C17281c.a(SwipeDispatchRule_Factory.create(this.hl, this.dX));
        this.hn = C17281c.a(DupesPreventionRule_Factory.create(this.gI));
        this.ho = C13491l.b(a$c.Q(a_c), this.f14659L);
        this.hp = C13495p.b(a$c.Q(a_c), this.ho);
        this.hq = C17281c.a(C13494o.b(a$c.Q(a_c), this.aS, this.hp));
        this.hr = C13477b.b(this.cw);
        this.hs = C18147b.b(this.cw);
        this.ht = C13503x.b(a$c.Q(a_c), this.hr, this.hs);
        this.hu = C18320l.a(0, 1).b(this.ht).a();
        this.hv = C13488i.b(a$c.Q(a_c));
        this.hw = C18320l.a(0, 1).b(this.hv).a();
        this.hx = C17281c.a(C13489j.b(a$c.Q(a_c), this.aa, this.hq, this.hu, this.hw));
        this.hy = C17281c.a(C13484e.b(a$c.Q(a_c), this.hx));
        this.hz = C13496q.b(a$c.Q(a_c));
        this.hA = C13502w.b(a$c.Q(a_c));
        this.hB = C17281c.a(C13500u.b(a$c.Q(a_c), this.hz, this.hA, this.aK));
        this.hC = C13481b.b(a$c.R(a_c), this.ag);
        this.hD = C13486g.b(a$c.Q(a_c), this.ag, this.hy, this.hB, this.hb, this.hC);
        this.hE = C18031b.b(this.hD);
        this.hF = C17281c.a(C12490g.c());
        this.hG = C17281c.a(C12491h.b(this.gr));
        this.hH = C17281c.a(C12485b.c());
        this.hI = C17281c.a(C12489f.b(this.bI, this.hG, this.hH, this.gj));
        this.hJ = C17281c.a(C12493j.b(this.hF, this.hI));
        this.hK = LoadSuperLikeableGame_Factory.create(this.hJ);
        this.hL = C12487d.b(this.hb);
        this.hM = SkipSuperLikeableGame_Factory.create(this.hJ, this.cX);
        this.hN = SuperLikeableGameSwipeTracker_Factory.create(C13164x2704b664.create(), this.cX);
        this.hO = C17281c.a(C12492i.b(SuperLikeableGamePlayCoordinator_GamePlayFlow_Factory.create(), this.hK, this.hL, this.hM, this.hN, this.hb, this.cX));
        this.hP = C8001b.b(this.cO);
        this.hQ = SuperLikeableGamePlayRule_Factory.create(this.hO, this.ag, this.hP);
        this.hR = C13487h.b(a$c.Q(a_c), this.hx);
        this.hS = C18006a.b(this.hC);
        this.hT = C18013q.b(this.bc, this.hS);
        this.hU = C17281c.a(com.tinder.recsads.analytics.ab.c());
        this.hV = C18009i.b(this.bc, this.hS);
        this.hW = AdEventFields_Factory_Factory.create(this.hC);
        this.hX = V1AddAdOpenEvent_Factory.create(this.bc, this.hW);
        this.hY = C17281c.a(AdSwipeTerminationRule_Factory.create(this.hC, this.hR, this.ag, this.hT, this.hU, this.hV, this.hX));
        this.hZ = NativeDfpAdPostSwipeProcessingRule_Factory.create(this.hR, this.ag);
        this.ia = CreateMessageAdMatch_Factory.create(this.fe, this.fm, this.cC);
        this.ib = C13490k.b(a$c.Q(a_c), this.ag, this.ia, C18032d.c(), C7987x176dd5ef.create(), this.hf, this.hR);
        this.ic = C17281c.a(com.tinder.app.dagger.module.ab.b(a$c.S(a_c), this.f14659L));
        this.id = ac.b(a$c.S(a_c), this.ic);
        this.ie = C17281c.a(C12787b.b(C12775b.c()));
        this.f14684if = C17281c.a(C12785d.b(this.ie, this.dy));
        this.ig = AddRecsSessionEvent_Factory.create(this.bc);
        this.ih = C17281c.a(RecsModule_RecsSessionTrackerFactory.create(a$c.O(a_c), this.f14684if, this.ig, RecsSessionTracker_RecsSessionFactory_Factory.create()));
        this.ii = RecsModule_RecsSessionTrackerRuleFactory.create(a$c.O(a_c), this.ih);
        this.ij = C12470o.b(a$c.z(a_c), this.gU);
        this.ik = FireboardingSuperlikeRule_Factory.create(this.ij, this.gJ);
        this.il = CardStackSwipeProcessingRulesResolver_Factory.create(this.gK, this.gL, this.ha, this.hm, this.hn, this.hE, this.hQ, SwipeCadenceControlRule_Factory.create(), this.hY, this.hZ, this.ib, this.id, this.ii, this.ik);
        this.im = RecsModule_ProvideFastMatchSwipeProcessingRulesResolverFactory.create(a$c.O(a_c), this.hm, this.hn, this.ha);
        this.in = RecsModule_ProvidePlacesSwipeProcessingRulesResolverFactory.create(a$c.O(a_c), this.hm, this.hn, this.ha, this.gL);
        this.io = RecsModule_ProvideTopPicksSwipeProcessingRulesResolverFactory.create(a$c.O(a_c), this.hm, this.hn, this.ha);
        this.ip = C17281c.a(C8024z.b(this.bc, this.ag));
        this.iq = RecsModule_ProvideRecsEngineConfiguratorFactoryFactory.create(a$c.O(a_c), this.gs, this.gu, this.gF, this.gp, this.gH, this.gj, this.gI, this.il, this.im, this.in, this.io, this.ip);
        C18316b c18316b = (C18316b) this.hb;
        this.hb = C17281c.a(RecsModule_ProvideRecsEngineRegistryFactory.create(a$c.O(a_c), this.iq));
        c18316b.a(this.hb);
        this.ir = C17281c.a(dj.b(a$c.b(a_c), this.gh, this.gl, this.gp, this.hb, this.ip));
        this.is = C17281c.a(C13306h.c());
        this.it = C17281c.a(RecSourceProvider_Factory.create());
        this.iu = C17281c.a(RecsEngineProvider_Factory.create());
        this.iv = C17281c.a(dc.b(a$c.b(a_c), this.dW));
        this.iw = ObserveDiscoverySettings_Factory.create(this.cC);
        this.ix = C17281c.a(RecsEngineResolver_Factory.create(this.it, this.hb, this.iu, this.iv, this.iw, this.hk, this.hm));
        this.f14688m = a$c.Q(a_c);
        this.iy = C8005f.b(this.bc);
        this.iz = C12822d.b(this.dm, this.iy);
        this.iA = C12820d.b(this.fU);
        this.iB = C12821b.b(this.iz, this.iA, this.cw);
        this.iC = C17281c.a(this.iB);
        this.iD = C17736c.b(this.f14657J, this.aY, this.aG, this.cL);
        this.iE = C13576k.b(this.gl, this.cp, this.aW, this.ip, this.cX);
        this.iF = ey.b(a$c.T(a_c));
        this.iG = C17281c.a(C13599n.b(this.ei, this.aG, this.cn));
        this.iH = C13561k.b(this.bc);
        this.iI = C17281c.a(C17737d.b(this.iD, this.co, this.iE, this.iF, this.iG, this.fx, this.iH, this.fH));
        this.iJ = ObserveHasNewFeedItems_Factory.create(this.gc);
        this.iK = ObserveFeed_Factory.create(this.gc);
        this.iL = ObserveCurrentUser_Factory.create(this.cC);
        this.iM = C17281c.a(C12824b.b(this.ag, this.fZ));
        this.iN = C13279c.b(this.iM);
        this.iO = C13265d.b(this.iN);
        this.iP = C13296f.b(this.iK, this.iL, C13294d.c(), this.iO, this.iM, this.fZ);
    }

    /* renamed from: f */
    private void m18343f(a$c a_c) {
        this.iQ = C17281c.a(C13244i.b(this.iP));
        this.iR = C17281c.a(C13240e.c());
        this.iS = C17281c.a(com.tinder.module.af.b(a$c.l(a_c)));
        this.iT = C17281c.a(com.tinder.module.ag.b(a$c.l(a_c)));
        this.iU = C17281c.a(C13157x3838645d.create(a$c.I(a_c)));
        this.iV = C17281c.a(C13246m.b(this.iR, this.iS, this.iT, this.fY, this.iU));
        this.iW = C17281c.a(C13247p.b(this.iJ, this.iQ, this.iV, this.cw));
        this.iX = C17281c.a(C13241g.b(this.iW, this.iQ, this.iU));
        this.f14689n = a$c.l(a_c);
        this.iY = C17281c.a(C18247b.b(this.fz, this.ag));
        this.iZ = C18251d.b(C18253f.c());
        this.ja = C18257k.b(C18249b.c());
        this.jb = C18246c.b(this.fA, this.iZ, this.ja);
        this.jc = C17281c.a(C18263d.b(this.cA, this.jb, C18260b.c()));
        this.jd = GetMatch_Factory.create(this.fe);
        this.je = ds.b(a$c.b(a_c));
        this.jf = C18265e.b(this.jc);
        this.jg = C12688c.b(this.fm, this.jd, this.cC, this.je, this.jf);
        this.jh = C18264c.b(this.jg, this.bc, this.fH, this.cX);
        this.ji = C13153xad945d7.create(a$c.t(a_c));
        this.jj = C18270f.b(this.jc, this.fH, this.fB, this.jh, this.ji);
        this.jk = C18268b.b(this.iY, this.jj, C18269d.c());
        this.jl = C17281c.a(this.jk);
        this.jm = C17864b.b(this.bI, this.dS);
        this.jn = C13348b.b(this.bB, this.bZ, this.jm, this.cw);
        this.jo = C17281c.a(this.jn);
        this.jp = C18320l.a(1, 0).a(this.jo).a();
        this.jq = C17281c.a(C13350b.b(this.jp));
        this.jr = C13343n.b(this.dV, this.ag, this.cD, this.en);
        this.js = C17281c.a(com.tinder.managers.ak.b(this.cJ, this.bx, this.ak, this.bd, this.aN, this.jr, this.bc, this.ag, this.aY, this.cC, this.ej));
        this.jt = C17281c.a(bz.b(a$c.b(a_c), this.eT));
        this.ju = C17281c.a(C13132d.c());
        this.jv = C17281c.a(com.tinder.module.bh.b(a$c.U(a_c), this.ag, this.ju));
        this.jw = C17281c.a(bi.b(a$c.U(a_c), this.cD, this.bd, this.aa, this.jv));
        this.jx = C17281c.a(C17801o.b(this.bB, this.et));
        this.jy = C17281c.a(da.b(a$c.b(a_c)));
        this.jz = C17281c.a(bb.b(a$c.p(a_c), this.bI));
        this.jA = C13090b.b(this.aK);
        this.jB = C12867e.b(this.bI, this.cc, this.dJ);
        this.jC = C18278k.b(this.cp);
        this.jD = C18279n.b(this.cp);
        this.jE = C17281c.a(com.tinder.purchase.register.al.b(this.dS, this.bB, this.jz, this.eq, this.ek, this.et, this.aN, this.aK, this.jA, this.bW, this.jB, this.jC, this.jD, this.ej, this.ag, this.cC));
        this.jF = C17281c.a(bc.b(a$c.p(a_c), this.jE));
        this.jG = C17281c.a(C12560e.c());
        this.jH = C17281c.a(C12561b.c());
        this.f14690o = a$c.I(a_c);
        this.jI = C13340b.b(this.dm, this.db, this.aR);
        this.jJ = C13078f.b(this.bO, this.bR);
        this.jK = C12567b.b(this.ak);
        this.jL = C12570e.b(this.bl, this.bj);
        this.jM = C12483c.b(a$c.V(a_c), this.dm);
        this.jN = C12484d.b(a$c.V(a_c), this.aP);
        this.jO = C12494e.b(a$c.V(a_c), this.jr);
        this.jP = C12496g.b(a$c.V(a_c), this.fN);
        this.jQ = C12495f.b(a$c.V(a_c), this.jl);
        this.jR = C8004b.b(this.ag, this.bc);
        this.jS = C12482b.b(a$c.V(a_c), this.bf, this.jR);
        this.jT = C18320l.a(6, 0).a(this.jM).a(this.jN).a(this.jO).a(this.jP).a(this.jQ).a(this.jS).a();
        this.jU = C12591r.b(this.bs, this.bp, this.jJ, this.jK, this.jL, this.jT);
        this.jV = C12593t.b(this.aZ, this.ba);
        this.jW = C12585n.b(this.dm, this.bg, this.fN, this.jl);
        this.jX = C17281c.a(co.b(a$c.b(a_c), this.aa));
        this.jY = C18055c.b(this.bc);
        this.jZ = C17819b.b(C17820i.c());
        this.ka = C17869d.b(this.jZ, this.bB, this.et, this.dS, C17804b.c());
        this.kb = C18056e.b(this.dy, this.ej, this.ag, this.fx);
        this.kc = C18048f.b(this.cI);
        this.kd = C17281c.a(C13483do.b(a$c.b(a_c), this.cK, this.kc));
        this.ke = C17281c.a(C18047d.b(this.kd, this.dy));
        this.kf = C18045c.b(this.bc);
        this.kg = C17281c.a(C18046f.b(this.kd, this.f14684if, this.kf));
        this.kh = cj.b(a$c.b(a_c), this.cg, this.f14659L);
        this.ki = C17281c.a(ck.b(a$c.b(a_c), this.kh));
        this.kj = ca.b(a$c.b(a_c));
        this.kk = C13332b.b(a$c.A(a_c));
        this.kl = C17281c.a(C8002d.b(this.f14684if, this.ki, this.kj, this.bc, this.kk));
        this.km = C17281c.a(C18057h.b(this.eN, this.jX, this.jY, this.jr, this.ag, this.ej, this.aG, this.ka, this.cS, this.bF, this.kb, this.dl, this.ke, this.kg, this.kl));
        this.kn = C17281c.a(com.tinder.presenters.de.b(this.jI, this.bg, this.dj, C12586p.c(), this.jU, this.ag, this.bp, this.dk, this.jV, this.dm, this.dg, this.jW, this.km, this.jK, this.jR));
        this.ko = C17281c.a(C12599o.b(a$c.i(a_c)));
        this.f14691p = a$c.p(a_c);
        this.kp = C17281c.a(ek.b(a$c.f(a_c), this.dU, this.cD, this.aY, this.aN, this.eN));
        this.f14692q = a$c.m(a_c);
        this.kq = C17834g.b(a$c.m(a_c));
        this.kr = C17281c.a(C17821m.b(this.bB, this.kq));
        this.ks = C17281c.a(C17803d.c());
        this.kt = C17281c.a(dq.b(a$c.b(a_c)));
        this.f14693r = a$c.a(a_c);
        this.ku = C18204h.b(this.dV, this.aN, this.ak, this.bc, this.bB, this.et, this.jx, this.ag);
        this.kv = C17281c.a(C13549c.b(this.ku));
        this.kw = C17281c.a(com.tinder.managers.bi.b(this.bx, this.bc, this.aY, this.ag));
        this.kx = C17281c.a(eo.b(a$c.f(a_c), this.dU, this.bx, this.cH));
        this.f14694s = a$c.W(a_c);
        this.ky = aw.b(a$c.p(a_c), this.jE);
        this.kz = C17281c.a(C18186d.b(this.bc, this.ky, this.ek, this.bB, C12788d.c()));
        this.f14695t = a$c.c(a_c);
        this.kA = C18060c.b(this.aW, this.ag);
        this.kB = C17281c.a(cg.b(a$c.b(a_c), this.kA));
        this.kC = C17281c.a(C13552n.b(C13553c.c()));
        this.kD = C17281c.a(C17802b.c());
        this.kE = C17281c.a(C13551g.c());
    }

    /* renamed from: g */
    private void m18346g(a$c a_c) {
        this.kF = C17281c.a(bv.b(a$c.b(a_c)));
        this.kG = C17281c.a(ef.b(a$c.f(a_c), this.f14656I));
        this.kH = C17281c.a(C18155c.b(this.kF, this.kG, this.aO));
        this.f14696u = a$c.x(a_c);
        this.f14697v = a$c.X(a_c);
        this.kI = C17281c.a(C12615c.b(a$c.X(a_c)));
        this.kJ = C17281c.a(C13208f.c());
        this.kK = C17281c.a(com.tinder.managers.bp.b(this.dU, this.bx));
        this.kL = C17281c.a(TappyConfigProvider_Factory.create(this.ag, this.f14659L));
        this.kM = C17281c.a(RecsModule_ProvideRecsPhotoViewDuplicateEventCheckerFactory.create(a$c.O(a_c)));
        this.kN = C17281c.a(RecsAllPhotosViewedDuplicateEventChecker_Factory.create());
        this.kO = com.tinder.profile.p363b.ap.b(this.bI);
        this.kP = an.b(this.bI);
        this.kQ = UnMatch_Factory.create(this.fe);
        this.kR = com.tinder.profile.p363b.ah.b(this.bI, this.bc, this.ag);
        this.kS = C17281c.a(C12841b.c());
        this.kT = C17281c.a(C13436h.b(C12775b.c()));
        this.kU = C17281c.a(C12805b.b(this.cJ, this.aO));
        this.kV = C17281c.a(com.tinder.module.an.b(a$c.l(a_c)));
        this.kW = GetProfileOptionData_Factory.create(this.f14670W);
        this.kX = CheckTutorialViewed_Factory.create(this.kW, OnboardingTutorialAdapter_Factory.create());
        this.kY = ConfirmTutorialsViewed_Factory.create(this.kX, this.ei);
        this.kZ = C17281c.a(C13596d.c());
        this.la = C13598l.b(this.bk);
        this.lb = C12813i.b(this.ad);
        this.lc = C12815q.b(this.lb, C12790h.c());
        this.ld = C13560c.b(this.bc);
        this.le = C17281c.a(C13597i.b(this.la, this.co, this.iG, this.lc, this.ld));
        this.lf = C17281c.a(com.tinder.module.ar.b(a$c.l(a_c), this.bc, this.ag));
        this.lg = C17281c.a(C13324b.b(C12775b.c()));
        this.lh = C12481z.b(a$c.z(a_c), this.bm);
        this.li = C17281c.a(C12471p.b(a$c.z(a_c), this.gV));
        this.lj = C12476u.b(a$c.z(a_c), this.hb);
        this.lk = C17281c.a(C12468m.b(a$c.z(a_c), this.hb, this.lj));
        this.ll = C17281c.a(C12469n.b(a$c.z(a_c), this.lk));
        this.lm = C17281c.a(RecsModule_ProvideRewindsAvailableRepositoryFactory.create(a$c.O(a_c), this.f14659L));
        this.ln = RecsModule_ProvideIncrementRewindsAvailableFactory.create(a$c.O(a_c), this.lm);
        this.lo = C12457b.b(a$c.z(a_c), this.bc);
        this.lp = C17281c.a(C12461f.b(a$c.z(a_c), this.gT, this.ln, this.lo));
        this.lq = C12478w.b(a$c.z(a_c), this.hb);
        this.lr = C17281c.a(C12460e.b(a$c.z(a_c), this.gT, this.lq));
        this.ls = C18320l.a(3, 0).a(this.ll).a(this.lp).a(this.lr).a();
        this.lt = C17281c.a(C12458c.b(a$c.z(a_c), this.gT));
        this.lu = C17812d.b(a$c.m(a_c), this.kD, this.ks);
        this.lv = C17281c.a(C12465j.b(a$c.z(a_c), this.gJ, this.ic, this.lh, this.li, this.ls, this.lt, this.lu, this.gU));
        this.lw = C17281c.a(C12467l.b(a$c.z(a_c), this.lv));
        this.lx = es.b(a$c.Y(a_c), this.fZ, this.kT, C13415c.c());
        this.ly = C17281c.a(C13330d.b(this.lg, this.lx));
        this.lz = LegacyAddAdRequestSendEvent_Factory.create(this.hC, this.bc);
        this.lA = LegacyAddAdRequestReceiveEvent_Factory.create(this.bc, this.hW);
        this.lB = V1AnalyticsAdAggregatorListener_Factory.create(this.lz, this.lA);
        this.lC = C7983xedb30ee4.create(C18016b.c());
        this.lD = AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener_Factory.create(this.hR, this.lC, C18022e.c());
        this.lE = C7986xbb8d6348.create(this.hR, C7985x316be0b0.create(), C18025k.c());
        this.lF = C13497r.b(a$c.Q(a_c), this.lB, this.lD, this.lE);
        this.lG = C18320l.a(0, 1).b(this.lF).a();
        this.lH = C18012o.b(this.hC, this.bc);
        this.lI = C18011m.b(this.bc, this.hS);
        this.lJ = AnalyticsAdAggregatorListener_Factory.create(this.lH, this.lI);
        this.lK = BrandedProfileCardTrackingUrlsAdAggregatorListener_Factory.create(this.hR, C18022e.c());
        this.lL = NativeVideoAndDisplayTrackingUrlAdAggregatorListener_Factory.create(this.hR, C18025k.c());
        this.lM = C13485f.b(a$c.Q(a_c), this.lJ, this.lK, this.lL);
        this.lN = C18320l.a(0, 1).b(this.lM).a();
        this.lO = C17281c.a(C13501v.b(a$c.Q(a_c), this.ag, this.hy, this.aG, this.hB, this.aK, this.lG, this.lN, this.hC));
        this.lP = C13498s.b(a$c.Q(a_c), this.aa);
        this.lQ = C13493n.b(a$c.Q(a_c), this.aa);
        this.lR = C12808d.b(this.kU);
        this.lS = DfpPublisherAdRequestFactory_Factory.create(this.lR, this.cC, this.go);
        this.lT = C13499t.b(a$c.Q(a_c), this.lS);
        this.f14698w = a$c.R(a_c);
        this.lU = C13482c.b(a$c.R(a_c), this.ag);
        this.lV = C13505z.b(a$c.Q(a_c));
        this.lW = C13333c.b(a$c.A(a_c));
        this.lX = C17281c.a(C13504y.b(a$c.Q(a_c), this.hq));
        this.lY = C17281c.a(C12838b.b(a$c.Z(a_c), this.eW));
        this.lZ = C17281c.a(C12839c.b(a$c.Z(a_c), this.lX, this.lY));
        this.ma = C17281c.a(C13434c.b(C12775b.c()));
        this.mb = C17281c.a(C17776b.b(C12775b.c()));
        this.mc = C13156x9c0cf4b0.create(a$c.I(a_c));
        this.md = C17281c.a(C13218d.b(this.lg, this.lx));
        this.me = C17281c.a(RecsModule_ProvideRatingProcessorFactory.create(a$c.O(a_c), this.hl));
        this.mf = C12626f.b(this.kX, this.ak);
        this.mg = C12625b.b(this.eq);
        this.mh = C12459d.b(a$c.z(a_c), this.lv);
        this.mi = C12477v.b(a$c.z(a_c), this.hb);
        this.mj = C12479x.b(a$c.z(a_c), this.gU, this.lj, this.gJ);
        this.mk = com.tinder.profile.p363b.aa.b(this.bI);
        this.ml = C17754l.b(this.bc);
        this.mm = al.b(this.ak, this.dW);
        this.mn = RecsModule_ProvideDescrementRewindsAvailableFactory.create(a$c.O(a_c), this.lm);
        this.mo = RecsModule_ProvideObserveRewindsAvailableFactory.create(a$c.O(a_c), this.lm);
        this.mp = C17281c.a(UserRecActivePhotoIndexProvider_Factory.create());
        this.mq = AddRecsViewEvent_Factory.create(this.bc, this.ak);
        this.mr = C17281c.a(UserRecCardPresenter_Factory.create(this.mq));
        this.f14699x = a$c.z(a_c);
        this.ms = C17281c.a(C13318e.b(this.ag, this.eq, this.dX, C12790h.c(), this.dy));
        this.mt = SetDiscoverability_Factory.create(this.cD);
        this.mu = C13417c.b(a$c.W(a_c), this.fe, this.fm);
        this.mv = C13418d.b(a$c.W(a_c), this.fe, this.fm);
        this.mw = C13419e.b(a$c.W(a_c));
    }

    /* renamed from: h */
    private void m18349h(a$c a_c) {
        this.mx = C13416b.b(a$c.W(a_c), this.fe);
        this.my = C17281c.a(C13245l.b(this.iV, C12775b.c(), this.iS, this.iT));
        this.mz = C17281c.a(C13264b.b(C12775b.c()));
        this.f14700y = a$c.e(a_c);
        this.mA = C13074b.b(this.aG);
        this.mB = C13059b.b(this.bO, this.bJ, C12837x.c());
        this.mC = C13084e.b(this.f14669V);
        this.mD = C13083c.b(this.mC);
        this.mE = C13060d.b(this.mA, this.mB, this.mD, this.bL, this.aG);
        this.mF = ct.b(a$c.b(a_c), this.ag);
        this.mG = cv.b(a$c.b(a_c), this.mF);
        this.mH = C13557b.b(this.cD, this.ak);
        this.mI = C13550b.b(this.gA);
        this.mJ = C17281c.a(C12488e.c());
        this.mK = C17281c.a(C13112b.c());
        this.mL = C17281c.a(SuperLikeRatingStatusProviderAndNotifier_Factory.create(C12612b.c()));
        this.mM = C17281c.a(RecsModule_ProvideSuperLikeRatingStatusProviderFactory.create(a$c.O(a_c), this.mL));
        this.mN = C17281c.a(RecsModule_ProvideSuperLikeRatingStatusNotifierFactory.create(a$c.O(a_c), this.mL));
        this.mO = ResetTopPickSession_Factory.create(this.mK, this.hb);
        this.mP = ObserveTopPicksSession_Factory.create(this.mK);
        this.mQ = ObserveTopPicksScreenState_Factory.create(this.aK, this.mP, this.cw);
        this.mR = ResetScreenState_Factory.create(this.hb, this.mO, this.mQ, this.cX);
        this.mS = C18231b.b(this.iv, this.mR);
        this.mT = C18227b.b(this.iw, this.mR);
        this.mU = C18228d.b(this.aK, this.mO);
        this.mV = C18320l.a(3, 0).a(this.mS).a(this.mT).a(this.mU).a();
        this.mW = C17281c.a(C18229f.b(this.mV));
        this.mX = C17281c.a(C18230c.b(this.dy, this.mW));
        this.mY = C17281c.a(C18292c.b(a$c.aa(a_c), this.aa));
        this.mZ = C18293d.b(a$c.aa(a_c));
        this.na = C18291b.b(a$c.aa(a_c));
        this.nb = C18294e.b(a$c.aa(a_c), this.na);
        this.nc = C18295f.b(a$c.aa(a_c), this.nb);
        this.nd = C17281c.a(C18290b.b(this.mY, this.mZ, this.nc, this.aa));
        this.ne = C12848c.b(this.f14657J);
        this.nf = C17281c.a(C12847b.b(a$c.ab(a_c), this.ne));
        this.ng = C12905b.b(this.bk);
        this.nh = C17281c.a(C12906d.b(this.ng));
        this.f14701z = a$c.H(a_c);
        this.ni = C12809b.b(this.ag);
        this.nj = C17281c.a(ThirdPartyClientModule_ProvideGiphyApi$Tinder_releaseFactory.create(a$c.P(a_c), this.aS, this.f14651D, C12788d.c()));
        this.nk = C12899f.b(this.nj, C12938b.c());
        this.nl = C12900i.b(C12778b.c(), this.bI, C12938b.c());
        this.nm = C12898c.b(this.ni, this.nk, this.nl);
        this.nn = C17281c.a(C12962x.b(a$c.H(a_c), this.nm));
        this.no = C17281c.a(C18262b.b(C12612b.c()));
        this.f14648A = a$c.s(a_c);
        this.np = C17281c.a(dg.b(a$c.b(a_c)));
        this.nq = C17281c.a(com.tinder.module.bt.b(a$c.b(a_c)));
        this.f14649B = a$c.T(a_c);
        this.nr = C17281c.a(C13595b.c());
    }

    public ProfilePhotoRepository profilePhotoRepository() {
        return m18345g();
    }

    public IsExternalReadPermissionGranted isExternalReadPermissionGranted() {
        return m18347h();
    }

    public LoopsPhase1Experiment LoopsPhase1Experiment() {
        return ct.a(this.f14674a, (AbTestUtility) this.ag.get());
    }

    public MaxPhotoExperiment MaxPhotoExperiment() {
        return cv.a(this.f14674a, LoopsPhase1Experiment());
    }

    public WebProfileRepository webProfileRepository() {
        return m18352j();
    }

    public InputMethodManager inputMethodManager() {
        return (InputMethodManager) this.dx.get();
    }

    public TopPicksNotificationDispatcher topPicksNotificationDispatcher() {
        return m18366q();
    }

    public TopPicksConfig topPicksConfig() {
        return C12545o.a(this.f14675b, C17281c.b(this.cf));
    }

    public TopPicksApplicationRepository topPicksApplicationRepository() {
        return m18370s();
    }

    public PaywallRepository paywallRepository() {
        return (PaywallRepository) this.dI.get();
    }

    public ProfileRemoteRepository profileRemoteRepository() {
        return m18192E();
    }

    public LoadEmailDisplaySettings provideLoadEmailDisplaySettings() {
        return com.tinder.module.bk.a(this.f14677d, loadProfileOptionData(), (UserMetaManager) this.eN.get());
    }

    public Logger provideLogger() {
        return C12842e.c(this.f14679e);
    }

    public NotificationSettingsRepository notificationSettingsRepository() {
        return m18226V();
    }

    public Resources resources() {
        return dn.a(this.f14674a, (Context) this.aa.get());
    }

    public NotificationManager notificationManager() {
        return (NotificationManager) this.dB.get();
    }

    public LoadProfileOptionData loadProfileOptionData() {
        return new LoadProfileOptionData(m18228W());
    }

    public FastMatchConfigProvider fastMatchConfigProvider() {
        return (FastMatchConfigProvider) this.bW.get();
    }

    public SubscriptionProvider subscriptionProvider() {
        return (SubscriptionProvider) this.aK.get();
    }

    public Context provideApplicationContext() {
        return (Context) this.aa.get();
    }

    public CheckTutorialViewedStatus provideCheckedTutorialViewedStatus() {
        return CommonDomainModule_ProvideCheckedTutorial$domain_releaseFactory.proxyProvideCheckedTutorial$domain_release(this.f14676c, m18232Y());
    }

    public ConfirmTutorialsViewedStatus provideConfirmTutorialViewedStatus() {
        return CommonDomainModule_ProvideConfirmTutorial$domain_releaseFactory.proxyProvideConfirmTutorial$domain_release(this.f14676c, m18235Z());
    }

    public BitmojiAuthRepository bitmojiAuthRepository() {
        return (BitmojiAuthRepository) this.ch.get();
    }

    public ProfileLocalRepository profileLocalRepository() {
        return m18228W();
    }

    public BitmojiImageUrlRepository bitmojiImageUrlRepository() {
        return (BitmojiImageUrlRepository) this.cl.get();
    }

    public C2630h fireworks() {
        return (C2630h) this.bc.get();
    }

    public C15679f mainThreadScheduler() {
        return C13333c.c(this.f14682h);
    }

    public ProfileComponent.Builder profileComponentBuilder() {
        return new a$ab(this, null);
    }

    public CensorViewComponent.Builder reusuableComponentBuilder() {
        return new a$d(this, null);
    }

    public MainActivityComponent.Builder newMainActivityComponentBuilder() {
        return new a$m(this, null);
    }

    public ChatActivitySubcomponent.Builder chatActivityComponentBuilder() {
        return new a$f(this, null);
    }

    public FastMatchRecsActivityComponent.Builder fastMatchRecsActivityComponentBuilder() {
        return new a$i(this, null);
    }

    public PlacesRecsComponent.Builder placesRecsComponentBuilder() {
        return new a$v(this, null);
    }

    public PlacesComponent.Builder placesComponentBuilder() {
        return new a$p(this, null);
    }

    public PlacesOnboardingComponent.Builder placesOnboardingComponentBuilder() {
        return new a$t(this, null);
    }

    public PlacesDisabledSurveyComponent.Builder placesDisabledSurveyComponentBuilder() {
        return new a$r(this, null);
    }

    public PlacesSurveyOtherComponent.Builder placesSurveyOtherComponentBuilder() {
        return new a$z(this, null);
    }

    public PlacesSettingsComponent.Builder placesSettingsComponentBuilder() {
        return new a$x(this, null);
    }

    public FeedSettingsActivityComponent.Builder feedSettingsActivityComponentBuilder() {
        return new a$k(this, null);
    }

    public AutoPlayLoopsOptionsActivityComponent.Builder autoPlayLoopsSettingsActivityComponentBuilder() {
        return new a$a(this, null);
    }

    public void inject(ManagerApp managerApp) {
        m18283a(managerApp);
    }

    public void inject(ActivityBase activityBase) {
        m18257a(activityBase);
    }

    public void inject(ActivityVerification activityVerification) {
        m18245a(activityVerification);
    }

    public void inject(ActivityPassport activityPassport) {
        m18292a(activityPassport);
    }

    public void inject(ActivitySignedInBase activitySignedInBase) {
        m18258a(activitySignedInBase);
    }

    public void inject(ActivityAddPhoto activityAddPhoto) {
        m18240a(activityAddPhoto);
    }

    public void inject(ActivityBanned activityBanned) {
        m18241a(activityBanned);
    }

    public void inject(ActivityEditProfile activityEditProfile) {
        m18242a(activityEditProfile);
    }

    public void inject(LoginActivity loginActivity) {
        m18246a(loginActivity);
    }

    public void inject(WebViewActivityInstagram webViewActivityInstagram) {
        m18248a(webViewActivityInstagram);
    }

    public void inject(ActivityGiphy activityGiphy) {
        m18243a(activityGiphy);
    }

    public void inject(ActivityTPlusControl activityTPlusControl) {
        m18320a(activityTPlusControl);
    }

    public void inject(SettingsActivity settingsActivity) {
        m18303a(settingsActivity);
    }

    public void inject(ActivityJob activityJob) {
        m18244a(activityJob);
    }

    public void inject(SchoolActivity schoolActivity) {
        m18247a(schoolActivity);
    }

    public void inject(SpotifyAuthActivity spotifyAuthActivity) {
        m18311a(spotifyAuthActivity);
    }

    public void inject(GenderSearchActivity genderSearchActivity) {
        m18302a(genderSearchActivity);
    }

    public void inject(UpdateAccountEmailPasswordActivity updateAccountEmailPasswordActivity) {
        m18237a(updateAccountEmailPasswordActivity);
    }

    public void inject(FragmentEditProfile fragmentEditProfile) {
        m18273a(fragmentEditProfile);
    }

    public void inject(C13308g c13308g) {
        m18278a(c13308g);
    }

    public void inject(C13310q c13310q) {
        m18280a(c13310q);
    }

    public void inject(FragmentMap fragmentMap) {
        m18274a(fragmentMap);
    }

    public void inject(IntroFragment introFragment) {
        m18282a(introFragment);
    }

    public void inject(FragmentAgeMoreGender fragmentAgeMoreGender) {
        m18272a(fragmentAgeMoreGender);
    }

    public void inject(com.tinder.fragments.am amVar) {
        m18275a(amVar);
    }

    public void inject(com.tinder.fragments.ap apVar) {
        m18276a(apVar);
    }

    public void inject(com.tinder.fragments.as asVar) {
        m18277a(asVar);
    }

    public void inject(AccountKitErrorHeaderFragment accountKitErrorHeaderFragment) {
        m18252a(accountKitErrorHeaderFragment);
    }

    public void inject(C12265d c12265d) {
        m18293a(c12265d);
    }

    public void inject(TinderPlusPaywallDialog tinderPlusPaywallDialog) {
        m18322a(tinderPlusPaywallDialog);
    }

    public void inject(com.tinder.dialogs.ad adVar) {
        m18266a(adVar);
    }

    public void inject(C8257a c8257a) {
        m18250a(c8257a);
    }

    public void inject(DialogIsTween dialogIsTween) {
        m18265a(dialogIsTween);
    }

    public void inject(C12043a c12043a) {
        m18285a(c12043a);
    }

    public void inject(BoostPaywallDialog boostPaywallDialog) {
        m18259a(boostPaywallDialog);
    }

    public void inject(BoostSummaryDialog boostSummaryDialog) {
        m18260a(boostSummaryDialog);
    }

    public void inject(BoostUpdateDialog boostUpdateDialog) {
        m18261a(boostUpdateDialog);
    }

    public void inject(SuperlikePaywallDialog superlikePaywallDialog) {
        m18318a(superlikePaywallDialog);
    }

    public void inject(GCMRegistrationIntentService gCMRegistrationIntentService) {
        m18300a(gCMRegistrationIntentService);
    }

    public void inject(ProcessingPhotosTaskService processingPhotosTaskService) {
        m18301a(processingPhotosTaskService);
    }

    public void inject(MapFrameLayout mapFrameLayout) {
        m18325a(mapFrameLayout);
    }

    public void inject(SpotifyConnectView spotifyConnectView) {
        m18312a(spotifyConnectView);
    }

    public void inject(SpotifyPickArtistView spotifyPickArtistView) {
        m18313a(spotifyPickArtistView);
    }

    public void inject(SpotifyThemeSongView spotifyThemeSongView) {
        m18315a(spotifyThemeSongView);
    }

    public void inject(SpotifyTrackSearchView spotifyTrackSearchView) {
        m18317a(spotifyTrackSearchView);
    }

    public void inject(SpotifyTopTrackItemView spotifyTopTrackItemView) {
        m18316a(spotifyTopTrackItemView);
    }

    public void inject(LoginButtonGroupView loginButtonGroupView) {
        m18256a(loginButtonGroupView);
    }

    public void inject(MoreGenderView moreGenderView) {
        m18308a(moreGenderView);
    }

    public void inject(GenderSearchView genderSearchView) {
        m18307a(genderSearchView);
    }

    public void inject(ShowMeView showMeView) {
        m18310a(showMeView);
    }

    public void inject(TimeSinceTextView timeSinceTextView) {
        m18281a(timeSinceTextView);
    }

    public void inject(UpdateEmailView updateEmailView) {
        m18238a(updateEmailView);
    }

    public void inject(UpdatePasswordView updatePasswordView) {
        m18239a(updatePasswordView);
    }

    public void inject(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl) {
        m18321a(recyclerAdapterTPlusControl);
    }

    public void inject(C10076o c10076o) {
        m18294a(c10076o);
    }

    public void inject(AppLifeCycleTracker appLifeCycleTracker) {
        m18323a(appLifeCycleTracker);
    }

    public void inject(SpotifyPlayerView spotifyPlayerView) {
        m18314a(spotifyPlayerView);
    }

    public void inject(OkHttpGlideModule okHttpGlideModule) {
        m18324a(okHttpGlideModule);
    }

    public void inject(C10443i c10443i) {
        m18262a(c10443i);
    }

    public void inject(C13309n c13309n) {
        m18279a(c13309n);
    }

    public void inject(PhotoSourceSelectorSheetDialog photoSourceSelectorSheetDialog) {
        m18286a(photoSourceSelectorSheetDialog);
    }

    public void inject(LoginAccountKitUiManager loginAccountKitUiManager) {
        m18253a(loginAccountKitUiManager);
    }

    public void inject(ValidateAccountKitUiManager validateAccountKitUiManager) {
        m18254a(validateAccountKitUiManager);
    }

    public void inject(TinderGcmListenerService tinderGcmListenerService) {
        m18298a(tinderGcmListenerService);
    }

    public void inject(TinderGoldPaywallDialog tinderGoldPaywallDialog) {
        m18270a(tinderGoldPaywallDialog);
    }

    public void inject(FastMatchPreviewView fastMatchPreviewView) {
        m18269a(fastMatchPreviewView);
    }

    public void inject(FastMatchPreviewRowView fastMatchPreviewRowView) {
        m18268a(fastMatchPreviewRowView);
    }

    public void inject(TinderGoldIntroDialog tinderGoldIntroDialog) {
        m18319a(tinderGoldIntroDialog);
    }

    public void inject(SettingsPurchaseView settingsPurchaseView) {
        m18309a(settingsPurchaseView);
    }

    public void inject(DeleteSponsoredMessageJobService deleteSponsoredMessageJobService) {
        m18284a(deleteSponsoredMessageJobService);
    }

    public void inject(C16315a c16315a) {
        m18299a(c16315a);
    }

    public void inject(ReactivateAccountJob reactivateAccountJob) {
        m18305a(reactivateAccountJob);
    }

    public void inject(AppCrashDialog appCrashDialog) {
        m18264a(appCrashDialog);
    }

    public void inject(AppRatingDialog appRatingDialog) {
        m18251a(appRatingDialog);
    }

    public void inject(ReportBillingTimeoutService reportBillingTimeoutService) {
        m18297a(reportBillingTimeoutService);
    }

    public void inject(BoostButtonView boostButtonView) {
        m18263a(boostButtonView);
    }

    public void inject(FeedSettingsItemView feedSettingsItemView) {
        m18304a(feedSettingsItemView);
    }

    public void inject(C12237m c12237m) {
        m18290a(c12237m);
    }

    public void inject(C12234k c12234k) {
        m18289a(c12234k);
    }

    public void inject(C12227d c12227d) {
        m18287a(c12227d);
    }

    public void inject(C12231g c12231g) {
        m18288a(c12231g);
    }

    public void inject(EditFeedSettingItemView editFeedSettingItemView) {
        m18267a(editFeedSettingItemView);
    }

    public void inject(SubmitVisitJob submitVisitJob) {
        m18295a(submitVisitJob);
    }

    public void inject(EditProfilePhotoView editProfilePhotoView) {
        m18271a(editProfilePhotoView);
    }

    public void inject(C2603i c2603i) {
        m18236a(c2603i);
    }

    public void inject(AutoPlayVideoSettingsView autoPlayVideoSettingsView) {
        m18306a(autoPlayVideoSettingsView);
    }

    public void inject(RecommendProfileBroadcastReceiver recommendProfileBroadcastReceiver) {
        m18291a(recommendProfileBroadcastReceiver);
    }

    public void inject(ProfileBitmojiAuthView profileBitmojiAuthView) {
        m18296a(profileBitmojiAuthView);
    }

    public OnboardingComponent plus(C2655a c2655a) {
        return new a$o(this, c2655a, null);
    }

    public ExitSurveyComponent plus(C2656a c2656a) {
        return new a$h(this, c2656a, null);
    }

    /* renamed from: a */
    private ManagerApp m18283a(ManagerApp managerApp) {
        C12029y.a(managerApp, (C2652a) this.dm.get());
        C12029y.a(managerApp, (UserMetaManager) this.eN.get());
        C12029y.a(managerApp, (C2664c) this.aO.get());
        C12029y.a(managerApp, aa());
        C12029y.b(managerApp, aa());
        C12029y.a(managerApp, (RequestQueue) this.bw.get());
        C12029y.a(managerApp, (bj) this.aP.get());
        C12029y.a(managerApp, (bk) this.ak.get());
        C12029y.a(managerApp, (C3945a) this.dW.get());
        C12029y.a(managerApp, (bq) this.eO.get());
        C12029y.a(managerApp, (ManagerProfile) this.cD.get());
        C12029y.a(managerApp, (C2634g) this.aR.get());
        C12029y.a(managerApp, (ManagerFusedLocation) this.cJ.get());
        C12029y.a(managerApp, (C2630h) this.bc.get());
        C12029y.a(managerApp, ac());
        C12029y.a(managerApp, (CrashReporter) this.eT.get());
        C12029y.a(managerApp, af());
        C12029y.a(managerApp, (UpdatesScheduler) this.fN.get());
        C12029y.a(managerApp, (AppVisibilityTracker) this.dy.get());
        C12029y.a(managerApp, ag());
        C12029y.a(managerApp, ah());
        C12029y.a(managerApp, (AttributionTracker) this.cS.get());
        C12029y.a(managerApp, ak());
        C12029y.a(managerApp, al());
        C12029y.a(managerApp, (AbTestUtility) this.ag.get());
        C12029y.a(managerApp, (RecsEngineResolver) this.ix.get());
        C12029y.a(managerApp, am());
        C12029y.a(managerApp, an());
        C12029y.a(managerApp, ao());
        C12029y.a(managerApp, ap());
        C12029y.a(managerApp, (UncaughtExceptionTracker) this.iC.get());
        C12029y.a(managerApp, (PlacesLocationTracker) this.iI.get());
        C12029y.a(managerApp, au());
        C12029y.a(managerApp, aw());
        C12029y.a(managerApp, ax());
        C12029y.a(managerApp, (TypingIndicatorWorker) this.jl.get());
        C12029y.a(managerApp, ay());
        C12029y.a(managerApp, az());
        C12029y.a(managerApp, aA());
        C12029y.a(managerApp, m18221S());
        C12029y.a(managerApp, aB());
        C12029y.a(managerApp, aJ());
        return managerApp;
    }

    /* renamed from: a */
    private ActivityBase m18257a(ActivityBase activityBase) {
        C10358b.a(activityBase, (bk) this.ak.get());
        C10358b.a(activityBase, (C2652a) this.dm.get());
        C10358b.a(activityBase, (UserMetaManager) this.eN.get());
        C10358b.a(activityBase, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(activityBase, (bt) this.cI.get());
        C10358b.a(activityBase, (af) this.js.get());
        C10358b.a(activityBase, (C2664c) this.aO.get());
        C10358b.a(activityBase, (ManagerAnalytics) this.bd.get());
        return activityBase;
    }

    /* renamed from: a */
    private ActivityVerification m18245a(ActivityVerification activityVerification) {
        C10358b.a(activityVerification, (bk) this.ak.get());
        C10358b.a(activityVerification, (C2652a) this.dm.get());
        C10358b.a(activityVerification, (UserMetaManager) this.eN.get());
        C10358b.a(activityVerification, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(activityVerification, (bt) this.cI.get());
        C10358b.a(activityVerification, (af) this.js.get());
        C10358b.a(activityVerification, (C2664c) this.aO.get());
        C10358b.a(activityVerification, (ManagerAnalytics) this.bd.get());
        C7288r.a(activityVerification, (C2652a) this.dm.get());
        C7288r.a(activityVerification, (ManagerProfile) this.cD.get());
        C7288r.a(activityVerification, (bk) this.ak.get());
        C7288r.a(activityVerification, (ManagerFusedLocation) this.cJ.get());
        C7288r.a(activityVerification, (bt) this.cI.get());
        C7288r.a(activityVerification, (LegacyBreadCrumbTracker) this.jt.get());
        C7288r.a(activityVerification, aL());
        C7288r.a(activityVerification, (AbTestUtility) this.ag.get());
        C7288r.a(activityVerification, aM());
        return activityVerification;
    }

    /* renamed from: a */
    private ActivityPassport m18292a(ActivityPassport activityPassport) {
        C10358b.a(activityPassport, (bk) this.ak.get());
        C10358b.a(activityPassport, (C2652a) this.dm.get());
        C10358b.a(activityPassport, (UserMetaManager) this.eN.get());
        C10358b.a(activityPassport, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(activityPassport, (bt) this.cI.get());
        C10358b.a(activityPassport, (af) this.js.get());
        C10358b.a(activityPassport, (C2664c) this.aO.get());
        C10358b.a(activityPassport, (ManagerAnalytics) this.bd.get());
        C10363g.a(activityPassport, (bk) this.ak.get());
        C10363g.a(activityPassport, (ManagerProfile) this.cD.get());
        C10363g.a(activityPassport, (UpdatesScheduler) this.fN.get());
        C10363g.a(activityPassport, (ManagerDeepLinking) this.jw.get());
        C10363g.a(activityPassport, (bq) this.eO.get());
        C10363g.a(activityPassport, aO());
        C10363g.a(activityPassport, aR());
        C10363g.a(activityPassport, (C2664c) this.jy.get());
        C10363g.a(activityPassport, (Register) this.jF.get());
        C10363g.a(activityPassport, (C8259d) this.jG.get());
        C10363g.a(activityPassport, aT());
        C10363g.a(activityPassport, aU());
        C12254j.a(activityPassport, (C3945a) this.dW.get());
        C12254j.a(activityPassport, (ManagerNetwork) this.bx.get());
        C12254j.a(activityPassport, (ManagerAnalytics) this.bd.get());
        C12254j.a(activityPassport, (bt) this.cI.get());
        C12254j.a(activityPassport, (LegacyBreadCrumbTracker) this.jt.get());
        C12254j.a(activityPassport, (C2630h) this.bc.get());
        C12254j.a(activityPassport, (AbTestUtility) this.ag.get());
        return activityPassport;
    }

    /* renamed from: a */
    private ActivitySignedInBase m18258a(ActivitySignedInBase activitySignedInBase) {
        C10358b.a(activitySignedInBase, (bk) this.ak.get());
        C10358b.a(activitySignedInBase, (C2652a) this.dm.get());
        C10358b.a(activitySignedInBase, (UserMetaManager) this.eN.get());
        C10358b.a(activitySignedInBase, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(activitySignedInBase, (bt) this.cI.get());
        C10358b.a(activitySignedInBase, (af) this.js.get());
        C10358b.a(activitySignedInBase, (C2664c) this.aO.get());
        C10358b.a(activitySignedInBase, (ManagerAnalytics) this.bd.get());
        C10363g.a(activitySignedInBase, (bk) this.ak.get());
        C10363g.a(activitySignedInBase, (ManagerProfile) this.cD.get());
        C10363g.a(activitySignedInBase, (UpdatesScheduler) this.fN.get());
        C10363g.a(activitySignedInBase, (ManagerDeepLinking) this.jw.get());
        C10363g.a(activitySignedInBase, (bq) this.eO.get());
        C10363g.a(activitySignedInBase, aO());
        C10363g.a(activitySignedInBase, aR());
        C10363g.a(activitySignedInBase, (C2664c) this.jy.get());
        C10363g.a(activitySignedInBase, (Register) this.jF.get());
        C10363g.a(activitySignedInBase, (C8259d) this.jG.get());
        C10363g.a(activitySignedInBase, aT());
        C10363g.a(activitySignedInBase, aU());
        return activitySignedInBase;
    }

    /* renamed from: a */
    private ActivityAddPhoto m18240a(ActivityAddPhoto activityAddPhoto) {
        C10358b.a(activityAddPhoto, (bk) this.ak.get());
        C10358b.a(activityAddPhoto, (C2652a) this.dm.get());
        C10358b.a(activityAddPhoto, (UserMetaManager) this.eN.get());
        C10358b.a(activityAddPhoto, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(activityAddPhoto, (bt) this.cI.get());
        C10358b.a(activityAddPhoto, (af) this.js.get());
        C10358b.a(activityAddPhoto, (C2664c) this.aO.get());
        C10358b.a(activityAddPhoto, (ManagerAnalytics) this.bd.get());
        C10363g.a(activityAddPhoto, (bk) this.ak.get());
        C10363g.a(activityAddPhoto, (ManagerProfile) this.cD.get());
        C10363g.a(activityAddPhoto, (UpdatesScheduler) this.fN.get());
        C10363g.a(activityAddPhoto, (ManagerDeepLinking) this.jw.get());
        C10363g.a(activityAddPhoto, (bq) this.eO.get());
        C10363g.a(activityAddPhoto, aO());
        C10363g.a(activityAddPhoto, aR());
        C10363g.a(activityAddPhoto, (C2664c) this.jy.get());
        C10363g.a(activityAddPhoto, (Register) this.jF.get());
        C10363g.a(activityAddPhoto, (C8259d) this.jG.get());
        C10363g.a(activityAddPhoto, aT());
        C10363g.a(activityAddPhoto, aU());
        C7280d.a(activityAddPhoto, (bk) this.ak.get());
        C7280d.a(activityAddPhoto, aV());
        C7280d.a(activityAddPhoto, (ManagerProfile) this.cD.get());
        C7280d.a(activityAddPhoto, (LegacyBreadCrumbTracker) this.jt.get());
        return activityAddPhoto;
    }

    /* renamed from: a */
    private ActivityBanned m18241a(ActivityBanned activityBanned) {
        C7281f.a(activityBanned, (C2652a) this.dm.get());
        C7281f.a(activityBanned, (C2664c) this.aO.get());
        C7281f.a(activityBanned, (ManagerAnalytics) this.bd.get());
        C7281f.a(activityBanned, (LegacyBreadCrumbTracker) this.jt.get());
        return activityBanned;
    }

    /* renamed from: a */
    private ActivityEditProfile m18242a(ActivityEditProfile activityEditProfile) {
        C10358b.a(activityEditProfile, (bk) this.ak.get());
        C10358b.a(activityEditProfile, (C2652a) this.dm.get());
        C10358b.a(activityEditProfile, (UserMetaManager) this.eN.get());
        C10358b.a(activityEditProfile, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(activityEditProfile, (bt) this.cI.get());
        C10358b.a(activityEditProfile, (af) this.js.get());
        C10358b.a(activityEditProfile, (C2664c) this.aO.get());
        C10358b.a(activityEditProfile, (ManagerAnalytics) this.bd.get());
        C10363g.a(activityEditProfile, (bk) this.ak.get());
        C10363g.a(activityEditProfile, (ManagerProfile) this.cD.get());
        C10363g.a(activityEditProfile, (UpdatesScheduler) this.fN.get());
        C10363g.a(activityEditProfile, (ManagerDeepLinking) this.jw.get());
        C10363g.a(activityEditProfile, (bq) this.eO.get());
        C10363g.a(activityEditProfile, aO());
        C10363g.a(activityEditProfile, aR());
        C10363g.a(activityEditProfile, (C2664c) this.jy.get());
        C10363g.a(activityEditProfile, (Register) this.jF.get());
        C10363g.a(activityEditProfile, (C8259d) this.jG.get());
        C10363g.a(activityEditProfile, aT());
        C10363g.a(activityEditProfile, aU());
        C7283h.a(activityEditProfile, (bt) this.cI.get());
        C7283h.a(activityEditProfile, (LegacyBreadCrumbTracker) this.jt.get());
        return activityEditProfile;
    }

    /* renamed from: a */
    private LoginActivity m18246a(LoginActivity loginActivity) {
        C10358b.a(loginActivity, (bk) this.ak.get());
        C10358b.a(loginActivity, (C2652a) this.dm.get());
        C10358b.a(loginActivity, (UserMetaManager) this.eN.get());
        C10358b.a(loginActivity, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(loginActivity, (bt) this.cI.get());
        C10358b.a(loginActivity, (af) this.js.get());
        C10358b.a(loginActivity, (C2664c) this.aO.get());
        C10358b.a(loginActivity, (ManagerAnalytics) this.bd.get());
        C7289v.a(loginActivity, (bw) this.kn.get());
        C7289v.a(loginActivity, (LegacyBreadCrumbTracker) this.jt.get());
        C7289v.a(loginActivity, (CallbackManager) this.ko.get());
        return loginActivity;
    }

    /* renamed from: a */
    private WebViewActivityInstagram m18248a(WebViewActivityInstagram webViewActivityInstagram) {
        com.tinder.activities.al.a(webViewActivityInstagram, (LegacyBreadCrumbTracker) this.jt.get());
        return webViewActivityInstagram;
    }

    /* renamed from: a */
    private ActivityGiphy m18243a(ActivityGiphy activityGiphy) {
        C7284i.a(activityGiphy, (C2664c) this.aO.get());
        C7284i.a(activityGiphy, (LegacyBreadCrumbTracker) this.jt.get());
        return activityGiphy;
    }

    /* renamed from: a */
    private ActivityTPlusControl m18320a(ActivityTPlusControl activityTPlusControl) {
        C10358b.a(activityTPlusControl, (bk) this.ak.get());
        C10358b.a(activityTPlusControl, (C2652a) this.dm.get());
        C10358b.a(activityTPlusControl, (UserMetaManager) this.eN.get());
        C10358b.a(activityTPlusControl, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(activityTPlusControl, (bt) this.cI.get());
        C10358b.a(activityTPlusControl, (af) this.js.get());
        C10358b.a(activityTPlusControl, (C2664c) this.aO.get());
        C10358b.a(activityTPlusControl, (ManagerAnalytics) this.bd.get());
        C10363g.a(activityTPlusControl, (bk) this.ak.get());
        C10363g.a(activityTPlusControl, (ManagerProfile) this.cD.get());
        C10363g.a(activityTPlusControl, (UpdatesScheduler) this.fN.get());
        C10363g.a(activityTPlusControl, (ManagerDeepLinking) this.jw.get());
        C10363g.a(activityTPlusControl, (bq) this.eO.get());
        C10363g.a(activityTPlusControl, aO());
        C10363g.a(activityTPlusControl, aR());
        C10363g.a(activityTPlusControl, (C2664c) this.jy.get());
        C10363g.a(activityTPlusControl, (Register) this.jF.get());
        C10363g.a(activityTPlusControl, (C8259d) this.jG.get());
        C10363g.a(activityTPlusControl, aT());
        C10363g.a(activityTPlusControl, aU());
        C16930e.a(activityTPlusControl, be());
        C16930e.a(activityTPlusControl, (LegacyBreadCrumbTracker) this.jt.get());
        return activityTPlusControl;
    }

    /* renamed from: a */
    private SettingsActivity m18303a(SettingsActivity settingsActivity) {
        C10358b.a(settingsActivity, (bk) this.ak.get());
        C10358b.a(settingsActivity, (C2652a) this.dm.get());
        C10358b.a(settingsActivity, (UserMetaManager) this.eN.get());
        C10358b.a(settingsActivity, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(settingsActivity, (bt) this.cI.get());
        C10358b.a(settingsActivity, (af) this.js.get());
        C10358b.a(settingsActivity, (C2664c) this.aO.get());
        C10358b.a(settingsActivity, (ManagerAnalytics) this.bd.get());
        C10363g.a(settingsActivity, (bk) this.ak.get());
        C10363g.a(settingsActivity, (ManagerProfile) this.cD.get());
        C10363g.a(settingsActivity, (UpdatesScheduler) this.fN.get());
        C10363g.a(settingsActivity, (ManagerDeepLinking) this.jw.get());
        C10363g.a(settingsActivity, (bq) this.eO.get());
        C10363g.a(settingsActivity, aO());
        C10363g.a(settingsActivity, aR());
        C10363g.a(settingsActivity, (C2664c) this.jy.get());
        C10363g.a(settingsActivity, (Register) this.jF.get());
        C10363g.a(settingsActivity, (C8259d) this.jG.get());
        C10363g.a(settingsActivity, aT());
        C10363g.a(settingsActivity, aU());
        C16612p.a(settingsActivity, (C3945a) this.dW.get());
        C16612p.a(settingsActivity, (bj) this.aP.get());
        C16612p.a(settingsActivity, (ManagerNetwork) this.bx.get());
        C16612p.a(settingsActivity, (ad) this.kp.get());
        C16612p.a(settingsActivity, (ManagerAnalytics) this.bd.get());
        C16612p.a(settingsActivity, (C2664c) this.aO.get());
        C16612p.a(settingsActivity, (LegacyBreadCrumbTracker) this.jt.get());
        C16612p.a(settingsActivity, (EnvironmentProvider) this.aY.get());
        C16612p.a(settingsActivity, (bk) this.ak.get());
        C16612p.a(settingsActivity, (C15193i) this.aN.get());
        C16612p.a(settingsActivity, m18210N());
        C16612p.a(settingsActivity, (FastMatchConfigProvider) this.bW.get());
        C16612p.a(settingsActivity, new C14867d());
        C16612p.a(settingsActivity, bs());
        return settingsActivity;
    }

    /* renamed from: a */
    private ActivityJob m18244a(ActivityJob activityJob) {
        C10358b.a(activityJob, (bk) this.ak.get());
        C10358b.a(activityJob, (C2652a) this.dm.get());
        C10358b.a(activityJob, (UserMetaManager) this.eN.get());
        C10358b.a(activityJob, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(activityJob, (bt) this.cI.get());
        C10358b.a(activityJob, (af) this.js.get());
        C10358b.a(activityJob, (C2664c) this.aO.get());
        C10358b.a(activityJob, (ManagerAnalytics) this.bd.get());
        C10363g.a(activityJob, (bk) this.ak.get());
        C10363g.a(activityJob, (ManagerProfile) this.cD.get());
        C10363g.a(activityJob, (UpdatesScheduler) this.fN.get());
        C10363g.a(activityJob, (ManagerDeepLinking) this.jw.get());
        C10363g.a(activityJob, (bq) this.eO.get());
        C10363g.a(activityJob, aO());
        C10363g.a(activityJob, aR());
        C10363g.a(activityJob, (C2664c) this.jy.get());
        C10363g.a(activityJob, (Register) this.jF.get());
        C10363g.a(activityJob, (C8259d) this.jG.get());
        C10363g.a(activityJob, aT());
        C10363g.a(activityJob, aU());
        C7285n.a(activityJob, (LegacyBreadCrumbTracker) this.jt.get());
        C7285n.a(activityJob, bx());
        return activityJob;
    }

    /* renamed from: a */
    private SchoolActivity m18247a(SchoolActivity schoolActivity) {
        C10358b.a(schoolActivity, (bk) this.ak.get());
        C10358b.a(schoolActivity, (C2652a) this.dm.get());
        C10358b.a(schoolActivity, (UserMetaManager) this.eN.get());
        C10358b.a(schoolActivity, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(schoolActivity, (bt) this.cI.get());
        C10358b.a(schoolActivity, (af) this.js.get());
        C10358b.a(schoolActivity, (C2664c) this.aO.get());
        C10358b.a(schoolActivity, (ManagerAnalytics) this.bd.get());
        C10363g.a(schoolActivity, (bk) this.ak.get());
        C10363g.a(schoolActivity, (ManagerProfile) this.cD.get());
        C10363g.a(schoolActivity, (UpdatesScheduler) this.fN.get());
        C10363g.a(schoolActivity, (ManagerDeepLinking) this.jw.get());
        C10363g.a(schoolActivity, (bq) this.eO.get());
        C10363g.a(schoolActivity, aO());
        C10363g.a(schoolActivity, aR());
        C10363g.a(schoolActivity, (C2664c) this.jy.get());
        C10363g.a(schoolActivity, (Register) this.jF.get());
        C10363g.a(schoolActivity, (C8259d) this.jG.get());
        C10363g.a(schoolActivity, aT());
        C10363g.a(schoolActivity, aU());
        com.tinder.activities.ak.a(schoolActivity, (LegacyBreadCrumbTracker) this.jt.get());
        com.tinder.activities.ak.a(schoolActivity, bC());
        return schoolActivity;
    }

    /* renamed from: a */
    private SpotifyAuthActivity m18311a(SpotifyAuthActivity spotifyAuthActivity) {
        C10358b.a(spotifyAuthActivity, (bk) this.ak.get());
        C10358b.a(spotifyAuthActivity, (C2652a) this.dm.get());
        C10358b.a(spotifyAuthActivity, (UserMetaManager) this.eN.get());
        C10358b.a(spotifyAuthActivity, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(spotifyAuthActivity, (bt) this.cI.get());
        C10358b.a(spotifyAuthActivity, (af) this.js.get());
        C10358b.a(spotifyAuthActivity, (C2664c) this.aO.get());
        C10358b.a(spotifyAuthActivity, (ManagerAnalytics) this.bd.get());
        C16848b.a(spotifyAuthActivity, bD());
        return spotifyAuthActivity;
    }

    /* renamed from: a */
    private GenderSearchActivity m18302a(GenderSearchActivity genderSearchActivity) {
        C10358b.a(genderSearchActivity, (bk) this.ak.get());
        C10358b.a(genderSearchActivity, (C2652a) this.dm.get());
        C10358b.a(genderSearchActivity, (UserMetaManager) this.eN.get());
        C10358b.a(genderSearchActivity, (ManagerFusedLocation) this.cJ.get());
        C10358b.a(genderSearchActivity, (bt) this.cI.get());
        C10358b.a(genderSearchActivity, (af) this.js.get());
        C10358b.a(genderSearchActivity, (C2664c) this.aO.get());
        C10358b.a(genderSearchActivity, (ManagerAnalytics) this.bd.get());
        C16611h.a(genderSearchActivity, bF());
        return genderSearchActivity;
    }

    /* renamed from: a */
    private UpdateAccountEmailPasswordActivity m18237a(UpdateAccountEmailPasswordActivity updateAccountEmailPasswordActivity) {
        C7273c.a(updateAccountEmailPasswordActivity, bM());
        return updateAccountEmailPasswordActivity;
    }

    /* renamed from: a */
    private FragmentEditProfile m18273a(FragmentEditProfile fragmentEditProfile) {
        com.tinder.fragments.ak.a(fragmentEditProfile, (bk) this.ak.get());
        com.tinder.fragments.ak.a(fragmentEditProfile, (ad) this.kp.get());
        com.tinder.fragments.ak.a(fragmentEditProfile, (ManagerAnalytics) this.bd.get());
        com.tinder.fragments.ak.a(fragmentEditProfile, (LegacyBreadCrumbTracker) this.jt.get());
        com.tinder.fragments.ak.a(fragmentEditProfile, bQ());
        com.tinder.fragments.ak.a(fragmentEditProfile, bR());
        com.tinder.fragments.ak.a(fragmentEditProfile, bW());
        com.tinder.fragments.ak.a(fragmentEditProfile, (C2664c) this.aO.get());
        return fragmentEditProfile;
    }

    /* renamed from: a */
    private C13308g m18278a(C13308g c13308g) {
        C11849m.a(c13308g, aV());
        C11849m.a(c13308g, (ManagerNetwork) this.bx.get());
        C11849m.a(c13308g, (LegacyBreadCrumbTracker) this.jt.get());
        return c13308g;
    }

    /* renamed from: a */
    private C13310q m18280a(C13310q c13310q) {
        C11852u.a(c13310q, aV());
        C11852u.a(c13310q, (ManagerNetwork) this.bx.get());
        C11852u.a(c13310q, (LegacyBreadCrumbTracker) this.jt.get());
        C11852u.a(c13310q, bX());
        return c13310q;
    }

    /* renamed from: a */
    private FragmentMap m18274a(FragmentMap fragmentMap) {
        com.tinder.fragments.al.a(fragmentMap, (C3945a) this.dW.get());
        com.tinder.fragments.al.a(fragmentMap, (ManagerFusedLocation) this.cJ.get());
        com.tinder.fragments.al.a(fragmentMap, (ManagerNetwork) this.bx.get());
        com.tinder.fragments.al.a(fragmentMap, (ManagerAnalytics) this.bd.get());
        com.tinder.fragments.al.a(fragmentMap, (LegacyBreadCrumbTracker) this.jt.get());
        return fragmentMap;
    }

    /* renamed from: a */
    private IntroFragment m18282a(IntroFragment introFragment) {
        C11873a.a(introFragment, (LegacyBreadCrumbTracker) this.jt.get());
        C11873a.a(introFragment, bY());
        C11873a.a(introFragment, (CallbackManager) this.ko.get());
        return introFragment;
    }

    /* renamed from: a */
    private FragmentAgeMoreGender m18272a(FragmentAgeMoreGender fragmentAgeMoreGender) {
        C11851p.a(fragmentAgeMoreGender, (ManagerProfile) this.cD.get());
        C11851p.a(fragmentAgeMoreGender, (LegacyBreadCrumbTracker) this.jt.get());
        return fragmentAgeMoreGender;
    }

    /* renamed from: a */
    private com.tinder.fragments.am m18275a(com.tinder.fragments.am amVar) {
        com.tinder.fragments.ao.a(amVar, aV());
        com.tinder.fragments.ao.a(amVar, (LegacyBreadCrumbTracker) this.jt.get());
        return amVar;
    }

    /* renamed from: a */
    private com.tinder.fragments.ap m18276a(com.tinder.fragments.ap apVar) {
        com.tinder.fragments.ar.a(apVar, (LegacyBreadCrumbTracker) this.jt.get());
        return apVar;
    }

    /* renamed from: a */
    private com.tinder.fragments.as m18277a(com.tinder.fragments.as asVar) {
        com.tinder.fragments.at.a(asVar, (LegacyBreadCrumbTracker) this.jt.get());
        return asVar;
    }

    /* renamed from: a */
    private AccountKitErrorHeaderFragment m18252a(AccountKitErrorHeaderFragment accountKitErrorHeaderFragment) {
        C10327b.a(accountKitErrorHeaderFragment, bZ());
        return accountKitErrorHeaderFragment;
    }

    /* renamed from: a */
    private C12265d m18293a(C12265d c12265d) {
        C12266e.a(c12265d, resources());
        C12266e.a(c12265d, (LikeStatusProvider) this.aI.get());
        C12266e.a(c12265d, (C15071e) this.ek.get());
        return c12265d;
    }

    /* renamed from: a */
    private TinderPlusPaywallDialog m18322a(TinderPlusPaywallDialog tinderPlusPaywallDialog) {
        C16953c.a(tinderPlusPaywallDialog, cg());
        C16953c.a(tinderPlusPaywallDialog, (C15071e) this.ek.get());
        C16953c.a(tinderPlusPaywallDialog, (LikeStatusProvider) this.aI.get());
        C16953c.a(tinderPlusPaywallDialog, ck());
        return tinderPlusPaywallDialog;
    }

    /* renamed from: a */
    private com.tinder.dialogs.ad m18266a(com.tinder.dialogs.ad adVar) {
        com.tinder.dialogs.ag.a(adVar, (C2652a) this.dm.get());
        com.tinder.dialogs.ag.a(adVar, (bf) this.kw.get());
        com.tinder.dialogs.ag.a(adVar, (ManagerAnalytics) this.bd.get());
        com.tinder.dialogs.ag.a(adVar, (UserMetaManager) this.eN.get());
        return adVar;
    }

    /* renamed from: a */
    private C8257a m18250a(C8257a c8257a) {
        C10311c.a(c8257a, (C8260f) this.kx.get());
        C10311c.a(c8257a, (ManagerAnalytics) this.bd.get());
        return c8257a;
    }

    /* renamed from: a */
    private DialogIsTween m18265a(DialogIsTween dialogIsTween) {
        C11116o.a(dialogIsTween, cm());
        return dialogIsTween;
    }

    /* renamed from: a */
    private C12043a m18285a(C12043a c12043a) {
        C12049l.a(c12043a, cp());
        C12049l.a(c12043a, cq());
        C12049l.a(c12043a, (AppRatingRepository) this.fQ.get());
        C12049l.a(c12043a, (AbTestUtility) this.ag.get());
        return c12043a;
    }

    /* renamed from: a */
    private BoostPaywallDialog m18259a(BoostPaywallDialog boostPaywallDialog) {
        C10416c.a(boostPaywallDialog, ct());
        C10416c.a(boostPaywallDialog, ck());
        return boostPaywallDialog;
    }

    /* renamed from: a */
    private BoostSummaryDialog m18260a(BoostSummaryDialog boostSummaryDialog) {
        C10417d.a(boostSummaryDialog, cu());
        return boostSummaryDialog;
    }

    /* renamed from: a */
    private BoostUpdateDialog m18261a(BoostUpdateDialog boostUpdateDialog) {
        C10419g.a(boostUpdateDialog, cv());
        return boostUpdateDialog;
    }

    /* renamed from: a */
    private SuperlikePaywallDialog m18318a(SuperlikePaywallDialog superlikePaywallDialog) {
        C16893e.a(superlikePaywallDialog, cw());
        C16893e.a(superlikePaywallDialog, ck());
        return superlikePaywallDialog;
    }

    /* renamed from: a */
    private GCMRegistrationIntentService m18300a(GCMRegistrationIntentService gCMRegistrationIntentService) {
        C16573c.a(gCMRegistrationIntentService, (bk) this.ak.get());
        C16573c.a(gCMRegistrationIntentService, cx());
        return gCMRegistrationIntentService;
    }

    /* renamed from: a */
    private ProcessingPhotosTaskService m18301a(ProcessingPhotosTaskService processingPhotosTaskService) {
        C16575e.a(processingPhotosTaskService, (ManagerProfile) this.cD.get());
        C16575e.a(processingPhotosTaskService, (ManagerNetwork) this.bx.get());
        C16575e.a(processingPhotosTaskService, (C2664c) this.aO.get());
        return processingPhotosTaskService;
    }

    /* renamed from: a */
    private MapFrameLayout m18325a(MapFrameLayout mapFrameLayout) {
        C17265y.a(mapFrameLayout, (ManagerAnalytics) this.bd.get());
        return mapFrameLayout;
    }

    /* renamed from: a */
    private SpotifyConnectView m18312a(SpotifyConnectView spotifyConnectView) {
        C16876f.a(spotifyConnectView, cy());
        return spotifyConnectView;
    }

    /* renamed from: a */
    private SpotifyPickArtistView m18313a(SpotifyPickArtistView spotifyPickArtistView) {
        C16877g.a(spotifyPickArtistView, cz());
        return spotifyPickArtistView;
    }

    /* renamed from: a */
    private SpotifyThemeSongView m18315a(SpotifyThemeSongView spotifyThemeSongView) {
        C16879i.a(spotifyThemeSongView, cA());
        return spotifyThemeSongView;
    }

    /* renamed from: a */
    private SpotifyTrackSearchView m18317a(SpotifyTrackSearchView spotifyTrackSearchView) {
        C16881l.a(spotifyTrackSearchView, cB());
        C16881l.a(spotifyTrackSearchView, (ManagerAnalytics) this.bd.get());
        return spotifyTrackSearchView;
    }

    /* renamed from: a */
    private SpotifyTopTrackItemView m18316a(SpotifyTopTrackItemView spotifyTopTrackItemView) {
        C16880j.a(spotifyTopTrackItemView, cC());
        return spotifyTopTrackItemView;
    }

    /* renamed from: a */
    private LoginButtonGroupView m18256a(LoginButtonGroupView loginButtonGroupView) {
        C10357a.a(loginButtonGroupView, cJ());
        return loginButtonGroupView;
    }

    /* renamed from: a */
    private MoreGenderView m18308a(MoreGenderView moreGenderView) {
        C16694d.a(moreGenderView, cK());
        return moreGenderView;
    }

    /* renamed from: a */
    private GenderSearchView m18307a(GenderSearchView genderSearchView) {
        C16693a.a(genderSearchView, cM());
        return genderSearchView;
    }

    /* renamed from: a */
    private ShowMeView m18310a(ShowMeView showMeView) {
        C16696g.a(showMeView, cO());
        return showMeView;
    }

    /* renamed from: a */
    private TimeSinceTextView m18281a(TimeSinceTextView timeSinceTextView) {
        C11856a.a(timeSinceTextView, new C13319a());
        return timeSinceTextView;
    }

    /* renamed from: a */
    private UpdateEmailView m18238a(UpdateEmailView updateEmailView) {
        C7275g.a(updateEmailView, cP());
        return updateEmailView;
    }

    /* renamed from: a */
    private UpdatePasswordView m18239a(UpdatePasswordView updatePasswordView) {
        C7276i.a(updatePasswordView, cQ());
        return updatePasswordView;
    }

    /* renamed from: a */
    private RecyclerAdapterTPlusControl m18321a(RecyclerAdapterTPlusControl recyclerAdapterTPlusControl) {
        C16934c.a(recyclerAdapterTPlusControl, (C3945a) this.dW.get());
        C16934c.a(recyclerAdapterTPlusControl, (bk) this.ak.get());
        C16934c.a(recyclerAdapterTPlusControl, (ManagerAnalytics) this.bd.get());
        C16934c.a(recyclerAdapterTPlusControl, aY());
        C16934c.a(recyclerAdapterTPlusControl, (C15071e) this.ek.get());
        C16934c.a(recyclerAdapterTPlusControl, (C15193i) this.aN.get());
        C16934c.a(recyclerAdapterTPlusControl, ca());
        return recyclerAdapterTPlusControl;
    }

    /* renamed from: a */
    private C10076o m18294a(C10076o c10076o) {
        C12280q.a(c10076o, cY());
        return c10076o;
    }

    /* renamed from: a */
    private AppLifeCycleTracker m18323a(AppLifeCycleTracker appLifeCycleTracker) {
        C17231j.a(appLifeCycleTracker, (C2652a) this.dm.get());
        C17231j.a(appLifeCycleTracker, (ManagerFusedLocation) this.cJ.get());
        C17231j.a(appLifeCycleTracker, (ManagerDeepLinking) this.jw.get());
        C17231j.a(appLifeCycleTracker, (C2630h) this.bc.get());
        C17231j.a(appLifeCycleTracker, (ManagerAnalytics) this.bd.get());
        C17231j.a(appLifeCycleTracker, (C2634g) this.aR.get());
        C17231j.a(appLifeCycleTracker, aN());
        C17231j.a(appLifeCycleTracker, (OfferRepository) this.bB.get());
        C17231j.a(appLifeCycleTracker, (NotifyPushServer) this.dD.get());
        C17231j.a(appLifeCycleTracker, cZ());
        return appLifeCycleTracker;
    }

    /* renamed from: a */
    private SpotifyPlayerView m18314a(SpotifyPlayerView spotifyPlayerView) {
        C16878h.a(spotifyPlayerView, da());
        return spotifyPlayerView;
    }

    /* renamed from: a */
    private OkHttpGlideModule m18324a(OkHttpGlideModule okHttpGlideModule) {
        com.tinder.utils.ae.a(okHttpGlideModule, dd());
        return okHttpGlideModule;
    }

    /* renamed from: a */
    private C10443i m18262a(C10443i c10443i) {
        C10445k.a(c10443i, (BoostProfileFacesRepository) this.el.get());
        return c10443i;
    }

    /* renamed from: a */
    private C13309n m18279a(C13309n c13309n) {
        C11850o.a(c13309n, (ManagerProfile) this.cD.get());
        C11850o.a(c13309n, (LegacyBreadCrumbTracker) this.jt.get());
        return c13309n;
    }

    /* renamed from: a */
    private PhotoSourceSelectorSheetDialog m18286a(PhotoSourceSelectorSheetDialog photoSourceSelectorSheetDialog) {
        C12167a.a(photoSourceSelectorSheetDialog, new gl());
        return photoSourceSelectorSheetDialog;
    }

    /* renamed from: a */
    private LoginAccountKitUiManager m18253a(LoginAccountKitUiManager loginAccountKitUiManager) {
        C10328h.a(loginAccountKitUiManager, aK());
        return loginAccountKitUiManager;
    }

    /* renamed from: a */
    private ValidateAccountKitUiManager m18254a(ValidateAccountKitUiManager validateAccountKitUiManager) {
        C10329i.a(validateAccountKitUiManager, de());
        return validateAccountKitUiManager;
    }

    /* renamed from: a */
    private TinderGcmListenerService m18298a(TinderGcmListenerService tinderGcmListenerService) {
        C16249d.a(tinderGcmListenerService, m18358m());
        C16249d.a(tinderGcmListenerService, (C2630h) this.bc.get());
        C16249d.a(tinderGcmListenerService, (C14548a) this.dA.get());
        C16249d.a(tinderGcmListenerService, (FastMatchConfigProvider) this.bW.get());
        C16249d.a(tinderGcmListenerService, (ManagerAnalytics) this.bd.get());
        return tinderGcmListenerService;
    }

    /* renamed from: a */
    private TinderGoldPaywallDialog m18270a(TinderGoldPaywallDialog tinderGoldPaywallDialog) {
        C11680j.a(tinderGoldPaywallDialog, dj());
        C11680j.a(tinderGoldPaywallDialog, ck());
        return tinderGoldPaywallDialog;
    }

    /* renamed from: a */
    private FastMatchPreviewView m18269a(FastMatchPreviewView fastMatchPreviewView) {
        C11675d.a(fastMatchPreviewView, dk());
        C11675d.a(fastMatchPreviewView, (C9404e) this.kJ.get());
        return fastMatchPreviewView;
    }

    /* renamed from: a */
    private FastMatchPreviewRowView m18268a(FastMatchPreviewRowView fastMatchPreviewRowView) {
        C11674b.a(fastMatchPreviewRowView, dl());
        return fastMatchPreviewRowView;
    }

    /* renamed from: a */
    private TinderGoldIntroDialog m18319a(TinderGoldIntroDialog tinderGoldIntroDialog) {
        C16925a.a(tinderGoldIntroDialog, dq());
        return tinderGoldIntroDialog;
    }

    /* renamed from: a */
    private SettingsPurchaseView m18309a(SettingsPurchaseView settingsPurchaseView) {
        C16695e.a(settingsPurchaseView, dr());
        return settingsPurchaseView;
    }

    /* renamed from: a */
    private DeleteSponsoredMessageJobService m18284a(DeleteSponsoredMessageJobService deleteSponsoredMessageJobService) {
        C12031a.a(deleteSponsoredMessageJobService, ae());
        return deleteSponsoredMessageJobService;
    }

    /* renamed from: a */
    private C16315a m18299a(C16315a c16315a) {
        C16316b.a(c16315a, dv());
        return c16315a;
    }

    /* renamed from: a */
    private ReactivateAccountJob m18305a(ReactivateAccountJob reactivateAccountJob) {
        C16641a.a(reactivateAccountJob, dz());
        return reactivateAccountJob;
    }

    /* renamed from: a */
    private AppCrashDialog m18264a(AppCrashDialog appCrashDialog) {
        C10724c.a(appCrashDialog, dF());
        return appCrashDialog;
    }

    /* renamed from: a */
    private AppRatingDialog m18251a(AppRatingDialog appRatingDialog) {
        C10322b.a(appRatingDialog, dH());
        return appRatingDialog;
    }

    /* renamed from: a */
    private ReportBillingTimeoutService m18297a(ReportBillingTimeoutService reportBillingTimeoutService) {
        C16230a.a(reportBillingTimeoutService, (C14522a) this.et.get());
        return reportBillingTimeoutService;
    }

    /* renamed from: a */
    private BoostButtonView m18263a(BoostButtonView boostButtonView) {
        C10454a.a(boostButtonView, dJ());
        return boostButtonView;
    }

    /* renamed from: a */
    private FeedSettingsItemView m18304a(FeedSettingsItemView feedSettingsItemView) {
        C16639a.a(feedSettingsItemView, dL());
        return feedSettingsItemView;
    }

    /* renamed from: a */
    private C12237m m18290a(C12237m c12237m) {
        C12238n.a(c12237m, dO());
        return c12237m;
    }

    /* renamed from: a */
    private C12234k m18289a(C12234k c12234k) {
        C12235l.a(c12234k, dQ());
        return c12234k;
    }

    /* renamed from: a */
    private C12227d m18287a(C12227d c12227d) {
        C12228e.a(c12227d, cq());
        return c12227d;
    }

    /* renamed from: a */
    private C12231g m18288a(C12231g c12231g) {
        C12233j.a(c12231g, dU());
        C12233j.a(c12231g, dV());
        C12233j.a(c12231g, dT());
        return c12231g;
    }

    /* renamed from: a */
    private EditFeedSettingItemView m18267a(EditFeedSettingItemView editFeedSettingItemView) {
        C11156a.a(editFeedSettingItemView, dW());
        return editFeedSettingItemView;
    }

    /* renamed from: a */
    private SubmitVisitJob m18295a(SubmitVisitJob submitVisitJob) {
        C12348a.a(submitVisitJob, dZ());
        C12348a.a(submitVisitJob, (C8157y) this.ip.get());
        C12348a.a(submitVisitJob, (Gson) this.aW.get());
        C12348a.a(submitVisitJob, C12842e.c(this.f14679e));
        return submitVisitJob;
    }

    /* renamed from: a */
    private EditProfilePhotoView m18271a(EditProfilePhotoView editProfilePhotoView) {
        C11844f.a(editProfilePhotoView, (bt) this.cI.get());
        C11844f.a(editProfilePhotoView, (ManagerProfile) this.cD.get());
        C11844f.a(editProfilePhotoView, (ManagerAnalytics) this.bd.get());
        C11844f.a(editProfilePhotoView, eb());
        return editProfilePhotoView;
    }

    /* renamed from: a */
    private C2603i m18236a(C2603i c2603i) {
        C3867k.m14595a(c2603i, (C2602d) this.bb.get());
        return c2603i;
    }

    /* renamed from: a */
    private AutoPlayVideoSettingsView m18306a(AutoPlayVideoSettingsView autoPlayVideoSettingsView) {
        C16649a.a(autoPlayVideoSettingsView, ec());
        return autoPlayVideoSettingsView;
    }

    /* renamed from: a */
    private RecommendProfileBroadcastReceiver m18291a(RecommendProfileBroadcastReceiver recommendProfileBroadcastReceiver) {
        C12246e.a(recommendProfileBroadcastReceiver, dT());
        C12246e.a(recommendProfileBroadcastReceiver, dS());
        return recommendProfileBroadcastReceiver;
    }

    /* renamed from: a */
    private ProfileBitmojiAuthView m18296a(ProfileBitmojiAuthView profileBitmojiAuthView) {
        C16162n.a(profileBitmojiAuthView, eg());
        return profileBitmojiAuthView;
    }
}
