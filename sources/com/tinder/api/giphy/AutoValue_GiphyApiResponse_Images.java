package com.tinder.api.giphy;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.giphy.GiphyApiResponse.Image;
import com.tinder.api.giphy.GiphyApiResponse.Images;
import java.io.IOException;

final class AutoValue_GiphyApiResponse_Images extends C$AutoValue_GiphyApiResponse_Images {

    public static final class MoshiJsonAdapter extends JsonAdapter<Images> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_GIF_URL};
        private static final C5971a OPTIONS = C5971a.m25580a(NAMES);
        private final JsonAdapter<Image> fixedHeightImageAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.fixedHeightImageAdapter = c5987p.m25666a(Image.class);
        }

        public Images fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.mo6451e();
            Image image = null;
            while (jsonReader.mo6453g()) {
                switch (jsonReader.mo6447a(OPTIONS)) {
                    case -1:
                        jsonReader.mo6455i();
                        jsonReader.mo6462p();
                        break;
                    case 0:
                        image = (Image) this.fixedHeightImageAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.mo6452f();
            return new AutoValue_GiphyApiResponse_Images(image);
        }

        public void toJson(C5983k c5983k, Images images) throws IOException {
            c5983k.mo6472c();
            Object fixedHeightImage = images.fixedHeightImage();
            if (fixedHeightImage != null) {
                c5983k.mo6471b(ManagerWebServices.PARAM_GIF_URL);
                this.fixedHeightImageAdapter.toJson(c5983k, fixedHeightImage);
            }
            c5983k.mo6474d();
        }
    }

    AutoValue_GiphyApiResponse_Images(Image image) {
        super(image);
    }
}
