package com.tinder.app.dagger.module;

import android.arch.lifecycle.LifecycleObserver;
import com.tinder.main.p287c.C13390c;
import com.tinder.main.trigger.MainTriggerMediator;
import dagger.Lazy;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.s */
public final class C12530s implements Factory<LifecycleObserver> {
    /* renamed from: a */
    private final C8253o f40381a;
    /* renamed from: b */
    private final Provider<C13390c> f40382b;
    /* renamed from: c */
    private final Provider<MainTriggerMediator> f40383c;

    public /* synthetic */ Object get() {
        return m49311a();
    }

    public C12530s(C8253o c8253o, Provider<C13390c> provider, Provider<MainTriggerMediator> provider2) {
        this.f40381a = c8253o;
        this.f40382b = provider;
        this.f40383c = provider2;
    }

    /* renamed from: a */
    public LifecycleObserver m49311a() {
        return C12530s.m49309a(this.f40381a, this.f40382b, this.f40383c);
    }

    /* renamed from: a */
    public static LifecycleObserver m49309a(C8253o c8253o, Provider<C13390c> provider, Provider<MainTriggerMediator> provider2) {
        return C12530s.m49308a(c8253o, C17281c.b(provider), (MainTriggerMediator) provider2.get());
    }

    /* renamed from: b */
    public static C12530s m49310b(C8253o c8253o, Provider<C13390c> provider, Provider<MainTriggerMediator> provider2) {
        return new C12530s(c8253o, provider, provider2);
    }

    /* renamed from: a */
    public static LifecycleObserver m49308a(C8253o c8253o, Lazy<C13390c> lazy, MainTriggerMediator mainTriggerMediator) {
        return (LifecycleObserver) C15521i.a(c8253o.m35226b(lazy, mainTriggerMediator), "Cannot return null from a non-@Nullable @Provides method");
    }
}
