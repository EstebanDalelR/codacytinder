package com.tinder.managers;

import com.android.volley.Response.Listener;
import com.tinder.listeners.ListenerDeleteAccount;
import org.json.JSONObject;

/* renamed from: com.tinder.managers.c */
final /* synthetic */ class C12023c implements Listener {
    /* renamed from: a */
    private final C2652a f39083a;
    /* renamed from: b */
    private final ListenerDeleteAccount f39084b;

    C12023c(C2652a c2652a, ListenerDeleteAccount listenerDeleteAccount) {
        this.f39083a = c2652a;
        this.f39084b = listenerDeleteAccount;
    }

    public void onResponse(Object obj) {
        this.f39083a.a(this.f39084b, (JSONObject) obj);
    }
}
