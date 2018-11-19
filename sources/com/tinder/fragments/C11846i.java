package com.tinder.fragments;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;

/* renamed from: com.tinder.fragments.i */
final /* synthetic */ class C11846i implements ErrorListener {
    /* renamed from: a */
    private final C13308g f38654a;

    C11846i(C13308g c13308g) {
        this.f38654a = c13308g;
    }

    public void onErrorResponse(VolleyError volleyError) {
        this.f38654a.m51530a(volleyError);
    }
}
