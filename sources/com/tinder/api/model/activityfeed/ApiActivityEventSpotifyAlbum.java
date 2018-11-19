package com.tinder.api.model.activityfeed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyAlbum;", "", "name", "", "images", "", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedImage;", "(Ljava/lang/String;Ljava/util/List;)V", "getImages", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityEventSpotifyAlbum {
    @Nullable
    private final List<ApiActivityFeedImage> images;
    @Nullable
    private final String name;

    @NotNull
    public static /* synthetic */ ApiActivityEventSpotifyAlbum copy$default(ApiActivityEventSpotifyAlbum apiActivityEventSpotifyAlbum, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiActivityEventSpotifyAlbum.name;
        }
        if ((i & 2) != 0) {
            list = apiActivityEventSpotifyAlbum.images;
        }
        return apiActivityEventSpotifyAlbum.copy(str, list);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final List<ApiActivityFeedImage> component2() {
        return this.images;
    }

    @NotNull
    public final ApiActivityEventSpotifyAlbum copy(@Nullable String str, @Nullable List<ApiActivityFeedImage> list) {
        return new ApiActivityEventSpotifyAlbum(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityEventSpotifyAlbum) {
                ApiActivityEventSpotifyAlbum apiActivityEventSpotifyAlbum = (ApiActivityEventSpotifyAlbum) obj;
                if (C2668g.a(this.name, apiActivityEventSpotifyAlbum.name) && C2668g.a(this.images, apiActivityEventSpotifyAlbum.images)) {
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
        stringBuilder.append("ApiActivityEventSpotifyAlbum(name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", images=");
        stringBuilder.append(this.images);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityEventSpotifyAlbum(@Nullable String str, @Nullable List<ApiActivityFeedImage> list) {
        this.name = str;
        this.images = list;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<ApiActivityFeedImage> getImages() {
        return this.images;
    }
}
