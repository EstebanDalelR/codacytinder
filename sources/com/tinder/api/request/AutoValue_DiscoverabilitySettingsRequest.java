package com.tinder.api.request;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_DiscoverabilitySettingsRequest extends C$AutoValue_DiscoverabilitySettingsRequest {

    public static final class MoshiJsonAdapter extends JsonAdapter<DiscoverabilitySettingsRequest> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_DISCOVERABLE, "squads_discoverable"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> isDiscoverableAdapter;
        private final JsonAdapter<Boolean> isSquadsDiscoverableAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.isDiscoverableAdapter = c5987p.a(Boolean.class);
            this.isSquadsDiscoverableAdapter = c5987p.a(Boolean.class);
        }

        public DiscoverabilitySettingsRequest fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Boolean bool = null;
            Boolean bool2 = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        bool = (Boolean) this.isDiscoverableAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        bool2 = (Boolean) this.isSquadsDiscoverableAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_DiscoverabilitySettingsRequest(bool, bool2);
        }

        public void toJson(C5983k c5983k, DiscoverabilitySettingsRequest discoverabilitySettingsRequest) throws IOException {
            c5983k.c();
            Boolean isDiscoverable = discoverabilitySettingsRequest.isDiscoverable();
            if (isDiscoverable != null) {
                c5983k.b(ManagerWebServices.PARAM_DISCOVERABLE);
                this.isDiscoverableAdapter.toJson(c5983k, isDiscoverable);
            }
            discoverabilitySettingsRequest = discoverabilitySettingsRequest.isSquadsDiscoverable();
            if (discoverabilitySettingsRequest != null) {
                c5983k.b("squads_discoverable");
                this.isSquadsDiscoverableAdapter.toJson(c5983k, discoverabilitySettingsRequest);
            }
            c5983k.d();
        }
    }

    AutoValue_DiscoverabilitySettingsRequest(Boolean bool, Boolean bool2) {
        super(bool, bool2);
    }
}
