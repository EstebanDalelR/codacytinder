package com.tinder.domain.common.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;
import org.joda.time.DateTime;

public abstract class ProfileUser implements User {

    public static abstract class Builder {
        public abstract Builder badges(List<Badge> list);

        public abstract Builder bio(String str);

        public abstract Builder birthDate(DateTime dateTime);

        public abstract ProfileUser build();

        public abstract Builder connectionCount(int i);

        public abstract Builder gender(Gender gender);

        public abstract Builder hideAge(boolean z);

        public abstract Builder hideDistance(boolean z);

        public abstract Builder id(String str);

        public abstract Builder instagram(Instagram instagram);

        public abstract Builder jobs(List<Job> list);

        public abstract Builder name(String str);

        public abstract Builder photos(List<Photo> list);

        public abstract Builder schools(List<School> list);

        public abstract Builder showGenderOnProfile(boolean z);

        public abstract Builder spotifyConnected(boolean z);

        public abstract Builder spotifyThemeTrack(SpotifyTrack spotifyTrack);

        public abstract Builder spotifyTopArtists(List<SpotifyArtist> list);

        public abstract Builder verified(boolean z);
    }

    @NonNull
    public abstract List<Badge> badges();

    @Nullable
    public abstract String bio();

    @Nullable
    public abstract DateTime birthDate();

    public abstract int connectionCount();

    @NonNull
    public abstract Gender gender();

    public abstract boolean hideAge();

    public abstract boolean hideDistance();

    @NonNull
    public abstract String id();

    @Nullable
    public abstract Instagram instagram();

    @NonNull
    public abstract List<Job> jobs();

    @NonNull
    public abstract String name();

    @NonNull
    public abstract List<Photo> photos();

    @NonNull
    public abstract List<School> schools();

    public abstract boolean showGenderOnProfile();

    public abstract boolean spotifyConnected();

    @Nullable
    public abstract SpotifyTrack spotifyThemeTrack();

    @NonNull
    public abstract List<SpotifyArtist> spotifyTopArtists();

    public abstract Builder toBuilder();

    public abstract boolean verified();

    public ProfileUser withHideAge(boolean z) {
        return toBuilder().hideAge(z).build();
    }

    public ProfileUser withHideDistance(boolean z) {
        return toBuilder().hideDistance(z).build();
    }

    public ProfileUser withSchools(List<School> list) {
        return toBuilder().schools(list).build();
    }

    public ProfileUser withJobs(List<Job> list) {
        return toBuilder().jobs(list).build();
    }

    public static Builder builder() {
        return new Builder();
    }
}
