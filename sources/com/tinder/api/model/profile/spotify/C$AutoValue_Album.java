package com.tinder.api.model.profile.spotify;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import java.util.List;
import java.util.Map;

/* renamed from: com.tinder.api.model.profile.spotify.$AutoValue_Album */
abstract class C$AutoValue_Album extends Album {
    private final String id;
    private final List<Map<String, String>> images;
    private final String name;
    private final String uri;

    C$AutoValue_Album(String str, String str2, @Nullable String str3, @Nullable List<Map<String, String>> list) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        if (str2 == null) {
            throw new NullPointerException("Null name");
        }
        this.name = str2;
        this.uri = str3;
        this.images = list;
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
    @Json(name = "uri")
    public String uri() {
        return this.uri;
    }

    @Nullable
    @Json(name = "images")
    public List<Map<String, String>> images() {
        return this.images;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Album{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", uri=");
        stringBuilder.append(this.uri);
        stringBuilder.append(", images=");
        stringBuilder.append(this.images);
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
        r1 = r5 instanceof com.tinder.api.model.profile.spotify.Album;
        r2 = 0;
        if (r1 == 0) goto L_0x0054;
    L_0x0009:
        r5 = (com.tinder.api.model.profile.spotify.Album) r5;
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
        r1 = r4.uri;
        if (r1 != 0) goto L_0x002e;
    L_0x0027:
        r1 = r5.uri();
        if (r1 != 0) goto L_0x0052;
    L_0x002d:
        goto L_0x003a;
    L_0x002e:
        r1 = r4.uri;
        r3 = r5.uri();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0052;
    L_0x003a:
        r1 = r4.images;
        if (r1 != 0) goto L_0x0045;
    L_0x003e:
        r5 = r5.images();
        if (r5 != 0) goto L_0x0052;
    L_0x0044:
        goto L_0x0053;
    L_0x0045:
        r1 = r4.images;
        r5 = r5.images();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.spotify.$AutoValue_Album.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((this.id.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ (this.uri == null ? 0 : this.uri.hashCode())) * 1000003;
        if (this.images != null) {
            i = this.images.hashCode();
        }
        return hashCode ^ i;
    }
}
