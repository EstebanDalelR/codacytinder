package com.tinder.managers;

import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.tinder.interfaces.PhotoGalleryModel.ListenerFacebookPhotos;

/* renamed from: com.tinder.managers.l */
final /* synthetic */ class C12028l implements ErrorListener {
    /* renamed from: a */
    private final ListenerFacebookPhotos f39090a;

    C12028l(ListenerFacebookPhotos listenerFacebookPhotos) {
        this.f39090a = listenerFacebookPhotos;
    }

    public void onErrorResponse(VolleyError volleyError) {
        FacebookManager.m40465a(this.f39090a, volleyError);
    }
}
