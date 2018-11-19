package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.InstagramConnectModel.Select_instagram_connectModel;
import com.tinder.domain.feed.ActivityFeedPhoto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\b\u0010 \u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006!"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/InstagramConnectByActivityFeedItemId;", "Lcom/tinder/data/model/activityfeed/InstagramConnectModel$Select_instagram_connectModel;", "userNumber", "", "timetamp", "instagramUserName", "", "photos", "", "Lcom/tinder/domain/feed/ActivityFeedPhoto;", "(JJLjava/lang/String;Ljava/util/List;)V", "getInstagramUserName", "()Ljava/lang/String;", "getPhotos", "()Ljava/util/List;", "getTimetamp", "()J", "getUserNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "instagram_user_name", "timestamp", "toString", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class ai implements Select_instagram_connectModel {
    /* renamed from: a */
    private final long f35278a;
    /* renamed from: b */
    private final long f35279b;
    @NotNull
    /* renamed from: c */
    private final String f35280c;
    @Nullable
    /* renamed from: d */
    private final List<ActivityFeedPhoto> f35281d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ai) {
            ai aiVar = (ai) obj;
            if ((this.f35278a == aiVar.f35278a ? 1 : null) != null) {
                return ((this.f35279b > aiVar.f35279b ? 1 : (this.f35279b == aiVar.f35279b ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35280c, aiVar.f35280c) && C2668g.a(this.f35281d, aiVar.f35281d);
            }
        }
    }

    public int hashCode() {
        long j = this.f35278a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f35279b;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f35280c;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f35281d;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstagramConnectByActivityFeedItemId(userNumber=");
        stringBuilder.append(this.f35278a);
        stringBuilder.append(", timetamp=");
        stringBuilder.append(this.f35279b);
        stringBuilder.append(", instagramUserName=");
        stringBuilder.append(this.f35280c);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.f35281d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ai(long j, long j2, @NotNull String str, @Nullable List<ActivityFeedPhoto> list) {
        C2668g.b(str, "instagramUserName");
        this.f35278a = j;
        this.f35279b = j2;
        this.f35280c = str;
        this.f35281d = list;
    }

    public long user_number() {
        return this.f35278a;
    }

    public long timestamp() {
        return this.f35279b;
    }

    @NotNull
    public String instagram_user_name() {
        return this.f35280c;
    }

    @Nullable
    public List<ActivityFeedPhoto> photos() {
        return this.f35281d;
    }
}
