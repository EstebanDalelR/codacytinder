package com.tinder.app.dagger.module.toppicks;

import com.tinder.data.toppicks.C11018m;
import com.tinder.domain.toppicks.TopPicksCountUpdatesObserver;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.toppicks.j */
public final class C12540j implements Factory<TopPicksCountUpdatesObserver> {
    /* renamed from: a */
    private final C8254a f40400a;
    /* renamed from: b */
    private final Provider<C11018m> f40401b;

    public /* synthetic */ Object get() {
        return m49351a();
    }

    public C12540j(C8254a c8254a, Provider<C11018m> provider) {
        this.f40400a = c8254a;
        this.f40401b = provider;
    }

    /* renamed from: a */
    public TopPicksCountUpdatesObserver m49351a() {
        return C12540j.m49349a(this.f40400a, this.f40401b);
    }

    /* renamed from: a */
    public static TopPicksCountUpdatesObserver m49349a(C8254a c8254a, Provider<C11018m> provider) {
        return C12540j.m49348a(c8254a, (C11018m) provider.get());
    }

    /* renamed from: b */
    public static C12540j m49350b(C8254a c8254a, Provider<C11018m> provider) {
        return new C12540j(c8254a, provider);
    }

    /* renamed from: a */
    public static TopPicksCountUpdatesObserver m49348a(C8254a c8254a, C11018m c11018m) {
        return (TopPicksCountUpdatesObserver) C15521i.a(c8254a.m35235b(c11018m), "Cannot return null from a non-@Nullable @Provides method");
    }
}
