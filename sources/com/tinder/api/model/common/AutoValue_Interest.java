package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import java.io.IOException;

final class AutoValue_Interest extends C$AutoValue_Interest {

    public static final class MoshiJsonAdapter extends JsonAdapter<Interest> {
        private static final String[] NAMES = new String[]{"name", "id", "created_time"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> createdTimeAdapter;
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<String> nameAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.nameAdapter = c5987p.a(String.class);
            this.idAdapter = c5987p.a(String.class);
            this.createdTimeAdapter = c5987p.a(String.class);
        }

        public Interest fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            String str3 = str2;
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
                    case 2:
                        str3 = (String) this.createdTimeAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Interest(str, str2, str3);
        }

        public void toJson(C5983k c5983k, Interest interest) throws IOException {
            c5983k.c();
            String name = interest.name();
            if (name != null) {
                c5983k.b("name");
                this.nameAdapter.toJson(c5983k, name);
            }
            name = interest.id();
            if (name != null) {
                c5983k.b("id");
                this.idAdapter.toJson(c5983k, name);
            }
            interest = interest.createdTime();
            if (interest != null) {
                c5983k.b("created_time");
                this.createdTimeAdapter.toJson(c5983k, interest);
            }
            c5983k.d();
        }
    }

    AutoValue_Interest(String str, String str2, String str3) {
        super(str, str2, str3);
    }
}
