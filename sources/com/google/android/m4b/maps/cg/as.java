package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate;
import com.google.android.m4b.maps.model.internal.IMapsEngineFeatureDelegate.Stub;
import com.google.android.m4b.maps.model.internal.IMapsEngineLayerDelegate;

public final class as extends Stub {
    /* renamed from: a */
    private final ax f27883a;
    /* renamed from: b */
    private final String f27884b;
    /* renamed from: c */
    private final LatLng f27885c;
    /* renamed from: d */
    private String f27886d = null;
    /* renamed from: e */
    private String f27887e = null;

    public as(ax axVar, String str, LatLng latLng) {
        this.f27883a = axVar;
        this.f27884b = str;
        this.f27885c = latLng;
    }

    /* renamed from: a */
    public final ax m32852a() {
        return this.f27883a;
    }

    /* renamed from: a */
    public final void m32853a(String str, String str2) {
        this.f27886d = str;
        this.f27887e = str2;
    }

    public final IMapsEngineLayerDelegate getLayer() {
        return this.f27883a;
    }

    public final String getFeatureId() {
        return this.f27884b;
    }

    public final LatLng getPoint() {
        return this.f27885c;
    }

    public final String getDescription() {
        return this.f27886d;
    }

    public final String getGmeFeatureId() {
        return this.f27887e;
    }

    public final boolean equalsRemote(IMapsEngineFeatureDelegate iMapsEngineFeatureDelegate) {
        return equals(iMapsEngineFeatureDelegate);
    }

    public final int hashCodeRemote() {
        return hashCode();
    }
}
