package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.List;

/* renamed from: com.mapbox.geojson.$AutoValue_GeometryCollection */
abstract class C$AutoValue_GeometryCollection extends GeometryCollection {
    private final BoundingBox bbox;
    private final List<Geometry> geometries;
    private final String type;

    C$AutoValue_GeometryCollection(String str, @Nullable BoundingBox boundingBox, List<Geometry> list) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list == null) {
            throw new NullPointerException("Null geometries");
        }
        this.geometries = list;
    }

    @NonNull
    public String type() {
        return this.type;
    }

    @Nullable
    public BoundingBox bbox() {
        return this.bbox;
    }

    @NonNull
    public List<Geometry> geometries() {
        return this.geometries;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GeometryCollection{type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", bbox=");
        stringBuilder.append(this.bbox);
        stringBuilder.append(", geometries=");
        stringBuilder.append(this.geometries);
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
        r1 = r5 instanceof com.mapbox.geojson.GeometryCollection;
        r2 = 0;
        if (r1 == 0) goto L_0x003d;
    L_0x0009:
        r5 = (com.mapbox.geojson.GeometryCollection) r5;
        r1 = r4.type;
        r3 = r5.type();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003b;
    L_0x0017:
        r1 = r4.bbox;
        if (r1 != 0) goto L_0x0022;
    L_0x001b:
        r1 = r5.bbox();
        if (r1 != 0) goto L_0x003b;
    L_0x0021:
        goto L_0x002e;
    L_0x0022:
        r1 = r4.bbox;
        r3 = r5.bbox();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003b;
    L_0x002e:
        r1 = r4.geometries;
        r5 = r5.geometries();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003c;
    L_0x003b:
        r0 = 0;
    L_0x003c:
        return r0;
    L_0x003d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.geojson.$AutoValue_GeometryCollection.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((this.type.hashCode() ^ 1000003) * 1000003) ^ (this.bbox == null ? 0 : this.bbox.hashCode())) * 1000003) ^ this.geometries.hashCode();
    }
}
