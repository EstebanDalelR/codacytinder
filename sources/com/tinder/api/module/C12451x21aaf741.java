package com.tinder.api.module;

import com.squareup.moshi.C5987p;
import com.tinder.api.retrofit.RetrofitErrorBodyAwareTransformer;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.api.module.TinderApiModule_ProvideSuperLikeableErrorBodyAwareTransformerFactory */
public final class C12451x21aaf741 implements Factory<RetrofitErrorBodyAwareTransformer<?>> {
    private final TinderApiModule module;
    private final Provider<C5987p> moshiProvider;

    public C12451x21aaf741(TinderApiModule tinderApiModule, Provider<C5987p> provider) {
        this.module = tinderApiModule;
        this.moshiProvider = provider;
    }

    public RetrofitErrorBodyAwareTransformer<?> get() {
        return C12451x21aaf741.provideInstance(this.module, this.moshiProvider);
    }

    public static RetrofitErrorBodyAwareTransformer<?> provideInstance(TinderApiModule tinderApiModule, Provider<C5987p> provider) {
        return C12451x21aaf741.proxyProvideSuperLikeableErrorBodyAwareTransformer(tinderApiModule, (C5987p) provider.get());
    }

    public static C12451x21aaf741 create(TinderApiModule tinderApiModule, Provider<C5987p> provider) {
        return new C12451x21aaf741(tinderApiModule, provider);
    }

    public static RetrofitErrorBodyAwareTransformer<?> proxyProvideSuperLikeableErrorBodyAwareTransformer(TinderApiModule tinderApiModule, C5987p c5987p) {
        return (RetrofitErrorBodyAwareTransformer) C15521i.a(tinderApiModule.provideSuperLikeableErrorBodyAwareTransformer(c5987p), "Cannot return null from a non-@Nullable @Provides method");
    }
}
