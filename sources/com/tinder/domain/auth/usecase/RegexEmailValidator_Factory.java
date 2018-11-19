package com.tinder.domain.auth.usecase;

import dagger.internal.Factory;

public final class RegexEmailValidator_Factory implements Factory<RegexEmailValidator> {
    private static final RegexEmailValidator_Factory INSTANCE = new RegexEmailValidator_Factory();

    public RegexEmailValidator get() {
        return provideInstance();
    }

    public static RegexEmailValidator provideInstance() {
        return new RegexEmailValidator();
    }

    public static RegexEmailValidator_Factory create() {
        return INSTANCE;
    }

    public static RegexEmailValidator newRegexEmailValidator() {
        return new RegexEmailValidator();
    }
}
