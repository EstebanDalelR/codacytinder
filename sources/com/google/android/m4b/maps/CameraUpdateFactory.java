package com.google.android.m4b.maps;

import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p124x.C5535c;

public final class CameraUpdateFactory {
    /* renamed from: a */
    private static C5535c f16757a;

    private CameraUpdateFactory() {
    }

    /* renamed from: a */
    private static C5535c m20386a() {
        return (C5535c) C5462v.m23768a(f16757a, (Object) "CameraUpdateFactory is not initialized");
    }

    /* renamed from: a */
    public static void m20387a(C5535c c5535c) {
        f16757a = (C5535c) C5462v.m23767a((Object) c5535c);
    }

    /* renamed from: a */
    public static CameraUpdate m20384a(LatLng latLng) {
        try {
            return new CameraUpdate(m20386a().mo7214a(latLng));
        } catch (LatLng latLng2) {
            throw new RuntimeRemoteException(latLng2);
        }
    }

    /* renamed from: a */
    public static CameraUpdate m20385a(LatLng latLng, float f) {
        try {
            return new CameraUpdate(m20386a().mo7215a(latLng, f));
        } catch (LatLng latLng2) {
            throw new RuntimeRemoteException(latLng2);
        }
    }
}
