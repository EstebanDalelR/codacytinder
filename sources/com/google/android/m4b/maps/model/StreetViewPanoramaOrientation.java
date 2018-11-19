package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;

public class StreetViewPanoramaOrientation implements C5468c {
    public static final StreetViewPanoramaOrientationCreator CREATOR = new StreetViewPanoramaOrientationCreator();
    /* renamed from: a */
    private final int f25197a;
    public final float bearing;
    public final float tilt;

    public static final class Builder {
        /* renamed from: a */
        public float f20498a;
        /* renamed from: b */
        public float f20499b;

        public Builder(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            this.f20498a = streetViewPanoramaOrientation.bearing;
            this.f20499b = streetViewPanoramaOrientation.tilt;
        }

        /* renamed from: a */
        public final Builder m23903a(float f) {
            this.f20499b = f;
            return this;
        }

        /* renamed from: b */
        public final Builder m23905b(float f) {
            this.f20498a = f;
            return this;
        }

        /* renamed from: a */
        public final StreetViewPanoramaOrientation m23904a() {
            return new StreetViewPanoramaOrientation(this.f20499b, this.f20498a);
        }
    }

    public int describeContents() {
        return 0;
    }

    StreetViewPanoramaOrientation(int i, float f, float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        C5462v.m23773b(z, "Tilt needs to be between -90 and 90 inclusive");
        this.f25197a = i;
        this.tilt = f + 0;
        if (((double) f2) <= 0.0d) {
            f2 = (f2 % 360.0f) + 360.0f;
        }
        this.bearing = f2 % 360.0f;
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        this(1, f, f2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        StreetViewPanoramaOrientationCreator.m23906a(this, parcel);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    /* renamed from: a */
    final int m30011a() {
        return this.f25197a;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new Builder(streetViewPanoramaOrientation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaOrientation.bearing);
    }

    public String toString() {
        return C5461u.m23765a(this).m23764a("tilt", Float.valueOf(this.tilt)).m23764a("bearing", Float.valueOf(this.bearing)).toString();
    }
}
