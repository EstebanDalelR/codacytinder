package com.tinder.domain.common.reactivex;

import com.google.android.exoplayer2.Format;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18463f;
import kotlin.ranges.ClosedRange;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/tinder/domain/common/reactivex/BackoffStrategy;", "", "()V", "backoffDurationMillisAt", "", "retryIndex", "", "Exponential", "ExponentialWithJitter", "Linear", "Lcom/tinder/domain/common/reactivex/BackoffStrategy$Linear;", "Lcom/tinder/domain/common/reactivex/BackoffStrategy$Exponential;", "Lcom/tinder/domain/common/reactivex/BackoffStrategy$ExponentialWithJitter;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class BackoffStrategy {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/domain/common/reactivex/BackoffStrategy$Exponential;", "Lcom/tinder/domain/common/reactivex/BackoffStrategy;", "initialDurationMillis", "", "maxDurationMillis", "(JJ)V", "getInitialDurationMillis", "()J", "initialDurationMillisDouble", "", "getMaxDurationMillis", "maxDurationMillisMillisDouble", "backoffDurationMillisAt", "retryIndex", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Exponential extends BackoffStrategy {
        private final long initialDurationMillis;
        private final double initialDurationMillisDouble;
        private final long maxDurationMillis;
        private final double maxDurationMillisMillisDouble;

        public final long getInitialDurationMillis() {
            return this.initialDurationMillis;
        }

        public /* synthetic */ Exponential(long j, long j2, int i, C15823e c15823e) {
            if ((i & 2) != 0) {
                j2 = Format.OFFSET_SAMPLE_RELATIVE;
            }
            this(j, j2);
        }

        public final long getMaxDurationMillis() {
            return this.maxDurationMillis;
        }

        public Exponential(long j, long j2) {
            super();
            this.initialDurationMillis = j;
            this.maxDurationMillis = j2;
            this.initialDurationMillisDouble = (double) this.initialDurationMillis;
            this.maxDurationMillisMillisDouble = (double) this.maxDurationMillis;
            j = null;
            if ((this.initialDurationMillis > 0 ? 1 : null) == null) {
                j = new StringBuilder();
                j.append("initialDurationMillis, ");
                j.append(this.initialDurationMillis);
                j.append(", must be positive");
                throw new IllegalArgumentException(j.toString().toString());
            }
            if (this.maxDurationMillis > 0) {
                j = 1;
            }
            if (j == null) {
                j = new StringBuilder();
                j.append("maxDurationMillis, ");
                j.append(this.maxDurationMillis);
                j.append(", must be positive");
                throw new IllegalArgumentException(j.toString().toString());
            }
        }

        public long backoffDurationMillisAt(int i) {
            return (long) Math.min(this.maxDurationMillisMillisDouble, this.initialDurationMillisDouble * Math.pow(2.0d, (double) i));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0005\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0002J\f\u0010\u0011\u001a\u00020\u0003*\u00020\u0003H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/common/reactivex/BackoffStrategy$ExponentialWithJitter;", "Lcom/tinder/domain/common/reactivex/BackoffStrategy;", "initialDurationMillis", "", "maxDurationMillis", "random", "Ljava/util/Random;", "(JJLjava/util/Random;)V", "exponentialBackoffStrategy", "Lcom/tinder/domain/common/reactivex/BackoffStrategy$Exponential;", "getInitialDurationMillis", "()J", "getMaxDurationMillis", "backoffDurationMillisAt", "retryIndex", "", "Lkotlin/ranges/ClosedRange;", "withJitter", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class ExponentialWithJitter extends BackoffStrategy {
        private final Exponential exponentialBackoffStrategy;
        private final long initialDurationMillis;
        private final long maxDurationMillis;
        private final Random random;

        public final long getInitialDurationMillis() {
            return this.initialDurationMillis;
        }

        public final long getMaxDurationMillis() {
            return this.maxDurationMillis;
        }

        public /* synthetic */ ExponentialWithJitter(long j, long j2, Random random, int i, C15823e c15823e) {
            if ((i & 2) != null) {
                j2 = Format.OFFSET_SAMPLE_RELATIVE;
            }
            long j3 = j2;
            if ((i & 4) != null) {
                random = new Random();
            }
            this(j, j3, random);
        }

        public ExponentialWithJitter(long j, long j2, @NotNull Random random) {
            C2668g.b(random, "random");
            super();
            this.initialDurationMillis = j;
            this.maxDurationMillis = j2;
            this.random = random;
            this.exponentialBackoffStrategy = new Exponential(this.initialDurationMillis, this.maxDurationMillis);
        }

        public long backoffDurationMillisAt(int i) {
            long backoffDurationMillisAt = this.exponentialBackoffStrategy.backoffDurationMillisAt(i);
            if (backoffDurationMillisAt == this.maxDurationMillis) {
                return backoffDurationMillisAt;
            }
            return withJitter(backoffDurationMillisAt);
        }

        private final long withJitter(long j) {
            return random(new C18463f(0, j));
        }

        private final long random(@NotNull ClosedRange<Long> closedRange) {
            return ((long) this.random.nextInt((int) (((Number) closedRange.getEndInclusive()).longValue() - ((Number) closedRange.getStart()).longValue()))) + ((Number) closedRange.getStart()).longValue();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/domain/common/reactivex/BackoffStrategy$Linear;", "Lcom/tinder/domain/common/reactivex/BackoffStrategy;", "durationMillis", "", "(J)V", "backoffDurationMillisAt", "retryIndex", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Linear extends BackoffStrategy {
        private final long durationMillis;

        public Linear(long j) {
            super();
            this.durationMillis = j;
            if ((this.durationMillis > 0 ? 1 : null) == null) {
                j = new StringBuilder();
                j.append("durationMillis, ");
                j.append(this.durationMillis);
                j.append(", must be positive");
                throw new IllegalArgumentException(j.toString().toString());
            }
        }

        public long backoffDurationMillisAt(int i) {
            return this.durationMillis;
        }
    }

    public abstract long backoffDurationMillisAt(int i);

    private BackoffStrategy() {
    }
}
