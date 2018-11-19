package com.tinder.chat.view.action;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/tinder/chat/view/action/MessageLongClickingActionHandler;", "", "onMessageLongClicked", "", "matchId", "", "messageId", "messageText", "isFailed", "", "messageIndex", "", "isLiked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface MessageLongClickingActionHandler {
    void onMessageLongClicked(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, int i, boolean z2);
}
