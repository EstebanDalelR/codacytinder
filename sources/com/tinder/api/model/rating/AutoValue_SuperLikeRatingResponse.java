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
import com.tinder.api.model.meta.SuperLikes;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.LinkedHashSet;
import java.util.Set;

final class AutoValue_SuperLikeRatingResponse extends C$AutoValue_SuperLikeRatingResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<SuperLikeRatingResponse> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_SUPERLIKE_LIMIT_EXCEEDED, "status", "match", ManagerWebServices.PARAM_SUPERLIKES};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> limitExceededAdapter;
        private final JsonAdapter<ApiMatch> matchAdapter;
        private final JsonAdapter<Integer> statusAdapter;
        private final JsonAdapter<SuperLikes> superLikesAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.limitExceededAdapter = c5987p.a(Boolean.class);
            this.statusAdapter = c5987p.a(Integer.class);
            this.matchAdapter = adapter(c5987p, "match", null);
            this.superLikesAdapter = c5987p.a(SuperLikes.class);
        }

        public SuperLikeRatingResponse fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Boolean bool = null;
            Integer num = null;
            ApiMatch apiMatch = num;
            SuperLikes superLikes = apiMatch;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        bool = (Boolean) this.limitExceededAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        num = (Integer) this.statusAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        apiMatch = (ApiMatch) this.matchAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        superLikes = (SuperLikes) this.superLikesAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_SuperLikeRatingResponse(bool, num, apiMatch, superLikes);
        }

        public void toJson(C5983k c5983k, SuperLikeRatingResponse superLikeRatingResponse) throws IOException {
            c5983k.c();
            Boolean limitExceeded = superLikeRatingResponse.limitExceeded();
            if (limitExceeded != null) {
                c5983k.b(ManagerWebServices.PARAM_SUPERLIKE_LIMIT_EXCEEDED);
                this.limitExceededAdapter.toJson(c5983k, limitExceeded);
            }
            Integer status = superLikeRatingResponse.status();
            if (status != null) {
                c5983k.b("status");
                this.statusAdapter.toJson(c5983k, status);
            }
            ApiMatch match = superLikeRatingResponse.match();
            if (match != null) {
                c5983k.b("match");
                this.matchAdapter.toJson(c5983k, match);
            }
            superLikeRatingResponse = superLikeRatingResponse.superLikes();
            if (superLikeRatingResponse != null) {
                c5983k.b(ManagerWebServices.PARAM_SUPERLIKES);
                this.superLikesAdapter.toJson(c5983k, superLikeRatingResponse);
            }
            c5983k.d();
        }

        private JsonAdapter adapter(C5987p c5987p, String str, Type type) {
            try {
                Method method = SuperLikeRatingResponse.class.getMethod(str, new Class[0]);
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

    AutoValue_SuperLikeRatingResponse(Boolean bool, Integer num, ApiMatch apiMatch, SuperLikes superLikes) {
        super(bool, num, apiMatch, superLikes);
    }
}
