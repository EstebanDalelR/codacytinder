package com.tinder.app.dagger.module;

import android.arch.lifecycle.Lifecycle;
import com.tinder.activities.MainActivity;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.k */
public final class C12499k implements Factory<Lifecycle> {
    /* renamed from: a */
    private final Provider<MainActivity> f40293a;

    public /* synthetic */ Object get() {
        return m49167a();
    }

    public C12499k(Provider<MainActivity> provider) {
        this.f40293a = provider;
    }

    /* renamed from: a */
    public Lifecycle m49167a() {
        return C12499k.m49165a(this.f40293a);
    }

    /* renamed from: a */
    public static Lifecycle m49165a(Provider<MainActivity> provider) {
        return C12499k.m49164a((MainActivity) provider.get());
    }

    /* renamed from: b */
    public static C12499k m49166b(Provider<MainActivity> provider) {
        return new C12499k(provider);
    }

    /* renamed from: a */
    public static Lifecycle m49164a(MainActivity mainActivity) {
        return (Lifecycle) C15521i.a(C8250h.m35192a(mainActivity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
