package com.tinder.api.response;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.TinderSelect;
import com.tinder.api.model.profile.ProfileBoost;
import com.tinder.api.model.profile.Spotify;
import com.tinder.api.response.ProfileResponse.ResponseData;

/* renamed from: com.tinder.api.response.$AutoValue_ProfileResponse_ResponseData */
abstract class C$AutoValue_ProfileResponse_ResponseData extends ResponseData {
    private final ProfileBoost boost;
    private final Spotify spotify;
    private final TinderSelect tinderSelect;

    C$AutoValue_ProfileResponse_ResponseData(@Nullable ProfileBoost profileBoost, @Nullable Spotify spotify, @Nullable TinderSelect tinderSelect) {
        this.boost = profileBoost;
        this.spotify = spotify;
        this.tinderSelect = tinderSelect;
    }

    @Nullable
    @Json(name = "boost")
    public ProfileBoost boost() {
        return this.boost;
    }

    @Nullable
    @Json(name = "spotify")
    public Spotify spotify() {
        return this.spotify;
    }

    @Nullable
    @Json(name = "select")
    public TinderSelect tinderSelect() {
        return this.tinderSelect;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ResponseData{boost=");
        stringBuilder.append(this.boost);
        stringBuilder.append(", spotify=");
        stringBuilder.append(this.spotify);
        stringBuilder.append(", tinderSelect=");
        stringBuilder.append(this.tinderSelect);
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
        r1 = r5 instanceof com.tinder.api.response.ProfileResponse.ResponseData;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.response.ProfileResponse.ResponseData) r5;
        r1 = r4.boost;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.boost();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.boost;
        r3 = r5.boost();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.spotify;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.spotify();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.spotify;
        r3 = r5.spotify();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.tinderSelect;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.tinderSelect();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.tinderSelect;
        r5 = r5.tinderSelect();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.response.$AutoValue_ProfileResponse_ResponseData.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.boost == null ? 0 : this.boost.hashCode()) ^ 1000003) * 1000003) ^ (this.spotify == null ? 0 : this.spotify.hashCode())) * 1000003;
        if (this.tinderSelect != null) {
            i = this.tinderSelect.hashCode();
        }
        return hashCode ^ i;
    }
}
