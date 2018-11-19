package com.tinder.chat.view.action;

import com.tinder.chat.analytics.MediaType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/tinder/chat/view/action/ActivityMessageMediaUnavailableHandler;", "", "onMediaUnavailable", "", "matchId", "", "message", "messageIndex", "", "contentId", "mediaId", "mediaType", "Lcom/tinder/chat/analytics/MediaType;", "url", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ActivityMessageMediaUnavailableHandler {
    void onMediaUnavailable(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull MediaType mediaType, @NotNull String str5);
}
