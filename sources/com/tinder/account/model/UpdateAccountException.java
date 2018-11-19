package com.tinder.account.model;

import android.support.annotation.NonNull;

public class UpdateAccountException extends RuntimeException {
    @NonNull
    /* renamed from: a */
    private final UpdateAccountErrorType f8151a;

    public UpdateAccountException(@NonNull UpdateAccountErrorType updateAccountErrorType) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error updating account email password: ");
        stringBuilder.append(updateAccountErrorType.getInternalCode());
        super(stringBuilder.toString());
        this.f8151a = updateAccountErrorType;
    }

    public UpdateAccountException(@NonNull UpdateAccountErrorType updateAccountErrorType, @NonNull String str) {
        super(str);
        this.f8151a = updateAccountErrorType;
    }

    @NonNull
    /* renamed from: a */
    public UpdateAccountErrorType m9783a() {
        return this.f8151a;
    }
}
