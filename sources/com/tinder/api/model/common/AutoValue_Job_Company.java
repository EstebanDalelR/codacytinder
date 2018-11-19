package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.common.Job.Company;
import java.io.IOException;

final class AutoValue_Job_Company extends C$AutoValue_Job_Company {

    public static final class MoshiJsonAdapter extends JsonAdapter<Company> {
        private static final String[] NAMES = new String[]{"id", "name", "displayed"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> displayedAdapter;
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<String> nameAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
            this.nameAdapter = c5987p.a(String.class);
            this.displayedAdapter = c5987p.a(Boolean.class);
        }

        public Company fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            Boolean bool = str2;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.idAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.nameAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        bool = (Boolean) this.displayedAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Job_Company(str, str2, bool);
        }

        public void toJson(C5983k c5983k, Company company) throws IOException {
            c5983k.c();
            String id = company.id();
            if (id != null) {
                c5983k.b("id");
                this.idAdapter.toJson(c5983k, id);
            }
            id = company.name();
            if (id != null) {
                c5983k.b("name");
                this.nameAdapter.toJson(c5983k, id);
            }
            company = company.displayed();
            if (company != null) {
                c5983k.b("displayed");
                this.displayedAdapter.toJson(c5983k, company);
            }
            c5983k.d();
        }
    }

    AutoValue_Job_Company(String str, String str2, Boolean bool) {
        super(str, str2, bool);
    }
}
