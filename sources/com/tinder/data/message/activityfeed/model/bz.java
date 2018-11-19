package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel.Select_profile_spotify_top_artistModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ProfileSpotifyTopArtistByActivityFeedItemId;", "Lcom/tinder/data/model/activityfeed/ProfileSpotifyTopArtistModel$Select_profile_spotify_top_artistModel;", "userNumber", "", "timestamp", "(JJ)V", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class bz implements Select_profile_spotify_top_artistModel {
    /* renamed from: a */
    private final long f35372a;
    /* renamed from: b */
    private final long f35373b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bz) {
            bz bzVar = (bz) obj;
            if ((this.f35372a == bzVar.f35372a ? 1 : null) != null) {
                if ((this.f35373b == bzVar.f35373b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f35372a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f35373b;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileSpotifyTopArtistByActivityFeedItemId(userNumber=");
        stringBuilder.append(this.f35372a);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35373b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public bz(long j, long j2) {
        this.f35372a = j;
        this.f35373b = j2;
    }

    public long user_number() {
        return this.f35372a;
    }

    public long timestamp() {
        return this.f35373b;
    }
}
