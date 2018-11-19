package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.tinder.managers.ManagerDeepLinking.OnProfileLoadedListener;

final /* synthetic */ class aa implements ErrorListener {
    /* renamed from: a */
    private final ManagerDeepLinking f38990a;
    /* renamed from: b */
    private final OnProfileLoadedListener f38991b;

    aa(ManagerDeepLinking managerDeepLinking, OnProfileLoadedListener onProfileLoadedListener) {
        this.f38990a = managerDeepLinking;
        this.f38991b = onProfileLoadedListener;
    }

    public void onErrorResponse(VolleyError volleyError) {
        this.f38990a.m40486a(this.f38991b, volleyError);
    }
}
