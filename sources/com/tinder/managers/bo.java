package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.tinder.listeners.ListenerSimple;

final /* synthetic */ class bo implements ErrorListener {
    /* renamed from: a */
    private final ListenerSimple f39076a;

    bo(ListenerSimple listenerSimple) {
        this.f39076a = listenerSimple;
    }

    public void onErrorResponse(VolleyError volleyError) {
        bm.m40508a(this.f39076a, volleyError);
    }
}
