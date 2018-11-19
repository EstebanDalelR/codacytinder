package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.model.internal.IPolygonDelegate;

public final class Polygon {
    /* renamed from: a */
    private final IPolygonDelegate f20493a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Polygon)) {
            return null;
        }
        try {
            return this.f20493a.equalsRemote(((Polygon) obj).f20493a);
        } catch (Object obj2) {
            throw new RuntimeRemoteException(obj2);
        }
    }

    public final int hashCode() {
        try {
            return this.f20493a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
