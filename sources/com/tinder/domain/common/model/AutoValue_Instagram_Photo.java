package com.tinder.domain.common.model;

import com.tinder.domain.common.model.Instagram.Photo;

final class AutoValue_Instagram_Photo extends Photo {
    private final String image;
    private final String link;
    private final String thumbnail;
    private final long timestampMillis;

    static final class Builder extends com.tinder.domain.common.model.Instagram.Photo.Builder {
        private String image;
        private String link;
        private String thumbnail;
        private Long timestampMillis;

        Builder() {
        }

        Builder(Photo photo) {
            this.link = photo.link();
            this.timestampMillis = Long.valueOf(photo.timestampMillis());
            this.thumbnail = photo.thumbnail();
            this.image = photo.image();
        }

        public com.tinder.domain.common.model.Instagram.Photo.Builder link(String str) {
            this.link = str;
            return this;
        }

        public com.tinder.domain.common.model.Instagram.Photo.Builder timestampMillis(long j) {
            this.timestampMillis = Long.valueOf(j);
            return this;
        }

        public com.tinder.domain.common.model.Instagram.Photo.Builder thumbnail(String str) {
            this.thumbnail = str;
            return this;
        }

        public com.tinder.domain.common.model.Instagram.Photo.Builder image(String str) {
            this.image = str;
            return this;
        }

        public Photo build() {
            String str = "";
            if (this.link == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" link");
                str = stringBuilder.toString();
            }
            if (this.timestampMillis == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" timestampMillis");
                str = stringBuilder.toString();
            }
            if (this.thumbnail == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" thumbnail");
                str = stringBuilder.toString();
            }
            if (this.image == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" image");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_Instagram_Photo(this.link, this.timestampMillis.longValue(), this.thumbnail, this.image);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_Instagram_Photo(String str, long j, String str2, String str3) {
        this.link = str;
        this.timestampMillis = j;
        this.thumbnail = str2;
        this.image = str3;
    }

    public String link() {
        return this.link;
    }

    public long timestampMillis() {
        return this.timestampMillis;
    }

    public String thumbnail() {
        return this.thumbnail;
    }

    public String image() {
        return this.image;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Photo{link=");
        stringBuilder.append(this.link);
        stringBuilder.append(", timestampMillis=");
        stringBuilder.append(this.timestampMillis);
        stringBuilder.append(", thumbnail=");
        stringBuilder.append(this.thumbnail);
        stringBuilder.append(", image=");
        stringBuilder.append(this.image);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Photo)) {
            return false;
        }
        Photo photo = (Photo) obj;
        if (!this.link.equals(photo.link()) || this.timestampMillis != photo.timestampMillis() || !this.thumbnail.equals(photo.thumbnail()) || this.image.equals(photo.image()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((((int) (((long) ((this.link.hashCode() ^ 1000003) * 1000003)) ^ ((this.timestampMillis >>> 32) ^ this.timestampMillis))) * 1000003) ^ this.thumbnail.hashCode()) * 1000003) ^ this.image.hashCode();
    }
}
