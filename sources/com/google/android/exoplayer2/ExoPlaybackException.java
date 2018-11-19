package com.google.android.exoplayer2;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ExoPlaybackException extends Exception {
    /* renamed from: a */
    public final int f5449a;
    /* renamed from: b */
    public final int f5450b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    /* renamed from: a */
    public static ExoPlaybackException m7218a(Exception exception, int i) {
        return new ExoPlaybackException(1, null, exception, i);
    }

    /* renamed from: a */
    public static ExoPlaybackException m7217a(IOException iOException) {
        return new ExoPlaybackException(0, null, iOException, -1);
    }

    /* renamed from: a */
    static ExoPlaybackException m7219a(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, null, runtimeException, -1);
    }

    private ExoPlaybackException(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.f5449a = i;
        this.f5450b = i2;
    }
}
