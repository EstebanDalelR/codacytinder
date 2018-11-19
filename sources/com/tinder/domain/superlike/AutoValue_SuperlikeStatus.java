package com.tinder.domain.superlike;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.TimeInterval;
import org.joda.time.DateTime;

final class AutoValue_SuperlikeStatus extends SuperlikeStatus {
    private final boolean hasSuperlikes;
    private final long millisUntilResetDate;
    private final int refreshAmount;
    private final TimeInterval refreshInterval;
    private final int remainingCount;
    private final DateTime resetDate;
    private final long resetDateInMillis;

    static final class Builder extends com.tinder.domain.superlike.SuperlikeStatus.Builder {
        private Boolean hasSuperlikes;
        private Long millisUntilResetDate;
        private Integer refreshAmount;
        private TimeInterval refreshInterval;
        private Integer remainingCount;
        private DateTime resetDate;
        private Long resetDateInMillis;

        Builder() {
        }

        Builder(SuperlikeStatus superlikeStatus) {
            this.hasSuperlikes = Boolean.valueOf(superlikeStatus.hasSuperlikes());
            this.millisUntilResetDate = Long.valueOf(superlikeStatus.millisUntilResetDate());
            this.remainingCount = Integer.valueOf(superlikeStatus.remainingCount());
            this.resetDate = superlikeStatus.resetDate();
            this.resetDateInMillis = Long.valueOf(superlikeStatus.resetDateInMillis());
            this.refreshAmount = Integer.valueOf(superlikeStatus.refreshAmount());
            this.refreshInterval = superlikeStatus.refreshInterval();
        }

        public com.tinder.domain.superlike.SuperlikeStatus.Builder hasSuperlikes(boolean z) {
            this.hasSuperlikes = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.superlike.SuperlikeStatus.Builder millisUntilResetDate(long j) {
            this.millisUntilResetDate = Long.valueOf(j);
            return this;
        }

        public com.tinder.domain.superlike.SuperlikeStatus.Builder remainingCount(int i) {
            this.remainingCount = Integer.valueOf(i);
            return this;
        }

        public com.tinder.domain.superlike.SuperlikeStatus.Builder resetDate(@Nullable DateTime dateTime) {
            this.resetDate = dateTime;
            return this;
        }

        public com.tinder.domain.superlike.SuperlikeStatus.Builder resetDateInMillis(long j) {
            this.resetDateInMillis = Long.valueOf(j);
            return this;
        }

        public com.tinder.domain.superlike.SuperlikeStatus.Builder refreshAmount(int i) {
            this.refreshAmount = Integer.valueOf(i);
            return this;
        }

        public com.tinder.domain.superlike.SuperlikeStatus.Builder refreshInterval(TimeInterval timeInterval) {
            this.refreshInterval = timeInterval;
            return this;
        }

        public SuperlikeStatus build() {
            String str = "";
            if (this.hasSuperlikes == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" hasSuperlikes");
                str = stringBuilder.toString();
            }
            if (this.millisUntilResetDate == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" millisUntilResetDate");
                str = stringBuilder.toString();
            }
            if (this.remainingCount == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" remainingCount");
                str = stringBuilder.toString();
            }
            if (this.resetDateInMillis == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" resetDateInMillis");
                str = stringBuilder.toString();
            }
            if (this.refreshAmount == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" refreshAmount");
                str = stringBuilder.toString();
            }
            if (this.refreshInterval == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" refreshInterval");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SuperlikeStatus(this.hasSuperlikes.booleanValue(), this.millisUntilResetDate.longValue(), this.remainingCount.intValue(), this.resetDate, this.resetDateInMillis.longValue(), this.refreshAmount.intValue(), this.refreshInterval);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_SuperlikeStatus(boolean z, long j, int i, @Nullable DateTime dateTime, long j2, int i2, TimeInterval timeInterval) {
        this.hasSuperlikes = z;
        this.millisUntilResetDate = j;
        this.remainingCount = i;
        this.resetDate = dateTime;
        this.resetDateInMillis = j2;
        this.refreshAmount = i2;
        this.refreshInterval = timeInterval;
    }

    public boolean hasSuperlikes() {
        return this.hasSuperlikes;
    }

    public long millisUntilResetDate() {
        return this.millisUntilResetDate;
    }

    public int remainingCount() {
        return this.remainingCount;
    }

    @Nullable
    public DateTime resetDate() {
        return this.resetDate;
    }

    public long resetDateInMillis() {
        return this.resetDateInMillis;
    }

    public int refreshAmount() {
        return this.refreshAmount;
    }

    @NonNull
    public TimeInterval refreshInterval() {
        return this.refreshInterval;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SuperlikeStatus{hasSuperlikes=");
        stringBuilder.append(this.hasSuperlikes);
        stringBuilder.append(", millisUntilResetDate=");
        stringBuilder.append(this.millisUntilResetDate);
        stringBuilder.append(", remainingCount=");
        stringBuilder.append(this.remainingCount);
        stringBuilder.append(", resetDate=");
        stringBuilder.append(this.resetDate);
        stringBuilder.append(", resetDateInMillis=");
        stringBuilder.append(this.resetDateInMillis);
        stringBuilder.append(", refreshAmount=");
        stringBuilder.append(this.refreshAmount);
        stringBuilder.append(", refreshInterval=");
        stringBuilder.append(this.refreshInterval);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
        r7 = this;
        r0 = 1;
        if (r8 != r7) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r8 instanceof com.tinder.domain.superlike.SuperlikeStatus;
        r2 = 0;
        if (r1 == 0) goto L_0x005d;
    L_0x0009:
        r8 = (com.tinder.domain.superlike.SuperlikeStatus) r8;
        r1 = r7.hasSuperlikes;
        r3 = r8.hasSuperlikes();
        if (r1 != r3) goto L_0x005b;
    L_0x0013:
        r3 = r7.millisUntilResetDate;
        r5 = r8.millisUntilResetDate();
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x005b;
    L_0x001d:
        r1 = r7.remainingCount;
        r3 = r8.remainingCount();
        if (r1 != r3) goto L_0x005b;
    L_0x0025:
        r1 = r7.resetDate;
        if (r1 != 0) goto L_0x0030;
    L_0x0029:
        r1 = r8.resetDate();
        if (r1 != 0) goto L_0x005b;
    L_0x002f:
        goto L_0x003c;
    L_0x0030:
        r1 = r7.resetDate;
        r3 = r8.resetDate();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x005b;
    L_0x003c:
        r3 = r7.resetDateInMillis;
        r5 = r8.resetDateInMillis();
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x005b;
    L_0x0046:
        r1 = r7.refreshAmount;
        r3 = r8.refreshAmount();
        if (r1 != r3) goto L_0x005b;
    L_0x004e:
        r1 = r7.refreshInterval;
        r8 = r8.refreshInterval();
        r8 = r1.equals(r8);
        if (r8 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        r0 = 0;
    L_0x005c:
        return r0;
    L_0x005d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.superlike.AutoValue_SuperlikeStatus.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((((int) (((long) (((((((int) (((long) (((this.hasSuperlikes ? 1231 : 1237) ^ 1000003) * 1000003)) ^ ((this.millisUntilResetDate >>> 32) ^ this.millisUntilResetDate))) * 1000003) ^ this.remainingCount) * 1000003) ^ (this.resetDate == null ? 0 : this.resetDate.hashCode())) * 1000003)) ^ ((this.resetDateInMillis >>> 32) ^ this.resetDateInMillis))) * 1000003) ^ this.refreshAmount) * 1000003) ^ this.refreshInterval.hashCode();
    }

    public com.tinder.domain.superlike.SuperlikeStatus.Builder toBuilder() {
        return new Builder(this);
    }
}
