package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.tinder.listeners.ListenerPhoto;

final /* synthetic */ class ax implements ErrorListener {
    /* renamed from: a */
    private final ListenerPhoto f39033a;

    ax(ListenerPhoto listenerPhoto) {
        this.f39033a = listenerPhoto;
    }

    public void onErrorResponse(VolleyError volleyError) {
        ManagerProfile.a(this.f39033a, volleyError);
    }
}
