package com.tinder.domain.common.model;

import android.support.annotation.Nullable;

final class AutoValue_SpotifyArtist extends SpotifyArtist {
    private final String id;
    private final String name;
    private final boolean selected;
    private final SpotifyTrack topTrack;

    static final class Builder extends com.tinder.domain.common.model.SpotifyArtist.Builder {
        private String id;
        private String name;
        private Boolean selected;
        private SpotifyTrack topTrack;

        Builder() {
        }

        Builder(SpotifyArtist spotifyArtist) {
            this.name = spotifyArtist.name();
            this.id = spotifyArtist.id();
            this.topTrack = spotifyArtist.topTrack();
            this.selected = Boolean.valueOf(spotifyArtist.selected());
        }

        public com.tinder.domain.common.model.SpotifyArtist.Builder name(String str) {
            this.name = str;
            return this;
        }

        public com.tinder.domain.common.model.SpotifyArtist.Builder id(String str) {
            this.id = str;
            return this;
        }

        public com.tinder.domain.common.model.SpotifyArtist.Builder topTrack(@Nullable SpotifyTrack spotifyTrack) {
            this.topTrack = spotifyTrack;
            return this;
        }

        public com.tinder.domain.common.model.SpotifyArtist.Builder selected(boolean z) {
            this.selected = Boolean.valueOf(z);
            return this;
        }

        public SpotifyArtist build() {
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
            if (this.selected == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" selected");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SpotifyArtist(this.name, this.id, this.topTrack, this.selected.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_SpotifyArtist(String str, String str2, @Nullable SpotifyTrack spotifyTrack, boolean z) {
        this.name = str;
        this.id = str2;
        this.topTrack = spotifyTrack;
        this.selected = z;
    }

    public String name() {
        return this.name;
    }

    public String id() {
        return this.id;
    }

    @Nullable
    public SpotifyTrack topTrack() {
        return this.topTrack;
    }

    public boolean selected() {
        return this.selected;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpotifyArtist{name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", topTrack=");
        stringBuilder.append(this.topTrack);
        stringBuilder.append(", selected=");
        stringBuilder.append(this.selected);
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
        r1 = r5 instanceof com.tinder.domain.common.model.SpotifyArtist;
        r2 = 0;
        if (r1 == 0) goto L_0x0045;
    L_0x0009:
        r5 = (com.tinder.domain.common.model.SpotifyArtist) r5;
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0043;
    L_0x0017:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0043;
    L_0x0023:
        r1 = r4.topTrack;
        if (r1 != 0) goto L_0x002e;
    L_0x0027:
        r1 = r5.topTrack();
        if (r1 != 0) goto L_0x0043;
    L_0x002d:
        goto L_0x003a;
    L_0x002e:
        r1 = r4.topTrack;
        r3 = r5.topTrack();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0043;
    L_0x003a:
        r1 = r4.selected;
        r5 = r5.selected();
        if (r1 != r5) goto L_0x0043;
    L_0x0042:
        goto L_0x0044;
    L_0x0043:
        r0 = 0;
    L_0x0044:
        return r0;
    L_0x0045:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.common.model.AutoValue_SpotifyArtist.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ (this.topTrack == null ? 0 : this.topTrack.hashCode())) * 1000003) ^ (this.selected ? 1231 : 1237);
    }
}
