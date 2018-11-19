package com.tinder.api.model.rating;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.annotation.JsonObjectOrFalse;
import com.tinder.api.model.common.ApiMatch;
import com.tinder.api.model.meta.SuperLikes;

/* renamed from: com.tinder.api.model.rating.$AutoValue_SuperLikeRatingResponse */
abstract class C$AutoValue_SuperLikeRatingResponse extends SuperLikeRatingResponse {
    private final Boolean limitExceeded;
    private final ApiMatch match;
    private final Integer status;
    private final SuperLikes superLikes;

    C$AutoValue_SuperLikeRatingResponse(@Nullable Boolean bool, @Nullable Integer num, @Nullable ApiMatch apiMatch, @Nullable SuperLikes superLikes) {
        this.limitExceeded = bool;
        this.status = num;
        this.match = apiMatch;
        this.superLikes = superLikes;
    }

    @Nullable
    @Json(name = "limit_exceeded")
    public Boolean limitExceeded() {
        return this.limitExceeded;
    }

    @Nullable
    public Integer status() {
        return this.status;
    }

    @Nullable
    @JsonObjectOrFalse
    public ApiMatch match() {
        return this.match;
    }

    @Nullable
    @Json(name = "super_likes")
    public SuperLikes superLikes() {
        return this.superLikes;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SuperLikeRatingResponse{limitExceeded=");
        stringBuilder.append(this.limitExceeded);
        stringBuilder.append(", status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", match=");
        stringBuilder.append(this.match);
        stringBuilder.append(", superLikes=");
        stringBuilder.append(this.superLikes);
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
        r1 = r5 instanceof com.tinder.api.model.rating.SuperLikeRatingResponse;
        r2 = 0;
        if (r1 == 0) goto L_0x006a;
    L_0x0009:
        r5 = (com.tinder.api.model.rating.SuperLikeRatingResponse) r5;
        r1 = r4.limitExceeded;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.limitExceeded();
        if (r1 != 0) goto L_0x0068;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.limitExceeded;
        r3 = r5.limitExceeded();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0022:
        r1 = r4.status;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.status();
        if (r1 != 0) goto L_0x0068;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.status;
        r3 = r5.status();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0039:
        r1 = r4.match;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.match();
        if (r1 != 0) goto L_0x0068;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.match;
        r3 = r5.match();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0050:
        r1 = r4.superLikes;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r5 = r5.superLikes();
        if (r5 != 0) goto L_0x0068;
    L_0x005a:
        goto L_0x0069;
    L_0x005b:
        r1 = r4.superLikes;
        r5 = r5.superLikes();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0069;
    L_0x0068:
        r0 = 0;
    L_0x0069:
        return r0;
    L_0x006a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.rating.$AutoValue_SuperLikeRatingResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((this.limitExceeded == null ? 0 : this.limitExceeded.hashCode()) ^ 1000003) * 1000003) ^ (this.status == null ? 0 : this.status.hashCode())) * 1000003) ^ (this.match == null ? 0 : this.match.hashCode())) * 1000003;
        if (this.superLikes != null) {
            i = this.superLikes.hashCode();
        }
        return hashCode ^ i;
    }
}
