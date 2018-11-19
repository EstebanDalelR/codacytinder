package com.google.android.m4b.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p111k.C5468c;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;

public final class GroundOverlayOptions implements C5468c {
    public static final GroundOverlayOptionsCreator CREATOR = new GroundOverlayOptionsCreator();
    public static final float NO_DIMENSION = -1.0f;
    /* renamed from: a */
    private final int f25137a;
    /* renamed from: b */
    private BitmapDescriptor f25138b;
    /* renamed from: c */
    private LatLng f25139c;
    /* renamed from: d */
    private float f25140d;
    /* renamed from: e */
    private float f25141e;
    /* renamed from: f */
    private LatLngBounds f25142f;
    /* renamed from: g */
    private float f25143g;
    /* renamed from: h */
    private float f25144h;
    /* renamed from: i */
    private boolean f25145i;
    /* renamed from: j */
    private float f25146j;
    /* renamed from: k */
    private float f25147k;
    /* renamed from: l */
    private float f25148l;

    public final int describeContents() {
        return 0;
    }

    GroundOverlayOptions(int i, IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7) {
        this.f25145i = true;
        this.f25146j = 0.0f;
        this.f25147k = 0.5f;
        this.f25148l = 0.5f;
        this.f25137a = i;
        this.f25138b = new BitmapDescriptor(C6735a.m30039a(iBinder));
        this.f25139c = latLng;
        this.f25140d = f;
        this.f25141e = f2;
        this.f25142f = latLngBounds;
        this.f25143g = f3;
        this.f25144h = f4;
        this.f25145i = z;
        this.f25146j = f5;
        this.f25147k = f6;
        this.f25148l = f7;
    }

    public GroundOverlayOptions() {
        this.f25145i = true;
        this.f25146j = 0.0f;
        this.f25147k = 0.5f;
        this.f25148l = 0.5f;
        this.f25137a = 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        GroundOverlayOptionsCreator.m23858a(this, parcel, i);
    }

    /* renamed from: a */
    final IBinder m29988a() {
        return this.f25138b.m23843a().asBinder();
    }

    public final GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        this.f25138b = bitmapDescriptor;
        return this;
    }

    public final GroundOverlayOptions anchor(float f, float f2) {
        this.f25147k = f;
        this.f25148l = f2;
        return this;
    }

    public final GroundOverlayOptions position(LatLng latLng, float f) {
        boolean z = false;
        C5462v.m23771a(this.f25142f == null, (Object) "Position has already been set using positionFromBounds");
        C5462v.m23773b(latLng != null, "Location must be specified");
        if (f >= 0.0f) {
            z = true;
        }
        C5462v.m23773b(z, "Width must be non-negative");
        return m29987a(latLng, f, -1.0f);
    }

    public final GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        boolean z = false;
        C5462v.m23771a(this.f25142f == null, (Object) "Position has already been set using positionFromBounds");
        C5462v.m23773b(latLng != null, "Location must be specified");
        C5462v.m23773b(f >= 0.0f, "Width must be non-negative");
        if (f2 >= 0.0f) {
            z = true;
        }
        C5462v.m23773b(z, "Height must be non-negative");
        return m29987a(latLng, f, f2);
    }

    /* renamed from: a */
    private GroundOverlayOptions m29987a(LatLng latLng, float f, float f2) {
        this.f25139c = latLng;
        this.f25140d = f;
        this.f25141e = f2;
        return this;
    }

    public final GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        boolean z = this.f25139c == null;
        String valueOf = String.valueOf(this.f25139c);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 46);
        stringBuilder.append("Position has already been set using position: ");
        stringBuilder.append(valueOf);
        C5462v.m23771a(z, stringBuilder.toString());
        this.f25142f = latLngBounds;
        return this;
    }

    public final GroundOverlayOptions bearing(float f) {
        this.f25143g = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public final GroundOverlayOptions zIndex(float f) {
        this.f25144h = f;
        return this;
    }

    public final GroundOverlayOptions visible(boolean z) {
        this.f25145i = z;
        return this;
    }

    public final GroundOverlayOptions transparency(float f) {
        boolean z = f >= 0.0f && f <= 1.0f;
        C5462v.m23773b(z, "Transparency must be in the range [0..1]");
        this.f25146j = f;
        return this;
    }

    /* renamed from: b */
    final int m29989b() {
        return this.f25137a;
    }

    public final BitmapDescriptor getImage() {
        return this.f25138b;
    }

    public final LatLng getLocation() {
        return this.f25139c;
    }

    public final float getWidth() {
        return this.f25140d;
    }

    public final float getHeight() {
        return this.f25141e;
    }

    public final LatLngBounds getBounds() {
        return this.f25142f;
    }

    public final float getBearing() {
        return this.f25143g;
    }

    public final float getZIndex() {
        return this.f25144h;
    }

    public final float getTransparency() {
        return this.f25146j;
    }

    public final float getAnchorU() {
        return this.f25147k;
    }

    public final float getAnchorV() {
        return this.f25148l;
    }

    public final boolean isVisible() {
        return this.f25145i;
    }
}
