package com.tinder.fragments;

import com.android.volley.Response.Listener;
import org.json.JSONObject;

/* renamed from: com.tinder.fragments.h */
final /* synthetic */ class C11845h implements Listener {
    /* renamed from: a */
    private final C13308g f38652a;
    /* renamed from: b */
    private final String f38653b;

    C11845h(C13308g c13308g, String str) {
        this.f38652a = c13308g;
        this.f38653b = str;
    }

    public void onResponse(Object obj) {
        this.f38652a.m51532a(this.f38653b, (JSONObject) obj);
    }
}
