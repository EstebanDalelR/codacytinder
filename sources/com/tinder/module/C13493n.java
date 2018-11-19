package com.tinder.module;

import android.content.Context;
import com.tinder.addy.source.fan.FanAdLoader.C6190a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.module.n */
public final class C13493n implements Factory<C6190a> {
    /* renamed from: a */
    private final C9940d f43060a;
    /* renamed from: b */
    private final Provider<Context> f43061b;

    public /* synthetic */ Object get() {
        return m52563a();
    }

    public C13493n(C9940d c9940d, Provider<Context> provider) {
        this.f43060a = c9940d;
        this.f43061b = provider;
    }

    /* renamed from: a */
    public C6190a m52563a() {
        return C13493n.m52561a(this.f43060a, this.f43061b);
    }

    /* renamed from: a */
    public static C6190a m52561a(C9940d c9940d, Provider<Context> provider) {
        return C13493n.m52560a(c9940d, (Context) provider.get());
    }

    /* renamed from: b */
    public static C13493n m52562b(C9940d c9940d, Provider<Context> provider) {
        return new C13493n(c9940d, provider);
    }

    /* renamed from: a */
    public static C6190a m52560a(C9940d c9940d, Context context) {
        return (C6190a) C15521i.a(c9940d.m40870b(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
