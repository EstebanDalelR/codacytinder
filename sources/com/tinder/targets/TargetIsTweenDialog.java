package com.tinder.targets;

public interface TargetIsTweenDialog {
    void checkCollectEmail();

    void collectEmail();

    void dismissDialog();

    void showEmailFacebookLoadSuccess(String str);

    void showEmailPlaceholderFacebookLoadFail();

    void showToastSendEmailFail();

    void showToastSendEmailSuccess();
}
