package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.ApiMatch.Person;
import com.tinder.api.model.common.ApiMatch.Place;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_ApiMatch extends C$AutoValue_ApiMatch {

    public static final class MoshiJsonAdapter extends JsonAdapter<ApiMatch> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_ID_UNDERSCORE, "id", "closed", "common_friend_count", "common_like_count", ManagerWebServices.PARAM_CREATED_DATE, ManagerWebServices.PARAM_LAST_ACTIVITY_DATE, "message_count", ManagerWebServices.PARAM_MESSAGES, "participants", ManagerWebServices.PARAM_IS_MUTED, "pending", ManagerWebServices.PARAM_IS_SUPERLIKE, ManagerWebServices.PARAM_IS_BOOST_MATCH, "is_fast_match", "is_place_match", "is_top_pick", "following", ManagerWebServices.PARAM_PERSON, "place", ManagerWebServices.PARAM_UPDATE_TIME, ManagerWebServices.PARAM_SUPERLIKER, ManagerWebServices.PARAM_IS_UPDATING_MESSAGES, "seen"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> _idAdapter;
        private final JsonAdapter<Boolean> closedAdapter;
        private final JsonAdapter<Integer> commonFriendCountAdapter;
        private final JsonAdapter<Integer> commonLikeCountAdapter;
        private final JsonAdapter<String> createdDateAdapter;
        private final JsonAdapter<Boolean> followingAdapter;
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<Boolean> isBoostMatchAdapter;
        private final JsonAdapter<Boolean> isFastMatchAdapter;
        private final JsonAdapter<Boolean> isNewMessageAdapter;
        private final JsonAdapter<Boolean> isPlaceMatchAdapter;
        private final JsonAdapter<Boolean> isSuperLikeAdapter;
        private final JsonAdapter<Boolean> isTopPickAdapter;
        private final JsonAdapter<String> lastActivityDateAdapter;
        private final JsonAdapter<Integer> messageCountAdapter;
        private final JsonAdapter<List<ApiMessage>> messagesAdapter;
        private final JsonAdapter<Boolean> mutedAdapter;
        private final JsonAdapter<List<String>> participantsAdapter;
        private final JsonAdapter<Boolean> pendingAdapter;
        private final JsonAdapter<Person> personAdapter;
        private final JsonAdapter<Place> placeAdapter;
        private final JsonAdapter<ApiSeenStatus> seenStatusAdapter;
        private final JsonAdapter<String> superLikerAdapter;
        private final JsonAdapter<String> updateTimeAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this._idAdapter = c5987p.a(String.class);
            this.idAdapter = c5987p.a(String.class);
            this.closedAdapter = c5987p.a(Boolean.class);
            this.commonFriendCountAdapter = c5987p.a(Integer.class);
            this.commonLikeCountAdapter = c5987p.a(Integer.class);
            this.createdDateAdapter = c5987p.a(String.class);
            this.lastActivityDateAdapter = c5987p.a(String.class);
            this.messageCountAdapter = c5987p.a(Integer.class);
            this.messagesAdapter = c5987p.a(C5992r.a(List.class, new Type[]{ApiMessage.class}));
            this.participantsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{String.class}));
            this.mutedAdapter = c5987p.a(Boolean.class);
            this.pendingAdapter = c5987p.a(Boolean.class);
            this.isSuperLikeAdapter = c5987p.a(Boolean.class);
            this.isBoostMatchAdapter = c5987p.a(Boolean.class);
            this.isFastMatchAdapter = c5987p.a(Boolean.class);
            this.isPlaceMatchAdapter = c5987p.a(Boolean.class);
            this.isTopPickAdapter = c5987p.a(Boolean.class);
            this.followingAdapter = c5987p.a(Boolean.class);
            this.personAdapter = c5987p.a(Person.class);
            this.placeAdapter = c5987p.a(Place.class);
            this.updateTimeAdapter = c5987p.a(String.class);
            this.superLikerAdapter = c5987p.a(String.class);
            this.isNewMessageAdapter = c5987p.a(Boolean.class);
            this.seenStatusAdapter = c5987p.a(ApiSeenStatus.class);
        }

        public ApiMatch fromJson(JsonReader jsonReader) throws IOException {
            MoshiJsonAdapter moshiJsonAdapter = this;
            JsonReader jsonReader2 = jsonReader;
            jsonReader.e();
            String str = null;
            String str2 = str;
            Boolean bool = str2;
            Integer num = bool;
            Integer num2 = num;
            String str3 = num2;
            String str4 = str3;
            Integer num3 = str4;
            List list = num3;
            List list2 = list;
            Boolean bool2 = list2;
            Boolean bool3 = bool2;
            Boolean bool4 = bool3;
            Boolean bool5 = bool4;
            Boolean bool6 = bool5;
            Boolean bool7 = bool6;
            Boolean bool8 = bool7;
            Boolean bool9 = bool8;
            Person person = bool9;
            Place place = person;
            String str5 = place;
            String str6 = str5;
            Boolean bool10 = str6;
            ApiSeenStatus apiSeenStatus = bool10;
            while (jsonReader.g()) {
                switch (jsonReader2.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) moshiJsonAdapter._idAdapter.fromJson(jsonReader2);
                        break;
                    case 1:
                        str2 = (String) moshiJsonAdapter.idAdapter.fromJson(jsonReader2);
                        break;
                    case 2:
                        bool = (Boolean) moshiJsonAdapter.closedAdapter.fromJson(jsonReader2);
                        break;
                    case 3:
                        num = (Integer) moshiJsonAdapter.commonFriendCountAdapter.fromJson(jsonReader2);
                        break;
                    case 4:
                        num2 = (Integer) moshiJsonAdapter.commonLikeCountAdapter.fromJson(jsonReader2);
                        break;
                    case 5:
                        str3 = (String) moshiJsonAdapter.createdDateAdapter.fromJson(jsonReader2);
                        break;
                    case 6:
                        str4 = (String) moshiJsonAdapter.lastActivityDateAdapter.fromJson(jsonReader2);
                        break;
                    case 7:
                        num3 = (Integer) moshiJsonAdapter.messageCountAdapter.fromJson(jsonReader2);
                        break;
                    case 8:
                        list = (List) moshiJsonAdapter.messagesAdapter.fromJson(jsonReader2);
                        break;
                    case 9:
                        list2 = (List) moshiJsonAdapter.participantsAdapter.fromJson(jsonReader2);
                        break;
                    case 10:
                        bool2 = (Boolean) moshiJsonAdapter.mutedAdapter.fromJson(jsonReader2);
                        break;
                    case 11:
                        bool3 = (Boolean) moshiJsonAdapter.pendingAdapter.fromJson(jsonReader2);
                        break;
                    case 12:
                        bool4 = (Boolean) moshiJsonAdapter.isSuperLikeAdapter.fromJson(jsonReader2);
                        break;
                    case 13:
                        bool5 = (Boolean) moshiJsonAdapter.isBoostMatchAdapter.fromJson(jsonReader2);
                        break;
                    case 14:
                        bool6 = (Boolean) moshiJsonAdapter.isFastMatchAdapter.fromJson(jsonReader2);
                        break;
                    case 15:
                        bool7 = (Boolean) moshiJsonAdapter.isPlaceMatchAdapter.fromJson(jsonReader2);
                        break;
                    case 16:
                        bool8 = (Boolean) moshiJsonAdapter.isTopPickAdapter.fromJson(jsonReader2);
                        break;
                    case 17:
                        bool9 = (Boolean) moshiJsonAdapter.followingAdapter.fromJson(jsonReader2);
                        break;
                    case 18:
                        person = (Person) moshiJsonAdapter.personAdapter.fromJson(jsonReader2);
                        break;
                    case 19:
                        place = (Place) moshiJsonAdapter.placeAdapter.fromJson(jsonReader2);
                        break;
                    case 20:
                        str5 = (String) moshiJsonAdapter.updateTimeAdapter.fromJson(jsonReader2);
                        break;
                    case 21:
                        str6 = (String) moshiJsonAdapter.superLikerAdapter.fromJson(jsonReader2);
                        break;
                    case 22:
                        bool10 = (Boolean) moshiJsonAdapter.isNewMessageAdapter.fromJson(jsonReader2);
                        break;
                    case 23:
                        apiSeenStatus = (ApiSeenStatus) moshiJsonAdapter.seenStatusAdapter.fromJson(jsonReader2);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_ApiMatch(str, str2, bool, num, num2, str3, str4, num3, list, list2, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, person, place, str5, str6, bool10, apiSeenStatus);
        }

        public void toJson(C5983k c5983k, ApiMatch apiMatch) throws IOException {
            c5983k.c();
            String _id = apiMatch._id();
            if (_id != null) {
                c5983k.b(ManagerWebServices.PARAM_ID_UNDERSCORE);
                this._idAdapter.toJson(c5983k, _id);
            }
            _id = apiMatch.id();
            if (_id != null) {
                c5983k.b("id");
                this.idAdapter.toJson(c5983k, _id);
            }
            Boolean closed = apiMatch.closed();
            if (closed != null) {
                c5983k.b("closed");
                this.closedAdapter.toJson(c5983k, closed);
            }
            Integer commonFriendCount = apiMatch.commonFriendCount();
            if (commonFriendCount != null) {
                c5983k.b("common_friend_count");
                this.commonFriendCountAdapter.toJson(c5983k, commonFriendCount);
            }
            commonFriendCount = apiMatch.commonLikeCount();
            if (commonFriendCount != null) {
                c5983k.b("common_like_count");
                this.commonLikeCountAdapter.toJson(c5983k, commonFriendCount);
            }
            _id = apiMatch.createdDate();
            if (_id != null) {
                c5983k.b(ManagerWebServices.PARAM_CREATED_DATE);
                this.createdDateAdapter.toJson(c5983k, _id);
            }
            _id = apiMatch.lastActivityDate();
            if (_id != null) {
                c5983k.b(ManagerWebServices.PARAM_LAST_ACTIVITY_DATE);
                this.lastActivityDateAdapter.toJson(c5983k, _id);
            }
            commonFriendCount = apiMatch.messageCount();
            if (commonFriendCount != null) {
                c5983k.b("message_count");
                this.messageCountAdapter.toJson(c5983k, commonFriendCount);
            }
            List messages = apiMatch.messages();
            if (messages != null) {
                c5983k.b(ManagerWebServices.PARAM_MESSAGES);
                this.messagesAdapter.toJson(c5983k, messages);
            }
            messages = apiMatch.participants();
            if (messages != null) {
                c5983k.b("participants");
                this.participantsAdapter.toJson(c5983k, messages);
            }
            closed = apiMatch.muted();
            if (closed != null) {
                c5983k.b(ManagerWebServices.PARAM_IS_MUTED);
                this.mutedAdapter.toJson(c5983k, closed);
            }
            closed = apiMatch.pending();
            if (closed != null) {
                c5983k.b("pending");
                this.pendingAdapter.toJson(c5983k, closed);
            }
            closed = apiMatch.isSuperLike();
            if (closed != null) {
                c5983k.b(ManagerWebServices.PARAM_IS_SUPERLIKE);
                this.isSuperLikeAdapter.toJson(c5983k, closed);
            }
            closed = apiMatch.isBoostMatch();
            if (closed != null) {
                c5983k.b(ManagerWebServices.PARAM_IS_BOOST_MATCH);
                this.isBoostMatchAdapter.toJson(c5983k, closed);
            }
            closed = apiMatch.isFastMatch();
            if (closed != null) {
                c5983k.b("is_fast_match");
                this.isFastMatchAdapter.toJson(c5983k, closed);
            }
            closed = apiMatch.isPlaceMatch();
            if (closed != null) {
                c5983k.b("is_place_match");
                this.isPlaceMatchAdapter.toJson(c5983k, closed);
            }
            closed = apiMatch.isTopPick();
            if (closed != null) {
                c5983k.b("is_top_pick");
                this.isTopPickAdapter.toJson(c5983k, closed);
            }
            closed = apiMatch.following();
            if (closed != null) {
                c5983k.b("following");
                this.followingAdapter.toJson(c5983k, closed);
            }
            Person person = apiMatch.person();
            if (person != null) {
                c5983k.b(ManagerWebServices.PARAM_PERSON);
                this.personAdapter.toJson(c5983k, person);
            }
            Place place = apiMatch.place();
            if (place != null) {
                c5983k.b("place");
                this.placeAdapter.toJson(c5983k, place);
            }
            _id = apiMatch.updateTime();
            if (_id != null) {
                c5983k.b(ManagerWebServices.PARAM_UPDATE_TIME);
                this.updateTimeAdapter.toJson(c5983k, _id);
            }
            _id = apiMatch.superLiker();
            if (_id != null) {
                c5983k.b(ManagerWebServices.PARAM_SUPERLIKER);
                this.superLikerAdapter.toJson(c5983k, _id);
            }
            closed = apiMatch.isNewMessage();
            if (closed != null) {
                c5983k.b(ManagerWebServices.PARAM_IS_UPDATING_MESSAGES);
                this.isNewMessageAdapter.toJson(c5983k, closed);
            }
            apiMatch = apiMatch.seenStatus();
            if (apiMatch != null) {
                c5983k.b("seen");
                this.seenStatusAdapter.toJson(c5983k, apiMatch);
            }
            c5983k.d();
        }
    }

    AutoValue_ApiMatch(String str, String str2, Boolean bool, Integer num, Integer num2, String str3, String str4, Integer num3, List<ApiMessage> list, List<String> list2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Person person, Place place, String str5, String str6, Boolean bool10, ApiSeenStatus apiSeenStatus) {
        super(str, str2, bool, num, num2, str3, str4, num3, list, list2, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, person, place, str5, str6, bool10, apiSeenStatus);
    }
}
