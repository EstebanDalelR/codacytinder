package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;

public class StreetViewPanoramaCamera implements C5468c {
    public static final StreetViewPanoramaCameraCreator CREATOR = new StreetViewPanoramaCameraCreator();
    /* renamed from: a */
    private final int f25193a;
    /* renamed from: b */
    private StreetViewPanoramaOrientation f25194b;
    public final float bearing;
    public final float tilt;
    public final float zoom;

    public static final class Builder {
        /* renamed from: a */
        public float f20495a;
        /* renamed from: b */
        public float f20496b;
        /* renamed from: c */
        public float f20497c;

        public Builder(StreetViewPanoramaCamera streetViewPanoramaCamera) {
            this.f20497c = streetViewPanoramaCamera.zoom;
            this.f20495a = streetViewPanoramaCamera.bearing;
            this.f20496b = streetViewPanoramaCamera.tilt;
        }
    }

    public int describeContents() {
        return 0;
    }

    StreetViewPanoramaCamera(int i, float f, float f2, float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        C5462v.m23773b(z, "Tilt needs to be between -90 and 90 inclusive");
        this.f25193a = i;
        if (((double) f) <= 0.0d) {
            f = 0.0f;
        }
        this.zoom = f;
        this.tilt = 0.0f + f2;
        this.bearing = (((double) f3) <= 0 ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        this.f25194b = new com.google.android.m4b.maps.model.StreetViewPanoramaOrientation.Builder().m23903a(f2).m23905b(f3).m23904a();
    }

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        this(1, f, f2, f3);
    }

    public void writeToParcel(Parcel parcel, int i) {
        StreetViewPanoramaCameraCreator.m23894a(this, parcel);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    /* renamed from: a */
    final int m30008a() {
        return this.f25193a;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new Builder(streetViewPanoramaCamera);
    }

    public StreetViewPanoramaOrientation getOrientation() {
        return this.f25194b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.zoom) == Float.floatToIntBits(streetViewPanoramaCamera.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaCamera.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaCamera.bearing);
    }

    public String toString() {
        return C5461u.m23765a(this).m23764a("zoom", Float.valueOf(this.zoom)).m23764a("tilt", Float.valueOf(this.tilt)).m23764a("bearing", Float.valueOf(this.bearing)).toString();
    }
}
