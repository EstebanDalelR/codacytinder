package com.tinder.api.model.recs;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.common.SpotifyArtist;
import com.tinder.api.model.common.SpotifyThemeTrack;
import com.tinder.api.model.recs.Rec.Spotify;
import java.util.List;

/* renamed from: com.tinder.api.model.recs.$AutoValue_Rec_Spotify */
abstract class C$AutoValue_Rec_Spotify extends Spotify {
    private final Boolean isSpotifyConnected;
    private final SpotifyThemeTrack spotifyThemeTrack;
    private final List<SpotifyArtist> spotifyTopArtists;

    C$AutoValue_Rec_Spotify(@Nullable Boolean bool, @Nullable SpotifyThemeTrack spotifyThemeTrack, @Nullable List<SpotifyArtist> list) {
        this.isSpotifyConnected = bool;
        this.spotifyThemeTrack = spotifyThemeTrack;
        this.spotifyTopArtists = list;
    }

    @Nullable
    @Json(name = "spotify_connected")
    public Boolean isSpotifyConnected() {
        return this.isSpotifyConnected;
    }

    @Nullable
    @Json(name = "spotify_theme_track")
    public SpotifyThemeTrack spotifyThemeTrack() {
        return this.spotifyThemeTrack;
    }

    @Nullable
    @Json(name = "spotify_top_artists")
    public List<SpotifyArtist> spotifyTopArtists() {
        return this.spotifyTopArtists;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Spotify{isSpotifyConnected=");
        stringBuilder.append(this.isSpotifyConnected);
        stringBuilder.append(", spotifyThemeTrack=");
        stringBuilder.append(this.spotifyThemeTrack);
        stringBuilder.append(", spotifyTopArtists=");
        stringBuilder.append(this.spotifyTopArtists);
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
        r1 = r5 instanceof com.tinder.api.model.recs.Rec.Spotify;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.model.recs.Rec.Spotify) r5;
        r1 = r4.isSpotifyConnected;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.isSpotifyConnected();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.isSpotifyConnected;
        r3 = r5.isSpotifyConnected();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.spotifyThemeTrack;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.spotifyThemeTrack();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.spotifyThemeTrack;
        r3 = r5.spotifyThemeTrack();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.spotifyTopArtists;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.spotifyTopArtists();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.spotifyTopArtists;
        r5 = r5.spotifyTopArtists();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0052;
    L_0x0051:
        r0 = 0;
    L_0x0052:
        return r0;
    L_0x0053:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.recs.$AutoValue_Rec_Spotify.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.isSpotifyConnected == null ? 0 : this.isSpotifyConnected.hashCode()) ^ 1000003) * 1000003) ^ (this.spotifyThemeTrack == null ? 0 : this.spotifyThemeTrack.hashCode())) * 1000003;
        if (this.spotifyTopArtists != null) {
            i = this.spotifyTopArtists.hashCode();
        }
        return hashCode ^ i;
    }
}
