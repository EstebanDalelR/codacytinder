package com.tinder.data.message;

import com.tinder.data.adapter.C10738l;
import com.tinder.data.adapter.p208a.C10727b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.message.p */
public final class C12957p implements Factory<C10839m> {
    /* renamed from: a */
    private final Provider<C10738l> f41505a;
    /* renamed from: b */
    private final Provider<av> f41506b;
    /* renamed from: c */
    private final Provider<C10837i> f41507c;
    /* renamed from: d */
    private final Provider<bc> f41508d;
    /* renamed from: e */
    private final Provider<C10727b> f41509e;
    /* renamed from: f */
    private final Provider<ao> f41510f;

    public /* synthetic */ Object get() {
        return m50683a();
    }

    public C12957p(Provider<C10738l> provider, Provider<av> provider2, Provider<C10837i> provider3, Provider<bc> provider4, Provider<C10727b> provider5, Provider<ao> provider6) {
        this.f41505a = provider;
        this.f41506b = provider2;
        this.f41507c = provider3;
        this.f41508d = provider4;
        this.f41509e = provider5;
        this.f41510f = provider6;
    }

    /* renamed from: a */
    public C10839m m50683a() {
        return C12957p.m50681a(this.f41505a, this.f41506b, this.f41507c, this.f41508d, this.f41509e, this.f41510f);
    }

    /* renamed from: a */
    public static C10839m m50681a(Provider<C10738l> provider, Provider<av> provider2, Provider<C10837i> provider3, Provider<bc> provider4, Provider<C10727b> provider5, Provider<ao> provider6) {
        return new C10839m((C10738l) provider.get(), (av) provider2.get(), (C10837i) provider3.get(), (bc) provider4.get(), (C10727b) provider5.get(), (ao) provider6.get());
    }

    /* renamed from: b */
    public static C12957p m50682b(Provider<C10738l> provider, Provider<av> provider2, Provider<C10837i> provider3, Provider<bc> provider4, Provider<C10727b> provider5, Provider<ao> provider6) {
        return new C12957p(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
