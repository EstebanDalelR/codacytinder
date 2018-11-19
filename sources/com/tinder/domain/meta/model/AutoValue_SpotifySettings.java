package com.tinder.domain.meta.model;

import android.support.annotation.Nullable;
import com.tinder.domain.common.model.SpotifyArtist;
import com.tinder.domain.common.model.SpotifyTrack;
import com.tinder.domain.meta.model.SpotifySettings.UserType;
import java.util.List;
import org.joda.time.DateTime;

final class AutoValue_SpotifySettings extends SpotifySettings {
    private final boolean isConnected;
    private final DateTime lastUpdated;
    private final SpotifyTrack themeTrack;
    private final List<SpotifyArtist> topArtists;
    private final UserType userType;
    private final String username;

    static final class Builder extends com.tinder.domain.meta.model.SpotifySettings.Builder {
        private Boolean isConnected;
        private DateTime lastUpdated;
        private SpotifyTrack themeTrack;
        private List<SpotifyArtist> topArtists;
        private UserType userType;
        private String username;

        Builder() {
        }

        Builder(SpotifySettings spotifySettings) {
            this.topArtists = spotifySettings.topArtists();
            this.themeTrack = spotifySettings.themeTrack();
            this.username = spotifySettings.username();
            this.userType = spotifySettings.userType();
            this.lastUpdated = spotifySettings.lastUpdated();
            this.isConnected = Boolean.valueOf(spotifySettings.isConnected());
        }

        public com.tinder.domain.meta.model.SpotifySettings.Builder topArtists(@Nullable List<SpotifyArtist> list) {
            this.topArtists = list;
            return this;
        }

        public com.tinder.domain.meta.model.SpotifySettings.Builder themeTrack(@Nullable SpotifyTrack spotifyTrack) {
            this.themeTrack = spotifyTrack;
            return this;
        }

        public com.tinder.domain.meta.model.SpotifySettings.Builder username(@Nullable String str) {
            this.username = str;
            return this;
        }

        public com.tinder.domain.meta.model.SpotifySettings.Builder userType(@Nullable UserType userType) {
            this.userType = userType;
            return this;
        }

        public com.tinder.domain.meta.model.SpotifySettings.Builder lastUpdated(@Nullable DateTime dateTime) {
            this.lastUpdated = dateTime;
            return this;
        }

        public com.tinder.domain.meta.model.SpotifySettings.Builder isConnected(boolean z) {
            this.isConnected = Boolean.valueOf(z);
            return this;
        }

        public SpotifySettings build() {
            String str = "";
            if (this.isConnected == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isConnected");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SpotifySettings(this.topArtists, this.themeTrack, this.username, this.userType, this.lastUpdated, this.isConnected.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_SpotifySettings(@Nullable List<SpotifyArtist> list, @Nullable SpotifyTrack spotifyTrack, @Nullable String str, @Nullable UserType userType, @Nullable DateTime dateTime, boolean z) {
        this.topArtists = list;
        this.themeTrack = spotifyTrack;
        this.username = str;
        this.userType = userType;
        this.lastUpdated = dateTime;
        this.isConnected = z;
    }

    @Nullable
    List<SpotifyArtist> topArtists() {
        return this.topArtists;
    }

    @Nullable
    SpotifyTrack themeTrack() {
        return this.themeTrack;
    }

    @Nullable
    String username() {
        return this.username;
    }

    @Nullable
    UserType userType() {
        return this.userType;
    }

    @Nullable
    DateTime lastUpdated() {
        return this.lastUpdated;
    }

    boolean isConnected() {
        return this.isConnected;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpotifySettings{topArtists=");
        stringBuilder.append(this.topArtists);
        stringBuilder.append(", themeTrack=");
        stringBuilder.append(this.themeTrack);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", userType=");
        stringBuilder.append(this.userType);
        stringBuilder.append(", lastUpdated=");
        stringBuilder.append(this.lastUpdated);
        stringBuilder.append(", isConnected=");
        stringBuilder.append(this.isConnected);
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
        r1 = r5 instanceof com.tinder.domain.meta.model.SpotifySettings;
        r2 = 0;
        if (r1 == 0) goto L_0x0089;
    L_0x0009:
        r5 = (com.tinder.domain.meta.model.SpotifySettings) r5;
        r1 = r4.topArtists;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.topArtists();
        if (r1 != 0) goto L_0x0087;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.topArtists;
        r3 = r5.topArtists();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0087;
    L_0x0022:
        r1 = r4.themeTrack;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.themeTrack();
        if (r1 != 0) goto L_0x0087;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.themeTrack;
        r3 = r5.themeTrack();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0087;
    L_0x0039:
        r1 = r4.username;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.username();
        if (r1 != 0) goto L_0x0087;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.username;
        r3 = r5.username();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0087;
    L_0x0050:
        r1 = r4.userType;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.userType();
        if (r1 != 0) goto L_0x0087;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.userType;
        r3 = r5.userType();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0087;
    L_0x0067:
        r1 = r4.lastUpdated;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.lastUpdated();
        if (r1 != 0) goto L_0x0087;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.lastUpdated;
        r3 = r5.lastUpdated();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0087;
    L_0x007e:
        r1 = r4.isConnected;
        r5 = r5.isConnected();
        if (r1 != r5) goto L_0x0087;
    L_0x0086:
        goto L_0x0088;
    L_0x0087:
        r0 = 0;
    L_0x0088:
        return r0;
    L_0x0089:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.meta.model.AutoValue_SpotifySettings.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((this.topArtists == null ? 0 : this.topArtists.hashCode()) ^ 1000003) * 1000003) ^ (this.themeTrack == null ? 0 : this.themeTrack.hashCode())) * 1000003) ^ (this.username == null ? 0 : this.username.hashCode())) * 1000003) ^ (this.userType == null ? 0 : this.userType.hashCode())) * 1000003;
        if (this.lastUpdated != null) {
            i = this.lastUpdated.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ (this.isConnected ? 1231 : 1237);
    }
}
