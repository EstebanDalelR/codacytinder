package com.tinder.domain.apprating;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0005H&J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0005H&J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0005H&J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0005H&J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0005H&J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000eH&¨\u0006!"}, d2 = {"Lcom/tinder/domain/apprating/AppRatingRepository;", "", "clearAppRatingPreferences", "Lrx/Completable;", "readChatActivityPaused", "", "readIsAppRatedBefore", "readIsFeedbackDismissed", "readIsFirstTimeAfterGooglePlayReview", "readIsRatingDismissed", "readIsVersionRateable", "readItsANewMatchDialogSeen", "readNewChatMessageRead", "readSessionTimeStamp", "", "writeChatActivityPaused", "", "paused", "writeFeedbackDismissed", "dismissed", "writeIsAppRatedBefore", "ratedAppBefore", "writeIsFirstTimeAfterGooglePlayReview", "sentFeedback", "writeIsVersionRateable", "versionRateable", "writeItsANewMatchDialogSeen", "itsAMatchDialogSeen", "writeNewChatMessageRead", "newMessageRead", "writeRatingDismissed", "writeSessionTimeStamp", "timeStamp", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface AppRatingRepository {
    @NotNull
    Completable clearAppRatingPreferences();

    boolean readChatActivityPaused();

    boolean readIsAppRatedBefore();

    boolean readIsFeedbackDismissed();

    boolean readIsFirstTimeAfterGooglePlayReview();

    boolean readIsRatingDismissed();

    boolean readIsVersionRateable();

    boolean readItsANewMatchDialogSeen();

    boolean readNewChatMessageRead();

    long readSessionTimeStamp();

    void writeChatActivityPaused(boolean z);

    void writeFeedbackDismissed(boolean z);

    void writeIsAppRatedBefore(boolean z);

    void writeIsFirstTimeAfterGooglePlayReview(boolean z);

    void writeIsVersionRateable(boolean z);

    void writeItsANewMatchDialogSeen(boolean z);

    void writeNewChatMessageRead(boolean z);

    void writeRatingDismissed(boolean z);

    void writeSessionTimeStamp(long j);
}
