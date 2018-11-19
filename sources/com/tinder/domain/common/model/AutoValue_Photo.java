package com.tinder.domain.common.model;

import com.tinder.domain.common.model.Photo.Render;
import com.tinder.domain.common.model.Photo.Video;
import java.util.List;

final class AutoValue_Photo extends Photo {
    private final String id;
    private final List<Render> renders;
    private final String url;
    private final List<Video> videos;

    static final class Builder extends com.tinder.domain.common.model.Photo.Builder {
        private String id;
        private List<Render> renders;
        private String url;
        private List<Video> videos;

        Builder() {
        }

        Builder(Photo photo) {
            this.id = photo.id();
            this.url = photo.url();
            this.renders = photo.renders();
            this.videos = photo.videos();
        }

        public com.tinder.domain.common.model.Photo.Builder id(String str) {
            this.id = str;
            return this;
        }

        public com.tinder.domain.common.model.Photo.Builder url(String str) {
            this.url = str;
            return this;
        }

        public com.tinder.domain.common.model.Photo.Builder renders(List<Render> list) {
            this.renders = list;
            return this;
        }

        public com.tinder.domain.common.model.Photo.Builder videos(List<Video> list) {
            this.videos = list;
            return this;
        }

        public Photo build() {
            String str = "";
            if (this.id == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.url == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" url");
                str = stringBuilder.toString();
            }
            if (this.renders == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" renders");
                str = stringBuilder.toString();
            }
            if (this.videos == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" videos");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_Photo(this.id, this.url, this.renders, this.videos);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_Photo(String str, String str2, List<Render> list, List<Video> list2) {
        this.id = str;
        this.url = str2;
        this.renders = list;
        this.videos = list2;
    }

    public String id() {
        return this.id;
    }

    public String url() {
        return this.url;
    }

    public List<Render> renders() {
        return this.renders;
    }

    public List<Video> videos() {
        return this.videos;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Photo{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", renders=");
        stringBuilder.append(this.renders);
        stringBuilder.append(", videos=");
        stringBuilder.append(this.videos);
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
        if (!this.id.equals(photo.id()) || !this.url.equals(photo.url()) || !this.renders.equals(photo.renders()) || this.videos.equals(photo.videos()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.url.hashCode()) * 1000003) ^ this.renders.hashCode()) * 1000003) ^ this.videos.hashCode();
    }
}
