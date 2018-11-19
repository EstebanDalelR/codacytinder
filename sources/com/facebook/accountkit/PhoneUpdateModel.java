package com.facebook.accountkit;

import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.facebook.accountkit.internal.UpdateStatus;

public interface PhoneUpdateModel extends Parcelable {
    String getConfirmationCode();

    AccountKitError getError();

    String getFinalUpdateState();

    String getInitialUpdateState();

    PhoneNumber getPhoneNumber();

    @Nullable
    String getPrivacyPolicy();

    long getResendTime();

    UpdateStatus getStatus();

    @Nullable
    String getTermsOfService();

    String getUpdateRequestCode();
}
