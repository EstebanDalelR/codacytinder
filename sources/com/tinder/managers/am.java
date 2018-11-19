package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.tinder.listeners.ListenerPhoto;

final /* synthetic */ class am implements ErrorListener {
    /* renamed from: a */
    private final ListenerPhoto f39025a;

    am(ListenerPhoto listenerPhoto) {
        this.f39025a = listenerPhoto;
    }

    public void onErrorResponse(VolleyError volleyError) {
        ManagerProfile.b(this.f39025a, volleyError);
    }
}
