package com.tinder.onboarding.exception;

public class OnboardingInternalErrorException extends RuntimeException {
    public OnboardingInternalErrorException(Throwable th) {
        super(th);
    }

    public OnboardingInternalErrorException(String str) {
        super(str);
    }
}
