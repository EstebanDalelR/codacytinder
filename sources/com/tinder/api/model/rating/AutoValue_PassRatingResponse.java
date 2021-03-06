package com.tinder.api.model.rating;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import java.io.IOException;

final class AutoValue_PassRatingResponse extends C$AutoValue_PassRatingResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<PassRatingResponse> {
        private static final String[] NAMES = new String[]{"status"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> statusAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.statusAdapter = c5987p.a(Integer.class);
        }

        public PassRatingResponse fromJson(JsonReader jsonReader) throws IOException {
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
            return new AutoValue_PassRatingResponse(num);
        }

        public void toJson(C5983k c5983k, PassRatingResponse passRatingResponse) throws IOException {
            c5983k.c();
            passRatingResponse = passRatingResponse.status();
            if (passRatingResponse != null) {
                c5983k.b("status");
                this.statusAdapter.toJson(c5983k, passRatingResponse);
            }
            c5983k.d();
        }
    }

    AutoValue_PassRatingResponse(Integer num) {
        super(num);
    }
}
