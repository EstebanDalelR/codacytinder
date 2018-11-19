package io.fabric.sdk.android.services.concurrency.internal;

/* renamed from: io.fabric.sdk.android.services.concurrency.internal.b */
public class C17341b implements Backoff {
    /* renamed from: a */
    private final long f53058a;
    /* renamed from: b */
    private final int f53059b;

    public C17341b(long j, int i) {
        this.f53058a = j;
        this.f53059b = i;
    }

    public long getDelayMillis(int i) {
        return (long) (((double) this.f53058a) * Math.pow((double) this.f53059b, (double) i));
    }
}
