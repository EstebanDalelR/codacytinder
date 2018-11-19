package com.tinder.recs.view;

import android.arch.lifecycle.Lifecycle;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.recs.model.TappyConfig;
import com.tinder.recs.presenter.GamepadPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class GamepadView_MembersInjector implements MembersInjector<GamepadView> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<GamepadPresenter> gamepadPresenterProvider;
    private final Provider<Lifecycle> lifecycleProvider;
    private final Provider<TappyConfig> tappyConfigProvider;

    public GamepadView_MembersInjector(Provider<GamepadPresenter> provider, Provider<TappyConfig> provider2, Provider<AbTestUtility> provider3, Provider<Lifecycle> provider4) {
        this.gamepadPresenterProvider = provider;
        this.tappyConfigProvider = provider2;
        this.abTestUtilityProvider = provider3;
        this.lifecycleProvider = provider4;
    }

    public static MembersInjector<GamepadView> create(Provider<GamepadPresenter> provider, Provider<TappyConfig> provider2, Provider<AbTestUtility> provider3, Provider<Lifecycle> provider4) {
        return new GamepadView_MembersInjector(provider, provider2, provider3, provider4);
    }

    public void injectMembers(GamepadView gamepadView) {
        injectGamepadPresenter(gamepadView, (GamepadPresenter) this.gamepadPresenterProvider.get());
        injectTappyConfigProvider(gamepadView, (TappyConfig) this.tappyConfigProvider.get());
        injectAbTestUtility(gamepadView, (AbTestUtility) this.abTestUtilityProvider.get());
        injectLifecycle(gamepadView, (Lifecycle) this.lifecycleProvider.get());
    }

    public static void injectGamepadPresenter(GamepadView gamepadView, GamepadPresenter gamepadPresenter) {
        gamepadView.gamepadPresenter = gamepadPresenter;
    }

    public static void injectTappyConfigProvider(GamepadView gamepadView, TappyConfig tappyConfig) {
        gamepadView.tappyConfigProvider = tappyConfig;
    }

    public static void injectAbTestUtility(GamepadView gamepadView, AbTestUtility abTestUtility) {
        gamepadView.abTestUtility = abTestUtility;
    }

    public static void injectLifecycle(GamepadView gamepadView, Lifecycle lifecycle) {
        gamepadView.lifecycle = lifecycle;
    }
}
