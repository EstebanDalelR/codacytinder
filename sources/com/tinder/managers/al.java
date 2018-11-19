package com.tinder.managers;

import com.android.volley.Response.Listener;
import com.tinder.listeners.ListenerPhoto;
import org.json.JSONArray;

final /* synthetic */ class al implements Listener {
    /* renamed from: a */
    private final ManagerProfile f39023a;
    /* renamed from: b */
    private final ListenerPhoto f39024b;

    al(ManagerProfile managerProfile, ListenerPhoto listenerPhoto) {
        this.f39023a = managerProfile;
        this.f39024b = listenerPhoto;
    }

    public void onResponse(Object obj) {
        this.f39023a.b(this.f39024b, (JSONArray) obj);
    }
}
