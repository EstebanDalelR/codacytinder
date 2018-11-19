package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.meta.SuperLikes;
import java.io.IOException;

final class AutoValue_Rating extends C$AutoValue_Rating {

    public static final class MoshiJsonAdapter extends JsonAdapter<Rating> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_LIKES_REMAINING, ManagerWebServices.PARAM_RATE_LIMITED_UNTIL, ManagerWebServices.PARAM_SUPERLIKES};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> likesRemainingAdapter;
        private final JsonAdapter<Long> rateLimitUntilAdapter;
        private final JsonAdapter<SuperLikes> superLikesAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.likesRemainingAdapter = c5987p.a(Integer.TYPE);
            this.rateLimitUntilAdapter = c5987p.a(Long.TYPE);
            this.superLikesAdapter = c5987p.a(SuperLikes.class);
        }

        public Rating fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            int i = 0;
            long j = 0;
            SuperLikes superLikes = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        i = ((Integer) this.likesRemainingAdapter.fromJson(jsonReader)).intValue();
                        break;
                    case 1:
                        j = ((Long) this.rateLimitUntilAdapter.fromJson(jsonReader)).longValue();
                        break;
                    case 2:
                        superLikes = (SuperLikes) this.superLikesAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Rating(i, j, superLikes);
        }

        public void toJson(C5983k c5983k, Rating rating) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_LIKES_REMAINING);
            this.likesRemainingAdapter.toJson(c5983k, Integer.valueOf(rating.likesRemaining()));
            c5983k.b(ManagerWebServices.PARAM_RATE_LIMITED_UNTIL);
            this.rateLimitUntilAdapter.toJson(c5983k, Long.valueOf(rating.rateLimitUntil()));
            rating = rating.superLikes();
            if (rating != null) {
                c5983k.b(ManagerWebServices.PARAM_SUPERLIKES);
                this.superLikesAdapter.toJson(c5983k, rating);
            }
            c5983k.d();
        }
    }

    AutoValue_Rating(int i, long j, SuperLikes superLikes) {
        super(i, j, superLikes);
    }
}
