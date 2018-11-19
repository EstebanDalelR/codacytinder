package com.tinder.apprating.target;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/tinder/apprating/target/AppRatingTarget;", "", "closeDialog", "", "setUpRatingBar", "showFeedbackView", "showInitialRatingView", "showReviewButton", "showThankYouView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface AppRatingTarget {
    void closeDialog();

    void setUpRatingBar();

    void showFeedbackView();

    void showInitialRatingView();

    void showReviewButton();

    void showThankYouView();
}
