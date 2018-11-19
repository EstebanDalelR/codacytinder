package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;

public final class CircleOptions implements C5468c {
    public static final CircleOptionsCreator CREATOR = new CircleOptionsCreator();
    /* renamed from: a */
    private final int f25129a;
    /* renamed from: b */
    private LatLng f25130b;
    /* renamed from: c */
    private double f25131c;
    /* renamed from: d */
    private float f25132d;
    /* renamed from: e */
    private int f25133e;
    /* renamed from: f */
    private int f25134f;
    /* renamed from: g */
    private float f25135g;
    /* renamed from: h */
    private boolean f25136h;

    public final int describeContents() {
        return 0;
    }

    public CircleOptions() {
        this.f25130b = null;
        this.f25131c = 0.0d;
        this.f25132d = 10.0f;
        this.f25133e = -16777216;
        this.f25134f = 0;
        this.f25135g = 0.0f;
        this.f25136h = true;
        this.f25129a = 1;
    }

    CircleOptions(int i, LatLng latLng, double d, float f, int i2, int i3, float f2, boolean z) {
        this.f25130b = null;
        this.f25131c = 0.0d;
        this.f25132d = 10.0f;
        this.f25133e = -16777216;
        this.f25134f = 0;
        this.f25135g = 0.0f;
        this.f25136h = true;
        this.f25129a = i;
        this.f25130b = latLng;
        this.f25131c = d;
        this.f25132d = f;
        this.f25133e = i2;
        this.f25134f = i3;
        this.f25135g = f2;
        this.f25136h = z;
    }

    /* renamed from: a */
    final int m29986a() {
        return this.f25129a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        CircleOptionsCreator.m23855a(this, parcel, i);
    }

    public final CircleOptions center(LatLng latLng) {
        this.f25130b = latLng;
        return this;
    }

    public final CircleOptions radius(double d) {
        this.f25131c = d;
        return this;
    }

    public final CircleOptions strokeWidth(float f) {
        this.f25132d = f;
        return this;
    }

    public final CircleOptions strokeColor(int i) {
        this.f25133e = i;
        return this;
    }

    public final CircleOptions fillColor(int i) {
        this.f25134f = i;
        return this;
    }

    public final CircleOptions zIndex(float f) {
        this.f25135g = f;
        return this;
    }

    public final CircleOptions visible(boolean z) {
        this.f25136h = z;
        return this;
    }

    public final LatLng getCenter() {
        return this.f25130b;
    }

    public final double getRadius() {
        return this.f25131c;
    }

    public final float getStrokeWidth() {
        return this.f25132d;
    }

    public final int getStrokeColor() {
        return this.f25133e;
    }

    public final int getFillColor() {
        return this.f25134f;
    }

    public final float getZIndex() {
        return this.f25135g;
    }

    public final boolean isVisible() {
        return this.f25136h;
    }
}
