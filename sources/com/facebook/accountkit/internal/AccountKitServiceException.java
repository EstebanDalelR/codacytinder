package com.facebook.accountkit.internal;

import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.AccountKitException;

final class AccountKitServiceException extends AccountKitException {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private final C1228g f9737a;

    public AccountKitServiceException(C1228g c1228g, Type type, InternalAccountKitError internalAccountKitError) {
        super(type, internalAccountKitError);
        this.f9737a = c1228g;
    }

    public AccountKitServiceException(C1228g c1228g, AccountKitException accountKitException) {
        super(accountKitException.m4126a());
        this.f9737a = c1228g;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{AccountKitServiceException: httpResponseCode: ");
        stringBuilder.append(this.f9737a.m4339e());
        stringBuilder.append(", errorCode: ");
        stringBuilder.append(this.f9737a.m4335a());
        stringBuilder.append(", errorType: ");
        stringBuilder.append(this.f9737a.m4337c());
        stringBuilder.append(", message: ");
        stringBuilder.append(this.f9737a.m4336b());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
