package com.tinder.api.model.meta;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.meta.Meta.Versions;
import java.io.IOException;

final class AutoValue_Meta_Versions extends C$AutoValue_Meta_Versions {

    public static final class MoshiJsonAdapter extends JsonAdapter<Versions> {
        private static final String[] NAMES = new String[]{"active_text", "age_filter", "matchmaker", "trending", "trending_active_text"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> activeTextAdapter;
        private final JsonAdapter<String> ageFilterAdapter;
        private final JsonAdapter<String> matchmakerAdapter;
        private final JsonAdapter<String> trendingActiveTextAdapter;
        private final JsonAdapter<String> trendingAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.activeTextAdapter = c5987p.a(String.class);
            this.ageFilterAdapter = c5987p.a(String.class);
            this.matchmakerAdapter = c5987p.a(String.class);
            this.trendingAdapter = c5987p.a(String.class);
            this.trendingActiveTextAdapter = c5987p.a(String.class);
        }

        public Versions fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = str;
            String str3 = str2;
            String str4 = str3;
            String str5 = str4;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.activeTextAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.ageFilterAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str3 = (String) this.matchmakerAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        str4 = (String) this.trendingAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        str5 = (String) this.trendingActiveTextAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Meta_Versions(str, str2, str3, str4, str5);
        }

        public void toJson(C5983k c5983k, Versions versions) throws IOException {
            c5983k.c();
            c5983k.b("active_text");
            this.activeTextAdapter.toJson(c5983k, versions.activeText());
            c5983k.b("age_filter");
            this.ageFilterAdapter.toJson(c5983k, versions.ageFilter());
            c5983k.b("matchmaker");
            this.matchmakerAdapter.toJson(c5983k, versions.matchmaker());
            c5983k.b("trending");
            this.trendingAdapter.toJson(c5983k, versions.trending());
            c5983k.b("trending_active_text");
            this.trendingActiveTextAdapter.toJson(c5983k, versions.trendingActiveText());
            c5983k.d();
        }
    }

    AutoValue_Meta_Versions(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3, str4, str5);
    }
}
