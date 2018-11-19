package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.Photo;
import java.util.List;

/* renamed from: com.tinder.api.model.profile.$AutoValue_ProfilePhotosResponse */
abstract class C$AutoValue_ProfilePhotosResponse extends ProfilePhotosResponse {
    private final Boolean arePhotosProcessing;
    private final List<Photo> photos;

    C$AutoValue_ProfilePhotosResponse(@Nullable Boolean bool, @Nullable List<Photo> list) {
        this.arePhotosProcessing = bool;
        this.photos = list;
    }

    @Nullable
    @Json(name = "photos_processing")
    public Boolean arePhotosProcessing() {
        return this.arePhotosProcessing;
    }

    @Nullable
    @Json(name = "photos")
    public List<Photo> photos() {
        return this.photos;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfilePhotosResponse{arePhotosProcessing=");
        stringBuilder.append(this.arePhotosProcessing);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
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
        r1 = r5 instanceof com.tinder.api.model.profile.ProfilePhotosResponse;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.model.profile.ProfilePhotosResponse) r5;
        r1 = r4.arePhotosProcessing;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.arePhotosProcessing();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.arePhotosProcessing;
        r3 = r5.arePhotosProcessing();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.photos;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.photos();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.photos;
        r5 = r5.photos();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.$AutoValue_ProfilePhotosResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.arePhotosProcessing == null ? 0 : this.arePhotosProcessing.hashCode()) ^ 1000003) * 1000003;
        if (this.photos != null) {
            i = this.photos.hashCode();
        }
        return hashCode ^ i;
    }
}
