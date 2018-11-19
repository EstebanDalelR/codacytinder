package com.tinder.api.model.meta;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.meta.Meta.ClientResources;
import com.tinder.api.model.meta.Meta.ClientResources.RateCard;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Meta_ClientResources extends C$AutoValue_Meta_ClientResources {

    public static final class MoshiJsonAdapter extends JsonAdapter<ClientResources> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_RATE_CARD, ManagerWebServices.PARAM_PLUS_SCREEN};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<List<String>> plusScreenAdapter;
        private final JsonAdapter<RateCard> rateCardAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.rateCardAdapter = c5987p.a(RateCard.class);
            this.plusScreenAdapter = c5987p.a(C5992r.a(List.class, new Type[]{String.class}));
        }

        public ClientResources fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            RateCard rateCard = null;
            List list = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        rateCard = (RateCard) this.rateCardAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        list = (List) this.plusScreenAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Meta_ClientResources(rateCard, list);
        }

        public void toJson(C5983k c5983k, ClientResources clientResources) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_RATE_CARD);
            this.rateCardAdapter.toJson(c5983k, clientResources.rateCard());
            c5983k.b(ManagerWebServices.PARAM_PLUS_SCREEN);
            this.plusScreenAdapter.toJson(c5983k, clientResources.plusScreen());
            c5983k.d();
        }
    }

    AutoValue_Meta_ClientResources(RateCard rateCard, List<String> list) {
        super(rateCard, list);
    }
}
