package com.tinder.api.response;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.meta.SuperLikes;
import java.io.IOException;

final class AutoValue_SuperlikeStatusInfoResponse extends C$AutoValue_SuperlikeStatusInfoResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<SuperlikeStatusInfoResponse> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_RESULTS};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<SuperLikes> superLikeInfoAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.superLikeInfoAdapter = c5987p.a(SuperLikes.class);
        }

        public SuperlikeStatusInfoResponse fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            SuperLikes superLikes = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        superLikes = (SuperLikes) this.superLikeInfoAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_SuperlikeStatusInfoResponse(superLikes);
        }

        public void toJson(C5983k c5983k, SuperlikeStatusInfoResponse superlikeStatusInfoResponse) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_RESULTS);
            this.superLikeInfoAdapter.toJson(c5983k, superlikeStatusInfoResponse.superLikeInfo());
            c5983k.d();
        }
    }

    AutoValue_SuperlikeStatusInfoResponse(SuperLikes superLikes) {
        super(superLikes);
    }
}
