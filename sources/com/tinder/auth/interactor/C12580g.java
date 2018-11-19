package com.tinder.auth.interactor;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.interactor.g */
public final class C12580g implements Factory<AddSmsValidateEvent> {
    /* renamed from: a */
    private final Provider<C2630h> f40645a;

    public /* synthetic */ Object get() {
        return m49726a();
    }

    public C12580g(Provider<C2630h> provider) {
        this.f40645a = provider;
    }

    /* renamed from: a */
    public AddSmsValidateEvent m49726a() {
        return C12580g.m49724a(this.f40645a);
    }

    /* renamed from: a */
    public static AddSmsValidateEvent m49724a(Provider<C2630h> provider) {
        return new AddSmsValidateEvent((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C12580g m49725b(Provider<C2630h> provider) {
        return new C12580g(provider);
    }
}
