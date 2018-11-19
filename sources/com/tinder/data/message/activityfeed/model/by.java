package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ProfileSpotifyTopArtistModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ProfileSpotifyTopArtist;", "Lcom/tinder/data/model/activityfeed/ProfileSpotifyTopArtistModel;", "id", "", "activityFeedItemId", "", "userNumber", "timestamp", "(JLjava/lang/String;JJ)V", "getActivityFeedItemId", "()Ljava/lang/String;", "getId", "()J", "getTimestamp", "getUserNumber", "_id", "activity_feed_item_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class by implements ProfileSpotifyTopArtistModel {
    /* renamed from: a */
    private final long f35368a;
    @NotNull
    /* renamed from: b */
    private final String f35369b;
    /* renamed from: c */
    private final long f35370c;
    /* renamed from: d */
    private final long f35371d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof by) {
            by byVar = (by) obj;
            if ((this.f35368a == byVar.f35368a ? 1 : null) != null && C2668g.a(this.f35369b, byVar.f35369b)) {
                if ((this.f35370c == byVar.f35370c ? 1 : null) != null) {
                    if ((this.f35371d == byVar.f35371d ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f35368a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f35369b;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.f35370c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f35371d;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileSpotifyTopArtist(id=");
        stringBuilder.append(this.f35368a);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.f35369b);
        stringBuilder.append(", userNumber=");
        stringBuilder.append(this.f35370c);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35371d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public by(long j, @NotNull String str, long j2, long j3) {
        C2668g.b(str, "activityFeedItemId");
        this.f35368a = j;
        this.f35369b = str;
        this.f35370c = j2;
        this.f35371d = j3;
    }

    public long _id() {
        return this.f35368a;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35369b;
    }

    public long user_number() {
        return this.f35370c;
    }

    public long timestamp() {
        return this.f35371d;
    }
}
