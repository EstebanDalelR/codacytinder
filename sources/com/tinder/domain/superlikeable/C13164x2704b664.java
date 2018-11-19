package com.tinder.domain.superlikeable;

import com.tinder.domain.superlikeable.SuperLikeableGameSwipeTracker.SwipeCountThresholdDetector;
import dagger.internal.Factory;

/* renamed from: com.tinder.domain.superlikeable.SuperLikeableGameSwipeTracker_SwipeCountThresholdDetector_Factory */
public final class C13164x2704b664 implements Factory<SwipeCountThresholdDetector> {
    private static final C13164x2704b664 INSTANCE = new C13164x2704b664();

    public SwipeCountThresholdDetector get() {
        return C13164x2704b664.provideInstance();
    }

    public static SwipeCountThresholdDetector provideInstance() {
        return new SwipeCountThresholdDetector();
    }

    public static C13164x2704b664 create() {
        return INSTANCE;
    }

    public static SwipeCountThresholdDetector newSwipeCountThresholdDetector() {
        return new SwipeCountThresholdDetector();
    }
}
