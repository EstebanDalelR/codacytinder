package com.tinder.api.model.location;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_Location extends C$AutoValue_Location {

    public static final class MoshiJsonAdapter extends JsonAdapter<Location> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_LAT, ManagerWebServices.PARAM_LON, ManagerWebServices.PARAM_LOCALITY, ManagerWebServices.PARAM_AREA_LEVEL_1, ManagerWebServices.PARAM_AREA_LEVEL_2, ManagerWebServices.PARAM_COUNTRY};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<LocationDetails> administrativeAreaLevel1Adapter;
        private final JsonAdapter<LocationDetails> administrativeAreaLevel2Adapter;
        private final JsonAdapter<LocationDetails> countryAdapter;
        private final JsonAdapter<Double> latitudeAdapter;
        private final JsonAdapter<LocationDetails> localityAdapter;
        private final JsonAdapter<Double> longitudeAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.latitudeAdapter = c5987p.a(Double.class);
            this.longitudeAdapter = c5987p.a(Double.class);
            this.localityAdapter = c5987p.a(LocationDetails.class);
            this.administrativeAreaLevel1Adapter = c5987p.a(LocationDetails.class);
            this.administrativeAreaLevel2Adapter = c5987p.a(LocationDetails.class);
            this.countryAdapter = c5987p.a(LocationDetails.class);
        }

        public Location fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Double d = null;
            Double d2 = d;
            LocationDetails locationDetails = d2;
            LocationDetails locationDetails2 = locationDetails;
            LocationDetails locationDetails3 = locationDetails2;
            LocationDetails locationDetails4 = locationDetails3;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        d = (Double) this.latitudeAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        d2 = (Double) this.longitudeAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        locationDetails = (LocationDetails) this.localityAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        locationDetails2 = (LocationDetails) this.administrativeAreaLevel1Adapter.fromJson(jsonReader);
                        break;
                    case 4:
                        locationDetails3 = (LocationDetails) this.administrativeAreaLevel2Adapter.fromJson(jsonReader);
                        break;
                    case 5:
                        locationDetails4 = (LocationDetails) this.countryAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Location(d, d2, locationDetails, locationDetails2, locationDetails3, locationDetails4);
        }

        public void toJson(C5983k c5983k, Location location) throws IOException {
            c5983k.c();
            Double latitude = location.latitude();
            if (latitude != null) {
                c5983k.b(ManagerWebServices.PARAM_LAT);
                this.latitudeAdapter.toJson(c5983k, latitude);
            }
            latitude = location.longitude();
            if (latitude != null) {
                c5983k.b(ManagerWebServices.PARAM_LON);
                this.longitudeAdapter.toJson(c5983k, latitude);
            }
            LocationDetails locality = location.locality();
            if (locality != null) {
                c5983k.b(ManagerWebServices.PARAM_LOCALITY);
                this.localityAdapter.toJson(c5983k, locality);
            }
            locality = location.administrativeAreaLevel1();
            if (locality != null) {
                c5983k.b(ManagerWebServices.PARAM_AREA_LEVEL_1);
                this.administrativeAreaLevel1Adapter.toJson(c5983k, locality);
            }
            locality = location.administrativeAreaLevel2();
            if (locality != null) {
                c5983k.b(ManagerWebServices.PARAM_AREA_LEVEL_2);
                this.administrativeAreaLevel2Adapter.toJson(c5983k, locality);
            }
            location = location.country();
            if (location != null) {
                c5983k.b(ManagerWebServices.PARAM_COUNTRY);
                this.countryAdapter.toJson(c5983k, location);
            }
            c5983k.d();
        }
    }

    AutoValue_Location(Double d, Double d2, LocationDetails locationDetails, LocationDetails locationDetails2, LocationDetails locationDetails3, LocationDetails locationDetails4) {
        super(d, d2, locationDetails, locationDetails2, locationDetails3, locationDetails4);
    }
}
