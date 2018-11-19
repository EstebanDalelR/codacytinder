package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate;

@Deprecated
public final class MapsEngineLayer {
    /* renamed from: a */
    private final IMapsEngineLayerDelegate f20491a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof MapsEngineLayer)) {
            return null;
        }
        try {
            return this.f20491a.equalsRemote(((MapsEngineLayer) obj).f20491a);
        } catch (Object obj2) {
            throw new RuntimeRemoteException(obj2);
        }
    }

    public final int hashCode() {
        try {
            return this.f20491a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
