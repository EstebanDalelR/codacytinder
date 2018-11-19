package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.meta.SuperLikes;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Rating */
abstract class C$AutoValue_Rating extends Rating {
    private final int likesRemaining;
    private final long rateLimitUntil;
    private final SuperLikes superLikes;

    C$AutoValue_Rating(int i, long j, @Nullable SuperLikes superLikes) {
        this.likesRemaining = i;
        this.rateLimitUntil = j;
        this.superLikes = superLikes;
    }

    @Json(name = "likes_remaining")
    public int likesRemaining() {
        return this.likesRemaining;
    }

    @Json(name = "rate_limited_until")
    public long rateLimitUntil() {
        return this.rateLimitUntil;
    }

    @Nullable
    @Json(name = "super_likes")
    public SuperLikes superLikes() {
        return this.superLikes;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rating{likesRemaining=");
        stringBuilder.append(this.likesRemaining);
        stringBuilder.append(", rateLimitUntil=");
        stringBuilder.append(this.rateLimitUntil);
        stringBuilder.append(", superLikes=");
        stringBuilder.append(this.superLikes);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Rating)) {
            return false;
        }
        Rating rating = (Rating) obj;
        if (this.likesRemaining == rating.likesRemaining() && this.rateLimitUntil == rating.rateLimitUntil()) {
            if (this.superLikes == null) {
                if (rating.superLikes() == null) {
                    return z;
                }
            } else if (this.superLikes.equals(rating.superLikes()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return (((int) (((long) ((this.likesRemaining ^ 1000003) * 1000003)) ^ ((this.rateLimitUntil >>> 32) ^ this.rateLimitUntil))) * 1000003) ^ (this.superLikes == null ? 0 : this.superLikes.hashCode());
    }
}
