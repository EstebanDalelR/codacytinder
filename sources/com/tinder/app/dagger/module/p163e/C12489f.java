package com.tinder.app.dagger.module.p163e;

import com.tinder.api.TinderApi;
import com.tinder.data.adapter.ap;
import com.tinder.data.superlikeable.SuperLikeableGameApiClient;
import com.tinder.data.superlikeable.SuperLikeableGameApiClient.C8790a;
import com.tinder.util.ConnectivityProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.e.f */
public final class C12489f implements Factory<SuperLikeableGameApiClient> {
    /* renamed from: a */
    private final Provider<TinderApi> f40269a;
    /* renamed from: b */
    private final Provider<ap> f40270b;
    /* renamed from: c */
    private final Provider<C8790a> f40271c;
    /* renamed from: d */
    private final Provider<ConnectivityProvider> f40272d;

    public /* synthetic */ Object get() {
        return m49129a();
    }

    public C12489f(Provider<TinderApi> provider, Provider<ap> provider2, Provider<C8790a> provider3, Provider<ConnectivityProvider> provider4) {
        this.f40269a = provider;
        this.f40270b = provider2;
        this.f40271c = provider3;
        this.f40272d = provider4;
    }

    /* renamed from: a */
    public SuperLikeableGameApiClient m49129a() {
        return C12489f.m49127a(this.f40269a, this.f40270b, this.f40271c, this.f40272d);
    }

    /* renamed from: a */
    public static SuperLikeableGameApiClient m49127a(Provider<TinderApi> provider, Provider<ap> provider2, Provider<C8790a> provider3, Provider<ConnectivityProvider> provider4) {
        return C12489f.m49126a((TinderApi) provider.get(), (ap) provider2.get(), (C8790a) provider3.get(), (ConnectivityProvider) provider4.get());
    }

    /* renamed from: b */
    public static C12489f m49128b(Provider<TinderApi> provider, Provider<ap> provider2, Provider<C8790a> provider3, Provider<ConnectivityProvider> provider4) {
        return new C12489f(provider, provider2, provider3, provider4);
    }

    /* renamed from: a */
    public static SuperLikeableGameApiClient m49126a(TinderApi tinderApi, ap apVar, C8790a c8790a, ConnectivityProvider connectivityProvider) {
        return (SuperLikeableGameApiClient) C15521i.a(C8248a.m35184a(tinderApi, apVar, c8790a, connectivityProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
