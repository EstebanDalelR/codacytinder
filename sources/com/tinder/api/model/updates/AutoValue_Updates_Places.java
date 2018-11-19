package com.tinder.api.model.updates;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.updates.Updates.Places;
import java.io.IOException;

final class AutoValue_Updates_Places extends C$AutoValue_Updates_Places {

    public static final class MoshiJsonAdapter extends JsonAdapter<Places> {
        private static final String[] NAMES = new String[]{"has_new"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> hasNewAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.hasNewAdapter = c5987p.a(Boolean.class);
        }

        public Places fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Boolean bool = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        bool = (Boolean) this.hasNewAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Updates_Places(bool);
        }

        public void toJson(C5983k c5983k, Places places) throws IOException {
            c5983k.c();
            places = places.hasNew();
            if (places != null) {
                c5983k.b("has_new");
                this.hasNewAdapter.toJson(c5983k, places);
            }
            c5983k.d();
        }
    }

    AutoValue_Updates_Places(Boolean bool) {
        super(bool);
    }
}
