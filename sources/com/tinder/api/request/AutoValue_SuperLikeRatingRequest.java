package com.tinder.api.request;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

final class AutoValue_SuperLikeRatingRequest extends SuperLikeRatingRequest {
    private final Boolean isCurrentUserBoosting;
    private final Boolean isCurrentUserPassporting;
    private final Boolean isFastMatch;
    private final Boolean isTopPicks;
    private final String photoId;
    private final String recId;
    private final Long sNumber;
    private final Boolean wasRecUserPassporting;

    static final class Builder extends com.tinder.api.request.SuperLikeRatingRequest.Builder {
        private Boolean isCurrentUserBoosting;
        private Boolean isCurrentUserPassporting;
        private Boolean isFastMatch;
        private Boolean isTopPicks;
        private String photoId;
        private String recId;
        private Long sNumber;
        private Boolean wasRecUserPassporting;

        Builder() {
        }

        Builder(SuperLikeRatingRequest superLikeRatingRequest) {
            this.recId = superLikeRatingRequest.recId();
            this.photoId = superLikeRatingRequest.photoId();
            this.wasRecUserPassporting = superLikeRatingRequest.wasRecUserPassporting();
            this.isCurrentUserPassporting = superLikeRatingRequest.isCurrentUserPassporting();
            this.isCurrentUserBoosting = superLikeRatingRequest.isCurrentUserBoosting();
            this.isFastMatch = superLikeRatingRequest.isFastMatch();
            this.isTopPicks = superLikeRatingRequest.isTopPicks();
            this.sNumber = superLikeRatingRequest.sNumber();
        }

        public com.tinder.api.request.SuperLikeRatingRequest.Builder recId(String str) {
            this.recId = str;
            return this;
        }

        public com.tinder.api.request.SuperLikeRatingRequest.Builder photoId(@Nullable String str) {
            this.photoId = str;
            return this;
        }

        public com.tinder.api.request.SuperLikeRatingRequest.Builder wasRecUserPassporting(@Nullable Boolean bool) {
            this.wasRecUserPassporting = bool;
            return this;
        }

        public com.tinder.api.request.SuperLikeRatingRequest.Builder isCurrentUserPassporting(@Nullable Boolean bool) {
            this.isCurrentUserPassporting = bool;
            return this;
        }

        public com.tinder.api.request.SuperLikeRatingRequest.Builder isCurrentUserBoosting(@Nullable Boolean bool) {
            this.isCurrentUserBoosting = bool;
            return this;
        }

        public com.tinder.api.request.SuperLikeRatingRequest.Builder isFastMatch(@Nullable Boolean bool) {
            this.isFastMatch = bool;
            return this;
        }

        public com.tinder.api.request.SuperLikeRatingRequest.Builder isTopPicks(@Nullable Boolean bool) {
            this.isTopPicks = bool;
            return this;
        }

        public com.tinder.api.request.SuperLikeRatingRequest.Builder sNumber(@Nullable Long l) {
            this.sNumber = l;
            return this;
        }

        public SuperLikeRatingRequest build() {
            String str = "";
            if (this.recId == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" recId");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SuperLikeRatingRequest(this.recId, this.photoId, this.wasRecUserPassporting, this.isCurrentUserPassporting, this.isCurrentUserBoosting, this.isFastMatch, this.isTopPicks, this.sNumber);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_SuperLikeRatingRequest(String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Long l) {
        this.recId = str;
        this.photoId = str2;
        this.wasRecUserPassporting = bool;
        this.isCurrentUserPassporting = bool2;
        this.isCurrentUserBoosting = bool3;
        this.isFastMatch = bool4;
        this.isTopPicks = bool5;
        this.sNumber = l;
    }

    @NonNull
    public String recId() {
        return this.recId;
    }

    @Nullable
    public String photoId() {
        return this.photoId;
    }

    @Nullable
    public Boolean wasRecUserPassporting() {
        return this.wasRecUserPassporting;
    }

    @Nullable
    public Boolean isCurrentUserPassporting() {
        return this.isCurrentUserPassporting;
    }

    @Nullable
    public Boolean isCurrentUserBoosting() {
        return this.isCurrentUserBoosting;
    }

    @Nullable
    public Boolean isFastMatch() {
        return this.isFastMatch;
    }

    @Nullable
    public Boolean isTopPicks() {
        return this.isTopPicks;
    }

    @Nullable
    public Long sNumber() {
        return this.sNumber;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SuperLikeRatingRequest{recId=");
        stringBuilder.append(this.recId);
        stringBuilder.append(", photoId=");
        stringBuilder.append(this.photoId);
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
        r1 = r5 instanceof com.tinder.api.request.SuperLikeRatingRequest;
        r2 = 0;
        if (r1 == 0) goto L_0x00bb;
    L_0x0009:
        r5 = (com.tinder.api.request.SuperLikeRatingRequest) r5;
        r1 = r4.recId;
        r3 = r5.recId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00b9;
    L_0x0017:
        r1 = r4.photoId;
        if (r1 != 0) goto L_0x0022;
    L_0x001b:
        r1 = r5.photoId();
        if (r1 != 0) goto L_0x00b9;
    L_0x0021:
        goto L_0x002e;
    L_0x0022:
        r1 = r4.photoId;
        r3 = r5.photoId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00b9;
    L_0x002e:
        r1 = r4.wasRecUserPassporting;
        if (r1 != 0) goto L_0x0039;
    L_0x0032:
        r1 = r5.wasRecUserPassporting();
        if (r1 != 0) goto L_0x00b9;
    L_0x0038:
        goto L_0x0045;
    L_0x0039:
        r1 = r4.wasRecUserPassporting;
        r3 = r5.wasRecUserPassporting();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00b9;
    L_0x0045:
        r1 = r4.isCurrentUserPassporting;
        if (r1 != 0) goto L_0x0050;
    L_0x0049:
        r1 = r5.isCurrentUserPassporting();
        if (r1 != 0) goto L_0x00b9;
    L_0x004f:
        goto L_0x005c;
    L_0x0050:
        r1 = r4.isCurrentUserPassporting;
        r3 = r5.isCurrentUserPassporting();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00b9;
    L_0x005c:
        r1 = r4.isCurrentUserBoosting;
        if (r1 != 0) goto L_0x0067;
    L_0x0060:
        r1 = r5.isCurrentUserBoosting();
        if (r1 != 0) goto L_0x00b9;
    L_0x0066:
        goto L_0x0073;
    L_0x0067:
        r1 = r4.isCurrentUserBoosting;
        r3 = r5.isCurrentUserBoosting();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00b9;
    L_0x0073:
        r1 = r4.isFastMatch;
        if (r1 != 0) goto L_0x007e;
    L_0x0077:
        r1 = r5.isFastMatch();
        if (r1 != 0) goto L_0x00b9;
    L_0x007d:
        goto L_0x008a;
    L_0x007e:
        r1 = r4.isFastMatch;
        r3 = r5.isFastMatch();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00b9;
    L_0x008a:
        r1 = r4.isTopPicks;
        if (r1 != 0) goto L_0x0095;
    L_0x008e:
        r1 = r5.isTopPicks();
        if (r1 != 0) goto L_0x00b9;
    L_0x0094:
        goto L_0x00a1;
    L_0x0095:
        r1 = r4.isTopPicks;
        r3 = r5.isTopPicks();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00b9;
    L_0x00a1:
        r1 = r4.sNumber;
        if (r1 != 0) goto L_0x00ac;
    L_0x00a5:
        r5 = r5.sNumber();
        if (r5 != 0) goto L_0x00b9;
    L_0x00ab:
        goto L_0x00ba;
    L_0x00ac:
        r1 = r4.sNumber;
        r5 = r5.sNumber();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00b9;
    L_0x00b8:
        goto L_0x00ba;
    L_0x00b9:
        r0 = 0;
    L_0x00ba:
        return r0;
    L_0x00bb:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.request.AutoValue_SuperLikeRatingRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((this.recId.hashCode() ^ 1000003) * 1000003) ^ (this.photoId == null ? 0 : this.photoId.hashCode())) * 1000003) ^ (this.wasRecUserPassporting == null ? 0 : this.wasRecUserPassporting.hashCode())) * 1000003) ^ (this.isCurrentUserPassporting == null ? 0 : this.isCurrentUserPassporting.hashCode())) * 1000003) ^ (this.isCurrentUserBoosting == null ? 0 : this.isCurrentUserBoosting.hashCode())) * 1000003) ^ (this.isFastMatch == null ? 0 : this.isFastMatch.hashCode())) * 1000003) ^ (this.isTopPicks == null ? 0 : this.isTopPicks.hashCode())) * 1000003;
        if (this.sNumber != null) {
            i = this.sNumber.hashCode();
        }
        return hashCode ^ i;
    }
}
