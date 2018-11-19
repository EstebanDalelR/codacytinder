package com.tinder.api.model.updates;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.updates.Updates.LikedMessage;

/* renamed from: com.tinder.api.model.updates.$AutoValue_Updates_LikedMessage */
abstract class C$AutoValue_Updates_LikedMessage extends LikedMessage {
    private final Boolean isLiked;
    private final String likerId;
    private final String matchId;
    private final String messageId;
    private final String updatedAt;

    C$AutoValue_Updates_LikedMessage(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool) {
        this.messageId = str;
        this.updatedAt = str2;
        this.likerId = str3;
        this.matchId = str4;
        this.isLiked = bool;
    }

    @Nullable
    @Json(name = "message_id")
    public String messageId() {
        return this.messageId;
    }

    @Nullable
    @Json(name = "updated_at")
    public String updatedAt() {
        return this.updatedAt;
    }

    @Nullable
    @Json(name = "liker_id")
    public String likerId() {
        return this.likerId;
    }

    @Nullable
    @Json(name = "match_id")
    public String matchId() {
        return this.matchId;
    }

    @Nullable
    @Json(name = "is_liked")
    public Boolean isLiked() {
        return this.isLiked;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LikedMessage{messageId=");
        stringBuilder.append(this.messageId);
        stringBuilder.append(", updatedAt=");
        stringBuilder.append(this.updatedAt);
        stringBuilder.append(", likerId=");
        stringBuilder.append(this.likerId);
        stringBuilder.append(", matchId=");
        stringBuilder.append(this.matchId);
        stringBuilder.append(", isLiked=");
        stringBuilder.append(this.isLiked);
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
        r1 = r5 instanceof com.tinder.api.model.updates.Updates.LikedMessage;
        r2 = 0;
        if (r1 == 0) goto L_0x0081;
    L_0x0009:
        r5 = (com.tinder.api.model.updates.Updates.LikedMessage) r5;
        r1 = r4.messageId;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.messageId();
        if (r1 != 0) goto L_0x007f;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.messageId;
        r3 = r5.messageId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007f;
    L_0x0022:
        r1 = r4.updatedAt;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.updatedAt();
        if (r1 != 0) goto L_0x007f;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.updatedAt;
        r3 = r5.updatedAt();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007f;
    L_0x0039:
        r1 = r4.likerId;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.likerId();
        if (r1 != 0) goto L_0x007f;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.likerId;
        r3 = r5.likerId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007f;
    L_0x0050:
        r1 = r4.matchId;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.matchId();
        if (r1 != 0) goto L_0x007f;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.matchId;
        r3 = r5.matchId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007f;
    L_0x0067:
        r1 = r4.isLiked;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r5 = r5.isLiked();
        if (r5 != 0) goto L_0x007f;
    L_0x0071:
        goto L_0x0080;
    L_0x0072:
        r1 = r4.isLiked;
        r5 = r5.isLiked();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.updates.$AutoValue_Updates_LikedMessage.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((this.messageId == null ? 0 : this.messageId.hashCode()) ^ 1000003) * 1000003) ^ (this.updatedAt == null ? 0 : this.updatedAt.hashCode())) * 1000003) ^ (this.likerId == null ? 0 : this.likerId.hashCode())) * 1000003) ^ (this.matchId == null ? 0 : this.matchId.hashCode())) * 1000003;
        if (this.isLiked != null) {
            i = this.isLiked.hashCode();
        }
        return hashCode ^ i;
    }
}
