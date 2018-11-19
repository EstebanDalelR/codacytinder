package com.tinder.home.navigation;

import com.tinder.home.p259b.C9695a;
import com.tinder.match.navigation.MatchSubscreensTracker;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.home.navigation.d */
public final class C13330d implements Factory<C9703a> {
    /* renamed from: a */
    private final Provider<C9695a> f42296a;
    /* renamed from: b */
    private final Provider<MatchSubscreensTracker> f42297b;

    public /* synthetic */ Object get() {
        return m51580a();
    }

    public C13330d(Provider<C9695a> provider, Provider<MatchSubscreensTracker> provider2) {
        this.f42296a = provider;
        this.f42297b = provider2;
    }

    /* renamed from: a */
    public C9703a m51580a() {
        return C13330d.m51578a(this.f42296a, this.f42297b);
    }

    /* renamed from: a */
    public static C9703a m51578a(Provider<C9695a> provider, Provider<MatchSubscreensTracker> provider2) {
        return new C9703a((C9695a) provider.get(), (MatchSubscreensTracker) provider2.get());
    }

    /* renamed from: b */
    public static C13330d m51579b(Provider<C9695a> provider, Provider<MatchSubscreensTracker> provider2) {
        return new C13330d(provider, provider2);
    }
}
