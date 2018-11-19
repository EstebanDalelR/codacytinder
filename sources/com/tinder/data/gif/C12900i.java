package com.tinder.data.gif;

import com.tinder.api.TinderApi;
import com.tinder.common.p194f.C8532a;
import com.tinder.data.message.p225a.C10809a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.gif.i */
public final class C12900i implements Factory<C10784g> {
    /* renamed from: a */
    private final Provider<C8532a> f41365a;
    /* renamed from: b */
    private final Provider<TinderApi> f41366b;
    /* renamed from: c */
    private final Provider<C10809a> f41367c;

    public /* synthetic */ Object get() {
        return m50565a();
    }

    public C12900i(Provider<C8532a> provider, Provider<TinderApi> provider2, Provider<C10809a> provider3) {
        this.f41365a = provider;
        this.f41366b = provider2;
        this.f41367c = provider3;
    }

    /* renamed from: a */
    public C10784g m50565a() {
        return C12900i.m50563a(this.f41365a, this.f41366b, this.f41367c);
    }

    /* renamed from: a */
    public static C10784g m50563a(Provider<C8532a> provider, Provider<TinderApi> provider2, Provider<C10809a> provider3) {
        return new C10784g((C8532a) provider.get(), (TinderApi) provider2.get(), (C10809a) provider3.get());
    }

    /* renamed from: b */
    public static C12900i m50564b(Provider<C8532a> provider, Provider<TinderApi> provider2, Provider<C10809a> provider3) {
        return new C12900i(provider, provider2, provider3);
    }
}
