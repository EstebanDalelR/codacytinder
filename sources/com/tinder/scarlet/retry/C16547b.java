package com.tinder.scarlet.retry;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18463f;
import kotlin.ranges.ClosedRange;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0005\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0002J\f\u0010\u0011\u001a\u00020\u0003*\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/scarlet/retry/ExponentialWithJitterBackoffStrategy;", "Lcom/tinder/scarlet/retry/BackoffStrategy;", "baseDurationMillis", "", "maxDurationMillis", "random", "Ljava/util/Random;", "(JJLjava/util/Random;)V", "getBaseDurationMillis", "()J", "exponentialBackoffRetryStrategy", "Lcom/tinder/scarlet/retry/ExponentialBackoffStrategy;", "getMaxDurationMillis", "backoffDurationMillisAt", "retryCount", "", "Lkotlin/ranges/ClosedRange;", "withJitter", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.retry.b */
public final class C16547b implements BackoffStrategy {
    /* renamed from: a */
    private final C16546a f51227a;
    /* renamed from: b */
    private final long f51228b;
    /* renamed from: c */
    private final long f51229c;
    /* renamed from: d */
    private final Random f51230d;

    public C16547b(long j, long j2, @NotNull Random random) {
        C2668g.b(random, "random");
        this.f51228b = j;
        this.f51229c = j2;
        this.f51230d = random;
        this.f51227a = new C16546a(this.f51228b, this.f51229c);
    }

    public /* synthetic */ C16547b(long j, long j2, Random random, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            random = new Random();
        }
        this(j, j2, random);
    }

    public long backoffDurationMillisAt(int i) {
        long backoffDurationMillisAt = this.f51227a.backoffDurationMillisAt(i);
        if (backoffDurationMillisAt == this.f51229c) {
            return backoffDurationMillisAt;
        }
        return m61966a(backoffDurationMillisAt);
    }

    /* renamed from: a */
    private final long m61966a(long j) {
        return m61967a((ClosedRange) new C18463f(0, j));
    }

    /* renamed from: a */
    private final long m61967a(@NotNull ClosedRange<Long> closedRange) {
        return ((long) this.f51230d.nextInt((int) (((Number) closedRange.getEndInclusive()).longValue() - ((Number) closedRange.getStart()).longValue()))) + ((Number) closedRange.getStart()).longValue();
    }
}
