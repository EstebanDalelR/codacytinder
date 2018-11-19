package com.tinder.api.model.auth;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_AccountKitValidateRequest extends C$AutoValue_AccountKitValidateRequest {

    public static final class MoshiJsonAdapter extends JsonAdapter<AccountKitValidateRequest> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_TOKEN};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> tokenAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.tokenAdapter = c5987p.a(String.class);
        }

        public AccountKitValidateRequest fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.tokenAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_AccountKitValidateRequest(str);
        }

        public void toJson(C5983k c5983k, AccountKitValidateRequest accountKitValidateRequest) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_TOKEN);
            this.tokenAdapter.toJson(c5983k, accountKitValidateRequest.token());
            c5983k.d();
        }
    }

    AutoValue_AccountKitValidateRequest(String str) {
        super(str);
    }
}
