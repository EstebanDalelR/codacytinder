package com.tinder.managers;

import com.android.volley.Response.Listener;
import com.tinder.interfaces.PhotoGalleryModel.ListenerFacebookPhotos;
import org.json.JSONObject;

/* renamed from: com.tinder.managers.k */
final /* synthetic */ class C12027k implements Listener {
    /* renamed from: a */
    private final String f39088a;
    /* renamed from: b */
    private final ListenerFacebookPhotos f39089b;

    C12027k(String str, ListenerFacebookPhotos listenerFacebookPhotos) {
        this.f39088a = str;
        this.f39089b = listenerFacebookPhotos;
    }

    public void onResponse(Object obj) {
        FacebookManager.m40468a(this.f39088a, this.f39089b, (JSONObject) obj);
    }
}
