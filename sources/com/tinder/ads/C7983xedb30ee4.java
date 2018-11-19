package com.tinder.ads;

import com.tinder.recsads.p467b.C16451a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.ads.AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener_AddyV2BrandedProfileCardAdMapper_Factory */
public final class C7983xedb30ee4 implements Factory<C6193x7293fe> {
    private final Provider<C16451a> brandedProfileCardAdFactoryProvider;

    public C7983xedb30ee4(Provider<C16451a> provider) {
        this.brandedProfileCardAdFactoryProvider = provider;
    }

    public C6193x7293fe get() {
        return C7983xedb30ee4.provideInstance(this.brandedProfileCardAdFactoryProvider);
    }

    public static C6193x7293fe provideInstance(Provider<C16451a> provider) {
        return new C6193x7293fe((C16451a) provider.get());
    }

    public static C7983xedb30ee4 create(Provider<C16451a> provider) {
        return new C7983xedb30ee4(provider);
    }

    public static C6193x7293fe newAddyV2BrandedProfileCardAdMapper(C16451a c16451a) {
        return new C6193x7293fe(c16451a);
    }
}
