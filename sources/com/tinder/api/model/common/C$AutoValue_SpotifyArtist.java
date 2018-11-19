package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.model.common.$AutoValue_SpotifyArtist */
abstract class C$AutoValue_SpotifyArtist extends SpotifyArtist {
    private final String id;
    private final String name;
    private final Boolean selected;
    private final SpotifyThemeTrack topTrack;

    C$AutoValue_SpotifyArtist(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable SpotifyThemeTrack spotifyThemeTrack) {
        this.id = str;
        this.name = str2;
        this.selected = bool;
        this.topTrack = spotifyThemeTrack;
    }

    @Nullable
    public String id() {
        return this.id;
    }

    @Nullable
    public String name() {
        return this.name;
    }

    @Nullable
    public Boolean selected() {
        return this.selected;
    }

    @Nullable
    @Json(name = "top_track")
    public SpotifyThemeTrack topTrack() {
        return this.topTrack;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpotifyArtist{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", selected=");
        stringBuilder.append(this.selected);
        stringBuilder.append(", topTrack=");
        stringBuilder.append(this.topTrack);
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
        r1 = r5 instanceof com.tinder.api.model.common.SpotifyArtist;
        r2 = 0;
        if (r1 == 0) goto L_0x006a;
    L_0x0009:
        r5 = (com.tinder.api.model.common.SpotifyArtist) r5;
        r1 = r4.id;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.id();
        if (r1 != 0) goto L_0x0068;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0022:
        r1 = r4.name;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.name();
        if (r1 != 0) goto L_0x0068;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0039:
        r1 = r4.selected;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.selected();
        if (r1 != 0) goto L_0x0068;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.selected;
        r3 = r5.selected();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0050:
        r1 = r4.topTrack;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r5 = r5.topTrack();
        if (r5 != 0) goto L_0x0068;
    L_0x005a:
        goto L_0x0069;
    L_0x005b:
        r1 = r4.topTrack;
        r5 = r5.topTrack();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0069;
    L_0x0068:
        r0 = 0;
    L_0x0069:
        return r0;
    L_0x006a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_SpotifyArtist.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((this.id == null ? 0 : this.id.hashCode()) ^ 1000003) * 1000003) ^ (this.name == null ? 0 : this.name.hashCode())) * 1000003) ^ (this.selected == null ? 0 : this.selected.hashCode())) * 1000003;
        if (this.topTrack != null) {
            i = this.topTrack.hashCode();
        }
        return hashCode ^ i;
    }
}
