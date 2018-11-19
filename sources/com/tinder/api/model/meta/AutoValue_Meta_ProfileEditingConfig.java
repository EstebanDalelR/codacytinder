package com.tinder.api.model.meta;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.meta.Meta.ProfileEditingConfig;
import java.io.IOException;

final class AutoValue_Meta_ProfileEditingConfig extends C$AutoValue_Meta_ProfileEditingConfig {

    public static final class MoshiJsonAdapter extends JsonAdapter<ProfileEditingConfig> {
        private static final String[] NAMES = new String[]{"school_name_max_length", "job_title_max_length", "company_name_max_length"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> companyNameMaxLengthAdapter;
        private final JsonAdapter<Integer> jobTitleMaxLengthAdapter;
        private final JsonAdapter<Integer> schoolNameMaxLengthAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.schoolNameMaxLengthAdapter = c5987p.a(Integer.class);
            this.jobTitleMaxLengthAdapter = c5987p.a(Integer.class);
            this.companyNameMaxLengthAdapter = c5987p.a(Integer.class);
        }

        public ProfileEditingConfig fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Integer num = null;
            Integer num2 = null;
            Integer num3 = num2;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) this.schoolNameMaxLengthAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        num2 = (Integer) this.jobTitleMaxLengthAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        num3 = (Integer) this.companyNameMaxLengthAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Meta_ProfileEditingConfig(num, num2, num3);
        }

        public void toJson(C5983k c5983k, ProfileEditingConfig profileEditingConfig) throws IOException {
            c5983k.c();
            Integer schoolNameMaxLength = profileEditingConfig.schoolNameMaxLength();
            if (schoolNameMaxLength != null) {
                c5983k.b("school_name_max_length");
                this.schoolNameMaxLengthAdapter.toJson(c5983k, schoolNameMaxLength);
            }
            schoolNameMaxLength = profileEditingConfig.jobTitleMaxLength();
            if (schoolNameMaxLength != null) {
                c5983k.b("job_title_max_length");
                this.jobTitleMaxLengthAdapter.toJson(c5983k, schoolNameMaxLength);
            }
            profileEditingConfig = profileEditingConfig.companyNameMaxLength();
            if (profileEditingConfig != null) {
                c5983k.b("company_name_max_length");
                this.companyNameMaxLengthAdapter.toJson(c5983k, profileEditingConfig);
            }
            c5983k.d();
        }
    }

    AutoValue_Meta_ProfileEditingConfig(Integer num, Integer num2, Integer num3) {
        super(num, num2, num3);
    }
}
