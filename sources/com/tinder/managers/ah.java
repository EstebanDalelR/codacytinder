package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.tinder.listeners.ListenerPing;

final /* synthetic */ class ah implements ErrorListener {
    /* renamed from: a */
    private final af f39018a;
    /* renamed from: b */
    private final String f39019b;
    /* renamed from: c */
    private final ListenerPing f39020c;

    ah(af afVar, String str, ListenerPing listenerPing) {
        this.f39018a = afVar;
        this.f39019b = str;
        this.f39020c = listenerPing;
    }

    public void onErrorResponse(VolleyError volleyError) {
        this.f39018a.m48069a(this.f39019b, this.f39020c, volleyError);
    }
}
