package com.tinder.api.request;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_UpdateProfileRequest extends C$AutoValue_UpdateProfileRequest {

    public static final class MoshiJsonAdapter extends JsonAdapter<UpdateProfileRequest> {
        private static final String[] NAMES = new String[]{"interestedInMales", "interestedInFemales", "distanceFilterInMiles", "ageMin", "ageMax", ManagerWebServices.PARAM_BIO, "gender", "customGender"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> ageMaxAdapter;
        private final JsonAdapter<Integer> ageMinAdapter;
        private final JsonAdapter<String> bioAdapter;
        private final JsonAdapter<String> customGenderAdapter;
        private final JsonAdapter<Float> distanceFilterInMilesAdapter;
        private final JsonAdapter<Integer> genderAdapter;
        private final JsonAdapter<Boolean> interestedInFemalesAdapter;
        private final JsonAdapter<Boolean> interestedInMalesAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.interestedInMalesAdapter = c5987p.a(Boolean.class);
            this.interestedInFemalesAdapter = c5987p.a(Boolean.class);
            this.distanceFilterInMilesAdapter = c5987p.a(Float.class);
            this.ageMinAdapter = c5987p.a(Integer.class);
            this.ageMaxAdapter = c5987p.a(Integer.class);
            this.bioAdapter = c5987p.a(String.class);
            this.genderAdapter = c5987p.a(Integer.class);
            this.customGenderAdapter = c5987p.a(String.class);
        }

        public UpdateProfileRequest fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Boolean bool = null;
            Boolean bool2 = bool;
            Float f = bool2;
            Integer num = f;
            Integer num2 = num;
            String str = num2;
            Integer num3 = str;
            String str2 = num3;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        bool = (Boolean) this.interestedInMalesAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        bool2 = (Boolean) this.interestedInFemalesAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        f = (Float) this.distanceFilterInMilesAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        num = (Integer) this.ageMinAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        num2 = (Integer) this.ageMaxAdapter.fromJson(jsonReader);
                        break;
                    case 5:
                        str = (String) this.bioAdapter.fromJson(jsonReader);
                        break;
                    case 6:
                        num3 = (Integer) this.genderAdapter.fromJson(jsonReader);
                        break;
                    case 7:
                        str2 = (String) this.customGenderAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_UpdateProfileRequest(bool, bool2, f, num, num2, str, num3, str2);
        }

        public void toJson(C5983k c5983k, UpdateProfileRequest updateProfileRequest) throws IOException {
            c5983k.c();
            Boolean interestedInMales = updateProfileRequest.interestedInMales();
            if (interestedInMales != null) {
                c5983k.b("interestedInMales");
                this.interestedInMalesAdapter.toJson(c5983k, interestedInMales);
            }
            interestedInMales = updateProfileRequest.interestedInFemales();
            if (interestedInMales != null) {
                c5983k.b("interestedInFemales");
                this.interestedInFemalesAdapter.toJson(c5983k, interestedInMales);
            }
            Float distanceFilterInMiles = updateProfileRequest.distanceFilterInMiles();
            if (distanceFilterInMiles != null) {
                c5983k.b("distanceFilterInMiles");
                this.distanceFilterInMilesAdapter.toJson(c5983k, distanceFilterInMiles);
            }
            Integer ageMin = updateProfileRequest.ageMin();
            if (ageMin != null) {
                c5983k.b("ageMin");
                this.ageMinAdapter.toJson(c5983k, ageMin);
            }
            ageMin = updateProfileRequest.ageMax();
            if (ageMin != null) {
                c5983k.b("ageMax");
                this.ageMaxAdapter.toJson(c5983k, ageMin);
            }
            String bio = updateProfileRequest.bio();
            if (bio != null) {
                c5983k.b(ManagerWebServices.PARAM_BIO);
                this.bioAdapter.toJson(c5983k, bio);
            }
            ageMin = updateProfileRequest.gender();
            if (ageMin != null) {
                c5983k.b("gender");
                this.genderAdapter.toJson(c5983k, ageMin);
            }
            updateProfileRequest = updateProfileRequest.customGender();
            if (updateProfileRequest != null) {
                c5983k.b("customGender");
                this.customGenderAdapter.toJson(c5983k, updateProfileRequest);
            }
            c5983k.d();
        }
    }

    AutoValue_UpdateProfileRequest(Boolean bool, Boolean bool2, Float f, Integer num, Integer num2, String str, Integer num3, String str2) {
        super(bool, bool2, f, num, num2, str, num3, str2);
    }
}
