package com.tinder.domain.tinderplus;

final class AutoValue_LikeStatus extends LikeStatus {
    private final int likesPercentRemaining;
    private final long millisRateLimitedUntil;

    AutoValue_LikeStatus(int i, long j) {
        this.likesPercentRemaining = i;
        this.millisRateLimitedUntil = j;
    }

    public int likesPercentRemaining() {
        return this.likesPercentRemaining;
    }

    public long millisRateLimitedUntil() {
        return this.millisRateLimitedUntil;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LikeStatus{likesPercentRemaining=");
        stringBuilder.append(this.likesPercentRemaining);
        stringBuilder.append(", millisRateLimitedUntil=");
        stringBuilder.append(this.millisRateLimitedUntil);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeStatus)) {
            return false;
        }
        LikeStatus likeStatus = (LikeStatus) obj;
        if (this.likesPercentRemaining != likeStatus.likesPercentRemaining() || this.millisRateLimitedUntil != likeStatus.millisRateLimitedUntil()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (int) (((long) ((this.likesPercentRemaining ^ 1000003) * 1000003)) ^ ((this.millisRateLimitedUntil >>> 32) ^ this.millisRateLimitedUntil));
    }
}
