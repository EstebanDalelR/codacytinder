package com.mapbox.mapboxsdk.annotations;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.geometry.LatLng;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions implements Parcelable {
    public static final Creator<PolygonOptions> CREATOR = new C58181();
    private Polygon polygon;

    /* renamed from: com.mapbox.mapboxsdk.annotations.PolygonOptions$1 */
    static class C58181 implements Creator<PolygonOptions> {
        C58181() {
        }

        public PolygonOptions createFromParcel(Parcel parcel) {
            return new PolygonOptions(parcel);
        }

        public PolygonOptions[] newArray(int i) {
            return new PolygonOptions[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    private PolygonOptions(Parcel parcel) {
        this.polygon = new Polygon();
        Iterable arrayList = new ArrayList();
        parcel.readList(arrayList, LatLng.class.getClassLoader());
        addAll(arrayList);
        arrayList = new ArrayList();
        parcel.readList(arrayList, LatLng.class.getClassLoader());
        addAllHoles(arrayList);
        alpha(parcel.readFloat());
        fillColor(parcel.readInt());
        strokeColor(parcel.readInt());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getPoints());
        parcel.writeList(getHoles());
        parcel.writeFloat(getAlpha());
        parcel.writeInt(getFillColor());
        parcel.writeInt(getStrokeColor());
    }

    public PolygonOptions() {
        this.polygon = new Polygon();
    }

    public PolygonOptions add(LatLng latLng) {
        this.polygon.addPoint(latLng);
        return this;
    }

    public PolygonOptions add(LatLng... latLngArr) {
        for (LatLng add : latLngArr) {
            add(add);
        }
        return this;
    }

    public PolygonOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            add(add);
        }
        return this;
    }

    public PolygonOptions addHole(List<LatLng> list) {
        this.polygon.addHole(list);
        return this;
    }

    public PolygonOptions addHole(List<LatLng>... listArr) {
        for (List addHole : listArr) {
            addHole(addHole);
        }
        return this;
    }

    public PolygonOptions addAllHoles(Iterable<List<LatLng>> iterable) {
        for (List addHole : iterable) {
            addHole(addHole);
        }
        return this;
    }

    public PolygonOptions alpha(float f) {
        this.polygon.setAlpha(f);
        return this;
    }

    public float getAlpha() {
        return this.polygon.getAlpha();
    }

    public PolygonOptions fillColor(int i) {
        this.polygon.setFillColor(i);
        return this;
    }

    public int getFillColor() {
        return this.polygon.getFillColor();
    }

    public Polygon getPolygon() {
        return this.polygon;
    }

    public PolygonOptions strokeColor(int i) {
        this.polygon.setStrokeColor(i);
        return this;
    }

    public int getStrokeColor() {
        return this.polygon.getStrokeColor();
    }

    public List<LatLng> getPoints() {
        return this.polygon.getPoints();
    }

    public List<List<LatLng>> getHoles() {
        return this.polygon.getHoles();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r5 == 0) goto L_0x0073;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0012;
    L_0x0011:
        goto L_0x0073;
    L_0x0012:
        r5 = (com.mapbox.mapboxsdk.annotations.PolygonOptions) r5;
        r2 = r5.getAlpha();
        r3 = r4.getAlpha();
        r2 = java.lang.Float.compare(r2, r3);
        if (r2 == 0) goto L_0x0023;
    L_0x0022:
        return r1;
    L_0x0023:
        r2 = r4.getFillColor();
        r3 = r5.getFillColor();
        if (r2 == r3) goto L_0x002e;
    L_0x002d:
        return r1;
    L_0x002e:
        r2 = r4.getStrokeColor();
        r3 = r5.getStrokeColor();
        if (r2 == r3) goto L_0x0039;
    L_0x0038:
        return r1;
    L_0x0039:
        r2 = r4.getPoints();
        if (r2 == 0) goto L_0x004e;
    L_0x003f:
        r2 = r4.getPoints();
        r3 = r5.getPoints();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0055;
    L_0x004d:
        goto L_0x0054;
    L_0x004e:
        r2 = r5.getPoints();
        if (r2 == 0) goto L_0x0055;
    L_0x0054:
        return r1;
    L_0x0055:
        r2 = r4.getHoles();
        if (r2 == 0) goto L_0x006a;
    L_0x005b:
        r2 = r4.getHoles();
        r5 = r5.getHoles();
        r5 = r2.equals(r5);
        if (r5 != 0) goto L_0x0072;
    L_0x0069:
        goto L_0x0071;
    L_0x006a:
        r5 = r5.getHoles();
        if (r5 != 0) goto L_0x0071;
    L_0x0070:
        goto L_0x0072;
    L_0x0071:
        r0 = 0;
    L_0x0072:
        return r0;
    L_0x0073:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.annotations.PolygonOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int floatToIntBits = ((((((((getAlpha() != 0.0f ? Float.floatToIntBits(getAlpha()) : 0) + 31) * 31) + getFillColor()) * 31) + getStrokeColor()) * 31) + (getPoints() != null ? getPoints().hashCode() : 0)) * 31;
        if (getHoles() != null) {
            i = getHoles().hashCode();
        }
        return floatToIntBits + i;
    }
}
