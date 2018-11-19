package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.common.Job.Title;
import java.io.IOException;

final class AutoValue_Job_Title extends C$AutoValue_Job_Title {

    public static final class MoshiJsonAdapter extends JsonAdapter<Title> {
        private static final String[] NAMES = new String[]{"id", "name", "displayed"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> displayedAdapter;
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<String> nameAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
            this.nameAdapter = c5987p.a(String.class);
            this.displayedAdapter = c5987p.a(Boolean.class);
        }

        public Title fromJson(JsonReader jsonReader) throws IOException {
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
                        str = (String) this.idAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.nameAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        bool = (Boolean) this.displayedAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Job_Title(str, str2, bool);
        }

        public void toJson(C5983k c5983k, Title title) throws IOException {
            c5983k.c();
            String id = title.id();
            if (id != null) {
                c5983k.b("id");
                this.idAdapter.toJson(c5983k, id);
            }
            id = title.name();
            if (id != null) {
                c5983k.b("name");
                this.nameAdapter.toJson(c5983k, id);
            }
            title = title.displayed();
            if (title != null) {
                c5983k.b("displayed");
                this.displayedAdapter.toJson(c5983k, title);
            }
            c5983k.d();
        }
    }

    AutoValue_Job_Title(String str, String str2, Boolean bool) {
        super(str, str2, bool);
    }
}
