package com.tinder.recs.presenter;

import android.content.res.Resources;
import com.tinder.apprating.p086a.C8259d;
import com.tinder.boost.p178a.C10400d;
import com.tinder.boost.p179b.C10403e;
import com.tinder.boost.p179b.C8338a;
import com.tinder.boost.provider.BoostUpdateProvider;
import com.tinder.boost.provider.C2639c;
import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deeplink.p229b.C8819a;
import com.tinder.domain.profile.usecase.ObserveDiscoverySettings;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.domain.superlikeable.usecase.SuperLikeOnGameRec;
import com.tinder.fireboarding.domain.C11802c;
import com.tinder.fireboarding.domain.C11817r;
import com.tinder.fireboarding.domain.C11823t;
import com.tinder.managers.bk;
import com.tinder.profile.p363b.C14386k;
import com.tinder.profile.p363b.C16093z;
import com.tinder.profile.p363b.aj;
import com.tinder.pushnotifications.C14550a;
import com.tinder.pushnotifications.p380a.C14548a;
import com.tinder.recs.RecsCardFactory;
import com.tinder.recs.adapter.SharedRecLegacyUserAdapter;
import com.tinder.recs.analytics.AddIntroCardShakeEvent;
import com.tinder.recs.analytics.AddRecsRewindEvent;
import com.tinder.recs.analytics.RecsSessionTracker;
import com.tinder.recs.domain.usecase.DecrementRewindsAvailable;
import com.tinder.recs.rule.AdSwipeTerminationRule;
import com.tinder.recs.rule.LocalOutOfLikesBouncerRule;
import com.tinder.recs.rule.TutorialSwipeRule;
import com.tinder.recs.usecase.CanUserRewind;
import com.tinder.recs.usecase.DeleteSuperLike;
import com.tinder.screenshot.analytics.C16562a;
import com.tinder.screenshotty.C14830c;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.superlike.p421e.C15082f;
import com.tinder.superlikeable.analytics.C18198b;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProvider;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

public final class RecsPresenter_Factory implements Factory<RecsPresenter> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<C8338a> activateBoostProvider;
    private final Provider<AdSwipeTerminationRule> adSwipeTerminationRuleProvider;
    private final Provider<C16562a> addAppScreenshotEventProvider;
    private final Provider<AddIntroCardShakeEvent> addIntroCardShakeEventProvider;
    private final Provider<C14386k> addProfileShareEventProvider;
    private final Provider<AddRecsRewindEvent> addRecsRewindEventProvider;
    private final Provider<C18198b> addSuperLikeableProfileInteractEventProvider;
    private final Provider<C10400d> boostInteractorProvider;
    private final Provider<C2639c> boostStateProvider;
    private final Provider<BoostUpdateProvider> boostUpdateProvider;
    private final Provider<CanUserRewind> canUserRewindProvider;
    private final Provider<RecsCardFactory> cardFactoryProvider;
    private final Provider<C10403e> checkBoostPaywallTutorialProvider;
    private final Provider<C11802c> completeFireboardingLevelProvider;
    private final Provider<C15679f> computationSchedulerProvider;
    private final Provider<CurrentScreenTracker> currentScreenTrackerProvider;
    private final Provider<DecrementRewindsAvailable> decrementRewindsAvailableProvider;
    private final Provider<C8819a> deepLinkedEventProvider;
    private final Provider<DeleteSuperLike> deleteSuperLikeProvider;
    private final Provider<RecsEngineRegistry> engineRegistryProvider;
    private final Provider<C16093z> getShareLinkUrlProvider;
    private final Provider<C8259d> legacyAppRatingDialogProvider;
    private final Provider<LikeStatusProvider> likeStatusProvider;
    private final Provider<LocalOutOfLikesBouncerRule> localOutOfLikesBouncerRuleProvider;
    private final Provider<C14550a> notificationDispatcherProvider;
    private final Provider<C14548a> notificationFactoryProvider;
    private final Provider<ObserveDiscoverySettings> observeDiscoverySettingsProvider;
    private final Provider<aj> profileShareEventFactoryProvider;
    private final Provider<RatingProcessor> ratingProcessorProvider;
    private final Provider<RecsSessionTracker> recsSessionTrackerProvider;
    private final Provider<C11817r> removeFireboardingRecProvider;
    private final Provider<Resources> resourcesProvider;
    private final Provider<C14830c> screenshottyProvider;
    private final Provider<bk> sharedPreferencesProvider;
    private final Provider<SharedRecLegacyUserAdapter> sharedRecLegacyUserAdapterProvider;
    private final Provider<C11823t> shouldShowNudgeAnimationProvider;
    private final Provider<SuperLikeOnGameRec> superLikeOnGameRecProvider;
    private final Provider<SuperLikeableViewStateProvider> superLikeableViewStateProvider;
    private final Provider<C15071e> superlikeInteractorProvider;
    private final Provider<C15082f> superlikeStatusProvider;
    private final Provider<TutorialSwipeRule> swipeTutorialRuleProvider;
    private final Provider<C15193i> tinderPlusInteractorProvider;

    public RecsPresenter_Factory(Provider<RecsEngineRegistry> provider, Provider<RecsCardFactory> provider2, Provider<bk> provider3, Provider<LikeStatusProvider> provider4, Provider<C15082f> provider5, Provider<TutorialSwipeRule> provider6, Provider<LocalOutOfLikesBouncerRule> provider7, Provider<RatingProcessor> provider8, Provider<C8819a> provider9, Provider<SharedRecLegacyUserAdapter> provider10, Provider<C10403e> provider11, Provider<C2639c> provider12, Provider<C10400d> provider13, Provider<C8338a> provider14, Provider<BoostUpdateProvider> provider15, Provider<C15193i> provider16, Provider<ObserveDiscoverySettings> provider17, Provider<C8259d> provider18, Provider<DeleteSuperLike> provider19, Provider<AbTestUtility> provider20, Provider<AddIntroCardShakeEvent> provider21, Provider<AdSwipeTerminationRule> provider22, Provider<SuperLikeableViewStateProvider> provider23, Provider<C18198b> provider24, Provider<Resources> provider25, Provider<C14548a> provider26, Provider<C14550a> provider27, Provider<SuperLikeOnGameRec> provider28, Provider<C15071e> provider29, Provider<RecsSessionTracker> provider30, Provider<AddRecsRewindEvent> provider31, Provider<C11802c> provider32, Provider<C11817r> provider33, Provider<C14830c> provider34, Provider<C11823t> provider35, Provider<CurrentScreenTracker> provider36, Provider<C16562a> provider37, Provider<C16093z> provider38, Provider<C14386k> provider39, Provider<aj> provider40, Provider<DecrementRewindsAvailable> provider41, Provider<CanUserRewind> provider42, Provider<C15679f> provider43) {
        this.engineRegistryProvider = provider;
        this.cardFactoryProvider = provider2;
        this.sharedPreferencesProvider = provider3;
        this.likeStatusProvider = provider4;
        this.superlikeStatusProvider = provider5;
        this.swipeTutorialRuleProvider = provider6;
        this.localOutOfLikesBouncerRuleProvider = provider7;
        this.ratingProcessorProvider = provider8;
        this.deepLinkedEventProvider = provider9;
        this.sharedRecLegacyUserAdapterProvider = provider10;
        this.checkBoostPaywallTutorialProvider = provider11;
        this.boostStateProvider = provider12;
        this.boostInteractorProvider = provider13;
        this.activateBoostProvider = provider14;
        this.boostUpdateProvider = provider15;
        this.tinderPlusInteractorProvider = provider16;
        this.observeDiscoverySettingsProvider = provider17;
        this.legacyAppRatingDialogProvider = provider18;
        this.deleteSuperLikeProvider = provider19;
        this.abTestUtilityProvider = provider20;
        this.addIntroCardShakeEventProvider = provider21;
        this.adSwipeTerminationRuleProvider = provider22;
        this.superLikeableViewStateProvider = provider23;
        this.addSuperLikeableProfileInteractEventProvider = provider24;
        this.resourcesProvider = provider25;
        this.notificationFactoryProvider = provider26;
        this.notificationDispatcherProvider = provider27;
        this.superLikeOnGameRecProvider = provider28;
        this.superlikeInteractorProvider = provider29;
        this.recsSessionTrackerProvider = provider30;
        this.addRecsRewindEventProvider = provider31;
        this.completeFireboardingLevelProvider = provider32;
        this.removeFireboardingRecProvider = provider33;
        this.screenshottyProvider = provider34;
        this.shouldShowNudgeAnimationProvider = provider35;
        this.currentScreenTrackerProvider = provider36;
        this.addAppScreenshotEventProvider = provider37;
        this.getShareLinkUrlProvider = provider38;
        this.addProfileShareEventProvider = provider39;
        this.profileShareEventFactoryProvider = provider40;
        this.decrementRewindsAvailableProvider = provider41;
        this.canUserRewindProvider = provider42;
        this.computationSchedulerProvider = provider43;
    }

    public RecsPresenter get() {
        Provider provider = this.engineRegistryProvider;
        Provider provider2 = this.cardFactoryProvider;
        Provider provider3 = this.sharedPreferencesProvider;
        Provider provider4 = this.likeStatusProvider;
        Provider provider5 = this.superlikeStatusProvider;
        Provider provider6 = this.swipeTutorialRuleProvider;
        Provider provider7 = this.localOutOfLikesBouncerRuleProvider;
        Provider provider8 = this.ratingProcessorProvider;
        Provider provider9 = this.deepLinkedEventProvider;
        Provider provider10 = this.sharedRecLegacyUserAdapterProvider;
        Provider provider11 = this.checkBoostPaywallTutorialProvider;
        Provider provider12 = this.boostStateProvider;
        Provider provider13 = this.boostInteractorProvider;
        Provider provider14 = this.activateBoostProvider;
        Provider provider15 = this.boostUpdateProvider;
        return provideInstance(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, this.tinderPlusInteractorProvider, this.observeDiscoverySettingsProvider, this.legacyAppRatingDialogProvider, this.deleteSuperLikeProvider, this.abTestUtilityProvider, this.addIntroCardShakeEventProvider, this.adSwipeTerminationRuleProvider, this.superLikeableViewStateProvider, this.addSuperLikeableProfileInteractEventProvider, this.resourcesProvider, this.notificationFactoryProvider, this.notificationDispatcherProvider, this.superLikeOnGameRecProvider, this.superlikeInteractorProvider, this.recsSessionTrackerProvider, this.addRecsRewindEventProvider, this.completeFireboardingLevelProvider, this.removeFireboardingRecProvider, this.screenshottyProvider, this.shouldShowNudgeAnimationProvider, this.currentScreenTrackerProvider, this.addAppScreenshotEventProvider, this.getShareLinkUrlProvider, this.addProfileShareEventProvider, this.profileShareEventFactoryProvider, this.decrementRewindsAvailableProvider, this.canUserRewindProvider, this.computationSchedulerProvider);
    }

    public static RecsPresenter provideInstance(Provider<RecsEngineRegistry> provider, Provider<RecsCardFactory> provider2, Provider<bk> provider3, Provider<LikeStatusProvider> provider4, Provider<C15082f> provider5, Provider<TutorialSwipeRule> provider6, Provider<LocalOutOfLikesBouncerRule> provider7, Provider<RatingProcessor> provider8, Provider<C8819a> provider9, Provider<SharedRecLegacyUserAdapter> provider10, Provider<C10403e> provider11, Provider<C2639c> provider12, Provider<C10400d> provider13, Provider<C8338a> provider14, Provider<BoostUpdateProvider> provider15, Provider<C15193i> provider16, Provider<ObserveDiscoverySettings> provider17, Provider<C8259d> provider18, Provider<DeleteSuperLike> provider19, Provider<AbTestUtility> provider20, Provider<AddIntroCardShakeEvent> provider21, Provider<AdSwipeTerminationRule> provider22, Provider<SuperLikeableViewStateProvider> provider23, Provider<C18198b> provider24, Provider<Resources> provider25, Provider<C14548a> provider26, Provider<C14550a> provider27, Provider<SuperLikeOnGameRec> provider28, Provider<C15071e> provider29, Provider<RecsSessionTracker> provider30, Provider<AddRecsRewindEvent> provider31, Provider<C11802c> provider32, Provider<C11817r> provider33, Provider<C14830c> provider34, Provider<C11823t> provider35, Provider<CurrentScreenTracker> provider36, Provider<C16562a> provider37, Provider<C16093z> provider38, Provider<C14386k> provider39, Provider<aj> provider40, Provider<DecrementRewindsAvailable> provider41, Provider<CanUserRewind> provider42, Provider<C15679f> provider43) {
        return new RecsPresenter((RecsEngineRegistry) provider.get(), (RecsCardFactory) provider2.get(), (bk) provider3.get(), (LikeStatusProvider) provider4.get(), (C15082f) provider5.get(), (TutorialSwipeRule) provider6.get(), (LocalOutOfLikesBouncerRule) provider7.get(), (RatingProcessor) provider8.get(), (C8819a) provider9.get(), (SharedRecLegacyUserAdapter) provider10.get(), (C10403e) provider11.get(), (C2639c) provider12.get(), (C10400d) provider13.get(), (C8338a) provider14.get(), (BoostUpdateProvider) provider15.get(), (C15193i) provider16.get(), (ObserveDiscoverySettings) provider17.get(), (C8259d) provider18.get(), (DeleteSuperLike) provider19.get(), (AbTestUtility) provider20.get(), (AddIntroCardShakeEvent) provider21.get(), (AdSwipeTerminationRule) provider22.get(), (SuperLikeableViewStateProvider) provider23.get(), (C18198b) provider24.get(), (Resources) provider25.get(), (C14548a) provider26.get(), (C14550a) provider27.get(), (SuperLikeOnGameRec) provider28.get(), (C15071e) provider29.get(), (RecsSessionTracker) provider30.get(), (AddRecsRewindEvent) provider31.get(), (C11802c) provider32.get(), (C11817r) provider33.get(), (C14830c) provider34.get(), (C11823t) provider35.get(), (CurrentScreenTracker) provider36.get(), (C16562a) provider37.get(), (C16093z) provider38.get(), (C14386k) provider39.get(), (aj) provider40.get(), (DecrementRewindsAvailable) provider41.get(), (CanUserRewind) provider42.get(), (C15679f) provider43.get());
    }

    public static RecsPresenter_Factory create(Provider<RecsEngineRegistry> provider, Provider<RecsCardFactory> provider2, Provider<bk> provider3, Provider<LikeStatusProvider> provider4, Provider<C15082f> provider5, Provider<TutorialSwipeRule> provider6, Provider<LocalOutOfLikesBouncerRule> provider7, Provider<RatingProcessor> provider8, Provider<C8819a> provider9, Provider<SharedRecLegacyUserAdapter> provider10, Provider<C10403e> provider11, Provider<C2639c> provider12, Provider<C10400d> provider13, Provider<C8338a> provider14, Provider<BoostUpdateProvider> provider15, Provider<C15193i> provider16, Provider<ObserveDiscoverySettings> provider17, Provider<C8259d> provider18, Provider<DeleteSuperLike> provider19, Provider<AbTestUtility> provider20, Provider<AddIntroCardShakeEvent> provider21, Provider<AdSwipeTerminationRule> provider22, Provider<SuperLikeableViewStateProvider> provider23, Provider<C18198b> provider24, Provider<Resources> provider25, Provider<C14548a> provider26, Provider<C14550a> provider27, Provider<SuperLikeOnGameRec> provider28, Provider<C15071e> provider29, Provider<RecsSessionTracker> provider30, Provider<AddRecsRewindEvent> provider31, Provider<C11802c> provider32, Provider<C11817r> provider33, Provider<C14830c> provider34, Provider<C11823t> provider35, Provider<CurrentScreenTracker> provider36, Provider<C16562a> provider37, Provider<C16093z> provider38, Provider<C14386k> provider39, Provider<aj> provider40, Provider<DecrementRewindsAvailable> provider41, Provider<CanUserRewind> provider42, Provider<C15679f> provider43) {
        return new RecsPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33, provider34, provider35, provider36, provider37, provider38, provider39, provider40, provider41, provider42, provider43);
    }

    public static RecsPresenter newRecsPresenter(RecsEngineRegistry recsEngineRegistry, RecsCardFactory recsCardFactory, bk bkVar, LikeStatusProvider likeStatusProvider, C15082f c15082f, TutorialSwipeRule tutorialSwipeRule, LocalOutOfLikesBouncerRule localOutOfLikesBouncerRule, RatingProcessor ratingProcessor, C8819a c8819a, SharedRecLegacyUserAdapter sharedRecLegacyUserAdapter, C10403e c10403e, C2639c c2639c, C10400d c10400d, C8338a c8338a, BoostUpdateProvider boostUpdateProvider, C15193i c15193i, ObserveDiscoverySettings observeDiscoverySettings, C8259d c8259d, DeleteSuperLike deleteSuperLike, AbTestUtility abTestUtility, AddIntroCardShakeEvent addIntroCardShakeEvent, AdSwipeTerminationRule adSwipeTerminationRule, SuperLikeableViewStateProvider superLikeableViewStateProvider, C18198b c18198b, Resources resources, C14548a c14548a, C14550a c14550a, SuperLikeOnGameRec superLikeOnGameRec, C15071e c15071e, RecsSessionTracker recsSessionTracker, AddRecsRewindEvent addRecsRewindEvent, C11802c c11802c, C11817r c11817r, C14830c c14830c, C11823t c11823t, CurrentScreenTracker currentScreenTracker, C16562a c16562a, C16093z c16093z, C14386k c14386k, aj ajVar, DecrementRewindsAvailable decrementRewindsAvailable, CanUserRewind canUserRewind, C15679f c15679f) {
        return new RecsPresenter(recsEngineRegistry, recsCardFactory, bkVar, likeStatusProvider, c15082f, tutorialSwipeRule, localOutOfLikesBouncerRule, ratingProcessor, c8819a, sharedRecLegacyUserAdapter, c10403e, c2639c, c10400d, c8338a, boostUpdateProvider, c15193i, observeDiscoverySettings, c8259d, deleteSuperLike, abTestUtility, addIntroCardShakeEvent, adSwipeTerminationRule, superLikeableViewStateProvider, c18198b, resources, c14548a, c14550a, superLikeOnGameRec, c15071e, recsSessionTracker, addRecsRewindEvent, c11802c, c11817r, c14830c, c11823t, currentScreenTracker, c16562a, c16093z, c14386k, ajVar, decrementRewindsAvailable, canUserRewind, c15679f);
    }
}
