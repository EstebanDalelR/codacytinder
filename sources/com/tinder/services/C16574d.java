package com.tinder.services;

import com.android.volley.Response.Listener;
import com.tinder.model.ProcessingPhotos;

/* renamed from: com.tinder.services.d */
final /* synthetic */ class C16574d implements Listener {
    /* renamed from: a */
    private final ProcessingPhotosTaskService f51273a;

    C16574d(ProcessingPhotosTaskService processingPhotosTaskService) {
        this.f51273a = processingPhotosTaskService;
    }

    public void onResponse(Object obj) {
        this.f51273a.m62000a((ProcessingPhotos) obj);
    }
}
