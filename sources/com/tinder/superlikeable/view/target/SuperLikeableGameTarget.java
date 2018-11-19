package com.tinder.superlikeable.view.target;

import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0011"}, d2 = {"Lcom/tinder/superlikeable/view/target/SuperLikeableGameTarget;", "", "bindRecs", "", "recs", "", "Lcom/tinder/domain/recs/model/UserRec;", "enableInteraction", "notifyGameStart", "superLikeableGame", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "presentGameAbnormallyAbortedState", "setSuperLikeRemainingCount", "superLikeRemainingCount", "", "startEntranceAnimation", "startIntroTutorialAnimation", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
public interface SuperLikeableGameTarget {
    void bindRecs(@NotNull List<? extends UserRec> list);

    void enableInteraction();

    void notifyGameStart(@NotNull SuperLikeableGame superLikeableGame);

    void presentGameAbnormallyAbortedState();

    void setSuperLikeRemainingCount(int i);

    void startEntranceAnimation();

    void startIntroTutorialAnimation();
}
