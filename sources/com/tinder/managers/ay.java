package com.tinder.managers;

import com.android.volley.Response.Listener;
import com.tinder.listeners.ListenerPhoto;
import com.tinder.model.ProfilePhoto;
import org.json.JSONArray;

final /* synthetic */ class ay implements Listener {
    /* renamed from: a */
    private final ManagerProfile f39034a;
    /* renamed from: b */
    private final boolean f39035b;
    /* renamed from: c */
    private final ListenerPhoto f39036c;
    /* renamed from: d */
    private final int f39037d;
    /* renamed from: e */
    private final ProfilePhoto f39038e;
    /* renamed from: f */
    private final int f39039f;
    /* renamed from: g */
    private final int f39040g;

    ay(ManagerProfile managerProfile, boolean z, ListenerPhoto listenerPhoto, int i, ProfilePhoto profilePhoto, int i2, int i3) {
        this.f39034a = managerProfile;
        this.f39035b = z;
        this.f39036c = listenerPhoto;
        this.f39037d = i;
        this.f39038e = profilePhoto;
        this.f39039f = i2;
        this.f39040g = i3;
    }

    public void onResponse(Object obj) {
        this.f39034a.a(this.f39035b, this.f39036c, this.f39037d, this.f39038e, this.f39039f, this.f39040g, (JSONArray) obj);
    }
}
