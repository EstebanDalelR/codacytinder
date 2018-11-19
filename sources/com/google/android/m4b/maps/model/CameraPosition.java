package com.google.android.m4b.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;

public final class CameraPosition implements C5468c {
    public static final CameraPositionCreator CREATOR = new CameraPositionCreator();
    /* renamed from: a */
    private final int f25128a;
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public static final class Builder {
        /* renamed from: a */
        private LatLng f20478a;
        /* renamed from: b */
        private float f20479b;
        /* renamed from: c */
        private float f20480c;
        /* renamed from: d */
        private float f20481d;

        public Builder(CameraPosition cameraPosition) {
            this.f20478a = cameraPosition.target;
            this.f20479b = cameraPosition.zoom;
            this.f20480c = cameraPosition.tilt;
            this.f20481d = cameraPosition.bearing;
        }

        /* renamed from: a */
        public final Builder m23848a(LatLng latLng) {
            this.f20478a = latLng;
            return this;
        }

        /* renamed from: a */
        public final Builder m23847a(float f) {
            this.f20479b = f;
            return this;
        }

        /* renamed from: b */
        public final Builder m23850b(float f) {
            this.f20480c = f;
            return this;
        }

        /* renamed from: c */
        public final Builder m23851c(float f) {
            this.f20481d = f;
            return this;
        }

        /* renamed from: a */
        public final CameraPosition m23849a() {
            return new CameraPosition(this.f20478a, this.f20479b, this.f20480c, this.f20481d);
        }
    }

    public final int describeContents() {
        return 0;
    }

    CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        C5462v.m23768a((Object) latLng, (Object) "null camera target");
        boolean z = 0.0f <= f2 && f2 <= 90.0f;
        C5462v.m23772a(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f25128a = i;
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + 0.0f;
        if (((double) f3) <= 0) {
            f3 = (f3 % 360.0f) + 360.0f;
        }
        this.bearing = f3 % 360.0f;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this(1, latLng, f, f2, f3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        CameraPositionCreator.m23852a(this, parcel, i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    /* renamed from: a */
    final int m29985a() {
        return this.f25128a;
    }

    public static final CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public final String toString() {
        return C5461u.m23765a(this).m23764a("target", this.target).m23764a("zoom", Float.valueOf(this.zoom)).m23764a("tilt", Float.valueOf(this.tilt)).m23764a("bearing", Float.valueOf(this.bearing)).toString();
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        context = context.getResources().obtainAttributes(attributeSet, C4513R.styleable.MapM4bAttrs);
        LatLng latLng = new LatLng((double) (context.hasValue(C4513R.styleable.MapM4bAttrs_m4b_cameraTargetLat) != null ? context.getFloat(C4513R.styleable.MapM4bAttrs_m4b_cameraTargetLat, 0.0f) : null), (double) (context.hasValue(C4513R.styleable.MapM4bAttrs_m4b_cameraTargetLng) ? context.getFloat(C4513R.styleable.MapM4bAttrs_m4b_cameraTargetLng, 0.0f) : 0.0f));
        attributeSet = builder();
        attributeSet.m23848a(latLng);
        if (context.hasValue(C4513R.styleable.MapM4bAttrs_m4b_cameraZoom)) {
            attributeSet.m23847a(context.getFloat(C4513R.styleable.MapM4bAttrs_m4b_cameraZoom, 0.0f));
        }
        if (context.hasValue(C4513R.styleable.MapM4bAttrs_m4b_cameraBearing)) {
            attributeSet.m23851c(context.getFloat(C4513R.styleable.MapM4bAttrs_m4b_cameraBearing, 0.0f));
        }
        if (context.hasValue(C4513R.styleable.MapM4bAttrs_m4b_cameraTilt)) {
            attributeSet.m23850b(context.getFloat(C4513R.styleable.MapM4bAttrs_m4b_cameraTilt, 0.0f));
        }
        return attributeSet.m23849a();
    }
}
