package com.tinder.api.request;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.request.SchoolRequestBody.SchoolId;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_SchoolRequestBody extends C$AutoValue_SchoolRequestBody {

    public static final class MoshiJsonAdapter extends JsonAdapter<SchoolRequestBody> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_SCHOOLS};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<List<SchoolId>> schoolIdListAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.schoolIdListAdapter = c5987p.a(C5992r.a(List.class, new Type[]{SchoolId.class}));
        }

        public SchoolRequestBody fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            List list = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        list = (List) this.schoolIdListAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_SchoolRequestBody(list);
        }

        public void toJson(C5983k c5983k, SchoolRequestBody schoolRequestBody) throws IOException {
            c5983k.c();
            schoolRequestBody = schoolRequestBody.schoolIdList();
            if (schoolRequestBody != null) {
                c5983k.b(ManagerWebServices.PARAM_SCHOOLS);
                this.schoolIdListAdapter.toJson(c5983k, schoolRequestBody);
            }
            c5983k.d();
        }
    }

    AutoValue_SchoolRequestBody(List<SchoolId> list) {
        super(list);
    }
}
