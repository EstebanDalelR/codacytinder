package com.tinder.recsads;

import com.tinder.recsads.analytics.C16432d;
import com.tinder.recsads.analytics.C16434j;
import com.tinder.recsads.analytics.C16439r;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.m */
public final class C18028m implements Factory<C16461l> {
    /* renamed from: a */
    private final Provider<C16434j> f55975a;
    /* renamed from: b */
    private final Provider<C16439r> f55976b;
    /* renamed from: c */
    private final Provider<C16432d> f55977c;

    public /* synthetic */ Object get() {
        return m65443a();
    }

    public C18028m(Provider<C16434j> provider, Provider<C16439r> provider2, Provider<C16432d> provider3) {
        this.f55975a = provider;
        this.f55976b = provider2;
        this.f55977c = provider3;
    }

    /* renamed from: a */
    public C16461l m65443a() {
        return C18028m.m65441a(this.f55975a, this.f55976b, this.f55977c);
    }

    /* renamed from: a */
    public static C16461l m65441a(Provider<C16434j> provider, Provider<C16439r> provider2, Provider<C16432d> provider3) {
        return new C16461l((C16434j) provider.get(), (C16439r) provider2.get(), (C16432d) provider3.get());
    }

    /* renamed from: b */
    public static C18028m m65442b(Provider<C16434j> provider, Provider<C16439r> provider2, Provider<C16432d> provider3) {
        return new C18028m(provider, provider2, provider3);
    }
}
