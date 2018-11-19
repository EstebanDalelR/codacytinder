package com.tinder.chat.view.action;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/tinder/chat/view/action/MessageLinkClickActionHandler;", "", "onLinkClicked", "", "matchId", "", "message", "url", "messageSentDate", "Lorg/joda/time/DateTime;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface MessageLinkClickActionHandler {
    void onLinkClicked(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull DateTime dateTime);
}
