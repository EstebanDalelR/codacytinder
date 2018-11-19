package com.tinder.profile.adapters;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.adapters.r */
public final class C17750r implements Factory<C14369o> {
    /* renamed from: a */
    private final Provider<C14368m> f55379a;

    public /* synthetic */ Object get() {
        return m64886a();
    }

    /* renamed from: a */
    public C14369o m64886a() {
        return C17750r.m64885a(this.f55379a);
    }

    /* renamed from: a */
    public static C14369o m64885a(Provider<C14368m> provider) {
        return new C14369o((C14368m) provider.get());
    }

    /* renamed from: a */
    public static C14369o m64884a(C14368m c14368m) {
        return new C14369o(c14368m);
    }
}
