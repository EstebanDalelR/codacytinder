package com.tinder.managers;

import com.android.volley.Response.Listener;
import com.tinder.managers.ManagerDeepLinking.OnProfileLoadedListener;
import com.tinder.recs.model.DeepLinkReferralInfo.Builder;

/* renamed from: com.tinder.managers.z */
final /* synthetic */ class C12030z implements Listener {
    /* renamed from: a */
    private final ManagerDeepLinking f39132a;
    /* renamed from: b */
    private final Builder f39133b;
    /* renamed from: c */
    private final OnProfileLoadedListener f39134c;

    C12030z(ManagerDeepLinking managerDeepLinking, Builder builder, OnProfileLoadedListener onProfileLoadedListener) {
        this.f39132a = managerDeepLinking;
        this.f39133b = builder;
        this.f39134c = onProfileLoadedListener;
    }

    public void onResponse(Object obj) {
        this.f39132a.m40489a(this.f39133b, this.f39134c, (String) obj);
    }
}
