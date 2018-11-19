package com.tinder.domain.common.model;

import java.util.Collections;
import java.util.List;
import java8.util.Optional;
import org.joda.time.DateTime;

public abstract class Instagram {
    public static Instagram DISCONNECTED = builder().username("").profilePicture("").mediaCount(0).photos(Collections.emptyList()).completedInitialFetch(false).lastFetchedTime(Optional.a()).build();

    public static abstract class Builder {
        public abstract Instagram build();

        public abstract Builder completedInitialFetch(boolean z);

        public abstract Builder lastFetchedTime(Optional<DateTime> optional);

        public abstract Builder mediaCount(int i);

        public abstract Builder photos(List<Photo> list);

        public abstract Builder profilePicture(String str);

        public abstract Builder username(String str);
    }

    public static abstract class Photo {

        public static abstract class Builder {
            public abstract Photo build();

            public abstract Builder image(String str);

            public abstract Builder link(String str);

            public abstract Builder thumbnail(String str);

            public abstract Builder timestampMillis(long j);
        }

        public abstract String image();

        public abstract String link();

        public abstract String thumbnail();

        public abstract long timestampMillis();

        public static Builder builder() {
            return new Builder();
        }
    }

    public abstract boolean completedInitialFetch();

    public abstract Optional<DateTime> lastFetchedTime();

    public abstract int mediaCount();

    public abstract List<Photo> photos();

    public abstract String profilePicture();

    public abstract Builder toBuilder();

    public abstract String username();

    public static Builder builder() {
        return new Builder();
    }
}
