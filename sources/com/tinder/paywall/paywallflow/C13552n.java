package com.tinder.paywall.paywallflow;

import com.tinder.paywall.viewmodels.C10083b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.paywall.paywallflow.n */
public final class C13552n implements Factory<C10072h> {
    /* renamed from: a */
    private final Provider<C10083b> f43276a;

    public /* synthetic */ Object get() {
        return m52954a();
    }

    public C13552n(Provider<C10083b> provider) {
        this.f43276a = provider;
    }

    /* renamed from: a */
    public C10072h m52954a() {
        return C13552n.m52952a(this.f43276a);
    }

    /* renamed from: a */
    public static C10072h m52952a(Provider<C10083b> provider) {
        return new C10072h((C10083b) provider.get());
    }

    /* renamed from: b */
    public static C13552n m52953b(Provider<C10083b> provider) {
        return new C13552n(provider);
    }
}
