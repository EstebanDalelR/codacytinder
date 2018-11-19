package com.tinder.app.dagger.module;

import com.tinder.main.trigger.MainTriggerMediator;
import com.tinder.main.trigger.Trigger;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.x */
public final class C12549x implements Factory<MainTriggerMediator> {
    /* renamed from: a */
    private final C8253o f40421a;
    /* renamed from: b */
    private final Provider<Set<Trigger>> f40422b;

    public /* synthetic */ Object get() {
        return m49386a();
    }

    public C12549x(C8253o c8253o, Provider<Set<Trigger>> provider) {
        this.f40421a = c8253o;
        this.f40422b = provider;
    }

    /* renamed from: a */
    public MainTriggerMediator m49386a() {
        return C12549x.m49384a(this.f40421a, this.f40422b);
    }

    /* renamed from: a */
    public static MainTriggerMediator m49384a(C8253o c8253o, Provider<Set<Trigger>> provider) {
        return C12549x.m49383a(c8253o, (Set) provider.get());
    }

    /* renamed from: b */
    public static C12549x m49385b(C8253o c8253o, Provider<Set<Trigger>> provider) {
        return new C12549x(c8253o, provider);
    }

    /* renamed from: a */
    public static MainTriggerMediator m49383a(C8253o c8253o, Set<Trigger> set) {
        return (MainTriggerMediator) C15521i.a(c8253o.m35224a((Set) set), "Cannot return null from a non-@Nullable @Provides method");
    }
}
