package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;

public class StreetViewPanoramaLink implements C5468c {
    public static final StreetViewPanoramaLinkCreator CREATOR = new StreetViewPanoramaLinkCreator();
    /* renamed from: a */
    private final int f25195a;
    public final float bearing;
    public final String panoId;

    public int describeContents() {
        return 0;
    }

    StreetViewPanoramaLink(int i, String str, float f) {
        this.f25195a = i;
        this.panoId = str;
        if (((double) f) <= 0.0d) {
            f = (f % 360.0f) + 360.0f;
        }
        this.bearing = f % 360.0f;
    }

    public StreetViewPanoramaLink(String str, float f) {
        this(1, str, f);
    }

    public void writeToParcel(Parcel parcel, int i) {
        StreetViewPanoramaLinkCreator.m23897a(this, parcel);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.panoId, Float.valueOf(this.bearing)});
    }

    /* renamed from: a */
    final int m30009a() {
        return this.f25195a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.panoId.equals(streetViewPanoramaLink.panoId) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaLink.bearing);
    }

    public String toString() {
        return C5461u.m23765a(this).m23764a("panoId", this.panoId).m23764a("bearing", Float.valueOf(this.bearing)).toString();
    }
}
