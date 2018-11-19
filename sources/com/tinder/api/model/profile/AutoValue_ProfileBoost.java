package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_ProfileBoost extends C$AutoValue_ProfileBoost {

    public static final class MoshiJsonAdapter extends JsonAdapter<ProfileBoost> {
        private static final String[] NAMES = new String[]{"allotment", "allotment_used", ManagerWebServices.PARAM_ALLOTMENT_REMAINING, ManagerWebServices.PARAM_PURCHASED_REMAINING, ManagerWebServices.PARAM_INTERNAL_REMAINING, "remaining", "resets_at", ManagerWebServices.PARAM_EXPIRES_AT, ManagerWebServices.PARAM_BOOST_ID, "multiplier", "boost_refresh_amount", "boost_refresh_interval", "boost_refresh_interval_unit", ManagerWebServices.PARAM_DURATION};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> allotmentAdapter;
        private final JsonAdapter<Integer> allotmentRemainingAdapter;
        private final JsonAdapter<Integer> allotmentUsedAdapter;
        private final JsonAdapter<String> boostIdAdapter;
        private final JsonAdapter<Long> durationAdapter;
        private final JsonAdapter<Long> expiredAtAdapter;
        private final JsonAdapter<Integer> internalRemainingAdapter;
        private final JsonAdapter<Double> multiplierAdapter;
        private final JsonAdapter<Integer> purchasedRemainingAdapter;
        private final JsonAdapter<Integer> refreshAmountAdapter;
        private final JsonAdapter<Integer> refreshIntervalAdapter;
        private final JsonAdapter<String> refreshIntervalUnitAdapter;
        private final JsonAdapter<Integer> remainingAdapter;
        private final JsonAdapter<Long> resetAtAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.allotmentAdapter = c5987p.a(Integer.class);
            this.allotmentUsedAdapter = c5987p.a(Integer.class);
            this.allotmentRemainingAdapter = c5987p.a(Integer.class);
            this.purchasedRemainingAdapter = c5987p.a(Integer.class);
            this.internalRemainingAdapter = c5987p.a(Integer.class);
            this.remainingAdapter = c5987p.a(Integer.class);
            this.resetAtAdapter = c5987p.a(Long.class);
            this.expiredAtAdapter = c5987p.a(Long.class);
            this.boostIdAdapter = c5987p.a(String.class);
            this.multiplierAdapter = c5987p.a(Double.class);
            this.refreshAmountAdapter = c5987p.a(Integer.class);
            this.refreshIntervalAdapter = c5987p.a(Integer.class);
            this.refreshIntervalUnitAdapter = c5987p.a(String.class);
            this.durationAdapter = c5987p.a(Long.class);
        }

        public ProfileBoost fromJson(JsonReader jsonReader) throws IOException {
            MoshiJsonAdapter moshiJsonAdapter = this;
            JsonReader jsonReader2 = jsonReader;
            jsonReader.e();
            Integer num = null;
            Integer num2 = num;
            Integer num3 = num2;
            Integer num4 = num3;
            Integer num5 = num4;
            Integer num6 = num5;
            Long l = num6;
            Long l2 = l;
            String str = l2;
            Double d = str;
            Integer num7 = d;
            Integer num8 = num7;
            String str2 = num8;
            Long l3 = str2;
            while (jsonReader.g()) {
                switch (jsonReader2.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) moshiJsonAdapter.allotmentAdapter.fromJson(jsonReader2);
                        break;
                    case 1:
                        num2 = (Integer) moshiJsonAdapter.allotmentUsedAdapter.fromJson(jsonReader2);
                        break;
                    case 2:
                        num3 = (Integer) moshiJsonAdapter.allotmentRemainingAdapter.fromJson(jsonReader2);
                        break;
                    case 3:
                        num4 = (Integer) moshiJsonAdapter.purchasedRemainingAdapter.fromJson(jsonReader2);
                        break;
                    case 4:
                        num5 = (Integer) moshiJsonAdapter.internalRemainingAdapter.fromJson(jsonReader2);
                        break;
                    case 5:
                        num6 = (Integer) moshiJsonAdapter.remainingAdapter.fromJson(jsonReader2);
                        break;
                    case 6:
                        l = (Long) moshiJsonAdapter.resetAtAdapter.fromJson(jsonReader2);
                        break;
                    case 7:
                        l2 = (Long) moshiJsonAdapter.expiredAtAdapter.fromJson(jsonReader2);
                        break;
                    case 8:
                        str = (String) moshiJsonAdapter.boostIdAdapter.fromJson(jsonReader2);
                        break;
                    case 9:
                        d = (Double) moshiJsonAdapter.multiplierAdapter.fromJson(jsonReader2);
                        break;
                    case 10:
                        num7 = (Integer) moshiJsonAdapter.refreshAmountAdapter.fromJson(jsonReader2);
                        break;
                    case 11:
                        num8 = (Integer) moshiJsonAdapter.refreshIntervalAdapter.fromJson(jsonReader2);
                        break;
                    case 12:
                        str2 = (String) moshiJsonAdapter.refreshIntervalUnitAdapter.fromJson(jsonReader2);
                        break;
                    case 13:
                        l3 = (Long) moshiJsonAdapter.durationAdapter.fromJson(jsonReader2);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_ProfileBoost(num, num2, num3, num4, num5, num6, l, l2, str, d, num7, num8, str2, l3);
        }

        public void toJson(C5983k c5983k, ProfileBoost profileBoost) throws IOException {
            c5983k.c();
            Integer allotment = profileBoost.allotment();
            if (allotment != null) {
                c5983k.b("allotment");
                this.allotmentAdapter.toJson(c5983k, allotment);
            }
            allotment = profileBoost.allotmentUsed();
            if (allotment != null) {
                c5983k.b("allotment_used");
                this.allotmentUsedAdapter.toJson(c5983k, allotment);
            }
            allotment = profileBoost.allotmentRemaining();
            if (allotment != null) {
                c5983k.b(ManagerWebServices.PARAM_ALLOTMENT_REMAINING);
                this.allotmentRemainingAdapter.toJson(c5983k, allotment);
            }
            allotment = profileBoost.purchasedRemaining();
            if (allotment != null) {
                c5983k.b(ManagerWebServices.PARAM_PURCHASED_REMAINING);
                this.purchasedRemainingAdapter.toJson(c5983k, allotment);
            }
            allotment = profileBoost.internalRemaining();
            if (allotment != null) {
                c5983k.b(ManagerWebServices.PARAM_INTERNAL_REMAINING);
                this.internalRemainingAdapter.toJson(c5983k, allotment);
            }
            allotment = profileBoost.remaining();
            if (allotment != null) {
                c5983k.b("remaining");
                this.remainingAdapter.toJson(c5983k, allotment);
            }
            Long resetAt = profileBoost.resetAt();
            if (resetAt != null) {
                c5983k.b("resets_at");
                this.resetAtAdapter.toJson(c5983k, resetAt);
            }
            resetAt = profileBoost.expiredAt();
            if (resetAt != null) {
                c5983k.b(ManagerWebServices.PARAM_EXPIRES_AT);
                this.expiredAtAdapter.toJson(c5983k, resetAt);
            }
            String boostId = profileBoost.boostId();
            if (boostId != null) {
                c5983k.b(ManagerWebServices.PARAM_BOOST_ID);
                this.boostIdAdapter.toJson(c5983k, boostId);
            }
            Double multiplier = profileBoost.multiplier();
            if (multiplier != null) {
                c5983k.b("multiplier");
                this.multiplierAdapter.toJson(c5983k, multiplier);
            }
            allotment = profileBoost.refreshAmount();
            if (allotment != null) {
                c5983k.b("boost_refresh_amount");
                this.refreshAmountAdapter.toJson(c5983k, allotment);
            }
            allotment = profileBoost.refreshInterval();
            if (allotment != null) {
                c5983k.b("boost_refresh_interval");
                this.refreshIntervalAdapter.toJson(c5983k, allotment);
            }
            boostId = profileBoost.refreshIntervalUnit();
            if (boostId != null) {
                c5983k.b("boost_refresh_interval_unit");
                this.refreshIntervalUnitAdapter.toJson(c5983k, boostId);
            }
            profileBoost = profileBoost.duration();
            if (profileBoost != null) {
                c5983k.b(ManagerWebServices.PARAM_DURATION);
                this.durationAdapter.toJson(c5983k, profileBoost);
            }
            c5983k.d();
        }
    }

    AutoValue_ProfileBoost(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l, Long l2, String str, Double d, Integer num7, Integer num8, String str2, Long l3) {
        super(num, num2, num3, num4, num5, num6, l, l2, str, d, num7, num8, str2, l3);
    }
}
