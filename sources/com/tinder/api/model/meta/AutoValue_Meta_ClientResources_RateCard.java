package com.tinder.api.model.meta;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.meta.Meta.ClientResources.RateCard;
import com.tinder.api.model.meta.Meta.ClientResources.RateCard.Carousel;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Meta_ClientResources_RateCard extends C$AutoValue_Meta_ClientResources_RateCard {

    public static final class MoshiJsonAdapter extends JsonAdapter<RateCard> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_CAROUSEL};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<List<Carousel>> carouselAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.carouselAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Carousel.class}));
        }

        public RateCard fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            List list = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        list = (List) this.carouselAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Meta_ClientResources_RateCard(list);
        }

        public void toJson(C5983k c5983k, RateCard rateCard) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_CAROUSEL);
            this.carouselAdapter.toJson(c5983k, rateCard.carousel());
            c5983k.d();
        }
    }

    AutoValue_Meta_ClientResources_RateCard(List<Carousel> list) {
        super(list);
    }
}
