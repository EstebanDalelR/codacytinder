package com.tinder.domain.common.model;

import android.support.annotation.Nullable;
import java.util.List;

public abstract class SpotifyTrack {

    public static abstract class Artist {

        public static abstract class Builder {
            public abstract Artist build();

            public abstract Builder id(String str);

            public abstract Builder name(String str);
        }

        public abstract String id();

        public abstract String name();

        public static Builder builder() {
            return new Builder();
        }
    }

    public static abstract class Builder {
        public abstract Builder artists(List<Artist> list);

        public abstract Builder artworkUrl(String str);

        public abstract SpotifyTrack build();

        public abstract Builder id(String str);

        public abstract Builder isPlayable(boolean z);

        public abstract Builder name(String str);

        public abstract Builder popularity(int i);

        public abstract Builder previewUrl(String str);

        public abstract Builder uri(String str);
    }

    public abstract List<Artist> artists();

    @Nullable
    public abstract String artworkUrl();

    public abstract String id();

    public abstract boolean isPlayable();

    public abstract String name();

    public abstract int popularity();

    @Nullable
    public abstract String previewUrl();

    public abstract String uri();

    public static Builder builder() {
        return new Builder();
    }
}
