package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.tinder.api.model.common.SpotifyThemeTrack.Image;

/* renamed from: com.tinder.api.model.common.$AutoValue_SpotifyThemeTrack_Image */
abstract class C$AutoValue_SpotifyThemeTrack_Image extends Image {
    private final Integer height;
    private final String url;
    private final Integer width;

    C$AutoValue_SpotifyThemeTrack_Image(@Nullable Integer num, @Nullable Integer num2, @Nullable String str) {
        this.width = num;
        this.height = num2;
        this.url = str;
    }

    @Nullable
    public Integer width() {
        return this.width;
    }

    @Nullable
    public Integer height() {
        return this.height;
    }

    @Nullable
    public String url() {
        return this.url;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Image{width=");
        stringBuilder.append(this.width);
        stringBuilder.append(", height=");
        stringBuilder.append(this.height);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
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
        r1 = r5 instanceof com.tinder.api.model.common.SpotifyThemeTrack.Image;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.model.common.SpotifyThemeTrack.Image) r5;
        r1 = r4.width;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.width();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.width;
        r3 = r5.width();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.height;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.height();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.height;
        r3 = r5.height();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.url;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.url();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.url;
        r5 = r5.url();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_SpotifyThemeTrack_Image.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.width == null ? 0 : this.width.hashCode()) ^ 1000003) * 1000003) ^ (this.height == null ? 0 : this.height.hashCode())) * 1000003;
        if (this.url != null) {
            i = this.url.hashCode();
        }
        return hashCode ^ i;
    }
}
