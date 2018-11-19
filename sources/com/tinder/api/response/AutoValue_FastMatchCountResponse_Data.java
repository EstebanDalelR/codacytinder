package com.tinder.api.response;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.response.FastMatchCountResponse.Data;
import java.io.IOException;

final class AutoValue_FastMatchCountResponse_Data extends C$AutoValue_FastMatchCountResponse_Data {

    public static final class MoshiJsonAdapter extends JsonAdapter<Data> {
        private static final String[] NAMES = new String[]{ManagerWebServices.FB_PARAM_FIELD_COUNT, "is_range"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> countAdapter;
        private final JsonAdapter<Boolean> isRangeAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.countAdapter = c5987p.a(Integer.class);
            this.isRangeAdapter = c5987p.a(Boolean.class);
        }

        public Data fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Integer num = null;
            Boolean bool = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) this.countAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        bool = (Boolean) this.isRangeAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_FastMatchCountResponse_Data(num, bool);
        }

        public void toJson(C5983k c5983k, Data data) throws IOException {
            c5983k.c();
            Integer count = data.count();
            if (count != null) {
                c5983k.b(ManagerWebServices.FB_PARAM_FIELD_COUNT);
                this.countAdapter.toJson(c5983k, count);
            }
            data = data.isRange();
            if (data != null) {
                c5983k.b("is_range");
                this.isRangeAdapter.toJson(c5983k, data);
            }
            c5983k.d();
        }
    }

    AutoValue_FastMatchCountResponse_Data(Integer num, Boolean bool) {
        super(num, bool);
    }
}
