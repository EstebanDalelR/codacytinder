package com.tinder.api.model.recs;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.SpotifyArtist;
import com.tinder.api.model.common.SpotifyThemeTrack;
import com.tinder.api.model.recs.Rec.Spotify;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Rec_Spotify extends C$AutoValue_Rec_Spotify {

    public static final class MoshiJsonAdapter extends JsonAdapter<Spotify> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_SPOTIFY_CONNECTED, ManagerWebServices.PARAM_SPOTIFY_THEM_TRACK, ManagerWebServices.PARAM_SPOTIFY_TOP_ARTISTS};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> isSpotifyConnectedAdapter;
        private final JsonAdapter<SpotifyThemeTrack> spotifyThemeTrackAdapter;
        private final JsonAdapter<List<SpotifyArtist>> spotifyTopArtistsAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.isSpotifyConnectedAdapter = c5987p.a(Boolean.class);
            this.spotifyThemeTrackAdapter = c5987p.a(SpotifyThemeTrack.class);
            this.spotifyTopArtistsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{SpotifyArtist.class}));
        }

        public Spotify fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Boolean bool = null;
            SpotifyThemeTrack spotifyThemeTrack = null;
            List list = spotifyThemeTrack;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        bool = (Boolean) this.isSpotifyConnectedAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        spotifyThemeTrack = (SpotifyThemeTrack) this.spotifyThemeTrackAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        list = (List) this.spotifyTopArtistsAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Rec_Spotify(bool, spotifyThemeTrack, list);
        }

        public void toJson(C5983k c5983k, Spotify spotify) throws IOException {
            c5983k.c();
            Boolean isSpotifyConnected = spotify.isSpotifyConnected();
            if (isSpotifyConnected != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_CONNECTED);
                this.isSpotifyConnectedAdapter.toJson(c5983k, isSpotifyConnected);
            }
            SpotifyThemeTrack spotifyThemeTrack = spotify.spotifyThemeTrack();
            if (spotifyThemeTrack != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_THEM_TRACK);
                this.spotifyThemeTrackAdapter.toJson(c5983k, spotifyThemeTrack);
            }
            spotify = spotify.spotifyTopArtists();
            if (spotify != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_TOP_ARTISTS);
                this.spotifyTopArtistsAdapter.toJson(c5983k, spotify);
            }
            c5983k.d();
        }
    }

    AutoValue_Rec_Spotify(Boolean bool, SpotifyThemeTrack spotifyThemeTrack, List<SpotifyArtist> list) {
        super(bool, spotifyThemeTrack, list);
    }
}
