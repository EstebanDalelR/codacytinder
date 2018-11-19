package com.tinder.onboarding.exception;

import android.support.annotation.Nullable;

public class OnboardingJsonParseException extends RuntimeException {
    @Nullable
    /* renamed from: a */
    private final String f32802a;

    public OnboardingJsonParseException(@Nullable String str) {
        this.f32802a = str;
    }

    @Nullable
    /* renamed from: a */
    public String m40927a() {
        return this.f32802a;
    }
}
