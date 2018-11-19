package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.profile.Travel.TravelLocationInfo;
import com.tinder.api.model.profile.Travel.TravelPosition;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Travel extends C$AutoValue_Travel {

    public static final class MoshiJsonAdapter extends JsonAdapter<Travel> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_IS_TRAVELING, ManagerWebServices.PARAM_TRAVEL_POS, ManagerWebServices.PARAM_TRAVEL_LOCATION_INFO};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> isTravelingAdapter;
        private final JsonAdapter<List<TravelLocationInfo>> travelLocationInfoAdapter;
        private final JsonAdapter<TravelPosition> travelPosAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.isTravelingAdapter = c5987p.a(Boolean.class);
            this.travelPosAdapter = c5987p.a(TravelPosition.class);
            this.travelLocationInfoAdapter = c5987p.a(C5992r.a(List.class, new Type[]{TravelLocationInfo.class}));
        }

        public Travel fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Boolean bool = null;
            TravelPosition travelPosition = null;
            List list = travelPosition;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        bool = (Boolean) this.isTravelingAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        travelPosition = (TravelPosition) this.travelPosAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        list = (List) this.travelLocationInfoAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Travel(bool, travelPosition, list);
        }

        public void toJson(C5983k c5983k, Travel travel) throws IOException {
            c5983k.c();
            Boolean isTraveling = travel.isTraveling();
            if (isTraveling != null) {
                c5983k.b(ManagerWebServices.PARAM_IS_TRAVELING);
                this.isTravelingAdapter.toJson(c5983k, isTraveling);
            }
            TravelPosition travelPos = travel.travelPos();
            if (travelPos != null) {
                c5983k.b(ManagerWebServices.PARAM_TRAVEL_POS);
                this.travelPosAdapter.toJson(c5983k, travelPos);
            }
            travel = travel.travelLocationInfo();
            if (travel != null) {
                c5983k.b(ManagerWebServices.PARAM_TRAVEL_LOCATION_INFO);
                this.travelLocationInfoAdapter.toJson(c5983k, travel);
            }
            c5983k.d();
        }
    }

    AutoValue_Travel(Boolean bool, TravelPosition travelPosition, List<TravelLocationInfo> list) {
        super(bool, travelPosition, list);
    }
}
