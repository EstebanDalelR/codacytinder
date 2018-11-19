package com.tinder.passport.p093d;

import com.android.volley.Response.Listener;
import com.google.android.m4b.maps.model.Marker;
import com.tinder.listeners.ListenerMapMarkerSearch;
import org.json.JSONObject;

/* renamed from: com.tinder.passport.d.c */
final /* synthetic */ class C12255c implements Listener {
    /* renamed from: a */
    private final ListenerMapMarkerSearch f39663a;
    /* renamed from: b */
    private final Marker f39664b;

    C12255c(ListenerMapMarkerSearch listenerMapMarkerSearch, Marker marker) {
        this.f39663a = listenerMapMarkerSearch;
        this.f39664b = marker;
    }

    public void onResponse(Object obj) {
        C3945a.a(this.f39663a, this.f39664b, (JSONObject) obj);
    }
}
