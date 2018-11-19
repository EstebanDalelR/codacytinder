package com.tinder.api.giphy;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.giphy.GiphyApiResponse.Giphy;
import com.tinder.api.giphy.GiphyApiResponse.Images;
import java.io.IOException;

final class AutoValue_GiphyApiResponse_Giphy extends C$AutoValue_GiphyApiResponse_Giphy {

    public static final class MoshiJsonAdapter extends JsonAdapter<Giphy> {
        private static final String[] NAMES = new String[]{"id", "type", ManagerWebServices.PARAM_SPOTIFY_IMAGES};
        private static final C5971a OPTIONS = C5971a.m25580a(NAMES);
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<Images> imagesAdapter;
        private final JsonAdapter<String> typeAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.m25666a(String.class);
            this.typeAdapter = c5987p.m25666a(String.class);
            this.imagesAdapter = c5987p.m25666a(Images.class);
        }

        public Giphy fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.mo6451e();
            String str = null;
            String str2 = null;
            Images images = str2;
            while (jsonReader.mo6453g()) {
                switch (jsonReader.mo6447a(OPTIONS)) {
                    case -1:
                        jsonReader.mo6455i();
                        jsonReader.mo6462p();
                        break;
                    case 0:
                        str = (String) this.idAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.typeAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        images = (Images) this.imagesAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.mo6452f();
            return new AutoValue_GiphyApiResponse_Giphy(str, str2, images);
        }

        public void toJson(C5983k c5983k, Giphy giphy) throws IOException {
            c5983k.mo6472c();
            Object id = giphy.id();
            if (id != null) {
                c5983k.mo6471b("id");
                this.idAdapter.toJson(c5983k, id);
            }
            id = giphy.type();
            if (id != null) {
                c5983k.mo6471b("type");
                this.typeAdapter.toJson(c5983k, id);
            }
            Object images = giphy.images();
            if (images != null) {
                c5983k.mo6471b(ManagerWebServices.PARAM_SPOTIFY_IMAGES);
                this.imagesAdapter.toJson(c5983k, images);
            }
            c5983k.mo6474d();
        }
    }

    AutoValue_GiphyApiResponse_Giphy(String str, String str2, Images images) {
        super(str, str2, images);
    }
}
