package com.tinder.domain.message.usecase;

import com.tinder.domain.message.Reaction;
import com.tinder.domain.message.ReactionMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/ReactionMessage;", "it", "Lcom/tinder/domain/message/usecase/CommonMessageProperties;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class SendReactionMessage$execute$1<T, R> implements Func1<T, R> {
    final /* synthetic */ Reaction $reaction;
    final /* synthetic */ SendReactionMessage this$0;

    SendReactionMessage$execute$1(SendReactionMessage sendReactionMessage, Reaction reaction) {
        this.this$0 = sendReactionMessage;
        this.$reaction = reaction;
    }

    @NotNull
    public final ReactionMessage call(CommonMessageProperties commonMessageProperties) {
        SendReactionMessage sendReactionMessage = this.this$0;
        C2668g.a(commonMessageProperties, "it");
        return sendReactionMessage.createReactionMessage(commonMessageProperties, this.$reaction);
    }
}
