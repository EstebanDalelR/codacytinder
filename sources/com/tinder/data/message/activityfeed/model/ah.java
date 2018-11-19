package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.InstagramConnectModel;
import com.tinder.domain.feed.ActivityFeedPhoto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\b\u0010%\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\b\u0010'\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006("}, d2 = {"Lcom/tinder/data/message/activityfeed/model/InstagramConnect;", "Lcom/tinder/data/model/activityfeed/InstagramConnectModel;", "id", "", "activityFeedItemId", "", "userNumber", "timestamp", "instagramUserName", "photos", "", "Lcom/tinder/domain/feed/ActivityFeedPhoto;", "(JLjava/lang/String;JJLjava/lang/String;Ljava/util/List;)V", "getActivityFeedItemId", "()Ljava/lang/String;", "getId", "()J", "getInstagramUserName", "getPhotos", "()Ljava/util/List;", "getTimestamp", "getUserNumber", "_id", "activity_feed_item_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "instagram_user_name", "toString", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class ah implements InstagramConnectModel {
    /* renamed from: a */
    private final long f35272a;
    @NotNull
    /* renamed from: b */
    private final String f35273b;
    /* renamed from: c */
    private final long f35274c;
    /* renamed from: d */
    private final long f35275d;
    @NotNull
    /* renamed from: e */
    private final String f35276e;
    @Nullable
    /* renamed from: f */
    private final List<ActivityFeedPhoto> f35277f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ah) {
            ah ahVar = (ah) obj;
            if ((this.f35272a == ahVar.f35272a ? 1 : null) != null && C2668g.a(this.f35273b, ahVar.f35273b)) {
                if ((this.f35274c == ahVar.f35274c ? 1 : null) != null) {
                    return ((this.f35275d > ahVar.f35275d ? 1 : (this.f35275d == ahVar.f35275d ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35276e, ahVar.f35276e) && C2668g.a(this.f35277f, ahVar.f35277f);
                }
            }
        }
    }

    public int hashCode() {
        long j = this.f35272a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f35273b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.f35274c;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f35275d;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        str = this.f35276e;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f35277f;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstagramConnect(id=");
        stringBuilder.append(this.f35272a);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.f35273b);
        stringBuilder.append(", userNumber=");
        stringBuilder.append(this.f35274c);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35275d);
        stringBuilder.append(", instagramUserName=");
        stringBuilder.append(this.f35276e);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.f35277f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ah(long j, @NotNull String str, long j2, long j3, @NotNull String str2, @Nullable List<ActivityFeedPhoto> list) {
        C2668g.b(str, "activityFeedItemId");
        C2668g.b(str2, "instagramUserName");
        this.f35272a = j;
        this.f35273b = str;
        this.f35274c = j2;
        this.f35275d = j3;
        this.f35276e = str2;
        this.f35277f = list;
    }

    public long _id() {
        return this.f35272a;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35273b;
    }

    public long user_number() {
        return this.f35274c;
    }

    public long timestamp() {
        return this.f35275d;
    }

    @NotNull
    public String instagram_user_name() {
        return this.f35276e;
    }

    @Nullable
    public List<ActivityFeedPhoto> photos() {
        return this.f35277f;
    }
}
