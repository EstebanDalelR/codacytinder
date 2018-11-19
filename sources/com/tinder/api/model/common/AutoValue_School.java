package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import java.io.IOException;

final class AutoValue_School extends C$AutoValue_School {

    public static final class MoshiJsonAdapter extends JsonAdapter<School> {
        private static final String[] NAMES = new String[]{"name", "id", "displayed"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> displayedAdapter;
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<String> nameAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.nameAdapter = c5987p.a(String.class);
            this.idAdapter = c5987p.a(String.class);
            this.displayedAdapter = c5987p.a(Boolean.class);
        }

        public School fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            Boolean bool = str2;
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
                        bool = (Boolean) this.displayedAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_School(str, str2, bool);
        }

        public void toJson(C5983k c5983k, School school) throws IOException {
            c5983k.c();
            String name = school.name();
            if (name != null) {
                c5983k.b("name");
                this.nameAdapter.toJson(c5983k, name);
            }
            name = school.id();
            if (name != null) {
                c5983k.b("id");
                this.idAdapter.toJson(c5983k, name);
            }
            school = school.displayed();
            if (school != null) {
                c5983k.b("displayed");
                this.displayedAdapter.toJson(c5983k, school);
            }
            c5983k.d();
        }
    }

    AutoValue_School(String str, String str2, Boolean bool) {
        super(str, str2, bool);
    }
}
