package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.SpotifyThemeTrack.Album;
import com.tinder.api.model.common.SpotifyThemeTrack.Image;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_SpotifyThemeTrack_Album extends C$AutoValue_SpotifyThemeTrack_Album {

    public static final class MoshiJsonAdapter extends JsonAdapter<Album> {
        private static final String[] NAMES = new String[]{"id", "name", ManagerWebServices.PARAM_SPOTIFY_IMAGES};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<List<Image>> imagesAdapter;
        private final JsonAdapter<String> nameAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
            this.nameAdapter = c5987p.a(String.class);
            this.imagesAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Image.class}));
        }

        public Album fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            List list = str2;
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
                        list = (List) this.imagesAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_SpotifyThemeTrack_Album(str, str2, list);
        }

        public void toJson(C5983k c5983k, Album album) throws IOException {
            c5983k.c();
            String id = album.id();
            if (id != null) {
                c5983k.b("id");
                this.idAdapter.toJson(c5983k, id);
            }
            id = album.name();
            if (id != null) {
                c5983k.b("name");
                this.nameAdapter.toJson(c5983k, id);
            }
            album = album.images();
            if (album != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_IMAGES);
                this.imagesAdapter.toJson(c5983k, album);
            }
            c5983k.d();
        }
    }

    AutoValue_SpotifyThemeTrack_Album(String str, String str2, List<Image> list) {
        super(str, str2, list);
    }
}
