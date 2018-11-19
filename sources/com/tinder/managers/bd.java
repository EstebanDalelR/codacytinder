package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.tinder.listeners.ListenerPhoto;
import com.tinder.model.ProfilePhoto;

final /* synthetic */ class bd implements ErrorListener {
    /* renamed from: a */
    private final ListenerPhoto f39070a;
    /* renamed from: b */
    private final int f39071b;
    /* renamed from: c */
    private final ProfilePhoto f39072c;

    bd(ListenerPhoto listenerPhoto, int i, ProfilePhoto profilePhoto) {
        this.f39070a = listenerPhoto;
        this.f39071b = i;
        this.f39072c = profilePhoto;
    }

    public void onErrorResponse(VolleyError volleyError) {
        ManagerProfile.a(this.f39070a, this.f39071b, this.f39072c, volleyError);
    }
}
