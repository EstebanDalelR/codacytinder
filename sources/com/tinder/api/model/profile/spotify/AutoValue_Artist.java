package com.tinder.api.model.profile.spotify;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_Artist extends C$AutoValue_Artist {

    public static final class MoshiJsonAdapter extends JsonAdapter<Artist> {
        private static final String[] NAMES = new String[]{"id", "name", "top_track", ManagerWebServices.PARAM_SELECTED};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<Boolean> isSelectedAdapter;
        private final JsonAdapter<String> nameAdapter;
        private final JsonAdapter<Track> topTrackAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
            this.nameAdapter = c5987p.a(String.class);
            this.topTrackAdapter = c5987p.a(Track.class);
            this.isSelectedAdapter = c5987p.a(Boolean.class);
        }

        public Artist fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            Track track = str2;
            Boolean bool = track;
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
                        track = (Track) this.topTrackAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        bool = (Boolean) this.isSelectedAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Artist(str, str2, track, bool);
        }

        public void toJson(C5983k c5983k, Artist artist) throws IOException {
            c5983k.c();
            c5983k.b("id");
            this.idAdapter.toJson(c5983k, artist.id());
            c5983k.b("name");
            this.nameAdapter.toJson(c5983k, artist.name());
            Track topTrack = artist.topTrack();
            if (topTrack != null) {
                c5983k.b("top_track");
                this.topTrackAdapter.toJson(c5983k, topTrack);
            }
            artist = artist.isSelected();
            if (artist != null) {
                c5983k.b(ManagerWebServices.PARAM_SELECTED);
                this.isSelectedAdapter.toJson(c5983k, artist);
            }
            c5983k.d();
        }
    }

    AutoValue_Artist(String str, String str2, Track track, Boolean bool) {
        super(str, str2, track, bool);
    }
}
