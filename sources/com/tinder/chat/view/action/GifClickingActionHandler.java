package com.tinder.chat.view.action;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH&J8\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/tinder/chat/view/action/GifClickingActionHandler;", "", "onGifClicked", "", "gifUrl", "", "matchId", "messageType", "", "contentId", "messageIndex", "onGifLongClicked", "messageId", "isFailed", "", "isLiked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface GifClickingActionHandler {
    void onGifClicked(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, int i2);

    void onGifLongClicked(@NotNull String str, @NotNull String str2, boolean z, int i, @NotNull String str3, boolean z2);
}
