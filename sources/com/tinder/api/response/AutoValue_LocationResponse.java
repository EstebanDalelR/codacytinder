package com.tinder.api.response;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.location.Location;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_LocationResponse extends C$AutoValue_LocationResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<LocationResponse> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_RESULTS, "status"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<List<Location>> locationListAdapter;
        private final JsonAdapter<Integer> statusAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.locationListAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Location.class}));
            this.statusAdapter = c5987p.a(Integer.class);
        }

        public LocationResponse fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            List list = null;
            Integer num = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        list = (List) this.locationListAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        num = (Integer) this.statusAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_LocationResponse(list, num);
        }

        public void toJson(C5983k c5983k, LocationResponse locationResponse) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_RESULTS);
            this.locationListAdapter.toJson(c5983k, locationResponse.locationList());
            locationResponse = locationResponse.status();
            if (locationResponse != null) {
                c5983k.b("status");
                this.statusAdapter.toJson(c5983k, locationResponse);
            }
            c5983k.d();
        }
    }

    AutoValue_LocationResponse(List<Location> list, Integer num) {
        super(list, num);
    }
}
