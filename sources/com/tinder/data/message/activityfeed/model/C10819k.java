package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ActivityFeedArtistModel;
import com.tinder.domain.feed.ActivityFeedImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006!"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ActivityFeedArtist;", "Lcom/tinder/data/model/activityfeed/ActivityFeedArtistModel;", "id", "", "activityFeedItemId", "activityFeedSongId", "name", "images", "", "Lcom/tinder/domain/feed/ActivityFeedImage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getActivityFeedItemId", "()Ljava/lang/String;", "getActivityFeedSongId", "getId", "getImages", "()Ljava/util/List;", "getName", "activity_feed_item_id", "activity_feed_song_id", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.k */
final class C10819k implements ActivityFeedArtistModel {
    @NotNull
    /* renamed from: a */
    private final String f35386a;
    @NotNull
    /* renamed from: b */
    private final String f35387b;
    @NotNull
    /* renamed from: c */
    private final String f35388c;
    @NotNull
    /* renamed from: d */
    private final String f35389d;
    @Nullable
    /* renamed from: e */
    private final List<ActivityFeedImage> f35390e;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10819k) {
                C10819k c10819k = (C10819k) obj;
                if (C2668g.a(this.f35386a, c10819k.f35386a) && C2668g.a(this.f35387b, c10819k.f35387b) && C2668g.a(this.f35388c, c10819k.f35388c) && C2668g.a(this.f35389d, c10819k.f35389d) && C2668g.a(this.f35390e, c10819k.f35390e)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f35386a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35387b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f35388c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f35389d;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.f35390e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedArtist(id=");
        stringBuilder.append(this.f35386a);
        stringBuilder.append(", activityFeedItemId=");
        stringBuilder.append(this.f35387b);
        stringBuilder.append(", activityFeedSongId=");
        stringBuilder.append(this.f35388c);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f35389d);
        stringBuilder.append(", images=");
        stringBuilder.append(this.f35390e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10819k(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable List<ActivityFeedImage> list) {
        C2668g.b(str, "id");
        C2668g.b(str2, "activityFeedItemId");
        C2668g.b(str3, "activityFeedSongId");
        C2668g.b(str4, "name");
        this.f35386a = str;
        this.f35387b = str2;
        this.f35388c = str3;
        this.f35389d = str4;
        this.f35390e = list;
    }

    @NotNull
    public String id() {
        return this.f35386a;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35387b;
    }

    @NotNull
    public String activity_feed_song_id() {
        return this.f35388c;
    }

    @NotNull
    public String name() {
        return this.f35389d;
    }

    @Nullable
    public List<ActivityFeedImage> images() {
        return this.f35390e;
    }
}
