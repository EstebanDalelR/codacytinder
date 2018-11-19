package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.location.LocationDetails;
import com.tinder.api.model.profile.Travel.TravelLocationInfo;
import java.io.IOException;

final class AutoValue_Travel_TravelLocationInfo extends C$AutoValue_Travel_TravelLocationInfo {

    public static final class MoshiJsonAdapter extends JsonAdapter<TravelLocationInfo> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_LAT, ManagerWebServices.PARAM_LON, ManagerWebServices.PARAM_LOCALITY, ManagerWebServices.PARAM_AREA_LEVEL_1, ManagerWebServices.PARAM_AREA_LEVEL_2, ManagerWebServices.PARAM_COUNTRY, ManagerWebServices.PARAM_ROUTE, ManagerWebServices.PARAM_STREET_ADDRESS, ManagerWebServices.PARAM_STREET_NUMBER};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<LocationDetails> administrativeAreaLevel1Adapter;
        private final JsonAdapter<LocationDetails> administrativeAreaLevel2Adapter;
        private final JsonAdapter<LocationDetails> countryAdapter;
        private final JsonAdapter<Double> latAdapter;
        private final JsonAdapter<LocationDetails> localityAdapter;
        private final JsonAdapter<Double> lonAdapter;
        private final JsonAdapter<LocationDetails> routeAdapter;
        private final JsonAdapter<LocationDetails> streetAdapter;
        private final JsonAdapter<String> streetAddressAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.latAdapter = c5987p.a(Double.TYPE);
            this.lonAdapter = c5987p.a(Double.TYPE);
            this.localityAdapter = c5987p.a(LocationDetails.class);
            this.administrativeAreaLevel1Adapter = c5987p.a(LocationDetails.class);
            this.administrativeAreaLevel2Adapter = c5987p.a(LocationDetails.class);
            this.countryAdapter = c5987p.a(LocationDetails.class);
            this.routeAdapter = c5987p.a(LocationDetails.class);
            this.streetAddressAdapter = c5987p.a(String.class);
            this.streetAdapter = c5987p.a(LocationDetails.class);
        }

        public TravelLocationInfo fromJson(JsonReader jsonReader) throws IOException {
            MoshiJsonAdapter moshiJsonAdapter = this;
            JsonReader jsonReader2 = jsonReader;
            jsonReader.e();
            double d = 0.0d;
            double d2 = d;
            LocationDetails locationDetails = null;
            LocationDetails locationDetails2 = locationDetails;
            LocationDetails locationDetails3 = locationDetails2;
            LocationDetails locationDetails4 = locationDetails3;
            LocationDetails locationDetails5 = locationDetails4;
            String str = locationDetails5;
            LocationDetails locationDetails6 = str;
            while (jsonReader.g()) {
                switch (jsonReader2.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        d = ((Double) moshiJsonAdapter.latAdapter.fromJson(jsonReader2)).doubleValue();
                        break;
                    case 1:
                        d2 = ((Double) moshiJsonAdapter.lonAdapter.fromJson(jsonReader2)).doubleValue();
                        break;
                    case 2:
                        locationDetails = (LocationDetails) moshiJsonAdapter.localityAdapter.fromJson(jsonReader2);
                        break;
                    case 3:
                        locationDetails2 = (LocationDetails) moshiJsonAdapter.administrativeAreaLevel1Adapter.fromJson(jsonReader2);
                        break;
                    case 4:
                        locationDetails3 = (LocationDetails) moshiJsonAdapter.administrativeAreaLevel2Adapter.fromJson(jsonReader2);
                        break;
                    case 5:
                        locationDetails4 = (LocationDetails) moshiJsonAdapter.countryAdapter.fromJson(jsonReader2);
                        break;
                    case 6:
                        locationDetails5 = (LocationDetails) moshiJsonAdapter.routeAdapter.fromJson(jsonReader2);
                        break;
                    case 7:
                        str = (String) moshiJsonAdapter.streetAddressAdapter.fromJson(jsonReader2);
                        break;
                    case 8:
                        locationDetails6 = (LocationDetails) moshiJsonAdapter.streetAdapter.fromJson(jsonReader2);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Travel_TravelLocationInfo(d, d2, locationDetails, locationDetails2, locationDetails3, locationDetails4, locationDetails5, str, locationDetails6);
        }

        public void toJson(C5983k c5983k, TravelLocationInfo travelLocationInfo) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_LAT);
            this.latAdapter.toJson(c5983k, Double.valueOf(travelLocationInfo.lat()));
            c5983k.b(ManagerWebServices.PARAM_LON);
            this.lonAdapter.toJson(c5983k, Double.valueOf(travelLocationInfo.lon()));
            LocationDetails locality = travelLocationInfo.locality();
            if (locality != null) {
                c5983k.b(ManagerWebServices.PARAM_LOCALITY);
                this.localityAdapter.toJson(c5983k, locality);
            }
            locality = travelLocationInfo.administrativeAreaLevel1();
            if (locality != null) {
                c5983k.b(ManagerWebServices.PARAM_AREA_LEVEL_1);
                this.administrativeAreaLevel1Adapter.toJson(c5983k, locality);
            }
            locality = travelLocationInfo.administrativeAreaLevel2();
            if (locality != null) {
                c5983k.b(ManagerWebServices.PARAM_AREA_LEVEL_2);
                this.administrativeAreaLevel2Adapter.toJson(c5983k, locality);
            }
            c5983k.b(ManagerWebServices.PARAM_COUNTRY);
            this.countryAdapter.toJson(c5983k, travelLocationInfo.country());
            locality = travelLocationInfo.route();
            if (locality != null) {
                c5983k.b(ManagerWebServices.PARAM_ROUTE);
                this.routeAdapter.toJson(c5983k, locality);
            }
            String streetAddress = travelLocationInfo.streetAddress();
            if (streetAddress != null) {
                c5983k.b(ManagerWebServices.PARAM_STREET_ADDRESS);
                this.streetAddressAdapter.toJson(c5983k, streetAddress);
            }
            travelLocationInfo = travelLocationInfo.street();
            if (travelLocationInfo != null) {
                c5983k.b(ManagerWebServices.PARAM_STREET_NUMBER);
                this.streetAdapter.toJson(c5983k, travelLocationInfo);
            }
            c5983k.d();
        }
    }

    AutoValue_Travel_TravelLocationInfo(double d, double d2, LocationDetails locationDetails, LocationDetails locationDetails2, LocationDetails locationDetails3, LocationDetails locationDetails4, LocationDetails locationDetails5, String str, LocationDetails locationDetails6) {
        super(d, d2, locationDetails, locationDetails2, locationDetails3, locationDetails4, locationDetails5, str, locationDetails6);
    }
}
