package com.tinder.app.dagger.module.toppicks;

import com.tinder.data.toppicks.C11018m;
import com.tinder.domain.toppicks.TopPicksCountUpdater;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.toppicks.h */
public final class C12538h implements Factory<TopPicksCountUpdater> {
    /* renamed from: a */
    private final C8254a f40396a;
    /* renamed from: b */
    private final Provider<C11018m> f40397b;

    public /* synthetic */ Object get() {
        return m49343a();
    }

    public C12538h(C8254a c8254a, Provider<C11018m> provider) {
        this.f40396a = c8254a;
        this.f40397b = provider;
    }

    /* renamed from: a */
    public TopPicksCountUpdater m49343a() {
        return C12538h.m49341a(this.f40396a, this.f40397b);
    }

    /* renamed from: a */
    public static TopPicksCountUpdater m49341a(C8254a c8254a, Provider<C11018m> provider) {
        return C12538h.m49340a(c8254a, (C11018m) provider.get());
    }

    /* renamed from: b */
    public static C12538h m49342b(C8254a c8254a, Provider<C11018m> provider) {
        return new C12538h(c8254a, provider);
    }

    /* renamed from: a */
    public static TopPicksCountUpdater m49340a(C8254a c8254a, C11018m c11018m) {
        return (TopPicksCountUpdater) C15521i.a(c8254a.m35229a(c11018m), "Cannot return null from a non-@Nullable @Provides method");
    }
}
