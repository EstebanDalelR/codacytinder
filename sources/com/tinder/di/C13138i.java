package com.tinder.di;

import com.tinder.data.recs.C10991h;
import com.tinder.domain.recs.RecsEngine.Config;
import com.tinder.domain.recs.RecsRepository;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.di.i */
public final class C13138i implements Factory<RecsRepository> {
    /* renamed from: a */
    private final C8839d f41794a;
    /* renamed from: b */
    private final Provider<Config> f41795b;
    /* renamed from: c */
    private final Provider<C10991h> f41796c;
    /* renamed from: d */
    private final Provider<C10991h> f41797d;

    public /* synthetic */ Object get() {
        return m51051a();
    }

    public C13138i(C8839d c8839d, Provider<Config> provider, Provider<C10991h> provider2, Provider<C10991h> provider3) {
        this.f41794a = c8839d;
        this.f41795b = provider;
        this.f41796c = provider2;
        this.f41797d = provider3;
    }

    /* renamed from: a */
    public RecsRepository m51051a() {
        return (RecsRepository) C15521i.a(this.f41794a.m37597a((Config) this.f41795b.get(), C17281c.b(this.f41796c), C17281c.b(this.f41797d)), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C13138i m51050a(C8839d c8839d, Provider<Config> provider, Provider<C10991h> provider2, Provider<C10991h> provider3) {
        return new C13138i(c8839d, provider, provider2, provider3);
    }
}
