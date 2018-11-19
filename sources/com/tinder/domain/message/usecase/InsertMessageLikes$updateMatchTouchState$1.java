package com.tinder.domain.message.usecase;

import com.tinder.domain.message.MessageLike;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "messageLike", "Lcom/tinder/domain/message/MessageLike;", "apply"}, k = 3, mv = {1, 1, 10})
final class InsertMessageLikes$updateMatchTouchState$1<T, R> implements Function<MessageLike, CompletableSource> {
    final /* synthetic */ boolean $forceMatchTouched;
    final /* synthetic */ String $userId;
    final /* synthetic */ InsertMessageLikes this$0;

    InsertMessageLikes$updateMatchTouchState$1(InsertMessageLikes insertMessageLikes, boolean z, String str) {
        this.this$0 = insertMessageLikes;
        this.$forceMatchTouched = z;
        this.$userId = str;
    }

    @NotNull
    public final C3956a apply(@NotNull MessageLike messageLike) {
        boolean z;
        C2668g.b(messageLike, "messageLike");
        if (!this.$forceMatchTouched) {
            if (!this.this$0.isFromUser(this.$userId, messageLike)) {
                z = false;
                return RxJavaInteropExtKt.toV2Completable(this.this$0.matchRepository.updateTouchState(messageLike.getMatchId(), z));
            }
        }
        z = true;
        return RxJavaInteropExtKt.toV2Completable(this.this$0.matchRepository.updateTouchState(messageLike.getMatchId(), z));
    }
}
