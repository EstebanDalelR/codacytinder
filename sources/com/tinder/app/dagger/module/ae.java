package com.tinder.app.dagger.module;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.verification.usecase.AddAuthAccountLinkModalEvent;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ae implements Factory<AddAuthAccountLinkModalEvent> {
    /* renamed from: a */
    private final ad f40169a;
    /* renamed from: b */
    private final Provider<C2630h> f40170b;

    public /* synthetic */ Object get() {
        return m48975a();
    }

    /* renamed from: a */
    public AddAuthAccountLinkModalEvent m48975a() {
        return m48974a(this.f40169a, this.f40170b);
    }

    /* renamed from: a */
    public static AddAuthAccountLinkModalEvent m48974a(ad adVar, Provider<C2630h> provider) {
        return m48973a(adVar, (C2630h) provider.get());
    }

    /* renamed from: a */
    public static AddAuthAccountLinkModalEvent m48973a(ad adVar, C2630h c2630h) {
        return (AddAuthAccountLinkModalEvent) C15521i.a(adVar.m35153a(c2630h), "Cannot return null from a non-@Nullable @Provides method");
    }
}
