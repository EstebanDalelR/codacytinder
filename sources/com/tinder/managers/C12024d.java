package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.tinder.listeners.ListenerDeleteAccount;

/* renamed from: com.tinder.managers.d */
final /* synthetic */ class C12024d implements ErrorListener {
    /* renamed from: a */
    private final ListenerDeleteAccount f39085a;

    C12024d(ListenerDeleteAccount listenerDeleteAccount) {
        this.f39085a = listenerDeleteAccount;
    }

    public void onErrorResponse(VolleyError volleyError) {
        C2652a.a(this.f39085a, volleyError);
    }
}
