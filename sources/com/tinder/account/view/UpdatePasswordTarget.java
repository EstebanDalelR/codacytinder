package com.tinder.account.view;

import rx.Observable;

public interface UpdatePasswordTarget {
    void disableSubmitButton();

    void dismissProgressDialog();

    Observable<String> editTextAfterTextChanges();

    void enableSubmitButton();

    void showPasswordNormalHint();

    void showPasswordRequirementHint();

    void showProgressDialog();

    void showSimplePasswordHint();

    void showStrongPasswordHint();
}
