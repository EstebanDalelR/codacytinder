package com.tinder.domain.common.model;

import com.tinder.domain.profile.model.ProfilePhoto;
import java.util.Collections;
import java.util.List;

public abstract class Photo {

    public static abstract class Builder {
        public abstract Photo build();

        public abstract Builder id(String str);

        public abstract Builder renders(List<Render> list);

        public abstract Builder url(String str);

        public abstract Builder videos(List<Video> list);
    }

    public enum Quality {
        XL,
        L,
        M,
        S
    }

    public static abstract class Render {

        public static abstract class Builder {
            public abstract Render build();

            public abstract Builder height(int i);

            public abstract Builder url(String str);

            public abstract Builder width(int i);
        }

        public abstract int height();

        public abstract String url();

        public abstract int width();

        public static Builder builder() {
            return new Builder();
        }
    }

    public static abstract class Video {

        public static abstract class Builder {
            public abstract Video build();

            public abstract Builder height(int i);

            public abstract Builder url(String str);

            public abstract Builder width(int i);
        }

        public abstract int height();

        public abstract String url();

        public abstract int width();

        public static Builder builder() {
            return new Builder();
        }
    }

    public abstract String id();

    public abstract List<Render> renders();

    public abstract String url();

    public abstract List<Video> videos();

    public static Builder builder() {
        return new Builder();
    }

    public static Photo createFromProfilePhoto(ProfilePhoto profilePhoto) {
        return builder().id(profilePhoto.getId()).url(profilePhoto.getUri()).renders(Collections.emptyList()).videos(Collections.emptyList()).build();
    }
}
