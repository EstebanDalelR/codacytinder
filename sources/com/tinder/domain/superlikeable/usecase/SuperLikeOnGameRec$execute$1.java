package com.tinder.domain.superlikeable.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.recs.model.UserRec;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class SuperLikeOnGameRec$execute$1 implements Action0 {
    final /* synthetic */ UserRec $userRec;
    final /* synthetic */ SuperLikeOnGameRec this$0;

    SuperLikeOnGameRec$execute$1(SuperLikeOnGameRec superLikeOnGameRec, UserRec userRec) {
        this.this$0 = superLikeOnGameRec;
        this.$userRec = userRec;
    }

    public final void call() {
        Logger access$getLogger$p = this.this$0.logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Game SuperLike succeeded on rec id ");
        stringBuilder.append(this.$userRec.getId());
        access$getLogger$p.debug(stringBuilder.toString());
    }
}
