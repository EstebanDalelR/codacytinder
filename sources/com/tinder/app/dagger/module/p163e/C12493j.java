package com.tinder.app.dagger.module.p163e;

import com.tinder.data.superlikeable.C8794b;
import com.tinder.data.superlikeable.SuperLikeableGameApiClient;
import com.tinder.domain.superlikeable.SuperLikeableGameRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.e.j */
public final class C12493j implements Factory<SuperLikeableGameRepository> {
    /* renamed from: a */
    private final Provider<C8794b> f40282a;
    /* renamed from: b */
    private final Provider<SuperLikeableGameApiClient> f40283b;

    public /* synthetic */ Object get() {
        return m49145a();
    }

    public C12493j(Provider<C8794b> provider, Provider<SuperLikeableGameApiClient> provider2) {
        this.f40282a = provider;
        this.f40283b = provider2;
    }

    /* renamed from: a */
    public SuperLikeableGameRepository m49145a() {
        return C12493j.m49143a(this.f40282a, this.f40283b);
    }

    /* renamed from: a */
    public static SuperLikeableGameRepository m49143a(Provider<C8794b> provider, Provider<SuperLikeableGameApiClient> provider2) {
        return C12493j.m49142a((C8794b) provider.get(), (SuperLikeableGameApiClient) provider2.get());
    }

    /* renamed from: b */
    public static C12493j m49144b(Provider<C8794b> provider, Provider<SuperLikeableGameApiClient> provider2) {
        return new C12493j(provider, provider2);
    }

    /* renamed from: a */
    public static SuperLikeableGameRepository m49142a(C8794b c8794b, SuperLikeableGameApiClient superLikeableGameApiClient) {
        return (SuperLikeableGameRepository) C15521i.a(C8248a.m35187a(c8794b, superLikeableGameApiClient), "Cannot return null from a non-@Nullable @Provides method");
    }
}
