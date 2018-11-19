package com.tinder.spotify.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

public class SpotifyPopularResponse {
    @SerializedName("data")
    /* renamed from: a */
    private C15051a f46866a;

    public class PopularOnSpotifyPlaylist {
        @Keep
        @SerializedName("tracks")
        public SpotifyDefaultTrackListResponse mTracks;

        /* renamed from: a */
        public SpotifyDefaultTrackListResponse m56725a() {
            return this.mTracks;
        }

        public String toString() {
            if (this.mTracks != null) {
                if (this.mTracks.m56724a() != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    for (SearchTrack searchTrack : this.mTracks.m56724a()) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("track: ");
                        stringBuilder2.append(searchTrack);
                        stringBuilder.append(stringBuilder2.toString());
                    }
                    return stringBuilder.toString();
                }
            }
            return "Null tracks";
        }
    }

    /* renamed from: com.tinder.spotify.model.SpotifyPopularResponse$a */
    public class C15051a {
        @SerializedName("popular_on_spotify_playlist")
        /* renamed from: a */
        public PopularOnSpotifyPlaylist f46865a;

        /* renamed from: a */
        public PopularOnSpotifyPlaylist m56726a() {
            return this.f46865a;
        }
    }

    /* renamed from: a */
    public C15051a m56727a() {
        return this.f46866a;
    }
}
