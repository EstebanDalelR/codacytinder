package com.tinder.profile.p364c;

import com.tinder.domain.profile.usecase.ProfileImageUploader;
import com.tinder.profile.adapters.C14366i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.c.b */
public final class C17758b implements Factory<C14397a> {
    /* renamed from: a */
    private final Provider<ProfileImageUploader> f55399a;
    /* renamed from: b */
    private final Provider<C14366i> f55400b;

    public /* synthetic */ Object get() {
        return m64927a();
    }

    public C17758b(Provider<ProfileImageUploader> provider, Provider<C14366i> provider2) {
        this.f55399a = provider;
        this.f55400b = provider2;
    }

    /* renamed from: a */
    public C14397a m64927a() {
        return C17758b.m64925a(this.f55399a, this.f55400b);
    }

    /* renamed from: a */
    public static C14397a m64925a(Provider<ProfileImageUploader> provider, Provider<C14366i> provider2) {
        return new C14397a((ProfileImageUploader) provider.get(), (C14366i) provider2.get());
    }

    /* renamed from: b */
    public static C17758b m64926b(Provider<ProfileImageUploader> provider, Provider<C14366i> provider2) {
        return new C17758b(provider, provider2);
    }
}
