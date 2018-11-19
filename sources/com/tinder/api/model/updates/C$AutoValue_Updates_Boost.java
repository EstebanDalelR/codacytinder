package com.tinder.api.model.updates;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.updates.Updates.Boost;
import java.util.List;

/* renamed from: com.tinder.api.model.updates.$AutoValue_Updates_Boost */
abstract class C$AutoValue_Updates_Boost extends Boost {
    private final String boostCursor;
    private final List<String> profiles;

    C$AutoValue_Updates_Boost(@Nullable List<String> list, @Nullable String str) {
        this.profiles = list;
        this.boostCursor = str;
    }

    @Nullable
    public List<String> profiles() {
        return this.profiles;
    }

    @Nullable
    @Json(name = "boost_cursor")
    public String boostCursor() {
        return this.boostCursor;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Boost{profiles=");
        stringBuilder.append(this.profiles);
        stringBuilder.append(", boostCursor=");
        stringBuilder.append(this.boostCursor);
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
        r1 = r5 instanceof com.tinder.api.model.updates.Updates.Boost;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.model.updates.Updates.Boost) r5;
        r1 = r4.profiles;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.profiles();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.profiles;
        r3 = r5.profiles();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.boostCursor;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.boostCursor();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.boostCursor;
        r5 = r5.boostCursor();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.updates.$AutoValue_Updates_Boost.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.profiles == null ? 0 : this.profiles.hashCode()) ^ 1000003) * 1000003;
        if (this.boostCursor != null) {
            i = this.boostCursor.hashCode();
        }
        return hashCode ^ i;
    }
}
