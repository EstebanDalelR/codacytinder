package com.tinder.api.request;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.request.$AutoValue_HideProfileItemsRequestBody */
abstract class C$AutoValue_HideProfileItemsRequestBody extends HideProfileItemsRequestBody {
    private final Boolean hideAds;
    private final Boolean hideAge;
    private final Boolean hideDistance;

    static final class Builder extends com.tinder.api.request.HideProfileItemsRequestBody.Builder {
        private Boolean hideAds;
        private Boolean hideAge;
        private Boolean hideDistance;

        Builder() {
        }

        Builder(HideProfileItemsRequestBody hideProfileItemsRequestBody) {
            this.hideAge = hideProfileItemsRequestBody.hideAge();
            this.hideAds = hideProfileItemsRequestBody.hideAds();
            this.hideDistance = hideProfileItemsRequestBody.hideDistance();
        }

        public com.tinder.api.request.HideProfileItemsRequestBody.Builder setHideAge(@Nullable Boolean bool) {
            this.hideAge = bool;
            return this;
        }

        public com.tinder.api.request.HideProfileItemsRequestBody.Builder setHideAds(@Nullable Boolean bool) {
            this.hideAds = bool;
            return this;
        }

        public com.tinder.api.request.HideProfileItemsRequestBody.Builder setHideDistance(@Nullable Boolean bool) {
            this.hideDistance = bool;
            return this;
        }

        public HideProfileItemsRequestBody build() {
            return new AutoValue_HideProfileItemsRequestBody(this.hideAge, this.hideAds, this.hideDistance);
        }
    }

    C$AutoValue_HideProfileItemsRequestBody(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.hideAge = bool;
        this.hideAds = bool2;
        this.hideDistance = bool3;
    }

    @Nullable
    @Json(name = "hide_age")
    public Boolean hideAge() {
        return this.hideAge;
    }

    @Nullable
    @Json(name = "hide_ads")
    public Boolean hideAds() {
        return this.hideAds;
    }

    @Nullable
    @Json(name = "hide_distance")
    public Boolean hideDistance() {
        return this.hideDistance;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HideProfileItemsRequestBody{hideAge=");
        stringBuilder.append(this.hideAge);
        stringBuilder.append(", hideAds=");
        stringBuilder.append(this.hideAds);
        stringBuilder.append(", hideDistance=");
        stringBuilder.append(this.hideDistance);
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
        r1 = r5 instanceof com.tinder.api.request.HideProfileItemsRequestBody;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.request.HideProfileItemsRequestBody) r5;
        r1 = r4.hideAge;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.hideAge();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.hideAge;
        r3 = r5.hideAge();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.hideAds;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.hideAds();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.hideAds;
        r3 = r5.hideAds();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.hideDistance;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.hideDistance();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.hideDistance;
        r5 = r5.hideDistance();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.request.$AutoValue_HideProfileItemsRequestBody.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.hideAge == null ? 0 : this.hideAge.hashCode()) ^ 1000003) * 1000003) ^ (this.hideAds == null ? 0 : this.hideAds.hashCode())) * 1000003;
        if (this.hideDistance != null) {
            i = this.hideDistance.hashCode();
        }
        return hashCode ^ i;
    }
}
