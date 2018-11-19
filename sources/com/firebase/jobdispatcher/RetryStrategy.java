package com.firebase.jobdispatcher;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class RetryStrategy {
    /* renamed from: a */
    public static final RetryStrategy f5100a = new RetryStrategy(1, 30, 3600);
    /* renamed from: b */
    public static final RetryStrategy f5101b = new RetryStrategy(2, 30, 3600);
    /* renamed from: c */
    private final int f5102c;
    /* renamed from: d */
    private final int f5103d;
    /* renamed from: e */
    private final int f5104e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RetryPolicy {
    }

    /* renamed from: com.firebase.jobdispatcher.RetryStrategy$a */
    static final class C1874a {
        /* renamed from: a */
        private final ValidationEnforcer f5099a;

        C1874a(ValidationEnforcer validationEnforcer) {
            this.f5099a = validationEnforcer;
        }
    }

    RetryStrategy(int i, int i2, int i3) {
        this.f5102c = i;
        this.f5103d = i2;
        this.f5104e = i3;
    }

    /* renamed from: a */
    public int m6577a() {
        return this.f5102c;
    }

    /* renamed from: b */
    public int m6578b() {
        return this.f5103d;
    }

    /* renamed from: c */
    public int m6579c() {
        return this.f5104e;
    }
}
