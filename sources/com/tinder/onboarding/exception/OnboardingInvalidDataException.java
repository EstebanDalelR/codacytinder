package com.tinder.onboarding.exception;

import android.support.annotation.NonNull;
import com.tinder.onboarding.model.OnboardingInvalidDataType;
import java.util.Collections;
import java.util.List;

public class OnboardingInvalidDataException extends RuntimeException {
    @NonNull
    /* renamed from: a */
    private final OnboardingInvalidDataType f32800a;
    @NonNull
    /* renamed from: b */
    private List<String> f32801b = Collections.emptyList();

    public OnboardingInvalidDataException(@NonNull OnboardingInvalidDataType onboardingInvalidDataType) {
        this.f32800a = onboardingInvalidDataType;
    }

    @NonNull
    /* renamed from: a */
    public OnboardingInvalidDataType m40924a() {
        return this.f32800a;
    }

    /* renamed from: a */
    public void m40925a(@NonNull List<String> list) {
        this.f32801b = list;
    }

    @NonNull
    /* renamed from: b */
    public List<String> m40926b() {
        return this.f32801b;
    }
}
