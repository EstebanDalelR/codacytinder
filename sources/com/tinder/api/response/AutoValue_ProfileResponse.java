package com.tinder.api.response;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.response.ProfileResponse.ResponseData;
import java.io.IOException;

final class AutoValue_ProfileResponse extends C$AutoValue_ProfileResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<ProfileResponse> {
        private static final String[] NAMES = new String[]{ManagerWebServices.FB_DATA};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<ResponseData> responseDataAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.responseDataAdapter = c5987p.a(ResponseData.class);
        }

        public ProfileResponse fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            ResponseData responseData = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        responseData = (ResponseData) this.responseDataAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_ProfileResponse(responseData);
        }

        public void toJson(C5983k c5983k, ProfileResponse profileResponse) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.FB_DATA);
            this.responseDataAdapter.toJson(c5983k, profileResponse.responseData());
            c5983k.d();
        }
    }

    AutoValue_ProfileResponse(ResponseData responseData) {
        super(responseData);
    }
}
