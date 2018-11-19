package com.tinder.domain.superlikeable.usecase;

import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecSource;
import com.tinder.domain.recs.model.SuperLikeableGameTeaserRec;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/domain/superlikeable/usecase/InjectSuperLikeableGameTeaserRec;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "(Lcom/tinder/domain/recs/RecsEngine;)V", "execute", "Lrx/Completable;", "superLikeableGame", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class InjectSuperLikeableGameTeaserRec implements CompletableUseCase<SuperLikeableGame> {
    public static final int CARD_STACK_INJECTION_PLACEMENT_OFFSET = 2;
    public static final Companion Companion = new Companion();
    private final RecsEngine recsEngine;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/superlikeable/usecase/InjectSuperLikeableGameTeaserRec$Companion;", "", "()V", "CARD_STACK_INJECTION_PLACEMENT_OFFSET", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    public InjectSuperLikeableGameTeaserRec(@NotNull RecsEngine recsEngine) {
        C2668g.b(recsEngine, "recsEngine");
        this.recsEngine = recsEngine;
    }

    @NotNull
    public Completable execute(@NotNull SuperLikeableGame superLikeableGame) {
        C2668g.b(superLikeableGame, "superLikeableGame");
        Rec$Source recSource = this.recsEngine.getRecSource();
        if (recSource == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.RecSource");
        }
        superLikeableGame = Single.a(new SuperLikeableGameTeaserRec((RecSource) recSource, superLikeableGame)).c(new InjectSuperLikeableGameTeaserRec$execute$1(this));
        C2668g.a(superLikeableGame, "Single.just(SuperLikeabl…ET)\n                    }");
        return superLikeableGame;
    }
}
