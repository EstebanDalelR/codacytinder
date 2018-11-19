package com.tinder.account.view;

import rx.Observable;

public interface UpdateEmailTarget {
    Observable<String> afterEmailInputChanges();

    void disableSubmitButton();

    void dismissProgressDialog();

    void enableSubmitButton();

    void showInvalidEmailErrorHint();

    void showProgressDialog();
}
