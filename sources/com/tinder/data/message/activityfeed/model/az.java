package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ProfileAddPhotoModel;
import com.tinder.domain.feed.ActivityFeedPhoto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\b\u0010#\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006$"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ProfileAddPhoto;", "Lcom/tinder/data/model/activityfeed/ProfileAddPhotoModel;", "id", "", "activityFeedItemId", "", "userNumber", "timestamp", "photos", "", "Lcom/tinder/domain/feed/ActivityFeedPhoto;", "(JLjava/lang/String;JJLjava/util/List;)V", "getActivityFeedItemId", "()Ljava/lang/String;", "getId", "()J", "getPhotos", "()Ljava/util/List;", "getTimestamp", "getUserNumber", "_id", "activity_feed_item_id", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class az implements ProfileAddPhotoModel {
    /* renamed from: a */
    private final long f35315a;
    @NotNull
    /* renamed from: b */
    private final String f35316b;
    /* renamed from: c */
    private final long f35317c;
    /* renamed from: d */
    private final long f35318d;
    @Nullable
    /* renamed from: e */
    private final List<ActivityFeedPhoto> f35319e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof az) {
            az azVar = (az) obj;
            if ((this.f35315a == azVar.f35315a ? 1 : null) != null && C2668g.a(this.f35316b, azVar.f35316b)) {
                if ((this.f35317c == azVar.f35317c ? 1 : null) != null) {
                    return ((this.f35318d > azVar.f35318d ? 1 : (this.f35318d == azVar.f35318d ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35319e, azVar.f35319e);
                }
            }
        }
    }

    public int hashCode() {
        long j = this.f35315a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f35316b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.f35317c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f35318d;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List list = this.f35319e;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileAddPhoto(id=");
        stringBuilder.append(this.f35315a);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.f35316b);
        stringBuilder.append(", userNumber=");
        stringBuilder.append(this.f35317c);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35318d);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.f35319e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public az(long j, @NotNull String str, long j2, long j3, @Nullable List<ActivityFeedPhoto> list) {
        C2668g.b(str, "activityFeedItemId");
        this.f35315a = j;
        this.f35316b = str;
        this.f35317c = j2;
        this.f35318d = j3;
        this.f35319e = list;
    }

    public long _id() {
        return this.f35315a;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35316b;
    }

    public long user_number() {
        return this.f35317c;
    }

    public long timestamp() {
        return this.f35318d;
    }

    @Nullable
    public List<ActivityFeedPhoto> photos() {
        return this.f35319e;
    }
}
