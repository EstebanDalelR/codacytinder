package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.profile.Travel.TravelPosition;
import java.io.IOException;

final class AutoValue_Travel_TravelPosition extends C$AutoValue_Travel_TravelPosition {

    public static final class MoshiJsonAdapter extends JsonAdapter<TravelPosition> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_LAT, ManagerWebServices.PARAM_LON};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Double> latAdapter;
        private final JsonAdapter<Double> lonAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.latAdapter = c5987p.a(Double.class);
            this.lonAdapter = c5987p.a(Double.class);
        }

        public TravelPosition fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Double d = null;
            Double d2 = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        d = (Double) this.latAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        d2 = (Double) this.lonAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Travel_TravelPosition(d, d2);
        }

        public void toJson(C5983k c5983k, TravelPosition travelPosition) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_LAT);
            this.latAdapter.toJson(c5983k, travelPosition.lat());
            c5983k.b(ManagerWebServices.PARAM_LON);
            this.lonAdapter.toJson(c5983k, travelPosition.lon());
            c5983k.d();
        }
    }

    AutoValue_Travel_TravelPosition(Double d, Double d2) {
        super(d, d2);
    }
}
