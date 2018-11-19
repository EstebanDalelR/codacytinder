package com.tinder.api.model.meta;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_SuperLikes extends C$AutoValue_SuperLikes {

    public static final class MoshiJsonAdapter extends JsonAdapter<SuperLikes> {
        private static final String[] NAMES = new String[]{"remaining", ManagerWebServices.PARAM_ALC_REMAINING, "new_alc_remaining", "allotment", "resets_at", "superlike_refresh_amount", "superlike_refresh_interval", "superlike_refresh_interval_unit"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> alcRemainingAdapter;
        private final JsonAdapter<Integer> allotmentAdapter;
        private final JsonAdapter<Integer> newAlcRemainingAdapter;
        private final JsonAdapter<Integer> refreshAmountAdapter;
        private final JsonAdapter<Integer> refreshIntervalAdapter;
        private final JsonAdapter<String> refreshIntervalUnitAdapter;
        private final JsonAdapter<Integer> remainingAdapter;
        private final JsonAdapter<String> resetsAtAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.remainingAdapter = c5987p.a(Integer.class);
            this.alcRemainingAdapter = c5987p.a(Integer.class);
            this.newAlcRemainingAdapter = c5987p.a(Integer.class);
            this.allotmentAdapter = c5987p.a(Integer.class);
            this.resetsAtAdapter = c5987p.a(String.class);
            this.refreshAmountAdapter = c5987p.a(Integer.class);
            this.refreshIntervalAdapter = c5987p.a(Integer.class);
            this.refreshIntervalUnitAdapter = c5987p.a(String.class);
        }

        public SuperLikes fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Integer num = null;
            Integer num2 = num;
            Integer num3 = num2;
            Integer num4 = num3;
            String str = num4;
            Integer num5 = str;
            Integer num6 = num5;
            String str2 = num6;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) this.remainingAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        num2 = (Integer) this.alcRemainingAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        num3 = (Integer) this.newAlcRemainingAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        num4 = (Integer) this.allotmentAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        str = (String) this.resetsAtAdapter.fromJson(jsonReader);
                        break;
                    case 5:
                        num5 = (Integer) this.refreshAmountAdapter.fromJson(jsonReader);
                        break;
                    case 6:
                        num6 = (Integer) this.refreshIntervalAdapter.fromJson(jsonReader);
                        break;
                    case 7:
                        str2 = (String) this.refreshIntervalUnitAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_SuperLikes(num, num2, num3, num4, str, num5, num6, str2);
        }

        public void toJson(C5983k c5983k, SuperLikes superLikes) throws IOException {
            c5983k.c();
            c5983k.b("remaining");
            this.remainingAdapter.toJson(c5983k, superLikes.remaining());
            c5983k.b(ManagerWebServices.PARAM_ALC_REMAINING);
            this.alcRemainingAdapter.toJson(c5983k, superLikes.alcRemaining());
            c5983k.b("new_alc_remaining");
            this.newAlcRemainingAdapter.toJson(c5983k, superLikes.newAlcRemaining());
            c5983k.b("allotment");
            this.allotmentAdapter.toJson(c5983k, superLikes.allotment());
            String resetsAt = superLikes.resetsAt();
            if (resetsAt != null) {
                c5983k.b("resets_at");
                this.resetsAtAdapter.toJson(c5983k, resetsAt);
            }
            Integer refreshAmount = superLikes.refreshAmount();
            if (refreshAmount != null) {
                c5983k.b("superlike_refresh_amount");
                this.refreshAmountAdapter.toJson(c5983k, refreshAmount);
            }
            refreshAmount = superLikes.refreshInterval();
            if (refreshAmount != null) {
                c5983k.b("superlike_refresh_interval");
                this.refreshIntervalAdapter.toJson(c5983k, refreshAmount);
            }
            superLikes = superLikes.refreshIntervalUnit();
            if (superLikes != null) {
                c5983k.b("superlike_refresh_interval_unit");
                this.refreshIntervalUnitAdapter.toJson(c5983k, superLikes);
            }
            c5983k.d();
        }
    }

    AutoValue_SuperLikes(Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, String str2) {
        super(num, num2, num3, num4, str, num5, num6, str2);
    }
}
