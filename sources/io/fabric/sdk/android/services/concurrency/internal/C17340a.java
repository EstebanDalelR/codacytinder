package io.fabric.sdk.android.services.concurrency.internal;

/* renamed from: io.fabric.sdk.android.services.concurrency.internal.a */
public class C17340a implements RetryPolicy {
    /* renamed from: a */
    private final int f53057a;

    public C17340a() {
        this(1);
    }

    public C17340a(int i) {
        this.f53057a = i;
    }

    public boolean shouldRetry(int i, Throwable th) {
        return i < this.f53057a;
    }
}
