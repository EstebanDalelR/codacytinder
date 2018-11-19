package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKitError;

interface UIManagerStub extends Parcelable {
    @Nullable
    Fragment getBodyFragment(LoginFlowState loginFlowState);

    @Nullable
    ButtonType getButtonType(LoginFlowState loginFlowState);

    @Nullable
    Fragment getFooterFragment(LoginFlowState loginFlowState);

    @Nullable
    Fragment getHeaderFragment(LoginFlowState loginFlowState);

    @Nullable
    TextPosition getTextPosition(LoginFlowState loginFlowState);

    void onError(AccountKitError accountKitError);
}
