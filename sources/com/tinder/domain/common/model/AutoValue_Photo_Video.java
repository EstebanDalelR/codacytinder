package com.tinder.domain.common.model;

import com.tinder.domain.common.model.Photo.Video;

final class AutoValue_Photo_Video extends Video {
    private final int height;
    private final String url;
    private final int width;

    static final class Builder extends com.tinder.domain.common.model.Photo.Video.Builder {
        private Integer height;
        private String url;
        private Integer width;

        Builder() {
        }

        Builder(Video video) {
            this.width = Integer.valueOf(video.width());
            this.height = Integer.valueOf(video.height());
            this.url = video.url();
        }

        public com.tinder.domain.common.model.Photo.Video.Builder width(int i) {
            this.width = Integer.valueOf(i);
            return this;
        }

        public com.tinder.domain.common.model.Photo.Video.Builder height(int i) {
            this.height = Integer.valueOf(i);
            return this;
        }

        public com.tinder.domain.common.model.Photo.Video.Builder url(String str) {
            this.url = str;
            return this;
        }

        public Video build() {
            String str = "";
            if (this.width == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" width");
                str = stringBuilder.toString();
            }
            if (this.height == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" height");
                str = stringBuilder.toString();
            }
            if (this.url == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" url");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_Photo_Video(this.width.intValue(), this.height.intValue(), this.url);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_Photo_Video(int i, int i2, String str) {
        this.width = i;
        this.height = i2;
        this.url = str;
    }

    public int width() {
        return this.width;
    }

    public int height() {
        return this.height;
    }

    public String url() {
        return this.url;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Video{width=");
        stringBuilder.append(this.width);
        stringBuilder.append(", height=");
        stringBuilder.append(this.height);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        if (this.width != video.width() || this.height != video.height() || this.url.equals(video.url()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.width ^ 1000003) * 1000003) ^ this.height) * 1000003) ^ this.url.hashCode();
    }
}
