package com.tinder.managers;

import com.android.volley.Response.Listener;
import com.tinder.listeners.ListenerPing;
import org.json.JSONObject;

final /* synthetic */ class ag implements Listener {
    /* renamed from: a */
    private final af f39015a;
    /* renamed from: b */
    private final String f39016b;
    /* renamed from: c */
    private final ListenerPing f39017c;

    ag(af afVar, String str, ListenerPing listenerPing) {
        this.f39015a = afVar;
        this.f39016b = str;
        this.f39017c = listenerPing;
    }

    public void onResponse(Object obj) {
        this.f39015a.m48070a(this.f39016b, this.f39017c, (JSONObject) obj);
    }
}
