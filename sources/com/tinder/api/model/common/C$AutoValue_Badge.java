package com.tinder.api.model.common;

import android.support.annotation.Nullable;

/* renamed from: com.tinder.api.model.common.$AutoValue_Badge */
abstract class C$AutoValue_Badge extends Badge {
    private final String color;
    private final String description;
    private final String type;

    C$AutoValue_Badge(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.type = str;
        this.description = str2;
        this.color = str3;
    }

    @Nullable
    public String type() {
        return this.type;
    }

    @Nullable
    public String description() {
        return this.description;
    }

    @Nullable
    public String color() {
        return this.color;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Badge{type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        stringBuilder.append(", color=");
        stringBuilder.append(this.color);
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
        r1 = r5 instanceof com.tinder.api.model.common.Badge;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.model.common.Badge) r5;
        r1 = r4.type;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.type();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.type;
        r3 = r5.type();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.description;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.description();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.description;
        r3 = r5.description();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.color;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.color();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.color;
        r5 = r5.color();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_Badge.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.type == null ? 0 : this.type.hashCode()) ^ 1000003) * 1000003) ^ (this.description == null ? 0 : this.description.hashCode())) * 1000003;
        if (this.color != null) {
            i = this.color.hashCode();
        }
        return hashCode ^ i;
    }
}
