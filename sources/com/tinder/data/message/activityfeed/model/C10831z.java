package com.tinder.data.message.activityfeed.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.data.model.activityfeed.ActivityFeedItemUserInfoModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÂ\u0003J\t\u0010\f\u001a\u00020\u0005HÂ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ActivityFeedItemUserInfo;", "Lcom/tinder/data/model/activityfeed/ActivityFeedItemUserInfoModel;", "id", "", "activityFeedItemId", "", "userId", "(JLjava/lang/String;Ljava/lang/String;)V", "_id", "activity_feed_item_id", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "user_id", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.z */
final class C10831z implements ActivityFeedItemUserInfoModel {
    /* renamed from: a */
    private final long f35417a;
    /* renamed from: b */
    private final String f35418b;
    /* renamed from: c */
    private final String f35419c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10831z) {
            C10831z c10831z = (C10831z) obj;
            return ((this.f35417a > c10831z.f35417a ? 1 : (this.f35417a == c10831z.f35417a ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35418b, c10831z.f35418b) && C2668g.a(this.f35419c, c10831z.f35419c);
        }
    }

    public int hashCode() {
        long j = this.f35417a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f35418b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f35419c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedItemUserInfo(id=");
        stringBuilder.append(this.f35417a);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.f35418b);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.f35419c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10831z(long j, @NotNull String str, @NotNull String str2) {
        C2668g.b(str, "activityFeedItemId");
        C2668g.b(str2, ManagerWebServices.PARAM_USER_ID);
        this.f35417a = j;
        this.f35418b = str;
        this.f35419c = str2;
    }

    public long _id() {
        return this.f35417a;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35418b;
    }

    @NotNull
    public String user_id() {
        return this.f35419c;
    }
}
