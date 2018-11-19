package com.tinder.api.model.meta;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.meta.Meta.PlacesConfig;
import java.io.IOException;

final class AutoValue_Meta_PlacesConfig extends C$AutoValue_Meta_PlacesConfig {

    public static final class MoshiJsonAdapter extends JsonAdapter<PlacesConfig> {
        private static final String[] NAMES = new String[]{"available"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> isAvailableAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.isAvailableAdapter = c5987p.a(Boolean.class);
        }

        public PlacesConfig fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Boolean bool = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        bool = (Boolean) this.isAvailableAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Meta_PlacesConfig(bool);
        }

        public void toJson(C5983k c5983k, PlacesConfig placesConfig) throws IOException {
            c5983k.c();
            placesConfig = placesConfig.isAvailable();
            if (placesConfig != null) {
                c5983k.b("available");
                this.isAvailableAdapter.toJson(c5983k, placesConfig);
            }
            c5983k.d();
        }
    }

    AutoValue_Meta_PlacesConfig(Boolean bool) {
        super(bool);
    }
}
