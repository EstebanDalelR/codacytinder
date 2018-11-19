package com.tinder.app.dagger.module;

import android.arch.lifecycle.LifecycleObserver;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.home.navigation.C9703a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.j */
public final class C12498j implements Factory<LifecycleObserver> {
    /* renamed from: a */
    private final Provider<C9703a> f40291a;
    /* renamed from: b */
    private final Provider<CurrentScreenNotifier> f40292b;

    public /* synthetic */ Object get() {
        return m49163a();
    }

    /* renamed from: a */
    public LifecycleObserver m49163a() {
        return C12498j.m49162a(this.f40291a, this.f40292b);
    }

    /* renamed from: a */
    public static LifecycleObserver m49162a(Provider<C9703a> provider, Provider<CurrentScreenNotifier> provider2) {
        return C12498j.m49161a((C9703a) provider.get(), (CurrentScreenNotifier) provider2.get());
    }

    /* renamed from: a */
    public static LifecycleObserver m49161a(C9703a c9703a, CurrentScreenNotifier currentScreenNotifier) {
        return (LifecycleObserver) C15521i.a(C8250h.m35193a(c9703a, currentScreenNotifier), "Cannot return null from a non-@Nullable @Provides method");
    }
}
