package com.snapchat.kit.sdk;

import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.c */
public final class C7135c implements MembersInjector<SnapKitActivity> {
    /* renamed from: a */
    private final Provider<OAuth2Manager> f25868a;

    public /* synthetic */ void injectMembers(Object obj) {
        m30781a((SnapKitActivity) obj);
    }

    /* renamed from: a */
    public void m30781a(SnapKitActivity snapKitActivity) {
        C7135c.m30780a(snapKitActivity, (OAuth2Manager) this.f25868a.get());
    }

    /* renamed from: a */
    public static void m30780a(SnapKitActivity snapKitActivity, OAuth2Manager oAuth2Manager) {
        snapKitActivity.f21558a = oAuth2Manager;
    }
}
