package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.tinder.api.model.common.Instagram.Photo;

/* renamed from: com.tinder.api.model.common.$AutoValue_Instagram_Photo */
abstract class C$AutoValue_Instagram_Photo extends Photo {
    private final String image;
    private final String link;
    private final String thumbnail;
    private final long ts;

    C$AutoValue_Instagram_Photo(@Nullable String str, long j, @Nullable String str2, @Nullable String str3) {
        this.link = str;
        this.ts = j;
        this.thumbnail = str2;
        this.image = str3;
    }

    @Nullable
    public String link() {
        return this.link;
    }

    public long ts() {
        return this.ts;
    }

    @Nullable
    public String thumbnail() {
        return this.thumbnail;
    }

    @Nullable
    public String image() {
        return this.image;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Photo{link=");
        stringBuilder.append(this.link);
        stringBuilder.append(", ts=");
        stringBuilder.append(this.ts);
        stringBuilder.append(", thumbnail=");
        stringBuilder.append(this.thumbnail);
        stringBuilder.append(", image=");
        stringBuilder.append(this.image);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
        r7 = this;
        r0 = 1;
        if (r8 != r7) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r8 instanceof com.tinder.api.model.common.Instagram.Photo;
        r2 = 0;
        if (r1 == 0) goto L_0x005d;
    L_0x0009:
        r8 = (com.tinder.api.model.common.Instagram.Photo) r8;
        r1 = r7.link;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r8.link();
        if (r1 != 0) goto L_0x005b;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r7.link;
        r3 = r8.link();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x005b;
    L_0x0022:
        r3 = r7.ts;
        r5 = r8.ts();
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x005b;
    L_0x002c:
        r1 = r7.thumbnail;
        if (r1 != 0) goto L_0x0037;
    L_0x0030:
        r1 = r8.thumbnail();
        if (r1 != 0) goto L_0x005b;
    L_0x0036:
        goto L_0x0043;
    L_0x0037:
        r1 = r7.thumbnail;
        r3 = r8.thumbnail();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x005b;
    L_0x0043:
        r1 = r7.image;
        if (r1 != 0) goto L_0x004e;
    L_0x0047:
        r8 = r8.image();
        if (r8 != 0) goto L_0x005b;
    L_0x004d:
        goto L_0x005c;
    L_0x004e:
        r1 = r7.image;
        r8 = r8.image();
        r8 = r1.equals(r8);
        if (r8 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        r0 = 0;
    L_0x005c:
        return r0;
    L_0x005d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_Instagram_Photo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((int) (((long) (((this.link == null ? 0 : this.link.hashCode()) ^ 1000003) * 1000003)) ^ ((this.ts >>> 32) ^ this.ts))) * 1000003) ^ (this.thumbnail == null ? 0 : this.thumbnail.hashCode())) * 1000003;
        if (this.image != null) {
            i = this.image.hashCode();
        }
        return hashCode ^ i;
    }
}
