package com.tinder.domain.feed;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/tinder/domain/feed/ActivityFeedArtist;", "", "id", "", "name", "images", "", "Lcom/tinder/domain/feed/ActivityFeedImage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ActivityFeedArtist {
    @NotNull
    private final String id;
    @NotNull
    private final List<ActivityFeedImage> images;
    @NotNull
    private final String name;

    @NotNull
    public static /* synthetic */ ActivityFeedArtist copy$default(ActivityFeedArtist activityFeedArtist, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityFeedArtist.id;
        }
        if ((i & 2) != 0) {
            str2 = activityFeedArtist.name;
        }
        if ((i & 4) != 0) {
            list = activityFeedArtist.images;
        }
        return activityFeedArtist.copy(str, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final List<ActivityFeedImage> component3() {
        return this.images;
    }

    @NotNull
    public final ActivityFeedArtist copy(@NotNull String str, @NotNull String str2, @NotNull List<ActivityFeedImage> list) {
        C2668g.b(str, "id");
        C2668g.b(str2, "name");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        return new ActivityFeedArtist(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityFeedArtist) {
                ActivityFeedArtist activityFeedArtist = (ActivityFeedArtist) obj;
                if (C2668g.a(this.id, activityFeedArtist.id) && C2668g.a(this.name, activityFeedArtist.name) && C2668g.a(this.images, activityFeedArtist.images)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.images;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFeedArtist(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", images=");
        stringBuilder.append(this.images);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ActivityFeedArtist(@NotNull String str, @NotNull String str2, @NotNull List<ActivityFeedImage> list) {
        C2668g.b(str, "id");
        C2668g.b(str2, "name");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        this.id = str;
        this.name = str2;
        this.images = list;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public /* synthetic */ ActivityFeedArtist(String str, String str2, List list, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            list = C19301m.a();
        }
        this(str, str2, list);
    }

    @NotNull
    public final List<ActivityFeedImage> getImages() {
        return this.images;
    }
}
