package com.tinder.feed.analytics.p247a;

import com.tinder.home.p259b.C9695a;
import com.tinder.match.navigation.MatchSubscreensTracker;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.analytics.a.d */
public final class C13218d implements Factory<C9423b> {
    /* renamed from: a */
    private final Provider<C9695a> f41932a;
    /* renamed from: b */
    private final Provider<MatchSubscreensTracker> f41933b;

    public /* synthetic */ Object get() {
        return m51210a();
    }

    public C13218d(Provider<C9695a> provider, Provider<MatchSubscreensTracker> provider2) {
        this.f41932a = provider;
        this.f41933b = provider2;
    }

    /* renamed from: a */
    public C9423b m51210a() {
        return C13218d.m51208a(this.f41932a, this.f41933b);
    }

    /* renamed from: a */
    public static C9423b m51208a(Provider<C9695a> provider, Provider<MatchSubscreensTracker> provider2) {
        return new C9423b((C9695a) provider.get(), (MatchSubscreensTracker) provider2.get());
    }

    /* renamed from: b */
    public static C13218d m51209b(Provider<C9695a> provider, Provider<MatchSubscreensTracker> provider2) {
        return new C13218d(provider, provider2);
    }
}
