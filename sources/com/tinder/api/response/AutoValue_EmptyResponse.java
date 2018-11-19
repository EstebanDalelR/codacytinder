package com.tinder.api.response;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import java.io.IOException;

final class AutoValue_EmptyResponse extends C$AutoValue_EmptyResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<EmptyResponse> {
        private static final String[] NAMES = new String[]{"code", "message"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> codeAdapter;
        private final JsonAdapter<String> messageAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.codeAdapter = c5987p.a(Integer.class);
            this.messageAdapter = c5987p.a(String.class);
        }

        public EmptyResponse fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Integer num = null;
            String str = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) this.codeAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str = (String) this.messageAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_EmptyResponse(num, str);
        }

        public void toJson(C5983k c5983k, EmptyResponse emptyResponse) throws IOException {
            c5983k.c();
            c5983k.b("code");
            this.codeAdapter.toJson(c5983k, emptyResponse.code());
            c5983k.b("message");
            this.messageAdapter.toJson(c5983k, emptyResponse.message());
            c5983k.d();
        }
    }

    AutoValue_EmptyResponse(Integer num, String str) {
        super(num, str);
    }
}
