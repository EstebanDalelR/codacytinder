package com.facebook.accountkit;

import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.internal.InternalAccountKitError;

public class AccountKitException extends RuntimeException {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private final AccountKitError f3150a;

    public AccountKitException(AccountKitError accountKitError) {
        super(accountKitError.getErrorType().getMessage());
        this.f3150a = accountKitError;
    }

    public AccountKitException(Type type, InternalAccountKitError internalAccountKitError) {
        super(type.getMessage());
        this.f3150a = new AccountKitError(type, internalAccountKitError);
    }

    public AccountKitException(Type type, InternalAccountKitError internalAccountKitError, String str) {
        super(String.format(type.getMessage(), new Object[]{str}));
        this.f3150a = new AccountKitError(type, internalAccountKitError);
    }

    public AccountKitException(Type type, InternalAccountKitError internalAccountKitError, Throwable th) {
        super(type.getMessage(), th);
        this.f3150a = new AccountKitError(type, internalAccountKitError);
    }

    public AccountKitException(Type type, Throwable th) {
        super(type.getMessage(), th);
        this.f3150a = new AccountKitError(type);
    }

    /* renamed from: a */
    public AccountKitError m4126a() {
        return this.f3150a;
    }

    public String toString() {
        return this.f3150a.toString();
    }
}
