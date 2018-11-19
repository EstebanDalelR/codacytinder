package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.SpotifyThemeTrack.Album;
import com.tinder.api.model.common.SpotifyThemeTrack.Artist;
import java.util.List;

/* renamed from: com.tinder.api.model.common.$AutoValue_SpotifyThemeTrack */
abstract class C$AutoValue_SpotifyThemeTrack extends SpotifyThemeTrack {
    private final Album album;
    private final List<Artist> artists;
    private final String id;
    private final Boolean isPlayable;
    private final String name;
    private final Integer popularity;
    private final String previewUrl;
    private final String uri;

    C$AutoValue_SpotifyThemeTrack(@Nullable String str, @Nullable String str2, @Nullable Album album, @Nullable List<Artist> list, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str3, @Nullable String str4) {
        this.id = str;
        this.name = str2;
        this.album = album;
        this.artists = list;
        this.isPlayable = bool;
        this.popularity = num;
        this.previewUrl = str3;
        this.uri = str4;
    }

    @Nullable
    public String id() {
        return this.id;
    }

    @Nullable
    public String name() {
        return this.name;
    }

    @Nullable
    public Album album() {
        return this.album;
    }

    @Nullable
    public List<Artist> artists() {
        return this.artists;
    }

    @Nullable
    @Json(name = "is_playable")
    public Boolean isPlayable() {
        return this.isPlayable;
    }

    @Nullable
    public Integer popularity() {
        return this.popularity;
    }

    @Nullable
    @Json(name = "preview_url")
    public String previewUrl() {
        return this.previewUrl;
    }

    @Nullable
    public String uri() {
        return this.uri;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpotifyThemeTrack{id=");
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
        stringBuilder.append(", uri=");
        stringBuilder.append(this.uri);
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
        r1 = r5 instanceof com.tinder.api.model.common.SpotifyThemeTrack;
        r2 = 0;
        if (r1 == 0) goto L_0x00c6;
    L_0x0009:
        r5 = (com.tinder.api.model.common.SpotifyThemeTrack) r5;
        r1 = r4.id;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.id();
        if (r1 != 0) goto L_0x00c4;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0022:
        r1 = r4.name;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.name();
        if (r1 != 0) goto L_0x00c4;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0039:
        r1 = r4.album;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.album();
        if (r1 != 0) goto L_0x00c4;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.album;
        r3 = r5.album();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0050:
        r1 = r4.artists;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.artists();
        if (r1 != 0) goto L_0x00c4;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.artists;
        r3 = r5.artists();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0067:
        r1 = r4.isPlayable;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.isPlayable();
        if (r1 != 0) goto L_0x00c4;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.isPlayable;
        r3 = r5.isPlayable();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x007e:
        r1 = r4.popularity;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.popularity();
        if (r1 != 0) goto L_0x00c4;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.popularity;
        r3 = r5.popularity();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0095:
        r1 = r4.previewUrl;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = r5.previewUrl();
        if (r1 != 0) goto L_0x00c4;
    L_0x009f:
        goto L_0x00ac;
    L_0x00a0:
        r1 = r4.previewUrl;
        r3 = r5.previewUrl();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x00ac:
        r1 = r4.uri;
        if (r1 != 0) goto L_0x00b7;
    L_0x00b0:
        r5 = r5.uri();
        if (r5 != 0) goto L_0x00c4;
    L_0x00b6:
        goto L_0x00c5;
    L_0x00b7:
        r1 = r4.uri;
        r5 = r5.uri();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00c5;
    L_0x00c4:
        r0 = 0;
    L_0x00c5:
        return r0;
    L_0x00c6:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_SpotifyThemeTrack.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((this.id == null ? 0 : this.id.hashCode()) ^ 1000003) * 1000003) ^ (this.name == null ? 0 : this.name.hashCode())) * 1000003) ^ (this.album == null ? 0 : this.album.hashCode())) * 1000003) ^ (this.artists == null ? 0 : this.artists.hashCode())) * 1000003) ^ (this.isPlayable == null ? 0 : this.isPlayable.hashCode())) * 1000003) ^ (this.popularity == null ? 0 : this.popularity.hashCode())) * 1000003) ^ (this.previewUrl == null ? 0 : this.previewUrl.hashCode())) * 1000003;
        if (this.uri != null) {
            i = this.uri.hashCode();
        }
        return hashCode ^ i;
    }
}
