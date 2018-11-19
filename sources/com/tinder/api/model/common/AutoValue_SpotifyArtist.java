package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_SpotifyArtist extends C$AutoValue_SpotifyArtist {

    public static final class MoshiJsonAdapter extends JsonAdapter<SpotifyArtist> {
        private static final String[] NAMES = new String[]{"id", "name", ManagerWebServices.PARAM_SELECTED, "top_track"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<String> nameAdapter;
        private final JsonAdapter<Boolean> selectedAdapter;
        private final JsonAdapter<SpotifyThemeTrack> topTrackAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
            this.nameAdapter = c5987p.a(String.class);
            this.selectedAdapter = c5987p.a(Boolean.class);
            this.topTrackAdapter = c5987p.a(SpotifyThemeTrack.class);
        }

        public SpotifyArtist fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            Boolean bool = str2;
            SpotifyThemeTrack spotifyThemeTrack = bool;
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
                        bool = (Boolean) this.selectedAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        spotifyThemeTrack = (SpotifyThemeTrack) this.topTrackAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_SpotifyArtist(str, str2, bool, spotifyThemeTrack);
        }

        public void toJson(C5983k c5983k, SpotifyArtist spotifyArtist) throws IOException {
            c5983k.c();
            String id = spotifyArtist.id();
            if (id != null) {
                c5983k.b("id");
                this.idAdapter.toJson(c5983k, id);
            }
            id = spotifyArtist.name();
            if (id != null) {
                c5983k.b("name");
                this.nameAdapter.toJson(c5983k, id);
            }
            Boolean selected = spotifyArtist.selected();
            if (selected != null) {
                c5983k.b(ManagerWebServices.PARAM_SELECTED);
                this.selectedAdapter.toJson(c5983k, selected);
            }
            spotifyArtist = spotifyArtist.topTrack();
            if (spotifyArtist != null) {
                c5983k.b("top_track");
                this.topTrackAdapter.toJson(c5983k, spotifyArtist);
            }
            c5983k.d();
        }
    }

    AutoValue_SpotifyArtist(String str, String str2, Boolean bool, SpotifyThemeTrack spotifyThemeTrack) {
        super(str, str2, bool, spotifyThemeTrack);
    }
}
