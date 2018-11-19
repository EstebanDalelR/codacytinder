package com.tinder.recsads.listener;

import com.tinder.recsads.analytics.C16431b;
import com.tinder.recsads.analytics.C16438p;
import com.tinder.recsads.analytics.C16440t;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.listener.e */
public final class C18027e implements Factory<C16463c> {
    /* renamed from: a */
    private final Provider<C16440t> f55972a;
    /* renamed from: b */
    private final Provider<C16438p> f55973b;
    /* renamed from: c */
    private final Provider<C16431b> f55974c;

    public /* synthetic */ Object get() {
        return m65440a();
    }

    public C18027e(Provider<C16440t> provider, Provider<C16438p> provider2, Provider<C16431b> provider3) {
        this.f55972a = provider;
        this.f55973b = provider2;
        this.f55974c = provider3;
    }

    /* renamed from: a */
    public C16463c m65440a() {
        return C18027e.m65438a(this.f55972a, this.f55973b, this.f55974c);
    }

    /* renamed from: a */
    public static C16463c m65438a(Provider<C16440t> provider, Provider<C16438p> provider2, Provider<C16431b> provider3) {
        return new C16463c((C16440t) provider.get(), (C16438p) provider2.get(), (C16431b) provider3.get());
    }

    /* renamed from: b */
    public static C18027e m65439b(Provider<C16440t> provider, Provider<C16438p> provider2, Provider<C16431b> provider3) {
        return new C18027e(provider, provider2, provider3);
    }
}
