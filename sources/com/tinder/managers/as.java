package com.tinder.managers;

import com.android.volley.Response.Listener;

final /* synthetic */ class as implements Listener {
    /* renamed from: a */
    private final Listener f39029a;

    as(Listener listener) {
        this.f39029a = listener;
    }

    public void onResponse(Object obj) {
        ManagerProfile.a(this.f39029a, (String) obj);
    }
}
