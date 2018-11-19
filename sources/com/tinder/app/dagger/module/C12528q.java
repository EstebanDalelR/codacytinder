package com.tinder.app.dagger.module;

import android.arch.lifecycle.LifecycleObserver;
import com.tinder.main.p287c.C13390c;
import com.tinder.main.trigger.MainTriggerMediator;
import dagger.Lazy;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.q */
public final class C12528q implements Factory<LifecycleObserver> {
    /* renamed from: a */
    private final C8253o f40374a;
    /* renamed from: b */
    private final Provider<C13390c> f40375b;
    /* renamed from: c */
    private final Provider<MainTriggerMediator> f40376c;

    public /* synthetic */ Object get() {
        return m49303a();
    }

    public C12528q(C8253o c8253o, Provider<C13390c> provider, Provider<MainTriggerMediator> provider2) {
        this.f40374a = c8253o;
        this.f40375b = provider;
        this.f40376c = provider2;
    }

    /* renamed from: a */
    public LifecycleObserver m49303a() {
        return C12528q.m49301a(this.f40374a, this.f40375b, this.f40376c);
    }

    /* renamed from: a */
    public static LifecycleObserver m49301a(C8253o c8253o, Provider<C13390c> provider, Provider<MainTriggerMediator> provider2) {
        return C12528q.m49300a(c8253o, C17281c.b(provider), (MainTriggerMediator) provider2.get());
    }

    /* renamed from: b */
    public static C12528q m49302b(C8253o c8253o, Provider<C13390c> provider, Provider<MainTriggerMediator> provider2) {
        return new C12528q(c8253o, provider, provider2);
    }

    /* renamed from: a */
    public static LifecycleObserver m49300a(C8253o c8253o, Lazy<C13390c> lazy, MainTriggerMediator mainTriggerMediator) {
        return (LifecycleObserver) C15521i.a(c8253o.m35217a((Lazy) lazy, mainTriggerMediator), "Cannot return null from a non-@Nullable @Provides method");
    }
}
