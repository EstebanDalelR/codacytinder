package com.tinder.api.model.meta;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.meta.Meta.ClientResources.RateCard.Carousel;
import java.io.IOException;

final class AutoValue_Meta_ClientResources_RateCard_Carousel extends C$AutoValue_Meta_ClientResources_RateCard_Carousel {

    public static final class MoshiJsonAdapter extends JsonAdapter<Carousel> {
        private static final String[] NAMES = new String[]{"slug"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> slugAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.slugAdapter = c5987p.a(String.class);
        }

        public Carousel fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.slugAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Meta_ClientResources_RateCard_Carousel(str);
        }

        public void toJson(C5983k c5983k, Carousel carousel) throws IOException {
            c5983k.c();
            c5983k.b("slug");
            this.slugAdapter.toJson(c5983k, carousel.slug());
            c5983k.d();
        }
    }

    AutoValue_Meta_ClientResources_RateCard_Carousel(String str) {
        super(str);
    }
}
