package com.tinder.domain.utils;

import com.tinder.common.logger.Logger;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AgeCalculator_Factory implements Factory<AgeCalculator> {
    private final Provider<Logger> loggerProvider;

    public AgeCalculator_Factory(Provider<Logger> provider) {
        this.loggerProvider = provider;
    }

    public AgeCalculator get() {
        return provideInstance(this.loggerProvider);
    }

    public static AgeCalculator provideInstance(Provider<Logger> provider) {
        return new AgeCalculator((Logger) provider.get());
    }

    public static AgeCalculator_Factory create(Provider<Logger> provider) {
        return new AgeCalculator_Factory(provider);
    }

    public static AgeCalculator newAgeCalculator(Logger logger) {
        return new AgeCalculator(logger);
    }
}
