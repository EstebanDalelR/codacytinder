package com.tinder.api.model.updates;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.updates.Updates.Boost;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Updates_Boost extends C$AutoValue_Updates_Boost {

    public static final class MoshiJsonAdapter extends JsonAdapter<Boost> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_PROFILES, ManagerWebServices.PARAM_BOOST_CURSOR};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> boostCursorAdapter;
        private final JsonAdapter<List<String>> profilesAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.profilesAdapter = c5987p.a(C5992r.a(List.class, new Type[]{String.class}));
            this.boostCursorAdapter = c5987p.a(String.class);
        }

        public Boost fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            List list = null;
            String str = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        list = (List) this.profilesAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str = (String) this.boostCursorAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Updates_Boost(list, str);
        }

        public void toJson(C5983k c5983k, Boost boost) throws IOException {
            c5983k.c();
            List profiles = boost.profiles();
            if (profiles != null) {
                c5983k.b(ManagerWebServices.PARAM_PROFILES);
                this.profilesAdapter.toJson(c5983k, profiles);
            }
            boost = boost.boostCursor();
            if (boost != null) {
                c5983k.b(ManagerWebServices.PARAM_BOOST_CURSOR);
                this.boostCursorAdapter.toJson(c5983k, boost);
            }
            c5983k.d();
        }
    }

    AutoValue_Updates_Boost(List<String> list, String str) {
        super(list, str);
    }
}
