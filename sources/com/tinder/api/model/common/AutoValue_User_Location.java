package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.common.User.Location;
import java.io.IOException;

final class AutoValue_User_Location extends C$AutoValue_User_Location {

    public static final class MoshiJsonAdapter extends JsonAdapter<Location> {
        private static final String[] NAMES = new String[]{"name", "id"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<String> nameAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.nameAdapter = c5987p.a(String.class);
            this.idAdapter = c5987p.a(String.class);
        }

        public Location fromJson(JsonReader jsonReader) throws IOException {
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
                        str = (String) this.nameAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.idAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_User_Location(str, str2);
        }

        public void toJson(C5983k c5983k, Location location) throws IOException {
            c5983k.c();
            String name = location.name();
            if (name != null) {
                c5983k.b("name");
                this.nameAdapter.toJson(c5983k, name);
            }
            location = location.id();
            if (location != null) {
                c5983k.b("id");
                this.idAdapter.toJson(c5983k, location);
            }
            c5983k.d();
        }
    }

    AutoValue_User_Location(String str, String str2) {
        super(str, str2);
    }
}
