package com.tinder.fastmatch;

import com.tinder.recsgrid.C16487f;
import com.tinder.recsgrid.ScrollStatusProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.i */
public final class C13195i implements Factory<ScrollStatusProvider> {
    /* renamed from: a */
    private final C9370a f41896a;
    /* renamed from: b */
    private final Provider<C16487f> f41897b;

    public /* synthetic */ Object get() {
        return m51169a();
    }

    public C13195i(C9370a c9370a, Provider<C16487f> provider) {
        this.f41896a = c9370a;
        this.f41897b = provider;
    }

    /* renamed from: a */
    public ScrollStatusProvider m51169a() {
        return C13195i.m51167a(this.f41896a, this.f41897b);
    }

    /* renamed from: a */
    public static ScrollStatusProvider m51167a(C9370a c9370a, Provider<C16487f> provider) {
        return C13195i.m51166a(c9370a, (C16487f) provider.get());
    }

    /* renamed from: b */
    public static C13195i m51168b(C9370a c9370a, Provider<C16487f> provider) {
        return new C13195i(c9370a, provider);
    }

    /* renamed from: a */
    public static ScrollStatusProvider m51166a(C9370a c9370a, C16487f c16487f) {
        return (ScrollStatusProvider) C15521i.a(c9370a.m39229b(c16487f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
