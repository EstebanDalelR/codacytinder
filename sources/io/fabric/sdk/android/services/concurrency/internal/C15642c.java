package io.fabric.sdk.android.services.concurrency.internal;

/* renamed from: io.fabric.sdk.android.services.concurrency.internal.c */
public class C15642c {
    /* renamed from: a */
    private final int f48413a;
    /* renamed from: b */
    private final Backoff f48414b;
    /* renamed from: c */
    private final RetryPolicy f48415c;

    public C15642c(Backoff backoff, RetryPolicy retryPolicy) {
        this(0, backoff, retryPolicy);
    }

    public C15642c(int i, Backoff backoff, RetryPolicy retryPolicy) {
        this.f48413a = i;
        this.f48414b = backoff;
        this.f48415c = retryPolicy;
    }

    /* renamed from: a */
    public long m58741a() {
        return this.f48414b.getDelayMillis(this.f48413a);
    }

    /* renamed from: b */
    public C15642c m58742b() {
        return new C15642c(this.f48413a + 1, this.f48414b, this.f48415c);
    }

    /* renamed from: c */
    public C15642c m58743c() {
        return new C15642c(this.f48414b, this.f48415c);
    }
}
