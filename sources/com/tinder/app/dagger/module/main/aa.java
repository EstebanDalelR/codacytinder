package com.tinder.app.dagger.module.main;

import com.tinder.activities.MainActivity;
import com.tinder.base.p172b.C8301a;
import com.tinder.main.router.MainPageRouter;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class aa implements Factory<MainPageRouter> {
    /* renamed from: a */
    private final Provider<MainActivity> f40296a;
    /* renamed from: b */
    private final Provider<C8301a> f40297b;

    public /* synthetic */ Object get() {
        return m49178a();
    }

    public aa(Provider<MainActivity> provider, Provider<C8301a> provider2) {
        this.f40296a = provider;
        this.f40297b = provider2;
    }

    /* renamed from: a */
    public MainPageRouter m49178a() {
        return m49176a(this.f40296a, this.f40297b);
    }

    /* renamed from: a */
    public static MainPageRouter m49176a(Provider<MainActivity> provider, Provider<C8301a> provider2) {
        return m49175a((MainActivity) provider.get(), (C8301a) provider2.get());
    }

    /* renamed from: b */
    public static aa m49177b(Provider<MainActivity> provider, Provider<C8301a> provider2) {
        return new aa(provider, provider2);
    }

    /* renamed from: a */
    public static MainPageRouter m49175a(MainActivity mainActivity, C8301a c8301a) {
        return (MainPageRouter) C15521i.a(MainViewModule.a(mainActivity, c8301a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
