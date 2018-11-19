package com.tinder.api.request;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_HideProfileItemsRequestBody extends C$AutoValue_HideProfileItemsRequestBody {

    public static final class MoshiJsonAdapter extends JsonAdapter<HideProfileItemsRequestBody> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_HIDE_AGE, ManagerWebServices.PARAM_HIDE_ADS, ManagerWebServices.PARAM_HIDE_DISTANCE};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> hideAdsAdapter;
        private final JsonAdapter<Boolean> hideAgeAdapter;
        private final JsonAdapter<Boolean> hideDistanceAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.hideAgeAdapter = c5987p.a(Boolean.class);
            this.hideAdsAdapter = c5987p.a(Boolean.class);
            this.hideDistanceAdapter = c5987p.a(Boolean.class);
        }

        public HideProfileItemsRequestBody fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = bool2;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        bool = (Boolean) this.hideAgeAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        bool2 = (Boolean) this.hideAdsAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        bool3 = (Boolean) this.hideDistanceAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_HideProfileItemsRequestBody(bool, bool2, bool3);
        }

        public void toJson(C5983k c5983k, HideProfileItemsRequestBody hideProfileItemsRequestBody) throws IOException {
            c5983k.c();
            Boolean hideAge = hideProfileItemsRequestBody.hideAge();
            if (hideAge != null) {
                c5983k.b(ManagerWebServices.PARAM_HIDE_AGE);
                this.hideAgeAdapter.toJson(c5983k, hideAge);
            }
            hideAge = hideProfileItemsRequestBody.hideAds();
            if (hideAge != null) {
                c5983k.b(ManagerWebServices.PARAM_HIDE_ADS);
                this.hideAdsAdapter.toJson(c5983k, hideAge);
            }
            hideProfileItemsRequestBody = hideProfileItemsRequestBody.hideDistance();
            if (hideProfileItemsRequestBody != null) {
                c5983k.b(ManagerWebServices.PARAM_HIDE_DISTANCE);
                this.hideDistanceAdapter.toJson(c5983k, hideProfileItemsRequestBody);
            }
            c5983k.d();
        }
    }

    AutoValue_HideProfileItemsRequestBody(Boolean bool, Boolean bool2, Boolean bool3) {
        super(bool, bool2, bool3);
    }
}
