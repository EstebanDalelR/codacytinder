package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_Badge extends C$AutoValue_Badge {

    public static final class MoshiJsonAdapter extends JsonAdapter<Badge> {
        private static final String[] NAMES = new String[]{"type", ManagerWebServices.PARAM_BADGE_DESC, ManagerWebServices.PARAM_BADGE_COLOR};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> colorAdapter;
        private final JsonAdapter<String> descriptionAdapter;
        private final JsonAdapter<String> typeAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.typeAdapter = c5987p.a(String.class);
            this.descriptionAdapter = c5987p.a(String.class);
            this.colorAdapter = c5987p.a(String.class);
        }

        public Badge fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            String str3 = str2;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.typeAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.descriptionAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str3 = (String) this.colorAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Badge(str, str2, str3);
        }

        public void toJson(C5983k c5983k, Badge badge) throws IOException {
            c5983k.c();
            String type = badge.type();
            if (type != null) {
                c5983k.b("type");
                this.typeAdapter.toJson(c5983k, type);
            }
            type = badge.description();
            if (type != null) {
                c5983k.b(ManagerWebServices.PARAM_BADGE_DESC);
                this.descriptionAdapter.toJson(c5983k, type);
            }
            badge = badge.color();
            if (badge != null) {
                c5983k.b(ManagerWebServices.PARAM_BADGE_COLOR);
                this.colorAdapter.toJson(c5983k, badge);
            }
            c5983k.d();
        }
    }

    AutoValue_Badge(String str, String str2, String str3) {
        super(str, str2, str3);
    }
}
