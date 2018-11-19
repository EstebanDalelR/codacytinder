package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.tinder.listeners.ListenerPhoto;
import com.tinder.model.ProfilePhoto;

final /* synthetic */ class az implements ErrorListener {
    /* renamed from: a */
    private final ManagerProfile f39041a;
    /* renamed from: b */
    private final boolean f39042b;
    /* renamed from: c */
    private final ListenerPhoto f39043c;
    /* renamed from: d */
    private final int f39044d;
    /* renamed from: e */
    private final ProfilePhoto f39045e;
    /* renamed from: f */
    private final int f39046f;
    /* renamed from: g */
    private final String f39047g;
    /* renamed from: h */
    private final int f39048h;

    az(ManagerProfile managerProfile, boolean z, ListenerPhoto listenerPhoto, int i, ProfilePhoto profilePhoto, int i2, String str, int i3) {
        this.f39041a = managerProfile;
        this.f39042b = z;
        this.f39043c = listenerPhoto;
        this.f39044d = i;
        this.f39045e = profilePhoto;
        this.f39046f = i2;
        this.f39047g = str;
        this.f39048h = i3;
    }

    public void onErrorResponse(VolleyError volleyError) {
        this.f39041a.a(this.f39042b, this.f39043c, this.f39044d, this.f39045e, this.f39046f, this.f39047g, this.f39048h, volleyError);
    }
}
