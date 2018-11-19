package com.tinder.chat.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.analytics.f */
public final class C12689f implements Factory<C10529d> {
    /* renamed from: a */
    private final Provider<C2630h> f40967a;
    /* renamed from: b */
    private final Provider<C10522a> f40968b;
    /* renamed from: c */
    private final Provider<C15679f> f40969c;

    public /* synthetic */ Object get() {
        return m49986a();
    }

    public C12689f(Provider<C2630h> provider, Provider<C10522a> provider2, Provider<C15679f> provider3) {
        this.f40967a = provider;
        this.f40968b = provider2;
        this.f40969c = provider3;
    }

    /* renamed from: a */
    public C10529d m49986a() {
        return C12689f.m49984a(this.f40967a, this.f40968b, this.f40969c);
    }

    /* renamed from: a */
    public static C10529d m49984a(Provider<C2630h> provider, Provider<C10522a> provider2, Provider<C15679f> provider3) {
        return new C10529d((C2630h) provider.get(), (C10522a) provider2.get(), (C15679f) provider3.get());
    }

    /* renamed from: b */
    public static C12689f m49985b(Provider<C2630h> provider, Provider<C10522a> provider2, Provider<C15679f> provider3) {
        return new C12689f(provider, provider2, provider3);
    }
}
