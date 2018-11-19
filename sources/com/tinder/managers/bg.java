package com.tinder.managers;

import com.android.volley.Response.Listener;
import com.tinder.listeners.ListenerAgreeToWarningTerms;
import org.json.JSONObject;

final /* synthetic */ class bg implements Listener {
    /* renamed from: a */
    private final ListenerAgreeToWarningTerms f39073a;

    bg(ListenerAgreeToWarningTerms listenerAgreeToWarningTerms) {
        this.f39073a = listenerAgreeToWarningTerms;
    }

    public void onResponse(Object obj) {
        bf.m40506a(this.f39073a, (JSONObject) obj);
    }
}
