package com.tinder.domain.superlikeable;

import com.tinder.common.logger.Logger;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/superlikeable/SuperLikeableGameSwipeTracker;", "", "swipeThesholdDetector", "Lcom/tinder/domain/superlikeable/SuperLikeableGameSwipeTracker$SwipeCountThresholdDetector;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/superlikeable/SuperLikeableGameSwipeTracker$SwipeCountThresholdDetector;Lcom/tinder/common/logger/Logger;)V", "currentNumberOfSwipes", "", "injectionThresholdWasHit", "", "numberOfSwipesTracked", "reset", "", "trackNewSwipe", "updateInjectionThreshold", "newInjectionThreshold", "SwipeCountThresholdDetector", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeableGameSwipeTracker {
    private int currentNumberOfSwipes;
    private final Logger logger;
    private final SwipeCountThresholdDetector swipeThesholdDetector;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/superlikeable/SuperLikeableGameSwipeTracker$SwipeCountThresholdDetector;", "", "()V", "injectionThreshold", "", "injectionThresholdWasHit", "", "numberOfSwipes", "updateInjectionThreshold", "", "newInjectionSwipeThreshold", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class SwipeCountThresholdDetector {
        private int injectionThreshold = 5;

        public final boolean injectionThresholdWasHit(int i) {
            return i >= this.injectionThreshold + -2;
        }

        public final void updateInjectionThreshold(int i) {
            this.injectionThreshold = i;
        }
    }

    @Inject
    public SuperLikeableGameSwipeTracker(@NotNull SwipeCountThresholdDetector swipeCountThresholdDetector, @NotNull Logger logger) {
        C2668g.b(swipeCountThresholdDetector, "swipeThesholdDetector");
        C2668g.b(logger, "logger");
        this.swipeThesholdDetector = swipeCountThresholdDetector;
        this.logger = logger;
    }

    public final void trackNewSwipe() {
        this.currentNumberOfSwipes++;
        Logger logger = this.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("currentNumberOfSwipes is ");
        stringBuilder.append(this.currentNumberOfSwipes);
        logger.debug(stringBuilder.toString());
    }

    public final void reset() {
        this.currentNumberOfSwipes = 0;
    }

    public final int numberOfSwipesTracked() {
        return this.currentNumberOfSwipes;
    }

    public final boolean injectionThresholdWasHit() {
        return this.swipeThesholdDetector.injectionThresholdWasHit(this.currentNumberOfSwipes);
    }

    public final void updateInjectionThreshold(int i) {
        this.swipeThesholdDetector.updateInjectionThreshold(i);
    }
}
