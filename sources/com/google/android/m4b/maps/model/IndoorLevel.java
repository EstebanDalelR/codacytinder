package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.model.internal.IIndoorLevelDelegate;

public final class IndoorLevel {
    /* renamed from: a */
    private final IIndoorLevelDelegate f20485a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof IndoorLevel)) {
            return null;
        }
        try {
            return this.f20485a.equalsRemote(((IndoorLevel) obj).f20485a);
        } catch (Object obj2) {
            throw new RuntimeRemoteException(obj2);
        }
    }

    public final int hashCode() {
        try {
            return this.f20485a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
