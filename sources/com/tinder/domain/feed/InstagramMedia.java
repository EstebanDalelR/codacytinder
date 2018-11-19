package com.tinder.domain.feed;

import com.tinder.api.ManagerWebServices;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/tinder/domain/feed/InstagramMedia;", "", "id", "", "images", "", "Lcom/tinder/domain/feed/ActivityFeedImage;", "videos", "Lcom/tinder/domain/feed/ActivityFeedVideo;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getVideos", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class InstagramMedia {
    @NotNull
    private final String id;
    @NotNull
    private final List<ActivityFeedImage> images;
    @NotNull
    private final List<ActivityFeedVideo> videos;

    @NotNull
    public static /* synthetic */ InstagramMedia copy$default(InstagramMedia instagramMedia, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instagramMedia.id;
        }
        if ((i & 2) != 0) {
            list = instagramMedia.images;
        }
        if ((i & 4) != 0) {
            list2 = instagramMedia.videos;
        }
        return instagramMedia.copy(str, list, list2);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final List<ActivityFeedImage> component2() {
        return this.images;
    }

    @NotNull
    public final List<ActivityFeedVideo> component3() {
        return this.videos;
    }

    @NotNull
    public final InstagramMedia copy(@NotNull String str, @NotNull List<ActivityFeedImage> list, @NotNull List<ActivityFeedVideo> list2) {
        C2668g.b(str, "id");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        C2668g.b(list2, "videos");
        return new InstagramMedia(str, list, list2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InstagramMedia) {
                InstagramMedia instagramMedia = (InstagramMedia) obj;
                if (C2668g.a(this.id, instagramMedia.id) && C2668g.a(this.images, instagramMedia.images) && C2668g.a(this.videos, instagramMedia.videos)) {
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
        List list = this.images;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.videos;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstagramMedia(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", images=");
        stringBuilder.append(this.images);
        stringBuilder.append(", videos=");
        stringBuilder.append(this.videos);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public InstagramMedia(@NotNull String str, @NotNull List<ActivityFeedImage> list, @NotNull List<ActivityFeedVideo> list2) {
        C2668g.b(str, "id");
        C2668g.b(list, ManagerWebServices.PARAM_SPOTIFY_IMAGES);
        C2668g.b(list2, "videos");
        this.id = str;
        this.images = list;
        this.videos = list2;
        list = true;
        if ((((Collection) this.images).isEmpty() ^ 1) == null) {
            if ((((Collection) this.videos).isEmpty() ^ 1) == null) {
                list = null;
            }
        }
        if (list == null) {
            throw ((Throwable) new IllegalArgumentException("Cannot create an InstagramMedia with both empty images and empty videos".toString()));
        }
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<ActivityFeedImage> getImages() {
        return this.images;
    }

    @NotNull
    public final List<ActivityFeedVideo> getVideos() {
        return this.videos;
    }
}
