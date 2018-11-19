package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_Teaser extends C$AutoValue_Teaser {

    public static final class MoshiJsonAdapter extends JsonAdapter<Teaser> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_TEASER_STRING, "type"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> stringAdapter;
        private final JsonAdapter<String> typeAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.stringAdapter = c5987p.a(String.class);
            this.typeAdapter = c5987p.a(String.class);
        }

        public Teaser fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.stringAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.typeAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Teaser(str, str2);
        }

        public void toJson(C5983k c5983k, Teaser teaser) throws IOException {
            c5983k.c();
            String string = teaser.string();
            if (string != null) {
                c5983k.b(ManagerWebServices.PARAM_TEASER_STRING);
                this.stringAdapter.toJson(c5983k, string);
            }
            teaser = teaser.type();
            if (teaser != null) {
                c5983k.b("type");
                this.typeAdapter.toJson(c5983k, teaser);
            }
            c5983k.d();
        }
    }

    AutoValue_Teaser(String str, String str2) {
        super(str, str2);
    }
}
