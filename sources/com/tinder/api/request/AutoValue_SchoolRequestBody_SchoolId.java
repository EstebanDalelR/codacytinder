package com.tinder.api.request;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.request.SchoolRequestBody.SchoolId;
import java.io.IOException;

final class AutoValue_SchoolRequestBody_SchoolId extends C$AutoValue_SchoolRequestBody_SchoolId {

    public static final class MoshiJsonAdapter extends JsonAdapter<SchoolId> {
        private static final String[] NAMES = new String[]{"id"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> idAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
        }

        public SchoolId fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.idAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_SchoolRequestBody_SchoolId(str);
        }

        public void toJson(C5983k c5983k, SchoolId schoolId) throws IOException {
            c5983k.c();
            schoolId = schoolId.id();
            if (schoolId != null) {
                c5983k.b("id");
                this.idAdapter.toJson(c5983k, schoolId);
            }
            c5983k.d();
        }
    }

    AutoValue_SchoolRequestBody_SchoolId(String str) {
        super(str);
    }
}
