package com.tinder.api.model.profile.spotify;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import java.util.List;

/* renamed from: com.tinder.api.model.profile.spotify.$AutoValue_Track */
abstract class C$AutoValue_Track extends Track {
    private final Album album;
    private final List<Artist> artists;
    private final String id;
    private final Boolean isPlayable;
    private final String name;
    private final Integer popularity;
    private final String previewUrl;
    private final String spotifyUri;

    C$AutoValue_Track(String str, String str2, Album album, List<Artist> list, @Nullable Boolean bool, @Nullable Integer num, String str3, @Nullable String str4) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        if (str2 == null) {
            throw new NullPointerException("Null name");
        }
        this.name = str2;
        if (album == null) {
            throw new NullPointerException("Null album");
        }
        this.album = album;
        if (list == null) {
            throw new NullPointerException("Null artists");
        }
        this.artists = list;
        this.isPlayable = bool;
        this.popularity = num;
        if (str3 == null) {
            throw new NullPointerException("Null previewUrl");
        }
        this.previewUrl = str3;
        this.spotifyUri = str4;
    }

    @Json(name = "id")
    public String id() {
        return this.id;
    }

    @Json(name = "name")
    public String name() {
        return this.name;
    }

    @Json(name = "album")
    public Album album() {
        return this.album;
    }

    @Json(name = "artists")
    public List<Artist> artists() {
        return this.artists;
    }

    @Nullable
    @Json(name = "is_playable")
    public Boolean isPlayable() {
        return this.isPlayable;
    }

    @Nullable
    @Json(name = "popularity")
    public Integer popularity() {
        return this.popularity;
    }

    @Json(name = "preview_url")
    public String previewUrl() {
        return this.previewUrl;
    }

    @Nullable
    @Json(name = "uri")
    public String spotifyUri() {
        return this.spotifyUri;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Track{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", album=");
        stringBuilder.append(this.album);
        stringBuilder.append(", artists=");
        stringBuilder.append(this.artists);
        stringBuilder.append(", isPlayable=");
        stringBuilder.append(this.isPlayable);
        stringBuilder.append(", popularity=");
        stringBuilder.append(this.popularity);
        stringBuilder.append(", previewUrl=");
        stringBuilder.append(this.previewUrl);
        stringBuilder.append(", spotifyUri=");
        stringBuilder.append(this.spotifyUri);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.api.model.profile.spotify.Track;
        r2 = 0;
        if (r1 == 0) goto L_0x008f;
    L_0x0009:
        r5 = (com.tinder.api.model.profile.spotify.Track) r5;
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x0017:
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x0023:
        r1 = r4.album;
        r3 = r5.album();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x002f:
        r1 = r4.artists;
        r3 = r5.artists();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x003b:
        r1 = r4.isPlayable;
        if (r1 != 0) goto L_0x0046;
    L_0x003f:
        r1 = r5.isPlayable();
        if (r1 != 0) goto L_0x008d;
    L_0x0045:
        goto L_0x0052;
    L_0x0046:
        r1 = r4.isPlayable;
        r3 = r5.isPlayable();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x0052:
        r1 = r4.popularity;
        if (r1 != 0) goto L_0x005d;
    L_0x0056:
        r1 = r5.popularity();
        if (r1 != 0) goto L_0x008d;
    L_0x005c:
        goto L_0x0069;
    L_0x005d:
        r1 = r4.popularity;
        r3 = r5.popularity();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x0069:
        r1 = r4.previewUrl;
        r3 = r5.previewUrl();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x0075:
        r1 = r4.spotifyUri;
        if (r1 != 0) goto L_0x0080;
    L_0x0079:
        r5 = r5.spotifyUri();
        if (r5 != 0) goto L_0x008d;
    L_0x007f:
        goto L_0x008e;
    L_0x0080:
        r1 = r4.spotifyUri;
        r5 = r5.spotifyUri();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x008d;
    L_0x008c:
        goto L_0x008e;
    L_0x008d:
        r0 = 0;
    L_0x008e:
        return r0;
    L_0x008f:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.spotify.$AutoValue_Track.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.album.hashCode()) * 1000003) ^ this.artists.hashCode()) * 1000003) ^ (this.isPlayable == null ? 0 : this.isPlayable.hashCode())) * 1000003) ^ (this.popularity == null ? 0 : this.popularity.hashCode())) * 1000003) ^ this.previewUrl.hashCode()) * 1000003;
        if (this.spotifyUri != null) {
            i = this.spotifyUri.hashCode();
        }
        return hashCode ^ i;
    }
}
