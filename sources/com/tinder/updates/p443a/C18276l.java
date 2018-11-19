package com.tinder.updates.p443a;

import com.tinder.api.keepalive.KeepAliveScarletApi;
import com.tinder.domain.updates.UpdatesStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.updates.a.l */
public final class C18276l implements Factory<C15342k> {
    /* renamed from: a */
    private final Provider<KeepAliveScarletApi> f56609a;
    /* renamed from: b */
    private final Provider<UpdatesStatusProvider> f56610b;
    /* renamed from: c */
    private final Provider<C17204a> f56611c;

    public /* synthetic */ Object get() {
        return m66206a();
    }

    public C18276l(Provider<KeepAliveScarletApi> provider, Provider<UpdatesStatusProvider> provider2, Provider<C17204a> provider3) {
        this.f56609a = provider;
        this.f56610b = provider2;
        this.f56611c = provider3;
    }

    /* renamed from: a */
    public C15342k m66206a() {
        return C18276l.m66204a(this.f56609a, this.f56610b, this.f56611c);
    }

    /* renamed from: a */
    public static C15342k m66204a(Provider<KeepAliveScarletApi> provider, Provider<UpdatesStatusProvider> provider2, Provider<C17204a> provider3) {
        return new C15342k((KeepAliveScarletApi) provider.get(), (UpdatesStatusProvider) provider2.get(), (C17204a) provider3.get());
    }

    /* renamed from: b */
    public static C18276l m66205b(Provider<KeepAliveScarletApi> provider, Provider<UpdatesStatusProvider> provider2, Provider<C17204a> provider3) {
        return new C18276l(provider, provider2, provider3);
    }
}
