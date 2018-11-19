package com.tinder.data.gif;

import com.tinder.domain.message.GifProviderExperimentUtility;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.gif.c */
public final class C12898c implements Factory<C10781a> {
    /* renamed from: a */
    private final Provider<GifProviderExperimentUtility> f41360a;
    /* renamed from: b */
    private final Provider<C10782d> f41361b;
    /* renamed from: c */
    private final Provider<C10784g> f41362c;

    public /* synthetic */ Object get() {
        return m50559a();
    }

    public C12898c(Provider<GifProviderExperimentUtility> provider, Provider<C10782d> provider2, Provider<C10784g> provider3) {
        this.f41360a = provider;
        this.f41361b = provider2;
        this.f41362c = provider3;
    }

    /* renamed from: a */
    public C10781a m50559a() {
        return C12898c.m50557a(this.f41360a, this.f41361b, this.f41362c);
    }

    /* renamed from: a */
    public static C10781a m50557a(Provider<GifProviderExperimentUtility> provider, Provider<C10782d> provider2, Provider<C10784g> provider3) {
        return new C10781a((GifProviderExperimentUtility) provider.get(), C17281c.b(provider2), C17281c.b(provider3));
    }

    /* renamed from: b */
    public static C12898c m50558b(Provider<GifProviderExperimentUtility> provider, Provider<C10782d> provider2, Provider<C10784g> provider3) {
        return new C12898c(provider, provider2, provider3);
    }
}
