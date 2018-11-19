package com.tinder.recsads;

import com.tinder.recsads.listener.C16462a;
import com.tinder.recsads.listener.C16463c;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.b */
public final class C18021b implements Factory<C16429a> {
    /* renamed from: a */
    private final Provider<C16461l> f55963a;
    /* renamed from: b */
    private final Provider<Set<NativeCardListener>> f55964b;
    /* renamed from: c */
    private final Provider<C16462a> f55965c;
    /* renamed from: d */
    private final Provider<C16463c> f55966d;

    public /* synthetic */ Object get() {
        return m65422a();
    }

    public C18021b(Provider<C16461l> provider, Provider<Set<NativeCardListener>> provider2, Provider<C16462a> provider3, Provider<C16463c> provider4) {
        this.f55963a = provider;
        this.f55964b = provider2;
        this.f55965c = provider3;
        this.f55966d = provider4;
    }

    /* renamed from: a */
    public C16429a m65422a() {
        return C18021b.m65420a(this.f55963a, this.f55964b, this.f55965c, this.f55966d);
    }

    /* renamed from: a */
    public static C16429a m65420a(Provider<C16461l> provider, Provider<Set<NativeCardListener>> provider2, Provider<C16462a> provider3, Provider<C16463c> provider4) {
        return new C16429a((C16461l) provider.get(), (Set) provider2.get(), (C16462a) provider3.get(), (C16463c) provider4.get());
    }

    /* renamed from: b */
    public static C18021b m65421b(Provider<C16461l> provider, Provider<Set<NativeCardListener>> provider2, Provider<C16462a> provider3, Provider<C16463c> provider4) {
        return new C18021b(provider, provider2, provider3, provider4);
    }
}
