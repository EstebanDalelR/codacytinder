package com.tinder.domain.common.model;

import android.support.annotation.Nullable;
import com.tinder.domain.common.model.SpotifyTrack.Artist;
import java.util.List;

final class AutoValue_SpotifyTrack extends SpotifyTrack {
    private final List<Artist> artists;
    private final String artworkUrl;
    private final String id;
    private final boolean isPlayable;
    private final String name;
    private final int popularity;
    private final String previewUrl;
    private final String uri;

    static final class Builder extends com.tinder.domain.common.model.SpotifyTrack.Builder {
        private List<Artist> artists;
        private String artworkUrl;
        private String id;
        private Boolean isPlayable;
        private String name;
        private Integer popularity;
        private String previewUrl;
        private String uri;

        Builder() {
        }

        Builder(SpotifyTrack spotifyTrack) {
            this.name = spotifyTrack.name();
            this.id = spotifyTrack.id();
            this.artists = spotifyTrack.artists();
            this.isPlayable = Boolean.valueOf(spotifyTrack.isPlayable());
            this.popularity = Integer.valueOf(spotifyTrack.popularity());
            this.previewUrl = spotifyTrack.previewUrl();
            this.uri = spotifyTrack.uri();
            this.artworkUrl = spotifyTrack.artworkUrl();
        }

        public com.tinder.domain.common.model.SpotifyTrack.Builder name(String str) {
            this.name = str;
            return this;
        }

        public com.tinder.domain.common.model.SpotifyTrack.Builder id(String str) {
            this.id = str;
            return this;
        }

        public com.tinder.domain.common.model.SpotifyTrack.Builder artists(List<Artist> list) {
            this.artists = list;
            return this;
        }

        public com.tinder.domain.common.model.SpotifyTrack.Builder isPlayable(boolean z) {
            this.isPlayable = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.common.model.SpotifyTrack.Builder popularity(int i) {
            this.popularity = Integer.valueOf(i);
            return this;
        }

        public com.tinder.domain.common.model.SpotifyTrack.Builder previewUrl(@Nullable String str) {
            this.previewUrl = str;
            return this;
        }

        public com.tinder.domain.common.model.SpotifyTrack.Builder uri(String str) {
            this.uri = str;
            return this;
        }

        public com.tinder.domain.common.model.SpotifyTrack.Builder artworkUrl(@Nullable String str) {
            this.artworkUrl = str;
            return this;
        }

        public SpotifyTrack build() {
            String str = "";
            if (this.name == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" name");
                str = stringBuilder.toString();
            }
            if (this.id == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.artists == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" artists");
                str = stringBuilder.toString();
            }
            if (this.isPlayable == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isPlayable");
                str = stringBuilder.toString();
            }
            if (this.popularity == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" popularity");
                str = stringBuilder.toString();
            }
            if (this.uri == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" uri");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SpotifyTrack(this.name, this.id, this.artists, this.isPlayable.booleanValue(), this.popularity.intValue(), this.previewUrl, this.uri, this.artworkUrl);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_SpotifyTrack(String str, String str2, List<Artist> list, boolean z, int i, @Nullable String str3, String str4, @Nullable String str5) {
        this.name = str;
        this.id = str2;
        this.artists = list;
        this.isPlayable = z;
        this.popularity = i;
        this.previewUrl = str3;
        this.uri = str4;
        this.artworkUrl = str5;
    }

    public String name() {
        return this.name;
    }

    public String id() {
        return this.id;
    }

    public List<Artist> artists() {
        return this.artists;
    }

    public boolean isPlayable() {
        return this.isPlayable;
    }

    public int popularity() {
        return this.popularity;
    }

    @Nullable
    public String previewUrl() {
        return this.previewUrl;
    }

    public String uri() {
        return this.uri;
    }

    @Nullable
    public String artworkUrl() {
        return this.artworkUrl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpotifyTrack{name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", artists=");
        stringBuilder.append(this.artists);
        stringBuilder.append(", isPlayable=");
        stringBuilder.append(this.isPlayable);
        stringBuilder.append(", popularity=");
        stringBuilder.append(this.popularity);
        stringBuilder.append(", previewUrl=");
        stringBuilder.append(this.previewUrl);
        stringBuilder.append(", uri=");
        stringBuilder.append(this.uri);
        stringBuilder.append(", artworkUrl=");
        stringBuilder.append(this.artworkUrl);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.domain.common.model.SpotifyTrack;
        r2 = 0;
        if (r1 == 0) goto L_0x007c;
    L_0x0009:
        r5 = (com.tinder.domain.common.model.SpotifyTrack) r5;
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007a;
    L_0x0017:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007a;
    L_0x0023:
        r1 = r4.artists;
        r3 = r5.artists();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007a;
    L_0x002f:
        r1 = r4.isPlayable;
        r3 = r5.isPlayable();
        if (r1 != r3) goto L_0x007a;
    L_0x0037:
        r1 = r4.popularity;
        r3 = r5.popularity();
        if (r1 != r3) goto L_0x007a;
    L_0x003f:
        r1 = r4.previewUrl;
        if (r1 != 0) goto L_0x004a;
    L_0x0043:
        r1 = r5.previewUrl();
        if (r1 != 0) goto L_0x007a;
    L_0x0049:
        goto L_0x0056;
    L_0x004a:
        r1 = r4.previewUrl;
        r3 = r5.previewUrl();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007a;
    L_0x0056:
        r1 = r4.uri;
        r3 = r5.uri();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007a;
    L_0x0062:
        r1 = r4.artworkUrl;
        if (r1 != 0) goto L_0x006d;
    L_0x0066:
        r5 = r5.artworkUrl();
        if (r5 != 0) goto L_0x007a;
    L_0x006c:
        goto L_0x007b;
    L_0x006d:
        r1 = r4.artworkUrl;
        r5 = r5.artworkUrl();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x007a;
    L_0x0079:
        goto L_0x007b;
    L_0x007a:
        r0 = 0;
    L_0x007b:
        return r0;
    L_0x007c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.common.model.AutoValue_SpotifyTrack.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.artists.hashCode()) * 1000003) ^ (this.isPlayable ? 1231 : 1237)) * 1000003) ^ this.popularity) * 1000003) ^ (this.previewUrl == null ? 0 : this.previewUrl.hashCode())) * 1000003) ^ this.uri.hashCode()) * 1000003;
        if (this.artworkUrl != null) {
            i = this.artworkUrl.hashCode();
        }
        return hashCode ^ i;
    }
}
