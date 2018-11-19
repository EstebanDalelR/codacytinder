package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tinder/api/model/profile/Likes;", "", "remainingLikesPercent", "", "rateLimitUntilInMillis", "", "(Ljava/lang/Integer;Ljava/lang/Long;)V", "getRateLimitUntilInMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRemainingLikesPercent", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;)Lcom/tinder/api/model/profile/Likes;", "equals", "", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class Likes {
    @Nullable
    private final Long rateLimitUntilInMillis;
    @Nullable
    private final Integer remainingLikesPercent;

    @NotNull
    public static /* synthetic */ Likes copy$default(Likes likes, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            num = likes.remainingLikesPercent;
        }
        if ((i & 2) != 0) {
            l = likes.rateLimitUntilInMillis;
        }
        return likes.copy(num, l);
    }

    @Nullable
    public final Integer component1() {
        return this.remainingLikesPercent;
    }

    @Nullable
    public final Long component2() {
        return this.rateLimitUntilInMillis;
    }

    @NotNull
    public final Likes copy(@Nullable @Json(name = "likes_remaining") Integer num, @Nullable @Json(name = "rate_limited_until") Long l) {
        return new Likes(num, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Likes) {
                Likes likes = (Likes) obj;
                if (C2668g.a(this.remainingLikesPercent, likes.remainingLikesPercent) && C2668g.a(this.rateLimitUntilInMillis, likes.rateLimitUntilInMillis)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.remainingLikesPercent;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Long l = this.rateLimitUntilInMillis;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Likes(remainingLikesPercent=");
        stringBuilder.append(this.remainingLikesPercent);
        stringBuilder.append(", rateLimitUntilInMillis=");
        stringBuilder.append(this.rateLimitUntilInMillis);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Likes(@Nullable @Json(name = "likes_remaining") Integer num, @Nullable @Json(name = "rate_limited_until") Long l) {
        this.remainingLikesPercent = num;
        this.rateLimitUntilInMillis = l;
    }

    @Nullable
    public final Integer getRemainingLikesPercent() {
        return this.remainingLikesPercent;
    }

    @Nullable
    public final Long getRateLimitUntilInMillis() {
        return this.rateLimitUntilInMillis;
    }
}
