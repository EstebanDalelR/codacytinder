package com.tinder.api.model.activityfeed;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyTrack;", "", "id", "", "name", "url", "album", "Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyAlbum;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyAlbum;)V", "getAlbum", "()Lcom/tinder/api/model/activityfeed/ApiActivityEventSpotifyAlbum;", "getId", "()Ljava/lang/String;", "getName", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityEventSpotifyTrack {
    @Nullable
    private final ApiActivityEventSpotifyAlbum album;
    @Nullable
    private final String id;
    @Nullable
    private final String name;
    @Nullable
    private final String url;

    @NotNull
    public static /* synthetic */ ApiActivityEventSpotifyTrack copy$default(ApiActivityEventSpotifyTrack apiActivityEventSpotifyTrack, String str, String str2, String str3, ApiActivityEventSpotifyAlbum apiActivityEventSpotifyAlbum, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiActivityEventSpotifyTrack.id;
        }
        if ((i & 2) != 0) {
            str2 = apiActivityEventSpotifyTrack.name;
        }
        if ((i & 4) != 0) {
            str3 = apiActivityEventSpotifyTrack.url;
        }
        if ((i & 8) != 0) {
            apiActivityEventSpotifyAlbum = apiActivityEventSpotifyTrack.album;
        }
        return apiActivityEventSpotifyTrack.copy(str, str2, str3, apiActivityEventSpotifyAlbum);
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

    @NotNull
    public final ApiActivityEventSpotifyTrack copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ApiActivityEventSpotifyAlbum apiActivityEventSpotifyAlbum) {
        return new ApiActivityEventSpotifyTrack(str, str2, str3, apiActivityEventSpotifyAlbum);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityEventSpotifyTrack) {
                ApiActivityEventSpotifyTrack apiActivityEventSpotifyTrack = (ApiActivityEventSpotifyTrack) obj;
                if (C2668g.a(this.id, apiActivityEventSpotifyTrack.id) && C2668g.a(this.name, apiActivityEventSpotifyTrack.name) && C2668g.a(this.url, apiActivityEventSpotifyTrack.url) && C2668g.a(this.album, apiActivityEventSpotifyTrack.album)) {
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
        if (apiActivityEventSpotifyAlbum != null) {
            i = apiActivityEventSpotifyAlbum.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityEventSpotifyTrack(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", album=");
        stringBuilder.append(this.album);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityEventSpotifyTrack(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ApiActivityEventSpotifyAlbum apiActivityEventSpotifyAlbum) {
        this.id = str;
        this.name = str2;
        this.url = str3;
        this.album = apiActivityEventSpotifyAlbum;
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
}
