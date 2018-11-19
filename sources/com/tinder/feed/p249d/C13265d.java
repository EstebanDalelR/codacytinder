package com.tinder.feed.p249d;

import com.tinder.feed.view.model.C9537a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.d.d */
public final class C13265d implements Factory<C9463c> {
    /* renamed from: a */
    private final Provider<C9537a> f42022a;

    public /* synthetic */ Object get() {
        return m51319a();
    }

    public C13265d(Provider<C9537a> provider) {
        this.f42022a = provider;
    }

    /* renamed from: a */
    public C9463c m51319a() {
        return C13265d.m51317a(this.f42022a);
    }

    /* renamed from: a */
    public static C9463c m51317a(Provider<C9537a> provider) {
        return new C9463c((C9537a) provider.get());
    }

    /* renamed from: b */
    public static C13265d m51318b(Provider<C9537a> provider) {
        return new C13265d(provider);
    }
}
