package com.tinder.passport.p093d;

import com.android.volley.Response.Listener;
import org.json.JSONObject;

/* renamed from: com.tinder.passport.d.g */
final /* synthetic */ class C12259g implements Listener {
    /* renamed from: a */
    private final C3945a f39670a;

    C12259g(C3945a c3945a) {
        this.f39670a = c3945a;
    }

    public void onResponse(Object obj) {
        this.f39670a.a((JSONObject) obj);
    }
}
