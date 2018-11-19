package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.common.SpotifyThemeTrack.Image;
import java.io.IOException;

final class AutoValue_SpotifyThemeTrack_Image extends C$AutoValue_SpotifyThemeTrack_Image {

    public static final class MoshiJsonAdapter extends JsonAdapter<Image> {
        private static final String[] NAMES = new String[]{"width", "height", "url"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> heightAdapter;
        private final JsonAdapter<String> urlAdapter;
        private final JsonAdapter<Integer> widthAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.widthAdapter = c5987p.a(Integer.class);
            this.heightAdapter = c5987p.a(Integer.class);
            this.urlAdapter = c5987p.a(String.class);
        }

        public Image fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Integer num = null;
            Integer num2 = null;
            String str = num2;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) this.widthAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        num2 = (Integer) this.heightAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str = (String) this.urlAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_SpotifyThemeTrack_Image(num, num2, str);
        }

        public void toJson(C5983k c5983k, Image image) throws IOException {
            c5983k.c();
            Integer width = image.width();
            if (width != null) {
                c5983k.b("width");
                this.widthAdapter.toJson(c5983k, width);
            }
            width = image.height();
            if (width != null) {
                c5983k.b("height");
                this.heightAdapter.toJson(c5983k, width);
            }
            image = image.url();
            if (image != null) {
                c5983k.b("url");
                this.urlAdapter.toJson(c5983k, image);
            }
            c5983k.d();
        }
    }

    AutoValue_SpotifyThemeTrack_Image(Integer num, Integer num2, String str) {
        super(num, num2, str);
    }
}
