package com.tinder.api.giphy;

import android.support.annotation.Nullable;
import com.tinder.api.giphy.GiphyApiResponse.Image;

/* renamed from: com.tinder.api.giphy.$AutoValue_GiphyApiResponse_Image */
abstract class C$AutoValue_GiphyApiResponse_Image extends Image {
    private final int height;
    private final String url;
    private final int width;

    C$AutoValue_GiphyApiResponse_Image(@Nullable String str, int i, int i2) {
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    @Nullable
    public String url() {
        return this.url;
    }

    public int width() {
        return this.width;
    }

    public int height() {
        return this.height;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Image{url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", width=");
        stringBuilder.append(this.width);
        stringBuilder.append(", height=");
        stringBuilder.append(this.height);
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
        r1 = r5 instanceof com.tinder.api.giphy.GiphyApiResponse.Image;
        r2 = 0;
        if (r1 == 0) goto L_0x0035;
    L_0x0009:
        r5 = (com.tinder.api.giphy.GiphyApiResponse.Image) r5;
        r1 = r4.url;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.url();
        if (r1 != 0) goto L_0x0033;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.url;
        r3 = r5.url();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0033;
    L_0x0022:
        r1 = r4.width;
        r3 = r5.width();
        if (r1 != r3) goto L_0x0033;
    L_0x002a:
        r1 = r4.height;
        r5 = r5.height();
        if (r1 != r5) goto L_0x0033;
    L_0x0032:
        goto L_0x0034;
    L_0x0033:
        r0 = 0;
    L_0x0034:
        return r0;
    L_0x0035:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.giphy.$AutoValue_GiphyApiResponse_Image.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((((this.url == null ? 0 : this.url.hashCode()) ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.height;
    }
}
