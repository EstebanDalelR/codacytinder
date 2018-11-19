package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ActivityFeedAlbumModel.Select_activity_feed_albumModel;
import com.tinder.domain.feed.ActivityFeedImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ActivityFeedAlbumByActivityFeedItemIdAndSongId;", "Lcom/tinder/data/model/activityfeed/ActivityFeedAlbumModel$Select_activity_feed_albumModel;", "name", "", "images", "", "Lcom/tinder/domain/feed/ActivityFeedImage;", "(Ljava/lang/String;Ljava/util/List;)V", "getImages", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.g */
final class C10816g implements Select_activity_feed_albumModel {
    @NotNull
    /* renamed from: a */
    private final String f35382a;
    @Nullable
    /* renamed from: b */
    private final List<ActivityFeedImage> f35383b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10816g) {
                C10816g c10816g = (C10816g) obj;
                if (C2668g.a(this.f35382a, c10816g.f35382a) && C2668g.a(this.f35383b, c10816g.f35383b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f35382a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f35383b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedAlbumByActivityFeedItemIdAndSongId(name=");
        stringBuilder.append(this.f35382a);
        stringBuilder.append(", images=");
        stringBuilder.append(this.f35383b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10816g(@NotNull String str, @Nullable List<ActivityFeedImage> list) {
        C2668g.b(str, "name");
        this.f35382a = str;
        this.f35383b = list;
    }

    @NotNull
    public String name() {
        return this.f35382a;
    }

    @Nullable
    public List<ActivityFeedImage> images() {
        return this.f35383b;
    }
}
