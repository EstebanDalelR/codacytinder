package com.tinder.data.recs;

import com.tinder.domain.recs.model.Rec$Source;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.recs.j */
public final class C13104j implements Factory<C10992i> {
    /* renamed from: a */
    private final Provider<Rec$Source> f41727a;
    /* renamed from: b */
    private final Provider<C8788l> f41728b;

    public /* synthetic */ Object get() {
        return m50962a();
    }

    public C13104j(Provider<Rec$Source> provider, Provider<C8788l> provider2) {
        this.f41727a = provider;
        this.f41728b = provider2;
    }

    /* renamed from: a */
    public C10992i m50962a() {
        return new C10992i((Rec$Source) this.f41727a.get(), (C8788l) this.f41728b.get());
    }

    /* renamed from: a */
    public static C13104j m50961a(Provider<Rec$Source> provider, Provider<C8788l> provider2) {
        return new C13104j(provider, provider2);
    }
}
