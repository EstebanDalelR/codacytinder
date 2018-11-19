package com.tinder.api.response;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.User;
import java.io.IOException;

final class AutoValue_UserResponse extends C$AutoValue_UserResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<UserResponse> {
        private static final String[] NAMES = new String[]{"status", ManagerWebServices.PARAM_RESULTS};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<User> getUserAdapter;
        private final JsonAdapter<Integer> statusAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.statusAdapter = c5987p.a(Integer.class);
            this.getUserAdapter = c5987p.a(User.class);
        }

        public UserResponse fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Integer num = null;
            User user = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) this.statusAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        user = (User) this.getUserAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_UserResponse(num, user);
        }

        public void toJson(C5983k c5983k, UserResponse userResponse) throws IOException {
            c5983k.c();
            Integer status = userResponse.status();
            if (status != null) {
                c5983k.b("status");
                this.statusAdapter.toJson(c5983k, status);
            }
            c5983k.b(ManagerWebServices.PARAM_RESULTS);
            this.getUserAdapter.toJson(c5983k, userResponse.getUser());
            c5983k.d();
        }
    }

    AutoValue_UserResponse(Integer num, User user) {
        super(num, user);
    }
}
