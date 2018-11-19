package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.profile.Products.Variant;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Products */
abstract class C$AutoValue_Products extends Products {
    private final Variant boost;
    private final Variant gold;
    private final Variant plus;
    private final Variant superlike;
    private final Variant topPicks;

    C$AutoValue_Products(@Nullable Variant variant, @Nullable Variant variant2, @Nullable Variant variant3, @Nullable Variant variant4, @Nullable Variant variant5) {
        this.plus = variant;
        this.superlike = variant2;
        this.boost = variant3;
        this.gold = variant4;
        this.topPicks = variant5;
    }

    @Nullable
    @Json(name = "plus")
    public Variant plus() {
        return this.plus;
    }

    @Nullable
    @Json(name = "superlike")
    public Variant superlike() {
        return this.superlike;
    }

    @Nullable
    @Json(name = "boost")
    public Variant boost() {
        return this.boost;
    }

    @Nullable
    @Json(name = "gold")
    public Variant gold() {
        return this.gold;
    }

    @Nullable
    @Json(name = "toppicks")
    public Variant topPicks() {
        return this.topPicks;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Products{plus=");
        stringBuilder.append(this.plus);
        stringBuilder.append(", superlike=");
        stringBuilder.append(this.superlike);
        stringBuilder.append(", boost=");
        stringBuilder.append(this.boost);
        stringBuilder.append(", gold=");
        stringBuilder.append(this.gold);
        stringBuilder.append(", topPicks=");
        stringBuilder.append(this.topPicks);
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
        r1 = r5 instanceof com.tinder.api.model.profile.Products;
        r2 = 0;
        if (r1 == 0) goto L_0x0081;
    L_0x0009:
        r5 = (com.tinder.api.model.profile.Products) r5;
        r1 = r4.plus;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.plus();
        if (r1 != 0) goto L_0x007f;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.plus;
        r3 = r5.plus();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007f;
    L_0x0022:
        r1 = r4.superlike;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.superlike();
        if (r1 != 0) goto L_0x007f;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.superlike;
        r3 = r5.superlike();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007f;
    L_0x0039:
        r1 = r4.boost;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.boost();
        if (r1 != 0) goto L_0x007f;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.boost;
        r3 = r5.boost();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007f;
    L_0x0050:
        r1 = r4.gold;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.gold();
        if (r1 != 0) goto L_0x007f;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.gold;
        r3 = r5.gold();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007f;
    L_0x0067:
        r1 = r4.topPicks;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r5 = r5.topPicks();
        if (r5 != 0) goto L_0x007f;
    L_0x0071:
        goto L_0x0080;
    L_0x0072:
        r1 = r4.topPicks;
        r5 = r5.topPicks();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x007f;
    L_0x007e:
        goto L_0x0080;
    L_0x007f:
        r0 = 0;
    L_0x0080:
        return r0;
    L_0x0081:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.$AutoValue_Products.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((this.plus == null ? 0 : this.plus.hashCode()) ^ 1000003) * 1000003) ^ (this.superlike == null ? 0 : this.superlike.hashCode())) * 1000003) ^ (this.boost == null ? 0 : this.boost.hashCode())) * 1000003) ^ (this.gold == null ? 0 : this.gold.hashCode())) * 1000003;
        if (this.topPicks != null) {
            i = this.topPicks.hashCode();
        }
        return hashCode ^ i;
    }
}
