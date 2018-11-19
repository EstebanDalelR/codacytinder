package com.tinder.api.model.recs;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.Instagram;
import com.tinder.api.model.common.Teaser;
import com.tinder.api.model.profile.Facebook;
import com.tinder.api.model.recs.Rec.Spotify;
import com.tinder.api.model.recs.Rec.User;
import com.tinder.api.model.toppicks.Tagging;
import com.tinder.model.analytics.AnalyticsConstants;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Rec extends C$AutoValue_Rec {

    public static final class MoshiJsonAdapter extends JsonAdapter<Rec> {
        private static final String[] NAMES = new String[]{"type", ManagerWebServices.PARAM_USER, ManagerWebServices.IG_PARAM_INSTAGRAM, AnalyticsConstants.VALUE_FACEBOOK, ManagerWebServices.PARAM_SPOTIFY, ManagerWebServices.PARAM_GROUP_MATCHED, ManagerWebServices.PARAM_DISTANCE_MI, ManagerWebServices.PARAM_CONTENT_HASH, ManagerWebServices.PARAM_S_NUMBER, ManagerWebServices.PARAM_IS_BOOST, "is_fast_match", "is_top_pick", ManagerWebServices.PARAM_IS_SUPERLIKE, ManagerWebServices.PARAM_ALREADY_MATCHED, "teasers", "tp_type", "tagging", "expire_time", "is_new"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> contentHashAdapter;
        private final JsonAdapter<Integer> distanceMiAdapter;
        private final JsonAdapter<Long> expirationTimeAdapter;
        private final JsonAdapter<Facebook> facebookAdapter;
        private final JsonAdapter<Instagram> instagramAdapter;
        private final JsonAdapter<Boolean> isAlreadyMatchedAdapter;
        private final JsonAdapter<Boolean> isBoostAdapter;
        private final JsonAdapter<Boolean> isFastMatchAdapter;
        private final JsonAdapter<Boolean> isGroupMatchedAdapter;
        private final JsonAdapter<Boolean> isNewAdapter;
        private final JsonAdapter<Boolean> isSuperLikeAdapter;
        private final JsonAdapter<Boolean> isTopPickAdapter;
        private final JsonAdapter<Long> sNumberAdapter;
        private final JsonAdapter<Spotify> spotifyAdapter;
        private final JsonAdapter<Tagging> taggingAdapter;
        private final JsonAdapter<List<Teaser>> teasersAdapter;
        private final JsonAdapter<Integer> topPickTypeAdapter;
        private final JsonAdapter<String> typeAdapter;
        private final JsonAdapter<User> userAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.typeAdapter = c5987p.a(String.class);
            this.userAdapter = c5987p.a(User.class);
            this.instagramAdapter = c5987p.a(Instagram.class);
            this.facebookAdapter = c5987p.a(Facebook.class);
            this.spotifyAdapter = c5987p.a(Spotify.class);
            this.isGroupMatchedAdapter = c5987p.a(Boolean.class);
            this.distanceMiAdapter = c5987p.a(Integer.class);
            this.contentHashAdapter = c5987p.a(String.class);
            this.sNumberAdapter = c5987p.a(Long.class);
            this.isBoostAdapter = c5987p.a(Boolean.class);
            this.isFastMatchAdapter = c5987p.a(Boolean.class);
            this.isTopPickAdapter = c5987p.a(Boolean.class);
            this.isSuperLikeAdapter = c5987p.a(Boolean.class);
            this.isAlreadyMatchedAdapter = c5987p.a(Boolean.class);
            this.teasersAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Teaser.class}));
            this.topPickTypeAdapter = c5987p.a(Integer.class);
            this.taggingAdapter = c5987p.a(Tagging.class);
            this.expirationTimeAdapter = c5987p.a(Long.class);
            this.isNewAdapter = c5987p.a(Boolean.class);
        }

        public Rec fromJson(JsonReader jsonReader) throws IOException {
            MoshiJsonAdapter moshiJsonAdapter = this;
            JsonReader jsonReader2 = jsonReader;
            jsonReader.e();
            String str = null;
            User user = str;
            Instagram instagram = user;
            Facebook facebook = instagram;
            Spotify spotify = facebook;
            Boolean bool = spotify;
            Integer num = bool;
            String str2 = num;
            Long l = str2;
            Boolean bool2 = l;
            Boolean bool3 = bool2;
            Boolean bool4 = bool3;
            Boolean bool5 = bool4;
            Boolean bool6 = bool5;
            List list = bool6;
            Integer num2 = list;
            Tagging tagging = num2;
            Long l2 = tagging;
            Boolean bool7 = l2;
            while (jsonReader.g()) {
                switch (jsonReader2.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) moshiJsonAdapter.typeAdapter.fromJson(jsonReader2);
                        break;
                    case 1:
                        user = (User) moshiJsonAdapter.userAdapter.fromJson(jsonReader2);
                        break;
                    case 2:
                        instagram = (Instagram) moshiJsonAdapter.instagramAdapter.fromJson(jsonReader2);
                        break;
                    case 3:
                        facebook = (Facebook) moshiJsonAdapter.facebookAdapter.fromJson(jsonReader2);
                        break;
                    case 4:
                        spotify = (Spotify) moshiJsonAdapter.spotifyAdapter.fromJson(jsonReader2);
                        break;
                    case 5:
                        bool = (Boolean) moshiJsonAdapter.isGroupMatchedAdapter.fromJson(jsonReader2);
                        break;
                    case 6:
                        num = (Integer) moshiJsonAdapter.distanceMiAdapter.fromJson(jsonReader2);
                        break;
                    case 7:
                        str2 = (String) moshiJsonAdapter.contentHashAdapter.fromJson(jsonReader2);
                        break;
                    case 8:
                        l = (Long) moshiJsonAdapter.sNumberAdapter.fromJson(jsonReader2);
                        break;
                    case 9:
                        bool2 = (Boolean) moshiJsonAdapter.isBoostAdapter.fromJson(jsonReader2);
                        break;
                    case 10:
                        bool3 = (Boolean) moshiJsonAdapter.isFastMatchAdapter.fromJson(jsonReader2);
                        break;
                    case 11:
                        bool4 = (Boolean) moshiJsonAdapter.isTopPickAdapter.fromJson(jsonReader2);
                        break;
                    case 12:
                        bool5 = (Boolean) moshiJsonAdapter.isSuperLikeAdapter.fromJson(jsonReader2);
                        break;
                    case 13:
                        bool6 = (Boolean) moshiJsonAdapter.isAlreadyMatchedAdapter.fromJson(jsonReader2);
                        break;
                    case 14:
                        list = (List) moshiJsonAdapter.teasersAdapter.fromJson(jsonReader2);
                        break;
                    case 15:
                        num2 = (Integer) moshiJsonAdapter.topPickTypeAdapter.fromJson(jsonReader2);
                        break;
                    case 16:
                        tagging = (Tagging) moshiJsonAdapter.taggingAdapter.fromJson(jsonReader2);
                        break;
                    case 17:
                        l2 = (Long) moshiJsonAdapter.expirationTimeAdapter.fromJson(jsonReader2);
                        break;
                    case 18:
                        bool7 = (Boolean) moshiJsonAdapter.isNewAdapter.fromJson(jsonReader2);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Rec(str, user, instagram, facebook, spotify, bool, num, str2, l, bool2, bool3, bool4, bool5, bool6, list, num2, tagging, l2, bool7);
        }

        public void toJson(C5983k c5983k, Rec rec) throws IOException {
            c5983k.c();
            String type = rec.type();
            if (type != null) {
                c5983k.b("type");
                this.typeAdapter.toJson(c5983k, type);
            }
            User user = rec.user();
            if (user != null) {
                c5983k.b(ManagerWebServices.PARAM_USER);
                this.userAdapter.toJson(c5983k, user);
            }
            Instagram instagram = rec.instagram();
            if (instagram != null) {
                c5983k.b(ManagerWebServices.IG_PARAM_INSTAGRAM);
                this.instagramAdapter.toJson(c5983k, instagram);
            }
            Facebook facebook = rec.facebook();
            if (facebook != null) {
                c5983k.b(AnalyticsConstants.VALUE_FACEBOOK);
                this.facebookAdapter.toJson(c5983k, facebook);
            }
            Spotify spotify = rec.spotify();
            if (spotify != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY);
                this.spotifyAdapter.toJson(c5983k, spotify);
            }
            Boolean isGroupMatched = rec.isGroupMatched();
            if (isGroupMatched != null) {
                c5983k.b(ManagerWebServices.PARAM_GROUP_MATCHED);
                this.isGroupMatchedAdapter.toJson(c5983k, isGroupMatched);
            }
            Integer distanceMi = rec.distanceMi();
            if (distanceMi != null) {
                c5983k.b(ManagerWebServices.PARAM_DISTANCE_MI);
                this.distanceMiAdapter.toJson(c5983k, distanceMi);
            }
            type = rec.contentHash();
            if (type != null) {
                c5983k.b(ManagerWebServices.PARAM_CONTENT_HASH);
                this.contentHashAdapter.toJson(c5983k, type);
            }
            Long sNumber = rec.sNumber();
            if (sNumber != null) {
                c5983k.b(ManagerWebServices.PARAM_S_NUMBER);
                this.sNumberAdapter.toJson(c5983k, sNumber);
            }
            isGroupMatched = rec.isBoost();
            if (isGroupMatched != null) {
                c5983k.b(ManagerWebServices.PARAM_IS_BOOST);
                this.isBoostAdapter.toJson(c5983k, isGroupMatched);
            }
            isGroupMatched = rec.isFastMatch();
            if (isGroupMatched != null) {
                c5983k.b("is_fast_match");
                this.isFastMatchAdapter.toJson(c5983k, isGroupMatched);
            }
            isGroupMatched = rec.isTopPick();
            if (isGroupMatched != null) {
                c5983k.b("is_top_pick");
                this.isTopPickAdapter.toJson(c5983k, isGroupMatched);
            }
            isGroupMatched = rec.isSuperLike();
            if (isGroupMatched != null) {
                c5983k.b(ManagerWebServices.PARAM_IS_SUPERLIKE);
                this.isSuperLikeAdapter.toJson(c5983k, isGroupMatched);
            }
            isGroupMatched = rec.isAlreadyMatched();
            if (isGroupMatched != null) {
                c5983k.b(ManagerWebServices.PARAM_ALREADY_MATCHED);
                this.isAlreadyMatchedAdapter.toJson(c5983k, isGroupMatched);
            }
            List teasers = rec.teasers();
            if (teasers != null) {
                c5983k.b("teasers");
                this.teasersAdapter.toJson(c5983k, teasers);
            }
            distanceMi = rec.topPickType();
            if (distanceMi != null) {
                c5983k.b("tp_type");
                this.topPickTypeAdapter.toJson(c5983k, distanceMi);
            }
            Tagging tagging = rec.tagging();
            if (tagging != null) {
                c5983k.b("tagging");
                this.taggingAdapter.toJson(c5983k, tagging);
            }
            sNumber = rec.expirationTime();
            if (sNumber != null) {
                c5983k.b("expire_time");
                this.expirationTimeAdapter.toJson(c5983k, sNumber);
            }
            rec = rec.isNew();
            if (rec != null) {
                c5983k.b("is_new");
                this.isNewAdapter.toJson(c5983k, rec);
            }
            c5983k.d();
        }
    }

    AutoValue_Rec(String str, User user, Instagram instagram, Facebook facebook, Spotify spotify, Boolean bool, Integer num, String str2, Long l, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, List<Teaser> list, Integer num2, Tagging tagging, Long l2, Boolean bool7) {
        super(str, user, instagram, facebook, spotify, bool, num, str2, l, bool2, bool3, bool4, bool5, bool6, list, num2, tagging, l2, bool7);
    }
}
