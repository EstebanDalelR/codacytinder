package com.mapbox.mapboxsdk.annotations;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.geometry.LatLng;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions implements Parcelable {
    public static final Creator<PolylineOptions> CREATOR = new C58191();
    private Polyline polyline;

    /* renamed from: com.mapbox.mapboxsdk.annotations.PolylineOptions$1 */
    static class C58191 implements Creator<PolylineOptions> {
        C58191() {
        }

        public PolylineOptions createFromParcel(Parcel parcel) {
            return new PolylineOptions(parcel);
        }

        public PolylineOptions[] newArray(int i) {
            return new PolylineOptions[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    private PolylineOptions(Parcel parcel) {
        this.polyline = new Polyline();
        Iterable arrayList = new ArrayList();
        parcel.readList(arrayList, LatLng.class.getClassLoader());
        addAll(arrayList);
        alpha(parcel.readFloat());
        color(parcel.readInt());
        width(parcel.readFloat());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getPoints());
        parcel.writeFloat(getAlpha());
        parcel.writeInt(getColor());
        parcel.writeFloat(getWidth());
    }

    public PolylineOptions() {
        this.polyline = new Polyline();
    }

    public PolylineOptions add(LatLng latLng) {
        this.polyline.addPoint(latLng);
        return this;
    }

    public PolylineOptions add(LatLng... latLngArr) {
        for (LatLng add : latLngArr) {
            add(add);
        }
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            add(add);
        }
        return this;
    }

    public PolylineOptions alpha(float f) {
        this.polyline.setAlpha(f);
        return this;
    }

    public float getAlpha() {
        return this.polyline.getAlpha();
    }

    public PolylineOptions color(int i) {
        this.polyline.setColor(i);
        return this;
    }

    public int getColor() {
        return this.polyline.getColor();
    }

    public Polyline getPolyline() {
        return this.polyline;
    }

    public float getWidth() {
        return this.polyline.getWidth();
    }

    public PolylineOptions width(float f) {
        this.polyline.setWidth(f);
        return this;
    }

    public List<LatLng> getPoints() {
        return this.polyline.getPoints();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                PolylineOptions polylineOptions = (PolylineOptions) obj;
                if (Float.compare(polylineOptions.getAlpha(), getAlpha()) != 0 || getColor() != polylineOptions.getColor() || Float.compare(polylineOptions.getWidth(), getWidth()) != 0) {
                    return false;
                }
                if (getPoints() != null) {
                    if (getPoints().equals(polylineOptions.getPoints()) == null) {
                    }
                    return z;
                } else if (polylineOptions.getPoints() == null) {
                    return z;
                }
                z = false;
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int floatToIntBits = ((((((getAlpha() != 0.0f ? Float.floatToIntBits(getAlpha()) : 0) + 31) * 31) + getColor()) * 31) + (getWidth() != 0.0f ? Float.floatToIntBits(getWidth()) : 0)) * 31;
        if (getPoints() != null) {
            i = getPoints().hashCode();
        }
        return floatToIntBits + i;
    }
}
