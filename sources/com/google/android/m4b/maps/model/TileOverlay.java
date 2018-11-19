package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.model.internal.ITileOverlayDelegate;

public final class TileOverlay {
    /* renamed from: a */
    private final ITileOverlayDelegate f20500a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof TileOverlay)) {
            return null;
        }
        try {
            return this.f20500a.equalsRemote(((TileOverlay) obj).f20500a);
        } catch (Object obj2) {
            throw new RuntimeRemoteException(obj2);
        }
    }

    public final int hashCode() {
        try {
            return this.f20500a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
