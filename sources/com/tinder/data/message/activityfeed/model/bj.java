package com.tinder.data.message.activityfeed.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.data.model.activityfeed.ProfileChangeBioModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\b\u0010$\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006%"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ProfileChangeBio;", "Lcom/tinder/data/model/activityfeed/ProfileChangeBioModel;", "id", "", "activityFeedItemId", "", "userNumber", "timestamp", "bio", "oldBio", "(JLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V", "getActivityFeedItemId", "()Ljava/lang/String;", "getBio", "getId", "()J", "getOldBio", "getTimestamp", "getUserNumber", "_id", "activity_feed_item_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "old_bio", "toString", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class bj implements ProfileChangeBioModel {
    /* renamed from: a */
    private final long f35336a;
    @NotNull
    /* renamed from: b */
    private final String f35337b;
    /* renamed from: c */
    private final long f35338c;
    /* renamed from: d */
    private final long f35339d;
    @NotNull
    /* renamed from: e */
    private final String f35340e;
    @NotNull
    /* renamed from: f */
    private final String f35341f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bj) {
            bj bjVar = (bj) obj;
            if ((this.f35336a == bjVar.f35336a ? 1 : null) != null && C2668g.a(this.f35337b, bjVar.f35337b)) {
                if ((this.f35338c == bjVar.f35338c ? 1 : null) != null) {
                    return ((this.f35339d > bjVar.f35339d ? 1 : (this.f35339d == bjVar.f35339d ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35340e, bjVar.f35340e) && C2668g.a(this.f35341f, bjVar.f35341f);
                }
            }
        }
    }

    public int hashCode() {
        long j = this.f35336a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f35337b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.f35338c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f35339d;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        str = this.f35340e;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f35341f;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileChangeBio(id=");
        stringBuilder.append(this.f35336a);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.f35337b);
        stringBuilder.append(", userNumber=");
        stringBuilder.append(this.f35338c);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35339d);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.f35340e);
        stringBuilder.append(", oldBio=");
        stringBuilder.append(this.f35341f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public bj(long j, @NotNull String str, long j2, long j3, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "activityFeedItemId");
        C2668g.b(str2, ManagerWebServices.PARAM_BIO);
        C2668g.b(str3, "oldBio");
        this.f35336a = j;
        this.f35337b = str;
        this.f35338c = j2;
        this.f35339d = j3;
        this.f35340e = str2;
        this.f35341f = str3;
    }

    public long _id() {
        return this.f35336a;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35337b;
    }

    public long user_number() {
        return this.f35338c;
    }

    public long timestamp() {
        return this.f35339d;
    }

    @NotNull
    public String bio() {
        return this.f35340e;
    }

    @NotNull
    public String old_bio() {
        return this.f35341f;
    }
}
