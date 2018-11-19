package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.CommonConnection;
import com.tinder.api.model.common.Interest;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Facebook extends C$AutoValue_Facebook {

    public static final class MoshiJsonAdapter extends JsonAdapter<Facebook> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_COMMON_CONNECTIONS, ManagerWebServices.PARAM_COMMON_INTERESTS, ManagerWebServices.PARAM_CONNECTION_COUNT};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<List<CommonConnection>> commonConnectionsAdapter;
        private final JsonAdapter<List<Interest>> commonInterestsAdapter;
        private final JsonAdapter<Integer> connectionCountAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.commonConnectionsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{CommonConnection.class}));
            this.commonInterestsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Interest.class}));
            this.connectionCountAdapter = c5987p.a(Integer.class);
        }

        public Facebook fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            List list = null;
            List list2 = null;
            Integer num = list2;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        list = (List) this.commonConnectionsAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        list2 = (List) this.commonInterestsAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        num = (Integer) this.connectionCountAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Facebook(list, list2, num);
        }

        public void toJson(C5983k c5983k, Facebook facebook) throws IOException {
            c5983k.c();
            List commonConnections = facebook.commonConnections();
            if (commonConnections != null) {
                c5983k.b(ManagerWebServices.PARAM_COMMON_CONNECTIONS);
                this.commonConnectionsAdapter.toJson(c5983k, commonConnections);
            }
            commonConnections = facebook.commonInterests();
            if (commonConnections != null) {
                c5983k.b(ManagerWebServices.PARAM_COMMON_INTERESTS);
                this.commonInterestsAdapter.toJson(c5983k, commonConnections);
            }
            facebook = facebook.connectionCount();
            if (facebook != null) {
                c5983k.b(ManagerWebServices.PARAM_CONNECTION_COUNT);
                this.connectionCountAdapter.toJson(c5983k, facebook);
            }
            c5983k.d();
        }
    }

    AutoValue_Facebook(List<CommonConnection> list, List<Interest> list2, Integer num) {
        super(list, list2, num);
    }
}
