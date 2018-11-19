package com.tinder.recs.module;

import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.C5987p;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.C8151o;
import com.tinder.analytics.performance.C8157y;
import com.tinder.api.TinderApi;
import com.tinder.api.moshi.ResponseErrorAdapter;
import com.tinder.app.dagger.module.p163e.C8248a;
import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.common.provider.C2643c;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.adapter.C10746z;
import com.tinder.data.adapter.ah;
import com.tinder.data.adapter.ah.C10733a;
import com.tinder.data.match.C10799v;
import com.tinder.data.places.PlacesRecsApiClient.C8736b;
import com.tinder.data.recs.C10990e;
import com.tinder.data.recs.C8776g;
import com.tinder.data.toppicks.C11007e;
import com.tinder.data.toppicks.C11016j;
import com.tinder.data.toppicks.C11027p;
import com.tinder.data.toppicks.C11028q;
import com.tinder.data.toppicks.C8795i;
import com.tinder.domain.injection.qualifiers.UtcOffsetMins;
import com.tinder.domain.match.provider.NewMatchNotifier;
import com.tinder.domain.profile.usecase.SaveSuperlikeStatus;
import com.tinder.domain.recs.RatingsApiClient;
import com.tinder.domain.recs.RecsAdditionalDataPrefetcher;
import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.RecsEngine.Configurator;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.SwipeDataStore;
import com.tinder.domain.recs.engine.SwipeProcessingRulesResolver;
import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.domain.recs.engine.dispatcher.SwipeDispatcher.Factory;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.domain.recs.model.RecSource.FastMatch;
import com.tinder.domain.recs.model.RecSource.TopPicks;
import com.tinder.domain.toppicks.TopPicksDiscoveryNotificationDispatcher;
import com.tinder.domain.toppicks.TopPicksLoadingStatusNotifier;
import com.tinder.domain.utils.AgeCalculator;
import com.tinder.fastmatch.p244b.C11621a;
import com.tinder.fastmatch.p339e.C11624a;
import com.tinder.managers.bj;
import com.tinder.module.Default;
import com.tinder.module.ForApplication;
import com.tinder.places.p353e.C12335a;
import com.tinder.recs.RecsPhotoUrlFactory;
import com.tinder.recs.analytics.AddNewMatchEvent;
import com.tinder.recs.analytics.AddRecsSessionEvent;
import com.tinder.recs.analytics.RecsPhotosViewedCache;
import com.tinder.recs.analytics.RecsPhotosViewedCache.Recycler;
import com.tinder.recs.analytics.RecsPhotosViewedCache.RecyclerLruCache;
import com.tinder.recs.analytics.RecsSessionTracker;
import com.tinder.recs.analytics.RecsSessionTracker.RecsScreen;
import com.tinder.recs.analytics.RecsSessionTracker.RecsSessionFactory;
import com.tinder.recs.analytics.RecsSessionTracker.SystemUpTimeProvider;
import com.tinder.recs.analytics.dedupe.RecsPhotoViewDuplicateEventChecker;
import com.tinder.recs.api.CardStackRecsApiClient;
import com.tinder.recs.api.ParseErrorBodyTransformer;
import com.tinder.recs.api.PerformanceTrackingTransformer;
import com.tinder.recs.api.ResponseParser;
import com.tinder.recs.api.TimeoutTimer;
import com.tinder.recs.card.CardSizeProvider;
import com.tinder.recs.data.DefaultRatingsApiClient;
import com.tinder.recs.data.PaperSwipeRepository;
import com.tinder.recs.data.RatingRequestFactory;
import com.tinder.recs.data.RatingResultAdapter;
import com.tinder.recs.data.RecsDataPrefetcher;
import com.tinder.recs.data.RewindsAvailableSharedPreferencesRepository;
import com.tinder.recs.domain.repository.RewindsAvailableRepository;
import com.tinder.recs.domain.usecase.DecrementRewindsAvailable;
import com.tinder.recs.domain.usecase.IncrementRewindsAvailable;
import com.tinder.recs.domain.usecase.ObserveRewindsAvailable;
import com.tinder.recs.engine.DefaultRecsEngineConfiguratorFactory;
import com.tinder.recs.provider.SuperLikeRatingStatusNotifier;
import com.tinder.recs.provider.SuperLikeRatingStatusProvider;
import com.tinder.recs.provider.SuperLikeRatingStatusProviderAndNotifier;
import com.tinder.recs.rule.CardStackSwipeProcessingRulesResolver;
import com.tinder.recs.rule.DupesPreventionRule;
import com.tinder.recs.rule.LocalOutOfLikesBouncerRule;
import com.tinder.recs.rule.RecsSessionTrackerRule;
import com.tinder.recs.rule.SwipeDispatchRule;
import com.tinder.recs.rule.UserRecSwipeAnalyticsRule;
import com.tinder.superlike.p418a.C15066a;
import com.tinder.superlike.p421e.C15082f;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import com.tinder.toppicks.p483d.C16994a;
import com.tinder.util.ConnectivityProvider;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import io.paperdb.Paper;
import java.util.LinkedList;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.jvm.functions.Function0;
import rx.schedulers.Schedulers;

@Module(includes = {C8248a.class})
public class RecsModule {
    private static final int MAX_REC_CARDS_ON_CARDSTACK = 2;
    private static final int MAX_REC_PROFILES_THAT_CAN_BE_OPENED_FROM_CARDSTACK = 1;
    private static final int MAX_REWIND_REC_CARDS_ALLOWED = 1;
    public static final String NAME_CORE = "core";
    private static final String NAME_FAST_MATCH = "fast_match";
    public static final String NAME_PLACES = "places";
    private static final String NAME_TOP_PICKS = "top_picks";
    private static final int RECS_PHOTO_VIEWED_CACHE_RECYCLER_SIZE = 3;
    private static final int RECS_PHOTO_VIEWED_LRU_CACHE_SIZE = 2;
    private static final int RECS_PHOTO_VIEW_DUPLICATE_EVENT_CHECKER_CACHE_SIZE = 24;
    private static final String SWIPE_PAPER_BOOK_NAME = "swipes";

    @Singleton
    @Provides
    SuperLikeRatingStatusNotifier provideSuperLikeRatingStatusNotifier(SuperLikeRatingStatusProviderAndNotifier superLikeRatingStatusProviderAndNotifier) {
        return superLikeRatingStatusProviderAndNotifier;
    }

    @Singleton
    @Provides
    SuperLikeRatingStatusProvider provideSuperLikeRatingStatusProvider(SuperLikeRatingStatusProviderAndNotifier superLikeRatingStatusProviderAndNotifier) {
        return superLikeRatingStatusProviderAndNotifier;
    }

    @Provides
    @Named("fast_match")
    SwipeProcessingRulesResolver provideFastMatchSwipeProcessingRulesResolver(Lazy<SwipeDispatchRule> lazy, Lazy<DupesPreventionRule> lazy2, Lazy<UserRecSwipeAnalyticsRule> lazy3) {
        return new C11624a(lazy, lazy2, lazy3);
    }

    @Provides
    @Named("places")
    SwipeProcessingRulesResolver providePlacesSwipeProcessingRulesResolver(Lazy<SwipeDispatchRule> lazy, Lazy<DupesPreventionRule> lazy2, Lazy<UserRecSwipeAnalyticsRule> lazy3, Lazy<LocalOutOfLikesBouncerRule> lazy4) {
        return new C12335a(lazy, lazy2, lazy3, lazy4);
    }

    @Provides
    @Named("top_picks")
    SwipeProcessingRulesResolver provideTopPicksSwipeProcessingRulesResolver(Lazy<SwipeDispatchRule> lazy, Lazy<DupesPreventionRule> lazy2, Lazy<UserRecSwipeAnalyticsRule> lazy3) {
        return new C16994a(lazy, lazy2, lazy3);
    }

    @Singleton
    @Provides
    @Named("places")
    C8736b providePlacesApiClientFactory(TinderApi tinderApi, C10733a c10733a, AgeCalculator ageCalculator, ResponseErrorAdapter responseErrorAdapter) {
        return new C8736b(tinderApi, c10733a, ageCalculator, responseErrorAdapter);
    }

    @Provides
    @Named("core")
    RecsApiClient provideCoreRecsApiClient(TinderApi tinderApi, bj bjVar, @Named("core") C8151o c8151o, @Named("core") ah ahVar, C5987p c5987p, C2643c c2643c) {
        String language = c2643c.a().getLanguage();
        return new CardStackRecsApiClient(tinderApi, language, new ResponseParser(ahVar), new PerformanceTrackingTransformer(language, bjVar, c8151o), new ParseErrorBodyTransformer(c5987p), new TimeoutTimer(Schedulers.computation()));
    }

    @Singleton
    @Provides
    C11621a provideFastMatchApiClient(TinderApi tinderApi, @Named("fast_match") ah ahVar) {
        return new C11621a(tinderApi, ahVar);
    }

    @Singleton
    @Provides
    C11016j provideTopPicksApiClient(TinderApi tinderApi, C8795i c8795i, @UtcOffsetMins Function0<Integer> function0, ConnectivityProvider connectivityProvider, TopPicksLoadingStatusNotifier topPicksLoadingStatusNotifier, TopPicksDiscoveryNotificationDispatcher topPicksDiscoveryNotificationDispatcher) {
        return new C11016j(tinderApi, c8795i, function0, connectivityProvider, topPicksLoadingStatusNotifier, topPicksDiscoveryNotificationDispatcher);
    }

    @Provides
    C8795i provideTopPickResponseDomainApiAdapter(C11027p c11027p, C11028q c11028q) {
        return new C8795i(c11027p, c11028q);
    }

    @Provides
    C11027p provideTopPicksRecDomainApiAdapter(@Named("top_picks") ah ahVar, C11007e c11007e) {
        return new C11027p(ahVar, c11007e);
    }

    @Provides
    C11028q provideTopPicksTeaserRecDomainApiAdapter(C10746z c10746z, C11007e c11007e) {
        return new C11028q(c10746z, c11007e);
    }

    @Singleton
    @Provides
    @Named("core")
    ah provideRecV2DomainApiAdapter(C10733a c10733a, AgeCalculator ageCalculator) {
        return new ah(c10733a, Core.INSTANCE, ageCalculator);
    }

    @Singleton
    @Provides
    @Named("fast_match")
    ah provideFastMatchRecV2DomainApiAdapter(C10733a c10733a, AgeCalculator ageCalculator) {
        return new ah(c10733a, FastMatch.INSTANCE, ageCalculator);
    }

    @Provides
    @Named("top_picks")
    ah provideTopPicksRecV2DomainApiAdapter(C10733a c10733a, AgeCalculator ageCalculator) {
        return new ah(c10733a, TopPicks.INSTANCE, ageCalculator);
    }

    @Singleton
    @Provides
    @Named("core")
    C8151o provideRecsEvent(C2630h c2630h, AbTestUtility abTestUtility) {
        return new C8151o(c2630h, abTestUtility);
    }

    @Singleton
    @Provides
    SwipeDataStore provideSwipeDataStore() {
        return new PaperSwipeRepository(Paper.book(SWIPE_PAPER_BOOK_NAME));
    }

    @Singleton
    @Provides
    RatingProcessor provideRatingProcessor(Factory factory) {
        return factory.getRatingProcessor();
    }

    @Singleton
    @Provides
    RatingsApiClient provideRatingsApiClient(TinderApi tinderApi, RatingRequestFactory ratingRequestFactory, RatingResultAdapter ratingResultAdapter, LikeStatusProvider likeStatusProvider, C15066a c15066a, C15082f c15082f, C10799v c10799v, NewMatchNotifier newMatchNotifier, RecsEngineRegistry recsEngineRegistry, C2630h c2630h, AbTestUtility abTestUtility, AddNewMatchEvent addNewMatchEvent, C10990e c10990e, SaveSuperlikeStatus saveSuperlikeStatus) {
        return new DefaultRatingsApiClient(tinderApi, ratingRequestFactory, ratingResultAdapter, likeStatusProvider, c15066a, c15082f, c10799v, newMatchNotifier, recsEngineRegistry, c2630h, abTestUtility, addNewMatchEvent, c10990e, saveSuperlikeStatus);
    }

    @Singleton
    @Provides
    RecsAdditionalDataPrefetcher provideRecsAdditionalDataPrefetcher(@ForApplication Context context, RecsPhotoUrlFactory recsPhotoUrlFactory, CardSizeProvider cardSizeProvider) {
        return new RecsDataPrefetcher(context, recsPhotoUrlFactory, cardSizeProvider);
    }

    @Singleton
    @Provides
    C8776g provideRecsAlreadySwipedProvider() {
        return new C8776g();
    }

    @Singleton
    @Provides
    Factory provideSwipeDispatcherFactory(RatingsApiClient ratingsApiClient, SwipeDataStore swipeDataStore, ConnectivityProvider connectivityProvider) {
        return new Factory(ratingsApiClient, swipeDataStore, connectivityProvider);
    }

    @Provides
    Configurator.Factory provideRecsEngineConfiguratorFactory(@Named("core") RecsApiClient recsApiClient, Provider<C11621a> provider, Provider<C11016j> provider2, @Named("places") C8736b c8736b, RecsAdditionalDataPrefetcher recsAdditionalDataPrefetcher, ConnectivityProvider connectivityProvider, C8776g c8776g, CardStackSwipeProcessingRulesResolver cardStackSwipeProcessingRulesResolver, @Named("fast_match") SwipeProcessingRulesResolver swipeProcessingRulesResolver, @Named("places") SwipeProcessingRulesResolver swipeProcessingRulesResolver2, @Named("top_picks") SwipeProcessingRulesResolver swipeProcessingRulesResolver3, C8157y c8157y) {
        return new DefaultRecsEngineConfiguratorFactory(recsApiClient, provider, provider2, c8736b, recsAdditionalDataPrefetcher, connectivityProvider, c8776g, cardStackSwipeProcessingRulesResolver, swipeProcessingRulesResolver, swipeProcessingRulesResolver2, swipeProcessingRulesResolver3, c8157y);
    }

    @Singleton
    @Provides
    RecsEngineRegistry provideRecsEngineRegistry(Configurator.Factory factory) {
        RecsEngineRegistry recsEngineRegistry = new RecsEngineRegistry(factory);
        recsEngineRegistry.addEngineIfAbsent(Core.INSTANCE);
        return recsEngineRegistry;
    }

    @Singleton
    @Provides
    RecsPhotoViewDuplicateEventChecker provideRecsPhotoViewDuplicateEventChecker() {
        return new RecsPhotoViewDuplicateEventChecker(24);
    }

    @Singleton
    @Provides
    RecsPhotosViewedCache provideRecsPhotoViewedCache() {
        Recycler recycler = new Recycler(3, RecsModule$$Lambda$0.$instance, 6, new LinkedList());
        return new RecsPhotosViewedCache(new RecyclerLruCache(2, recycler), recycler);
    }

    @Singleton
    @Provides
    @Named("core")
    RecsSessionTracker recsSessionTracker(CurrentScreenTracker currentScreenTracker, AddRecsSessionEvent addRecsSessionEvent, RecsSessionFactory recsSessionFactory) {
        return new RecsSessionTracker(currentScreenTracker, recsSessionFactory.createRecsSession(RecsScreen.CARD_STACK), addRecsSessionEvent, new SystemUpTimeProvider());
    }

    @Provides
    @Named("core")
    RecsSessionTrackerRule recsSessionTrackerRule(@Named("core") RecsSessionTracker recsSessionTracker) {
        return new RecsSessionTrackerRule(recsSessionTracker);
    }

    @Singleton
    @Provides
    RewindsAvailableRepository provideRewindsAvailableRepository(@Default SharedPreferences sharedPreferences) {
        return new RewindsAvailableSharedPreferencesRepository(sharedPreferences);
    }

    @Provides
    DecrementRewindsAvailable provideDescrementRewindsAvailable(RewindsAvailableRepository rewindsAvailableRepository) {
        return new DecrementRewindsAvailable(rewindsAvailableRepository);
    }

    @Provides
    IncrementRewindsAvailable provideIncrementRewindsAvailable(RewindsAvailableRepository rewindsAvailableRepository) {
        return new IncrementRewindsAvailable(rewindsAvailableRepository);
    }

    @Provides
    ObserveRewindsAvailable provideObserveRewindsAvailable(RewindsAvailableRepository rewindsAvailableRepository) {
        return new ObserveRewindsAvailable(rewindsAvailableRepository);
    }
}
