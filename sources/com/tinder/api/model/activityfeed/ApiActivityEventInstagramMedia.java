package com.tinder.api.model.activityfeed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramMedia;", "", "id", "", "images", "", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedImage;", "videos", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedVideo;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getVideos", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityEventInstagramMedia {
    @Nullable
    private final String id;
    @Nullable
    private final List<ApiActivityFeedImage> images;
    @Nullable
    private final List<ApiActivityFeedVideo> videos;

    @NotNull
    public static /* synthetic */ ApiActivityEventInstagramMedia copy$default(ApiActivityEventInstagramMedia apiActivityEventInstagramMedia, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiActivityEventInstagramMedia.id;
        }
        if ((i & 2) != 0) {
            list = apiActivityEventInstagramMedia.images;
        }
        if ((i & 4) != 0) {
            list2 = apiActivityEventInstagramMedia.videos;
        }
        return apiActivityEventInstagramMedia.copy(str, list, list2);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final List<ApiActivityFeedImage> component2() {
        return this.images;
    }

    @Nullable
    public final List<ApiActivityFeedVideo> component3() {
        return this.videos;
    }

    @NotNull
    public final ApiActivityEventInstagramMedia copy(@Nullable String str, @Nullable List<ApiActivityFeedImage> list, @Nullable List<ApiActivityFeedVideo> list2) {
        return new ApiActivityEventInstagramMedia(str, list, list2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityEventInstagramMedia) {
                ApiActivityEventInstagramMedia apiActivityEventInstagramMedia = (ApiActivityEventInstagramMedia) obj;
                if (C2668g.a(this.id, apiActivityEventInstagramMedia.id) && C2668g.a(this.images, apiActivityEventInstagramMedia.images) && C2668g.a(this.videos, apiActivityEventInstagramMedia.videos)) {
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
        stringBuilder.append("ApiActivityEventInstagramMedia(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", images=");
        stringBuilder.append(this.images);
        stringBuilder.append(", videos=");
        stringBuilder.append(this.videos);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityEventInstagramMedia(@Nullable String str, @Nullable List<ApiActivityFeedImage> list, @Nullable List<ApiActivityFeedVideo> list2) {
        this.id = str;
        this.images = list;
        this.videos = list2;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<ApiActivityFeedImage> getImages() {
        return this.images;
    }

    @Nullable
    public final List<ApiActivityFeedVideo> getVideos() {
        return this.videos;
    }
}
