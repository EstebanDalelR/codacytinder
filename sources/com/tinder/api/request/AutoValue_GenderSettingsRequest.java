package com.tinder.api.request;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_GenderSettingsRequest extends C$AutoValue_GenderSettingsRequest {

    public static final class MoshiJsonAdapter extends JsonAdapter<GenderSettingsRequest> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_SHOW_GENDER, "gender", ManagerWebServices.PARAM_CUSTOM_GENDER, ManagerWebServices.PARAM_GENDER_FILTER};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> customGenderAdapter;
        private final JsonAdapter<Integer> genderAdapter;
        private final JsonAdapter<Boolean> showGenderOnProfileAdapter;
        private final JsonAdapter<Integer> showMeAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.showGenderOnProfileAdapter = c5987p.a(Boolean.class);
            this.genderAdapter = c5987p.a(Integer.class);
            this.customGenderAdapter = c5987p.a(String.class);
            this.showMeAdapter = c5987p.a(Integer.class);
        }

        public GenderSettingsRequest fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Boolean bool = null;
            Integer num = null;
            String str = num;
            Integer num2 = str;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        bool = (Boolean) this.showGenderOnProfileAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        num = (Integer) this.genderAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str = (String) this.customGenderAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        num2 = (Integer) this.showMeAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_GenderSettingsRequest(bool, num, str, num2);
        }

        public void toJson(C5983k c5983k, GenderSettingsRequest genderSettingsRequest) throws IOException {
            c5983k.c();
            Boolean showGenderOnProfile = genderSettingsRequest.showGenderOnProfile();
            if (showGenderOnProfile != null) {
                c5983k.b(ManagerWebServices.PARAM_SHOW_GENDER);
                this.showGenderOnProfileAdapter.toJson(c5983k, showGenderOnProfile);
            }
            Integer gender = genderSettingsRequest.gender();
            if (gender != null) {
                c5983k.b("gender");
                this.genderAdapter.toJson(c5983k, gender);
            }
            String customGender = genderSettingsRequest.customGender();
            if (customGender != null) {
                c5983k.b(ManagerWebServices.PARAM_CUSTOM_GENDER);
                this.customGenderAdapter.toJson(c5983k, customGender);
            }
            genderSettingsRequest = genderSettingsRequest.showMe();
            if (genderSettingsRequest != null) {
                c5983k.b(ManagerWebServices.PARAM_GENDER_FILTER);
                this.showMeAdapter.toJson(c5983k, genderSettingsRequest);
            }
            c5983k.d();
        }
    }

    AutoValue_GenderSettingsRequest(Boolean bool, Integer num, String str, Integer num2) {
        super(bool, num, str, num2);
    }
}
