package com.facebook.accountkit;

import android.os.Parcelable;
import android.support.annotation.Nullable;

public interface AccountKitUpdateResult extends Parcelable {
    public static final String RESULT_KEY = "account_kit_update_result";

    public enum UpdateResult {
        SUCCESS,
        CANCELLED
    }

    @Nullable
    AccountKitError getError();

    @Nullable
    String getFinalAuthorizationState();

    boolean wasCancelled();
}
