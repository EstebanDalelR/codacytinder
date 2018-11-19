package com.tinder.api.model.updates;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.ApiMatch;
import com.tinder.api.model.updates.Updates.Boost;
import com.tinder.api.model.updates.Updates.LikedMessage;
import com.tinder.api.model.updates.Updates.Places;
import com.tinder.api.model.updates.Updates.PollInterval;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Updates extends C$AutoValue_Updates {

    public static final class MoshiJsonAdapter extends JsonAdapter<Updates> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_MATCHES, ManagerWebServices.PARAM_BOOST, ManagerWebServices.PARAM_LAST_ACTIVITY_DATE, ManagerWebServices.PARAM_BLOCKS, ManagerWebServices.PARAM_LIKED_MESSAGES, "poll_interval", "places"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<List<String>> blocksAdapter;
        private final JsonAdapter<Boost> boostAdapter;
        private final JsonAdapter<String> lastActivityDateAdapter;
        private final JsonAdapter<List<LikedMessage>> likedMessagesAdapter;
        private final JsonAdapter<List<ApiMatch>> matchesAdapter;
        private final JsonAdapter<Places> placesAdapter;
        private final JsonAdapter<PollInterval> pollIntervalAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.matchesAdapter = c5987p.a(C5992r.a(List.class, new Type[]{ApiMatch.class}));
            this.boostAdapter = c5987p.a(Boost.class);
            this.lastActivityDateAdapter = c5987p.a(String.class);
            this.blocksAdapter = c5987p.a(C5992r.a(List.class, new Type[]{String.class}));
            this.likedMessagesAdapter = c5987p.a(C5992r.a(List.class, new Type[]{LikedMessage.class}));
            this.pollIntervalAdapter = c5987p.a(PollInterval.class);
            this.placesAdapter = c5987p.a(Places.class);
        }

        public Updates fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            List list = null;
            Boost boost = list;
            String str = boost;
            List list2 = str;
            List list3 = list2;
            PollInterval pollInterval = list3;
            Places places = pollInterval;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        list = (List) this.matchesAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        boost = (Boost) this.boostAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str = (String) this.lastActivityDateAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        list2 = (List) this.blocksAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        list3 = (List) this.likedMessagesAdapter.fromJson(jsonReader);
                        break;
                    case 5:
                        pollInterval = (PollInterval) this.pollIntervalAdapter.fromJson(jsonReader);
                        break;
                    case 6:
                        places = (Places) this.placesAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Updates(list, boost, str, list2, list3, pollInterval, places);
        }

        public void toJson(C5983k c5983k, Updates updates) throws IOException {
            c5983k.c();
            List matches = updates.matches();
            if (matches != null) {
                c5983k.b(ManagerWebServices.PARAM_MATCHES);
                this.matchesAdapter.toJson(c5983k, matches);
            }
            Boost boost = updates.boost();
            if (boost != null) {
                c5983k.b(ManagerWebServices.PARAM_BOOST);
                this.boostAdapter.toJson(c5983k, boost);
            }
            String lastActivityDate = updates.lastActivityDate();
            if (lastActivityDate != null) {
                c5983k.b(ManagerWebServices.PARAM_LAST_ACTIVITY_DATE);
                this.lastActivityDateAdapter.toJson(c5983k, lastActivityDate);
            }
            matches = updates.blocks();
            if (matches != null) {
                c5983k.b(ManagerWebServices.PARAM_BLOCKS);
                this.blocksAdapter.toJson(c5983k, matches);
            }
            matches = updates.likedMessages();
            if (matches != null) {
                c5983k.b(ManagerWebServices.PARAM_LIKED_MESSAGES);
                this.likedMessagesAdapter.toJson(c5983k, matches);
            }
            PollInterval pollInterval = updates.pollInterval();
            if (pollInterval != null) {
                c5983k.b("poll_interval");
                this.pollIntervalAdapter.toJson(c5983k, pollInterval);
            }
            updates = updates.places();
            if (updates != null) {
                c5983k.b("places");
                this.placesAdapter.toJson(c5983k, updates);
            }
            c5983k.d();
        }
    }

    AutoValue_Updates(List<ApiMatch> list, Boost boost, String str, List<String> list2, List<LikedMessage> list3, PollInterval pollInterval, Places places) {
        super(list, boost, str, list2, list3, pollInterval, places);
    }
}
