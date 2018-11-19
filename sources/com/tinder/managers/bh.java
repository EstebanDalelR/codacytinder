package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.tinder.listeners.ListenerAgreeToWarningTerms;

final /* synthetic */ class bh implements ErrorListener {
    /* renamed from: a */
    private final ListenerAgreeToWarningTerms f39074a;

    bh(ListenerAgreeToWarningTerms listenerAgreeToWarningTerms) {
        this.f39074a = listenerAgreeToWarningTerms;
    }

    public void onErrorResponse(VolleyError volleyError) {
        bf.m40505a(this.f39074a, volleyError);
    }
}
