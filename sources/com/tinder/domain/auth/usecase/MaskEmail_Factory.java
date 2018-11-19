package com.tinder.domain.auth.usecase;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class MaskEmail_Factory implements Factory<MaskEmail> {
    private final Provider<RegexEmailValidator> regexEmailValidatorProvider;

    public MaskEmail_Factory(Provider<RegexEmailValidator> provider) {
        this.regexEmailValidatorProvider = provider;
    }

    public MaskEmail get() {
        return provideInstance(this.regexEmailValidatorProvider);
    }

    public static MaskEmail provideInstance(Provider<RegexEmailValidator> provider) {
        return new MaskEmail((RegexEmailValidator) provider.get());
    }

    public static MaskEmail_Factory create(Provider<RegexEmailValidator> provider) {
        return new MaskEmail_Factory(provider);
    }

    public static MaskEmail newMaskEmail(RegexEmailValidator regexEmailValidator) {
        return new MaskEmail(regexEmailValidator);
    }
}
