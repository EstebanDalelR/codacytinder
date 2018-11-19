package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ProfileChangeSchoolModel.Select_profile_change_schoolModel;
import com.tinder.domain.feed.ActivityFeedSchool;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0010\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ProfileChangeSchoolByActivityFeedItemId;", "Lcom/tinder/data/model/activityfeed/ProfileChangeSchoolModel$Select_profile_change_schoolModel;", "userNumber", "", "timestamp", "schools", "", "Lcom/tinder/domain/feed/ActivityFeedSchool;", "(JJLjava/util/List;)V", "getSchools", "()Ljava/util/List;", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class bp implements Select_profile_change_schoolModel {
    /* renamed from: a */
    private final long f35353a;
    /* renamed from: b */
    private final long f35354b;
    @Nullable
    /* renamed from: c */
    private final List<ActivityFeedSchool> f35355c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bp) {
            bp bpVar = (bp) obj;
            if ((this.f35353a == bpVar.f35353a ? 1 : null) != null) {
                return ((this.f35354b > bpVar.f35354b ? 1 : (this.f35354b == bpVar.f35354b ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35355c, bpVar.f35355c);
            }
        }
    }

    public int hashCode() {
        long j = this.f35353a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f35354b;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List list = this.f35355c;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileChangeSchoolByActivityFeedItemId(userNumber=");
        stringBuilder.append(this.f35353a);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35354b);
        stringBuilder.append(", schools=");
        stringBuilder.append(this.f35355c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public bp(long j, long j2, @Nullable List<ActivityFeedSchool> list) {
        this.f35353a = j;
        this.f35354b = j2;
        this.f35355c = list;
    }

    public long user_number() {
        return this.f35353a;
    }

    public long timestamp() {
        return this.f35354b;
    }

    @Nullable
    public List<ActivityFeedSchool> schools() {
        return this.f35355c;
    }
}
