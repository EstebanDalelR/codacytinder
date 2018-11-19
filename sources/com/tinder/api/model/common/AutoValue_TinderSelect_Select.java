package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.common.TinderSelect.Select;
import java.io.IOException;

final class AutoValue_TinderSelect_Select extends C$AutoValue_TinderSelect_Select {

    public static final class MoshiJsonAdapter extends JsonAdapter<Select> {
        private static final String[] NAMES = new String[]{"date_added", "invitation_count", "select_recs_enabled"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> dateAddedAdapter;
        private final JsonAdapter<Integer> invitationCountAdapter;
        private final JsonAdapter<Boolean> recsEnabledAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.dateAddedAdapter = c5987p.a(String.class);
            this.invitationCountAdapter = c5987p.a(Integer.class);
            this.recsEnabledAdapter = c5987p.a(Boolean.class);
        }

        public Select fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            Integer num = null;
            Boolean bool = num;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.dateAddedAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        num = (Integer) this.invitationCountAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        bool = (Boolean) this.recsEnabledAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_TinderSelect_Select(str, num, bool);
        }

        public void toJson(C5983k c5983k, Select select) throws IOException {
            c5983k.c();
            String dateAdded = select.dateAdded();
            if (dateAdded != null) {
                c5983k.b("date_added");
                this.dateAddedAdapter.toJson(c5983k, dateAdded);
            }
            Integer invitationCount = select.invitationCount();
            if (invitationCount != null) {
                c5983k.b("invitation_count");
                this.invitationCountAdapter.toJson(c5983k, invitationCount);
            }
            select = select.recsEnabled();
            if (select != null) {
                c5983k.b("select_recs_enabled");
                this.recsEnabledAdapter.toJson(c5983k, select);
            }
            c5983k.d();
        }
    }

    AutoValue_TinderSelect_Select(String str, Integer num, Boolean bool) {
        super(str, num, bool);
    }
}
