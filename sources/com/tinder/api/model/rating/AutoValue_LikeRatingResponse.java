package com.tinder.api.model.rating;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonQualifier;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.ApiMatch;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.LinkedHashSet;
import java.util.Set;

final class AutoValue_LikeRatingResponse extends C$AutoValue_LikeRatingResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<LikeRatingResponse> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_LIKES_REMAINING, ManagerWebServices.PARAM_RATE_LIMITED_UNTIL, "match"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> likesRemainingAdapter;
        private final JsonAdapter<ApiMatch> matchAdapter;
        private final JsonAdapter<Long> rateLimitUntilAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.likesRemainingAdapter = c5987p.a(Integer.class);
            this.rateLimitUntilAdapter = c5987p.a(Long.class);
            this.matchAdapter = adapter(c5987p, "match", null);
        }

        public LikeRatingResponse fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Integer num = null;
            Long l = null;
            ApiMatch apiMatch = l;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) this.likesRemainingAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        l = (Long) this.rateLimitUntilAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        apiMatch = (ApiMatch) this.matchAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_LikeRatingResponse(num, l, apiMatch);
        }

        public void toJson(C5983k c5983k, LikeRatingResponse likeRatingResponse) throws IOException {
            c5983k.c();
            Integer likesRemaining = likeRatingResponse.likesRemaining();
            if (likesRemaining != null) {
                c5983k.b(ManagerWebServices.PARAM_LIKES_REMAINING);
                this.likesRemainingAdapter.toJson(c5983k, likesRemaining);
            }
            Long rateLimitUntil = likeRatingResponse.rateLimitUntil();
            if (rateLimitUntil != null) {
                c5983k.b(ManagerWebServices.PARAM_RATE_LIMITED_UNTIL);
                this.rateLimitUntilAdapter.toJson(c5983k, rateLimitUntil);
            }
            likeRatingResponse = likeRatingResponse.match();
            if (likeRatingResponse != null) {
                c5983k.b("match");
                this.matchAdapter.toJson(c5983k, likeRatingResponse);
            }
            c5983k.d();
        }

        private JsonAdapter adapter(C5987p c5987p, String str, Type type) {
            try {
                Method method = LikeRatingResponse.class.getMethod(str, new Class[0]);
                Set linkedHashSet = new LinkedHashSet();
                for (Annotation annotation : method.getAnnotations()) {
                    if (annotation.annotationType().isAnnotationPresent(JsonQualifier.class)) {
                        linkedHashSet.add(annotation);
                    }
                }
                Type genericReturnType = method.getGenericReturnType();
                if (type != null) {
                    if (genericReturnType instanceof ParameterizedType) {
                        type = C5992r.a(((ParameterizedType) genericReturnType).getRawType(), new Type[]{type});
                    } else if (genericReturnType instanceof TypeVariable) {
                    }
                    return c5987p.a(type, linkedHashSet);
                }
                type = genericReturnType;
                return c5987p.a(type, linkedHashSet);
            } catch (C5987p c5987p2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No method named ");
                stringBuilder.append(str);
                throw new RuntimeException(stringBuilder.toString(), c5987p2);
            }
        }
    }

    AutoValue_LikeRatingResponse(Integer num, Long l, ApiMatch apiMatch) {
        super(num, l, apiMatch);
    }
}
