package com.tinder.domain.reactions.provider;

import dagger.internal.Factory;

public final class StrikeReactionTypesProvider_Factory implements Factory<StrikeReactionTypesProvider> {
    private static final StrikeReactionTypesProvider_Factory INSTANCE = new StrikeReactionTypesProvider_Factory();

    public StrikeReactionTypesProvider get() {
        return provideInstance();
    }

    public static StrikeReactionTypesProvider provideInstance() {
        return new StrikeReactionTypesProvider();
    }

    public static StrikeReactionTypesProvider_Factory create() {
        return INSTANCE;
    }

    public static StrikeReactionTypesProvider newStrikeReactionTypesProvider() {
        return new StrikeReactionTypesProvider();
    }
}
