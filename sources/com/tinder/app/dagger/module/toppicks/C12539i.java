package com.tinder.app.dagger.module.toppicks;

import com.tinder.data.toppicks.C11018m;
import com.tinder.domain.toppicks.repo.TopPicksRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.toppicks.i */
public final class C12539i implements Factory<C11018m> {
    /* renamed from: a */
    private final C8254a f40398a;
    /* renamed from: b */
    private final Provider<TopPicksRepository> f40399b;

    public /* synthetic */ Object get() {
        return m49347a();
    }

    public C12539i(C8254a c8254a, Provider<TopPicksRepository> provider) {
        this.f40398a = c8254a;
        this.f40399b = provider;
    }

    /* renamed from: a */
    public C11018m m49347a() {
        return C12539i.m49345a(this.f40398a, this.f40399b);
    }

    /* renamed from: a */
    public static C11018m m49345a(C8254a c8254a, Provider<TopPicksRepository> provider) {
        return C12539i.m49344a(c8254a, (TopPicksRepository) provider.get());
    }

    /* renamed from: b */
    public static C12539i m49346b(C8254a c8254a, Provider<TopPicksRepository> provider) {
        return new C12539i(c8254a, provider);
    }

    /* renamed from: a */
    public static C11018m m49344a(C8254a c8254a, TopPicksRepository topPicksRepository) {
        return (C11018m) C15521i.a(c8254a.m35228a(topPicksRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
