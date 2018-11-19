package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.model.internal.IIndoorBuildingDelegate;
import com.google.android.m4b.maps.p110j.C5462v;

public final class IndoorBuilding {
    /* renamed from: a */
    private final IIndoorBuildingDelegate f20484a;

    public IndoorBuilding(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
        this.f20484a = (IIndoorBuildingDelegate) C5462v.m23767a((Object) iIndoorBuildingDelegate);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IndoorBuilding)) {
            return null;
        }
        try {
            return this.f20484a.equalsRemote(((IndoorBuilding) obj).f20484a);
        } catch (Object obj2) {
            throw new RuntimeRemoteException(obj2);
        }
    }

    public final int hashCode() {
        try {
            return this.f20484a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
