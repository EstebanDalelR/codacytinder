package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.model.LatLng;

public final class bl {
    /* renamed from: a */
    public final double f19118a;
    /* renamed from: b */
    public final double f19119b;
    /* renamed from: c */
    public final double f19120c;

    public bl(double d, double d2, double d3) {
        this.f19118a = d;
        this.f19119b = d2;
        this.f19120c = d3;
    }

    /* renamed from: a */
    public static bl m22976a(LatLng latLng) {
        double toRadians = Math.toRadians(latLng.latitude);
        double toRadians2 = Math.toRadians(latLng.longitude);
        double cos = Math.cos(toRadians);
        return new bl(Math.cos(toRadians2) * cos, Math.sin(toRadians2) * cos, Math.sin(toRadians));
    }
}
