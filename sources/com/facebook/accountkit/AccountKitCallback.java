package com.facebook.accountkit;

public interface AccountKitCallback<RESULT> {
    void onError(AccountKitError accountKitError);

    void onSuccess(RESULT result);
}
