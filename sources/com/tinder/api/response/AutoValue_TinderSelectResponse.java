package com.tinder.api.response;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.TinderSelect;
import com.tinder.api.response.v2.ResponseError;
import java.io.IOException;

final class AutoValue_TinderSelectResponse extends C$AutoValue_TinderSelectResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<TinderSelectResponse> {
        private static final String[] NAMES = new String[]{ManagerWebServices.FB_DATA, "error"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<ResponseError> errorAdapter;
        private final JsonAdapter<TinderSelect> tinderSelectAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.tinderSelectAdapter = c5987p.a(TinderSelect.class);
            this.errorAdapter = c5987p.a(ResponseError.class);
        }

        public TinderSelectResponse fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            TinderSelect tinderSelect = null;
            ResponseError responseError = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        tinderSelect = (TinderSelect) this.tinderSelectAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        responseError = (ResponseError) this.errorAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_TinderSelectResponse(tinderSelect, responseError);
        }

        public void toJson(C5983k c5983k, TinderSelectResponse tinderSelectResponse) throws IOException {
            c5983k.c();
            TinderSelect tinderSelect = tinderSelectResponse.tinderSelect();
            if (tinderSelect != null) {
                c5983k.b(ManagerWebServices.FB_DATA);
                this.tinderSelectAdapter.toJson(c5983k, tinderSelect);
            }
            tinderSelectResponse = tinderSelectResponse.error();
            if (tinderSelectResponse != null) {
                c5983k.b("error");
                this.errorAdapter.toJson(c5983k, tinderSelectResponse);
            }
            c5983k.d();
        }
    }

    AutoValue_TinderSelectResponse(TinderSelect tinderSelect, ResponseError responseError) {
        super(tinderSelect, responseError);
    }
}
