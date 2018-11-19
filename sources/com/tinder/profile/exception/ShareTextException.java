package com.tinder.profile.exception;

import android.support.annotation.NonNull;

public class ShareTextException extends RuntimeException {
    /* renamed from: a */
    private ExceptionType f45628a;

    public enum ExceptionType {
        JSON_EXCEPTION,
        INVALID_RESPONSE,
        USER_IS_HIDDEN
    }

    @NonNull
    /* renamed from: a */
    public static ShareTextException m54886a() {
        return new ShareTextException(ExceptionType.JSON_EXCEPTION);
    }

    @NonNull
    /* renamed from: b */
    public static ShareTextException m54887b() {
        return new ShareTextException(ExceptionType.INVALID_RESPONSE);
    }

    @NonNull
    /* renamed from: c */
    public static ShareTextException m54888c() {
        return new ShareTextException(ExceptionType.USER_IS_HIDDEN);
    }

    private ShareTextException(@NonNull ExceptionType exceptionType) {
        this.f45628a = exceptionType;
    }

    /* renamed from: d */
    public ExceptionType m54889d() {
        return this.f45628a;
    }
}
