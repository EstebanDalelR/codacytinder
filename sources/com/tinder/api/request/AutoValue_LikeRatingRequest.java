package com.tinder.api.request;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_LikeRatingRequest extends C$AutoValue_LikeRatingRequest {

    public static final class MoshiJsonAdapter extends JsonAdapter<LikeRatingRequest> {
        private static final String[] NAMES = new String[]{"photoId", ManagerWebServices.PARAM_CONTENT_HASH, "super", "user_traveling", "rec_traveling", "is_boosting", "fast_match", "top_picks", "undo", "place_id", ManagerWebServices.PARAM_S_NUMBER};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> contentHashAdapter;
        private final JsonAdapter<Integer> didRecUserSuperlikeAdapter;
        private final JsonAdapter<Boolean> isCurrentUserBoostingAdapter;
        private final JsonAdapter<Boolean> isCurrentUserPassportingAdapter;
        private final JsonAdapter<Integer> isFastMatchAdapter;
        private final JsonAdapter<Integer> isTopPicksAdapter;
        private final JsonAdapter<Integer> isUndoAdapter;
        private final JsonAdapter<String> photoIdAdapter;
        private final JsonAdapter<String> placeIdAdapter;
        private final JsonAdapter<Long> sNumberAdapter;
        private final JsonAdapter<Boolean> wasRecUserPassportingAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.photoIdAdapter = c5987p.a(String.class);
            this.contentHashAdapter = c5987p.a(String.class);
            this.didRecUserSuperlikeAdapter = c5987p.a(Integer.class);
            this.wasRecUserPassportingAdapter = c5987p.a(Boolean.class);
            this.isCurrentUserPassportingAdapter = c5987p.a(Boolean.class);
            this.isCurrentUserBoostingAdapter = c5987p.a(Boolean.class);
            this.isFastMatchAdapter = c5987p.a(Integer.class);
            this.isTopPicksAdapter = c5987p.a(Integer.class);
            this.isUndoAdapter = c5987p.a(Integer.class);
            this.placeIdAdapter = c5987p.a(String.class);
            this.sNumberAdapter = c5987p.a(Long.class);
        }

        public LikeRatingRequest fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = str;
            Integer num = str2;
            Boolean bool = num;
            Boolean bool2 = bool;
            Boolean bool3 = bool2;
            Integer num2 = bool3;
            Integer num3 = num2;
            Integer num4 = num3;
            String str3 = num4;
            Long l = str3;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.photoIdAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.contentHashAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        num = (Integer) this.didRecUserSuperlikeAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        bool = (Boolean) this.wasRecUserPassportingAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        bool2 = (Boolean) this.isCurrentUserPassportingAdapter.fromJson(jsonReader);
                        break;
                    case 5:
                        bool3 = (Boolean) this.isCurrentUserBoostingAdapter.fromJson(jsonReader);
                        break;
                    case 6:
                        num2 = (Integer) this.isFastMatchAdapter.fromJson(jsonReader);
                        break;
                    case 7:
                        num3 = (Integer) this.isTopPicksAdapter.fromJson(jsonReader);
                        break;
                    case 8:
                        num4 = (Integer) this.isUndoAdapter.fromJson(jsonReader);
                        break;
                    case 9:
                        str3 = (String) this.placeIdAdapter.fromJson(jsonReader);
                        break;
                    case 10:
                        l = (Long) this.sNumberAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_LikeRatingRequest(str, str2, num, bool, bool2, bool3, num2, num3, num4, str3, l);
        }

        public void toJson(C5983k c5983k, LikeRatingRequest likeRatingRequest) throws IOException {
            c5983k.c();
            String photoId = likeRatingRequest.photoId();
            if (photoId != null) {
                c5983k.b("photoId");
                this.photoIdAdapter.toJson(c5983k, photoId);
            }
            photoId = likeRatingRequest.contentHash();
            if (photoId != null) {
                c5983k.b(ManagerWebServices.PARAM_CONTENT_HASH);
                this.contentHashAdapter.toJson(c5983k, photoId);
            }
            Integer didRecUserSuperlike = likeRatingRequest.didRecUserSuperlike();
            if (didRecUserSuperlike != null) {
                c5983k.b("super");
                this.didRecUserSuperlikeAdapter.toJson(c5983k, didRecUserSuperlike);
            }
            Boolean wasRecUserPassporting = likeRatingRequest.wasRecUserPassporting();
            if (wasRecUserPassporting != null) {
                c5983k.b("user_traveling");
                this.wasRecUserPassportingAdapter.toJson(c5983k, wasRecUserPassporting);
            }
            wasRecUserPassporting = likeRatingRequest.isCurrentUserPassporting();
            if (wasRecUserPassporting != null) {
                c5983k.b("rec_traveling");
                this.isCurrentUserPassportingAdapter.toJson(c5983k, wasRecUserPassporting);
            }
            wasRecUserPassporting = likeRatingRequest.isCurrentUserBoosting();
            if (wasRecUserPassporting != null) {
                c5983k.b("is_boosting");
                this.isCurrentUserBoostingAdapter.toJson(c5983k, wasRecUserPassporting);
            }
            didRecUserSuperlike = likeRatingRequest.isFastMatch();
            if (didRecUserSuperlike != null) {
                c5983k.b("fast_match");
                this.isFastMatchAdapter.toJson(c5983k, didRecUserSuperlike);
            }
            didRecUserSuperlike = likeRatingRequest.isTopPicks();
            if (didRecUserSuperlike != null) {
                c5983k.b("top_picks");
                this.isTopPicksAdapter.toJson(c5983k, didRecUserSuperlike);
            }
            didRecUserSuperlike = likeRatingRequest.isUndo();
            if (didRecUserSuperlike != null) {
                c5983k.b("undo");
                this.isUndoAdapter.toJson(c5983k, didRecUserSuperlike);
            }
            photoId = likeRatingRequest.placeId();
            if (photoId != null) {
                c5983k.b("place_id");
                this.placeIdAdapter.toJson(c5983k, photoId);
            }
            likeRatingRequest = likeRatingRequest.sNumber();
            if (likeRatingRequest != null) {
                c5983k.b(ManagerWebServices.PARAM_S_NUMBER);
                this.sNumberAdapter.toJson(c5983k, likeRatingRequest);
            }
            c5983k.d();
        }
    }

    AutoValue_LikeRatingRequest(String str, String str2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, Integer num3, Integer num4, String str3, Long l) {
        super(str, str2, num, bool, bool2, bool3, num2, num3, num4, str3, l);
    }
}
