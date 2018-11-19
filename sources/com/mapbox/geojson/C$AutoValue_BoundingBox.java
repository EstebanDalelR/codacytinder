package com.mapbox.geojson;

import android.support.annotation.NonNull;

/* renamed from: com.mapbox.geojson.$AutoValue_BoundingBox */
abstract class C$AutoValue_BoundingBox extends BoundingBox {
    private final Point northeast;
    private final Point southwest;

    C$AutoValue_BoundingBox(Point point, Point point2) {
        if (point == null) {
            throw new NullPointerException("Null southwest");
        }
        this.southwest = point;
        if (point2 == null) {
            throw new NullPointerException("Null northeast");
        }
        this.northeast = point2;
    }

    @NonNull
    public Point southwest() {
        return this.southwest;
    }

    @NonNull
    public Point northeast() {
        return this.northeast;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BoundingBox{southwest=");
        stringBuilder.append(this.southwest);
        stringBuilder.append(", northeast=");
        stringBuilder.append(this.northeast);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoundingBox)) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) obj;
        if (!this.southwest.equals(boundingBox.southwest()) || this.northeast.equals(boundingBox.northeast()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.southwest.hashCode() ^ 1000003) * 1000003) ^ this.northeast.hashCode();
    }
}
