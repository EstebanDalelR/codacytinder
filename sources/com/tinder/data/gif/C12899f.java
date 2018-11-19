package com.tinder.data.gif;

import com.tinder.api.giphy.GiphyApi;
import com.tinder.data.message.p225a.C10809a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.gif.f */
public final class C12899f implements Factory<C10782d> {
    /* renamed from: a */
    private final Provider<GiphyApi> f41363a;
    /* renamed from: b */
    private final Provider<C10809a> f41364b;

    public /* synthetic */ Object get() {
        return m50562a();
    }

    public C12899f(Provider<GiphyApi> provider, Provider<C10809a> provider2) {
        this.f41363a = provider;
        this.f41364b = provider2;
    }

    /* renamed from: a */
    public C10782d m50562a() {
        return C12899f.m50560a(this.f41363a, this.f41364b);
    }

    /* renamed from: a */
    public static C10782d m50560a(Provider<GiphyApi> provider, Provider<C10809a> provider2) {
        return new C10782d((GiphyApi) provider.get(), (C10809a) provider2.get());
    }

    /* renamed from: b */
    public static C12899f m50561b(Provider<GiphyApi> provider, Provider<C10809a> provider2) {
        return new C12899f(provider, provider2);
    }
}
