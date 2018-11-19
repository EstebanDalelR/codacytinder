package com.tinder.api.model.activityfeed;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityFeedAnthem;", "", "id", "", "name", "url", "album", "Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyAlbum;", "artists", "", "Lcom/tinder/api/model/activityfeed/ApiActivityFeedArtist;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyAlbum;Ljava/util/List;)V", "getAlbum", "()Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyAlbum;", "getArtists", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getName", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityFeedAnthem {
    @Nullable
    private final ApiActivityEventSpotifyAlbum album;
    @Nullable
    private final List<ApiActivityFeedArtist> artists;
    @Nullable
    private final String id;
    @Nullable
    private final String name;
    @Nullable
    private final String url;

    @NotNull
    public static /* synthetic */ ApiActivityFeedAnthem copy$default(ApiActivityFeedAnthem apiActivityFeedAnthem, String str, String str2, String str3, ApiActivityEventSpotifyAlbum apiActivityEventSpotifyAlbum, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiActivityFeedAnthem.id;
        }
        if ((i & 2) != 0) {
            str2 = apiActivityFeedAnthem.name;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = apiActivityFeedAnthem.url;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            apiActivityEventSpotifyAlbum = apiActivityFeedAnthem.album;
        }
        ApiActivityEventSpotifyAlbum apiActivityEventSpotifyAlbum2 = apiActivityEventSpotifyAlbum;
        if ((i & 16) != 0) {
            list = apiActivityFeedAnthem.artists;
        }
        return apiActivityFeedAnthem.copy(str, str4, str5, apiActivityEventSpotifyAlbum2, list);
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
    public final String component3() {
        return this.url;
    }

    @Nullable
    public final ApiActivityEventSpotifyAlbum component4() {
        return this.album;
    }

    @Nullable
    public final List<ApiActivityFeedArtist> component5() {
        return this.artists;
    }

    @NotNull
    public final ApiActivityFeedAnthem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ApiActivityEventSpotifyAlbum apiActivityEventSpotifyAlbum, @Nullable List<ApiActivityFeedArtist> list) {
        return new ApiActivityFeedAnthem(str, str2, str3, apiActivityEventSpotifyAlbum, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityFeedAnthem) {
                ApiActivityFeedAnthem apiActivityFeedAnthem = (ApiActivityFeedAnthem) obj;
                if (C2668g.a(this.id, apiActivityFeedAnthem.id) && C2668g.a(this.name, apiActivityFeedAnthem.name) && C2668g.a(this.url, apiActivityFeedAnthem.url) && C2668g.a(this.album, apiActivityFeedAnthem.album) && C2668g.a(this.artists, apiActivityFeedAnthem.artists)) {
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
        str2 = this.url;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ApiActivityEventSpotifyAlbum apiActivityEventSpotifyAlbum = this.album;
        hashCode = (hashCode + (apiActivityEventSpotifyAlbum != null ? apiActivityEventSpotifyAlbum.hashCode() : 0)) * 31;
        List list = this.artists;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityFeedAnthem(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", album=");
        stringBuilder.append(this.album);
        stringBuilder.append(", artists=");
        stringBuilder.append(this.artists);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityFeedAnthem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ApiActivityEventSpotifyAlbum apiActivityEventSpotifyAlbum, @Nullable List<ApiActivityFeedArtist> list) {
        this.id = str;
        this.name = str2;
        this.url = str3;
        this.album = apiActivityEventSpotifyAlbum;
        this.artists = list;
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
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final ApiActivityEventSpotifyAlbum getAlbum() {
        return this.album;
    }

    @Nullable
    public final List<ApiActivityFeedArtist> getArtists() {
        return this.artists;
    }
}
