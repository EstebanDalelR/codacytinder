package com.google.android.m4b.maps.model;

import android.os.RemoteException;
import com.google.android.m4b.maps.model.internal.IMarkerDelegate;
import com.google.android.m4b.maps.p110j.C5462v;

public final class Marker {
    /* renamed from: a */
    private final IMarkerDelegate f20492a;

    public Marker(IMarkerDelegate iMarkerDelegate) {
        this.f20492a = (IMarkerDelegate) C5462v.m23767a((Object) iMarkerDelegate);
    }

    /* renamed from: a */
    public final void m23875a() {
        try {
            this.f20492a.remove();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void m23876a(LatLng latLng) {
        try {
            this.f20492a.setPosition(latLng);
        } catch (LatLng latLng2) {
            throw new RuntimeRemoteException(latLng2);
        }
    }

    /* renamed from: b */
    public final LatLng m23878b() {
        try {
            return this.f20492a.getPosition();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void m23877a(boolean z) {
        try {
            this.f20492a.setDraggable(z);
        } catch (boolean z2) {
            throw new RuntimeRemoteException(z2);
        }
    }

    /* renamed from: c */
    public final boolean m23879c() {
        try {
            return this.f20492a.isDraggable();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public final void m23880d() {
        try {
            this.f20492a.showInfoWindow();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public final void m23881e() {
        try {
            this.f20492a.hideInfoWindow();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Marker)) {
            return null;
        }
        try {
            return this.f20492a.equalsRemote(((Marker) obj).f20492a);
        } catch (Object obj2) {
            throw new RuntimeRemoteException(obj2);
        }
    }

    public final int hashCode() {
        try {
            return this.f20492a.hashCodeRemote();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
