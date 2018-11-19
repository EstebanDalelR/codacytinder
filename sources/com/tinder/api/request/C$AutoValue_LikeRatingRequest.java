package com.tinder.api.request;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.request.$AutoValue_LikeRatingRequest */
abstract class C$AutoValue_LikeRatingRequest extends LikeRatingRequest {
    private final String contentHash;
    private final Integer didRecUserSuperlike;
    private final Boolean isCurrentUserBoosting;
    private final Boolean isCurrentUserPassporting;
    private final Integer isFastMatch;
    private final Integer isTopPicks;
    private final Integer isUndo;
    private final String photoId;
    private final String placeId;
    private final Long sNumber;
    private final Boolean wasRecUserPassporting;

    static final class Builder extends com.tinder.api.request.LikeRatingRequest.Builder {
        private String contentHash;
        private Integer didRecUserSuperlike;
        private Boolean isCurrentUserBoosting;
        private Boolean isCurrentUserPassporting;
        private Integer isFastMatch;
        private Integer isTopPicks;
        private Integer isUndo;
        private String photoId;
        private String placeId;
        private Long sNumber;
        private Boolean wasRecUserPassporting;

        Builder() {
        }

        Builder(LikeRatingRequest likeRatingRequest) {
            this.photoId = likeRatingRequest.photoId();
            this.contentHash = likeRatingRequest.contentHash();
            this.didRecUserSuperlike = likeRatingRequest.didRecUserSuperlike();
            this.wasRecUserPassporting = likeRatingRequest.wasRecUserPassporting();
            this.isCurrentUserPassporting = likeRatingRequest.isCurrentUserPassporting();
            this.isCurrentUserBoosting = likeRatingRequest.isCurrentUserBoosting();
            this.isFastMatch = likeRatingRequest.isFastMatch();
            this.isTopPicks = likeRatingRequest.isTopPicks();
            this.isUndo = likeRatingRequest.isUndo();
            this.placeId = likeRatingRequest.placeId();
            this.sNumber = likeRatingRequest.sNumber();
        }

        public com.tinder.api.request.LikeRatingRequest.Builder photoId(@Nullable String str) {
            this.photoId = str;
            return this;
        }

        public com.tinder.api.request.LikeRatingRequest.Builder contentHash(@Nullable String str) {
            this.contentHash = str;
            return this;
        }

        public com.tinder.api.request.LikeRatingRequest.Builder didRecUserSuperlike(@Nullable Integer num) {
            this.didRecUserSuperlike = num;
            return this;
        }

        public com.tinder.api.request.LikeRatingRequest.Builder wasRecUserPassporting(@Nullable Boolean bool) {
            this.wasRecUserPassporting = bool;
            return this;
        }

        public com.tinder.api.request.LikeRatingRequest.Builder isCurrentUserPassporting(@Nullable Boolean bool) {
            this.isCurrentUserPassporting = bool;
            return this;
        }

        public com.tinder.api.request.LikeRatingRequest.Builder isCurrentUserBoosting(@Nullable Boolean bool) {
            this.isCurrentUserBoosting = bool;
            return this;
        }

        public com.tinder.api.request.LikeRatingRequest.Builder isFastMatch(@Nullable Integer num) {
            this.isFastMatch = num;
            return this;
        }

        public com.tinder.api.request.LikeRatingRequest.Builder isTopPicks(@Nullable Integer num) {
            this.isTopPicks = num;
            return this;
        }

        public com.tinder.api.request.LikeRatingRequest.Builder isUndo(@Nullable Integer num) {
            this.isUndo = num;
            return this;
        }

        public com.tinder.api.request.LikeRatingRequest.Builder placeId(@Nullable String str) {
            this.placeId = str;
            return this;
        }

        public com.tinder.api.request.LikeRatingRequest.Builder sNumber(@Nullable Long l) {
            this.sNumber = l;
            return this;
        }

        public LikeRatingRequest build() {
            return new AutoValue_LikeRatingRequest(this.photoId, this.contentHash, this.didRecUserSuperlike, this.wasRecUserPassporting, this.isCurrentUserPassporting, this.isCurrentUserBoosting, this.isFastMatch, this.isTopPicks, this.isUndo, this.placeId, this.sNumber);
        }
    }

    C$AutoValue_LikeRatingRequest(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str3, @Nullable Long l) {
        this.photoId = str;
        this.contentHash = str2;
        this.didRecUserSuperlike = num;
        this.wasRecUserPassporting = bool;
        this.isCurrentUserPassporting = bool2;
        this.isCurrentUserBoosting = bool3;
        this.isFastMatch = num2;
        this.isTopPicks = num3;
        this.isUndo = num4;
        this.placeId = str3;
        this.sNumber = l;
    }

    @Nullable
    public String photoId() {
        return this.photoId;
    }

    @Nullable
    @Json(name = "content_hash")
    public String contentHash() {
        return this.contentHash;
    }

    @Nullable
    @Json(name = "super")
    public Integer didRecUserSuperlike() {
        return this.didRecUserSuperlike;
    }

    @Nullable
    @Json(name = "user_traveling")
    public Boolean wasRecUserPassporting() {
        return this.wasRecUserPassporting;
    }

    @Nullable
    @Json(name = "rec_traveling")
    public Boolean isCurrentUserPassporting() {
        return this.isCurrentUserPassporting;
    }

    @Nullable
    @Json(name = "is_boosting")
    public Boolean isCurrentUserBoosting() {
        return this.isCurrentUserBoosting;
    }

    @Nullable
    @Json(name = "fast_match")
    public Integer isFastMatch() {
        return this.isFastMatch;
    }

    @Nullable
    @Json(name = "top_picks")
    public Integer isTopPicks() {
        return this.isTopPicks;
    }

    @Nullable
    @Json(name = "undo")
    public Integer isUndo() {
        return this.isUndo;
    }

    @Nullable
    @Json(name = "place_id")
    public String placeId() {
        return this.placeId;
    }

    @Nullable
    @Json(name = "s_number")
    public Long sNumber() {
        return this.sNumber;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LikeRatingRequest{photoId=");
        stringBuilder.append(this.photoId);
        stringBuilder.append(", contentHash=");
        stringBuilder.append(this.contentHash);
        stringBuilder.append(", didRecUserSuperlike=");
        stringBuilder.append(this.didRecUserSuperlike);
        stringBuilder.append(", wasRecUserPassporting=");
        stringBuilder.append(this.wasRecUserPassporting);
        stringBuilder.append(", isCurrentUserPassporting=");
        stringBuilder.append(this.isCurrentUserPassporting);
        stringBuilder.append(", isCurrentUserBoosting=");
        stringBuilder.append(this.isCurrentUserBoosting);
        stringBuilder.append(", isFastMatch=");
        stringBuilder.append(this.isFastMatch);
        stringBuilder.append(", isTopPicks=");
        stringBuilder.append(this.isTopPicks);
        stringBuilder.append(", isUndo=");
        stringBuilder.append(this.isUndo);
        stringBuilder.append(", placeId=");
        stringBuilder.append(this.placeId);
        stringBuilder.append(", sNumber=");
        stringBuilder.append(this.sNumber);
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
        r1 = r5 instanceof com.tinder.api.request.LikeRatingRequest;
        r2 = 0;
        if (r1 == 0) goto L_0x010b;
    L_0x0009:
        r5 = (com.tinder.api.request.LikeRatingRequest) r5;
        r1 = r4.photoId;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.photoId();
        if (r1 != 0) goto L_0x0109;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.photoId;
        r3 = r5.photoId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0109;
    L_0x0022:
        r1 = r4.contentHash;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.contentHash();
        if (r1 != 0) goto L_0x0109;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.contentHash;
        r3 = r5.contentHash();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0109;
    L_0x0039:
        r1 = r4.didRecUserSuperlike;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.didRecUserSuperlike();
        if (r1 != 0) goto L_0x0109;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.didRecUserSuperlike;
        r3 = r5.didRecUserSuperlike();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0109;
    L_0x0050:
        r1 = r4.wasRecUserPassporting;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.wasRecUserPassporting();
        if (r1 != 0) goto L_0x0109;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.wasRecUserPassporting;
        r3 = r5.wasRecUserPassporting();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0109;
    L_0x0067:
        r1 = r4.isCurrentUserPassporting;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.isCurrentUserPassporting();
        if (r1 != 0) goto L_0x0109;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.isCurrentUserPassporting;
        r3 = r5.isCurrentUserPassporting();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0109;
    L_0x007e:
        r1 = r4.isCurrentUserBoosting;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.isCurrentUserBoosting();
        if (r1 != 0) goto L_0x0109;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.isCurrentUserBoosting;
        r3 = r5.isCurrentUserBoosting();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0109;
    L_0x0095:
        r1 = r4.isFastMatch;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = r5.isFastMatch();
        if (r1 != 0) goto L_0x0109;
    L_0x009f:
        goto L_0x00ac;
    L_0x00a0:
        r1 = r4.isFastMatch;
        r3 = r5.isFastMatch();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0109;
    L_0x00ac:
        r1 = r4.isTopPicks;
        if (r1 != 0) goto L_0x00b7;
    L_0x00b0:
        r1 = r5.isTopPicks();
        if (r1 != 0) goto L_0x0109;
    L_0x00b6:
        goto L_0x00c3;
    L_0x00b7:
        r1 = r4.isTopPicks;
        r3 = r5.isTopPicks();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0109;
    L_0x00c3:
        r1 = r4.isUndo;
        if (r1 != 0) goto L_0x00ce;
    L_0x00c7:
        r1 = r5.isUndo();
        if (r1 != 0) goto L_0x0109;
    L_0x00cd:
        goto L_0x00da;
    L_0x00ce:
        r1 = r4.isUndo;
        r3 = r5.isUndo();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0109;
    L_0x00da:
        r1 = r4.placeId;
        if (r1 != 0) goto L_0x00e5;
    L_0x00de:
        r1 = r5.placeId();
        if (r1 != 0) goto L_0x0109;
    L_0x00e4:
        goto L_0x00f1;
    L_0x00e5:
        r1 = r4.placeId;
        r3 = r5.placeId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0109;
    L_0x00f1:
        r1 = r4.sNumber;
        if (r1 != 0) goto L_0x00fc;
    L_0x00f5:
        r5 = r5.sNumber();
        if (r5 != 0) goto L_0x0109;
    L_0x00fb:
        goto L_0x010a;
    L_0x00fc:
        r1 = r4.sNumber;
        r5 = r5.sNumber();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0109;
    L_0x0108:
        goto L_0x010a;
    L_0x0109:
        r0 = 0;
    L_0x010a:
        return r0;
    L_0x010b:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.request.$AutoValue_LikeRatingRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((this.photoId == null ? 0 : this.photoId.hashCode()) ^ 1000003) * 1000003) ^ (this.contentHash == null ? 0 : this.contentHash.hashCode())) * 1000003) ^ (this.didRecUserSuperlike == null ? 0 : this.didRecUserSuperlike.hashCode())) * 1000003) ^ (this.wasRecUserPassporting == null ? 0 : this.wasRecUserPassporting.hashCode())) * 1000003) ^ (this.isCurrentUserPassporting == null ? 0 : this.isCurrentUserPassporting.hashCode())) * 1000003) ^ (this.isCurrentUserBoosting == null ? 0 : this.isCurrentUserBoosting.hashCode())) * 1000003) ^ (this.isFastMatch == null ? 0 : this.isFastMatch.hashCode())) * 1000003) ^ (this.isTopPicks == null ? 0 : this.isTopPicks.hashCode())) * 1000003) ^ (this.isUndo == null ? 0 : this.isUndo.hashCode())) * 1000003) ^ (this.placeId == null ? 0 : this.placeId.hashCode())) * 1000003;
        if (this.sNumber != null) {
            i = this.sNumber.hashCode();
        }
        return hashCode ^ i;
    }
}
