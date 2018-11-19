package com.google.android.m4b.maps;

import android.graphics.Point;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p114n.C7701d;
import com.google.android.m4b.maps.p124x.af;

public final class Projection {
    /* renamed from: a */
    private final af f16764a;

    Projection(af afVar) {
        this.f16764a = afVar;
    }

    /* renamed from: a */
    public final LatLng m20405a(Point point) {
        try {
            return this.f16764a.mo5692a(C7701d.m33407a((Object) point));
        } catch (Point point2) {
            throw new RuntimeRemoteException(point2);
        }
    }

    /* renamed from: a */
    public final Point m20404a(LatLng latLng) {
        try {
            return (Point) C7701d.m33408a(this.f16764a.mo5694a(latLng));
        } catch (LatLng latLng2) {
            throw new RuntimeRemoteException(latLng2);
        }
    }
}
