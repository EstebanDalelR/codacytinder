package com.tinder.crashindicator.target;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/crashindicator/target/AppCrashTarget;", "", "closeDialog", "", "showFeedbackView", "showThankYouView", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface AppCrashTarget {
    void closeDialog();

    void showFeedbackView();

    void showThankYouView();
}
