package com.tinder.api.model.common;

import android.support.annotation.Nullable;

/* renamed from: com.tinder.api.model.common.$AutoValue_Teaser */
abstract class C$AutoValue_Teaser extends Teaser {
    private final String string;
    private final String type;

    C$AutoValue_Teaser(@Nullable String str, @Nullable String str2) {
        this.string = str;
        this.type = str2;
    }

    @Nullable
    public String string() {
        return this.string;
    }

    @Nullable
    public String type() {
        return this.type;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Teaser{string=");
        stringBuilder.append(this.string);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
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
        r1 = r5 instanceof com.tinder.api.model.common.Teaser;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.model.common.Teaser) r5;
        r1 = r4.string;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.string();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.string;
        r3 = r5.string();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.type;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.type();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.type;
        r5 = r5.type();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_Teaser.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.string == null ? 0 : this.string.hashCode()) ^ 1000003) * 1000003;
        if (this.type != null) {
            i = this.type.hashCode();
        }
        return hashCode ^ i;
    }
}
