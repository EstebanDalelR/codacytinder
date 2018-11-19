package com.tinder.passport.p093d;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.google.android.m4b.maps.model.Marker;
import com.tinder.listeners.ListenerMapMarkerSearch;

/* renamed from: com.tinder.passport.d.d */
final /* synthetic */ class C12256d implements ErrorListener {
    /* renamed from: a */
    private final ListenerMapMarkerSearch f39665a;
    /* renamed from: b */
    private final Marker f39666b;

    C12256d(ListenerMapMarkerSearch listenerMapMarkerSearch, Marker marker) {
        this.f39665a = listenerMapMarkerSearch;
        this.f39666b = marker;
    }

    public void onErrorResponse(VolleyError volleyError) {
        C3945a.a(this.f39665a, this.f39666b, volleyError);
    }
}
