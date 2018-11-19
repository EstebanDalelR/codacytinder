package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;

/* renamed from: com.mapbox.geojson.$AutoValue_MultiPoint */
abstract class C$AutoValue_MultiPoint extends MultiPoint {
    private final BoundingBox bbox;
    private final List<Point> coordinates;
    private final String type;

    C$AutoValue_MultiPoint(String str, @Nullable BoundingBox boundingBox, @Nullable List<Point> list) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        this.bbox = boundingBox;
        this.coordinates = list;
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
    public List<Point> coordinates() {
        return this.coordinates;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiPoint{type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", bbox=");
        stringBuilder.append(this.bbox);
        stringBuilder.append(", coordinates=");
        stringBuilder.append(this.coordinates);
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
        r1 = r5 instanceof com.mapbox.geojson.MultiPoint;
        r2 = 0;
        if (r1 == 0) goto L_0x0048;
    L_0x0009:
        r5 = (com.mapbox.geojson.MultiPoint) r5;
        r1 = r4.type;
        r3 = r5.type();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0046;
    L_0x0017:
        r1 = r4.bbox;
        if (r1 != 0) goto L_0x0022;
    L_0x001b:
        r1 = r5.bbox();
        if (r1 != 0) goto L_0x0046;
    L_0x0021:
        goto L_0x002e;
    L_0x0022:
        r1 = r4.bbox;
        r3 = r5.bbox();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0046;
    L_0x002e:
        r1 = r4.coordinates;
        if (r1 != 0) goto L_0x0039;
    L_0x0032:
        r5 = r5.coordinates();
        if (r5 != 0) goto L_0x0046;
    L_0x0038:
        goto L_0x0047;
    L_0x0039:
        r1 = r4.coordinates;
        r5 = r5.coordinates();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0047;
    L_0x0046:
        r0 = 0;
    L_0x0047:
        return r0;
    L_0x0048:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.geojson.$AutoValue_MultiPoint.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((this.type.hashCode() ^ 1000003) * 1000003) ^ (this.bbox == null ? 0 : this.bbox.hashCode())) * 1000003;
        if (this.coordinates != null) {
            i = this.coordinates.hashCode();
        }
        return hashCode ^ i;
    }
}
