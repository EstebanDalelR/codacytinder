package com.tinder.onboarding.exception;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/onboarding/exception/OnboardingServerException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errorCode", "", "(I)V", "getErrorCode", "()I", "onboarding_release"}, k = 1, mv = {1, 1, 10})
public final class OnboardingServerException extends RuntimeException {
    /* renamed from: a */
    private final int f32803a;

    public OnboardingServerException(int i) {
        this.f32803a = i;
    }

    /* renamed from: a */
    public final int m40928a() {
        return this.f32803a;
    }
}
