package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.profile.spotify.Artist;
import com.tinder.api.model.profile.spotify.Track;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Spotify extends C$AutoValue_Spotify {

    public static final class MoshiJsonAdapter extends JsonAdapter<Spotify> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_SPOTIFY_TOP_ARTISTS, ManagerWebServices.PARAM_SPOTIFY_THEM_TRACK, ManagerWebServices.PARAM_SPOTIFY_LAST_UPDATED, ManagerWebServices.PARAM_SPOTIFY_USER_TYPE, ManagerWebServices.PARAM_SPOTIFY_USER_NAME, ManagerWebServices.PARAM_SPOTIFY_CONNECTED};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> isConnectedAdapter;
        private final JsonAdapter<String> lastUpdatedAtAdapter;
        private final JsonAdapter<Track> themeTrackAdapter;
        private final JsonAdapter<List<Artist>> topArtistsAdapter;
        private final JsonAdapter<String> userNameAdapter;
        private final JsonAdapter<String> userTypeAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.topArtistsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Artist.class}));
            this.themeTrackAdapter = c5987p.a(Track.class);
            this.lastUpdatedAtAdapter = c5987p.a(String.class);
            this.userTypeAdapter = c5987p.a(String.class);
            this.userNameAdapter = c5987p.a(String.class);
            this.isConnectedAdapter = c5987p.a(Boolean.class);
        }

        public Spotify fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            List list = null;
            Track track = list;
            String str = track;
            String str2 = str;
            String str3 = str2;
            Boolean bool = str3;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        list = (List) this.topArtistsAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        track = (Track) this.themeTrackAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str = (String) this.lastUpdatedAtAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        str2 = (String) this.userTypeAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        str3 = (String) this.userNameAdapter.fromJson(jsonReader);
                        break;
                    case 5:
                        bool = (Boolean) this.isConnectedAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Spotify(list, track, str, str2, str3, bool);
        }

        public void toJson(C5983k c5983k, Spotify spotify) throws IOException {
            c5983k.c();
            List topArtists = spotify.topArtists();
            if (topArtists != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_TOP_ARTISTS);
                this.topArtistsAdapter.toJson(c5983k, topArtists);
            }
            Track themeTrack = spotify.themeTrack();
            if (themeTrack != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_THEM_TRACK);
                this.themeTrackAdapter.toJson(c5983k, themeTrack);
            }
            String lastUpdatedAt = spotify.lastUpdatedAt();
            if (lastUpdatedAt != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_LAST_UPDATED);
                this.lastUpdatedAtAdapter.toJson(c5983k, lastUpdatedAt);
            }
            lastUpdatedAt = spotify.userType();
            if (lastUpdatedAt != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_USER_TYPE);
                this.userTypeAdapter.toJson(c5983k, lastUpdatedAt);
            }
            lastUpdatedAt = spotify.userName();
            if (lastUpdatedAt != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_USER_NAME);
                this.userNameAdapter.toJson(c5983k, lastUpdatedAt);
            }
            spotify = spotify.isConnected();
            if (spotify != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_CONNECTED);
                this.isConnectedAdapter.toJson(c5983k, spotify);
            }
            c5983k.d();
        }
    }

    AutoValue_Spotify(List<Artist> list, Track track, String str, String str2, String str3, Boolean bool) {
        super(list, track, str, str2, str3, bool);
    }
}
