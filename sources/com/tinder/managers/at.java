package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;

final /* synthetic */ class at implements ErrorListener {
    /* renamed from: a */
    private final ErrorListener f39030a;

    at(ErrorListener errorListener) {
        this.f39030a = errorListener;
    }

    public void onErrorResponse(VolleyError volleyError) {
        ManagerProfile.a(this.f39030a, volleyError);
    }
}
