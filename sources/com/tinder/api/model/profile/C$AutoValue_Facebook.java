package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.CommonConnection;
import com.tinder.api.model.common.Interest;
import java.util.List;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Facebook */
abstract class C$AutoValue_Facebook extends Facebook {
    private final List<CommonConnection> commonConnections;
    private final List<Interest> commonInterests;
    private final Integer connectionCount;

    C$AutoValue_Facebook(@Nullable List<CommonConnection> list, @Nullable List<Interest> list2, @Nullable Integer num) {
        this.commonConnections = list;
        this.commonInterests = list2;
        this.connectionCount = num;
    }

    @Nullable
    @Json(name = "common_connections")
    public List<CommonConnection> commonConnections() {
        return this.commonConnections;
    }

    @Nullable
    @Json(name = "common_interests")
    public List<Interest> commonInterests() {
        return this.commonInterests;
    }

    @Nullable
    @Json(name = "connection_count")
    public Integer connectionCount() {
        return this.connectionCount;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Facebook{commonConnections=");
        stringBuilder.append(this.commonConnections);
        stringBuilder.append(", commonInterests=");
        stringBuilder.append(this.commonInterests);
        stringBuilder.append(", connectionCount=");
        stringBuilder.append(this.connectionCount);
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
        r1 = r5 instanceof com.tinder.api.model.profile.Facebook;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.model.profile.Facebook) r5;
        r1 = r4.commonConnections;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.commonConnections();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.commonConnections;
        r3 = r5.commonConnections();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.commonInterests;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.commonInterests();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.commonInterests;
        r3 = r5.commonInterests();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.connectionCount;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.connectionCount();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.connectionCount;
        r5 = r5.connectionCount();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.$AutoValue_Facebook.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.commonConnections == null ? 0 : this.commonConnections.hashCode()) ^ 1000003) * 1000003) ^ (this.commonInterests == null ? 0 : this.commonInterests.hashCode())) * 1000003;
        if (this.connectionCount != null) {
            i = this.connectionCount.hashCode();
        }
        return hashCode ^ i;
    }
}
