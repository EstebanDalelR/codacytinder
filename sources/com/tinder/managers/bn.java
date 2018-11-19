package com.tinder.managers;

import com.android.volley.Response.Listener;
import com.tinder.listeners.ListenerSimple;
import org.json.JSONObject;

final /* synthetic */ class bn implements Listener {
    /* renamed from: a */
    private final ListenerSimple f39075a;

    bn(ListenerSimple listenerSimple) {
        this.f39075a = listenerSimple;
    }

    public void onResponse(Object obj) {
        bm.m40509a(this.f39075a, (JSONObject) obj);
    }
}
