package com.tinder.api.response;

import com.squareup.moshi.Json;
import com.tinder.api.model.meta.SuperLikes;

/* renamed from: com.tinder.api.response.$AutoValue_SuperlikeStatusInfoResponse */
abstract class C$AutoValue_SuperlikeStatusInfoResponse extends SuperlikeStatusInfoResponse {
    private final SuperLikes superLikeInfo;

    C$AutoValue_SuperlikeStatusInfoResponse(SuperLikes superLikes) {
        if (superLikes == null) {
            throw new NullPointerException("Null superLikeInfo");
        }
        this.superLikeInfo = superLikes;
    }

    @Json(name = "results")
    public SuperLikes superLikeInfo() {
        return this.superLikeInfo;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SuperlikeStatusInfoResponse{superLikeInfo=");
        stringBuilder.append(this.superLikeInfo);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuperlikeStatusInfoResponse)) {
            return null;
        }
        return this.superLikeInfo.equals(((SuperlikeStatusInfoResponse) obj).superLikeInfo());
    }

    public int hashCode() {
        return this.superLikeInfo.hashCode() ^ 1000003;
    }
}
