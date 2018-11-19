package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.profile.Travel.TravelLocationInfo;
import com.tinder.api.model.profile.Travel.TravelPosition;
import java.util.List;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Travel */
abstract class C$AutoValue_Travel extends Travel {
    private final Boolean isTraveling;
    private final List<TravelLocationInfo> travelLocationInfo;
    private final TravelPosition travelPos;

    C$AutoValue_Travel(@Nullable Boolean bool, @Nullable TravelPosition travelPosition, @Nullable List<TravelLocationInfo> list) {
        this.isTraveling = bool;
        this.travelPos = travelPosition;
        this.travelLocationInfo = list;
    }

    @Nullable
    @Json(name = "is_traveling")
    public Boolean isTraveling() {
        return this.isTraveling;
    }

    @Nullable
    @Json(name = "travel_pos")
    public TravelPosition travelPos() {
        return this.travelPos;
    }

    @Nullable
    @Json(name = "travel_location_info")
    public List<TravelLocationInfo> travelLocationInfo() {
        return this.travelLocationInfo;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Travel{isTraveling=");
        stringBuilder.append(this.isTraveling);
        stringBuilder.append(", travelPos=");
        stringBuilder.append(this.travelPos);
        stringBuilder.append(", travelLocationInfo=");
        stringBuilder.append(this.travelLocationInfo);
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
        r1 = r5 instanceof com.tinder.api.model.profile.Travel;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.model.profile.Travel) r5;
        r1 = r4.isTraveling;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.isTraveling();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.isTraveling;
        r3 = r5.isTraveling();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.travelPos;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.travelPos();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.travelPos;
        r3 = r5.travelPos();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.travelLocationInfo;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.travelLocationInfo();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.travelLocationInfo;
        r5 = r5.travelLocationInfo();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.$AutoValue_Travel.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.isTraveling == null ? 0 : this.isTraveling.hashCode()) ^ 1000003) * 1000003) ^ (this.travelPos == null ? 0 : this.travelPos.hashCode())) * 1000003;
        if (this.travelLocationInfo != null) {
            i = this.travelLocationInfo.hashCode();
        }
        return hashCode ^ i;
    }
}
