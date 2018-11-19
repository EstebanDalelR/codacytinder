package com.tinder.domain.common.model;

import com.tinder.domain.common.model.SpotifyTrack.Artist;

final class AutoValue_SpotifyTrack_Artist extends Artist {
    private final String id;
    private final String name;

    static final class Builder extends com.tinder.domain.common.model.SpotifyTrack.Artist.Builder {
        private String id;
        private String name;

        Builder() {
        }

        Builder(Artist artist) {
            this.id = artist.id();
            this.name = artist.name();
        }

        public com.tinder.domain.common.model.SpotifyTrack.Artist.Builder id(String str) {
            this.id = str;
            return this;
        }

        public com.tinder.domain.common.model.SpotifyTrack.Artist.Builder name(String str) {
            this.name = str;
            return this;
        }

        public Artist build() {
            String str = "";
            if (this.id == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.name == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" name");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SpotifyTrack_Artist(this.id, this.name);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_SpotifyTrack_Artist(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public String id() {
        return this.id;
    }

    public String name() {
        return this.name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Artist{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) obj;
        if (!this.id.equals(artist.id()) || this.name.equals(artist.name()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.id.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode();
    }
}
