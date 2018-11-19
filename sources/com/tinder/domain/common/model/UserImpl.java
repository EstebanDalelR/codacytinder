package com.tinder.domain.common.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.Gender.Value;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTime;

public abstract class UserImpl implements User {
    public static User GUEST = builder().id("").name("").photos(Collections.emptyList()).badges(Collections.emptyList()).bio("").birthDate(null).gender(Gender.create(Value.UNKNOWN)).jobs(Collections.emptyList()).schools(Collections.emptyList()).build();

    public static abstract class Builder {
        public abstract Builder badges(List<Badge> list);

        public abstract Builder bio(String str);

        public abstract Builder birthDate(DateTime dateTime);

        public abstract UserImpl build();

        public abstract Builder gender(Gender gender);

        public abstract Builder id(String str);

        public abstract Builder jobs(List<Job> list);

        public abstract Builder name(String str);

        public abstract Builder photos(List<Photo> list);

        public abstract Builder schools(List<School> list);
    }

    @NonNull
    public abstract List<Badge> badges();

    @Nullable
    public abstract String bio();

    @Nullable
    public abstract DateTime birthDate();

    @NonNull
    public abstract Gender gender();

    @NonNull
    public abstract String id();

    @NonNull
    public abstract List<Job> jobs();

    @NonNull
    public abstract String name();

    @NonNull
    public abstract List<Photo> photos();

    @NonNull
    public abstract List<School> schools();

    public static Builder builder() {
        return new Builder();
    }
}
