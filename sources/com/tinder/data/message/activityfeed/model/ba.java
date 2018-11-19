package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ProfileAddPhotoModel.Select_profile_add_photoModel;
import com.tinder.domain.feed.ActivityFeedPhoto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0010\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ProfileAddPhotoByActivityFeedItemId;", "Lcom/tinder/data/model/activityfeed/ProfileAddPhotoModel$Select_profile_add_photoModel;", "userNumber", "", "timestamp", "photos", "", "Lcom/tinder/domain/feed/ActivityFeedPhoto;", "(JJLjava/util/List;)V", "getPhotos", "()Ljava/util/List;", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class ba implements Select_profile_add_photoModel {
    /* renamed from: a */
    private final long f35323a;
    /* renamed from: b */
    private final long f35324b;
    @Nullable
    /* renamed from: c */
    private final List<ActivityFeedPhoto> f35325c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ba) {
            ba baVar = (ba) obj;
            if ((this.f35323a == baVar.f35323a ? 1 : null) != null) {
                return ((this.f35324b > baVar.f35324b ? 1 : (this.f35324b == baVar.f35324b ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35325c, baVar.f35325c);
            }
        }
    }

    public int hashCode() {
        long j = this.f35323a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f35324b;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List list = this.f35325c;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileAddPhotoByActivityFeedItemId(userNumber=");
        stringBuilder.append(this.f35323a);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35324b);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.f35325c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ba(long j, long j2, @Nullable List<ActivityFeedPhoto> list) {
        this.f35323a = j;
        this.f35324b = j2;
        this.f35325c = list;
    }

    public long user_number() {
        return this.f35323a;
    }

    public long timestamp() {
        return this.f35324b;
    }

    @Nullable
    public List<ActivityFeedPhoto> photos() {
        return this.f35325c;
    }
}
