package com.tinder.api.request;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_PhotoOptimizerEnableRequest extends C$AutoValue_PhotoOptimizerEnableRequest {

    public static final class MoshiJsonAdapter extends JsonAdapter<PhotoOptimizerEnableRequest> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_PHOTO_OPTIMIZED};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> photoOptimizerEnabledAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.photoOptimizerEnabledAdapter = c5987p.a(Boolean.class);
        }

        public PhotoOptimizerEnableRequest fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Boolean bool = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        bool = (Boolean) this.photoOptimizerEnabledAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_PhotoOptimizerEnableRequest(bool);
        }

        public void toJson(C5983k c5983k, PhotoOptimizerEnableRequest photoOptimizerEnableRequest) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_PHOTO_OPTIMIZED);
            this.photoOptimizerEnabledAdapter.toJson(c5983k, photoOptimizerEnableRequest.photoOptimizerEnabled());
            c5983k.d();
        }
    }

    AutoValue_PhotoOptimizerEnableRequest(Boolean bool) {
        super(bool);
    }
}
