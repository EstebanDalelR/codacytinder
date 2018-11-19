package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.profile.spotify.Artist;
import com.tinder.api.model.profile.spotify.Track;
import java.util.List;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Spotify */
abstract class C$AutoValue_Spotify extends Spotify {
    private final Boolean isConnected;
    private final String lastUpdatedAt;
    private final Track themeTrack;
    private final List<Artist> topArtists;
    private final String userName;
    private final String userType;

    C$AutoValue_Spotify(@Nullable List<Artist> list, @Nullable Track track, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        this.topArtists = list;
        this.themeTrack = track;
        this.lastUpdatedAt = str;
        this.userType = str2;
        this.userName = str3;
        this.isConnected = bool;
    }

    @Nullable
    @Json(name = "spotify_top_artists")
    public List<Artist> topArtists() {
        return this.topArtists;
    }

    @Nullable
    @Json(name = "spotify_theme_track")
    public Track themeTrack() {
        return this.themeTrack;
    }

    @Nullable
    @Json(name = "spotify_last_updated_at")
    public String lastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    @Nullable
    @Json(name = "spotify_user_type")
    public String userType() {
        return this.userType;
    }

    @Nullable
    @Json(name = "spotify_username")
    public String userName() {
        return this.userName;
    }

    @Nullable
    @Json(name = "spotify_connected")
    public Boolean isConnected() {
        return this.isConnected;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Spotify{topArtists=");
        stringBuilder.append(this.topArtists);
        stringBuilder.append(", themeTrack=");
        stringBuilder.append(this.themeTrack);
        stringBuilder.append(", lastUpdatedAt=");
        stringBuilder.append(this.lastUpdatedAt);
        stringBuilder.append(", userType=");
        stringBuilder.append(this.userType);
        stringBuilder.append(", userName=");
        stringBuilder.append(this.userName);
        stringBuilder.append(", isConnected=");
        stringBuilder.append(this.isConnected);
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
        r1 = r5 instanceof com.tinder.api.model.profile.Spotify;
        r2 = 0;
        if (r1 == 0) goto L_0x0098;
    L_0x0009:
        r5 = (com.tinder.api.model.profile.Spotify) r5;
        r1 = r4.topArtists;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.topArtists();
        if (r1 != 0) goto L_0x0096;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.topArtists;
        r3 = r5.topArtists();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x0022:
        r1 = r4.themeTrack;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.themeTrack();
        if (r1 != 0) goto L_0x0096;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.themeTrack;
        r3 = r5.themeTrack();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x0039:
        r1 = r4.lastUpdatedAt;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.lastUpdatedAt();
        if (r1 != 0) goto L_0x0096;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.lastUpdatedAt;
        r3 = r5.lastUpdatedAt();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x0050:
        r1 = r4.userType;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.userType();
        if (r1 != 0) goto L_0x0096;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.userType;
        r3 = r5.userType();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x0067:
        r1 = r4.userName;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.userName();
        if (r1 != 0) goto L_0x0096;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.userName;
        r3 = r5.userName();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0096;
    L_0x007e:
        r1 = r4.isConnected;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r5 = r5.isConnected();
        if (r5 != 0) goto L_0x0096;
    L_0x0088:
        goto L_0x0097;
    L_0x0089:
        r1 = r4.isConnected;
        r5 = r5.isConnected();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0096;
    L_0x0095:
        goto L_0x0097;
    L_0x0096:
        r0 = 0;
    L_0x0097:
        return r0;
    L_0x0098:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.$AutoValue_Spotify.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.topArtists == null ? 0 : this.topArtists.hashCode()) ^ 1000003) * 1000003) ^ (this.themeTrack == null ? 0 : this.themeTrack.hashCode())) * 1000003) ^ (this.lastUpdatedAt == null ? 0 : this.lastUpdatedAt.hashCode())) * 1000003) ^ (this.userType == null ? 0 : this.userType.hashCode())) * 1000003) ^ (this.userName == null ? 0 : this.userName.hashCode())) * 1000003;
        if (this.isConnected != null) {
            i = this.isConnected.hashCode();
        }
        return hashCode ^ i;
    }
}
