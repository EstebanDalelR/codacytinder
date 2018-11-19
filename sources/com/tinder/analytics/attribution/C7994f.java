package com.tinder.analytics.attribution;

import android.app.Application;
import com.appsflyer.C3010d;
import com.tinder.auth.repository.C8297k;
import com.tinder.data.user.CurrentUserProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.analytics.attribution.f */
public final class C7994f implements Factory<AppsFlyerAttributionTracker> {
    /* renamed from: a */
    private final Provider<Application> f28604a;
    /* renamed from: b */
    private final Provider<C3010d> f28605b;
    /* renamed from: c */
    private final Provider<C8297k> f28606c;
    /* renamed from: d */
    private final Provider<CurrentUserProvider> f28607d;

    public /* synthetic */ Object get() {
        return m33873a();
    }

    public C7994f(Provider<Application> provider, Provider<C3010d> provider2, Provider<C8297k> provider3, Provider<CurrentUserProvider> provider4) {
        this.f28604a = provider;
        this.f28605b = provider2;
        this.f28606c = provider3;
        this.f28607d = provider4;
    }

    /* renamed from: a */
    public AppsFlyerAttributionTracker m33873a() {
        return C7994f.m33871a(this.f28604a, this.f28605b, this.f28606c, this.f28607d);
    }

    /* renamed from: a */
    public static AppsFlyerAttributionTracker m33871a(Provider<Application> provider, Provider<C3010d> provider2, Provider<C8297k> provider3, Provider<CurrentUserProvider> provider4) {
        return new AppsFlyerAttributionTracker((Application) provider.get(), (C3010d) provider2.get(), (C8297k) provider3.get(), (CurrentUserProvider) provider4.get());
    }

    /* renamed from: b */
    public static C7994f m33872b(Provider<Application> provider, Provider<C3010d> provider2, Provider<C8297k> provider3, Provider<CurrentUserProvider> provider4) {
        return new C7994f(provider, provider2, provider3, provider4);
    }
}
