package com.tinder.scarlet.retry;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/tinder/scarlet/retry/ExponentialBackoffStrategy;", "Lcom/tinder/scarlet/retry/BackoffStrategy;", "initialDurationMillis", "", "maxDurationMillis", "(JJ)V", "getInitialDurationMillis", "()J", "getMaxDurationMillis", "backoffDurationMillisAt", "retryCount", "", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.retry.a */
public final class C16546a implements BackoffStrategy {
    /* renamed from: a */
    private final long f51225a;
    /* renamed from: b */
    private final long f51226b;

    public C16546a(long j, long j2) {
        this.f51225a = j;
        this.f51226b = j2;
        j = null;
        if ((this.f51225a > 0 ? 1 : null) == null) {
            j = new StringBuilder();
            j.append("initialDurationMillis, ");
            j.append(this.f51225a);
            j.append(", must be positive");
            throw new IllegalArgumentException(j.toString().toString());
        }
        if (this.f51226b > 0) {
            j = 1;
        }
        if (j == null) {
            j = new StringBuilder();
            j.append("maxDurationMillis, ");
            j.append(this.f51226b);
            j.append(", must be positive");
            throw new IllegalArgumentException(j.toString().toString());
        }
    }

    public long backoffDurationMillisAt(int i) {
        return (long) Math.min((double) this.f51226b, ((double) this.f51225a) * Math.pow(2.0d, (double) i));
    }
}
