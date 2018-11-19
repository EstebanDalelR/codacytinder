package com.tinder.api.model.auth;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_AuthRequest extends C$AutoValue_AuthRequest {

    public static final class MoshiJsonAdapter extends JsonAdapter<AuthRequest> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_TOKEN, "id", "client_version"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> accessTokenAdapter;
        private final JsonAdapter<String> clientVersionAdapter;
        private final JsonAdapter<String> idAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.accessTokenAdapter = c5987p.a(String.class);
            this.idAdapter = c5987p.a(String.class);
            this.clientVersionAdapter = c5987p.a(String.class);
        }

        public AuthRequest fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            String str3 = str2;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.accessTokenAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.idAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str3 = (String) this.clientVersionAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_AuthRequest(str, str2, str3);
        }

        public void toJson(C5983k c5983k, AuthRequest authRequest) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_TOKEN);
            this.accessTokenAdapter.toJson(c5983k, authRequest.accessToken());
            c5983k.b("id");
            this.idAdapter.toJson(c5983k, authRequest.id());
            c5983k.b("client_version");
            this.clientVersionAdapter.toJson(c5983k, authRequest.clientVersion());
            c5983k.d();
        }
    }

    AutoValue_AuthRequest(String str, String str2, String str3) {
        super(str, str2, str3);
    }
}
