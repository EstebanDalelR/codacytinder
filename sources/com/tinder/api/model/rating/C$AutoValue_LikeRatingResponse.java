package com.tinder.api.model.rating;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.annotation.JsonObjectOrFalse;
import com.tinder.api.model.common.ApiMatch;

/* renamed from: com.tinder.api.model.rating.$AutoValue_LikeRatingResponse */
abstract class C$AutoValue_LikeRatingResponse extends LikeRatingResponse {
    private final Integer likesRemaining;
    private final ApiMatch match;
    private final Long rateLimitUntil;

    C$AutoValue_LikeRatingResponse(@Nullable Integer num, @Nullable Long l, @Nullable ApiMatch apiMatch) {
        this.likesRemaining = num;
        this.rateLimitUntil = l;
        this.match = apiMatch;
    }

    @Nullable
    @Json(name = "likes_remaining")
    public Integer likesRemaining() {
        return this.likesRemaining;
    }

    @Nullable
    @Json(name = "rate_limited_until")
    public Long rateLimitUntil() {
        return this.rateLimitUntil;
    }

    @Nullable
    @JsonObjectOrFalse
    public ApiMatch match() {
        return this.match;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LikeRatingResponse{likesRemaining=");
        stringBuilder.append(this.likesRemaining);
        stringBuilder.append(", rateLimitUntil=");
        stringBuilder.append(this.rateLimitUntil);
        stringBuilder.append(", match=");
        stringBuilder.append(this.match);
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
        r1 = r5 instanceof com.tinder.api.model.rating.LikeRatingResponse;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.model.rating.LikeRatingResponse) r5;
        r1 = r4.likesRemaining;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.likesRemaining();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.likesRemaining;
        r3 = r5.likesRemaining();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.rateLimitUntil;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.rateLimitUntil();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.rateLimitUntil;
        r3 = r5.rateLimitUntil();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.match;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.match();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.match;
        r5 = r5.match();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0052;
    L_0x0051:
        r0 = 0;
    L_0x0052:
        return r0;
    L_0x0053:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.rating.$AutoValue_LikeRatingResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.likesRemaining == null ? 0 : this.likesRemaining.hashCode()) ^ 1000003) * 1000003) ^ (this.rateLimitUntil == null ? 0 : this.rateLimitUntil.hashCode())) * 1000003;
        if (this.match != null) {
            i = this.match.hashCode();
        }
        return hashCode ^ i;
    }
}
