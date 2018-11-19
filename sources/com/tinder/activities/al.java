package com.tinder.activities;

import com.tinder.managers.LegacyBreadCrumbTracker;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class al implements MembersInjector<WebViewActivityInstagram> {
    /* renamed from: a */
    private final Provider<LegacyBreadCrumbTracker> f26264a;

    public /* synthetic */ void injectMembers(Object obj) {
        m31136a((WebViewActivityInstagram) obj);
    }

    /* renamed from: a */
    public void m31136a(WebViewActivityInstagram webViewActivityInstagram) {
        m31135a(webViewActivityInstagram, (LegacyBreadCrumbTracker) this.f26264a.get());
    }

    /* renamed from: a */
    public static void m31135a(WebViewActivityInstagram webViewActivityInstagram, LegacyBreadCrumbTracker legacyBreadCrumbTracker) {
        webViewActivityInstagram.f22667a = legacyBreadCrumbTracker;
    }
}
