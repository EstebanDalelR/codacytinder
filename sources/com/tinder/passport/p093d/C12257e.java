package com.tinder.passport.p093d;

import com.android.volley.Response.Listener;
import com.tinder.passport.model.PassportLocation;
import org.json.JSONObject;

/* renamed from: com.tinder.passport.d.e */
final /* synthetic */ class C12257e implements Listener {
    /* renamed from: a */
    private final C3945a f39667a;
    /* renamed from: b */
    private final PassportLocation f39668b;

    C12257e(C3945a c3945a, PassportLocation passportLocation) {
        this.f39667a = c3945a;
        this.f39668b = passportLocation;
    }

    public void onResponse(Object obj) {
        this.f39667a.a(this.f39668b, (JSONObject) obj);
    }
}
