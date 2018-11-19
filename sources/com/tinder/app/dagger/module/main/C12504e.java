package com.tinder.app.dagger.module.main;

import android.arch.lifecycle.LifecycleObserver;
import com.tinder.discovery.domain.C11143a;
import com.tinder.discovery.p231a.C11119a;
import com.tinder.discovery.p231a.C13142b;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.e */
public final class C12504e implements Factory<LifecycleObserver> {
    /* renamed from: a */
    private final C8251a f40315a;
    /* renamed from: b */
    private final Provider<C11143a> f40316b;
    /* renamed from: c */
    private final Provider<C13142b> f40317c;
    /* renamed from: d */
    private final Provider<C11119a> f40318d;

    public /* synthetic */ Object get() {
        return m49212a();
    }

    public C12504e(C8251a c8251a, Provider<C11143a> provider, Provider<C13142b> provider2, Provider<C11119a> provider3) {
        this.f40315a = c8251a;
        this.f40316b = provider;
        this.f40317c = provider2;
        this.f40318d = provider3;
    }

    /* renamed from: a */
    public LifecycleObserver m49212a() {
        return C12504e.m49210a(this.f40315a, this.f40316b, this.f40317c, this.f40318d);
    }

    /* renamed from: a */
    public static LifecycleObserver m49210a(C8251a c8251a, Provider<C11143a> provider, Provider<C13142b> provider2, Provider<C11119a> provider3) {
        return C12504e.m49209a(c8251a, (C11143a) provider.get(), (C13142b) provider2.get(), (C11119a) provider3.get());
    }

    /* renamed from: b */
    public static C12504e m49211b(C8251a c8251a, Provider<C11143a> provider, Provider<C13142b> provider2, Provider<C11119a> provider3) {
        return new C12504e(c8251a, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static LifecycleObserver m49209a(C8251a c8251a, C11143a c11143a, C13142b c13142b, C11119a c11119a) {
        return (LifecycleObserver) C15521i.a(c8251a.m35199a(c11143a, c13142b, c11119a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
