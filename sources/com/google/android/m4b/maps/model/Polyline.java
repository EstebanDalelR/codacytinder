package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.model.internal.IPolylineDelegate;

public final class Polyline {
    /* renamed from: a */
    private final IPolylineDelegate f20494a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Polyline)) {
            return null;
        }
        try {
            return this.f20494a.equalsRemote(((Polyline) obj).f20494a);
        } catch (Object obj2) {
            throw new RuntimeRemoteException(obj2);
        }
    }

    public final int hashCode() {
        try {
            return this.f20494a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
