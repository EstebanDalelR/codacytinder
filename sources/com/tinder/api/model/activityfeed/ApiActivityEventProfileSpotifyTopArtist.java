package com.tinder.api.model.activityfeed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J8\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileSpotifyTopArtist;", "", "userNumber", "", "timestamp", "artists", "", "Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyArtist;", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V", "getArtists", "()Ljava/util/List;", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserNumber", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileSpotifyTopArtist;", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityEventProfileSpotifyTopArtist {
    @Nullable
    private final List<ApiActivityEventSpotifyArtist> artists;
    @Nullable
    private final Long timestamp;
    @Nullable
    private final Long userNumber;

    @NotNull
    public static /* synthetic */ ApiActivityEventProfileSpotifyTopArtist copy$default(ApiActivityEventProfileSpotifyTopArtist apiActivityEventProfileSpotifyTopArtist, Long l, Long l2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = apiActivityEventProfileSpotifyTopArtist.userNumber;
        }
        if ((i & 2) != 0) {
            l2 = apiActivityEventProfileSpotifyTopArtist.timestamp;
        }
        if ((i & 4) != 0) {
            list = apiActivityEventProfileSpotifyTopArtist.artists;
        }
        return apiActivityEventProfileSpotifyTopArtist.copy(l, l2, list);
    }

    @Nullable
    public final Long component1() {
        return this.userNumber;
    }

    @Nullable
    public final Long component2() {
        return this.timestamp;
    }

    @Nullable
    public final List<ApiActivityEventSpotifyArtist> component3() {
        return this.artists;
    }

    @NotNull
    public final ApiActivityEventProfileSpotifyTopArtist copy(@Nullable Long l, @Nullable Long l2, @Nullable List<ApiActivityEventSpotifyArtist> list) {
        return new ApiActivityEventProfileSpotifyTopArtist(l, l2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityEventProfileSpotifyTopArtist) {
                ApiActivityEventProfileSpotifyTopArtist apiActivityEventProfileSpotifyTopArtist = (ApiActivityEventProfileSpotifyTopArtist) obj;
                if (C2668g.a(this.userNumber, apiActivityEventProfileSpotifyTopArtist.userNumber) && C2668g.a(this.timestamp, apiActivityEventProfileSpotifyTopArtist.timestamp) && C2668g.a(this.artists, apiActivityEventProfileSpotifyTopArtist.artists)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Long l = this.userNumber;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.timestamp;
        hashCode = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        List list = this.artists;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityEventProfileSpotifyTopArtist(userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", artists=");
        stringBuilder.append(this.artists);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityEventProfileSpotifyTopArtist(@Nullable Long l, @Nullable Long l2, @Nullable List<ApiActivityEventSpotifyArtist> list) {
        this.userNumber = l;
        this.timestamp = l2;
        this.artists = list;
    }

    @Nullable
    public final Long getUserNumber() {
        return this.userNumber;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final List<ApiActivityEventSpotifyArtist> getArtists() {
        return this.artists;
    }
}
