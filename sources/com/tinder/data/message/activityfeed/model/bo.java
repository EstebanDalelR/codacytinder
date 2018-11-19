package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ProfileChangeSchoolModel;
import com.tinder.domain.feed.ActivityFeedSchool;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\b\u0010#\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006$"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ProfileChangeSchool;", "Lcom/tinder/data/model/activityfeed/ProfileChangeSchoolModel;", "id", "", "activityFeedItemId", "", "userNumber", "timestamp", "schools", "", "Lcom/tinder/domain/feed/ActivityFeedSchool;", "(JLjava/lang/String;JJLjava/util/List;)V", "getActivityFeedItemId", "()Ljava/lang/String;", "getId", "()J", "getSchools", "()Ljava/util/List;", "getTimestamp", "getUserNumber", "_id", "activity_feed_item_id", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class bo implements ProfileChangeSchoolModel {
    /* renamed from: a */
    private final long f35348a;
    @NotNull
    /* renamed from: b */
    private final String f35349b;
    /* renamed from: c */
    private final long f35350c;
    /* renamed from: d */
    private final long f35351d;
    @Nullable
    /* renamed from: e */
    private final List<ActivityFeedSchool> f35352e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bo) {
            bo boVar = (bo) obj;
            if ((this.f35348a == boVar.f35348a ? 1 : null) != null && C2668g.a(this.f35349b, boVar.f35349b)) {
                if ((this.f35350c == boVar.f35350c ? 1 : null) != null) {
                    return ((this.f35351d > boVar.f35351d ? 1 : (this.f35351d == boVar.f35351d ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35352e, boVar.f35352e);
                }
            }
        }
    }

    public int hashCode() {
        long j = this.f35348a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f35349b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.f35350c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f35351d;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List list = this.f35352e;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileChangeSchool(id=");
        stringBuilder.append(this.f35348a);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.f35349b);
        stringBuilder.append(", userNumber=");
        stringBuilder.append(this.f35350c);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35351d);
        stringBuilder.append(", schools=");
        stringBuilder.append(this.f35352e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public bo(long j, @NotNull String str, long j2, long j3, @Nullable List<ActivityFeedSchool> list) {
        C2668g.b(str, "activityFeedItemId");
        this.f35348a = j;
        this.f35349b = str;
        this.f35350c = j2;
        this.f35351d = j3;
        this.f35352e = list;
    }

    public long _id() {
        return this.f35348a;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35349b;
    }

    public long user_number() {
        return this.f35350c;
    }

    public long timestamp() {
        return this.f35351d;
    }

    @Nullable
    public List<ActivityFeedSchool> schools() {
        return this.f35352e;
    }
}
