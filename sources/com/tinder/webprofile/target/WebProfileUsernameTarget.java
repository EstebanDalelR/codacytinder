package com.tinder.webprofile.target;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005H&¨\u0006\u0012"}, d2 = {"Lcom/tinder/webprofile/target/WebProfileUsernameTarget;", "", "bindUsername", "", "username", "", "disableConfirmButton", "displayGenericSaveErrorState", "displaySuccessfulDeleteMessage", "displaySuccessfulSaveState", "displayUnsuccessfulDeleteState", "displayUnsuccessfulSaveState", "enableConfirmButton", "hideDeleteButton", "resetStatusTextAlpha", "showDeleteButton", "updateUsernameTextCount", "characterCount", "webprofile_release"}, k = 1, mv = {1, 1, 10})
public interface WebProfileUsernameTarget {
    void bindUsername(@NotNull String str);

    void disableConfirmButton();

    void displayGenericSaveErrorState();

    void displaySuccessfulDeleteMessage();

    void displaySuccessfulSaveState();

    void displayUnsuccessfulDeleteState();

    void displayUnsuccessfulSaveState();

    void enableConfirmButton();

    void hideDeleteButton();

    void resetStatusTextAlpha();

    void showDeleteButton();

    void updateUsernameTextCount(@NotNull String str);
}
