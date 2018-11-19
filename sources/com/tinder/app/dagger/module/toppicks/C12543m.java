package com.tinder.app.dagger.module.toppicks;

import com.tinder.data.toppicks.C11008g;
import com.tinder.data.toppicks.C11016j;
import com.tinder.data.toppicks.store.C8798a;
import com.tinder.data.toppicks.store.C8799c;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.domain.toppicks.repo.TopPicksRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.toppicks.m */
public final class C12543m implements Factory<TopPicksRepository> {
    /* renamed from: a */
    private final C8254a f40406a;
    /* renamed from: b */
    private final Provider<C8799c> f40407b;
    /* renamed from: c */
    private final Provider<C11016j> f40408c;
    /* renamed from: d */
    private final Provider<C11008g> f40409d;
    /* renamed from: e */
    private final Provider<C8798a> f40410e;
    /* renamed from: f */
    private final Provider<TopPicksApplicationRepository> f40411f;

    public /* synthetic */ Object get() {
        return m49363a();
    }

    public C12543m(C8254a c8254a, Provider<C8799c> provider, Provider<C11016j> provider2, Provider<C11008g> provider3, Provider<C8798a> provider4, Provider<TopPicksApplicationRepository> provider5) {
        this.f40406a = c8254a;
        this.f40407b = provider;
        this.f40408c = provider2;
        this.f40409d = provider3;
        this.f40410e = provider4;
        this.f40411f = provider5;
    }

    /* renamed from: a */
    public TopPicksRepository m49363a() {
        return C12543m.m49361a(this.f40406a, this.f40407b, this.f40408c, this.f40409d, this.f40410e, this.f40411f);
    }

    /* renamed from: a */
    public static TopPicksRepository m49361a(C8254a c8254a, Provider<C8799c> provider, Provider<C11016j> provider2, Provider<C11008g> provider3, Provider<C8798a> provider4, Provider<TopPicksApplicationRepository> provider5) {
        return C12543m.m49360a(c8254a, (C8799c) provider.get(), (C11016j) provider2.get(), (C11008g) provider3.get(), (C8798a) provider4.get(), (TopPicksApplicationRepository) provider5.get());
    }

    /* renamed from: b */
    public static C12543m m49362b(C8254a c8254a, Provider<C8799c> provider, Provider<C11016j> provider2, Provider<C11008g> provider3, Provider<C8798a> provider4, Provider<TopPicksApplicationRepository> provider5) {
        return new C12543m(c8254a, provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: a */
    public static TopPicksRepository m49360a(C8254a c8254a, C8799c c8799c, C11016j c11016j, C11008g c11008g, C8798a c8798a, TopPicksApplicationRepository topPicksApplicationRepository) {
        return (TopPicksRepository) C15521i.a(c8254a.m35230a(c8799c, c11016j, c11008g, c8798a, topPicksApplicationRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
