package com.tinder.domain.superlikeable;

import com.tinder.common.logger.Logger;
import com.tinder.domain.superlikeable.SuperLikeableGameSwipeTracker.SwipeCountThresholdDetector;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SuperLikeableGameSwipeTracker_Factory implements Factory<SuperLikeableGameSwipeTracker> {
    private final Provider<Logger> loggerProvider;
    private final Provider<SwipeCountThresholdDetector> swipeThesholdDetectorProvider;

    public SuperLikeableGameSwipeTracker_Factory(Provider<SwipeCountThresholdDetector> provider, Provider<Logger> provider2) {
        this.swipeThesholdDetectorProvider = provider;
        this.loggerProvider = provider2;
    }

    public SuperLikeableGameSwipeTracker get() {
        return provideInstance(this.swipeThesholdDetectorProvider, this.loggerProvider);
    }

    public static SuperLikeableGameSwipeTracker provideInstance(Provider<SwipeCountThresholdDetector> provider, Provider<Logger> provider2) {
        return new SuperLikeableGameSwipeTracker((SwipeCountThresholdDetector) provider.get(), (Logger) provider2.get());
    }

    public static SuperLikeableGameSwipeTracker_Factory create(Provider<SwipeCountThresholdDetector> provider, Provider<Logger> provider2) {
        return new SuperLikeableGameSwipeTracker_Factory(provider, provider2);
    }

    public static SuperLikeableGameSwipeTracker newSuperLikeableGameSwipeTracker(SwipeCountThresholdDetector swipeCountThresholdDetector, Logger logger) {
        return new SuperLikeableGameSwipeTracker(swipeCountThresholdDetector, logger);
    }
}
