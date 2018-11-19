package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.Instagram.Photo;
import java.util.List;

/* renamed from: com.tinder.api.model.common.$AutoValue_Instagram */
abstract class C$AutoValue_Instagram extends Instagram {
    private final Boolean completedInitialFetch;
    private final String lastFetchTime;
    private final Integer mediaCount;
    private final List<Photo> photos;
    private final String profilePicture;
    private final String username;

    C$AutoValue_Instagram(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable List<Photo> list, @Nullable Boolean bool, @Nullable String str3) {
        this.username = str;
        this.profilePicture = str2;
        this.mediaCount = num;
        this.photos = list;
        this.completedInitialFetch = bool;
        this.lastFetchTime = str3;
    }

    @Nullable
    public String username() {
        return this.username;
    }

    @Nullable
    @Json(name = "profile_picture")
    public String profilePicture() {
        return this.profilePicture;
    }

    @Nullable
    @Json(name = "media_count")
    public Integer mediaCount() {
        return this.mediaCount;
    }

    @Nullable
    public List<Photo> photos() {
        return this.photos;
    }

    @Nullable
    @Json(name = "completed_initial_fetch")
    public Boolean completedInitialFetch() {
        return this.completedInitialFetch;
    }

    @Nullable
    @Json(name = "last_fetch_time")
    public String lastFetchTime() {
        return this.lastFetchTime;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Instagram{username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", profilePicture=");
        stringBuilder.append(this.profilePicture);
        stringBuilder.append(", mediaCount=");
        stringBuilder.append(this.mediaCount);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
        stringBuilder.append(", completedInitialFetch=");
        stringBuilder.append(this.completedInitialFetch);
        stringBuilder.append(", lastFetchTime=");
        stringBuilder.append(this.lastFetchTime);
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
        r1 = r5 instanceof com.tinder.api.model.common.Instagram;
        r2 = 0;
        if (r1 == 0) goto L_0x0098;
    L_0x0009:
        r5 = (com.tinder.api.model.common.Instagram) r5;
        r1 = r4.username;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.username();
        if (r1 != 0) goto L_0x0096;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.username;
        r3 = r5.username();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x0022:
        r1 = r4.profilePicture;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.profilePicture();
        if (r1 != 0) goto L_0x0096;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.profilePicture;
        r3 = r5.profilePicture();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x0039:
        r1 = r4.mediaCount;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.mediaCount();
        if (r1 != 0) goto L_0x0096;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.mediaCount;
        r3 = r5.mediaCount();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x0050:
        r1 = r4.photos;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.photos();
        if (r1 != 0) goto L_0x0096;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.photos;
        r3 = r5.photos();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x0067:
        r1 = r4.completedInitialFetch;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.completedInitialFetch();
        if (r1 != 0) goto L_0x0096;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.completedInitialFetch;
        r3 = r5.completedInitialFetch();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x007e:
        r1 = r4.lastFetchTime;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r5 = r5.lastFetchTime();
        if (r5 != 0) goto L_0x0096;
    L_0x0088:
        goto L_0x0097;
    L_0x0089:
        r1 = r4.lastFetchTime;
        r5 = r5.lastFetchTime();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0096;
    L_0x0095:
        goto L_0x0097;
    L_0x0096:
        r0 = 0;
    L_0x0097:
        return r0;
    L_0x0098:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_Instagram.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.username == null ? 0 : this.username.hashCode()) ^ 1000003) * 1000003) ^ (this.profilePicture == null ? 0 : this.profilePicture.hashCode())) * 1000003) ^ (this.mediaCount == null ? 0 : this.mediaCount.hashCode())) * 1000003) ^ (this.photos == null ? 0 : this.photos.hashCode())) * 1000003) ^ (this.completedInitialFetch == null ? 0 : this.completedInitialFetch.hashCode())) * 1000003;
        if (this.lastFetchTime != null) {
            i = this.lastFetchTime.hashCode();
        }
        return hashCode ^ i;
    }
}
