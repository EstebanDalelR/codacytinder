package com.tinder.account.view;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import com.tinder.account.model.UpdateAccountException;

public interface UpdateEmailPasswordTarget {
    void disableSubmitButton();

    void finish();

    void forwardUpdateException(@NonNull UpdateAccountException updateAccountException);

    void hideProgressDialog();

    void showCancelDialog(@StringRes int i);

    void showGenericError();

    void showPage(UpdateAccountPage updateAccountPage);

    void showProgressDialog();
}
