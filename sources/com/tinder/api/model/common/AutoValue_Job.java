package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.Job.Company;
import com.tinder.api.model.common.Job.Title;
import java.io.IOException;

final class AutoValue_Job extends C$AutoValue_Job {

    public static final class MoshiJsonAdapter extends JsonAdapter<Job> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_JOB_COMPANY, ManagerWebServices.PARAM_JOB_TITLE};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Company> companyAdapter;
        private final JsonAdapter<Title> titleAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.companyAdapter = c5987p.a(Company.class);
            this.titleAdapter = c5987p.a(Title.class);
        }

        public Job fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Company company = null;
            Title title = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        company = (Company) this.companyAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        title = (Title) this.titleAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Job(company, title);
        }

        public void toJson(C5983k c5983k, Job job) throws IOException {
            c5983k.c();
            Company company = job.company();
            if (company != null) {
                c5983k.b(ManagerWebServices.PARAM_JOB_COMPANY);
                this.companyAdapter.toJson(c5983k, company);
            }
            job = job.title();
            if (job != null) {
                c5983k.b(ManagerWebServices.PARAM_JOB_TITLE);
                this.titleAdapter.toJson(c5983k, job);
            }
            c5983k.d();
        }
    }

    AutoValue_Job(Company company, Title title) {
        super(company, title);
    }
}
