package com.tinder.domain.feed;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/feed/ActivityFeedAlbum;", "", "name", "", "images", "", "Lcom/tinder/domain/feed/ActivityFeedImage;", "(Ljava/lang/String;Ljava/util/List;)V", "getImages", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityFeedAlbum {
    @NotNull
    private final List<ActivityFeedImage> images;
    @NotNull
    private final String name;

    @NotNull
    public static /* synthetic */ ActivityFeedAlbum copy$default(ActivityFeedAlbum activityFeedAlbum, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityFeedAlbum.name;
        }
        if ((i & 2) != 0) {
            list = activityFeedAlbum.images;
        }
        return activityFeedAlbum.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final List<ActivityFeedImage> component2() {
        return this.images;
    }

    @NotNull
    public final ActivityFeedAlbum copy(@NotNull String str, @NotNull List<ActivityFeedImage> list) {
        C2668g.b(str, "name");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        return new ActivityFeedAlbum(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityFeedAlbum) {
                ActivityFeedAlbum activityFeedAlbum = (ActivityFeedAlbum) obj;
                if (C2668g.a(this.name, activityFeedAlbum.name) && C2668g.a(this.images, activityFeedAlbum.images)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.images;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedAlbum(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", images=");
        stringBuilder.append(this.images);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ActivityFeedAlbum(@NotNull String str, @NotNull List<ActivityFeedImage> list) {
        C2668g.b(str, "name");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        this.name = str;
        this.images = list;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<ActivityFeedImage> getImages() {
        return this.images;
    }
}
