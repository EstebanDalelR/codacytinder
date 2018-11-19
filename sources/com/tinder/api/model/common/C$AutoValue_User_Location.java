package com.tinder.api.model.common;

import com.squareup.moshi.Json;
import com.tinder.api.model.common.User.Location;
import javax.annotation.Nullable;

/* renamed from: com.tinder.api.model.common.$AutoValue_User_Location */
abstract class C$AutoValue_User_Location extends Location {
    private final String id;
    private final String name;

    C$AutoValue_User_Location(@Nullable String str, @Nullable String str2) {
        this.name = str;
        this.id = str2;
    }

    @Nullable
    @Json(name = "name")
    public String name() {
        return this.name;
    }

    @Nullable
    @Json(name = "id")
    public String id() {
        return this.id;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Location{name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
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
        r1 = r5 instanceof com.tinder.api.model.common.User.Location;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.model.common.User.Location) r5;
        r1 = r4.name;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.name();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.id;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.id();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.id;
        r5 = r5.id();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003b;
    L_0x003a:
        r0 = 0;
    L_0x003b:
        return r0;
    L_0x003c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_User_Location.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.name == null ? 0 : this.name.hashCode()) ^ 1000003) * 1000003;
        if (this.id != null) {
            i = this.id.hashCode();
        }
        return hashCode ^ i;
    }
}
