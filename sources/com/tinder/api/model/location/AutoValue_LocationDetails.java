package com.tinder.api.model.location;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_LocationDetails extends C$AutoValue_LocationDetails {

    public static final class MoshiJsonAdapter extends JsonAdapter<LocationDetails> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_SHORT_NAME, ManagerWebServices.PARAM_LONG_NAME};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> longNameAdapter;
        private final JsonAdapter<String> shortNameAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.shortNameAdapter = c5987p.a(String.class);
            this.longNameAdapter = c5987p.a(String.class);
        }

        public LocationDetails fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.shortNameAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.longNameAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_LocationDetails(str, str2);
        }

        public void toJson(C5983k c5983k, LocationDetails locationDetails) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_SHORT_NAME);
            this.shortNameAdapter.toJson(c5983k, locationDetails.shortName());
            c5983k.b(ManagerWebServices.PARAM_LONG_NAME);
            this.longNameAdapter.toJson(c5983k, locationDetails.longName());
            c5983k.d();
        }
    }

    AutoValue_LocationDetails(String str, String str2) {
        super(str, str2);
    }
}
