package com.tinder.module;

import android.content.Context;
import com.tinder.addy.source.nativedfp.NativeDfpLoader.C6191a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.s */
public final class C13498s implements Factory<C6191a> {
    /* renamed from: a */
    private final C9940d f43072a;
    /* renamed from: b */
    private final Provider<Context> f43073b;

    public /* synthetic */ Object get() {
        return m52583a();
    }

    public C13498s(C9940d c9940d, Provider<Context> provider) {
        this.f43072a = c9940d;
        this.f43073b = provider;
    }

    /* renamed from: a */
    public C6191a m52583a() {
        return C13498s.m52581a(this.f43072a, this.f43073b);
    }

    /* renamed from: a */
    public static C6191a m52581a(C9940d c9940d, Provider<Context> provider) {
        return C13498s.m52580a(c9940d, (Context) provider.get());
    }

    /* renamed from: b */
    public static C13498s m52582b(C9940d c9940d, Provider<Context> provider) {
        return new C13498s(c9940d, provider);
    }

    /* renamed from: a */
    public static C6191a m52580a(C9940d c9940d, Context context) {
        return (C6191a) C15521i.a(c9940d.m40857a(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
