package com.tinder.api.giphy;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.giphy.GiphyApiResponse.Image;
import java.io.IOException;

final class AutoValue_GiphyApiResponse_Image extends C$AutoValue_GiphyApiResponse_Image {

    public static final class MoshiJsonAdapter extends JsonAdapter<Image> {
        private static final String[] NAMES = new String[]{"url", "width", "height"};
        private static final C5971a OPTIONS = C5971a.m25580a(NAMES);
        private final JsonAdapter<Integer> heightAdapter;
        private final JsonAdapter<String> urlAdapter;
        private final JsonAdapter<Integer> widthAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.urlAdapter = c5987p.m25666a(String.class);
            this.widthAdapter = c5987p.m25666a(Integer.TYPE);
            this.heightAdapter = c5987p.m25666a(Integer.TYPE);
        }

        public Image fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.mo6451e();
            int i = 0;
            String str = null;
            int i2 = 0;
            while (jsonReader.mo6453g()) {
                switch (jsonReader.mo6447a(OPTIONS)) {
                    case -1:
                        jsonReader.mo6455i();
                        jsonReader.mo6462p();
                        break;
                    case 0:
                        str = (String) this.urlAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        i = ((Integer) this.widthAdapter.fromJson(jsonReader)).intValue();
                        break;
                    case 2:
                        i2 = ((Integer) this.heightAdapter.fromJson(jsonReader)).intValue();
                        break;
                    default:
                        break;
                }
            }
            jsonReader.mo6452f();
            return new AutoValue_GiphyApiResponse_Image(str, i, i2);
        }

        public void toJson(C5983k c5983k, Image image) throws IOException {
            c5983k.mo6472c();
            Object url = image.url();
            if (url != null) {
                c5983k.mo6471b("url");
                this.urlAdapter.toJson(c5983k, url);
            }
            c5983k.mo6471b("width");
            this.widthAdapter.toJson(c5983k, Integer.valueOf(image.width()));
            c5983k.mo6471b("height");
            this.heightAdapter.toJson(c5983k, Integer.valueOf(image.height()));
            c5983k.mo6474d();
        }
    }

    AutoValue_GiphyApiResponse_Image(String str, int i, int i2) {
        super(str, i, i2);
    }
}
