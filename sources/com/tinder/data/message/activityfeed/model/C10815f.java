package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel;
import com.tinder.domain.feed.ActivityFeedImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ActivityFeedAlbum;", "Lcom/tinder/data/model/activityfeed/ActivityFeedAlbumModel;", "activityFeedItemId", "", "activityFeedSongId", "name", "images", "", "Lcom/tinder/domain/feed/ActivityFeedImage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getActivityFeedItemId", "()Ljava/lang/String;", "getActivityFeedSongId", "getImages", "()Ljava/util/List;", "getName", "activity_feed_item_id", "activity_feed_song_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.f */
final class C10815f implements ActivityFeedAlbumModel {
    @NotNull
    /* renamed from: a */
    private final String f35378a;
    @NotNull
    /* renamed from: b */
    private final String f35379b;
    @NotNull
    /* renamed from: c */
    private final String f35380c;
    @Nullable
    /* renamed from: d */
    private final List<ActivityFeedImage> f35381d;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10815f) {
                C10815f c10815f = (C10815f) obj;
                if (C2668g.a(this.f35378a, c10815f.f35378a) && C2668g.a(this.f35379b, c10815f.f35379b) && C2668g.a(this.f35380c, c10815f.f35380c) && C2668g.a(this.f35381d, c10815f.f35381d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f35378a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35379b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f35380c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.f35381d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedAlbum(activityFeedItemId=");
        stringBuilder.append(this.f35378a);
        stringBuilder.append(", activityFeedSongId=");
        stringBuilder.append(this.f35379b);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f35380c);
        stringBuilder.append(", images=");
        stringBuilder.append(this.f35381d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10815f(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable List<ActivityFeedImage> list) {
        C2668g.b(str, "activityFeedItemId");
        C2668g.b(str2, "activityFeedSongId");
        C2668g.b(str3, "name");
        this.f35378a = str;
        this.f35379b = str2;
        this.f35380c = str3;
        this.f35381d = list;
    }

    @NotNull
    public String activity_feed_item_id() {
        return this.f35378a;
    }

    @NotNull
    public String activity_feed_song_id() {
        return this.f35379b;
    }

    @NotNull
    public String name() {
        return this.f35380c;
    }

    @Nullable
    public List<ActivityFeedImage> images() {
        return this.f35381d;
    }
}
