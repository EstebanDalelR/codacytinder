package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.InstagramNewMediaModel;
import com.tinder.domain.feed.InstagramMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÂ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÂ\u0003Jk\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\b\u0010&\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/InstagramNewMedia;", "Lcom/tinder/data/model/activityfeed/InstagramNewMediaModel;", "id", "", "activityFeedItemId", "", "instagramMediaId", "instagramUserName", "userNumber", "instagramUserId", "timestamp", "caption", "media", "", "Lcom/tinder/domain/feed/InstagramMedia;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/util/List;)V", "_id", "activity_feed_item_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "instagram_media_id", "instagram_user_id", "instagram_user_name", "toString", "user_number", "data_release"}, k = 1, mv = {1, 1, 10})
final class am implements InstagramNewMediaModel {
    /* renamed from: a */
    private final long f35284a;
    /* renamed from: b */
    private final String f35285b;
    /* renamed from: c */
    private final String f35286c;
    /* renamed from: d */
    private final String f35287d;
    /* renamed from: e */
    private final long f35288e;
    /* renamed from: f */
    private final long f35289f;
    /* renamed from: g */
    private final long f35290g;
    /* renamed from: h */
    private final String f35291h;
    /* renamed from: i */
    private final List<InstagramMedia> f35292i;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof am) {
            am amVar = (am) obj;
            if ((this.f35284a == amVar.f35284a ? 1 : null) != null && C2668g.a(this.f35285b, amVar.f35285b) && C2668g.a(this.f35286c, amVar.f35286c) && C2668g.a(this.f35287d, amVar.f35287d)) {
                if ((this.f35288e == amVar.f35288e ? 1 : null) != null) {
                    if ((this.f35289f == amVar.f35289f ? 1 : null) != null) {
                        return ((this.f35290g > amVar.f35290g ? 1 : (this.f35290g == amVar.f35290g ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.f35291h, amVar.f35291h) && C2668g.a(this.f35292i, amVar.f35292i);
                    }
                }
            }
        }
    }

    public int hashCode() {
        long j = this.f35284a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f35285b;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f35286c;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f35287d;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.f35288e;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f35289f;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        j2 = this.f35290g;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        str = this.f35291h;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f35292i;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstagramNewMedia(id=");
        stringBuilder.append(this.f35284a);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.f35285b);
        stringBuilder.append(", instagramMediaId=");
        stringBuilder.append(this.f35286c);
        stringBuilder.append(", instagramUserName=");
        stringBuilder.append(this.f35287d);
        stringBuilder.append(", userNumber=");
        stringBuilder.append(this.f35288e);
        stringBuilder.append(", instagramUserId=");
        stringBuilder.append(this.f35289f);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.f35290g);
        stringBuilder.append(", caption=");
        stringBuilder.append(this.f35291h);
        stringBuilder.append(", media=");
        stringBuilder.append(this.f35292i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public am(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, long j2, long j3, long j4, @NotNull String str4, @Nullable List<InstagramMedia> list) {
        C2668g.b(str, "activityFeedItemId");
        C2668g.b(str2, "instagramMediaId");
        C2668g.b(str3, "instagramUserName");
        C2668g.b(str4, "caption");
        this.f35284a = j;
        this.f35285b = str;
        this.f35286c = str2;
        this.f35287d = str3;
        this.f35288e = j2;
        this.f35289f = j3;
        this.f35290g = j4;
        this.f35291h = str4;
        this.f35292i = list;
    }

    public long _id() {
        return this.f35284a;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35285b;
    }

    @NotNull
    public String instagram_media_id() {
        return this.f35286c;
    }

    @NotNull
    public String instagram_user_name() {
        return this.f35287d;
    }

    public long user_number() {
        return this.f35288e;
    }

    public long instagram_user_id() {
        return this.f35289f;
    }

    public long timestamp() {
        return this.f35290g;
    }

    @NotNull
    public String caption() {
        return this.f35291h;
    }

    @Nullable
    public List<InstagramMedia> media() {
        return this.f35292i;
    }
}
