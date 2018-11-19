package com.tinder.api.model.profile.spotify;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

final class AutoValue_Album extends C$AutoValue_Album {

    public static final class MoshiJsonAdapter extends JsonAdapter<Album> {
        private static final String[] NAMES = new String[]{"id", "name", ManagerWebServices.PARAM_SPOTIFY_URI, ManagerWebServices.PARAM_SPOTIFY_IMAGES};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<List<Map<String, String>>> imagesAdapter;
        private final JsonAdapter<String> nameAdapter;
        private final JsonAdapter<String> uriAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
            this.nameAdapter = c5987p.a(String.class);
            this.uriAdapter = c5987p.a(String.class);
            Type[] typeArr = new Type[1];
            typeArr[0] = C5992r.a(Map.class, new Type[]{String.class, String.class});
            this.imagesAdapter = c5987p.a(C5992r.a(List.class, typeArr));
        }

        public Album fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            String str3 = str2;
            List list = str3;
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
                        str3 = (String) this.uriAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        list = (List) this.imagesAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Album(str, str2, str3, list);
        }

        public void toJson(C5983k c5983k, Album album) throws IOException {
            c5983k.c();
            c5983k.b("id");
            this.idAdapter.toJson(c5983k, album.id());
            c5983k.b("name");
            this.nameAdapter.toJson(c5983k, album.name());
            String uri = album.uri();
            if (uri != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_URI);
                this.uriAdapter.toJson(c5983k, uri);
            }
            album = album.images();
            if (album != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY_IMAGES);
                this.imagesAdapter.toJson(c5983k, album);
            }
            c5983k.d();
        }
    }

    AutoValue_Album(String str, String str2, String str3, List<Map<String, String>> list) {
        super(str, str2, str3, list);
    }
}
