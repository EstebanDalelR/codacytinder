package com.tinder.interactors;

import com.tinder.analytics.C2634g;
import com.tinder.managers.C2652a;
import com.tinder.managers.FacebookManager;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.interactors.b */
public final class C13340b implements Factory<C9713a> {
    /* renamed from: a */
    private final Provider<C2652a> f42317a;
    /* renamed from: b */
    private final Provider<FacebookManager> f42318b;
    /* renamed from: c */
    private final Provider<C2634g> f42319c;

    public /* synthetic */ Object get() {
        return m51612a();
    }

    public C13340b(Provider<C2652a> provider, Provider<FacebookManager> provider2, Provider<C2634g> provider3) {
        this.f42317a = provider;
        this.f42318b = provider2;
        this.f42319c = provider3;
    }

    /* renamed from: a */
    public C9713a m51612a() {
        return C13340b.m51610a(this.f42317a, this.f42318b, this.f42319c);
    }

    /* renamed from: a */
    public static C9713a m51610a(Provider<C2652a> provider, Provider<FacebookManager> provider2, Provider<C2634g> provider3) {
        return new C9713a((C2652a) provider.get(), (FacebookManager) provider2.get(), (C2634g) provider3.get());
    }

    /* renamed from: b */
    public static C13340b m51611b(Provider<C2652a> provider, Provider<FacebookManager> provider2, Provider<C2634g> provider3) {
        return new C13340b(provider, provider2, provider3);
    }
}
