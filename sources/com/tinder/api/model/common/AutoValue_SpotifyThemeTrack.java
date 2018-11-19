package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.SpotifyThemeTrack.Album;
import com.tinder.api.model.common.SpotifyThemeTrack.Artist;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_SpotifyThemeTrack extends C$AutoValue_SpotifyThemeTrack {

    public static final class MoshiJsonAdapter extends JsonAdapter<SpotifyThemeTrack> {
        private static final String[] NAMES = new String[]{"id", "name", ManagerWebServices.PARAM_SPOTIFY_ALBUM, ManagerWebServices.PARAM_SPOTIFY_ARTISTS, ManagerWebServices.PARAM_SPOTIFY_IS_PLAYABLE, ManagerWebServices.PARAM_SPOTIFY_POPULARITY, ManagerWebServices.PARAM_SPOTIFY_PREVIEW_URL, ManagerWebServices.PARAM_SPOTIFY_URI};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Album> albumAdapter;
        private final JsonAdapter<List<Artist>> artistsAdapter;
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<Boolean> isPlayableAdapter;
        private final JsonAdapter<String> nameAdapter;
        private final JsonAdapter<Integer> popularityAdapter;
        private final JsonAdapter<String> previewUrlAdapter;
        private final JsonAdapter<String> uriAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
            this.nameAdapter = c5987p.a(String.class);
            this.albumAdapter = c5987p.a(Album.class);
            this.artistsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Artist.class}));
            this.isPlayableAdapter = c5987p.a(Boolean.class);
            this.popularityAdapter = c5987p.a(Integer.class);
            this.previewUrlAdapter = c5987p.a(String.class);
            this.uriAdapter = c5987p.a(String.class);
        }

        public SpotifyThemeTrack fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = str;
            Album album = str2;
            List list = album;
            Boolean bool = list;
            Integer num = bool;
            String str3 = num;
            String str4 = str3;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.idAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.nameAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        album = (Album) this.albumAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        list = (List) this.artistsAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        bool = (Boolean) this.isPlayableAdapter.fromJson(jsonReader);
                        break;
                    case 5:
                        num = (Integer) this.popularityAdapter.fromJson(jsonReader);
                        break;
                    case 6:
                        str3 = (String) this.previewUrlAdapter.fromJson(jsonReader);
                        break;
                    case 7:
                        str4 = (String) this.uriAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_SpotifyThemeTrack(str, str2, album, list, bool, num, str3, str4);
        }

        public void toJson(C5983k c5983k, SpotifyThemeTrack spotifyThemeTrack) throws IOException {
            c5983k.c();
            String id = spotifyThemeTrack.id();
            if (id != null) {
                c5983k.b("id");
                this.idAdapter.toJson(c5983k, id);
            }
            id = spotifyThemeTrack.name();
            if (id != null) {
                c5983k.b("name");
                this.nameAdapter.toJson(c5983k, id);
            }
            Album album = spotifyThemeTrack.album();
            if (album != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_ALBUM);
                this.albumAdapter.toJson(c5983k, album);
            }
            List artists = spotifyThemeTrack.artists();
            if (artists != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_ARTISTS);
                this.artistsAdapter.toJson(c5983k, artists);
            }
            Boolean isPlayable = spotifyThemeTrack.isPlayable();
            if (isPlayable != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_IS_PLAYABLE);
                this.isPlayableAdapter.toJson(c5983k, isPlayable);
            }
            Integer popularity = spotifyThemeTrack.popularity();
            if (popularity != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_POPULARITY);
                this.popularityAdapter.toJson(c5983k, popularity);
            }
            id = spotifyThemeTrack.previewUrl();
            if (id != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_PREVIEW_URL);
                this.previewUrlAdapter.toJson(c5983k, id);
            }
            spotifyThemeTrack = spotifyThemeTrack.uri();
            if (spotifyThemeTrack != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_URI);
                this.uriAdapter.toJson(c5983k, spotifyThemeTrack);
            }
            c5983k.d();
        }
    }

    AutoValue_SpotifyThemeTrack(String str, String str2, Album album, List<Artist> list, Boolean bool, Integer num, String str3, String str4) {
        super(str, str2, album, list, bool, num, str3, str4);
    }
}
