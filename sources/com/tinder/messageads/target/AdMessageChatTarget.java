package com.tinder.messageads.target;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/tinder/messageads/target/AdMessageChatTarget;", "", "showAvatar", "", "url", "", "showError", "showMessage", "message", "showUnMatchFailure", "showUnMatchSuccessful", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface AdMessageChatTarget {
    void showAvatar(@NotNull String str);

    void showError();

    void showMessage(@NotNull String str);

    void showUnMatchFailure();

    void showUnMatchSuccessful();
}
