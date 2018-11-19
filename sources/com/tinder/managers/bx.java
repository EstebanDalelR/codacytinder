package com.tinder.managers;

import com.android.volley.Response.Listener;
import com.tinder.model.UserMeta;
import rx.Emitter;

final /* synthetic */ class bx implements Listener {
    /* renamed from: a */
    private final Emitter f39081a;

    bx(Emitter emitter) {
        this.f39081a = emitter;
    }

    public void onResponse(Object obj) {
        bu.m48073a(this.f39081a, (UserMeta) obj);
    }
}
