package com.tinder.api.response;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.response.FastMatchCountResponse.Data;
import com.tinder.api.response.FastMatchCountResponse.Meta;
import java.io.IOException;

final class AutoValue_FastMatchCountResponse extends C$AutoValue_FastMatchCountResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<FastMatchCountResponse> {
        private static final String[] NAMES = new String[]{ManagerWebServices.FB_DATA, ManagerWebServices.PARAM_META};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Data> dataAdapter;
        private final JsonAdapter<Meta> metaAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.dataAdapter = c5987p.a(Data.class);
            this.metaAdapter = c5987p.a(Meta.class);
        }

        public FastMatchCountResponse fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Data data = null;
            Meta meta = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        data = (Data) this.dataAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        meta = (Meta) this.metaAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_FastMatchCountResponse(data, meta);
        }

        public void toJson(C5983k c5983k, FastMatchCountResponse fastMatchCountResponse) throws IOException {
            c5983k.c();
            Data data = fastMatchCountResponse.data();
            if (data != null) {
                c5983k.b(ManagerWebServices.FB_DATA);
                this.dataAdapter.toJson(c5983k, data);
            }
            fastMatchCountResponse = fastMatchCountResponse.meta();
            if (fastMatchCountResponse != null) {
                c5983k.b(ManagerWebServices.PARAM_META);
                this.metaAdapter.toJson(c5983k, fastMatchCountResponse);
            }
            c5983k.d();
        }
    }

    AutoValue_FastMatchCountResponse(Data data, Meta meta) {
        super(data, meta);
    }
}
