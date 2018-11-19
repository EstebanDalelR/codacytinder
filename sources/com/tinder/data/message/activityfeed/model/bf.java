package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ProfileChangeAnthemModel.Select_profile_change_anthemModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ProfileChangeAnthemByActivityFeedItemId;", "Lcom/tinder/data/model/activityfeed/ProfileChangeAnthemModel$Select_profile_change_anthemModel;", "userNumber", "", "timestamp", "(JJ)V", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class bf implements Select_profile_change_anthemModel {
    /* renamed from: a */
    private final long f35332a;
    /* renamed from: b */
    private final long f35333b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bf) {
            bf bfVar = (bf) obj;
            if ((this.f35332a == bfVar.f35332a ? 1 : null) != null) {
                if ((this.f35333b == bfVar.f35333b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f35332a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f35333b;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileChangeAnthemByActivityFeedItemId(userNumber=");
        stringBuilder.append(this.f35332a);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35333b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public bf(long j, long j2) {
        this.f35332a = j;
        this.f35333b = j2;
    }

    public long user_number() {
        return this.f35332a;
    }

    public long timestamp() {
        return this.f35333b;
    }
}
