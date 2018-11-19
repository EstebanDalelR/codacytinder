package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.common.TinderSelect.Select;
import java.io.IOException;

final class AutoValue_TinderSelect extends C$AutoValue_TinderSelect {

    public static final class MoshiJsonAdapter extends JsonAdapter<TinderSelect> {
        private static final String[] NAMES = new String[]{"select"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Select> selectAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.selectAdapter = c5987p.a(Select.class);
        }

        public TinderSelect fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Select select = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        select = (Select) this.selectAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_TinderSelect(select);
        }

        public void toJson(C5983k c5983k, TinderSelect tinderSelect) throws IOException {
            c5983k.c();
            tinderSelect = tinderSelect.select();
            if (tinderSelect != null) {
                c5983k.b("select");
                this.selectAdapter.toJson(c5983k, tinderSelect);
            }
            c5983k.d();
        }
    }

    AutoValue_TinderSelect(Select select) {
        super(select);
    }
}
