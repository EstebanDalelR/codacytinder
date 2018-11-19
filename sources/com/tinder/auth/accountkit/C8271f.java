package com.tinder.auth.accountkit;

import android.support.annotation.Nullable;
import com.facebook.accountkit.AccountKitError;
import com.facebook.accountkit.AccountKitError.Type;
import javax.inject.Inject;

/* renamed from: com.tinder.auth.accountkit.f */
class C8271f {
    @Inject
    C8271f() {
    }

    /* renamed from: a */
    boolean m35317a(@Nullable AccountKitError accountKitError) {
        return (accountKitError != null && Type.ARGUMENT_ERROR == accountKitError.getErrorType() && 100 == accountKitError.getDetailErrorCode()) ? true : null;
    }
}
