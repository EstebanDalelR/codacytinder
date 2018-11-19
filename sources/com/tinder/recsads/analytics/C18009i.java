package com.tinder.recsads.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.analytics.i */
public final class C18009i implements Factory<AddAdOpenEvent> {
    /* renamed from: a */
    private final Provider<C2630h> f55944a;
    /* renamed from: b */
    private final Provider<C14729c> f55945b;

    public /* synthetic */ Object get() {
        return m65386a();
    }

    public C18009i(Provider<C2630h> provider, Provider<C14729c> provider2) {
        this.f55944a = provider;
        this.f55945b = provider2;
    }

    /* renamed from: a */
    public AddAdOpenEvent m65386a() {
        return C18009i.m65384a(this.f55944a, this.f55945b);
    }

    /* renamed from: a */
    public static AddAdOpenEvent m65384a(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new AddAdOpenEvent((C2630h) provider.get(), (C14729c) provider2.get());
    }

    /* renamed from: b */
    public static C18009i m65385b(Provider<C2630h> provider, Provider<C14729c> provider2) {
        return new C18009i(provider, provider2);
    }
}
