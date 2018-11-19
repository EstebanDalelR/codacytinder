package com.tinder.domain.superlikeable;

import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator.GamePlayFlow;
import dagger.internal.Factory;

public final class SuperLikeableGamePlayCoordinator_GamePlayFlow_Factory implements Factory<GamePlayFlow> {
    private static final SuperLikeableGamePlayCoordinator_GamePlayFlow_Factory INSTANCE = new SuperLikeableGamePlayCoordinator_GamePlayFlow_Factory();

    public GamePlayFlow get() {
        return provideInstance();
    }

    public static GamePlayFlow provideInstance() {
        return new GamePlayFlow();
    }

    public static SuperLikeableGamePlayCoordinator_GamePlayFlow_Factory create() {
        return INSTANCE;
    }

    public static GamePlayFlow newGamePlayFlow() {
        return new GamePlayFlow();
    }
}
