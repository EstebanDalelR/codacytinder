package com.tinder.managers;

import com.android.volley.Response.Listener;
import com.tinder.listeners.ListenerUpdateProfileInfo;
import org.json.JSONObject;

final /* synthetic */ class aq implements Listener {
    /* renamed from: a */
    private final ManagerProfile f39026a;
    /* renamed from: b */
    private final ListenerUpdateProfileInfo f39027b;

    aq(ManagerProfile managerProfile, ListenerUpdateProfileInfo listenerUpdateProfileInfo) {
        this.f39026a = managerProfile;
        this.f39027b = listenerUpdateProfileInfo;
    }

    public void onResponse(Object obj) {
        this.f39026a.a(this.f39027b, (JSONObject) obj);
    }
}
