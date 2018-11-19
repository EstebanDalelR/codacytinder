package com.tinder.application;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.network.connectionclass.ConnectionClassManager;
import com.google.gson.Gson;
import com.tinder.account.provider.UpdateAccountPasswordLastShownDateProvider;
import com.tinder.activities.MainActivity;
import com.tinder.addy.AdAggregator.Listener;
import com.tinder.ads.AdAggregator;
import com.tinder.ads.DfpFieldsResolverImpl_Factory;
import com.tinder.ads.MessageAd_SponsoredMessageAdFactory_Factory;
import com.tinder.ads.NativeAdCardLikeListener_Factory;
import com.tinder.ads.NativeDfpTrackingUrlParser;
import com.tinder.ads.RecsAdSourceRegistrar_Factory;
import com.tinder.ads.RecsFanAd_Factory_Factory;
import com.tinder.ads.RecsNativeDisplayAd_Factory_Factory;
import com.tinder.ads.RecsNativeVideoAd_Factory_Factory;
import com.tinder.ads.SponsoredMessageTrackingUrlsAdAggregatorListener_Factory;
import com.tinder.ads.V1BrandedProfileCardAd_Factory_Factory;
import com.tinder.ads.analytics.AddAdCompleteEvent;
import com.tinder.ads.analytics.AddAdCompleteEvent_Factory;
import com.tinder.ads.analytics.AddAdPlayEvent;
import com.tinder.ads.analytics.AddAdPlayEvent_Factory;
import com.tinder.ads.analytics.AddAdSelectEvent;
import com.tinder.ads.analytics.AddAdSelectEvent_Factory;
import com.tinder.ads.analytics.AddAdToggleAudioEvent;
import com.tinder.ads.analytics.AddAdToggleAudioEvent_Factory;
import com.tinder.ads.analytics.AddAdViewEvent;
import com.tinder.ads.analytics.SponsoredMessageAddAdRequestReceiveEvent_Factory;
import com.tinder.ads.analytics.SponsoredMessageAddAdRequestSendEvent_Factory;
import com.tinder.ads.analytics.SponsoredMessageAnalyticsAdAggregatorListener_Factory;
import com.tinder.ads.module.RecsAdsModule_ProvideDfpSourceBuilderFactory;
import com.tinder.ads.module.RecsAdsModule_ProvideFanSourceBuilderFactory;
import com.tinder.ads.module.RecsAdsModule_ProvideNativeAdCardListenersFactory;
import com.tinder.ads.module.RecsAdsModule_ProvideNativeDfpSourceBuilderFactoryFactory;
import com.tinder.ads.module.RecsAdsModule_ProvideRecsAdCtaBouncebackLifecycleObserverFactory;
import com.tinder.ads.module.RecsAdsModule_ProvideRecsAdLifecycleObserverFactory;
import com.tinder.ads.module.RecsAdsModule_ProvideRecsAdLoaderRegistrarFactory;
import com.tinder.ads.module.RecsAdsModule_ProvideRecsAdRegistarFactory;
import com.tinder.ads.presenter.FanAdPresenter;
import com.tinder.analytics.C7311a;
import com.tinder.analytics.CrmEventTracker;
import com.tinder.analytics.ThirdPartyLocationUpdatesListener;
import com.tinder.analytics.chat.C7318a;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.p154c.C6214c;
import com.tinder.api.TinderUserApi;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.dagger.component.MainActivityComponent;
import com.tinder.app.dagger.component.ProfileTabViewComponent;
import com.tinder.app.dagger.component.RecsCardsComponent;
import com.tinder.app.dagger.component.SuperLikeableViewComponent;
import com.tinder.app.dagger.component.TopPicksComponent;
import com.tinder.app.dagger.component.VideoComponent;
import com.tinder.app.dagger.module.C12497i;
import com.tinder.app.dagger.module.C12498j;
import com.tinder.app.dagger.module.C12499k;
import com.tinder.app.dagger.module.C12500l;
import com.tinder.app.dagger.module.C12501m;
import com.tinder.app.dagger.module.C12526n;
import com.tinder.app.dagger.module.C12527p;
import com.tinder.app.dagger.module.C12528q;
import com.tinder.app.dagger.module.C12529r;
import com.tinder.app.dagger.module.C12530s;
import com.tinder.app.dagger.module.C12531t;
import com.tinder.app.dagger.module.C12546u;
import com.tinder.app.dagger.module.C12547v;
import com.tinder.app.dagger.module.C12548w;
import com.tinder.app.dagger.module.C12549x;
import com.tinder.app.dagger.module.C12550y;
import com.tinder.app.dagger.module.ad;
import com.tinder.app.dagger.module.ae;
import com.tinder.app.dagger.module.ag;
import com.tinder.app.dagger.module.ah;
import com.tinder.app.dagger.module.ai;
import com.tinder.app.dagger.module.aj;
import com.tinder.app.dagger.module.ak;
import com.tinder.app.dagger.module.al;
import com.tinder.app.dagger.module.main.C12502c;
import com.tinder.app.dagger.module.main.C12503d;
import com.tinder.app.dagger.module.main.C12504e;
import com.tinder.app.dagger.module.main.C12505f;
import com.tinder.app.dagger.module.main.C12506g;
import com.tinder.app.dagger.module.main.C12507h;
import com.tinder.app.dagger.module.main.C12508i;
import com.tinder.app.dagger.module.main.C12509j;
import com.tinder.app.dagger.module.main.C12510k;
import com.tinder.app.dagger.module.main.C12511l;
import com.tinder.app.dagger.module.main.C12512m;
import com.tinder.app.dagger.module.main.C12513n;
import com.tinder.app.dagger.module.main.C12514o;
import com.tinder.app.dagger.module.main.C12515p;
import com.tinder.app.dagger.module.main.C12516q;
import com.tinder.app.dagger.module.main.C12517r;
import com.tinder.app.dagger.module.main.C12518s;
import com.tinder.app.dagger.module.main.C12519t;
import com.tinder.app.dagger.module.main.C12520u;
import com.tinder.app.dagger.module.main.C12521v;
import com.tinder.app.dagger.module.main.C12522w;
import com.tinder.app.dagger.module.main.C12523x;
import com.tinder.app.dagger.module.main.C12524y;
import com.tinder.app.dagger.module.main.C12525z;
import com.tinder.app.dagger.module.main.C8251a;
import com.tinder.app.dagger.module.main.aa;
import com.tinder.app.dagger.module.p159a.C12454b;
import com.tinder.app.dagger.module.p159a.C12455c;
import com.tinder.app.dagger.module.p159a.C12456d;
import com.tinder.app.dagger.module.toppicks.C12532b;
import com.tinder.app.dagger.module.toppicks.C12533c;
import com.tinder.app.dagger.module.toppicks.C12534d;
import com.tinder.app.dagger.module.toppicks.C12535e;
import com.tinder.app.dagger.module.toppicks.C12536f;
import com.tinder.app.dagger.module.toppicks.C12537g;
import com.tinder.app.dagger.module.toppicks.C12538h;
import com.tinder.app.dagger.module.toppicks.C12539i;
import com.tinder.app.dagger.module.toppicks.C12540j;
import com.tinder.app.dagger.module.toppicks.C12541k;
import com.tinder.app.dagger.module.toppicks.C12542l;
import com.tinder.app.dagger.module.toppicks.C12543m;
import com.tinder.app.dagger.module.toppicks.C12544n;
import com.tinder.app.dagger.module.toppicks.C8254a;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.apprating.p166e.C10314b;
import com.tinder.auth.interactor.C10333h;
import com.tinder.base.ActivityBase;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.base.C10358b;
import com.tinder.base.C10363g;
import com.tinder.base.p172b.C12612b;
import com.tinder.base.p172b.C8301a;
import com.tinder.base.p174d.p175a.C8308d;
import com.tinder.boost.p179b.C8339c;
import com.tinder.chat.activity.C8406b;
import com.tinder.chat.analytics.C10542z;
import com.tinder.chat.analytics.ab;
import com.tinder.chat.analytics.ac;
import com.tinder.common.C8533f;
import com.tinder.common.badge.p190a.C8525a;
import com.tinder.common.badge.view.C10658b;
import com.tinder.common.feed.view.C10671c;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.common.p078c.C12775b;
import com.tinder.common.provider.C8550g;
import com.tinder.common.tracker.recyclerview.C8572b;
import com.tinder.common.tracker.recyclerview.RecyclerViewItemTracker;
import com.tinder.common.tracker.recyclerview.p200c.C12800b;
import com.tinder.common.tracker.recyclerview.p200c.C12801d;
import com.tinder.common.tracker.recyclerview.p200c.C12802f;
import com.tinder.common.tracker.recyclerview.p200c.C12803h;
import com.tinder.common.tracker.recyclerview.p200c.C12804j;
import com.tinder.common.tracker.recyclerview.p200c.C8573a;
import com.tinder.common.tracker.recyclerview.p200c.C8574c;
import com.tinder.common.tracker.recyclerview.p200c.C8575e;
import com.tinder.common.tracker.recyclerview.p200c.C8576g;
import com.tinder.common.tracker.recyclerview.p200c.C8577i;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.p201a.C12808d;
import com.tinder.core.p201a.C8588a;
import com.tinder.core.p201a.C8589c;
import com.tinder.crashindicator.p321c.C10713a;
import com.tinder.data.p210b.C12842e;
import com.tinder.data.toppicks.C11018m;
import com.tinder.data.toppicks.C13115h;
import com.tinder.data.toppicks.store.C13119d;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.deeplink.TinderSchemaParser;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.discovery.analytics.C11131k;
import com.tinder.discovery.analytics.C13144d;
import com.tinder.discovery.analytics.C13148j;
import com.tinder.discovery.analytics.DiscoverySegmentNotificationLedger;
import com.tinder.discovery.p231a.C11119a;
import com.tinder.discovery.p231a.C13142b;
import com.tinder.discovery.p234c.C13149b;
import com.tinder.discovery.p234c.C8890a;
import com.tinder.discovery.tooltip.DiscoveryTooltipOwner;
import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.discovery.view.DiscoveryTabView.Adapter.OnSegmentsUpdatedListener;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import com.tinder.discovery.view.singleviewswitcher.SingleViewSwitcher.ChildViewPreDetachListener;
import com.tinder.domain.activityfeed.usecase.LoadFeedCommentDraft;
import com.tinder.domain.activityfeed.usecase.SaveFeedCommentDraft;
import com.tinder.domain.ads.SponsoredMessagePingTrackingUrls;
import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.common.repository.DeviceInfoRepository;
import com.tinder.domain.crash.gateway.CrashTimeStampGateway;
import com.tinder.domain.deviceinfo.usecase.LoadAndUpdateDeviceInfo;
import com.tinder.domain.deviceinfo.usecase.ObserveDeviceInfo;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.fastmatch.usecase.ObserveHasFastMatches_Factory;
import com.tinder.domain.feed.DraftRepository;
import com.tinder.domain.feed.FeedCarouselItemSelectedRepository;
import com.tinder.domain.feed.FeedRangeRepository;
import com.tinder.domain.feed.FeedRepository;
import com.tinder.domain.feed.usecase.DeleteFailedFeedComment;
import com.tinder.domain.feed.usecase.LoadMoreFeedItems;
import com.tinder.domain.feed.usecase.PollFeed;
import com.tinder.domain.feed.usecase.PollForNewFeedItems;
import com.tinder.domain.feed.usecase.PollForNewFeedItems_Factory;
import com.tinder.domain.feed.usecase.RefreshFeedItems;
import com.tinder.domain.feed.usecase.RetryFailedFeedComment;
import com.tinder.domain.feed.usecase.SendFeedComment;
import com.tinder.domain.injection.modules.C13153xad945d7;
import com.tinder.domain.injection.modules.C13155xa389edd5;
import com.tinder.domain.injection.modules.C13156x9c0cf4b0;
import com.tinder.domain.injection.modules.CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory;
import com.tinder.domain.injection.modules.CommonDomainModule_ProvideTimeIntervalMins$domain_releaseFactory;
import com.tinder.domain.injection.modules.RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory;
import com.tinder.domain.match.model.visitor.MatchNameVisitor_Factory;
import com.tinder.domain.match.repository.TrackingUrlRepository;
import com.tinder.domain.match.usecase.CountMatches;
import com.tinder.domain.match.usecase.GetMatchByUserId;
import com.tinder.domain.match.usecase.ObserveHasUntouchedMatches;
import com.tinder.domain.match.usecase.ObserveHasUntouchedMatches_Factory;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.meta.usecase.GetCurrentUser;
import com.tinder.domain.profile.usecase.LoadDiscoverySettings;
import com.tinder.domain.profile.usecase.LoadDiscoverySettings_Factory;
import com.tinder.domain.profile.usecase.ObserveProfilePhotos_Factory;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.domain.superlikeable.usecase.SuperLikeOnGameRec_Factory;
import com.tinder.domain.toppicks.MarkTopPicksTutorialAsSeen;
import com.tinder.domain.toppicks.ShouldShowTopPicksTutorial;
import com.tinder.domain.toppicks.TopPicksCountUpdater;
import com.tinder.domain.toppicks.TopPicksCountUpdatesObserver;
import com.tinder.domain.toppicks.TopPicksLoadingStatusNotifier;
import com.tinder.domain.toppicks.TopPicksLoadingStatusProvider;
import com.tinder.domain.toppicks.repo.TopPicksRepository;
import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import com.tinder.domain.toppicks.usecase.BypassTopPicksEnd;
import com.tinder.domain.toppicks.usecase.DecrementTopPicksCount;
import com.tinder.domain.toppicks.usecase.DeleteExpireTopPickTeasersUseCase;
import com.tinder.domain.toppicks.usecase.GetTopPicksRefreshTime;
import com.tinder.domain.toppicks.usecase.GetTopPicksSession;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksCount;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksResponse;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksScreenState;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksSession;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksTeasers;
import com.tinder.domain.toppicks.usecase.ResetTopPickSession;
import com.tinder.domain.toppicks.usecase.SetTopPicksCount;
import com.tinder.domain.toppicks.usecase.UpdateSessionAfterNonGoldTeasersEmpty;
import com.tinder.domain.toppicks.usecase.UpdateTopPicksSession;
import com.tinder.domain.toppicks.usecase.UpdateTopPicksSessionFromRecsUpdate;
import com.tinder.domain.tracker.ListItemViewDurationRepository;
import com.tinder.domain.verification.VerificationRepository;
import com.tinder.fastmatch.preview.C13207d;
import com.tinder.fastmatch.preview.C9402a;
import com.tinder.feed.analytics.C13224b;
import com.tinder.feed.analytics.C13229d;
import com.tinder.feed.analytics.C9432a;
import com.tinder.feed.analytics.C9433c;
import com.tinder.feed.analytics.events.C11687a;
import com.tinder.feed.analytics.events.C11689d;
import com.tinder.feed.analytics.events.C11690e;
import com.tinder.feed.analytics.events.C11692g;
import com.tinder.feed.analytics.events.C11693i;
import com.tinder.feed.analytics.events.C13234c;
import com.tinder.feed.analytics.events.C13238h;
import com.tinder.feed.analytics.p247a.C13220g;
import com.tinder.feed.analytics.p247a.C13223k;
import com.tinder.feed.analytics.p247a.C9423b;
import com.tinder.feed.analytics.p247a.C9426f;
import com.tinder.feed.analytics.p247a.C9427h;
import com.tinder.feed.analytics.session.C11694q;
import com.tinder.feed.analytics.session.C9450f;
import com.tinder.feed.analytics.session.C9454k;
import com.tinder.feed.analytics.session.FeedPositionRequestProvider;
import com.tinder.feed.p248c.C13253c;
import com.tinder.feed.p248c.C13254d;
import com.tinder.feed.p248c.C13255e;
import com.tinder.feed.p248c.C13256f;
import com.tinder.feed.p248c.C13257g;
import com.tinder.feed.p248c.C13258h;
import com.tinder.feed.p248c.C13259i;
import com.tinder.feed.p248c.C13260j;
import com.tinder.feed.p248c.C13261k;
import com.tinder.feed.p248c.C13262l;
import com.tinder.feed.p248c.C13263m;
import com.tinder.feed.p248c.C9461b;
import com.tinder.feed.p249d.C9462a;
import com.tinder.feed.p340a.C11682b;
import com.tinder.feed.p341b.C11695a;
import com.tinder.feed.presenter.C9464a;
import com.tinder.feed.presenter.C9467d;
import com.tinder.feed.presenter.C9468e;
import com.tinder.feed.presenter.C9471h;
import com.tinder.feed.trigger.C13270d;
import com.tinder.feed.usecase.C11707c;
import com.tinder.feed.usecase.C13274f;
import com.tinder.feed.usecase.FeedFirstOpened;
import com.tinder.feed.view.C11726b;
import com.tinder.feed.view.C11727d;
import com.tinder.feed.view.C11728f;
import com.tinder.feed.view.C11755g;
import com.tinder.feed.view.C11756h;
import com.tinder.feed.view.FeedCarouselView;
import com.tinder.feed.view.FeedMainView;
import com.tinder.feed.view.FeedSpotifyTrackPlayerView;
import com.tinder.feed.view.MatchFeedTabView;
import com.tinder.feed.view.MatchMessagesTabView;
import com.tinder.feed.view.action.C11723c;
import com.tinder.feed.view.action.C9482a;
import com.tinder.feed.view.action.MatchProfileDisplayAction;
import com.tinder.feed.view.feed.C11729a;
import com.tinder.feed.view.feed.C11730b;
import com.tinder.feed.view.feed.C11735j;
import com.tinder.feed.view.feed.C11736k;
import com.tinder.feed.view.feed.C11738m;
import com.tinder.feed.view.feed.C11739n;
import com.tinder.feed.view.feed.C11740o;
import com.tinder.feed.view.feed.C11741p;
import com.tinder.feed.view.feed.C11742q;
import com.tinder.feed.view.feed.C11743r;
import com.tinder.feed.view.feed.C11744s;
import com.tinder.feed.view.feed.C11745t;
import com.tinder.feed.view.feed.C11746u;
import com.tinder.feed.view.feed.C11747v;
import com.tinder.feed.view.feed.C11748w;
import com.tinder.feed.view.feed.C11749x;
import com.tinder.feed.view.feed.C11750y;
import com.tinder.feed.view.feed.C11751z;
import com.tinder.feed.view.feed.C9491c;
import com.tinder.feed.view.feed.C9496h;
import com.tinder.feed.view.feed.C9498i;
import com.tinder.feed.view.footer.C11752a;
import com.tinder.feed.view.footer.C11753c;
import com.tinder.feed.view.footer.C11754d;
import com.tinder.feed.view.footer.FeedFooterDescriptionView;
import com.tinder.feed.view.footer.FeedFooterView;
import com.tinder.feed.view.footer.FeedInstagramFooterDescriptionView;
import com.tinder.feed.view.info.C11757e;
import com.tinder.feed.view.info.FeedBadgeAttributionIcon;
import com.tinder.feed.view.info.FeedInfoView;
import com.tinder.feed.view.message.C11764b;
import com.tinder.feed.view.message.C11765d;
import com.tinder.feed.view.message.FeedCommentComposerView;
import com.tinder.feed.view.message.FeedCommentView;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.feed.view.p251b.C9485a;
import com.tinder.feed.view.p251b.C9486b;
import com.tinder.feed.view.provider.C13293b;
import com.tinder.feed.view.provider.C9542a;
import com.tinder.feed.view.provider.C9545e;
import com.tinder.feed.view.tracker.C13299c;
import com.tinder.feed.view.tracker.C13303e;
import com.tinder.feed.view.tracker.C9546a;
import com.tinder.feed.view.tracker.C9548d;
import com.tinder.feed.view.tracker.C9549f;
import com.tinder.feed.view.tracker.C9551g;
import com.tinder.fireboarding.domain.C11809n;
import com.tinder.fireboarding.domain.C11811o;
import com.tinder.fireboarding.view.reccard.FireboardingLevelIconViewFactory;
import com.tinder.gamepadcounters.C9673c;
import com.tinder.home.C13325e;
import com.tinder.home.C13326g;
import com.tinder.home.C13331p;
import com.tinder.home.navigation.C9703a;
import com.tinder.home.p259b.C9695a;
import com.tinder.home.p342a.C11862a;
import com.tinder.home.p342a.C13323b;
import com.tinder.injection.p261a.C13333c;
import com.tinder.interactors.C9714e;
import com.tinder.interactors.TutorialsInteractor;
import com.tinder.intropricing.domain.p264a.C13349b;
import com.tinder.loops.analytics.C13351b;
import com.tinder.main.BackPressInterceptor;
import com.tinder.main.C13388b;
import com.tinder.main.adapter.C13385a;
import com.tinder.main.adapter.C13387f;
import com.tinder.main.adapter.MainTabbedPageLayoutAdapter;
import com.tinder.main.model.MainPage;
import com.tinder.main.router.MainPageRouter;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.trigger.MainTriggerMediator;
import com.tinder.main.trigger.Trigger;
import com.tinder.managers.C2652a;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerDeepLinking;
import com.tinder.managers.ManagerFusedLocation;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.managers.bq;
import com.tinder.managers.bt;
import com.tinder.match.analytics.C12036c;
import com.tinder.match.analytics.C13398b;
import com.tinder.match.analytics.C13404e;
import com.tinder.match.analytics.C13406g;
import com.tinder.match.analytics.C13407i;
import com.tinder.match.analytics.C13408k;
import com.tinder.match.analytics.C13412p;
import com.tinder.match.analytics.C13413r;
import com.tinder.match.analytics.C13414t;
import com.tinder.match.analytics.C9842h;
import com.tinder.match.analytics.C9844j;
import com.tinder.match.analytics.C9845l;
import com.tinder.match.analytics.C9846q;
import com.tinder.match.analytics.C9848s;
import com.tinder.match.p092d.C3942a;
import com.tinder.match.p292c.C13421h;
import com.tinder.match.p292c.C13422i;
import com.tinder.match.p292c.C13423j;
import com.tinder.match.p292c.C9851g;
import com.tinder.match.presenter.C13427c;
import com.tinder.match.presenter.C13429i;
import com.tinder.match.presenter.C13430o;
import com.tinder.match.presenter.C13431s;
import com.tinder.match.presenter.C9865a;
import com.tinder.match.presenter.C9868e;
import com.tinder.match.presenter.C9870k;
import com.tinder.match.presenter.C9872m;
import com.tinder.match.presenter.C9874q;
import com.tinder.match.presenter.af;
import com.tinder.match.provider.C13435e;
import com.tinder.match.provider.C13438k;
import com.tinder.match.provider.C9876b;
import com.tinder.match.provider.C9879g;
import com.tinder.match.provider.MatchesSearchQueryProvider;
import com.tinder.match.provider.MatchesSearchStateProvider;
import com.tinder.match.sponsoredmessage.C12082a;
import com.tinder.match.sponsoredmessage.C12084b;
import com.tinder.match.sponsoredmessage.C12087e;
import com.tinder.match.sponsoredmessage.C13445d;
import com.tinder.match.sponsoredmessage.C13450f;
import com.tinder.match.sponsoredmessage.C13451i;
import com.tinder.match.sponsoredmessage.C13452j;
import com.tinder.match.sponsoredmessage.C13453k;
import com.tinder.match.sponsoredmessage.C13454l;
import com.tinder.match.sponsoredmessage.C13455m;
import com.tinder.match.sponsoredmessage.C13456n;
import com.tinder.match.sponsoredmessage.C13457o;
import com.tinder.match.sponsoredmessage.C13458p;
import com.tinder.match.sponsoredmessage.C13459q;
import com.tinder.match.sponsoredmessage.C13460r;
import com.tinder.match.sponsoredmessage.C13461s;
import com.tinder.match.sponsoredmessage.C9882h;
import com.tinder.match.sponsoredmessage.V1SponsoredMessageAdMonitor;
import com.tinder.match.viewmodel.C13466g;
import com.tinder.match.views.C12105d;
import com.tinder.match.views.C12106e;
import com.tinder.match.views.C12107g;
import com.tinder.match.views.C12108h;
import com.tinder.match.views.C12109i;
import com.tinder.match.views.C12110l;
import com.tinder.match.views.C12111n;
import com.tinder.match.views.C12112o;
import com.tinder.match.views.MatchListView;
import com.tinder.match.views.MatchMainView;
import com.tinder.match.views.MatchMessagesRowView;
import com.tinder.match.views.MatchesSearchView;
import com.tinder.match.views.NewMatchRowView;
import com.tinder.match.views.NewMatchesView;
import com.tinder.messageads.p296c.C13472c;
import com.tinder.module.FeedViewComponent;
import com.tinder.module.FeedViewComponent.Builder;
import com.tinder.module.MatchesListComponent;
import com.tinder.module.MatchesViewComponent;
import com.tinder.overflow.analytics.C12239a;
import com.tinder.passport.p303f.C13545b;
import com.tinder.passport.p359e.C13543a;
import com.tinder.passport.p359e.C13544d;
import com.tinder.paywall.legacy.LegacyPaywallLauncher;
import com.tinder.paywall.legacy.TopPicksPaywallViewFactory;
import com.tinder.paywall.paywallflow.C10077p;
import com.tinder.places.C8034a;
import com.tinder.places.p156a.C7343b;
import com.tinder.places.p156a.C8028f;
import com.tinder.places.p156a.C8029g;
import com.tinder.places.p156a.C8030h;
import com.tinder.places.p156a.C8031i;
import com.tinder.places.p156a.C8032k;
import com.tinder.places.p156a.C8033m;
import com.tinder.presenters.df;
import com.tinder.presenters.ge;
import com.tinder.profile.adapters.C17748l;
import com.tinder.profile.model.C17761b;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.profile.p366e.C17760c;
import com.tinder.profile.view.C16158j;
import com.tinder.profile.view.ControllaView;
import com.tinder.profiletab.p367a.C14458a;
import com.tinder.profiletab.p368b.C14461a;
import com.tinder.profiletab.p369c.C17779b;
import com.tinder.profiletab.p369c.C17780f;
import com.tinder.profiletab.p369c.C17781h;
import com.tinder.profiletab.p369c.C17782j;
import com.tinder.profiletab.p370d.C17783c;
import com.tinder.profiletab.presenter.C14474d;
import com.tinder.profiletab.presenter.C14476x;
import com.tinder.profiletab.presenter.C17784c;
import com.tinder.profiletab.presenter.C17786v;
import com.tinder.profiletab.presenter.C17788y;
import com.tinder.profiletab.view.C16208a;
import com.tinder.profiletab.view.ProfileTabView;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.register.Register;
import com.tinder.purchase.usecase.C16246h;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.recs.RecCardViewHolderFactory;
import com.tinder.recs.RecCardViewHolderFactory_Factory;
import com.tinder.recs.RecsCardFactory;
import com.tinder.recs.RecsCardFactory_Factory;
import com.tinder.recs.RecsPhotoUrlFactory;
import com.tinder.recs.RecsPhotoUrlFactory_Factory;
import com.tinder.recs.adapter.SharedRecLegacyUserAdapter_Factory;
import com.tinder.recs.analytics.AddIntroCardShakeEvent_Factory;
import com.tinder.recs.analytics.AddRecsAllPhotosViewedEvent;
import com.tinder.recs.analytics.AddRecsDiscoveryEvent_Factory;
import com.tinder.recs.analytics.AddRecsInteractEvent;
import com.tinder.recs.analytics.AddRecsPhotoViewEvent;
import com.tinder.recs.analytics.AddRecsRewindEvent_Factory;
import com.tinder.recs.analytics.RecsPhotosViewedCache;
import com.tinder.recs.analytics.RecsSessionTracker;
import com.tinder.recs.analytics.V1BrandedProfileCardAdAnalyticsListener_Factory;
import com.tinder.recs.analytics.dedupe.RecsAllPhotosViewedDuplicateEventChecker;
import com.tinder.recs.analytics.dedupe.RecsPhotoViewDuplicateEventChecker;
import com.tinder.recs.card.CardSizeProvider;
import com.tinder.recs.component.RecsViewComponent;
import com.tinder.recs.controller.RecsNativeDfpAdController;
import com.tinder.recs.data.CarouselViewImageDownloader;
import com.tinder.recs.model.TappyConfig;
import com.tinder.recs.module.C18004x1ca8e714;
import com.tinder.recs.module.RecsViewModule;
import com.tinder.recs.module.RecsViewModule_BindSuperLikeableViewStateNotifierFactory;
import com.tinder.recs.module.RecsViewModule_BindSuperLikeableViewStateProviderFactory;
import com.tinder.recs.module.RecsViewModule_ProvideFireboardingLevelIconViewFactoryFactory;
import com.tinder.recs.module.RecsViewModule_ProvidesRecsImageDownloaderFactory;
import com.tinder.recs.module.RecsViewModule_ProvidesTappyCarouselViewPresenterFactory;
import com.tinder.recs.module.RecsViewModule_ProvidesTappyConfigFactory;
import com.tinder.recs.presenter.AdRecCardPresenter;
import com.tinder.recs.presenter.DiscoveryOffPresenter;
import com.tinder.recs.presenter.DiscoveryOffPresenter_Factory;
import com.tinder.recs.presenter.GamepadPresenter;
import com.tinder.recs.presenter.GridSuperLikeButtonPresenter;
import com.tinder.recs.presenter.RecsPresenter;
import com.tinder.recs.presenter.RecsPresenter_Factory;
import com.tinder.recs.presenter.RecsStatusMessageResolver;
import com.tinder.recs.presenter.RecsStatusPresenter;
import com.tinder.recs.presenter.SettingsShortcutPresenter;
import com.tinder.recs.presenter.TappyImageDrawableCarouselViewPresenter;
import com.tinder.recs.presenter.TappyUserRecCardPresenter;
import com.tinder.recs.presenter.UserRecCardPresenter;
import com.tinder.recs.provider.RecsDecoratedLoadingStatusProvider;
import com.tinder.recs.provider.SuperLikeRatingStatusNotifier;
import com.tinder.recs.provider.SuperLikeRatingStatusProvider;
import com.tinder.recs.provider.TappyConfigProvider;
import com.tinder.recs.provider.UserRecActivePhotoIndexProvider;
import com.tinder.recs.usecase.CanUserRewind_Factory;
import com.tinder.recs.usecase.DeleteSuperLike_Factory;
import com.tinder.recs.view.AdRecCardView;
import com.tinder.recs.view.AdRecCardView_MembersInjector;
import com.tinder.recs.view.BaseUserRecCardView_MembersInjector;
import com.tinder.recs.view.DiscoveryOffView;
import com.tinder.recs.view.DiscoveryOffView_MembersInjector;
import com.tinder.recs.view.FanAdView;
import com.tinder.recs.view.FanAdView_MembersInjector;
import com.tinder.recs.view.GamepadView;
import com.tinder.recs.view.GamepadView_MembersInjector;
import com.tinder.recs.view.RecsStatusView;
import com.tinder.recs.view.RecsStatusView_MembersInjector;
import com.tinder.recs.view.RecsView;
import com.tinder.recs.view.RecsView_MembersInjector;
import com.tinder.recs.view.SettingsShortcutDialog;
import com.tinder.recs.view.SettingsShortcutDialog_MembersInjector;
import com.tinder.recs.view.SuperLikeableGameTeaserRecCardView;
import com.tinder.recs.view.SuperLikeableGameTeaserRecCardView_MembersInjector;
import com.tinder.recs.view.TappyUserRecCardView;
import com.tinder.recs.view.TappyUserRecCardView_MembersInjector;
import com.tinder.recs.view.UserRecCardHeadLineView;
import com.tinder.recs.view.UserRecCardHeadLineView_MembersInjector;
import com.tinder.recs.view.drawable.BottomGradientDrawableCache;
import com.tinder.recs.view.drawable.BottomGradientRenderer;
import com.tinder.recs.view.drawable.BottomGradientRenderer_Factory;
import com.tinder.recs.view.drawable.BottomGradientRenderer_MembersInjector;
import com.tinder.recs.view.loops.TappyLoopsCarouselView;
import com.tinder.recs.view.loops.TappyLoopsCarouselView_MembersInjector;
import com.tinder.recs.view.loops.presenter.TappyLoopsCarouselViewPresenter;
import com.tinder.recs.view.nativevideos.NativeAdView;
import com.tinder.recs.view.nativevideos.NativeAdView_MembersInjector;
import com.tinder.recs.view.superlike.GridSuperLikeButtonView;
import com.tinder.recs.view.superlike.GridSuperLikeButtonView_MembersInjector;
import com.tinder.recs.view.tappy.TappyImageDrawableCarouselView;
import com.tinder.recs.view.tappy.TappyImageDrawableCarouselView_MembersInjector;
import com.tinder.recsads.C18021b;
import com.tinder.recsads.C18023g;
import com.tinder.recsads.C18024i;
import com.tinder.recsads.C18028m;
import com.tinder.recsads.NativeCardListener;
import com.tinder.recsads.RecsAdsMonitor;
import com.tinder.recsads.RecsAdsRegistrar;
import com.tinder.recsads.analytics.C16433f;
import com.tinder.recsads.analytics.C18007c;
import com.tinder.recsads.analytics.C18008e;
import com.tinder.recsads.analytics.C18010k;
import com.tinder.recsads.analytics.C18014s;
import com.tinder.recsads.analytics.C18015u;
import com.tinder.recsads.analytics.CtaBounceBackTimer;
import com.tinder.recsads.lifecycle.observer.RecsAdCtaBouncebackLifecycleObserver;
import com.tinder.recsads.lifecycle.observer.RecsAdLifecycleObserver;
import com.tinder.recsads.listener.C18026b;
import com.tinder.recsads.listener.C18027e;
import com.tinder.recsads.p467b.C18016b;
import com.tinder.recsads.p467b.C18017d;
import com.tinder.recsads.p467b.C18018f;
import com.tinder.recsads.p467b.C18019h;
import com.tinder.recsads.p467b.C18020j;
import com.tinder.recsads.rule.C18793c.C14761a;
import com.tinder.recsgrid.C14782d;
import com.tinder.recsgrid.C16487f;
import com.tinder.recsgrid.ScrollStatusNotifier;
import com.tinder.recsgrid.ScrollStatusProvider;
import com.tinder.session.p474a.C16576a;
import com.tinder.session.usecase.C14838f;
import com.tinder.settings.p404b.C14864a;
import com.tinder.sponsoredmessage.C15032a;
import com.tinder.sponsoredmessage.C15033d;
import com.tinder.sponsoredmessage.C18150g;
import com.tinder.sponsoredmessage.SponsoredMessageAdMonitor;
import com.tinder.superlikeable.C15139b;
import com.tinder.superlikeable.analytics.AddSuperLikeableSessionEvent;
import com.tinder.superlikeable.analytics.C15096f;
import com.tinder.superlikeable.analytics.C16895d;
import com.tinder.superlikeable.analytics.C18196a;
import com.tinder.superlikeable.analytics.C18199c;
import com.tinder.superlikeable.analytics.C18200e;
import com.tinder.superlikeable.analytics.C18201g;
import com.tinder.superlikeable.p423c.C15140a;
import com.tinder.superlikeable.provider.SuperLikeableViewStateNotifier;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier;
import com.tinder.superlikeable.view.C16908d;
import com.tinder.superlikeable.view.SuperLikeableViewContainer;
import com.tinder.tindergold.p426a.C16921j;
import com.tinder.tindergold.p481c.C16923a;
import com.tinder.tinderplus.analytics.C16939e;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import com.tinder.toppicks.C15256e;
import com.tinder.toppicks.C15268f;
import com.tinder.toppicks.C15272i;
import com.tinder.toppicks.C16995d;
import com.tinder.toppicks.C18233k;
import com.tinder.toppicks.SettingsLauncher;
import com.tinder.toppicks.badge.C18222c;
import com.tinder.toppicks.badge.C18223d;
import com.tinder.toppicks.badge.C18224e;
import com.tinder.toppicks.badge.C18225f;
import com.tinder.toppicks.badge.C18226g;
import com.tinder.toppicks.counter.C15237a;
import com.tinder.toppicks.counter.C16993d;
import com.tinder.toppicks.counter.TopPicksBottomCounterView;
import com.tinder.toppicks.dialog.C16997c;
import com.tinder.toppicks.dialog.TopPicksPaywallView;
import com.tinder.toppicks.domain.p432a.C15252a;
import com.tinder.toppicks.emptyview.C15257a;
import com.tinder.toppicks.emptyview.C17022d;
import com.tinder.toppicks.emptyview.TopPicksEmptyView;
import com.tinder.toppicks.exhausted.C15265b;
import com.tinder.toppicks.exhausted.C15267e;
import com.tinder.toppicks.exhausted.C17023d;
import com.tinder.toppicks.exhausted.TopPicksExhaustedView;
import com.tinder.toppicks.header.C15270a;
import com.tinder.toppicks.p430a.C15223c;
import com.tinder.toppicks.p430a.C16977b;
import com.tinder.toppicks.p433e.C15254a;
import com.tinder.toppicks.presenter.C15284a;
import com.tinder.toppicks.presenter.C15292m;
import com.tinder.toppicks.presenter.C15295q;
import com.tinder.toppicks.presenter.C17082e;
import com.tinder.toppicks.presenter.C17090j;
import com.tinder.toppicks.teasers.C15298a;
import com.tinder.toppicks.teasers.C15299c;
import com.tinder.toppicks.teasers.C17134g;
import com.tinder.toppicks.teasers.TopPicksTeasersView;
import com.tinder.toppicks.view.C17150c;
import com.tinder.toppicks.view.C17152e;
import com.tinder.toppicks.view.C17154h;
import com.tinder.toppicks.view.C17155i;
import com.tinder.toppicks.view.C17156j;
import com.tinder.toppicks.view.GoldShimmerTimerView;
import com.tinder.toppicks.view.TopPicksGoldView;
import com.tinder.toppicks.view.TopPicksGridRecsView;
import com.tinder.toppicks.view.TopPicksUserRecCardView;
import com.tinder.toppicks.view.TopPicksView;
import com.tinder.updates.UpdatesScheduler;
import com.tinder.usecase.C15346o;
import com.tinder.usecase.C17221d;
import com.tinder.usecase.C17224h;
import com.tinder.utils.ar;
import com.tinder.verification.usecase.AddAuthAccountLinkModalEvent;
import com.tinder.verification.usecase.C15390a;
import com.tinder.verification.usecase.C15391b;
import com.tinder.verification.usecase.C15392c;
import com.tinder.verification.worker.C15393a;
import com.tinder.video.p445b.C15411b;
import com.tinder.video.p446c.C15412a;
import com.tinder.video.view.C17258a;
import com.tinder.video.view.MediaView;
import com.tinder.views.grid.C17263c;
import com.tinder.views.grid.C17264e;
import dagger.internal.C15515e;
import dagger.internal.C15521i;
import dagger.internal.C15522k;
import dagger.internal.C17281c;
import dagger.internal.C18316b;
import dagger.internal.C18317d;
import dagger.internal.C18318f;
import dagger.internal.C18320l;
import de.greenrobot.event.C2664c;
import io.reactivex.subjects.C18432c;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

final class a$n extends MainActivityComponent {
    /* renamed from: A */
    private Provider<OnPageSelectedListener> f40508A;
    /* renamed from: B */
    private aa f40509B;
    /* renamed from: C */
    private C13149b f40510C;
    /* renamed from: D */
    private Provider<OnPageSelectedListener> f40511D;
    /* renamed from: E */
    private Provider<Map<MainPage, OnPageSelectedListener>> f40512E;
    /* renamed from: F */
    private Provider<List<MainPage>> f40513F;
    /* renamed from: G */
    private Provider<MatchesSearchStateProvider> f40514G;
    /* renamed from: H */
    private C12808d f40515H;
    /* renamed from: I */
    private DfpFieldsResolverImpl_Factory f40516I;
    /* renamed from: J */
    private RecsAdsModule_ProvideDfpSourceBuilderFactory f40517J;
    /* renamed from: K */
    private RecsAdsModule_ProvideNativeDfpSourceBuilderFactoryFactory f40518K;
    /* renamed from: L */
    private RecsAdsModule_ProvideFanSourceBuilderFactory f40519L;
    /* renamed from: M */
    private RecsAdSourceRegistrar_Factory f40520M;
    /* renamed from: N */
    private RecsAdsModule_ProvideRecsAdLoaderRegistrarFactory f40521N;
    /* renamed from: O */
    private Provider<RecsAdsRegistrar> f40522O;
    /* renamed from: P */
    private Provider<AdAggregator> f40523P;
    /* renamed from: Q */
    private C13453k f40524Q;
    /* renamed from: R */
    private C13445d f40525R;
    /* renamed from: S */
    private C13450f f40526S;
    /* renamed from: T */
    private C13451i f40527T;
    /* renamed from: U */
    private Provider<V1SponsoredMessageAdMonitor> f40528U;
    /* renamed from: V */
    private Provider<com.tinder.addy.AdAggregator> f40529V;
    /* renamed from: W */
    private C13460r f40530W;
    /* renamed from: X */
    private SponsoredMessageTrackingUrlsAdAggregatorListener_Factory f40531X;
    /* renamed from: Y */
    private SponsoredMessageAddAdRequestSendEvent_Factory f40532Y;
    /* renamed from: Z */
    private SponsoredMessageAddAdRequestReceiveEvent_Factory f40533Z;
    /* renamed from: a */
    final /* synthetic */ C4423a f40534a;
    private Provider<LifecycleObserver> aA;
    private Provider<LifecycleObserver> aB;
    private C12506g aC;
    private C12511l aD;
    private C12509j aE;
    private Provider<C11119a> aF;
    private Provider<LifecycleObserver> aG;
    private C12519t aH;
    private C8034a aI;
    private Provider<LifecycleObserver> aJ;
    private Provider<OnPageSelectedListener> aK;
    private ObserveHasUntouchedMatches_Factory aL;
    private C13388b aM;
    private C13326g aN;
    private PollForNewFeedItems_Factory aO;
    private C13238h aP;
    private C13323b aQ;
    private C13325e aR;
    private C12512m aS;
    private Provider<Set<ChildViewPreDetachListener>> aT;
    private C13387f aU;
    private Provider<C13385a> aV;
    private C12521v aW;
    private C13331p aX;
    private Provider<MainTabbedPageLayoutAdapter> aY;
    private Provider<Lifecycle> aZ;
    private SponsoredMessageAnalyticsAdAggregatorListener_Factory aa;
    private C13455m ab;
    private Provider<Set<Listener>> ac;
    private Provider<SponsoredMessageAdMonitor> ad;
    private C12547v ae;
    private Provider<C9835c> af;
    private C13144d ag;
    private C12531t ah;
    private C12546u ai;
    private C12529r aj;
    private C13270d ak;
    private Provider<Trigger> al;
    private C12454b am;
    private C18223d an;
    private Provider<DiscoveryTooltipOwner> ao;
    private C12456d ap;
    private C18226g aq;
    private C8033m ar;
    private C8032k as;
    private Provider<Trigger> at;
    private Provider<Trigger> au;
    private ak av;
    private ag aw;
    private ai ax;
    private Provider<Set<Trigger>> ay;
    private Provider<MainTriggerMediator> az;
    /* renamed from: b */
    private MainActivity f40535b;
    /* renamed from: c */
    private ad f40536c;
    /* renamed from: d */
    private C9882h f40537d;
    /* renamed from: e */
    private C8251a f40538e;
    /* renamed from: f */
    private Provider<MainActivity> f40539f;
    /* renamed from: g */
    private Provider<C18432c<Boolean>> f40540g;
    /* renamed from: h */
    private C18225f f40541h;
    /* renamed from: i */
    private Provider<C7343b> f40542i;
    /* renamed from: j */
    private Provider<OnSegmentsUpdatedListener> f40543j;
    /* renamed from: k */
    private Provider<Set<OnSegmentsUpdatedListener>> f40544k;
    /* renamed from: l */
    private Provider<C13142b> f40545l;
    /* renamed from: m */
    private C18224e f40546m;
    /* renamed from: n */
    private C8029g f40547n;
    /* renamed from: o */
    private C12518s f40548o;
    /* renamed from: p */
    private Provider<DiscoveryTabView> f40549p;
    /* renamed from: q */
    private C12503d f40550q;
    /* renamed from: r */
    private C13148j f40551r;
    /* renamed from: s */
    private Provider<DiscoverySegmentNotificationLedger> f40552s;
    /* renamed from: t */
    private C12502c f40553t;
    /* renamed from: u */
    private Provider<C11131k> f40554u;
    /* renamed from: v */
    private C12517r f40555v;
    /* renamed from: w */
    private Provider<Set<OnSegmentChangedListener>> f40556w;
    /* renamed from: x */
    private Provider<OnPageSelectedListener> f40557x;
    /* renamed from: y */
    private Provider<OnPageSelectedListener> f40558y;
    /* renamed from: z */
    private Provider<OnPageSelectedListener> f40559z;

    /* renamed from: com.tinder.application.a$n$a */
    private final class C10296a implements Builder {
        /* renamed from: a */
        final /* synthetic */ a$n f33560a;
        /* renamed from: b */
        private C9461b f33561b;
        /* renamed from: c */
        private FeedMainView f33562c;

        private C10296a(a$n a_n) {
            this.f33560a = a_n;
        }

        public /* synthetic */ Builder feedMainView(FeedMainView feedMainView) {
            return m41860a(feedMainView);
        }

        public FeedViewComponent build() {
            if (this.f33561b == null) {
                this.f33561b = new C9461b();
            }
            if (this.f33562c != null) {
                return new C10297b(this);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(FeedMainView.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C10296a m41860a(FeedMainView feedMainView) {
            this.f33562c = (FeedMainView) C15521i.a(feedMainView);
            return this;
        }
    }

    /* renamed from: com.tinder.application.a$n$b */
    private final class C10297b implements FeedViewComponent {
        /* renamed from: A */
        private Provider<MatchProfileDisplayAction> f33563A;
        /* renamed from: a */
        final /* synthetic */ a$n f33564a;
        /* renamed from: b */
        private C9461b f33565b;
        /* renamed from: c */
        private Provider<C9545e> f33566c;
        /* renamed from: d */
        private C13223k f33567d;
        /* renamed from: e */
        private C13220g f33568e;
        /* renamed from: f */
        private C13224b f33569f;
        /* renamed from: g */
        private C13234c f33570g;
        /* renamed from: h */
        private Provider<C8573a> f33571h;
        /* renamed from: i */
        private C13229d f33572i;
        /* renamed from: j */
        private Provider<C9433c> f33573j;
        /* renamed from: k */
        private Provider<C8575e> f33574k;
        /* renamed from: l */
        private Provider<C8575e> f33575l;
        /* renamed from: m */
        private Provider<C8573a> f33576m;
        /* renamed from: n */
        private Provider<C8572b> f33577n;
        /* renamed from: o */
        private Provider<C9542a> f33578o;
        /* renamed from: p */
        private C12804j f33579p;
        /* renamed from: q */
        private Provider<C8577i> f33580q;
        /* renamed from: r */
        private C13299c f33581r;
        /* renamed from: s */
        private Provider<C8574c<FeedItem>> f33582s;
        /* renamed from: t */
        private Provider<C8574c<FeedItem>> f33583t;
        /* renamed from: u */
        private Provider<C9548d> f33584u;
        /* renamed from: v */
        private C12803h f33585v;
        /* renamed from: w */
        private Provider<C8576g> f33586w;
        /* renamed from: x */
        private C13274f f33587x;
        /* renamed from: y */
        private Provider<RecyclerViewItemTracker> f33588y;
        /* renamed from: z */
        private Provider<FeedMainView> f33589z;

        private C10297b(a$n a_n, C10296a c10296a) {
            this.f33564a = a_n;
            m41890a(c10296a);
        }

        /* renamed from: a */
        private RefreshFeedItems m41869a() {
            return new RefreshFeedItems((FeedRepository) C4423a.bz(this.f33564a.f40534a).get());
        }

        /* renamed from: b */
        private PollFeed m41891b() {
            return new PollFeed((FeedRepository) C4423a.bz(this.f33564a.f40534a).get(), C13156x9c0cf4b0.proxyProvidesRxJava1ComputationScheduler$domain_release(C4423a.aF(this.f33564a.f40534a)), C12842e.m50437c(C4423a.aG(this.f33564a.f40534a)));
        }

        /* renamed from: c */
        private LoadMoreFeedItems m41892c() {
            return new LoadMoreFeedItems((FeedRepository) C4423a.bz(this.f33564a.f40534a).get());
        }

        /* renamed from: d */
        private C9432a m41893d() {
            return new C9432a((C9450f) C4423a.ds(this.f33564a.f40534a).get(), (C2630h) C4423a.u(this.f33564a.f40534a).get());
        }

        /* renamed from: e */
        private C11690e m41894e() {
            return new C11690e(m41893d());
        }

        /* renamed from: f */
        private C11693i m41895f() {
            return new C11693i(m41893d());
        }

        /* renamed from: g */
        private C11689d m41896g() {
            return new C11689d(m41893d());
        }

        /* renamed from: h */
        private C9546a m41897h() {
            return new C9546a((C9462a) C4423a.dt(this.f33564a.f40534a).get(), (FeedCarouselItemSelectedRepository) C4423a.du(this.f33564a.f40534a).get());
        }

        /* renamed from: i */
        private C9549f m41898i() {
            return new C9549f((C9551g) C4423a.dv(this.f33564a.f40534a).get(), (C9545e) this.f33566c.get());
        }

        /* renamed from: j */
        private C11694q m41899j() {
            return new C11694q((ListItemViewDurationRepository) C4423a.dw(this.f33564a.f40534a).get(), (C9551g) C4423a.dv(this.f33564a.f40534a).get());
        }

        /* renamed from: k */
        private FeedFirstOpened m41900k() {
            return C13253c.m51271a(this.f33565b, (C11695a) C4423a.aZ(this.f33564a.f40534a).get(), (C9695a) C4423a.bw(this.f33564a.f40534a).get(), (C9879g) C4423a.aY(this.f33564a.f40534a).get());
        }

        /* renamed from: l */
        private C9468e m41901l() {
            return new C9468e((C9545e) this.f33566c.get(), m41869a(), m41891b(), m41892c(), m41894e(), (C9876b) C4423a.bx(this.f33564a.f40534a).get(), m41895f(), m41896g(), (C9450f) C4423a.ds(this.f33564a.f40534a).get(), C4423a.bB(this.f33564a.f40534a), (C9454k) C4423a.dx(this.f33564a.f40534a).get(), (FeedPositionRequestProvider) C4423a.dy(this.f33564a.f40534a).get(), m41897h(), m41898i(), m41899j(), (C9433c) this.f33573j.get(), (C8572b) this.f33577n.get(), m41900k());
        }

        /* renamed from: m */
        private C11682b m41902m() {
            return new C11682b(new C9485a());
        }

        /* renamed from: n */
        private C11723c m41903n() {
            return new C11723c((MatchProfileDisplayAction) this.f33563A.get());
        }

        /* renamed from: o */
        private C8533f m41904o() {
            return new C8533f((bk) C4423a.j(this.f33564a.f40534a).get());
        }

        /* renamed from: p */
        private C9496h m41905p() {
            return new C9496h(new C8550g());
        }

        /* renamed from: q */
        private C9427h m41906q() {
            return new C9427h((FeedCarouselItemSelectedRepository) C4423a.du(this.f33564a.f40534a).get());
        }

        /* renamed from: r */
        private C9426f m41907r() {
            return new C9426f(m41906q(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(C4423a.aI(this.f33564a.f40534a)));
        }

        /* renamed from: s */
        private C11687a m41908s() {
            return new C11687a(m41907r(), m41893d(), (C9551g) C4423a.dv(this.f33564a.f40534a).get());
        }

        /* renamed from: t */
        private C12239a m41909t() {
            return new C12239a((C2630h) C4423a.u(this.f33564a.f40534a).get());
        }

        /* renamed from: u */
        private C9467d m41910u() {
            return new C9467d(m41908s(), m41909t(), m41906q());
        }

        /* renamed from: v */
        private C11707c m41911v() {
            return new C11707c((CurrentScreenTracker) C4423a.M(this.f33564a.f40534a).get());
        }

        /* renamed from: w */
        private SendFeedComment m41912w() {
            return new SendFeedComment((FeedRepository) C4423a.bz(this.f33564a.f40534a).get(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(C4423a.aI(this.f33564a.f40534a)));
        }

        /* renamed from: x */
        private LoadFeedCommentDraft m41913x() {
            return new LoadFeedCommentDraft((DraftRepository) C4423a.dz(this.f33564a.f40534a).get());
        }

        /* renamed from: y */
        private SaveFeedCommentDraft m41914y() {
            return new SaveFeedCommentDraft((DraftRepository) C4423a.dz(this.f33564a.f40534a).get());
        }

        /* renamed from: z */
        private com.tinder.chat.analytics.ad m41915z() {
            return new com.tinder.chat.analytics.ad((C2630h) C4423a.u(this.f33564a.f40534a).get(), C4423a.ar(this.f33564a.f40534a));
        }

        /* renamed from: A */
        private ac m41861A() {
            return new ac((C2630h) C4423a.u(this.f33564a.f40534a).get(), C4423a.ar(this.f33564a.f40534a));
        }

        /* renamed from: B */
        private C9464a m41862B() {
            return new C9464a(C4423a.aW(this.f33564a.f40534a), m41912w(), m41913x(), m41914y(), m41915z(), m41861A(), m41908s());
        }

        /* renamed from: C */
        private RetryFailedFeedComment m41863C() {
            return new RetryFailedFeedComment((FeedRepository) C4423a.bz(this.f33564a.f40534a).get());
        }

        /* renamed from: D */
        private DeleteFailedFeedComment m41864D() {
            return new DeleteFailedFeedComment((FeedRepository) C4423a.bz(this.f33564a.f40534a).get());
        }

        /* renamed from: E */
        private ab m41865E() {
            return new ab((C2630h) C4423a.u(this.f33564a.f40534a).get(), C4423a.ar(this.f33564a.f40534a));
        }

        /* renamed from: F */
        private C10542z m41866F() {
            return new C10542z((C2630h) C4423a.u(this.f33564a.f40534a).get(), C4423a.ar(this.f33564a.f40534a));
        }

        /* renamed from: G */
        private C9482a m41867G() {
            return new C9482a(C4423a.dA(this.f33564a.f40534a), m41863C(), m41864D(), C4423a.aS(this.f33564a.f40534a), m41865E(), m41866F(), m41915z(), m41861A(), m41908s());
        }

        /* renamed from: H */
        private C8525a m41868H() {
            return new C8525a((FastMatchConfigProvider) C4423a.ao(this.f33564a.f40534a).get(), (SubscriptionProvider) C4423a.aB(this.f33564a.f40534a).get());
        }

        /* renamed from: a */
        private void m41890a(C10296a c10296a) {
            this.f33566c = C17281c.a(C13254d.m51276b(c10296a.f33561b, C4423a.dB(this.f33564a.f40534a)));
            this.f33567d = C13223k.m51218b(C4423a.du(this.f33564a.f40534a));
            this.f33568e = C13220g.m51213b(this.f33567d, C4423a.bE(this.f33564a.f40534a));
            this.f33569f = C13224b.m51221b(C4423a.ds(this.f33564a.f40534a), C4423a.u(this.f33564a.f40534a));
            this.f33570g = C13234c.m51235b(this.f33568e, this.f33569f);
            this.f33571h = C17281c.a(C12800b.m50294b(C12775b.m50236c()));
            this.f33572i = C13229d.m51228b(this.f33570g, this.f33571h, C4423a.dv(this.f33564a.f40534a));
            this.f33573j = C17281c.a(C13256f.m51284b(c10296a.f33561b, this.f33572i));
            this.f33574k = C17281c.a(C12802f.m50300b(C12775b.m50236c()));
            this.f33575l = C17281c.a(C13260j.m51300b(c10296a.f33561b, this.f33574k));
            this.f33576m = C17281c.a(C13257g.m51288b(c10296a.f33561b, this.f33571h));
            this.f33577n = C17281c.a(C13258h.m51292b(c10296a.f33561b, C4423a.dw(this.f33564a.f40534a), this.f33575l, this.f33576m, C4423a.bE(this.f33564a.f40534a)));
            this.f33565b = c10296a.f33561b;
            this.f33578o = C17281c.a(C13293b.m51444b(C12775b.m50236c()));
            this.f33579p = C12804j.m50306b(C12775b.m50236c());
            this.f33580q = C17281c.a(C13262l.m51308b(c10296a.f33561b, this.f33579p));
            this.f33581r = C13299c.m51456b(this.f33566c, C4423a.du(this.f33564a.f40534a), this.f33580q);
            this.f33582s = C17281c.a(C12801d.m50297b(C12775b.m50236c()));
            this.f33583t = C17281c.a(C13259i.m51296b(c10296a.f33561b, this.f33582s));
            this.f33584u = C17281c.a(C13303e.m51462b(this.f33581r, this.f33583t));
            this.f33585v = C12803h.m50303b(C12775b.m50236c());
            this.f33586w = C17281c.a(C13261k.m51304b(c10296a.f33561b, this.f33585v));
            this.f33587x = C13274f.m51331b(C4423a.M(this.f33564a.f40534a));
            this.f33588y = C17281c.a(C13255e.m51280b(c10296a.f33561b, this.f33575l, this.f33586w, this.f33580q, this.f33587x));
            this.f33589z = C18317d.a(c10296a.f33562c);
            this.f33563A = C17281c.a(C13263m.m51312b(c10296a.f33561b, this.f33589z));
        }

        public void inject(FeedMainView feedMainView) {
            m41871a(feedMainView);
        }

        public void inject(FeedInfoView feedInfoView) {
            m41887a(feedInfoView);
        }

        public void inject(FeedFooterDescriptionView feedFooterDescriptionView) {
            m41883a(feedFooterDescriptionView);
        }

        public void inject(FeedInstagramFooterDescriptionView feedInstagramFooterDescriptionView) {
            m41885a(feedInstagramFooterDescriptionView);
        }

        public void inject(FeedFooterView feedFooterView) {
            m41884a(feedFooterView);
        }

        public void inject(C11735j c11735j) {
            m41875a(c11735j);
        }

        public void inject(C11729a c11729a) {
            m41873a(c11729a);
        }

        public void inject(C11738m c11738m) {
            m41876a(c11738m);
        }

        public void inject(C11742q c11742q) {
            m41878a(c11742q);
        }

        public void inject(C11740o c11740o) {
            m41877a(c11740o);
        }

        public void inject(C11744s c11744s) {
            m41879a(c11744s);
        }

        public void inject(C11748w c11748w) {
            m41881a(c11748w);
        }

        public void inject(C11746u c11746u) {
            m41880a(c11746u);
        }

        public void inject(C11750y c11750y) {
            m41882a(c11750y);
        }

        public void inject(com.tinder.feed.view.feed.aa aaVar) {
            m41874a(aaVar);
        }

        public void inject(FeedSpotifyTrackPlayerView feedSpotifyTrackPlayerView) {
            m41872a(feedSpotifyTrackPlayerView);
        }

        public void inject(FeedCommentComposerView feedCommentComposerView) {
            m41888a(feedCommentComposerView);
        }

        public void inject(FeedCommentView feedCommentView) {
            m41889a(feedCommentView);
        }

        public void inject(FeedBadgeAttributionIcon feedBadgeAttributionIcon) {
            m41886a(feedBadgeAttributionIcon);
        }

        public void inject(FeedCarouselView feedCarouselView) {
            m41870a(feedCarouselView);
        }

        /* renamed from: a */
        private FeedMainView m41871a(FeedMainView feedMainView) {
            C11727d.m47559a(feedMainView, m41901l());
            C11727d.m47560a(feedMainView, (C9542a) this.f33578o.get());
            C11727d.m47557a(feedMainView, m41902m());
            C11727d.m47561a(feedMainView, (C9548d) this.f33584u.get());
            C11727d.m47558a(feedMainView, (C9462a) C4423a.dt(this.f33564a.f40534a).get());
            C11727d.m47556a(feedMainView, (FeedRangeRepository) C4423a.dC(this.f33564a.f40534a).get());
            C11727d.m47553a(feedMainView, (Lifecycle) this.f33564a.aZ.get());
            C11727d.m47554a(feedMainView, (RecyclerViewItemTracker) this.f33588y.get());
            C11727d.m47555a(feedMainView, (C8576g) this.f33586w.get());
            return feedMainView;
        }

        /* renamed from: a */
        private FeedInfoView m41887a(FeedInfoView feedInfoView) {
            C11757e.m47640a(feedInfoView, m41903n());
            return feedInfoView;
        }

        /* renamed from: a */
        private FeedFooterDescriptionView m41883a(FeedFooterDescriptionView feedFooterDescriptionView) {
            C11752a.m47629a(feedFooterDescriptionView, m41904o());
            return feedFooterDescriptionView;
        }

        /* renamed from: a */
        private FeedInstagramFooterDescriptionView m41885a(FeedInstagramFooterDescriptionView feedInstagramFooterDescriptionView) {
            C11754d.m47633a(feedInstagramFooterDescriptionView, new C9498i());
            return feedInstagramFooterDescriptionView;
        }

        /* renamed from: a */
        private FeedFooterView m41884a(FeedFooterView feedFooterView) {
            C11753c.m47631a(feedFooterView, m41905p());
            return feedFooterView;
        }

        /* renamed from: a */
        private C11735j m41875a(C11735j c11735j) {
            C11736k.m47581a(c11735j, m41910u());
            C11736k.m47582a(c11735j, new C9486b());
            C11736k.m47583a(c11735j, (C9542a) this.f33578o.get());
            return c11735j;
        }

        /* renamed from: a */
        private C11729a m41873a(C11729a c11729a) {
            C11730b.m47575a(c11729a, m41910u());
            C11730b.m47576a(c11729a, new C9486b());
            C11730b.m47577a(c11729a, (C9542a) this.f33578o.get());
            return c11729a;
        }

        /* renamed from: a */
        private C11738m m41876a(C11738m c11738m) {
            C11739n.m47589a(c11738m, m41910u());
            C11739n.m47590a(c11738m, new C9486b());
            C11739n.m47591a(c11738m, (C9542a) this.f33578o.get());
            return c11738m;
        }

        /* renamed from: a */
        private C11742q m41878a(C11742q c11742q) {
            C11743r.m47601a(c11742q, m41910u());
            C11743r.m47602a(c11742q, new C9486b());
            C11743r.m47603a(c11742q, (C9542a) this.f33578o.get());
            return c11742q;
        }

        /* renamed from: a */
        private C11740o m41877a(C11740o c11740o) {
            C11741p.m47595a(c11740o, m41910u());
            C11741p.m47596a(c11740o, new C9486b());
            C11741p.m47597a(c11740o, (C9542a) this.f33578o.get());
            return c11740o;
        }

        /* renamed from: a */
        private C11744s m41879a(C11744s c11744s) {
            C11745t.m47607a(c11744s, m41910u());
            C11745t.m47608a(c11744s, new C9486b());
            C11745t.m47609a(c11744s, (C9542a) this.f33578o.get());
            return c11744s;
        }

        /* renamed from: a */
        private C11748w m41881a(C11748w c11748w) {
            C11749x.m47619a(c11748w, m41910u());
            C11749x.m47620a(c11748w, new C9486b());
            C11749x.m47621a(c11748w, (C9542a) this.f33578o.get());
            return c11748w;
        }

        /* renamed from: a */
        private C11746u m41880a(C11746u c11746u) {
            C11747v.m47613a(c11746u, m41910u());
            C11747v.m47614a(c11746u, new C9486b());
            C11747v.m47615a(c11746u, (C9542a) this.f33578o.get());
            return c11746u;
        }

        /* renamed from: a */
        private C11750y m41882a(C11750y c11750y) {
            C11751z.m47625a(c11750y, m41910u());
            C11751z.m47626a(c11750y, new C9486b());
            C11751z.m47627a(c11750y, (C9542a) this.f33578o.get());
            return c11750y;
        }

        /* renamed from: a */
        private com.tinder.feed.view.feed.aa m41874a(com.tinder.feed.view.feed.aa aaVar) {
            com.tinder.feed.view.feed.ab.m47571a(aaVar, m41910u());
            com.tinder.feed.view.feed.ab.m47572a(aaVar, new C9486b());
            com.tinder.feed.view.feed.ab.m47573a(aaVar, (C9542a) this.f33578o.get());
            return aaVar;
        }

        /* renamed from: a */
        private FeedSpotifyTrackPlayerView m41872a(FeedSpotifyTrackPlayerView feedSpotifyTrackPlayerView) {
            C10671c.m43008a(feedSpotifyTrackPlayerView, C4423a.dD(this.f33564a.f40534a));
            C11728f.m47564a(feedSpotifyTrackPlayerView, m41911v());
            C11728f.m47563a(feedSpotifyTrackPlayerView, (C9462a) C4423a.dt(this.f33564a.f40534a).get());
            C11728f.m47565a(feedSpotifyTrackPlayerView, (C9542a) this.f33578o.get());
            return feedSpotifyTrackPlayerView;
        }

        /* renamed from: a */
        private FeedCommentComposerView m41888a(FeedCommentComposerView feedCommentComposerView) {
            C11764b.m47667a(feedCommentComposerView, m41862B());
            C11764b.m47668a(feedCommentComposerView, (C9542a) this.f33578o.get());
            return feedCommentComposerView;
        }

        /* renamed from: a */
        private FeedCommentView m41889a(FeedCommentView feedCommentView) {
            C11765d.m47674a(feedCommentView, (C9542a) this.f33578o.get());
            C11765d.m47671a(feedCommentView, m41867G());
            C11765d.m47673a(feedCommentView, m41905p());
            C11765d.m47672a(feedCommentView, new C9491c());
            C11765d.m47670a(feedCommentView, m41910u());
            return feedCommentView;
        }

        /* renamed from: a */
        private FeedBadgeAttributionIcon m41886a(FeedBadgeAttributionIcon feedBadgeAttributionIcon) {
            C10658b.m42977a(feedBadgeAttributionIcon, m41868H());
            return feedBadgeAttributionIcon;
        }

        /* renamed from: a */
        private FeedCarouselView m41870a(FeedCarouselView feedCarouselView) {
            C11726b.m47551a(feedCarouselView, (C9462a) C4423a.dt(this.f33564a.f40534a).get());
            return feedCarouselView;
        }
    }

    /* renamed from: com.tinder.application.a$n$c */
    private final class C10298c implements MatchesListComponent.Builder {
        /* renamed from: a */
        final /* synthetic */ a$n f33590a;
        /* renamed from: b */
        private C9851g f33591b;
        /* renamed from: c */
        private MatchListView f33592c;

        private C10298c(a$n a_n) {
            this.f33590a = a_n;
        }

        public /* synthetic */ MatchesListComponent.Builder matchListView(MatchListView matchListView) {
            return m41917a(matchListView);
        }

        public MatchesListComponent build() {
            if (this.f33591b == null) {
                this.f33591b = new C9851g();
            }
            if (this.f33592c != null) {
                return new C10299d(this);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(MatchListView.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C10298c m41917a(MatchListView matchListView) {
            this.f33592c = (MatchListView) C15521i.a(matchListView);
            return this;
        }
    }

    /* renamed from: com.tinder.application.a$n$d */
    private final class C10299d implements MatchesListComponent {
        /* renamed from: a */
        final /* synthetic */ a$n f33593a;
        /* renamed from: b */
        private Provider<MatchesSearchQueryProvider> f33594b;
        /* renamed from: c */
        private Provider<C9402a> f33595c;
        /* renamed from: d */
        private C13407i f33596d;
        /* renamed from: e */
        private C13413r f33597e;
        /* renamed from: f */
        private C13414t f33598f;
        /* renamed from: g */
        private C13412p f33599g;
        /* renamed from: h */
        private C13404e f33600h;
        /* renamed from: i */
        private C13406g f33601i;
        /* renamed from: j */
        private C13398b f33602j;
        /* renamed from: k */
        private C13438k f33603k;
        /* renamed from: l */
        private ObserveHasFastMatches_Factory f33604l;
        /* renamed from: m */
        private C13466g f33605m;
        /* renamed from: n */
        private C13421h f33606n;
        /* renamed from: o */
        private C13435e f33607o;
        /* renamed from: p */
        private Provider<C9865a> f33608p;
        /* renamed from: q */
        private Provider<C9872m> f33609q;
        /* renamed from: r */
        private C13423j f33610r;
        /* renamed from: s */
        private Provider<C13431s> f33611s;

        private C10299d(a$n a_n, C10298c c10298c) {
            this.f33593a = a_n;
            m41924a(c10298c);
        }

        /* renamed from: a */
        private C9842h m41918a() {
            return new C9842h((SubscriptionProvider) C4423a.aB(this.f33593a.f40534a).get());
        }

        /* renamed from: b */
        private C9846q m41925b() {
            return new C9846q((FastMatchConfigProvider) C4423a.ao(this.f33593a.f40534a).get(), (FastMatchStatusProvider) C4423a.aC(this.f33593a.f40534a).get(), new C9844j(), m41918a());
        }

        /* renamed from: c */
        private C9848s m41926c() {
            return new C9848s(new C9844j());
        }

        /* renamed from: d */
        private C9845l m41927d() {
            return new C9845l(C4423a.dj(this.f33593a.f40534a), C4423a.dk(this.f33593a.f40534a), (MatchesSearchQueryProvider) this.f33594b.get(), m41925b(), m41926c());
        }

        /* renamed from: e */
        private C12036c m41928e() {
            return new C12036c((C2630h) C4423a.u(this.f33593a.f40534a).get(), m41927d(), C4423a.U(this.f33593a.f40534a));
        }

        /* renamed from: f */
        private SponsoredMessagePingTrackingUrls m41929f() {
            return new SponsoredMessagePingTrackingUrls((TrackingUrlRepository) C4423a.bt(this.f33593a.f40534a).get());
        }

        /* renamed from: g */
        private C9868e m41930g() {
            return C13429i.m51907a((FastMatchConfigProvider) C4423a.ao(this.f33593a.f40534a).get(), m41928e(), m41929f(), (C9695a) C4423a.bw(this.f33593a.f40534a).get(), new C8550g(), (AppRatingRepository) C4423a.dl(this.f33593a.f40534a).get(), this.f33593a.f40534a.topPicksConfig(), C4423a.aq(this.f33593a.f40534a));
        }

        /* renamed from: h */
        private C9874q m41931h() {
            return new C9874q((FastMatchConfigProvider) C4423a.ao(this.f33593a.f40534a).get(), this.f33593a.f40534a.topPicksConfig(), m41928e());
        }

        /* renamed from: a */
        private void m41924a(C10298c c10298c) {
            this.f33594b = C17281c.a(C13422i.m51889b(c10298c.f33591b));
            this.f33595c = C17281c.a(C13207d.m51189b(C4423a.dm(this.f33593a.f40534a), C4423a.ao(this.f33593a.f40534a)));
            this.f33596d = C13407i.m51848b(C4423a.aB(this.f33593a.f40534a));
            this.f33597e = C13413r.m51857b(C4423a.ao(this.f33593a.f40534a), C4423a.aC(this.f33593a.f40534a), C13408k.m51851c(), this.f33596d);
            this.f33598f = C13414t.m51860b(C13408k.m51851c());
            this.f33599g = C13412p.m51854b(C4423a.dn(this.f33593a.f40534a), C4423a.do(this.f33593a.f40534a), this.f33594b, this.f33597e, this.f33598f);
            this.f33600h = C13404e.m51841b(C4423a.u(this.f33593a.f40534a), this.f33599g);
            this.f33601i = C13406g.m51845b(C4423a.u(this.f33593a.f40534a), this.f33599g);
            this.f33602j = C13398b.m51833b(C4423a.u(this.f33593a.f40534a), this.f33599g);
            this.f33603k = C13438k.m51935b(C4423a.dn(this.f33593a.f40534a), this.f33594b);
            this.f33604l = ObserveHasFastMatches_Factory.create(C4423a.ao(this.f33593a.f40534a), C4423a.aC(this.f33593a.f40534a));
            this.f33605m = C13466g.m52027b(C4423a.ah(this.f33593a.f40534a), C4423a.dp(this.f33593a.f40534a), MatchNameVisitor_Factory.create());
            this.f33606n = C13421h.m51886b(c10298c.f33591b, this.f33605m);
            this.f33607o = C13435e.m51929b(this.f33603k, this.f33604l, C4423a.aB(this.f33593a.f40534a), this.f33606n);
            this.f33608p = C17281c.a(C13427c.m51905b(this.f33593a.f40514G, this.f33594b, C4423a.dq(this.f33593a.f40534a), this.f33595c, this.f33600h, this.f33601i, this.f33602j, this.f33607o, C4423a.au(this.f33593a.f40534a), C4423a.cd(this.f33593a.f40534a)));
            this.f33609q = C17281c.a(C13430o.m51911b(this.f33593a.f40514G, this.f33594b, C4423a.dr(this.f33593a.f40534a)));
            this.f33610r = C13423j.m51894b(c10298c.f33591b, this.f33605m, C4423a.ao(this.f33593a.f40534a), C4423a.aB(this.f33593a.f40534a));
            this.f33611s = C17281c.a(af.m51902b(C4423a.do(this.f33593a.f40534a), this.f33594b, this.f33610r, C4423a.ao(this.f33593a.f40534a), C4423a.aC(this.f33593a.f40534a), C4423a.aB(this.f33593a.f40534a)));
        }

        public void inject(MatchListView matchListView) {
            m41919a(matchListView);
        }

        public void inject(MatchesSearchView matchesSearchView) {
            m41921a(matchesSearchView);
        }

        public void inject(MatchMessagesRowView matchMessagesRowView) {
            m41920a(matchMessagesRowView);
        }

        public void inject(NewMatchesView newMatchesView) {
            m41923a(newMatchesView);
        }

        public void inject(NewMatchRowView newMatchRowView) {
            m41922a(newMatchRowView);
        }

        /* renamed from: a */
        private MatchListView m41919a(MatchListView matchListView) {
            C12105d.m48235a(matchListView, (C9865a) this.f33608p.get());
            C12105d.m48233a(matchListView, (InputMethodManager) C4423a.q(this.f33593a.f40534a).get());
            C12105d.m48234a(matchListView, (C9695a) C4423a.bw(this.f33593a.f40534a).get());
            return matchListView;
        }

        /* renamed from: a */
        private MatchesSearchView m41921a(MatchesSearchView matchesSearchView) {
            C12110l.m48247a(matchesSearchView, (C9872m) this.f33609q.get());
            return matchesSearchView;
        }

        /* renamed from: a */
        private MatchMessagesRowView m41920a(MatchMessagesRowView matchMessagesRowView) {
            C12107g.m48240a(matchMessagesRowView, m41930g());
            C12107g.m48239a(matchMessagesRowView, C4423a.aS(this.f33593a.f40534a));
            return matchMessagesRowView;
        }

        /* renamed from: a */
        private NewMatchesView m41923a(NewMatchesView newMatchesView) {
            C12112o.m48252a(newMatchesView, (C13431s) this.f33611s.get());
            return newMatchesView;
        }

        /* renamed from: a */
        private NewMatchRowView m41922a(NewMatchRowView newMatchRowView) {
            C12111n.m48250a(newMatchRowView, m41931h());
            C12111n.m48249a(newMatchRowView, C4423a.aS(this.f33593a.f40534a));
            return newMatchRowView;
        }
    }

    /* renamed from: com.tinder.application.a$n$e */
    private final class C10300e implements MatchesViewComponent.Builder {
        /* renamed from: a */
        final /* synthetic */ a$n f33612a;
        /* renamed from: b */
        private MatchMainView f33613b;

        private C10300e(a$n a_n) {
            this.f33612a = a_n;
        }

        public /* synthetic */ MatchesViewComponent.Builder matchMainView(MatchMainView matchMainView) {
            return m41932a(matchMainView);
        }

        public MatchesViewComponent build() {
            if (this.f33613b != null) {
                return new C10301f(this);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(MatchMainView.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C10300e m41932a(MatchMainView matchMainView) {
            this.f33613b = (MatchMainView) C15521i.a(matchMainView);
            return this;
        }
    }

    /* renamed from: com.tinder.application.a$n$f */
    private final class C10301f implements MatchesViewComponent {
        /* renamed from: a */
        final /* synthetic */ a$n f33614a;

        private C10301f(a$n a_n, C10300e c10300e) {
            this.f33614a = a_n;
        }

        /* renamed from: a */
        private C9870k m41935a() {
            return new C9870k((C9879g) C4423a.aY(this.f33614a.f40534a).get(), (C9876b) C4423a.bx(this.f33614a.f40534a).get());
        }

        /* renamed from: b */
        private C9471h m41938b() {
            return new C9471h(this.f33614a.ai(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(C4423a.aF(this.f33614a.f40534a)), C13333c.m51590c(C4423a.di(this.f33614a.f40534a)), C12842e.m50437c(C4423a.aG(this.f33614a.f40534a)));
        }

        public void inject(MatchMainView matchMainView) {
            m41936a(matchMainView);
        }

        public void inject(C12108h c12108h) {
            m41937a(c12108h);
        }

        public void inject(MatchMessagesTabView matchMessagesTabView) {
            m41934a(matchMessagesTabView);
        }

        public void inject(MatchFeedTabView matchFeedTabView) {
            m41933a(matchFeedTabView);
        }

        /* renamed from: a */
        private MatchMainView m41936a(MatchMainView matchMainView) {
            C12106e.m48237a(matchMainView, (C11695a) C4423a.aZ(this.f33614a.f40534a).get());
            return matchMainView;
        }

        /* renamed from: a */
        private C12108h m41937a(C12108h c12108h) {
            C12109i.m48245a(c12108h, m41935a());
            return c12108h;
        }

        /* renamed from: a */
        private MatchMessagesTabView m41934a(MatchMessagesTabView matchMessagesTabView) {
            C11756h.m47637a(matchMessagesTabView, m41938b());
            return matchMessagesTabView;
        }

        /* renamed from: a */
        private MatchFeedTabView m41933a(MatchFeedTabView matchFeedTabView) {
            C11755g.m47635a(matchFeedTabView, this.f33614a.al());
            return matchFeedTabView;
        }
    }

    /* renamed from: com.tinder.application.a$n$g */
    private final class C10302g implements ProfileTabViewComponent.Builder {
        /* renamed from: a */
        final /* synthetic */ a$n f33615a;
        /* renamed from: b */
        private ProfileTabView f33616b;

        private C10302g(a$n a_n) {
            this.f33615a = a_n;
        }

        public /* synthetic */ ProfileTabViewComponent.Builder profileTabView(ProfileTabView profileTabView) {
            return m41939a(profileTabView);
        }

        public ProfileTabViewComponent build() {
            if (this.f33616b != null) {
                return new C12551h(this);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ProfileTabView.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C10302g m41939a(ProfileTabView profileTabView) {
            this.f33616b = (ProfileTabView) C15521i.a(profileTabView);
            return this;
        }
    }

    /* renamed from: com.tinder.application.a$n$i */
    private final class C10303i implements RecsCardsComponent.Builder {
        /* renamed from: a */
        final /* synthetic */ a$n f33617a;

        private C10303i(a$n a_n) {
            this.f33617a = a_n;
        }

        public RecsCardsComponent build() {
            return new C12552j(this);
        }
    }

    /* renamed from: com.tinder.application.a$n$k */
    private final class C10304k implements RecsViewComponent.Builder {
        /* renamed from: a */
        final /* synthetic */ a$n f33618a;
        /* renamed from: b */
        private RecsViewModule f33619b;
        /* renamed from: c */
        private RecsView f33620c;

        private C10304k(a$n a_n) {
            this.f33618a = a_n;
        }

        public /* synthetic */ RecsViewComponent.Builder recsView(RecsView recsView) {
            return m41942a(recsView);
        }

        public RecsViewComponent build() {
            if (this.f33619b == null) {
                this.f33619b = new RecsViewModule();
            }
            if (this.f33620c != null) {
                return new C10305l(this);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(RecsView.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C10304k m41942a(RecsView recsView) {
            this.f33620c = (RecsView) C15521i.a(recsView);
            return this;
        }
    }

    /* renamed from: com.tinder.application.a$n$l */
    private final class C10305l implements RecsViewComponent {
        /* renamed from: A */
        private Provider<Set<NativeCardListener>> f33621A;
        /* renamed from: B */
        private C18026b f33622B;
        /* renamed from: C */
        private C18007c f33623C;
        /* renamed from: D */
        private C18027e f33624D;
        /* renamed from: E */
        private C18021b f33625E;
        /* renamed from: F */
        private Provider<FireboardingLevelIconViewFactory> f33626F;
        /* renamed from: G */
        private Provider<RecCardViewHolderFactory> f33627G;
        /* renamed from: H */
        private AddRecsDiscoveryEvent_Factory f33628H;
        /* renamed from: I */
        private Provider<DiscoveryOffPresenter> f33629I;
        /* renamed from: a */
        final /* synthetic */ a$n f33630a;
        /* renamed from: b */
        private RecsView f33631b;
        /* renamed from: c */
        private RecsViewModule f33632c;
        /* renamed from: d */
        private C17761b f33633d;
        /* renamed from: e */
        private RecsCardFactory_Factory f33634e;
        /* renamed from: f */
        private SharedRecLegacyUserAdapter_Factory f33635f;
        /* renamed from: g */
        private DeleteSuperLike_Factory f33636g;
        /* renamed from: h */
        private AddIntroCardShakeEvent_Factory f33637h;
        /* renamed from: i */
        private Provider<SuperLikeableViewStateProviderAndNotifier> f33638i;
        /* renamed from: j */
        private RecsViewModule_BindSuperLikeableViewStateProviderFactory f33639j;
        /* renamed from: k */
        private C18199c f33640k;
        /* renamed from: l */
        private SuperLikeOnGameRec_Factory f33641l;
        /* renamed from: m */
        private AddRecsRewindEvent_Factory f33642m;
        /* renamed from: n */
        private CanUserRewind_Factory f33643n;
        /* renamed from: o */
        private Provider<RecsPresenter> f33644o;
        /* renamed from: p */
        private Provider<RecsView> f33645p;
        /* renamed from: q */
        private V1BrandedProfileCardAdAnalyticsListener_Factory f33646q;
        /* renamed from: r */
        private C18010k f33647r;
        /* renamed from: s */
        private C18014s f33648s;
        /* renamed from: t */
        private C18008e f33649t;
        /* renamed from: u */
        private C18028m f33650u;
        /* renamed from: v */
        private NativeAdCardLikeListener_Factory f33651v;
        /* renamed from: w */
        private C18015u f33652w;
        /* renamed from: x */
        private C18023g f33653x;
        /* renamed from: y */
        private C18024i f33654y;
        /* renamed from: z */
        private RecsAdsModule_ProvideNativeAdCardListenersFactory f33655z;

        private C10305l(a$n a_n, C10304k c10304k) {
            this.f33630a = a_n;
            m41957a(c10304k);
        }

        /* renamed from: a */
        private C14418b m41943a() {
            return new C14418b(this.f33630a.f40534a.resources(), (bj) C4423a.W(this.f33630a.f40534a).get(), C4423a.X(this.f33630a.f40534a), (CurrentUserProvider) C4423a.Y(this.f33630a.f40534a).get());
        }

        /* renamed from: b */
        private RecsStatusMessageResolver m41958b() {
            return new RecsStatusMessageResolver(this.f33630a.f40534a.resources(), (AbTestUtility) C4423a.f(this.f33630a.f40534a).get());
        }

        /* renamed from: c */
        private RecsDecoratedLoadingStatusProvider m41959c() {
            return new RecsDecoratedLoadingStatusProvider(C4423a.co(this.f33630a.f40534a), C4423a.cp(this.f33630a.f40534a));
        }

        /* renamed from: d */
        private AddRecsInteractEvent m41960d() {
            return new AddRecsInteractEvent((C2630h) C4423a.u(this.f33630a.f40534a).get());
        }

        /* renamed from: e */
        private RecsStatusPresenter m41961e() {
            return new RecsStatusPresenter((ManagerProfile) C4423a.v(this.f33630a.f40534a).get(), (C2664c) C4423a.o(this.f33630a.f40534a).get(), (RecsEngineRegistry) C4423a.cq(this.f33630a.f40534a).get(), (bj) C4423a.W(this.f33630a.f40534a).get(), (C2630h) C4423a.u(this.f33630a.f40534a).get(), (AbTestUtility) C4423a.f(this.f33630a.f40534a).get(), (C15193i) C4423a.cr(this.f33630a.f40534a).get(), m41958b(), m41959c(), (com.tinder.analytics.performance.aa) C4423a.cs(this.f33630a.f40534a).get(), (SubscriptionProvider) C4423a.aB(this.f33630a.f40534a).get(), new C10077p(), m41960d());
        }

        /* renamed from: f */
        private BottomGradientDrawableCache m41962f() {
            return new BottomGradientDrawableCache((Context) C4423a.aR(this.f33630a.f40534a).get());
        }

        /* renamed from: g */
        private BottomGradientRenderer m41963g() {
            return m41954a(BottomGradientRenderer_Factory.newBottomGradientRenderer());
        }

        /* renamed from: h */
        private AddRecsPhotoViewEvent m41964h() {
            return new AddRecsPhotoViewEvent((C2630h) C4423a.u(this.f33630a.f40534a).get(), (RecsPhotoViewDuplicateEventChecker) C4423a.J(this.f33630a.f40534a).get());
        }

        /* renamed from: i */
        private AddRecsAllPhotosViewedEvent m41965i() {
            return new AddRecsAllPhotosViewedEvent((C2630h) C4423a.u(this.f33630a.f40534a).get(), (RecsAllPhotosViewedDuplicateEventChecker) C4423a.K(this.f33630a.f40534a).get());
        }

        /* renamed from: j */
        private TappyUserRecCardPresenter m41966j() {
            return new TappyUserRecCardPresenter(m41964h(), m41965i(), (RecsPhotosViewedCache) C4423a.ct(this.f33630a.f40534a).get(), (C11811o) C4423a.cu(this.f33630a.f40534a).get(), C4423a.cv(this.f33630a.f40534a));
        }

        /* renamed from: k */
        private AdRecCardPresenter m41967k() {
            return new AdRecCardPresenter(C4423a.aq(this.f33630a.f40534a));
        }

        /* renamed from: l */
        private C8339c m41968l() {
            return new C8339c(C4423a.cw(this.f33630a.f40534a), C4423a.aM(this.f33630a.f40534a), (bk) C4423a.j(this.f33630a.f40534a).get());
        }

        /* renamed from: m */
        private GamepadPresenter m41969m() {
            return new GamepadPresenter(m41968l(), (LikeStatusProvider) C4423a.R(this.f33630a.f40534a).get(), (RecsEngineRegistry) C4423a.cq(this.f33630a.f40534a).get(), (C15193i) C4423a.cr(this.f33630a.f40534a).get(), (C9673c) C4423a.cx(this.f33630a.f40534a).get(), (C9695a) C4423a.bw(this.f33630a.f40534a).get(), C4423a.ay(this.f33630a.f40534a), (bk) C4423a.j(this.f33630a.f40534a).get(), (C11809n) C4423a.cy(this.f33630a.f40534a).get(), (C11811o) C4423a.cu(this.f33630a.f40534a).get());
        }

        /* renamed from: n */
        private TappyConfig m41970n() {
            return RecsViewModule_ProvidesTappyConfigFactory.proxyProvidesTappyConfig(this.f33632c, (TappyConfigProvider) C4423a.ag(this.f33630a.f40534a).get());
        }

        /* renamed from: o */
        private AddAdViewEvent m41971o() {
            return new AddAdViewEvent((C2630h) C4423a.u(this.f33630a.f40534a).get(), C4423a.cz(this.f33630a.f40534a));
        }

        /* renamed from: p */
        private AddAdToggleAudioEvent m41972p() {
            return AddAdToggleAudioEvent_Factory.newAddAdToggleAudioEvent((C2630h) C4423a.u(this.f33630a.f40534a).get(), C4423a.cz(this.f33630a.f40534a));
        }

        /* renamed from: q */
        private AddAdPlayEvent m41973q() {
            return AddAdPlayEvent_Factory.newAddAdPlayEvent((C2630h) C4423a.u(this.f33630a.f40534a).get(), C4423a.cz(this.f33630a.f40534a));
        }

        /* renamed from: r */
        private AddAdCompleteEvent m41974r() {
            return AddAdCompleteEvent_Factory.newAddAdCompleteEvent((C2630h) C4423a.u(this.f33630a.f40534a).get(), C4423a.cz(this.f33630a.f40534a));
        }

        /* renamed from: s */
        private AddAdSelectEvent m41975s() {
            return AddAdSelectEvent_Factory.newAddAdSelectEvent((C2630h) C4423a.u(this.f33630a.f40534a).get(), C4423a.cz(this.f33630a.f40534a));
        }

        /* renamed from: t */
        private FanAdPresenter m41976t() {
            return new FanAdPresenter(m41971o(), m41972p(), m41973q(), m41974r(), m41975s());
        }

        /* renamed from: u */
        private LoadDiscoverySettings m41977u() {
            return new LoadDiscoverySettings((MetaGateway) C4423a.bO(this.f33630a.f40534a).get());
        }

        /* renamed from: v */
        private SettingsShortcutPresenter m41978v() {
            return new SettingsShortcutPresenter(C4423a.cA(this.f33630a.f40534a), (bj) C4423a.W(this.f33630a.f40534a).get(), m41977u(), m41960d());
        }

        /* renamed from: w */
        private CarouselViewImageDownloader m41979w() {
            return RecsViewModule_ProvidesRecsImageDownloaderFactory.proxyProvidesRecsImageDownloader(this.f33632c, this.f33631b);
        }

        /* renamed from: x */
        private TappyImageDrawableCarouselViewPresenter m41980x() {
            return RecsViewModule_ProvidesTappyCarouselViewPresenterFactory.proxyProvidesTappyCarouselViewPresenter(this.f33632c, m41979w(), (UserRecActivePhotoIndexProvider) C4423a.cB(this.f33630a.f40534a).get());
        }

        /* renamed from: y */
        private RecsNativeDfpAdController m41981y() {
            return new RecsNativeDfpAdController(m41973q(), m41972p(), m41974r(), m41971o(), m41975s());
        }

        /* renamed from: z */
        private SuperLikeableViewStateNotifier m41982z() {
            return RecsViewModule_BindSuperLikeableViewStateNotifierFactory.proxyBindSuperLikeableViewStateNotifier(this.f33632c, (SuperLikeableViewStateProviderAndNotifier) this.f33638i.get());
        }

        /* renamed from: a */
        private void m41957a(C10304k c10304k) {
            this.f33633d = C17761b.b(C4423a.ah(this.f33630a.f40534a), C4423a.W(this.f33630a.f40534a), C4423a.ai(this.f33630a.f40534a), C4423a.Y(this.f33630a.f40534a));
            this.f33634e = RecsCardFactory_Factory.create(RecsPhotoUrlFactory_Factory.create(), C4423a.an(this.f33630a.f40534a), this.f33633d, C4423a.f(this.f33630a.f40534a));
            this.f33635f = SharedRecLegacyUserAdapter_Factory.create(C17748l.c(), C4423a.ai(this.f33630a.f40534a));
            this.f33636g = DeleteSuperLike_Factory.create(C4423a.cC(this.f33630a.f40534a), C4423a.cD(this.f33630a.f40534a));
            this.f33637h = AddIntroCardShakeEvent_Factory.create(C4423a.u(this.f33630a.f40534a));
            this.f33638i = C17281c.a(C18004x1ca8e714.create(c10304k.f33619b));
            this.f33639j = RecsViewModule_BindSuperLikeableViewStateProviderFactory.create(c10304k.f33619b, this.f33638i);
            this.f33640k = C18199c.b(C4423a.u(this.f33630a.f40534a), C18201g.c());
            this.f33641l = SuperLikeOnGameRec_Factory.create(C4423a.cE(this.f33630a.f40534a), C4423a.bN(this.f33630a.f40534a));
            this.f33642m = AddRecsRewindEvent_Factory.create(C4423a.u(this.f33630a.f40534a), C4423a.cF(this.f33630a.f40534a), C4423a.aB(this.f33630a.f40534a), C4423a.cG(this.f33630a.f40534a));
            this.f33643n = CanUserRewind_Factory.create(C4423a.cH(this.f33630a.f40534a), C4423a.cr(this.f33630a.f40534a));
            Provider cq = C4423a.cq(this.f33630a.f40534a);
            Provider provider = this.f33634e;
            Provider j = C4423a.j(this.f33630a.f40534a);
            Provider R = C4423a.R(this.f33630a.f40534a);
            Provider cD = C4423a.cD(this.f33630a.f40534a);
            Provider cI = C4423a.cI(this.f33630a.f40534a);
            Provider cJ = C4423a.cJ(this.f33630a.f40534a);
            Provider cK = C4423a.cK(this.f33630a.f40534a);
            Provider cL = C4423a.cL(this.f33630a.f40534a);
            Provider provider2 = this.f33635f;
            Provider cM = C4423a.cM(this.f33630a.f40534a);
            Provider cN = C4423a.cN(this.f33630a.f40534a);
            Provider cO = C4423a.cO(this.f33630a.f40534a);
            Provider cP = C4423a.cP(this.f33630a.f40534a);
            Provider cQ = C4423a.cQ(this.f33630a.f40534a);
            Provider cr = C4423a.cr(this.f33630a.f40534a);
            Provider cR = C4423a.cR(this.f33630a.f40534a);
            Provider D = C4423a.D(this.f33630a.f40534a);
            DeleteSuperLike_Factory deleteSuperLike_Factory = this.f33636g;
            Provider f = C4423a.f(this.f33630a.f40534a);
            AddIntroCardShakeEvent_Factory addIntroCardShakeEvent_Factory = this.f33637h;
            Provider cS = C4423a.cS(this.f33630a.f40534a);
            RecsViewModule_BindSuperLikeableViewStateProviderFactory recsViewModule_BindSuperLikeableViewStateProviderFactory = this.f33639j;
            C18199c c18199c = this.f33640k;
            Provider ah = C4423a.ah(this.f33630a.f40534a);
            Provider al = C4423a.al(this.f33630a.f40534a);
            Provider cT = C4423a.cT(this.f33630a.f40534a);
            SuperLikeOnGameRec_Factory superLikeOnGameRec_Factory = this.f33641l;
            Provider cU = C4423a.cU(this.f33630a.f40534a);
            Provider aX = C4423a.aX(this.f33630a.f40534a);
            AddRecsRewindEvent_Factory addRecsRewindEvent_Factory = this.f33642m;
            DeleteSuperLike_Factory deleteSuperLike_Factory2 = deleteSuperLike_Factory;
            AddIntroCardShakeEvent_Factory addIntroCardShakeEvent_Factory2 = addIntroCardShakeEvent_Factory;
            RecsViewModule_BindSuperLikeableViewStateProviderFactory recsViewModule_BindSuperLikeableViewStateProviderFactory2 = recsViewModule_BindSuperLikeableViewStateProviderFactory;
            C18199c c18199c2 = c18199c;
            SuperLikeOnGameRec_Factory superLikeOnGameRec_Factory2 = superLikeOnGameRec_Factory;
            AddRecsRewindEvent_Factory addRecsRewindEvent_Factory2 = addRecsRewindEvent_Factory;
            this.f33644o = C17281c.a(RecsPresenter_Factory.create(cq, provider, j, R, cD, cI, cJ, cK, cL, provider2, cM, cN, cO, cP, cQ, cr, cR, D, deleteSuperLike_Factory2, f, addIntroCardShakeEvent_Factory2, cS, recsViewModule_BindSuperLikeableViewStateProviderFactory2, c18199c2, ah, al, cT, superLikeOnGameRec_Factory2, cU, aX, addRecsRewindEvent_Factory2, C4423a.cV(this.f33630a.f40534a), C4423a.cW(this.f33630a.f40534a), C4423a.L(this.f33630a.f40534a), C4423a.cX(this.f33630a.f40534a), C4423a.M(this.f33630a.f40534a), C4423a.cY(this.f33630a.f40534a), C4423a.cZ(this.f33630a.f40534a), C4423a.da(this.f33630a.f40534a), C4423a.db(this.f33630a.f40534a), C4423a.dc(this.f33630a.f40534a), this.f33643n, C4423a.dd(this.f33630a.f40534a)));
            this.f33645p = C18317d.a(c10304k.f33620c);
            this.f33646q = V1BrandedProfileCardAdAnalyticsListener_Factory.create(C4423a.bY(this.f33630a.f40534a));
            this.f33647r = C18010k.b(C4423a.u(this.f33630a.f40534a), C4423a.bZ(this.f33630a.f40534a));
            this.f33648s = C18014s.b(C4423a.u(this.f33630a.f40534a), C4423a.bZ(this.f33630a.f40534a));
            this.f33649t = C18008e.b(C4423a.u(this.f33630a.f40534a), C4423a.bZ(this.f33630a.f40534a));
            this.f33650u = C18028m.b(this.f33647r, this.f33648s, this.f33649t);
            this.f33651v = NativeAdCardLikeListener_Factory.create(this.f33645p);
            this.f33652w = C18015u.b(C4423a.u(this.f33630a.f40534a), C4423a.bZ(this.f33630a.f40534a));
            this.f33653x = C18023g.b(this.f33652w);
            this.f33654y = C18024i.b(C4423a.bY(this.f33630a.f40534a));
            this.f33655z = RecsAdsModule_ProvideNativeAdCardListenersFactory.create(this.f33651v, this.f33653x, this.f33654y);
            this.f33621A = C18320l.a(0, 1).b(this.f33655z).a();
            this.f33622B = C18026b.b(C4423a.bY(this.f33630a.f40534a));
            this.f33623C = C18007c.b(C4423a.u(this.f33630a.f40534a), C4423a.bZ(this.f33630a.f40534a));
            this.f33624D = C18027e.b(this.f33652w, C4423a.de(this.f33630a.f40534a), this.f33623C);
            this.f33625E = C18021b.b(this.f33650u, this.f33621A, this.f33622B, this.f33624D);
            this.f33626F = C17281c.a(RecsViewModule_ProvideFireboardingLevelIconViewFactoryFactory.create(c10304k.f33619b));
            this.f33627G = C17281c.a(RecCardViewHolderFactory_Factory.create(this.f33645p, C4423a.f(this.f33630a.f40534a), this.f33646q, this.f33625E, this.f33626F, C4423a.df(this.f33630a.f40534a)));
            this.f33631b = c10304k.f33620c;
            this.f33632c = c10304k.f33619b;
            this.f33628H = AddRecsDiscoveryEvent_Factory.create(C4423a.u(this.f33630a.f40534a));
            this.f33629I = C17281c.a(DiscoveryOffPresenter_Factory.create(C4423a.dg(this.f33630a.f40534a), this.f33628H));
        }

        public void inject(RecsView recsView) {
            m41949a(recsView);
        }

        public void inject(RecsStatusView recsStatusView) {
            m41948a(recsStatusView);
        }

        public void inject(UserRecCardHeadLineView userRecCardHeadLineView) {
            m41953a(userRecCardHeadLineView);
        }

        public void inject(TappyUserRecCardView tappyUserRecCardView) {
            m41952a(tappyUserRecCardView);
        }

        public void inject(AdRecCardView adRecCardView) {
            m41944a(adRecCardView);
        }

        public void inject(GamepadView gamepadView) {
            m41947a(gamepadView);
        }

        public void inject(DiscoveryOffView discoveryOffView) {
            m41945a(discoveryOffView);
        }

        public void inject(FanAdView fanAdView) {
            m41946a(fanAdView);
        }

        public void inject(SettingsShortcutDialog settingsShortcutDialog) {
            m41950a(settingsShortcutDialog);
        }

        public void inject(TappyImageDrawableCarouselView tappyImageDrawableCarouselView) {
            m41956a(tappyImageDrawableCarouselView);
        }

        public void inject(NativeAdView nativeAdView) {
            m41955a(nativeAdView);
        }

        public void inject(SuperLikeableGameTeaserRecCardView superLikeableGameTeaserRecCardView) {
            m41951a(superLikeableGameTeaserRecCardView);
        }

        /* renamed from: a */
        private RecsView m41949a(RecsView recsView) {
            RecsView_MembersInjector.injectPresenter(recsView, (RecsPresenter) this.f33644o.get());
            RecsView_MembersInjector.injectRecCardViewHolderFactory(recsView, (RecCardViewHolderFactory) this.f33627G.get());
            RecsView_MembersInjector.injectUserRecActivePhotoIndexProvider(recsView, (UserRecActivePhotoIndexProvider) C4423a.cB(this.f33630a.f40534a).get());
            RecsView_MembersInjector.injectRecsPhotosViewedCache(recsView, (RecsPhotosViewedCache) C4423a.ct(this.f33630a.f40534a).get());
            RecsView_MembersInjector.injectProfileFactory(recsView, m41943a());
            RecsView_MembersInjector.injectAbTestUtility(recsView, (AbTestUtility) C4423a.f(this.f33630a.f40534a).get());
            RecsView_MembersInjector.injectLifecycle(recsView, (Lifecycle) this.f33630a.aZ.get());
            RecsView_MembersInjector.injectTinderNotificationFactory(recsView, (C14548a) C4423a.al(this.f33630a.f40534a).get());
            RecsView_MembersInjector.injectNotificationDispatcher(recsView, C4423a.am(this.f33630a.f40534a));
            RecsView_MembersInjector.injectAddProfileShareEvent(recsView, C4423a.P(this.f33630a.f40534a));
            RecsView_MembersInjector.injectProfileShareEventFactory(recsView, C4423a.Q(this.f33630a.f40534a));
            return recsView;
        }

        /* renamed from: a */
        private RecsStatusView m41948a(RecsStatusView recsStatusView) {
            RecsStatusView_MembersInjector.injectPresenter(recsStatusView, m41961e());
            RecsStatusView_MembersInjector.injectLifecycle(recsStatusView, (Lifecycle) this.f33630a.aZ.get());
            return recsStatusView;
        }

        /* renamed from: a */
        private UserRecCardHeadLineView m41953a(UserRecCardHeadLineView userRecCardHeadLineView) {
            UserRecCardHeadLineView_MembersInjector.injectFastMatchConfigProvider(userRecCardHeadLineView, (FastMatchConfigProvider) C4423a.ao(this.f33630a.f40534a).get());
            UserRecCardHeadLineView_MembersInjector.injectTopPicksConfig(userRecCardHeadLineView, this.f33630a.f40534a.topPicksConfig());
            return userRecCardHeadLineView;
        }

        /* renamed from: a */
        private BottomGradientRenderer m41954a(BottomGradientRenderer bottomGradientRenderer) {
            BottomGradientRenderer_MembersInjector.injectBottomGradientDrawableCache(bottomGradientRenderer, m41962f());
            return bottomGradientRenderer;
        }

        /* renamed from: a */
        private TappyUserRecCardView m41952a(TappyUserRecCardView tappyUserRecCardView) {
            BaseUserRecCardView_MembersInjector.injectPresenter(tappyUserRecCardView, (UserRecCardPresenter) C4423a.dh(this.f33630a.f40534a).get());
            BaseUserRecCardView_MembersInjector.injectActivePhotoIndexProvider(tappyUserRecCardView, (UserRecActivePhotoIndexProvider) C4423a.cB(this.f33630a.f40534a).get());
            BaseUserRecCardView_MembersInjector.injectTopPicksConfig(tappyUserRecCardView, this.f33630a.f40534a.topPicksConfig());
            BaseUserRecCardView_MembersInjector.injectFastMatchConfigProvider(tappyUserRecCardView, (FastMatchConfigProvider) C4423a.ao(this.f33630a.f40534a).get());
            BaseUserRecCardView_MembersInjector.injectBottomGradientRenderer(tappyUserRecCardView, m41963g());
            TappyUserRecCardView_MembersInjector.injectTappyConfigProvider(tappyUserRecCardView, (TappyConfigProvider) C4423a.ag(this.f33630a.f40534a).get());
            TappyUserRecCardView_MembersInjector.injectPresenter(tappyUserRecCardView, m41966j());
            return tappyUserRecCardView;
        }

        /* renamed from: a */
        private AdRecCardView m41944a(AdRecCardView adRecCardView) {
            AdRecCardView_MembersInjector.injectAdRecCardPresenter(adRecCardView, m41967k());
            AdRecCardView_MembersInjector.injectRecsView(adRecCardView, this.f33631b);
            return adRecCardView;
        }

        /* renamed from: a */
        private GamepadView m41947a(GamepadView gamepadView) {
            GamepadView_MembersInjector.injectGamepadPresenter(gamepadView, m41969m());
            GamepadView_MembersInjector.injectTappyConfigProvider(gamepadView, m41970n());
            GamepadView_MembersInjector.injectAbTestUtility(gamepadView, (AbTestUtility) C4423a.f(this.f33630a.f40534a).get());
            GamepadView_MembersInjector.injectLifecycle(gamepadView, (Lifecycle) this.f33630a.aZ.get());
            return gamepadView;
        }

        /* renamed from: a */
        private DiscoveryOffView m41945a(DiscoveryOffView discoveryOffView) {
            DiscoveryOffView_MembersInjector.injectPresenter(discoveryOffView, (DiscoveryOffPresenter) this.f33629I.get());
            return discoveryOffView;
        }

        /* renamed from: a */
        private FanAdView m41946a(FanAdView fanAdView) {
            FanAdView_MembersInjector.injectFanAdPresenter(fanAdView, m41976t());
            return fanAdView;
        }

        /* renamed from: a */
        private SettingsShortcutDialog m41950a(SettingsShortcutDialog settingsShortcutDialog) {
            SettingsShortcutDialog_MembersInjector.injectPresenter(settingsShortcutDialog, m41978v());
            return settingsShortcutDialog;
        }

        /* renamed from: a */
        private TappyImageDrawableCarouselView m41956a(TappyImageDrawableCarouselView tappyImageDrawableCarouselView) {
            TappyImageDrawableCarouselView_MembersInjector.injectPresenter(tappyImageDrawableCarouselView, m41980x());
            TappyImageDrawableCarouselView_MembersInjector.injectPhotoUrlFactory(tappyImageDrawableCarouselView, new RecsPhotoUrlFactory());
            return tappyImageDrawableCarouselView;
        }

        /* renamed from: a */
        private NativeAdView m41955a(NativeAdView nativeAdView) {
            NativeAdView_MembersInjector.injectController(nativeAdView, m41981y());
            return nativeAdView;
        }

        /* renamed from: a */
        private SuperLikeableGameTeaserRecCardView m41951a(SuperLikeableGameTeaserRecCardView superLikeableGameTeaserRecCardView) {
            SuperLikeableGameTeaserRecCardView_MembersInjector.injectSuperLikeableViewStateNotifier(superLikeableGameTeaserRecCardView, m41982z());
            return superLikeableGameTeaserRecCardView;
        }
    }

    /* renamed from: com.tinder.application.a$n$m */
    private final class C10306m implements SuperLikeableViewComponent.Builder {
        /* renamed from: a */
        final /* synthetic */ a$n f33656a;
        /* renamed from: b */
        private SuperLikeableViewContainer f33657b;

        private C10306m(a$n a_n) {
            this.f33656a = a_n;
        }

        public /* synthetic */ SuperLikeableViewComponent.Builder superLikeableView(SuperLikeableViewContainer superLikeableViewContainer) {
            return m41983a(superLikeableViewContainer);
        }

        public SuperLikeableViewComponent build() {
            if (this.f33657b != null) {
                return new C12553n(this);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(SuperLikeableViewContainer.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C10306m m41983a(SuperLikeableViewContainer superLikeableViewContainer) {
            this.f33657b = (SuperLikeableViewContainer) C15521i.a(superLikeableViewContainer);
            return this;
        }
    }

    /* renamed from: com.tinder.application.a$n$o */
    private final class C10307o implements TopPicksComponent.Builder {
        /* renamed from: a */
        final /* synthetic */ a$n f33658a;
        /* renamed from: b */
        private C8254a f33659b;

        private C10307o(a$n a_n) {
            this.f33658a = a_n;
        }

        public TopPicksComponent build() {
            if (this.f33659b == null) {
                this.f33659b = new C8254a();
            }
            return new C12554p(this);
        }
    }

    /* renamed from: com.tinder.application.a$n$q */
    private final class C10308q implements VideoComponent.Builder {
        /* renamed from: a */
        final /* synthetic */ a$n f33660a;

        private C10308q(a$n a_n) {
            this.f33660a = a_n;
        }

        public VideoComponent build() {
            return new C12555r(this);
        }
    }

    /* renamed from: com.tinder.application.a$n$h */
    private final class C12551h implements ProfileTabViewComponent {
        /* renamed from: a */
        final /* synthetic */ a$n f40476a;
        /* renamed from: b */
        private C17783c f40477b;
        /* renamed from: c */
        private C13545b f40478c;
        /* renamed from: d */
        private C17782j f40479d;
        /* renamed from: e */
        private LoadDiscoverySettings_Factory f40480e;
        /* renamed from: f */
        private C17779b f40481f;
        /* renamed from: g */
        private ObserveProfilePhotos_Factory f40482g;
        /* renamed from: h */
        private C17781h f40483h;
        /* renamed from: i */
        private C17780f f40484i;
        /* renamed from: j */
        private C13351b f40485j;
        /* renamed from: k */
        private Provider<C14476x> f40486k;
        /* renamed from: l */
        private C17760c f40487l;
        /* renamed from: m */
        private C13349b f40488m;
        /* renamed from: n */
        private Provider<C14474d> f40489n;

        private C12551h(a$n a_n, C10302g c10302g) {
            this.f40476a = a_n;
            m49500a(c10302g);
        }

        /* renamed from: a */
        private void m49500a(C10302g c10302g) {
            this.f40477b = C17783c.b(C4423a.ah(this.f40476a.f40534a), C4423a.ai(this.f40476a.f40534a));
            this.f40478c = C13545b.m52934b(C4423a.dE(this.f40476a.f40534a));
            this.f40479d = C17782j.b(C4423a.bw(this.f40476a.f40534a), C4423a.by(this.f40476a.f40534a), C4423a.bL(this.f40476a.f40534a));
            this.f40480e = LoadDiscoverySettings_Factory.create(C4423a.bO(this.f40476a.f40534a));
            this.f40481f = C17779b.b(C4423a.u(this.f40476a.f40534a), this.f40480e, C4423a.ao(this.f40476a.f40534a), C4423a.bD(this.f40476a.f40534a), C4423a.dF(this.f40476a.f40534a));
            this.f40482g = ObserveProfilePhotos_Factory.create(C4423a.dG(this.f40476a.f40534a));
            this.f40483h = C17781h.b(this.f40482g, C4423a.dH(this.f40476a.f40534a));
            this.f40484i = C17780f.b(C4423a.u(this.f40476a.f40534a), C4423a.dI(this.f40476a.f40534a));
            this.f40485j = C13351b.m51653b(C4423a.u(this.f40476a.f40534a), C4423a.dJ(this.f40476a.f40534a));
            this.f40486k = C17281c.a(C17788y.b(C4423a.Y(this.f40476a.f40534a), this.f40477b, this.f40478c, this.f40479d, this.f40481f, this.f40483h, this.f40484i, C4423a.bH(this.f40476a.f40534a), C4423a.df(this.f40476a.f40534a), this.f40485j, C4423a.au(this.f40476a.f40534a), C4423a.cd(this.f40476a.f40534a)));
            this.f40487l = C17760c.b(C4423a.Y(this.f40476a.f40534a), C4423a.cO(this.f40476a.f40534a), C4423a.dK(this.f40476a.f40534a), C4423a.ah(this.f40476a.f40534a), C4423a.aB(this.f40476a.f40534a), C4423a.ao(this.f40476a.f40534a));
            this.f40488m = C13349b.m51647b(C4423a.dL(this.f40476a.f40534a));
            this.f40489n = C17281c.a(C17786v.b(C4423a.cQ(this.f40476a.f40534a), C4423a.cD(this.f40476a.f40534a), C4423a.cO(this.f40476a.f40534a), this.f40487l, C4423a.R(this.f40476a.f40534a), C4423a.dM(this.f40476a.f40534a), C4423a.aB(this.f40476a.f40534a), C4423a.ao(this.f40476a.f40534a), C17784c.c(), this.f40488m));
        }

        public void inject(ProfileTabView profileTabView) {
            m49499a(profileTabView);
        }

        public void inject(ControllaView controllaView) {
            m49498a(controllaView);
        }

        /* renamed from: a */
        private ProfileTabView m49499a(ProfileTabView profileTabView) {
            C16208a.a(profileTabView, (C14476x) this.f40486k.get());
            C16208a.a(profileTabView, (Lifecycle) this.f40476a.aZ.get());
            C16208a.a(profileTabView, new C14461a());
            return profileTabView;
        }

        /* renamed from: a */
        private ControllaView m49498a(ControllaView controllaView) {
            C16158j.a(controllaView, (C14474d) this.f40489n.get());
            return controllaView;
        }
    }

    /* renamed from: com.tinder.application.a$n$j */
    private final class C12552j implements RecsCardsComponent {
        /* renamed from: a */
        final /* synthetic */ a$n f40490a;

        private C12552j(a$n a_n, C10303i c10303i) {
            this.f40490a = a_n;
        }

        public void inject(TappyLoopsCarouselView tappyLoopsCarouselView) {
            m49501a(tappyLoopsCarouselView);
        }

        /* renamed from: a */
        private TappyLoopsCarouselView m49501a(TappyLoopsCarouselView tappyLoopsCarouselView) {
            TappyLoopsCarouselView_MembersInjector.injectPresenter(tappyLoopsCarouselView, new TappyLoopsCarouselViewPresenter());
            return tappyLoopsCarouselView;
        }
    }

    /* renamed from: com.tinder.application.a$n$n */
    private final class C12553n implements SuperLikeableViewComponent {
        /* renamed from: a */
        final /* synthetic */ a$n f40491a;

        private C12553n(a$n a_n, C10306m c10306m) {
            this.f40491a = a_n;
        }

        /* renamed from: a */
        private C6214c m49502a() {
            return new C6214c((CrmEventTracker) C4423a.dN(this.f40491a.f40534a).get());
        }

        /* renamed from: b */
        private C15140a m49504b() {
            return new C15140a(C4423a.dO(this.f40491a.f40534a), C4423a.dP(this.f40491a.f40534a), C4423a.dQ(this.f40491a.f40534a), C4423a.aM(this.f40491a.f40534a), this.f40491a.f40534a.loadProfileOptionData(), m49502a(), (C15139b) C4423a.dR(this.f40491a.f40534a).get());
        }

        /* renamed from: c */
        private C16895d m49505c() {
            return new C16895d((C2630h) C4423a.u(this.f40491a.f40534a).get());
        }

        /* renamed from: d */
        private AddSuperLikeableSessionEvent m49506d() {
            return new AddSuperLikeableSessionEvent((C2630h) C4423a.u(this.f40491a.f40534a).get(), (C8308d) C4423a.dS(this.f40491a.f40534a).get());
        }

        /* renamed from: e */
        private C18196a m49507e() {
            return new C18196a((C2630h) C4423a.u(this.f40491a.f40534a).get(), new C15096f());
        }

        /* renamed from: f */
        private C18200e m49508f() {
            return new C18200e(m49505c(), m49506d(), m49507e(), (C15139b) C4423a.dR(this.f40491a.f40534a).get(), C4423a.dT(this.f40491a.f40534a));
        }

        public void inject(SuperLikeableViewContainer superLikeableViewContainer) {
            m49503a(superLikeableViewContainer);
        }

        /* renamed from: a */
        private SuperLikeableViewContainer m49503a(SuperLikeableViewContainer superLikeableViewContainer) {
            C16908d.a(superLikeableViewContainer, m49504b());
            C16908d.a(superLikeableViewContainer, m49508f());
            return superLikeableViewContainer;
        }
    }

    /* renamed from: com.tinder.application.a$n$p */
    private final class C12554p implements TopPicksComponent {
        /* renamed from: a */
        final /* synthetic */ a$n f40492a;
        /* renamed from: b */
        private C8254a f40493b;
        /* renamed from: c */
        private C13119d f40494c;
        /* renamed from: d */
        private Provider<TopPicksRepository> f40495d;
        /* renamed from: e */
        private Provider<C15256e> f40496e;
        /* renamed from: f */
        private Provider<LegacyPaywallLauncher> f40497f;
        /* renamed from: g */
        private Provider<TopPicksPaywallViewFactory> f40498g;
        /* renamed from: h */
        private Provider<C11018m> f40499h;
        /* renamed from: i */
        private Provider<TopPicksCountUpdatesObserver> f40500i;
        /* renamed from: j */
        private Provider<SettingsLauncher> f40501j;
        /* renamed from: k */
        private Provider<C16487f> f40502k;
        /* renamed from: l */
        private Provider<ScrollStatusProvider> f40503l;
        /* renamed from: m */
        private Provider<ScrollStatusNotifier> f40504m;
        /* renamed from: n */
        private Provider<C14782d> f40505n;
        /* renamed from: o */
        private Provider<TopPicksCountUpdater> f40506o;

        private C12554p(a$n a_n, C10307o c10307o) {
            this.f40492a = a_n;
            m49530a(c10307o);
        }

        /* renamed from: a */
        private GetTopPicksRefreshTime m49518a() {
            return new GetTopPicksRefreshTime(C4423a.dU(this.f40492a.f40534a));
        }

        /* renamed from: b */
        private UpdateTopPicksSession m49531b() {
            return new UpdateTopPicksSession((TopPicksSessionRepository) C4423a.dV(this.f40492a.f40534a).get());
        }

        /* renamed from: c */
        private C15223c m49532c() {
            return new C15223c((C2630h) C4423a.u(this.f40492a.f40534a).get(), (SubscriptionProvider) C4423a.aB(this.f40492a.f40534a).get());
        }

        /* renamed from: d */
        private C15298a m49533d() {
            return new C15298a((TopPicksRepository) this.f40495d.get(), m49518a(), m49531b(), m49532c(), (TopPicksLoadingStatusNotifier) C4423a.dW(this.f40492a.f40534a).get());
        }

        /* renamed from: e */
        private ObserveTopPicksTeasers m49534e() {
            return new ObserveTopPicksTeasers((TopPicksRepository) this.f40495d.get());
        }

        /* renamed from: f */
        private DeleteExpireTopPickTeasersUseCase m49535f() {
            return new DeleteExpireTopPickTeasersUseCase((TopPicksRepository) this.f40495d.get(), (SubscriptionProvider) C4423a.aB(this.f40492a.f40534a).get());
        }

        /* renamed from: g */
        private UpdateSessionAfterNonGoldTeasersEmpty m49536g() {
            return new UpdateSessionAfterNonGoldTeasersEmpty((TopPicksSessionRepository) C4423a.dV(this.f40492a.f40534a).get(), m49518a(), (SubscriptionProvider) C4423a.aB(this.f40492a.f40534a).get(), C12842e.m50437c(C4423a.aG(this.f40492a.f40534a)));
        }

        /* renamed from: h */
        private C15299c m49537h() {
            return new C15299c(m49533d(), m49534e(), new C15270a(), (C15256e) this.f40496e.get(), m49518a(), (TopPicksLoadingStatusProvider) C4423a.dW(this.f40492a.f40534a).get(), CommonDomainModule_ProvideTimeIntervalMins$domain_releaseFactory.proxyProvideTimeIntervalMins$domain_release(C4423a.aI(this.f40492a.f40534a)), m49535f(), m49536g());
        }

        /* renamed from: i */
        private ResetTopPickSession m49538i() {
            return new ResetTopPickSession((TopPicksSessionRepository) C4423a.dV(this.f40492a.f40534a).get(), (RecsEngineRegistry) C4423a.cq(this.f40492a.f40534a).get());
        }

        /* renamed from: j */
        private C15265b m49539j() {
            return new C15265b(m49538i());
        }

        /* renamed from: k */
        private ObserveTopPicksCount m49540k() {
            return new ObserveTopPicksCount((TopPicksCountUpdatesObserver) this.f40500i.get());
        }

        /* renamed from: l */
        private C15237a m49541l() {
            return new C15237a(m49540k(), (TopPicksLoadingStatusProvider) C4423a.dW(this.f40492a.f40534a).get());
        }

        /* renamed from: m */
        private C15257a m49542m() {
            return new C15257a(C4423a.co(this.f40492a.f40534a), (TopPicksLoadingStatusProvider) C4423a.dW(this.f40492a.f40534a).get(), m49538i(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(C4423a.aI(this.f40492a.f40534a)), (TopPicksSessionRepository) C4423a.dV(this.f40492a.f40534a).get());
        }

        /* renamed from: n */
        private GridSuperLikeButtonPresenter m49543n() {
            return new GridSuperLikeButtonPresenter((SuperLikeRatingStatusProvider) C4423a.dX(this.f40492a.f40534a).get(), (SuperLikeRatingStatusNotifier) C4423a.dY(this.f40492a.f40534a).get(), (RatingProcessor) C4423a.cK(this.f40492a.f40534a).get());
        }

        /* renamed from: o */
        private C15268f m49544o() {
            return new C15268f(C4423a.dZ(this.f40492a.f40534a), (OfferRepository) C4423a.aD(this.f40492a.f40534a).get());
        }

        /* renamed from: p */
        private C16977b m49545p() {
            return new C16977b((OfferRepository) C4423a.aD(this.f40492a.f40534a).get(), (C2630h) C4423a.u(this.f40492a.f40534a).get());
        }

        /* renamed from: q */
        private ObserveTopPicksSession m49546q() {
            return new ObserveTopPicksSession((TopPicksSessionRepository) C4423a.dV(this.f40492a.f40534a).get());
        }

        /* renamed from: r */
        private C17090j m49547r() {
            return new C17090j(C4423a.ea(this.f40492a.f40534a), m49544o(), m49545p(), C4423a.eb(this.f40492a.f40534a), m49546q(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(C4423a.aI(this.f40492a.f40534a)));
        }

        /* renamed from: s */
        private C15295q m49548s() {
            return new C15295q(C4423a.ec(this.f40492a.f40534a), (RecsEngineRegistry) C4423a.cq(this.f40492a.f40534a).get());
        }

        /* renamed from: t */
        private C14418b m49549t() {
            return new C14418b(this.f40492a.f40534a.resources(), (bj) C4423a.W(this.f40492a.f40534a).get(), C4423a.X(this.f40492a.f40534a), (CurrentUserProvider) C4423a.Y(this.f40492a.f40534a).get());
        }

        /* renamed from: u */
        private RecsCardFactory m49550u() {
            return new RecsCardFactory(new RecsPhotoUrlFactory(), (CardSizeProvider) C4423a.an(this.f40492a.f40534a).get(), m49549t(), (AbTestUtility) C4423a.f(this.f40492a.f40534a).get());
        }

        /* renamed from: v */
        private MarkTopPicksTutorialAsSeen m49551v() {
            return new MarkTopPicksTutorialAsSeen(C4423a.dU(this.f40492a.f40534a));
        }

        /* renamed from: w */
        private ShouldShowTopPicksTutorial m49552w() {
            return new ShouldShowTopPicksTutorial(C4423a.dU(this.f40492a.f40534a), C4423a.ay(this.f40492a.f40534a));
        }

        /* renamed from: x */
        private ObserveTopPicksResponse m49553x() {
            return new ObserveTopPicksResponse((TopPicksRepository) this.f40495d.get());
        }

        /* renamed from: y */
        private UpdateTopPicksSessionFromRecsUpdate m49554y() {
            return new UpdateTopPicksSessionFromRecsUpdate((TopPicksSessionRepository) C4423a.dV(this.f40492a.f40534a).get());
        }

        /* renamed from: z */
        private DecrementTopPicksCount m49555z() {
            return new DecrementTopPicksCount((TopPicksCountUpdater) this.f40506o.get());
        }

        /* renamed from: A */
        private BypassTopPicksEnd m49509A() {
            return new BypassTopPicksEnd((TopPicksRepository) this.f40495d.get());
        }

        /* renamed from: B */
        private SetTopPicksCount m49510B() {
            return new SetTopPicksCount((TopPicksCountUpdater) this.f40506o.get());
        }

        /* renamed from: C */
        private C17082e m49511C() {
            return new C17082e((RecsEngineRegistry) C4423a.cq(this.f40492a.f40534a).get(), m49550u(), (ScrollStatusProvider) this.f40503l.get(), (ScrollStatusNotifier) this.f40504m.get(), (C14782d) this.f40505n.get(), m49551v(), m49552w(), m49531b(), m49553x(), m49554y(), m49555z(), m49532c(), CommonDomainModule_ProvideTimeIntervalMins$domain_releaseFactory.proxyProvideTimeIntervalMins$domain_release(C4423a.aI(this.f40492a.f40534a)), C13153xad945d7.proxyProvideCurrentDateTimeMillis$domain_release(C4423a.aI(this.f40492a.f40534a)), m49509A(), C4423a.ed(this.f40492a.f40534a), (C15256e) this.f40496e.get(), (RatingProcessor) C4423a.cK(this.f40492a.f40534a).get(), m49510B(), (SuperLikeRatingStatusNotifier) C4423a.dY(this.f40492a.f40534a).get(), m49546q());
        }

        /* renamed from: D */
        private ObserveTopPicksScreenState m49512D() {
            return new ObserveTopPicksScreenState((SubscriptionProvider) C4423a.aB(this.f40492a.f40534a).get(), m49546q(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(C4423a.aI(this.f40492a.f40534a)));
        }

        /* renamed from: E */
        private GetTopPicksSession m49513E() {
            return new GetTopPicksSession((TopPicksSessionRepository) C4423a.dV(this.f40492a.f40534a).get());
        }

        /* renamed from: F */
        private C15284a m49514F() {
            return new C15284a(m49512D(), m49513E(), (TopPicksLoadingStatusProvider) C4423a.dW(this.f40492a.f40534a).get());
        }

        /* renamed from: G */
        private C15272i m49515G() {
            return new C15272i(C13155xa389edd5.proxyProvidesComputationScheduler$domain_release(C4423a.aF(this.f40492a.f40534a)), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(C4423a.aI(this.f40492a.f40534a)), m49538i(), m49546q());
        }

        /* renamed from: H */
        private C15252a m49516H() {
            return new C15252a(this.f40492a.f40534a.loadProfileOptionData(), C4423a.ay(this.f40492a.f40534a));
        }

        /* renamed from: I */
        private C15292m m49517I() {
            return new C15292m(m49512D(), m49515G(), m49535f(), m49546q(), (RecsEngineRegistry) C4423a.cq(this.f40492a.f40534a).get(), (C15254a) C4423a.ee(this.f40492a.f40534a).get(), C4423a.aM(this.f40492a.f40534a), C4423a.ef(this.f40492a.f40534a), (CurrentScreenNotifier) C4423a.M(this.f40492a.f40534a).get(), m49516H(), (SubscriptionProvider) C4423a.aB(this.f40492a.f40534a).get());
        }

        /* renamed from: a */
        private void m49530a(C10307o c10307o) {
            this.f40494c = C13119d.m50991b(C4423a.eg(this.f40492a.f40534a));
            this.f40495d = C17281c.a(C12543m.m49362b(c10307o.f33659b, this.f40494c, C4423a.eh(this.f40492a.f40534a), C13115h.m50981c(), C4423a.ei(this.f40492a.f40534a), C4423a.bD(this.f40492a.f40534a)));
            this.f40496e = C17281c.a(C12541k.m49354b(c10307o.f33659b, C4423a.ej(this.f40492a.f40534a), C18233k.c()));
            this.f40497f = C17281c.a(C12532b.m49317b(c10307o.f33659b));
            this.f40498g = C17281c.a(C12542l.m49357b(c10307o.f33659b));
            this.f40499h = C17281c.a(C12539i.m49346b(c10307o.f33659b, this.f40495d));
            this.f40500i = C17281c.a(C12540j.m49350b(c10307o.f33659b, this.f40499h));
            this.f40501j = C17281c.a(C12537g.m49338b(c10307o.f33659b, C4423a.f(this.f40492a.f40534a)));
            this.f40493b = c10307o.f33659b;
            this.f40502k = C17281c.a(C12535e.m49329b(c10307o.f33659b));
            this.f40503l = C17281c.a(C12536f.m49334b(c10307o.f33659b, this.f40502k));
            this.f40504m = C17281c.a(C12534d.m49326b(c10307o.f33659b, this.f40502k));
            this.f40505n = C17281c.a(C12533c.m49321b(c10307o.f33659b));
            this.f40506o = C17281c.a(C12538h.m49342b(c10307o.f33659b, this.f40499h));
        }

        public void inject(TopPicksTeasersView topPicksTeasersView) {
            m49524a(topPicksTeasersView);
        }

        public void inject(TopPicksExhaustedView topPicksExhaustedView) {
            m49523a(topPicksExhaustedView);
        }

        public void inject(GoldShimmerTimerView goldShimmerTimerView) {
            m49525a(goldShimmerTimerView);
        }

        public void inject(TopPicksBottomCounterView topPicksBottomCounterView) {
            m49520a(topPicksBottomCounterView);
        }

        public void inject(TopPicksEmptyView topPicksEmptyView) {
            m49522a(topPicksEmptyView);
        }

        public void inject(GridSuperLikeButtonView gridSuperLikeButtonView) {
            m49519a(gridSuperLikeButtonView);
        }

        public void inject(TopPicksPaywallView topPicksPaywallView) {
            m49521a(topPicksPaywallView);
        }

        public void inject(TopPicksUserRecCardView topPicksUserRecCardView) {
            m49528a(topPicksUserRecCardView);
        }

        public void inject(TopPicksGridRecsView topPicksGridRecsView) {
            m49527a(topPicksGridRecsView);
        }

        public void inject(TopPicksGoldView topPicksGoldView) {
            m49526a(topPicksGoldView);
        }

        public void inject(TopPicksView topPicksView) {
            m49529a(topPicksView);
        }

        /* renamed from: a */
        private TopPicksTeasersView m49524a(TopPicksTeasersView topPicksTeasersView) {
            C17134g.a(topPicksTeasersView, m49537h());
            C17134g.a(topPicksTeasersView, (LegacyPaywallLauncher) this.f40497f.get());
            C17134g.a(topPicksTeasersView, (Lifecycle) this.f40492a.aZ.get());
            return topPicksTeasersView;
        }

        /* renamed from: a */
        private TopPicksExhaustedView m49523a(TopPicksExhaustedView topPicksExhaustedView) {
            C17023d.a(topPicksExhaustedView, m49539j());
            C17023d.a(topPicksExhaustedView, (TopPicksPaywallViewFactory) this.f40498g.get());
            return topPicksExhaustedView;
        }

        /* renamed from: a */
        private GoldShimmerTimerView m49525a(GoldShimmerTimerView goldShimmerTimerView) {
            C17150c.a(goldShimmerTimerView, new C16995d());
            C17150c.a(goldShimmerTimerView, (C15256e) this.f40496e.get());
            return goldShimmerTimerView;
        }

        /* renamed from: a */
        private TopPicksBottomCounterView m49520a(TopPicksBottomCounterView topPicksBottomCounterView) {
            C16993d.a(topPicksBottomCounterView, m49541l());
            return topPicksBottomCounterView;
        }

        /* renamed from: a */
        private TopPicksEmptyView m49522a(TopPicksEmptyView topPicksEmptyView) {
            C17022d.a(topPicksEmptyView, m49542m());
            C17022d.a(topPicksEmptyView, (SettingsLauncher) this.f40501j.get());
            return topPicksEmptyView;
        }

        /* renamed from: a */
        private GridSuperLikeButtonView m49519a(GridSuperLikeButtonView gridSuperLikeButtonView) {
            GridSuperLikeButtonView_MembersInjector.injectPresenter(gridSuperLikeButtonView, m49543n());
            return gridSuperLikeButtonView;
        }

        /* renamed from: a */
        private TopPicksPaywallView m49521a(TopPicksPaywallView topPicksPaywallView) {
            C16997c.a(topPicksPaywallView, m49547r());
            C16997c.a(topPicksPaywallView, (SettingsLauncher) this.f40501j.get());
            return topPicksPaywallView;
        }

        /* renamed from: a */
        private TopPicksUserRecCardView m49528a(TopPicksUserRecCardView topPicksUserRecCardView) {
            C17263c.a(topPicksUserRecCardView, (UserRecActivePhotoIndexProvider) C4423a.cB(this.f40492a.f40534a).get());
            C17263c.a(topPicksUserRecCardView, C12544n.m49365b(this.f40493b));
            C17155i.a(topPicksUserRecCardView, m49548s());
            return topPicksUserRecCardView;
        }

        /* renamed from: a */
        private TopPicksGridRecsView m49527a(TopPicksGridRecsView topPicksGridRecsView) {
            C17264e.a(topPicksGridRecsView, (UserRecActivePhotoIndexProvider) C4423a.cB(this.f40492a.f40534a).get());
            C17264e.a(topPicksGridRecsView, C4423a.aS(this.f40492a.f40534a));
            C17154h.a(topPicksGridRecsView, m49511C());
            C17154h.a(topPicksGridRecsView, new C15267e());
            C17154h.a(topPicksGridRecsView, (Lifecycle) this.f40492a.aZ.get());
            return topPicksGridRecsView;
        }

        /* renamed from: a */
        private TopPicksGoldView m49526a(TopPicksGoldView topPicksGoldView) {
            C17152e.a(topPicksGoldView, (LegacyPaywallLauncher) this.f40497f.get());
            C17152e.a(topPicksGoldView, m49514F());
            C17152e.a(topPicksGoldView, (Lifecycle) this.f40492a.aZ.get());
            return topPicksGoldView;
        }

        /* renamed from: a */
        private TopPicksView m49529a(TopPicksView topPicksView) {
            C17156j.a(topPicksView, m49517I());
            C17156j.a(topPicksView, new C15267e());
            C17156j.a(topPicksView, (Lifecycle) this.f40492a.aZ.get());
            return topPicksView;
        }
    }

    /* renamed from: com.tinder.application.a$n$r */
    private final class C12555r implements VideoComponent {
        /* renamed from: a */
        final /* synthetic */ a$n f40507a;

        private C12555r(a$n a_n, C10308q c10308q) {
            this.f40507a = a_n;
        }

        /* renamed from: a */
        private C15411b m49556a() {
            return new C15411b(C12526n.m49294c(), C4423a.ek(this.f40507a.f40534a), C13333c.m51590c(C4423a.di(this.f40507a.f40534a)));
        }

        public void inject(MediaView mediaView) {
            m49557a(mediaView);
        }

        /* renamed from: a */
        private MediaView m49557a(MediaView mediaView) {
            C17258a.a(mediaView, (C15412a) C4423a.el(this.f40507a.f40534a).get());
            C17258a.a(mediaView, m49556a());
            return mediaView;
        }
    }

    private a$n(C4423a c4423a, a$m a_m) {
        this.f40534a = c4423a;
        m49586a(a_m);
        m49588b(a_m);
    }

    /* renamed from: j */
    private C9714e m49591j() {
        return new C9714e((bk) C4423a.j(this.f40534a).get());
    }

    /* renamed from: k */
    private TutorialsInteractor m49592k() {
        return new TutorialsInteractor((AbTestUtility) C4423a.f(this.f40534a).get(), (UserMetaManager) C4423a.l(this.f40534a).get(), (bk) C4423a.j(this.f40534a).get(), (FastMatchConfigProvider) C4423a.ao(this.f40534a).get(), C4423a.ay(this.f40534a));
    }

    /* renamed from: l */
    private C16939e m49593l() {
        return new C16939e(C4423a.az(this.f40534a), (C2630h) C4423a.u(this.f40534a).get());
    }

    /* renamed from: m */
    private C16921j m49594m() {
        return new C16921j((C2630h) C4423a.u(this.f40534a).get(), C4423a.aA(this.f40534a), (SubscriptionProvider) C4423a.aB(this.f40534a).get(), (FastMatchStatusProvider) C4423a.aC(this.f40534a).get(), (FastMatchConfigProvider) C4423a.ao(this.f40534a).get());
    }

    /* renamed from: n */
    private C7311a m49595n() {
        return new C7311a((OfferRepository) C4423a.aD(this.f40534a).get(), m49593l(), m49594m());
    }

    /* renamed from: o */
    private LoadAndUpdateDeviceInfo m49596o() {
        return new LoadAndUpdateDeviceInfo((DeviceInfoRepository) C4423a.aE(this.f40534a).get(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(C4423a.aF(this.f40534a)), C12842e.m50437c(C4423a.aG(this.f40534a)));
    }

    /* renamed from: p */
    private C10713a m49597p() {
        return new C10713a((CrashTimeStampGateway) C4423a.aH(this.f40534a).get(), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(C4423a.aI(this.f40534a)));
    }

    /* renamed from: q */
    private ObserveDeviceInfo m49598q() {
        return new ObserveDeviceInfo((DeviceInfoRepository) C4423a.aE(this.f40534a).get());
    }

    /* renamed from: r */
    private GetMatchByUserId m49599r() {
        return new GetMatchByUserId(C4423a.ap(this.f40534a));
    }

    /* renamed from: s */
    private C8589c m49600s() {
        return new C8589c((C8588a) C4423a.aJ(this.f40534a).get());
    }

    /* renamed from: t */
    private Set<ThirdPartyLocationUpdatesListener> m49601t() {
        return Collections.singleton(C4423a.aK(this.f40534a).get());
    }

    /* renamed from: u */
    private C15346o m49602u() {
        return new C15346o(m49600s(), (AppVisibilityTracker) C4423a.aL(this.f40534a).get(), m49601t());
    }

    /* renamed from: v */
    private MainPageRouter m49603v() {
        return aa.m49175a(this.f40535b, new C8301a());
    }

    /* renamed from: w */
    private C8890a m49604w() {
        return new C8890a(C17281c.b(this.f40549p), new C8301a(), m49603v());
    }

    /* renamed from: x */
    private C16246h m49605x() {
        return new C16246h((OfferRepository) C4423a.aD(this.f40534a).get());
    }

    /* renamed from: y */
    private C17221d m49606y() {
        return new C17221d(C4423a.aM(this.f40534a), (bk) C4423a.j(this.f40534a).get());
    }

    /* renamed from: z */
    private C15392c m49607z() {
        return aj.m48990a(this.f40536c, C4423a.aN(this.f40534a));
    }

    /* renamed from: A */
    private VerificationRepository m49558A() {
        return al.m48997a(this.f40536c, (TinderUserApi) C4423a.af(this.f40534a).get());
    }

    /* renamed from: B */
    private C15391b m49559B() {
        return ah.m48983a(this.f40536c, m49558A());
    }

    /* renamed from: C */
    private C15390a m49560C() {
        return ag.m48979a(this.f40536c, C4423a.aN(this.f40534a));
    }

    /* renamed from: D */
    private C17224h m49561D() {
        return new C17224h((C2652a) C4423a.k(this.f40534a).get(), C4423a.aO(this.f40534a), C12842e.m50437c(C4423a.aG(this.f40534a)));
    }

    /* renamed from: E */
    private AddAuthAccountLinkModalEvent m49562E() {
        return ae.m48973a(this.f40536c, (C2630h) C4423a.u(this.f40534a).get());
    }

    /* renamed from: F */
    private C15393a m49563F() {
        return com.tinder.app.dagger.module.af.m48976a(this.f40536c, m49562E(), C12842e.m50437c(C4423a.aG(this.f40534a)), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(C4423a.aF(this.f40534a)));
    }

    /* renamed from: G */
    private df m49564G() {
        C9714e j = m49591j();
        TutorialsInteractor k = m49592k();
        ManagerAnalytics managerAnalytics = (ManagerAnalytics) C4423a.p(this.f40534a).get();
        C10333h aP = C4423a.aP(this.f40534a);
        AbTestUtility abTestUtility = (AbTestUtility) C4423a.f(this.f40534a).get();
        UserMetaManager userMetaManager = (UserMetaManager) C4423a.l(this.f40534a).get();
        UpdateAccountPasswordLastShownDateProvider aQ = C4423a.aQ(this.f40534a);
        FastMatchConfigProvider fastMatchConfigProvider = (FastMatchConfigProvider) C4423a.ao(this.f40534a).get();
        TinderSchemaParser tinderSchemaParser = new TinderSchemaParser();
        Context context = (Context) C4423a.aR(this.f40534a).get();
        C8406b aS = C4423a.aS(this.f40534a);
        C16923a aT = C4423a.aT(this.f40534a);
        ar arVar = new ar();
        CountMatches aU = C4423a.aU(this.f40534a);
        C10314b aV = C4423a.aV(this.f40534a);
        C7311a n = m49595n();
        C10314b c10314b = aV;
        C14864a t = C4423a.t(this.f40534a);
        bk bkVar = (bk) C4423a.j(this.f40534a).get();
        LoadAndUpdateDeviceInfo o = m49596o();
        C10713a p = m49597p();
        ObserveDeviceInfo q = m49598q();
        ManagerDeepLinking managerDeepLinking = (ManagerDeepLinking) C4423a.x(this.f40534a).get();
        GetMatchByUserId r = m49599r();
        GetCurrentUser aW = C4423a.aW(this.f40534a);
        C7318a c7318a = new C7318a();
        return ge.a(j, k, managerAnalytics, aP, abTestUtility, userMetaManager, aQ, fastMatchConfigProvider, tinderSchemaParser, context, aS, aT, arVar, aU, c10314b, n, t, bkVar, o, p, q, managerDeepLinking, r, aW, c7318a, (RecsSessionTracker) C4423a.aX(this.f40534a).get(), (C9879g) C4423a.aY(this.f40534a).get(), (C11695a) C4423a.aZ(this.f40534a).get(), m49602u(), m49604w(), C4423a.ay(this.f40534a), this.f40534a.loadProfileOptionData(), m49605x(), m49606y(), (C14838f) C4423a.ba(this.f40534a).get(), (C16576a) C4423a.bb(this.f40534a).get(), (C7343b) this.f40542i.get(), C4423a.bc(this.f40534a), (List) this.f40513F.get(), (C18432c) this.f40540g.get(), C4423a.bd(this.f40534a), (C14548a) C4423a.al(this.f40534a).get(), C4423a.be(this.f40534a), C4423a.am(this.f40534a), C4423a.bf(this.f40534a), C4423a.aM(this.f40534a), m49607z(), m49559B(), m49560C(), C4423a.bg(this.f40534a), C4423a.bh(this.f40534a), m49561D(), m49563F(), RxSchedulersModule_ProvidesIoScheduler$domain_releaseFactory.proxyProvidesIoScheduler$domain_release(C4423a.aF(this.f40534a)));
    }

    /* renamed from: H */
    private C13543a m49565H() {
        return C13544d.m52930a(C4423a.bi(this.f40534a), (C2664c) C4423a.o(this.f40534a).get());
    }

    /* renamed from: I */
    private BackPressInterceptor m49566I() {
        return C12497i.m49158a(this.f40535b);
    }

    /* renamed from: J */
    private BackPressInterceptor m49567J() {
        return C12500l.m49168a((MatchesSearchStateProvider) this.f40514G.get());
    }

    /* renamed from: K */
    private Set<BackPressInterceptor> m49568K() {
        return C15522k.a(2).a(m49566I()).a(m49567J()).a();
    }

    /* renamed from: L */
    private MainPage m49569L() {
        return C12521v.m49275a((C11695a) C4423a.aZ(this.f40534a).get());
    }

    /* renamed from: M */
    private LifecycleObserver m49570M() {
        return C12498j.m49161a((C9703a) C4423a.bj(this.f40534a).get(), (CurrentScreenNotifier) C4423a.M(this.f40534a).get());
    }

    /* renamed from: N */
    private RecsAdLifecycleObserver m49571N() {
        return new RecsAdLifecycleObserver((RecsAdsMonitor) C4423a.bk(this.f40534a).get(), (RecsAdsRegistrar) this.f40522O.get());
    }

    /* renamed from: O */
    private LifecycleObserver m49572O() {
        return RecsAdsModule_ProvideRecsAdLifecycleObserverFactory.proxyProvideRecsAdLifecycleObserver(m49571N());
    }

    /* renamed from: P */
    private C16433f m49573P() {
        return new C16433f((C2630h) C4423a.u(this.f40534a).get(), C4423a.bl(this.f40534a));
    }

    /* renamed from: Q */
    private RecsAdCtaBouncebackLifecycleObserver m49574Q() {
        return new RecsAdCtaBouncebackLifecycleObserver((CtaBounceBackTimer) C4423a.bm(this.f40534a).get(), m49573P());
    }

    /* renamed from: R */
    private LifecycleObserver m49575R() {
        return RecsAdsModule_ProvideRecsAdCtaBouncebackLifecycleObserverFactory.proxyProvideRecsAdCtaBouncebackLifecycleObserver(m49574Q());
    }

    /* renamed from: S */
    private C12084b m49576S() {
        return new C12084b(C4423a.bn(this.f40534a), C4423a.ap(this.f40534a), CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory.proxyProvideDateTimeProvider$domain_release(C4423a.aI(this.f40534a)));
    }

    /* renamed from: T */
    private C12087e m49577T() {
        return new C12087e(C4423a.bn(this.f40534a), C4423a.ap(this.f40534a), (MessageRepository) C4423a.bo(this.f40534a).get());
    }

    /* renamed from: U */
    private C15032a m49578U() {
        return C13451i.m51952a(this.f40537d, m49576S(), m49577T());
    }

    /* renamed from: V */
    private C15033d m49579V() {
        return C13457o.m51976a(this.f40537d, C4423a.bn(this.f40534a), (com.tinder.addy.AdAggregator) this.f40529V.get(), new C13472c(), C4423a.bp(this.f40534a), C4423a.bq(this.f40534a), m49578U());
    }

    /* renamed from: W */
    private LifecycleObserver m49580W() {
        return C13458p.m51979a(this.f40537d, (AbTestUtility) C4423a.f(this.f40534a).get(), (V1SponsoredMessageAdMonitor) this.f40528U.get(), (SponsoredMessageAdMonitor) this.ad.get(), m49579V());
    }

    /* renamed from: X */
    private Set<LifecycleObserver> m49581X() {
        return C15522k.a(10).a(C4423a.bs(this.f40534a)).a(C4423a.br(this.f40534a).get()).a(m49570M()).a(m49572O()).a(m49575R()).a(m49580W()).a(this.aA.get()).a(this.aB.get()).a(this.aG.get()).a(this.aJ.get()).a();
    }

    /* renamed from: Y */
    private C12082a m49582Y() {
        return new C12082a((TrackingUrlRepository) C4423a.bt(this.f40534a).get(), new NativeDfpTrackingUrlParser());
    }

    /* renamed from: Z */
    private C3942a m49583Z() {
        return new C3942a(C4423a.ap(this.f40534a), (MessageRepository) C4423a.bo(this.f40534a).get(), (CurrentUserProvider) C4423a.Y(this.f40534a).get(), m49582Y());
    }

    private OnPageSelectedListener aa() {
        return C13459q.m51982a(this.f40537d, (AbTestUtility) C4423a.f(this.f40534a).get(), (SponsoredMessageAdMonitor) this.ad.get(), (V1SponsoredMessageAdMonitor) this.f40528U.get(), m49583Z(), C4423a.bu(this.f40534a), new C14761a());
    }

    private OnPageSelectedListener ab() {
        return C12520u.m49272a((ManagerAnalytics) C4423a.p(this.f40534a).get(), (LegacyBreadCrumbTracker) C4423a.bv(this.f40534a).get());
    }

    private OnPageSelectedListener ac() {
        return com.tinder.app.dagger.module.main.ag.m49198a((C9695a) C4423a.bw(this.f40534a).get());
    }

    private OnPageSelectedListener ad() {
        return C12523x.m49283a((C9876b) C4423a.bx(this.f40534a).get());
    }

    private OnPageSelectedListener ae() {
        return com.tinder.app.dagger.module.main.ac.m49183a((C14458a) C4423a.by(this.f40534a).get());
    }

    private Map<MainPage, OnPageSelectedListener> af() {
        return C15515e.a(5).a(MainPage.PROFILE, this.f40557x.get()).a(MainPage.MATCHES, this.f40558y.get()).a(MainPage.RECS, this.f40559z.get()).a(MainPage.FEED, this.f40508A.get()).a(MainPage.DISCOVERY, this.f40511D.get()).a();
    }

    private Set<OnPageSelectedListener> ag() {
        return C12525z.m49290a((List) this.f40513F.get(), af());
    }

    private OnPageSelectedListener ah() {
        return C12516q.m49257a(this.f40538e, (C11131k) this.f40554u.get());
    }

    private ObserveHasUntouchedMatches ai() {
        return new ObserveHasUntouchedMatches(C4423a.ap(this.f40534a));
    }

    private PollForNewFeedItems aj() {
        return new PollForNewFeedItems((FeedRepository) C4423a.bz(this.f40534a).get(), C13156x9c0cf4b0.proxyProvidesRxJava1ComputationScheduler$domain_release(C4423a.aF(this.f40534a)), C12842e.m50437c(C4423a.aG(this.f40534a)));
    }

    private C11692g ak() {
        return new C11692g((C2630h) C4423a.u(this.f40534a).get(), (C9423b) C4423a.bA(this.f40534a).get());
    }

    private C11862a al() {
        return new C11862a(C4423a.bB(this.f40534a), aj(), C4423a.bC(this.f40534a), ak());
    }

    /* renamed from: a */
    private void m49586a(a$m a_m) {
        this.f40539f = C18317d.a(a_m.f33559i);
        this.f40540g = C17281c.a(C18222c.b(a_m.f33552b));
        this.f40541h = C18225f.b(a_m.f33552b, this.f40540g);
        this.f40542i = C17281c.a(C12513n.m49246b(a_m.f33553c));
        this.f40543j = C17281c.a(C8030h.b(a_m.f33554d, this.f40542i));
        this.f40544k = C18320l.a(2, 0).a(this.f40541h).a(this.f40543j).a();
        this.f40545l = C17281c.a(C12508i.m49227b(a_m.f33553c, C4423a.aB(this.f40534a), this.f40544k));
        this.f40546m = C18224e.b(a_m.f33552b, C4423a.bD(this.f40534a), C4423a.bE(this.f40534a), C4423a.bF(this.f40534a));
        this.f40547n = C8029g.b(a_m.f33554d, C4423a.bG(this.f40534a), C4423a.bH(this.f40534a), C4423a.bI(this.f40534a));
        this.f40548o = C12518s.m49266b(a_m.f33553c, this.f40539f);
        this.f40549p = new C18316b();
        this.f40550q = C12503d.m49207b(a_m.f33553c, this.f40549p);
        this.f40551r = C13148j.m51083b(C4423a.bJ(this.f40534a));
        this.f40552s = C17281c.a(C12505f.m49214b(a_m.f33553c));
        this.f40553t = C12502c.m49203b(a_m.f33553c, this.f40552s, C4423a.u(this.f40534a), C4423a.bK(this.f40534a), C4423a.bJ(this.f40534a), C4423a.au(this.f40534a));
        this.f40554u = C17281c.a(C12515p.m49255b(a_m.f33553c, this.f40551r, C4423a.u(this.f40534a), this.f40553t, C4423a.bK(this.f40534a), C4423a.au(this.f40534a)));
        this.f40555v = C12517r.m49262b(a_m.f33553c, this.f40554u);
        this.f40556w = C18320l.a(5, 0).a(this.f40546m).a(this.f40547n).a(this.f40548o).a(this.f40550q).a(this.f40555v).a();
        this.f40557x = C17281c.a(com.tinder.app.dagger.module.main.ae.m49192b(C4423a.bL(this.f40534a), C4423a.bH(this.f40534a), C4423a.aL(this.f40534a), C4423a.f(this.f40534a)));
        this.f40558y = C17281c.a(com.tinder.app.dagger.module.main.ab.m49180c());
        this.f40559z = C17281c.a(com.tinder.app.dagger.module.main.af.m49195c());
        this.f40508A = C17281c.a(C12524y.m49287c());
        this.f40509B = aa.m49177b(this.f40539f, C12612b.m49817c());
        this.f40510C = C13149b.m51086b(this.f40549p, C12612b.m49817c(), this.f40509B);
        this.f40511D = C17281c.a(C12522w.m49281b(C4423a.bM(this.f40534a), this.f40510C, C4423a.bI(this.f40534a), C4423a.bN(this.f40534a)));
        this.f40512E = C18318f.a(5).a(MainPage.PROFILE, this.f40557x).a(MainPage.MATCHES, this.f40558y).a(MainPage.RECS, this.f40559z).a(MainPage.FEED, this.f40508A).a(MainPage.DISCOVERY, this.f40511D).a();
        C18316b c18316b = (C18316b) this.f40549p;
        this.f40549p = C17281c.a(C12507h.m49223b(a_m.f33553c, this.f40539f, this.f40545l, this.f40556w, this.f40512E));
        c18316b.a(this.f40549p);
        this.f40535b = a_m.f33559i;
        this.f40513F = C17281c.a(com.tinder.app.dagger.module.main.ad.m49188b(C4423a.aZ(this.f40534a)));
        this.f40536c = a_m.f33555e;
        this.f40514G = C17281c.a(C12501m.m49172c());
        this.f40515H = C12808d.m50314b(C4423a.aJ(this.f40534a));
        this.f40516I = DfpFieldsResolverImpl_Factory.create(this.f40515H, C4423a.an(this.f40534a), C4423a.bO(this.f40534a), C4423a.ai(this.f40534a));
        this.f40517J = RecsAdsModule_ProvideDfpSourceBuilderFactory.create(this.f40539f);
        this.f40518K = RecsAdsModule_ProvideNativeDfpSourceBuilderFactoryFactory.create(this.f40539f);
        this.f40519L = RecsAdsModule_ProvideFanSourceBuilderFactory.create(this.f40539f);
        this.f40520M = RecsAdSourceRegistrar_Factory.create(C4423a.bP(this.f40534a), C4423a.bQ(this.f40534a), this.f40516I, this.f40517J, this.f40518K, RecsFanAd_Factory_Factory.create(), RecsNativeVideoAd_Factory_Factory.create(), RecsNativeDisplayAd_Factory_Factory.create(), V1BrandedProfileCardAd_Factory_Factory.create(), this.f40519L);
        this.f40521N = RecsAdsModule_ProvideRecsAdLoaderRegistrarFactory.create(C4423a.bQ(this.f40534a), C4423a.bR(this.f40534a), C18016b.c(), C4423a.bp(this.f40534a), C4423a.bS(this.f40534a), C18020j.c(), C18018f.c(), C18017d.c(), C18019h.c(), C4423a.bT(this.f40534a));
        this.f40522O = C17281c.a(RecsAdsModule_ProvideRecsAdRegistarFactory.create(C4423a.f(this.f40534a), this.f40520M, this.f40521N));
        this.f40537d = a_m.f33556f;
        this.f40523P = C17281c.a(C13452j.m51958b(a_m.f33556f, C4423a.aB(this.f40534a)));
        this.f40524Q = C13453k.m51962b(a_m.f33556f, C4423a.bU(this.f40534a), MessageAd_SponsoredMessageAdFactory_Factory.create(), this.f40516I, this.f40518K);
        this.f40525R = C13445d.m51943b(C4423a.bU(this.f40534a), C4423a.as(this.f40534a), C4423a.bE(this.f40534a));
        this.f40526S = C13450f.m51950b(C4423a.bU(this.f40534a), C4423a.as(this.f40534a), C4423a.bo(this.f40534a));
        this.f40527T = C13451i.m51954b(a_m.f33556f, this.f40525R, this.f40526S);
        this.f40528U = C17281c.a(C13461s.m51990b(this.f40523P, this.f40524Q, C4423a.bV(this.f40534a), C4423a.bW(this.f40534a), this.f40527T, C4423a.aB(this.f40534a)));
        this.f40529V = C17281c.a(C13454l.m51966b(a_m.f33556f, C4423a.bX(this.f40534a)));
        this.f40530W = C13460r.m51986b(a_m.f33556f);
        this.f40531X = SponsoredMessageTrackingUrlsAdAggregatorListener_Factory.create(C4423a.bY(this.f40534a), C18150g.c());
        this.f40532Y = SponsoredMessageAddAdRequestSendEvent_Factory.create(C4423a.u(this.f40534a));
        this.f40533Z = SponsoredMessageAddAdRequestReceiveEvent_Factory.create(C4423a.u(this.f40534a), C4423a.bZ(this.f40534a));
        this.aa = SponsoredMessageAnalyticsAdAggregatorListener_Factory.create(this.f40532Y, this.f40533Z);
        this.ab = C13455m.m51970b(a_m.f33556f, this.f40531X, this.aa);
        this.ac = C18320l.a(0, 1).b(this.ab).a();
        this.ad = C17281c.a(C13456n.m51974b(a_m.f33556f, this.f40529V, C4423a.ca(this.f40534a), this.f40530W, this.ac, C4423a.bU(this.f40534a)));
        this.ae = C12547v.m49377b(a_m.f33557g, this.f40539f);
        this.af = C17281c.a(C12550y.m49388b(a_m.f33557g));
        this.ag = C13144d.m51079b(C4423a.u(this.f40534a), this.f40551r, C4423a.au(this.f40534a));
        this.ah = C12531t.m49314b(a_m.f33557g, this.ae, this.ag);
        this.ai = C12546u.m49373b(a_m.f33557g, this.ah);
        this.aj = C12529r.m49306b(a_m.f33557g, C4423a.cb(this.f40534a), C4423a.bE(this.f40534a), C4423a.f(this.f40534a));
        this.ak = C13270d.m51327b(this.aj, C4423a.cc(this.f40534a));
        this.al = C17281c.a(C12527p.m49298b(a_m.f33557g, this.af, C4423a.aR(this.f40534a), this.ai, this.ak, C4423a.f(this.f40534a), C4423a.au(this.f40534a), C4423a.cd(this.f40534a)));
        this.am = C12454b.m48955b(a_m.f33558h, this.f40549p, this.ag, this.f40552s);
        this.an = C18223d.b(a_m.f33552b, C4423a.bD(this.f40534a), C4423a.bE(this.f40534a), this.am, C4423a.bF(this.f40534a), this.f40540g);
        this.ao = C17281c.a(C12455c.m48959b(a_m.f33558h, this.f40549p, this.ag, this.f40552s));
        this.ap = C12456d.m48963b(a_m.f33558h, this.ao);
        this.aq = C18226g.b(a_m.f33552b, this.af, C4423a.ce(this.f40534a), C4423a.ah(this.f40534a), C4423a.bF(this.f40534a), C4423a.cf(this.f40534a), C4423a.bL(this.f40534a), C4423a.bH(this.f40534a), this.f40540g, this.ap);
        this.ar = C8033m.b(C4423a.bL(this.f40534a), this.f40542i, C4423a.cf(this.f40534a), C4423a.ce(this.f40534a));
        this.as = C8032k.b(C4423a.bG(this.f40534a), this.f40542i, C4423a.ce(this.f40534a), C4423a.cf(this.f40534a));
        this.at = C17281c.a(C8028f.b(a_m.f33554d, this.am, this.ar, this.as));
        this.au = C17281c.a(C8031i.b(a_m.f33554d, this.af, this.ar, C4423a.aR(this.f40534a), this.ap));
        this.av = ak.m48994b(a_m.f33555e);
        this.aw = ag.m48981b(a_m.f33555e, C4423a.cg(this.f40534a));
        this.ax = ai.m48988b(a_m.f33555e, this.af, this.av, this.aw, C4423a.au(this.f40534a), C4423a.cd(this.f40534a), this.f40539f);
        this.ay = C18320l.a(6, 0).a(this.al).a(this.an).a(this.aq).a(this.at).a(this.au).a(this.ax).a();
        this.az = C17281c.a(C12549x.m49385b(a_m.f33557g, this.ay));
        this.aA = C17281c.a(C12528q.m49302b(a_m.f33557g, this.ae, this.az));
        this.aB = C17281c.a(C12530s.m49310b(a_m.f33557g, this.ae, this.az));
        this.aC = C12506g.m49218b(a_m.f33553c);
        this.aD = C12511l.m49239b(a_m.f33553c, C4423a.bK(this.f40534a), this.aC);
        this.aE = C12509j.m49230b(a_m.f33553c);
        this.aF = C17281c.a(C12510k.m49235b(a_m.f33553c, this.f40539f, this.aE));
        this.aG = C17281c.a(C12504e.m49211b(a_m.f33553c, this.aD, this.f40545l, this.aF));
        this.aH = C12519t.m49270b(a_m.f33553c, C4423a.bK(this.f40534a));
        this.aI = C8034a.b(this.aH, C4423a.ch(this.f40534a), C4423a.ci(this.f40534a));
        this.aJ = C17281c.a(C12514o.m49251b(a_m.f33553c, this.aI));
        this.aK = C17281c.a(C12548w.m49381b(a_m.f33557g, this.az));
        this.f40538e = a_m.f33553c;
        this.aL = ObserveHasUntouchedMatches_Factory.create(C4423a.as(this.f40534a));
        this.aM = C13388b.m51787b(this.aL, C4423a.bN(this.f40534a));
        this.aN = C13326g.m51569b(C4423a.bL(this.f40534a), C4423a.f(this.f40534a));
        this.aO = PollForNewFeedItems_Factory.create(C4423a.bz(this.f40534a), C4423a.cj(this.f40534a), C4423a.bN(this.f40534a));
        this.aP = C13238h.m51241b(C4423a.u(this.f40534a), C4423a.bA(this.f40534a));
        this.aQ = C13323b.m51560b(C4423a.cc(this.f40534a), this.aO, C4423a.ck(this.f40534a), this.aP);
        this.aR = C13325e.m51566b(C4423a.aB(this.f40534a), this.aM, this.aN, this.aQ);
        this.aS = C12512m.m49242b(a_m.f33553c);
        this.aT = C18320l.a(1, 0).a(this.aS).a();
        this.aU = C13387f.m51784b(this.f40539f, this.f40513F, this.f40512E, this.aT, this.f40549p, this.aF);
        this.aV = C17281c.a(this.aU);
    }

    /* renamed from: b */
    private void m49588b(a$m a_m) {
        this.aW = C12521v.m49277b(C4423a.aZ(this.f40534a));
        this.aX = C13331p.m51582b(this.f40539f, this.f40513F, this.aR, this.aV, this.f40512E, this.f40549p, this.aW);
        this.aY = C17281c.a(this.aX);
        this.aZ = C17281c.a(C12499k.m49166b(this.f40539f));
    }

    public void inject(MainActivity mainActivity) {
        m49584a(mainActivity);
    }

    public Set<OnPageSelectedListener> pageSelectedListeners() {
        return C15522k.a(8).a(aa()).a(this.aK.get()).a(ab()).a(ac()).a(ad()).a(ae()).a(ag()).a(ah()).a();
    }

    public MainTabbedPageLayoutAdapter mainTabbedPageLayoutAdapter() {
        return (MainTabbedPageLayoutAdapter) this.aY.get();
    }

    public List<MainPage> mainPages() {
        return (List) this.f40513F.get();
    }

    /* renamed from: a */
    public RecsViewComponent.Builder m49608a() {
        return new C10304k();
    }

    /* renamed from: b */
    public MatchesViewComponent.Builder m49609b() {
        return new C10300e();
    }

    /* renamed from: c */
    public MatchesListComponent.Builder m49610c() {
        return new C10298c();
    }

    /* renamed from: d */
    public Builder m49611d() {
        return new C10296a();
    }

    /* renamed from: e */
    public ProfileTabViewComponent.Builder m49612e() {
        return new C10302g();
    }

    /* renamed from: f */
    public SuperLikeableViewComponent.Builder m49613f() {
        return new C10306m();
    }

    /* renamed from: g */
    public TopPicksComponent.Builder m49614g() {
        return new C10307o();
    }

    /* renamed from: h */
    public VideoComponent.Builder m49615h() {
        return new C10308q();
    }

    /* renamed from: i */
    public RecsCardsComponent.Builder m49616i() {
        return new C10303i();
    }

    /* renamed from: a */
    private MainActivity m49584a(MainActivity mainActivity) {
        C10358b.m42176a((ActivityBase) mainActivity, (bk) C4423a.j(this.f40534a).get());
        C10358b.m42174a((ActivityBase) mainActivity, (C2652a) C4423a.k(this.f40534a).get());
        C10358b.m42173a((ActivityBase) mainActivity, (UserMetaManager) C4423a.l(this.f40534a).get());
        C10358b.m42172a((ActivityBase) mainActivity, (ManagerFusedLocation) C4423a.m(this.f40534a).get());
        C10358b.m42177a((ActivityBase) mainActivity, (bt) C4423a.h(this.f40534a).get());
        C10358b.m42175a((ActivityBase) mainActivity, (com.tinder.managers.af) C4423a.n(this.f40534a).get());
        C10358b.m42178a((ActivityBase) mainActivity, (C2664c) C4423a.o(this.f40534a).get());
        C10358b.m42171a((ActivityBase) mainActivity, (ManagerAnalytics) C4423a.p(this.f40534a).get());
        C10363g.m42184a((ActivitySignedInBase) mainActivity, (bk) C4423a.j(this.f40534a).get());
        C10363g.m42183a((ActivitySignedInBase) mainActivity, (ManagerProfile) C4423a.v(this.f40534a).get());
        C10363g.m42191a((ActivitySignedInBase) mainActivity, (UpdatesScheduler) C4423a.w(this.f40534a).get());
        C10363g.m42182a((ActivitySignedInBase) mainActivity, (ManagerDeepLinking) C4423a.x(this.f40534a).get());
        C10363g.m42185a((ActivitySignedInBase) mainActivity, (bq) C4423a.y(this.f40534a).get());
        C10363g.m42187a((ActivitySignedInBase) mainActivity, C4423a.z(this.f40534a));
        C10363g.m42186a((ActivitySignedInBase) mainActivity, C4423a.A(this.f40534a));
        C10363g.m42192a((ActivitySignedInBase) mainActivity, (C2664c) C4423a.B(this.f40534a).get());
        C10363g.m42189a((ActivitySignedInBase) mainActivity, (Register) C4423a.C(this.f40534a).get());
        C10363g.m42181a((ActivitySignedInBase) mainActivity, (C8259d) C4423a.D(this.f40534a).get());
        C10363g.m42188a((ActivitySignedInBase) mainActivity, C4423a.E(this.f40534a));
        C10363g.m42190a((ActivitySignedInBase) mainActivity, C4423a.F(this.f40534a));
        com.tinder.activities.ah.a(mainActivity, (C2652a) C4423a.k(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, (bk) C4423a.j(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, (bj) C4423a.W(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, (ManagerDeepLinking) C4423a.x(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, (bq) C4423a.y(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, (ManagerFusedLocation) C4423a.m(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, (bt) C4423a.h(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, (LegacyBreadCrumbTracker) C4423a.bv(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, m49564G());
        com.tinder.activities.ah.a(mainActivity, m49565H());
        com.tinder.activities.ah.a(mainActivity, (Gson) C4423a.d(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, (ConnectionClassManager) C4423a.cl(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, C4423a.aS(this.f40534a));
        com.tinder.activities.ah.a(mainActivity, (com.tinder.analytics.performance.af) C4423a.cm(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, (C9695a) C4423a.bw(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, m49568K());
        com.tinder.activities.ah.a(mainActivity, m49569L());
        com.tinder.activities.ah.b(mainActivity, m49581X());
        com.tinder.activities.ah.a(mainActivity, (C14548a) C4423a.al(this.f40534a).get());
        com.tinder.activities.ah.a(mainActivity, C4423a.am(this.f40534a));
        com.tinder.activities.ah.a(mainActivity, (AccountKitConfiguration) C4423a.cn(this.f40534a).get());
        return mainActivity;
    }
}
