package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.tinder.listeners.ListenerUpdateProfileInfo;

final /* synthetic */ class ar implements ErrorListener {
    /* renamed from: a */
    private final ListenerUpdateProfileInfo f39028a;

    ar(ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        this.f39028a = listenerUpdateProfileInfo;
    }

    public void onErrorResponse(VolleyError volleyError) {
        ManagerProfile.a(this.f39028a, volleyError);
    }
}
