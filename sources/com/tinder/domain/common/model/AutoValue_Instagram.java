package com.tinder.domain.common.model;

import com.tinder.domain.common.model.Instagram.Photo;
import java.util.List;
import java8.util.Optional;
import org.joda.time.DateTime;

final class AutoValue_Instagram extends Instagram {
    private final boolean completedInitialFetch;
    private final Optional<DateTime> lastFetchedTime;
    private final int mediaCount;
    private final List<Photo> photos;
    private final String profilePicture;
    private final String username;

    static final class Builder extends com.tinder.domain.common.model.Instagram.Builder {
        private Boolean completedInitialFetch;
        private Optional<DateTime> lastFetchedTime;
        private Integer mediaCount;
        private List<Photo> photos;
        private String profilePicture;
        private String username;

        Builder() {
        }

        Builder(Instagram instagram) {
            this.username = instagram.username();
            this.profilePicture = instagram.profilePicture();
            this.mediaCount = Integer.valueOf(instagram.mediaCount());
            this.photos = instagram.photos();
            this.completedInitialFetch = Boolean.valueOf(instagram.completedInitialFetch());
            this.lastFetchedTime = instagram.lastFetchedTime();
        }

        public com.tinder.domain.common.model.Instagram.Builder username(String str) {
            this.username = str;
            return this;
        }

        public com.tinder.domain.common.model.Instagram.Builder profilePicture(String str) {
            this.profilePicture = str;
            return this;
        }

        public com.tinder.domain.common.model.Instagram.Builder mediaCount(int i) {
            this.mediaCount = Integer.valueOf(i);
            return this;
        }

        public com.tinder.domain.common.model.Instagram.Builder photos(List<Photo> list) {
            this.photos = list;
            return this;
        }

        public com.tinder.domain.common.model.Instagram.Builder completedInitialFetch(boolean z) {
            this.completedInitialFetch = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.common.model.Instagram.Builder lastFetchedTime(Optional<DateTime> optional) {
            this.lastFetchedTime = optional;
            return this;
        }

        public Instagram build() {
            String str = "";
            if (this.username == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" username");
                str = stringBuilder.toString();
            }
            if (this.profilePicture == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" profilePicture");
                str = stringBuilder.toString();
            }
            if (this.mediaCount == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" mediaCount");
                str = stringBuilder.toString();
            }
            if (this.photos == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" photos");
                str = stringBuilder.toString();
            }
            if (this.completedInitialFetch == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" completedInitialFetch");
                str = stringBuilder.toString();
            }
            if (this.lastFetchedTime == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" lastFetchedTime");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_Instagram(this.username, this.profilePicture, this.mediaCount.intValue(), this.photos, this.completedInitialFetch.booleanValue(), this.lastFetchedTime);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_Instagram(String str, String str2, int i, List<Photo> list, boolean z, Optional<DateTime> optional) {
        this.username = str;
        this.profilePicture = str2;
        this.mediaCount = i;
        this.photos = list;
        this.completedInitialFetch = z;
        this.lastFetchedTime = optional;
    }

    public String username() {
        return this.username;
    }

    public String profilePicture() {
        return this.profilePicture;
    }

    public int mediaCount() {
        return this.mediaCount;
    }

    public List<Photo> photos() {
        return this.photos;
    }

    public boolean completedInitialFetch() {
        return this.completedInitialFetch;
    }

    public Optional<DateTime> lastFetchedTime() {
        return this.lastFetchedTime;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Instagram{username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", profilePicture=");
        stringBuilder.append(this.profilePicture);
        stringBuilder.append(", mediaCount=");
        stringBuilder.append(this.mediaCount);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.photos);
        stringBuilder.append(", completedInitialFetch=");
        stringBuilder.append(this.completedInitialFetch);
        stringBuilder.append(", lastFetchedTime=");
        stringBuilder.append(this.lastFetchedTime);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Instagram)) {
            return false;
        }
        Instagram instagram = (Instagram) obj;
        if (!this.username.equals(instagram.username()) || !this.profilePicture.equals(instagram.profilePicture()) || this.mediaCount != instagram.mediaCount() || !this.photos.equals(instagram.photos()) || this.completedInitialFetch != instagram.completedInitialFetch() || this.lastFetchedTime.equals(instagram.lastFetchedTime()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((this.username.hashCode() ^ 1000003) * 1000003) ^ this.profilePicture.hashCode()) * 1000003) ^ this.mediaCount) * 1000003) ^ this.photos.hashCode()) * 1000003) ^ (this.completedInitialFetch ? 1231 : 1237)) * 1000003) ^ this.lastFetchedTime.hashCode();
    }

    public com.tinder.domain.common.model.Instagram.Builder toBuilder() {
        return new Builder(this);
    }
}
