package com.tinder.api.giphy;

import android.support.annotation.Nullable;
import com.tinder.api.giphy.GiphyApiResponse.Giphy;
import com.tinder.api.giphy.GiphyApiResponse.Images;

/* renamed from: com.tinder.api.giphy.$AutoValue_GiphyApiResponse_Giphy */
abstract class C$AutoValue_GiphyApiResponse_Giphy extends Giphy {
    private final String id;
    private final Images images;
    private final String type;

    C$AutoValue_GiphyApiResponse_Giphy(@Nullable String str, @Nullable String str2, @Nullable Images images) {
        this.id = str;
        this.type = str2;
        this.images = images;
    }

    @Nullable
    public String id() {
        return this.id;
    }

    @Nullable
    public String type() {
        return this.type;
    }

    @Nullable
    public Images images() {
        return this.images;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Giphy{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", images=");
        stringBuilder.append(this.images);
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
        r1 = r5 instanceof com.tinder.api.giphy.GiphyApiResponse.Giphy;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.giphy.GiphyApiResponse.Giphy) r5;
        r1 = r4.id;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.id();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.type;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.type();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.type;
        r3 = r5.type();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.images;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.images();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.images;
        r5 = r5.images();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.giphy.$AutoValue_GiphyApiResponse_Giphy.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.id == null ? 0 : this.id.hashCode()) ^ 1000003) * 1000003) ^ (this.type == null ? 0 : this.type.hashCode())) * 1000003;
        if (this.images != null) {
            i = this.images.hashCode();
        }
        return hashCode ^ i;
    }
}
