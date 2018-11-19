package com.tinder.module;

import com.tinder.messageads.C12113a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;
import okhttp3.C17692o;

/* renamed from: com.tinder.module.o */
public final class C13494o implements Factory<C17692o> {
    /* renamed from: a */
    private final C9940d f43062a;
    /* renamed from: b */
    private final Provider<C17692o> f43063b;
    /* renamed from: c */
    private final Provider<C12113a> f43064c;

    public /* synthetic */ Object get() {
        return m52567a();
    }

    public C13494o(C9940d c9940d, Provider<C17692o> provider, Provider<C12113a> provider2) {
        this.f43062a = c9940d;
        this.f43063b = provider;
        this.f43064c = provider2;
    }

    /* renamed from: a */
    public C17692o m52567a() {
        return C13494o.m52564a(this.f43062a, this.f43063b, this.f43064c);
    }

    /* renamed from: a */
    public static C17692o m52564a(C9940d c9940d, Provider<C17692o> provider, Provider<C12113a> provider2) {
        return C13494o.m52565a(c9940d, (C17692o) provider.get(), (C12113a) provider2.get());
    }

    /* renamed from: b */
    public static C13494o m52566b(C9940d c9940d, Provider<C17692o> provider, Provider<C12113a> provider2) {
        return new C13494o(c9940d, provider, provider2);
    }

    /* renamed from: a */
    public static C17692o m52565a(C9940d c9940d, C17692o c17692o, C12113a c12113a) {
        return (C17692o) C15521i.a(c9940d.m40869a(c17692o, c12113a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
