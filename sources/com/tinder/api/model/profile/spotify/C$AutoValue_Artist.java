package com.tinder.api.model.profile.spotify;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.model.profile.spotify.$AutoValue_Artist */
abstract class C$AutoValue_Artist extends Artist {
    private final String id;
    private final Boolean isSelected;
    private final String name;
    private final Track topTrack;

    C$AutoValue_Artist(String str, String str2, @Nullable Track track, @Nullable Boolean bool) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        if (str2 == null) {
            throw new NullPointerException("Null name");
        }
        this.name = str2;
        this.topTrack = track;
        this.isSelected = bool;
    }

    @Json(name = "id")
    public String id() {
        return this.id;
    }

    @Json(name = "name")
    public String name() {
        return this.name;
    }

    @Nullable
    @Json(name = "top_track")
    public Track topTrack() {
        return this.topTrack;
    }

    @Nullable
    @Json(name = "selected")
    public Boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Artist{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", topTrack=");
        stringBuilder.append(this.topTrack);
        stringBuilder.append(", isSelected=");
        stringBuilder.append(this.isSelected);
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
        r1 = r5 instanceof com.tinder.api.model.profile.spotify.Artist;
        r2 = 0;
        if (r1 == 0) goto L_0x0054;
    L_0x0009:
        r5 = (com.tinder.api.model.profile.spotify.Artist) r5;
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0052;
    L_0x0017:
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0052;
    L_0x0023:
        r1 = r4.topTrack;
        if (r1 != 0) goto L_0x002e;
    L_0x0027:
        r1 = r5.topTrack();
        if (r1 != 0) goto L_0x0052;
    L_0x002d:
        goto L_0x003a;
    L_0x002e:
        r1 = r4.topTrack;
        r3 = r5.topTrack();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0052;
    L_0x003a:
        r1 = r4.isSelected;
        if (r1 != 0) goto L_0x0045;
    L_0x003e:
        r5 = r5.isSelected();
        if (r5 != 0) goto L_0x0052;
    L_0x0044:
        goto L_0x0053;
    L_0x0045:
        r1 = r4.isSelected;
        r5 = r5.isSelected();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0053;
    L_0x0052:
        r0 = 0;
    L_0x0053:
        return r0;
    L_0x0054:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.spotify.$AutoValue_Artist.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ (this.topTrack == null ? 0 : this.topTrack.hashCode())) * 1000003;
        if (this.isSelected != null) {
            i = this.isSelected.hashCode();
        }
        return hashCode ^ i;
    }
}
