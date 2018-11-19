package com.tinder.api.model.activityfeed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyArtist;", "", "id", "", "name", "tracks", "", "Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyTrack;", "images", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedImage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getImages", "()Ljava/util/List;", "getName", "getTracks", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityEventSpotifyArtist {
    @Nullable
    private final String id;
    @Nullable
    private final List<ApiActivityFeedImage> images;
    @Nullable
    private final String name;
    @Nullable
    private final List<ApiActivityEventSpotifyTrack> tracks;

    @NotNull
    public static /* synthetic */ ApiActivityEventSpotifyArtist copy$default(ApiActivityEventSpotifyArtist apiActivityEventSpotifyArtist, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiActivityEventSpotifyArtist.id;
        }
        if ((i & 2) != 0) {
            str2 = apiActivityEventSpotifyArtist.name;
        }
        if ((i & 4) != 0) {
            list = apiActivityEventSpotifyArtist.tracks;
        }
        if ((i & 8) != 0) {
            list2 = apiActivityEventSpotifyArtist.images;
        }
        return apiActivityEventSpotifyArtist.copy(str, str2, list, list2);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final List<ApiActivityEventSpotifyTrack> component3() {
        return this.tracks;
    }

    @Nullable
    public final List<ApiActivityFeedImage> component4() {
        return this.images;
    }

    @NotNull
    public final ApiActivityEventSpotifyArtist copy(@Nullable String str, @Nullable String str2, @Nullable List<ApiActivityEventSpotifyTrack> list, @Nullable List<ApiActivityFeedImage> list2) {
        return new ApiActivityEventSpotifyArtist(str, str2, list, list2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityEventSpotifyArtist) {
                ApiActivityEventSpotifyArtist apiActivityEventSpotifyArtist = (ApiActivityEventSpotifyArtist) obj;
                if (C2668g.a(this.id, apiActivityEventSpotifyArtist.id) && C2668g.a(this.name, apiActivityEventSpotifyArtist.name) && C2668g.a(this.tracks, apiActivityEventSpotifyArtist.tracks) && C2668g.a(this.images, apiActivityEventSpotifyArtist.images)) {
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
        List list = this.tracks;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.images;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityEventSpotifyArtist(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", tracks=");
        stringBuilder.append(this.tracks);
        stringBuilder.append(", images=");
        stringBuilder.append(this.images);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityEventSpotifyArtist(@Nullable String str, @Nullable String str2, @Nullable List<ApiActivityEventSpotifyTrack> list, @Nullable List<ApiActivityFeedImage> list2) {
        this.id = str;
        this.name = str2;
        this.tracks = list;
        this.images = list2;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<ApiActivityEventSpotifyTrack> getTracks() {
        return this.tracks;
    }

    @Nullable
    public final List<ApiActivityFeedImage> getImages() {
        return this.images;
    }
}
