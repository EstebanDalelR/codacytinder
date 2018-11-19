package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Share */
abstract class C$AutoValue_Share extends Share {
    private final String link;
    private final String shareText;

    C$AutoValue_Share(@Nullable String str, @Nullable String str2) {
        this.link = str;
        this.shareText = str2;
    }

    @Nullable
    @Json(name = "link")
    public String link() {
        return this.link;
    }

    @Nullable
    @Json(name = "share_text_v2")
    public String shareText() {
        return this.shareText;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Share{link=");
        stringBuilder.append(this.link);
        stringBuilder.append(", shareText=");
        stringBuilder.append(this.shareText);
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
        r1 = r5 instanceof com.tinder.api.model.profile.Share;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.model.profile.Share) r5;
        r1 = r4.link;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.link();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.link;
        r3 = r5.link();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.shareText;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.shareText();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.shareText;
        r5 = r5.shareText();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.$AutoValue_Share.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.link == null ? 0 : this.link.hashCode()) ^ 1000003) * 1000003;
        if (this.shareText != null) {
            i = this.shareText.hashCode();
        }
        return hashCode ^ i;
    }
}
