package com.tinder.api.response;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.response.FastMatchCountResponse.Meta;
import java.io.IOException;

final class AutoValue_FastMatchCountResponse_Meta extends C$AutoValue_FastMatchCountResponse_Meta {

    public static final class MoshiJsonAdapter extends JsonAdapter<Meta> {
        private static final String[] NAMES = new String[]{"status"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> statusAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.statusAdapter = c5987p.a(Integer.class);
        }

        public Meta fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Integer num = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) this.statusAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_FastMatchCountResponse_Meta(num);
        }

        public void toJson(C5983k c5983k, Meta meta) throws IOException {
            c5983k.c();
            meta = meta.status();
            if (meta != null) {
                c5983k.b("status");
                this.statusAdapter.toJson(c5983k, meta);
            }
            c5983k.d();
        }
    }

    AutoValue_FastMatchCountResponse_Meta(Integer num) {
        super(num);
    }
}
