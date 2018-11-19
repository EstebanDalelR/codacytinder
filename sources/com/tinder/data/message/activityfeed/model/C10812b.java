package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel.Select_activity_event_new_matchModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ActivityEventNewMatchByActivityFeedItemId;", "Lcom/tinder/data/model/activityfeed/ActivityEventNewMatchModel$Select_activity_event_new_matchModel;", "userNumber", "", "otherUserNumber", "timestamp", "(JJJ)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "other_user_number", "toString", "", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.b */
final class C10812b implements Select_activity_event_new_matchModel {
    /* renamed from: a */
    private final long f35320a;
    /* renamed from: b */
    private final long f35321b;
    /* renamed from: c */
    private final long f35322c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10812b) {
            C10812b c10812b = (C10812b) obj;
            if ((this.f35320a == c10812b.f35320a ? 1 : null) != null) {
                if ((this.f35321b == c10812b.f35321b ? 1 : null) != null) {
                    if ((this.f35322c == c10812b.f35322c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f35320a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f35321b;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f35322c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityEventNewMatchByActivityFeedItemId(userNumber=");
        stringBuilder.append(this.f35320a);
        stringBuilder.append(", otherUserNumber=");
        stringBuilder.append(this.f35321b);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35322c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10812b(long j, long j2, long j3) {
        this.f35320a = j;
        this.f35321b = j2;
        this.f35322c = j3;
    }

    public long user_number() {
        return this.f35320a;
    }

    public long other_user_number() {
        return this.f35321b;
    }

    public long timestamp() {
        return this.f35322c;
    }
}
