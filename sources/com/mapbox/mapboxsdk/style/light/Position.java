package com.mapbox.mapboxsdk.style.light;

public class Position {
    private float azimuthalAngle;
    private float polarAngle;
    private float radialCoordinate;

    public Position(float f, float f2, float f3) {
        this.radialCoordinate = f;
        this.azimuthalAngle = f2;
        this.polarAngle = f3;
    }

    public static Position fromPosition(float f, float f2, float f3) {
        return new Position(f, f2, f3);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                Position position = (Position) obj;
                if (Float.compare(position.radialCoordinate, this.radialCoordinate) != 0 || Float.compare(position.azimuthalAngle, this.azimuthalAngle) != 0) {
                    return false;
                }
                if (Float.compare(position.polarAngle, this.polarAngle) != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int floatToIntBits = (((this.radialCoordinate != 0.0f ? Float.floatToIntBits(this.radialCoordinate) : 0) * 31) + (this.azimuthalAngle != 0.0f ? Float.floatToIntBits(this.azimuthalAngle) : 0)) * 31;
        if (this.polarAngle != 0.0f) {
            i = Float.floatToIntBits(this.polarAngle);
        }
        return floatToIntBits + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Position{radialCoordinate=");
        stringBuilder.append(this.radialCoordinate);
        stringBuilder.append(", azimuthalAngle=");
        stringBuilder.append(this.azimuthalAngle);
        stringBuilder.append(", polarAngle=");
        stringBuilder.append(this.polarAngle);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
