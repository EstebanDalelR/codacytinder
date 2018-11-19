package com.tinder.api.model.meta;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.model.meta.$AutoValue_SuperLikes */
abstract class C$AutoValue_SuperLikes extends SuperLikes {
    private final Integer alcRemaining;
    private final Integer allotment;
    private final Integer newAlcRemaining;
    private final Integer refreshAmount;
    private final Integer refreshInterval;
    private final String refreshIntervalUnit;
    private final Integer remaining;
    private final String resetsAt;

    C$AutoValue_SuperLikes(Integer num, Integer num2, Integer num3, Integer num4, @Nullable String str, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str2) {
        if (num == null) {
            throw new NullPointerException("Null remaining");
        }
        this.remaining = num;
        if (num2 == null) {
            throw new NullPointerException("Null alcRemaining");
        }
        this.alcRemaining = num2;
        if (num3 == null) {
            throw new NullPointerException("Null newAlcRemaining");
        }
        this.newAlcRemaining = num3;
        if (num4 == null) {
            throw new NullPointerException("Null allotment");
        }
        this.allotment = num4;
        this.resetsAt = str;
        this.refreshAmount = num5;
        this.refreshInterval = num6;
        this.refreshIntervalUnit = str2;
    }

    @Json(name = "remaining")
    public Integer remaining() {
        return this.remaining;
    }

    @Json(name = "alc_remaining")
    public Integer alcRemaining() {
        return this.alcRemaining;
    }

    @Json(name = "new_alc_remaining")
    public Integer newAlcRemaining() {
        return this.newAlcRemaining;
    }

    @Json(name = "allotment")
    public Integer allotment() {
        return this.allotment;
    }

    @Nullable
    @Json(name = "resets_at")
    public String resetsAt() {
        return this.resetsAt;
    }

    @Nullable
    @Json(name = "superlike_refresh_amount")
    public Integer refreshAmount() {
        return this.refreshAmount;
    }

    @Nullable
    @Json(name = "superlike_refresh_interval")
    public Integer refreshInterval() {
        return this.refreshInterval;
    }

    @Nullable
    @Json(name = "superlike_refresh_interval_unit")
    public String refreshIntervalUnit() {
        return this.refreshIntervalUnit;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SuperLikes{remaining=");
        stringBuilder.append(this.remaining);
        stringBuilder.append(", alcRemaining=");
        stringBuilder.append(this.alcRemaining);
        stringBuilder.append(", newAlcRemaining=");
        stringBuilder.append(this.newAlcRemaining);
        stringBuilder.append(", allotment=");
        stringBuilder.append(this.allotment);
        stringBuilder.append(", resetsAt=");
        stringBuilder.append(this.resetsAt);
        stringBuilder.append(", refreshAmount=");
        stringBuilder.append(this.refreshAmount);
        stringBuilder.append(", refreshInterval=");
        stringBuilder.append(this.refreshInterval);
        stringBuilder.append(", refreshIntervalUnit=");
        stringBuilder.append(this.refreshIntervalUnit);
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
        r1 = r5 instanceof com.tinder.api.model.meta.SuperLikes;
        r2 = 0;
        if (r1 == 0) goto L_0x009a;
    L_0x0009:
        r5 = (com.tinder.api.model.meta.SuperLikes) r5;
        r1 = r4.remaining;
        r3 = r5.remaining();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0098;
    L_0x0017:
        r1 = r4.alcRemaining;
        r3 = r5.alcRemaining();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0098;
    L_0x0023:
        r1 = r4.newAlcRemaining;
        r3 = r5.newAlcRemaining();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0098;
    L_0x002f:
        r1 = r4.allotment;
        r3 = r5.allotment();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0098;
    L_0x003b:
        r1 = r4.resetsAt;
        if (r1 != 0) goto L_0x0046;
    L_0x003f:
        r1 = r5.resetsAt();
        if (r1 != 0) goto L_0x0098;
    L_0x0045:
        goto L_0x0052;
    L_0x0046:
        r1 = r4.resetsAt;
        r3 = r5.resetsAt();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0098;
    L_0x0052:
        r1 = r4.refreshAmount;
        if (r1 != 0) goto L_0x005d;
    L_0x0056:
        r1 = r5.refreshAmount();
        if (r1 != 0) goto L_0x0098;
    L_0x005c:
        goto L_0x0069;
    L_0x005d:
        r1 = r4.refreshAmount;
        r3 = r5.refreshAmount();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0098;
    L_0x0069:
        r1 = r4.refreshInterval;
        if (r1 != 0) goto L_0x0074;
    L_0x006d:
        r1 = r5.refreshInterval();
        if (r1 != 0) goto L_0x0098;
    L_0x0073:
        goto L_0x0080;
    L_0x0074:
        r1 = r4.refreshInterval;
        r3 = r5.refreshInterval();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0098;
    L_0x0080:
        r1 = r4.refreshIntervalUnit;
        if (r1 != 0) goto L_0x008b;
    L_0x0084:
        r5 = r5.refreshIntervalUnit();
        if (r5 != 0) goto L_0x0098;
    L_0x008a:
        goto L_0x0099;
    L_0x008b:
        r1 = r4.refreshIntervalUnit;
        r5 = r5.refreshIntervalUnit();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0098;
    L_0x0097:
        goto L_0x0099;
    L_0x0098:
        r0 = 0;
    L_0x0099:
        return r0;
    L_0x009a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.meta.$AutoValue_SuperLikes.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((this.remaining.hashCode() ^ 1000003) * 1000003) ^ this.alcRemaining.hashCode()) * 1000003) ^ this.newAlcRemaining.hashCode()) * 1000003) ^ this.allotment.hashCode()) * 1000003) ^ (this.resetsAt == null ? 0 : this.resetsAt.hashCode())) * 1000003) ^ (this.refreshAmount == null ? 0 : this.refreshAmount.hashCode())) * 1000003) ^ (this.refreshInterval == null ? 0 : this.refreshInterval.hashCode())) * 1000003;
        if (this.refreshIntervalUnit != null) {
            i = this.refreshIntervalUnit.hashCode();
        }
        return hashCode ^ i;
    }
}
