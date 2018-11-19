package com.tinder.managers;

import com.android.volley.Response.Listener;
import com.tinder.listeners.ListenerPhoto;
import com.tinder.model.ProfilePhoto;
import org.json.JSONObject;

final /* synthetic */ class bc implements Listener {
    /* renamed from: a */
    private final ManagerProfile f39061a;
    /* renamed from: b */
    private final ProfilePhoto f39062b;
    /* renamed from: c */
    private final ProfilePhoto f39063c;
    /* renamed from: d */
    private final String f39064d;
    /* renamed from: e */
    private final int f39065e;
    /* renamed from: f */
    private final int f39066f;
    /* renamed from: g */
    private final ListenerPhoto f39067g;
    /* renamed from: h */
    private final boolean f39068h;
    /* renamed from: i */
    private final int f39069i;

    bc(ManagerProfile managerProfile, ProfilePhoto profilePhoto, ProfilePhoto profilePhoto2, String str, int i, int i2, ListenerPhoto listenerPhoto, boolean z, int i3) {
        this.f39061a = managerProfile;
        this.f39062b = profilePhoto;
        this.f39063c = profilePhoto2;
        this.f39064d = str;
        this.f39065e = i;
        this.f39066f = i2;
        this.f39067g = listenerPhoto;
        this.f39068h = z;
        this.f39069i = i3;
    }

    public void onResponse(Object obj) {
        this.f39061a.a(this.f39062b, this.f39063c, this.f39064d, this.f39065e, this.f39066f, this.f39067g, this.f39068h, this.f39069i, (JSONObject) obj);
    }
}
