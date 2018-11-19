package com.tinder.chat.view.action;

import com.tinder.chat.analytics.MessageAction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/tinder/chat/view/action/ActivityMessageClickingActionHandler;", "", "onMediaClicked", "", "matchId", "", "message", "contentId", "messageIndex", "", "messageAction", "Lcom/tinder/chat/analytics/MessageAction;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ActivityMessageClickingActionHandler {
    void onMediaClicked(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull MessageAction messageAction);
}
