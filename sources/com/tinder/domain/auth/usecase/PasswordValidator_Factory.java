package com.tinder.domain.auth.usecase;

import dagger.internal.Factory;

public final class PasswordValidator_Factory implements Factory<PasswordValidator> {
    private static final PasswordValidator_Factory INSTANCE = new PasswordValidator_Factory();

    public PasswordValidator get() {
        return provideInstance();
    }

    public static PasswordValidator provideInstance() {
        return new PasswordValidator();
    }

    public static PasswordValidator_Factory create() {
        return INSTANCE;
    }

    public static PasswordValidator newPasswordValidator() {
        return new PasswordValidator();
    }
}
