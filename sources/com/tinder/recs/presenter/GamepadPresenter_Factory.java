package com.tinder.recs.presenter;

import com.tinder.boost.p179b.C8339c;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.fireboarding.domain.C11809n;
import com.tinder.fireboarding.domain.C11811o;
import com.tinder.gamepadcounters.C9673c;
import com.tinder.home.p259b.C9695a;
import com.tinder.managers.bk;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GamepadPresenter_Factory implements Factory<GamepadPresenter> {
    private final Provider<C8339c> addBoostReminderViewEventProvider;
    private final Provider<CheckTutorialViewed> checkTutorialViewedProvider;
    private final Provider<C9673c> gamepadCounterSessionControllerProvider;
    private final Provider<C9695a> homePageTabSelectedProvider;
    private final Provider<LikeStatusProvider> likeStatusProvider;
    private final Provider<bk> managerSharedPreferencesProvider;
    private final Provider<C11809n> observeCompletedFireboardingLevelsProvider;
    private final Provider<C11811o> observeFireboardingConfigProvider;
    private final Provider<RecsEngineRegistry> recsEngineRegistryProvider;
    private final Provider<C15193i> tinderPlusInteractorProvider;

    public GamepadPresenter_Factory(Provider<C8339c> provider, Provider<LikeStatusProvider> provider2, Provider<RecsEngineRegistry> provider3, Provider<C15193i> provider4, Provider<C9673c> provider5, Provider<C9695a> provider6, Provider<CheckTutorialViewed> provider7, Provider<bk> provider8, Provider<C11809n> provider9, Provider<C11811o> provider10) {
        this.addBoostReminderViewEventProvider = provider;
        this.likeStatusProvider = provider2;
        this.recsEngineRegistryProvider = provider3;
        this.tinderPlusInteractorProvider = provider4;
        this.gamepadCounterSessionControllerProvider = provider5;
        this.homePageTabSelectedProvider = provider6;
        this.checkTutorialViewedProvider = provider7;
        this.managerSharedPreferencesProvider = provider8;
        this.observeCompletedFireboardingLevelsProvider = provider9;
        this.observeFireboardingConfigProvider = provider10;
    }

    public GamepadPresenter get() {
        return provideInstance(this.addBoostReminderViewEventProvider, this.likeStatusProvider, this.recsEngineRegistryProvider, this.tinderPlusInteractorProvider, this.gamepadCounterSessionControllerProvider, this.homePageTabSelectedProvider, this.checkTutorialViewedProvider, this.managerSharedPreferencesProvider, this.observeCompletedFireboardingLevelsProvider, this.observeFireboardingConfigProvider);
    }

    public static GamepadPresenter provideInstance(Provider<C8339c> provider, Provider<LikeStatusProvider> provider2, Provider<RecsEngineRegistry> provider3, Provider<C15193i> provider4, Provider<C9673c> provider5, Provider<C9695a> provider6, Provider<CheckTutorialViewed> provider7, Provider<bk> provider8, Provider<C11809n> provider9, Provider<C11811o> provider10) {
        return new GamepadPresenter((C8339c) provider.get(), (LikeStatusProvider) provider2.get(), (RecsEngineRegistry) provider3.get(), (C15193i) provider4.get(), (C9673c) provider5.get(), (C9695a) provider6.get(), (CheckTutorialViewed) provider7.get(), (bk) provider8.get(), (C11809n) provider9.get(), (C11811o) provider10.get());
    }

    public static GamepadPresenter_Factory create(Provider<C8339c> provider, Provider<LikeStatusProvider> provider2, Provider<RecsEngineRegistry> provider3, Provider<C15193i> provider4, Provider<C9673c> provider5, Provider<C9695a> provider6, Provider<CheckTutorialViewed> provider7, Provider<bk> provider8, Provider<C11809n> provider9, Provider<C11811o> provider10) {
        return new GamepadPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static GamepadPresenter newGamepadPresenter(C8339c c8339c, LikeStatusProvider likeStatusProvider, RecsEngineRegistry recsEngineRegistry, C15193i c15193i, C9673c c9673c, C9695a c9695a, CheckTutorialViewed checkTutorialViewed, bk bkVar, C11809n c11809n, C11811o c11811o) {
        return new GamepadPresenter(c8339c, likeStatusProvider, recsEngineRegistry, c15193i, c9673c, c9695a, checkTutorialViewed, bkVar, c11809n, c11811o);
    }
}
