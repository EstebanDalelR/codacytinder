package com.tinder.api.model.common;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_Job_Company.MoshiJsonAdapter;

public abstract class Job {

    public static abstract class Builder {
        public abstract Job build();

        public abstract Builder setCompany(@NonNull Company company);

        public abstract Builder setTitle(@NonNull Title title);
    }

    public static abstract class Company {

        public static abstract class Builder {
            public abstract Company build();

            public abstract Builder setDisplayed(@Nullable Boolean bool);

            public abstract Builder setId(@Nullable String str);

            public abstract Builder setName(@Nullable String str);
        }

        @Nullable
        public abstract Boolean displayed();

        @Nullable
        public abstract String id();

        @Nullable
        public abstract String name();

        public static JsonAdapter<Company> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p).nullSafe();
        }

        public static Builder builder() {
            return new Builder();
        }
    }

    public static abstract class Title {

        public static abstract class Builder {
            public abstract Title build();

            public abstract Builder setDisplayed(@Nullable Boolean bool);

            public abstract Builder setId(@Nullable String str);

            public abstract Builder setName(@Nullable String str);
        }

        @Nullable
        public abstract Boolean displayed();

        @Nullable
        public abstract String id();

        @Nullable
        public abstract String name();

        public static JsonAdapter<Title> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Job_Title.MoshiJsonAdapter(c5987p).nullSafe();
        }

        public static Builder builder() {
            return new Builder();
        }
    }

    @Nullable
    protected abstract Company company();

    @Nullable
    protected abstract Title title();

    public static JsonAdapter<Job> jsonAdapter(C5987p c5987p) {
        return new AutoValue_Job.MoshiJsonAdapter(c5987p);
    }

    @Nullable
    public String companyId() {
        Company company = company();
        return company != null ? company.id() : null;
    }

    @Nullable
    public String companyName() {
        Company company = company();
        return company != null ? company.name() : null;
    }

    @Nullable
    public Boolean isCompanyDisplayed() {
        Company company = company();
        return company != null ? company.displayed() : Boolean.FALSE;
    }

    @Nullable
    public String titleId() {
        Title title = title();
        return title != null ? title.id() : null;
    }

    @Nullable
    public String titleName() {
        Title title = title();
        return title != null ? title.name() : null;
    }

    @Nullable
    public Boolean isTitleDisplayed() {
        Title title = title();
        return title != null ? title.displayed() : Boolean.FALSE;
    }

    public static Builder builder() {
        return new Builder();
    }
}
