package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.model.internal.IGroundOverlayDelegate;

public final class GroundOverlay {
    /* renamed from: a */
    private final IGroundOverlayDelegate f20483a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return null;
        }
        try {
            return this.f20483a.equalsRemote(((GroundOverlay) obj).f20483a);
        } catch (Object obj2) {
            throw new RuntimeRemoteException(obj2);
        }
    }

    public final int hashCode() {
        try {
            return this.f20483a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
