package com.tinder.managers;

import com.android.volley.Response.Listener;
import com.tinder.listeners.ListenerPhoto;
import org.json.JSONArray;

final /* synthetic */ class av implements Listener {
    /* renamed from: a */
    private final ManagerProfile f39031a;
    /* renamed from: b */
    private final ListenerPhoto f39032b;

    av(ManagerProfile managerProfile, ListenerPhoto listenerPhoto) {
        this.f39031a = managerProfile;
        this.f39032b = listenerPhoto;
    }

    public void onResponse(Object obj) {
        this.f39031a.a(this.f39032b, (JSONArray) obj);
    }
}
