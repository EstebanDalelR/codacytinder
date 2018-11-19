package com.tinder.api.request;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

final class AutoValue_PassRatingRequest extends PassRatingRequest {
    private final String contentHash;
    private final Boolean didRecUserSuperlike;
    private final Boolean isCurrentUserBoosting;
    private final Boolean isFastMatch;
    private final Boolean isTopPicks;
    private final Boolean isUndo;
    private final String photoId;
    private final String recId;
    private final Long sNumber;

    static final class Builder extends com.tinder.api.request.PassRatingRequest.Builder {
        private String contentHash;
        private Boolean didRecUserSuperlike;
        private Boolean isCurrentUserBoosting;
        private Boolean isFastMatch;
        private Boolean isTopPicks;
        private Boolean isUndo;
        private String photoId;
        private String recId;
        private Long sNumber;

        Builder() {
        }

        Builder(PassRatingRequest passRatingRequest) {
            this.recId = passRatingRequest.recId();
            this.photoId = passRatingRequest.photoId();
            this.contentHash = passRatingRequest.contentHash();
            this.didRecUserSuperlike = passRatingRequest.didRecUserSuperlike();
            this.isCurrentUserBoosting = passRatingRequest.isCurrentUserBoosting();
            this.isFastMatch = passRatingRequest.isFastMatch();
            this.isTopPicks = passRatingRequest.isTopPicks();
            this.isUndo = passRatingRequest.isUndo();
            this.sNumber = passRatingRequest.sNumber();
        }

        public com.tinder.api.request.PassRatingRequest.Builder recId(String str) {
            this.recId = str;
            return this;
        }

        public com.tinder.api.request.PassRatingRequest.Builder photoId(@Nullable String str) {
            this.photoId = str;
            return this;
        }

        public com.tinder.api.request.PassRatingRequest.Builder contentHash(@Nullable String str) {
            this.contentHash = str;
            return this;
        }

        public com.tinder.api.request.PassRatingRequest.Builder didRecUserSuperlike(@Nullable Boolean bool) {
            this.didRecUserSuperlike = bool;
            return this;
        }

        public com.tinder.api.request.PassRatingRequest.Builder isCurrentUserBoosting(@Nullable Boolean bool) {
            this.isCurrentUserBoosting = bool;
            return this;
        }

        public com.tinder.api.request.PassRatingRequest.Builder isFastMatch(@Nullable Boolean bool) {
            this.isFastMatch = bool;
            return this;
        }

        public com.tinder.api.request.PassRatingRequest.Builder isTopPicks(@Nullable Boolean bool) {
            this.isTopPicks = bool;
            return this;
        }

        public com.tinder.api.request.PassRatingRequest.Builder isUndo(@Nullable Boolean bool) {
            this.isUndo = bool;
            return this;
        }

        public com.tinder.api.request.PassRatingRequest.Builder sNumber(@Nullable Long l) {
            this.sNumber = l;
            return this;
        }

        public PassRatingRequest build() {
            String str = "";
            if (this.recId == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" recId");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PassRatingRequest(this.recId, this.photoId, this.contentHash, this.didRecUserSuperlike, this.isCurrentUserBoosting, this.isFastMatch, this.isTopPicks, this.isUndo, this.sNumber);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_PassRatingRequest(String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Long l) {
        this.recId = str;
        this.photoId = str2;
        this.contentHash = str3;
        this.didRecUserSuperlike = bool;
        this.isCurrentUserBoosting = bool2;
        this.isFastMatch = bool3;
        this.isTopPicks = bool4;
        this.isUndo = bool5;
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
    public String contentHash() {
        return this.contentHash;
    }

    @Nullable
    public Boolean didRecUserSuperlike() {
        return this.didRecUserSuperlike;
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
    public Boolean isUndo() {
        return this.isUndo;
    }

    @Nullable
    public Long sNumber() {
        return this.sNumber;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PassRatingRequest{recId=");
        stringBuilder.append(this.recId);
        stringBuilder.append(", photoId=");
        stringBuilder.append(this.photoId);
        stringBuilder.append(", contentHash=");
        stringBuilder.append(this.contentHash);
        stringBuilder.append(", didRecUserSuperlike=");
        stringBuilder.append(this.didRecUserSuperlike);
        stringBuilder.append(", isCurrentUserBoosting=");
        stringBuilder.append(this.isCurrentUserBoosting);
        stringBuilder.append(", isFastMatch=");
        stringBuilder.append(this.isFastMatch);
        stringBuilder.append(", isTopPicks=");
        stringBuilder.append(this.isTopPicks);
        stringBuilder.append(", isUndo=");
        stringBuilder.append(this.isUndo);
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
        r1 = r5 instanceof com.tinder.api.request.PassRatingRequest;
        r2 = 0;
        if (r1 == 0) goto L_0x00d2;
    L_0x0009:
        r5 = (com.tinder.api.request.PassRatingRequest) r5;
        r1 = r4.recId;
        r3 = r5.recId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d0;
    L_0x0017:
        r1 = r4.photoId;
        if (r1 != 0) goto L_0x0022;
    L_0x001b:
        r1 = r5.photoId();
        if (r1 != 0) goto L_0x00d0;
    L_0x0021:
        goto L_0x002e;
    L_0x0022:
        r1 = r4.photoId;
        r3 = r5.photoId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d0;
    L_0x002e:
        r1 = r4.contentHash;
        if (r1 != 0) goto L_0x0039;
    L_0x0032:
        r1 = r5.contentHash();
        if (r1 != 0) goto L_0x00d0;
    L_0x0038:
        goto L_0x0045;
    L_0x0039:
        r1 = r4.contentHash;
        r3 = r5.contentHash();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d0;
    L_0x0045:
        r1 = r4.didRecUserSuperlike;
        if (r1 != 0) goto L_0x0050;
    L_0x0049:
        r1 = r5.didRecUserSuperlike();
        if (r1 != 0) goto L_0x00d0;
    L_0x004f:
        goto L_0x005c;
    L_0x0050:
        r1 = r4.didRecUserSuperlike;
        r3 = r5.didRecUserSuperlike();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d0;
    L_0x005c:
        r1 = r4.isCurrentUserBoosting;
        if (r1 != 0) goto L_0x0067;
    L_0x0060:
        r1 = r5.isCurrentUserBoosting();
        if (r1 != 0) goto L_0x00d0;
    L_0x0066:
        goto L_0x0073;
    L_0x0067:
        r1 = r4.isCurrentUserBoosting;
        r3 = r5.isCurrentUserBoosting();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d0;
    L_0x0073:
        r1 = r4.isFastMatch;
        if (r1 != 0) goto L_0x007e;
    L_0x0077:
        r1 = r5.isFastMatch();
        if (r1 != 0) goto L_0x00d0;
    L_0x007d:
        goto L_0x008a;
    L_0x007e:
        r1 = r4.isFastMatch;
        r3 = r5.isFastMatch();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d0;
    L_0x008a:
        r1 = r4.isTopPicks;
        if (r1 != 0) goto L_0x0095;
    L_0x008e:
        r1 = r5.isTopPicks();
        if (r1 != 0) goto L_0x00d0;
    L_0x0094:
        goto L_0x00a1;
    L_0x0095:
        r1 = r4.isTopPicks;
        r3 = r5.isTopPicks();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d0;
    L_0x00a1:
        r1 = r4.isUndo;
        if (r1 != 0) goto L_0x00ac;
    L_0x00a5:
        r1 = r5.isUndo();
        if (r1 != 0) goto L_0x00d0;
    L_0x00ab:
        goto L_0x00b8;
    L_0x00ac:
        r1 = r4.isUndo;
        r3 = r5.isUndo();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d0;
    L_0x00b8:
        r1 = r4.sNumber;
        if (r1 != 0) goto L_0x00c3;
    L_0x00bc:
        r5 = r5.sNumber();
        if (r5 != 0) goto L_0x00d0;
    L_0x00c2:
        goto L_0x00d1;
    L_0x00c3:
        r1 = r4.sNumber;
        r5 = r5.sNumber();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00d0;
    L_0x00cf:
        goto L_0x00d1;
    L_0x00d0:
        r0 = 0;
    L_0x00d1:
        return r0;
    L_0x00d2:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.request.AutoValue_PassRatingRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((this.recId.hashCode() ^ 1000003) * 1000003) ^ (this.photoId == null ? 0 : this.photoId.hashCode())) * 1000003) ^ (this.contentHash == null ? 0 : this.contentHash.hashCode())) * 1000003) ^ (this.didRecUserSuperlike == null ? 0 : this.didRecUserSuperlike.hashCode())) * 1000003) ^ (this.isCurrentUserBoosting == null ? 0 : this.isCurrentUserBoosting.hashCode())) * 1000003) ^ (this.isFastMatch == null ? 0 : this.isFastMatch.hashCode())) * 1000003) ^ (this.isTopPicks == null ? 0 : this.isTopPicks.hashCode())) * 1000003) ^ (this.isUndo == null ? 0 : this.isUndo.hashCode())) * 1000003;
        if (this.sNumber != null) {
            i = this.sNumber.hashCode();
        }
        return hashCode ^ i;
    }
}
