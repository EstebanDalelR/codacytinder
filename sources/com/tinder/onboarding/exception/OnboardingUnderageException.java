package com.tinder.onboarding.exception;

import org.joda.time.LocalDate;

public class OnboardingUnderageException extends RuntimeException {
    /* renamed from: a */
    private final LocalDate f32804a;

    public OnboardingUnderageException(LocalDate localDate) {
        this.f32804a = localDate;
    }

    /* renamed from: a */
    public LocalDate m40929a() {
        return this.f32804a;
    }
}
