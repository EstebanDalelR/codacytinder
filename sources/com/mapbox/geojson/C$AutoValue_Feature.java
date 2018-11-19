package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonObject;

/* renamed from: com.mapbox.geojson.$AutoValue_Feature */
abstract class C$AutoValue_Feature extends Feature {
    private final BoundingBox bbox;
    private final Geometry geometry;
    private final String id;
    private final JsonObject properties;
    private final String type;

    C$AutoValue_Feature(String str, @Nullable BoundingBox boundingBox, @Nullable String str2, @Nullable Geometry geometry, @Nullable JsonObject jsonObject) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        this.bbox = boundingBox;
        this.id = str2;
        this.geometry = geometry;
        this.properties = jsonObject;
    }

    @NonNull
    public String type() {
        return this.type;
    }

    @Nullable
    public BoundingBox bbox() {
        return this.bbox;
    }

    @Nullable
    public String id() {
        return this.id;
    }

    @Nullable
    public Geometry geometry() {
        return this.geometry;
    }

    @Nullable
    public JsonObject properties() {
        return this.properties;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Feature{type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", bbox=");
        stringBuilder.append(this.bbox);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", geometry=");
        stringBuilder.append(this.geometry);
        stringBuilder.append(", properties=");
        stringBuilder.append(this.properties);
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
        r1 = r5 instanceof com.mapbox.geojson.Feature;
        r2 = 0;
        if (r1 == 0) goto L_0x0076;
    L_0x0009:
        r5 = (com.mapbox.geojson.Feature) r5;
        r1 = r4.type;
        r3 = r5.type();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x0017:
        r1 = r4.bbox;
        if (r1 != 0) goto L_0x0022;
    L_0x001b:
        r1 = r5.bbox();
        if (r1 != 0) goto L_0x0074;
    L_0x0021:
        goto L_0x002e;
    L_0x0022:
        r1 = r4.bbox;
        r3 = r5.bbox();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x002e:
        r1 = r4.id;
        if (r1 != 0) goto L_0x0039;
    L_0x0032:
        r1 = r5.id();
        if (r1 != 0) goto L_0x0074;
    L_0x0038:
        goto L_0x0045;
    L_0x0039:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x0045:
        r1 = r4.geometry;
        if (r1 != 0) goto L_0x0050;
    L_0x0049:
        r1 = r5.geometry();
        if (r1 != 0) goto L_0x0074;
    L_0x004f:
        goto L_0x005c;
    L_0x0050:
        r1 = r4.geometry;
        r3 = r5.geometry();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x005c:
        r1 = r4.properties;
        if (r1 != 0) goto L_0x0067;
    L_0x0060:
        r5 = r5.properties();
        if (r5 != 0) goto L_0x0074;
    L_0x0066:
        goto L_0x0075;
    L_0x0067:
        r1 = r4.properties;
        r5 = r5.properties();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0074;
    L_0x0073:
        goto L_0x0075;
    L_0x0074:
        r0 = 0;
    L_0x0075:
        return r0;
    L_0x0076:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.geojson.$AutoValue_Feature.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((this.type.hashCode() ^ 1000003) * 1000003) ^ (this.bbox == null ? 0 : this.bbox.hashCode())) * 1000003) ^ (this.id == null ? 0 : this.id.hashCode())) * 1000003) ^ (this.geometry == null ? 0 : this.geometry.hashCode())) * 1000003;
        if (this.properties != null) {
            i = this.properties.hashCode();
        }
        return hashCode ^ i;
    }
}
