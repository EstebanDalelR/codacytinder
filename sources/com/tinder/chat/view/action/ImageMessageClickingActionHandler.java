package com.tinder.chat.view.action;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/tinder/chat/view/action/ImageMessageClickingActionHandler;", "", "onImageLongClicked", "", "messageId", "", "imageUrl", "isFailed", "", "messageIndex", "", "contentId", "isLiked", "contentSource", "contentUrl", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface ImageMessageClickingActionHandler {
    void onImageLongClicked(@NotNull String str, @NotNull String str2, boolean z, int i, @NotNull String str3, boolean z2, @NotNull String str4, @NotNull String str5);
}
