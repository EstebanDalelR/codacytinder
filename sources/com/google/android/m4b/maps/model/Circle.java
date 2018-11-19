package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.model.internal.ICircleDelegate;

public final class Circle {
    /* renamed from: a */
    private final ICircleDelegate f20482a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return null;
        }
        try {
            return this.f20482a.equalsRemote(((Circle) obj).f20482a);
        } catch (Object obj2) {
            throw new RuntimeRemoteException(obj2);
        }
    }

    public final int hashCode() {
        try {
            return this.f20482a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
