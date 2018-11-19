package com.tinder.domain.common.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import org.joda.time.DateTime;

public abstract class PerspectableUser implements User {

    public static abstract class Builder {
        public abstract PerspectableUser build();

        public abstract Builder commmonInterests(List<Interest> list);

        public abstract Builder commonConnections(List<CommonConnection> list);

        public abstract Builder distanceMiles(int i);

        public abstract Builder profileUser(ProfileUser profileUser);
    }

    @NonNull
    public abstract List<Interest> commmonInterests();

    @NonNull
    public abstract List<CommonConnection> commonConnections();

    public abstract int distanceMiles();

    @NonNull
    public abstract ProfileUser profileUser();

    public abstract Builder toBuilder();

    @NonNull
    public String id() {
        return profileUser().id();
    }

    @NonNull
    public List<Badge> badges() {
        return profileUser().badges();
    }

    @Nullable
    public String bio() {
        return profileUser().bio();
    }

    @Nullable
    public DateTime birthDate() {
        return profileUser().birthDate();
    }

    @NonNull
    public Gender gender() {
        return profileUser().gender();
    }

    @NonNull
    public String name() {
        return profileUser().name();
    }

    @NonNull
    public List<Photo> photos() {
        return profileUser().photos();
    }

    @NonNull
    public List<Job> jobs() {
        return profileUser().jobs();
    }

    @NonNull
    public List<School> schools() {
        return profileUser().schools();
    }

    public static Builder builder() {
        return new Builder();
    }
}
