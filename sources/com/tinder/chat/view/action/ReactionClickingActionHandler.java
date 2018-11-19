package com.tinder.chat.view.action;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J0\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\tH&¨\u0006\u000e"}, d2 = {"Lcom/tinder/chat/view/action/ReactionClickingActionHandler;", "", "onReactionClicked", "", "reactionId", "", "onReactionLongClicked", "messageId", "isFailed", "", "messageIndex", "", "contentId", "isLiked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ReactionClickingActionHandler {
    void onReactionClicked(@NotNull String str);

    void onReactionLongClicked(@NotNull String str, boolean z, int i, @NotNull String str2, boolean z2);
}
