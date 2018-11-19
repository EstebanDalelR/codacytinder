package com.tinder.domain.superlikeable.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecSource;
import com.tinder.domain.recs.model.SuperLikeableGameTeaserRec;
import com.tinder.domain.recs.model.Swipe.SwipeActionContext;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.domain.recs.model.SwipeOrigin;
import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import com.tinder.domain.utils.RxUtils;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Subscription;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/superlikeable/usecase/EndSuperLikeableGame;", "", "loadSuperLikeableGame", "Lcom/tinder/domain/superlikeable/usecase/LoadSuperLikeableGame;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "gamePlayCoordinator", "Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/superlikeable/usecase/LoadSuperLikeableGame;Lcom/tinder/domain/recs/RecsEngine;Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator;Lcom/tinder/common/logger/Logger;)V", "loadGameSubscription", "Lrx/Subscription;", "execute", "", "reason", "Lcom/tinder/domain/superlikeable/usecase/EndSuperLikeableGame$Reason;", "swipeTeaserRecAwayFromCardStack", "game", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "Reason", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class EndSuperLikeableGame {
    private final SuperLikeableGamePlayCoordinator gamePlayCoordinator;
    private Subscription loadGameSubscription;
    private final LoadSuperLikeableGame loadSuperLikeableGame;
    private final Logger logger;
    private final RecsEngine recsEngine;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/superlikeable/usecase/EndSuperLikeableGame$Reason;", "", "(Ljava/lang/String;I)V", "GAME_PLAYED", "GAME_SKIPPED", "GAME_ABORTED", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum Reason {
    }

    public EndSuperLikeableGame(@NotNull LoadSuperLikeableGame loadSuperLikeableGame, @NotNull RecsEngine recsEngine, @NotNull SuperLikeableGamePlayCoordinator superLikeableGamePlayCoordinator, @NotNull Logger logger) {
        C2668g.b(loadSuperLikeableGame, "loadSuperLikeableGame");
        C2668g.b(recsEngine, "recsEngine");
        C2668g.b(superLikeableGamePlayCoordinator, "gamePlayCoordinator");
        C2668g.b(logger, "logger");
        this.loadSuperLikeableGame = loadSuperLikeableGame;
        this.recsEngine = recsEngine;
        this.gamePlayCoordinator = superLikeableGamePlayCoordinator;
        this.logger = logger;
    }

    public final void execute(@NotNull Reason reason) {
        C2668g.b(reason, "reason");
        if (!RxUtils.INSTANCE.isSubscribed(this.loadGameSubscription)) {
            this.loadGameSubscription = this.loadSuperLikeableGame.execute().b(Schedulers.io()).a(new EndSuperLikeableGame$execute$1(this, reason), (Action1) new EndSuperLikeableGame$execute$2(this));
        }
    }

    private final void swipeTeaserRecAwayFromCardStack(SuperLikeableGame superLikeableGame, Reason reason) {
        Rec$Source recSource = this.recsEngine.getRecSource();
        if (recSource == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.RecSource");
        }
        SuperLikeableGameTeaserRec superLikeableGameTeaserRec = new SuperLikeableGameTeaserRec((RecSource) recSource, superLikeableGame);
        superLikeableGame = new SwipeActionContext(SwipeOrigin.CARD_STACK, SwipeMethod.CARD);
        switch (reason) {
            case GAME_PLAYED:
                this.recsEngine.processLikeOnRec(superLikeableGameTeaserRec, superLikeableGame);
                return;
            case GAME_SKIPPED:
            case GAME_ABORTED:
                this.recsEngine.processPassOnRec(superLikeableGameTeaserRec, superLikeableGame);
                return;
            default:
                return;
        }
    }
}
