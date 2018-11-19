package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.model.profile.$AutoValue_ProfileBoost */
abstract class C$AutoValue_ProfileBoost extends ProfileBoost {
    private final Integer allotment;
    private final Integer allotmentRemaining;
    private final Integer allotmentUsed;
    private final String boostId;
    private final Long duration;
    private final Long expiredAt;
    private final Integer internalRemaining;
    private final Double multiplier;
    private final Integer purchasedRemaining;
    private final Integer refreshAmount;
    private final Integer refreshInterval;
    private final String refreshIntervalUnit;
    private final Integer remaining;
    private final Long resetAt;

    C$AutoValue_ProfileBoost(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable Double d, @Nullable Integer num7, @Nullable Integer num8, @Nullable String str2, @Nullable Long l3) {
        this.allotment = num;
        this.allotmentUsed = num2;
        this.allotmentRemaining = num3;
        this.purchasedRemaining = num4;
        this.internalRemaining = num5;
        this.remaining = num6;
        this.resetAt = l;
        this.expiredAt = l2;
        this.boostId = str;
        this.multiplier = d;
        this.refreshAmount = num7;
        this.refreshInterval = num8;
        this.refreshIntervalUnit = str2;
        this.duration = l3;
    }

    @Nullable
    @Json(name = "allotment")
    public Integer allotment() {
        return this.allotment;
    }

    @Nullable
    @Json(name = "allotment_used")
    public Integer allotmentUsed() {
        return this.allotmentUsed;
    }

    @Nullable
    @Json(name = "allotment_remaining")
    public Integer allotmentRemaining() {
        return this.allotmentRemaining;
    }

    @Nullable
    @Json(name = "purchased_remaining")
    public Integer purchasedRemaining() {
        return this.purchasedRemaining;
    }

    @Nullable
    @Json(name = "internal_remaining")
    public Integer internalRemaining() {
        return this.internalRemaining;
    }

    @Nullable
    @Json(name = "remaining")
    public Integer remaining() {
        return this.remaining;
    }

    @Nullable
    @Json(name = "resets_at")
    public Long resetAt() {
        return this.resetAt;
    }

    @Nullable
    @Json(name = "expires_at")
    public Long expiredAt() {
        return this.expiredAt;
    }

    @Nullable
    @Json(name = "boost_id")
    public String boostId() {
        return this.boostId;
    }

    @Nullable
    @Json(name = "multiplier")
    public Double multiplier() {
        return this.multiplier;
    }

    @Nullable
    @Json(name = "boost_refresh_amount")
    public Integer refreshAmount() {
        return this.refreshAmount;
    }

    @Nullable
    @Json(name = "boost_refresh_interval")
    public Integer refreshInterval() {
        return this.refreshInterval;
    }

    @Nullable
    @Json(name = "boost_refresh_interval_unit")
    public String refreshIntervalUnit() {
        return this.refreshIntervalUnit;
    }

    @Nullable
    @Json(name = "duration")
    public Long duration() {
        return this.duration;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileBoost{allotment=");
        stringBuilder.append(this.allotment);
        stringBuilder.append(", allotmentUsed=");
        stringBuilder.append(this.allotmentUsed);
        stringBuilder.append(", allotmentRemaining=");
        stringBuilder.append(this.allotmentRemaining);
        stringBuilder.append(", purchasedRemaining=");
        stringBuilder.append(this.purchasedRemaining);
        stringBuilder.append(", internalRemaining=");
        stringBuilder.append(this.internalRemaining);
        stringBuilder.append(", remaining=");
        stringBuilder.append(this.remaining);
        stringBuilder.append(", resetAt=");
        stringBuilder.append(this.resetAt);
        stringBuilder.append(", expiredAt=");
        stringBuilder.append(this.expiredAt);
        stringBuilder.append(", boostId=");
        stringBuilder.append(this.boostId);
        stringBuilder.append(", multiplier=");
        stringBuilder.append(this.multiplier);
        stringBuilder.append(", refreshAmount=");
        stringBuilder.append(this.refreshAmount);
        stringBuilder.append(", refreshInterval=");
        stringBuilder.append(this.refreshInterval);
        stringBuilder.append(", refreshIntervalUnit=");
        stringBuilder.append(this.refreshIntervalUnit);
        stringBuilder.append(", duration=");
        stringBuilder.append(this.duration);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.api.model.profile.ProfileBoost;
        r2 = 0;
        if (r1 == 0) goto L_0x0150;
    L_0x0009:
        r5 = (com.tinder.api.model.profile.ProfileBoost) r5;
        r1 = r4.allotment;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.allotment();
        if (r1 != 0) goto L_0x014e;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.allotment;
        r3 = r5.allotment();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0022:
        r1 = r4.allotmentUsed;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.allotmentUsed();
        if (r1 != 0) goto L_0x014e;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.allotmentUsed;
        r3 = r5.allotmentUsed();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0039:
        r1 = r4.allotmentRemaining;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.allotmentRemaining();
        if (r1 != 0) goto L_0x014e;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.allotmentRemaining;
        r3 = r5.allotmentRemaining();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0050:
        r1 = r4.purchasedRemaining;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.purchasedRemaining();
        if (r1 != 0) goto L_0x014e;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.purchasedRemaining;
        r3 = r5.purchasedRemaining();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0067:
        r1 = r4.internalRemaining;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.internalRemaining();
        if (r1 != 0) goto L_0x014e;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.internalRemaining;
        r3 = r5.internalRemaining();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x007e:
        r1 = r4.remaining;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.remaining();
        if (r1 != 0) goto L_0x014e;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.remaining;
        r3 = r5.remaining();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0095:
        r1 = r4.resetAt;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = r5.resetAt();
        if (r1 != 0) goto L_0x014e;
    L_0x009f:
        goto L_0x00ac;
    L_0x00a0:
        r1 = r4.resetAt;
        r3 = r5.resetAt();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x00ac:
        r1 = r4.expiredAt;
        if (r1 != 0) goto L_0x00b7;
    L_0x00b0:
        r1 = r5.expiredAt();
        if (r1 != 0) goto L_0x014e;
    L_0x00b6:
        goto L_0x00c3;
    L_0x00b7:
        r1 = r4.expiredAt;
        r3 = r5.expiredAt();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x00c3:
        r1 = r4.boostId;
        if (r1 != 0) goto L_0x00ce;
    L_0x00c7:
        r1 = r5.boostId();
        if (r1 != 0) goto L_0x014e;
    L_0x00cd:
        goto L_0x00da;
    L_0x00ce:
        r1 = r4.boostId;
        r3 = r5.boostId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x00da:
        r1 = r4.multiplier;
        if (r1 != 0) goto L_0x00e5;
    L_0x00de:
        r1 = r5.multiplier();
        if (r1 != 0) goto L_0x014e;
    L_0x00e4:
        goto L_0x00f1;
    L_0x00e5:
        r1 = r4.multiplier;
        r3 = r5.multiplier();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x00f1:
        r1 = r4.refreshAmount;
        if (r1 != 0) goto L_0x00fc;
    L_0x00f5:
        r1 = r5.refreshAmount();
        if (r1 != 0) goto L_0x014e;
    L_0x00fb:
        goto L_0x0108;
    L_0x00fc:
        r1 = r4.refreshAmount;
        r3 = r5.refreshAmount();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0108:
        r1 = r4.refreshInterval;
        if (r1 != 0) goto L_0x0113;
    L_0x010c:
        r1 = r5.refreshInterval();
        if (r1 != 0) goto L_0x014e;
    L_0x0112:
        goto L_0x011f;
    L_0x0113:
        r1 = r4.refreshInterval;
        r3 = r5.refreshInterval();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x011f:
        r1 = r4.refreshIntervalUnit;
        if (r1 != 0) goto L_0x012a;
    L_0x0123:
        r1 = r5.refreshIntervalUnit();
        if (r1 != 0) goto L_0x014e;
    L_0x0129:
        goto L_0x0136;
    L_0x012a:
        r1 = r4.refreshIntervalUnit;
        r3 = r5.refreshIntervalUnit();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0136:
        r1 = r4.duration;
        if (r1 != 0) goto L_0x0141;
    L_0x013a:
        r5 = r5.duration();
        if (r5 != 0) goto L_0x014e;
    L_0x0140:
        goto L_0x014f;
    L_0x0141:
        r1 = r4.duration;
        r5 = r5.duration();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x014e;
    L_0x014d:
        goto L_0x014f;
    L_0x014e:
        r0 = 0;
    L_0x014f:
        return r0;
    L_0x0150:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.$AutoValue_ProfileBoost.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((((((((this.allotment == null ? 0 : this.allotment.hashCode()) ^ 1000003) * 1000003) ^ (this.allotmentUsed == null ? 0 : this.allotmentUsed.hashCode())) * 1000003) ^ (this.allotmentRemaining == null ? 0 : this.allotmentRemaining.hashCode())) * 1000003) ^ (this.purchasedRemaining == null ? 0 : this.purchasedRemaining.hashCode())) * 1000003) ^ (this.internalRemaining == null ? 0 : this.internalRemaining.hashCode())) * 1000003) ^ (this.remaining == null ? 0 : this.remaining.hashCode())) * 1000003) ^ (this.resetAt == null ? 0 : this.resetAt.hashCode())) * 1000003) ^ (this.expiredAt == null ? 0 : this.expiredAt.hashCode())) * 1000003) ^ (this.boostId == null ? 0 : this.boostId.hashCode())) * 1000003) ^ (this.multiplier == null ? 0 : this.multiplier.hashCode())) * 1000003) ^ (this.refreshAmount == null ? 0 : this.refreshAmount.hashCode())) * 1000003) ^ (this.refreshInterval == null ? 0 : this.refreshInterval.hashCode())) * 1000003) ^ (this.refreshIntervalUnit == null ? 0 : this.refreshIntervalUnit.hashCode())) * 1000003;
        if (this.duration != null) {
            i = this.duration.hashCode();
        }
        return hashCode ^ i;
    }
}
