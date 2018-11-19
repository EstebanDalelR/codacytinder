package com.tinder.recs.rule;

import android.support.annotation.WorkerThread;
import com.tinder.analytics.p154c.C6213a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.rule.PostSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/recs/rule/SuperLikeableGamePlayRule;", "Lcom/tinder/domain/recs/rule/PostSwipeConsumptionRule;", "superLikeableGameCoordinator", "Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "trackSuperlikeableAvailableEvent", "Lcom/tinder/analytics/usecase/TrackSuperlikeableAvailableEvent;", "(Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/analytics/usecase/TrackSuperlikeableAvailableEvent;)V", "observeAndTrackSuperlikeableGame", "", "perform", "Lcom/tinder/domain/recs/rule/SwipeProcessingRule$ResultType;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeableGamePlayRule implements PostSwipeConsumptionRule {
    private final AbTestUtility abTestUtility;
    private final SuperLikeableGamePlayCoordinator superLikeableGameCoordinator;
    private final C6213a trackSuperlikeableAvailableEvent;

    @Inject
    public SuperLikeableGamePlayRule(@NotNull SuperLikeableGamePlayCoordinator superLikeableGamePlayCoordinator, @NotNull AbTestUtility abTestUtility, @NotNull C6213a c6213a) {
        C2668g.b(superLikeableGamePlayCoordinator, "superLikeableGameCoordinator");
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(c6213a, "trackSuperlikeableAvailableEvent");
        this.superLikeableGameCoordinator = superLikeableGamePlayCoordinator;
        this.abTestUtility = abTestUtility;
        this.trackSuperlikeableAvailableEvent = c6213a;
        observeAndTrackSuperlikeableGame();
    }

    @WorkerThread
    @NotNull
    public ResultType perform(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        if (this.abTestUtility.isSuperLikeableEnabled() != null) {
            this.superLikeableGameCoordinator.evaluateGamePlay();
        }
        return ResultType.PROCEED;
    }

    public final void observeAndTrackSuperlikeableGame() {
        if (this.abTestUtility.isSuperLikeableEnabled()) {
            Observable b = this.superLikeableGameCoordinator.observeGamePlayStatus().b(Schedulers.io());
            Action1 superLikeableGamePlayRule$observeAndTrackSuperlikeableGame$1 = new SuperLikeableGamePlayRule$observeAndTrackSuperlikeableGame$1(this);
            Function1 function1 = SuperLikeableGamePlayRule$observeAndTrackSuperlikeableGame$2.INSTANCE;
            if (function1 != null) {
                function1 = new SuperLikeableGamePlayRule$sam$rx_functions_Action1$0(function1);
            }
            b.a(superLikeableGamePlayRule$observeAndTrackSuperlikeableGame$1, (Action1) function1);
        }
    }
}
