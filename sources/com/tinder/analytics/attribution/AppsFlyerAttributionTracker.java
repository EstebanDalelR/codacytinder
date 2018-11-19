package com.tinder.analytics.attribution;

import android.app.Application;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.C3010d;
import com.tinder.auth.repository.C8297k;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.common.model.ProfileUser;
import java.util.Map;
import javax.inject.Inject;
import rx.Observable;
import rx.schedulers.Schedulers;

public class AppsFlyerAttributionTracker implements AttributionTracker {
    /* renamed from: a */
    private final Application f26429a;
    /* renamed from: b */
    private final C3010d f26430b;
    /* renamed from: c */
    private final C8297k f26431c;
    /* renamed from: d */
    private final CurrentUserProvider f26432d;

    private enum NoopConversionListener implements AppsFlyerConversionListener {
        INSTANCE;

        public void onAppOpenAttribution(Map<String, String> map) {
        }

        public void onAttributionFailure(String str) {
        }

        public void onInstallConversionDataLoaded(Map<String, String> map) {
        }

        public void onInstallConversionFailure(String str) {
        }
    }

    @Inject
    AppsFlyerAttributionTracker(Application application, C3010d c3010d, C8297k c8297k, CurrentUserProvider currentUserProvider) {
        this.f26429a = application;
        this.f26430b = c3010d;
        this.f26431c = c8297k;
        this.f26432d = currentUserProvider;
    }

    public void initialize() {
        this.f26430b.a("XkJdrCAFbLCxnQ4SH7xon6", NoopConversionListener.INSTANCE, this.f26429a);
        this.f26430b.a(this.f26431c.a());
        this.f26430b.a(this.f26429a);
        Observable k = this.f26432d.observe().a(Schedulers.io()).f(C7991a.f28601a).f().k(C7992b.f28602a).k(C7993c.f28603a);
        C3010d c3010d = this.f26430b;
        c3010d.getClass();
        k.a(C8132d.m34537a(c3010d), C8133e.f29139a);
    }

    /* renamed from: a */
    static final /* synthetic */ Boolean m31214a(ProfileUser profileUser) {
        return Boolean.valueOf(profileUser != null ? true : null);
    }

    public void trackEvent(String str, Map<String, Object> map) {
        this.f26430b.a(this.f26429a, str, map);
    }
}
