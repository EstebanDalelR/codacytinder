package com.google.android.m4b.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;
import com.google.android.m4b.maps.p114n.C5484b.C6735a;

public final class MarkerOptions implements C5468c {
    public static final MarkerOptionsCreator CREATOR = new MarkerOptionsCreator();
    /* renamed from: a */
    private final int f25162a;
    /* renamed from: b */
    private LatLng f25163b;
    /* renamed from: c */
    private String f25164c;
    /* renamed from: d */
    private String f25165d;
    /* renamed from: e */
    private BitmapDescriptor f25166e;
    /* renamed from: f */
    private float f25167f;
    /* renamed from: g */
    private float f25168g;
    /* renamed from: h */
    private boolean f25169h;
    /* renamed from: i */
    private boolean f25170i;
    /* renamed from: j */
    private boolean f25171j;
    /* renamed from: k */
    private float f25172k;
    /* renamed from: l */
    private float f25173l;
    /* renamed from: m */
    private float f25174m;
    /* renamed from: n */
    private float f25175n;

    public final int describeContents() {
        return 0;
    }

    public MarkerOptions() {
        this.f25167f = 0.5f;
        this.f25168g = 1.0f;
        this.f25170i = true;
        this.f25171j = false;
        this.f25172k = 0.0f;
        this.f25173l = 0.5f;
        this.f25174m = 0.0f;
        this.f25175n = 1.0f;
        this.f25162a = 1;
    }

    MarkerOptions(int i, LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6) {
        BitmapDescriptor bitmapDescriptor;
        this.f25167f = 0.5f;
        this.f25168g = 1.0f;
        this.f25170i = true;
        this.f25171j = false;
        this.f25172k = 0.0f;
        this.f25173l = 0.5f;
        this.f25174m = 0.0f;
        this.f25175n = 1.0f;
        this.f25162a = i;
        this.f25163b = latLng;
        this.f25164c = str;
        this.f25165d = str2;
        if (iBinder == null) {
            bitmapDescriptor = null;
        } else {
            bitmapDescriptor = new BitmapDescriptor(C6735a.m30039a(iBinder));
        }
        r0.f25166e = bitmapDescriptor;
        r0.f25167f = f;
        r0.f25168g = f2;
        r0.f25169h = z;
        r0.f25170i = z2;
        r0.f25171j = z3;
        r0.f25172k = f3;
        r0.f25173l = f4;
        r0.f25174m = f5;
        r0.f25175n = f6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        MarkerOptionsCreator.m23882a(this, parcel, i);
    }

    /* renamed from: a */
    final int m30002a() {
        return this.f25162a;
    }

    /* renamed from: b */
    final IBinder m30003b() {
        return this.f25166e == null ? null : this.f25166e.m23843a().asBinder();
    }

    public final MarkerOptions position(LatLng latLng) {
        this.f25163b = latLng;
        return this;
    }

    public final MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.f25166e = bitmapDescriptor;
        return this;
    }

    public final MarkerOptions anchor(float f, float f2) {
        this.f25167f = f;
        this.f25168g = f2;
        return this;
    }

    public final MarkerOptions infoWindowAnchor(float f, float f2) {
        this.f25173l = f;
        this.f25174m = f2;
        return this;
    }

    public final MarkerOptions title(String str) {
        this.f25164c = str;
        return this;
    }

    public final MarkerOptions snippet(String str) {
        this.f25165d = str;
        return this;
    }

    public final MarkerOptions draggable(boolean z) {
        this.f25169h = z;
        return this;
    }

    public final MarkerOptions visible(boolean z) {
        this.f25170i = z;
        return this;
    }

    public final MarkerOptions flat(boolean z) {
        this.f25171j = z;
        return this;
    }

    public final MarkerOptions rotation(float f) {
        this.f25172k = f;
        return this;
    }

    public final MarkerOptions alpha(float f) {
        this.f25175n = f;
        return this;
    }

    public final LatLng getPosition() {
        return this.f25163b;
    }

    public final String getTitle() {
        return this.f25164c;
    }

    public final String getSnippet() {
        return this.f25165d;
    }

    public final BitmapDescriptor getIcon() {
        return this.f25166e;
    }

    public final float getAnchorU() {
        return this.f25167f;
    }

    public final float getAnchorV() {
        return this.f25168g;
    }

    public final boolean isDraggable() {
        return this.f25169h;
    }

    public final boolean isVisible() {
        return this.f25170i;
    }

    public final boolean isFlat() {
        return this.f25171j;
    }

    public final float getRotation() {
        return this.f25172k;
    }

    public final float getInfoWindowAnchorU() {
        return this.f25173l;
    }

    public final float getInfoWindowAnchorV() {
        return this.f25174m;
    }

    public final float getAlpha() {
        return this.f25175n;
    }
}
