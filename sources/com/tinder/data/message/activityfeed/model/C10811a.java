package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ActivityEventNewMatchModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\t\u0010\r\u001a\u00020\u0005HÂ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J;\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ActivityEventNewMatch;", "Lcom/tinder/data/model/activityfeed/ActivityEventNewMatchModel;", "id", "", "activityFeedItemId", "", "userNumber", "otherUserNumber", "timestamp", "(JLjava/lang/String;JJJ)V", "_id", "activity_feed_item_id", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "other_user_number", "toString", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.a */
final class C10811a implements ActivityEventNewMatchModel {
    /* renamed from: a */
    private final long f35257a;
    /* renamed from: b */
    private final String f35258b;
    /* renamed from: c */
    private final long f35259c;
    /* renamed from: d */
    private final long f35260d;
    /* renamed from: e */
    private final long f35261e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10811a) {
            C10811a c10811a = (C10811a) obj;
            if ((this.f35257a == c10811a.f35257a ? 1 : null) != null && C2668g.a(this.f35258b, c10811a.f35258b)) {
                if ((this.f35259c == c10811a.f35259c ? 1 : null) != null) {
                    if ((this.f35260d == c10811a.f35260d ? 1 : null) != null) {
                        if ((this.f35261e == c10811a.f35261e ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f35257a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f35258b;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.f35259c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f35260d;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f35261e;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityEventNewMatch(id=");
        stringBuilder.append(this.f35257a);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.f35258b);
        stringBuilder.append(", userNumber=");
        stringBuilder.append(this.f35259c);
        stringBuilder.append(", otherUserNumber=");
        stringBuilder.append(this.f35260d);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35261e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10811a(long j, @NotNull String str, long j2, long j3, long j4) {
        C2668g.b(str, "activityFeedItemId");
        this.f35257a = j;
        this.f35258b = str;
        this.f35259c = j2;
        this.f35260d = j3;
        this.f35261e = j4;
    }

    public long _id() {
        return this.f35257a;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35258b;
    }

    public long user_number() {
        return this.f35259c;
    }

    public long other_user_number() {
        return this.f35260d;
    }

    public long timestamp() {
        return this.f35261e;
    }
}
