package com.tinder.data.message.activityfeed.model;

import com.tinder.data.model.activityfeed.ActivityFeedArtistModel.Select_activity_feed_artistModel;
import com.tinder.domain.feed.ActivityFeedImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tinder/data/message/activityfeed/model/ActivityFeedArtistByActivityFeedItemIdAndSongId;", "Lcom/tinder/data/model/activityfeed/ActivityFeedArtistModel$Select_activity_feed_artistModel;", "id", "", "name", "images", "", "Lcom/tinder/domain/feed/ActivityFeedImage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.l */
final class C10820l implements Select_activity_feed_artistModel {
    @NotNull
    /* renamed from: a */
    private final String f35391a;
    @NotNull
    /* renamed from: b */
    private final String f35392b;
    @Nullable
    /* renamed from: c */
    private final List<ActivityFeedImage> f35393c;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10820l) {
                C10820l c10820l = (C10820l) obj;
                if (C2668g.a(this.f35391a, c10820l.f35391a) && C2668g.a(this.f35392b, c10820l.f35392b) && C2668g.a(this.f35393c, c10820l.f35393c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f35391a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35392b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.f35393c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedArtistByActivityFeedItemIdAndSongId(id=");
        stringBuilder.append(this.f35391a);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f35392b);
        stringBuilder.append(", images=");
        stringBuilder.append(this.f35393c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10820l(@NotNull String str, @NotNull String str2, @Nullable List<ActivityFeedImage> list) {
        C2668g.b(str, "id");
        C2668g.b(str2, "name");
        this.f35391a = str;
        this.f35392b = str2;
        this.f35393c = list;
    }

    @NotNull
    public String id() {
        return this.f35391a;
    }

    @NotNull
    public String name() {
        return this.f35392b;
    }

    @Nullable
    public List<ActivityFeedImage> images() {
        return this.f35393c;
    }
}
