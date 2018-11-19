package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate;
import com.google.android.m4b.maps.p110j.C5462v;

@Deprecated
public final class MapsEngineFeature {
    /* renamed from: a */
    private final IMapsEngineFeatureDelegate f20490a;

    public MapsEngineFeature(IMapsEngineFeatureDelegate iMapsEngineFeatureDelegate) {
        this.f20490a = (IMapsEngineFeatureDelegate) C5462v.m23767a((Object) iMapsEngineFeatureDelegate);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MapsEngineFeature)) {
            return null;
        }
        try {
            return this.f20490a.equalsRemote(((MapsEngineFeature) obj).f20490a);
        } catch (Object obj2) {
            throw new RuntimeRemoteException(obj2);
        }
    }

    public final int hashCode() {
        try {
            return this.f20490a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
