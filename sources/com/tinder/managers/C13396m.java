package com.tinder.managers;

import com.tinder.api.ManagerNetwork;
import com.tinder.auth.repository.C10350m;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.managers.m */
public final class C13396m implements Factory<FacebookManager> {
    /* renamed from: a */
    private final Provider<ManagerNetwork> f42528a;
    /* renamed from: b */
    private final Provider<C10350m> f42529b;

    public /* synthetic */ Object get() {
        return m51830a();
    }

    public C13396m(Provider<ManagerNetwork> provider, Provider<C10350m> provider2) {
        this.f42528a = provider;
        this.f42529b = provider2;
    }

    /* renamed from: a */
    public FacebookManager m51830a() {
        return C13396m.m51828a(this.f42528a, this.f42529b);
    }

    /* renamed from: a */
    public static FacebookManager m51828a(Provider<ManagerNetwork> provider, Provider<C10350m> provider2) {
        return new FacebookManager((ManagerNetwork) provider.get(), (C10350m) provider2.get());
    }

    /* renamed from: b */
    public static C13396m m51829b(Provider<ManagerNetwork> provider, Provider<C10350m> provider2) {
        return new C13396m(provider, provider2);
    }
}
