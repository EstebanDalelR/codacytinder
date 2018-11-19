package com.snapchat.kit.sdk.login.p158b;

import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.login.p150a.C5954a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.login.b.b */
public final class C7935b implements Factory<C7164a> {
    /* renamed from: a */
    private final Provider<AuthTokenManager> f28531a;
    /* renamed from: b */
    private final Provider<LoginStateController> f28532b;
    /* renamed from: c */
    private final Provider<C5954a> f28533c;

    public /* synthetic */ Object get() {
        return m33788a();
    }

    public C7935b(Provider<AuthTokenManager> provider, Provider<LoginStateController> provider2, Provider<C5954a> provider3) {
        this.f28531a = provider;
        this.f28532b = provider2;
        this.f28533c = provider3;
    }

    /* renamed from: a */
    public C7164a m33788a() {
        return new C7164a((AuthTokenManager) this.f28531a.get(), (LoginStateController) this.f28532b.get(), (C5954a) this.f28533c.get());
    }

    /* renamed from: a */
    public static Factory<C7164a> m33787a(Provider<AuthTokenManager> provider, Provider<LoginStateController> provider2, Provider<C5954a> provider3) {
        return new C7935b(provider, provider2, provider3);
    }
}
