package com.tinder.di;

import com.tinder.domain.recs.RecsEngine.Config;
import com.tinder.domain.recs.engine.RecsLoader;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.di.h */
public final class C13137h implements Factory<RecsLoader> {
    /* renamed from: a */
    private final C8839d f41790a;
    /* renamed from: b */
    private final Provider<Config> f41791b;
    /* renamed from: c */
    private final Provider<RecsLoader> f41792c;
    /* renamed from: d */
    private final Provider<RecsLoader> f41793d;

    public /* synthetic */ Object get() {
        return m51049a();
    }

    public C13137h(C8839d c8839d, Provider<Config> provider, Provider<RecsLoader> provider2, Provider<RecsLoader> provider3) {
        this.f41790a = c8839d;
        this.f41791b = provider;
        this.f41792c = provider2;
        this.f41793d = provider3;
    }

    /* renamed from: a */
    public RecsLoader m51049a() {
        return (RecsLoader) C15521i.a(this.f41790a.m37599b((Config) this.f41791b.get(), C17281c.b(this.f41792c), C17281c.b(this.f41793d)), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C13137h m51048a(C8839d c8839d, Provider<Config> provider, Provider<RecsLoader> provider2, Provider<RecsLoader> provider3) {
        return new C13137h(c8839d, provider, provider2, provider3);
    }
}
